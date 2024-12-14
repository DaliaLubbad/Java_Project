package finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Views {

    public Views() {
        ConnectToDB c = new ConnectToDB();
        con = c.connect();
    }

    private Connection con;

    public void getMoreThan25(String course_id, javax.swing.JTable table, int year, String semester) {
        String sql = "select A.id,A.sec_id from attendence A where A.course_id = ? and A.year= ? and A.semester=?  and (select count(*) from attendence  B where B.course_id = A.course_id and B.year = A.year and A.semester=B.semester and B.id= A.id and status ='A')>0;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setInt(2, year);
            st.setString(3, semester);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String sec_id = rs.getString("sec_id");

                String data[] = {id, sec_id};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<String> getCourseID() {
        String sql = "select distinct course_id from course ;";
        ArrayList<String> id = new ArrayList<>();
        try (Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                id.add(rs.getString(1));
            }
            return id;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public String editAttendance(String id, String lec_id, String sec_id, String course_id, String status) {
        String sql = "update attendence set status = ? where id = ? and lec_id = ? and sec_id =? and course_id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, status);
            st.setString(2, id);
            st.setString(3, lec_id);
            st.setString(4, sec_id);
            st.setString(5, course_id);

            System.out.println("eeeeeeee");
            if (st.executeUpdate() > 0) {
                return "Updated succefuly.";
            } else {
                System.out.println("tttttttttttt");
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }
    }

    public void fillStudentAtten(String course_id, String sec_id, String id, String s, int y, javax.swing.JTable table) {
        String sql = "select lec_id ,status,date from attendence natural join lectures where course_id = ? and sec_id = ? and id = ? and semester = ? and year =?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, sec_id);
            st.setString(3, id);
            st.setString(4, s);
            st.setInt(5, y);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String l_id = rs.getString("lec_id");
                String date = rs.getString("date");
                String status = rs.getString("status");
                String data[] = {l_id, date, status};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void q3(int year, String sem, javax.swing.JTable table) {
        String sql = " select a.id,a.lec_id ,a.course_id ,a.sec_id from attendence a "
                + "where (select count(*)*0.1*10 from takes t where t.id = a.id and year = ? and semester =? )<= (select count(*) from attendence a2  where a.id = a2.id and a2.year = ? and a2.semester = ? and a2.status='P') and a.status ='A';";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, year);
            st.setString(2, sem);
            st.setInt(3, year);
            st.setString(4, sem);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String stdId = rs.getString("id");
                String lecId = rs.getString("lec_id");
                String cId = rs.getString("course_id");
                String sec = rs.getString("sec_id");

                String data[] = {stdId, lecId, cId, sec};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void q4(javax.swing.JTable table) {
        String sql = " select  s.id, s.first_name,s.last_name ,count(a.id) as comm from student s natural join  attendence a GROUP BY s.id, s.first_name,a.status,a.id,s.last_name having a.id = s.id and a.status ='P' order by count(a.id) desc ;  ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String stdId = rs.getString("id");
                String fn = rs.getString("first_name");
                String ln = rs.getString("last_name");
                String count = rs.getString("comm");

                String data[] = {stdId, fn, ln, count};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void q5(int year, String sem, javax.swing.JTable table) {
        String sql = "select distinct lec_id,sec_id ,course_id  from attendence a where ((select count (id) from attendence a2 where a2.course_id =a.course_id and a2.lec_id =a.lec_id and a2.sec_id =a.sec_id and a2.semester =a.semester and a2.year =a.year and a2.status ='A') >(select count (ID) from attendence a3 where a3.course_id =a.course_id and a3.lec_id =a.lec_id and a3.sec_id =a.sec_id and a3.semester =a.semester and a3.year =a.year and a3.status ='P')) and a.year =? and a.semester =?;";
      
        
        
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, year);
            st.setString(2, sem);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String lId = rs.getString("lec_id");
                String sId = rs.getString("sec_id");
                String cId = rs.getString("course_id");

                String data[] = {lId, sId, cId};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void q6(int year, String sem, javax.swing.JTable table) {
        String sql = " select distinct a.id ,a.course_id ,a.sec_id from attendence a where a.status = 'A' and a.semester = ? and a.year = ?  and id in(select distinct a2.id  from attendence a2  where a2.course_id =a.course_id and a2.sec_id = a.sec_id and a2.year = a.year and a2.semester = a.semester and a2.lec_id = concat(substring(a.lec_id,1,4),CAST(substring(a.lec_id,5,1) AS int)+1) and a2.status = 'A' and a2.id in(select distinct a3.id  from attendence a3  where a3.course_id =a.course_id and a3.sec_id = a.sec_id and a3.year = a.year and a3.semester= a.semester and a3.lec_id = concat(substring(a.lec_id,1,4),CAST(substring(a.lec_id,5,1) AS int)+2) and a2.status = 'A'));";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, sem);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String stdId = rs.getString("id");
                String cId = rs.getString("course_id");
                String sec = rs.getString("sec_id");
                String data[] = {stdId, cId, sec};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void quiry2(javax.swing.JTable table) {
        String sql = "select a.lec_id ,a.sec_id,a.course_id ,a.semester,a.year from lectures a order by(select count(id) "
                + "from attendence a2 where a.lec_id= a2.lec_id and a.course_id =a2.course_id and a.sec_id = a2.sec_id "
                + "and a.semester=a2.semester and a.year=a2.year and a2.status ='P') desc limit 10;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String courseId = rs.getString("course_id");
                String secId = rs.getString("sec_id");
                String lecId = rs.getString("lec_id");
                String sem = rs.getString("semester");
                String y = rs.getString("year");

                String data[] = {courseId, secId, lecId, sem, y};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<String> getsemester(int year) {
        String sql = "select distinct semester from lectures where year = ? ;";
        ArrayList<String> semester = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                semester.add(rs.getString(1));
            }
            return semester;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getYear() {
        String sql = "select distinct  year from  lectures ;";
        ArrayList<String> id = new ArrayList<>();
        try (Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                id.add(rs.getString(1));
            }
            return id;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public void LectureView(String course_id, javax.swing.JTable table) {

        String sql = " select  lec_id ,course_id, sec_id , semester, title,cheeck,date  from lectures where course_id= ? ;";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String lec_id = rs.getString("lec_id");
                course_id = rs.getString("course_id");
                String sec_id = rs.getString("sec_id");
                String semester = rs.getString("semester");
                String title = rs.getString("title");
                String cheeck = rs.getString("cheeck");
                String date = rs.getString("date");

                String data[] = {lec_id, course_id, sec_id, semester, title, cheeck, date};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<String> getCourses() {
        String sql = "select distinct course_id from course";
        ArrayList<String> id = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                id.add(rs.getString(1));
            }
            return id;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
}
