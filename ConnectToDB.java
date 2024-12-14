package finalproject;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.postgresql.ds.PGSimpleDataSource;
public class ConnectToDB {

    Connection con;

    public ConnectToDB() {
//        schemaConnect("public");
        connect();
    }

    public final Connection connect() {
        PGSimpleDataSource source = new PGSimpleDataSource();
        source.setServerName("localhost");
        source.setDatabaseName("postgres");
        source.setUser("postgres");
        source.setPassword("");
        source.setCurrentSchema("public");
        try {
            con = source.getConnection();
            System.out.println("Connected to database");
        } catch (SQLException ex) {
            Create dbC = new Create();
            con = dbC.getCon();
        }
        return con;
    }

    public ArrayList<String> getRoomNums(String course_id) {
        String sql = "select room_number from classroom where building = ?;";
        ArrayList<String> rooms = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, getBuildigName(getdeptName(course_id)));

            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                rooms.add(rs.getString(1));
                System.out.println(rs.getString(1));
            }
            return rooms;
        } catch (SQLException ex) {

            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getLecID() {
        String sql = "select distinct lec_id from lectures ;";
        ArrayList<String> lecs = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lecs.add(rs.getString(1));

            }
            return lecs;
        } catch (SQLException ex) {

            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getSecID() {
        String sql = "select distinct sec_id from section ;";
        ArrayList<String> lecs = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lecs.add(rs.getString(1));

            }
            return lecs;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public String getBuildigName(String dept_name) {
        String sql = "select building from department where dept_name= ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, dept_name);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public String getdeptName(String id) {
        String sql = "select dept_name from course where course_id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public String getInstructorID(String id) {
        String sql = "select id from instructor where id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

        }
        return null;
    }

    public String getInstructorName(String id) {
        String sql = "select name from instructor where id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

        }
        return null;
    }

    public String getTAID(String id) {
        String sql = "select id from teacher_assistance where id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

        }
        return null;
    }

    public String getTAppassword(String id) {
        String sql = "select password from teacher_assistance where id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

        }
        return null;
    }

    public String getInstructorPassword(String id) {
        String sql = "select password from instructor where id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

        }
        return null;
    }

    public ArrayList<String> getInstructorCourse(String id, int year, String semester) {
        ArrayList<String> courses = new ArrayList<>();
        String sql = "select title from course where ID_ins = ? and year = ? and semester = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setInt(2, year);
            st.setString(3, semester);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                courses.add(rs.getString(1) + "");

            }
            return courses;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String getInstructorCourse_id(String id, String title) {
        String sql = "select distinct course_id from course where ID_ins= ? and title = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setString(2, title);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

            return null;
        }
    }

    public ArrayList<String> getInsCourseIDs(String id_ins) {
        String sql = "select course_id from course where id_ins = ?;";
        ArrayList<String> ids = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id_ins);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ids.add(rs.getString(1));
            }
            return ids;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getInstructorCourse_id2(String id, int year, String semester) {
        ArrayList<String> courses_id = new ArrayList<>();
        String sql = "select course_id from course where ID_ins = ? and year = ? and semester = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setInt(2, year);
            st.setString(3, semester);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                courses_id.add(rs.getString(1) + "");

            }
            return courses_id;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<String> gettaCourse_id(String id, int year, String semester) {
        ArrayList<String> courses_id = new ArrayList<>();
        String sql = "select course_id from course where ID_ta = ? and year = ? and semester = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setInt(2, year);
            st.setString(3, semester);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                courses_id.add(rs.getString(1) + "");

            }
            return courses_id;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<String> gettaCourse_id2(String id) {
        ArrayList<String> courses_id = new ArrayList<>();
        String sql = "select course_id from course where ID_ta = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                courses_id.add(rs.getString(1) + "");

            }
            return courses_id;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String numOfSec(String course_id, int year, String semester) {
        String sql = "select count(*) from section where course_id = ? and semester = ? and year = ?  ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, semester);
            st.setInt(3, year);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

            return null;
        }
    }

    public int numOfStdL(String course_id, String sec_id, String lec_id) {
        String sql = "select count(*) from attendence a where a.course_id = ? and a.sec_id = ? and a.lec_id = ? and a.status = 'P' ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, sec_id);
            st.setString(3, lec_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        }
    }

    public double persent(String course_id, String sec_id, String lec_id, String semester, int year) {
        String sql = "(select count (*)*100.0 /(select count(*) from takes t where t.sec_id = ?  and t.course_id = ? and t.semester = ? and t.year = ? )from attendence a where a.course_id = ? and a.sec_id  = ? and a.lec_id = ? and a.status = 'P');";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, sec_id);
            st.setString(2, course_id);
            st.setString(3, semester);
            st.setInt(4, year);
            st.setString(5, course_id);
            st.setString(6, sec_id);
            st.setString(7, lec_id);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {

                return rs.getInt(1);

            }
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        }
    }

    public void attendenceT(String course_id, String sec_id, String lec_id, javax.swing.JTable table) {
        String sql = " select first_name ,last_name , id , status from attendence natural join takes natural join student "
                + "where course_id = ? and sec_id  = ? and lec_id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, sec_id);
            st.setString(3, lec_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String fname = rs.getString("first_name");
                String lname = rs.getString("last_name");
                String id = rs.getString("id");
                String status = rs.getString("status");

                String data[] = {fname, lname, id, status};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void lectitle(String course_id, String title, String semester, int year, javax.swing.JTable table) {
        String sql = " select sec_id , lec_id , cheeck,date,(select count(id) from attendence a where a.course_id=l.course_id  and a.year =l.year and a.semester=l.semester  and a.lec_id=l.lec_id and a.sec_id =l.sec_id and a.status ='P' ) as num  from lectures l where l.course_id = ? and l.title = ? and year = ? and semester = ?;";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, title);
            st.setInt(3, year);
            st.setString(4, semester);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String sec_id = rs.getString("sec_id");
                String lec_id = rs.getString("lec_id");
                String cheeck = rs.getString("cheeck");
                String date = rs.getString("date");
                String num = rs.getString("num");

                String data[] = {sec_id, lec_id, cheeck, date, num};
                DefaultTableModel table1 = (DefaultTableModel) table.getModel();
                table1.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<String> lecturestitle(String course_id, String semester, int year) {
        ArrayList<String> lecs = new ArrayList<>();
        String sql = " select title from lectures where course_id = ? and semester = ? and year  = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, semester);
            st.setInt(3, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lecs.add(rs.getString(1));

            }
            return lecs;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public String numOfStd(String course_id, int year, String semester) {
        String sql = "select count(*) from takes natural join section where course_id = ?  and semester = ? and year = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, semester);
            st.setInt(3, year);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);

            }
            return null;
        } catch (SQLException ex) {

            return null;
        }
    }

    public String ta_name(String course_id, int year, String semester) {
        String sql = "select name from course , Teacher_Assistance where course.id_ta = Teacher_assistance.id and course_id = ? and semester = ? and year = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, semester);
            st.setInt(3, year);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {

            return null;
        }
    }

    public ArrayList<String> getInstructorYears(String id) {
        ArrayList<String> years = new ArrayList<>();
        String sql = "select distinct year from course where ID_ins = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                years.add(rs.getInt(1) + "");

            }
            return years;
        } catch (SQLException ex) {

            return null;
        }
    }

    public ArrayList<String> getInstructorSems(String id, int year) {
        ArrayList<String> sems = new ArrayList<>();
        String sql = "select distinct semester from teaches where id = ? and year = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                sems.add(rs.getString(1) + "");
            }
            return sems;
        } catch (SQLException ex) {

            return null;
        }
    }

    public ArrayList<String> getCourseIDs() {
        String sql = "select course_id from course;";
        ArrayList<String> ids = new ArrayList<>();
        try (Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                ids.add(rs.getString(1));
            }
            return ids;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    private void exit() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.exit(0);
    }

    public String getcourseName(String id) {
        String sql = "select title from course where course_id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getDepartments() {
        String sql = "select dept_name from instructor ;";
        ArrayList<String> ids = new ArrayList<>();
        try (Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                ids.add(rs.getString(1));
            }
            return ids;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<String> getinstrInDep(String dept_name) {
        String sql = "select id from instructor where dept_name = ? ;";
        ArrayList<String> instructors = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, dept_name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                instructors.add(rs.getString(1));
            }
            return instructors;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getTAInDep(String dept_name) {
        String sql = "select id from TA where dept_name = ? ;";
        ArrayList<String> instructors = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, dept_name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                instructors.add(rs.getString(1));
            }
            return instructors;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getinstr() {
        String sql = "select id from instructor;";
        ArrayList<String> instructors = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                instructors.add(rs.getString(1));
            }
            return instructors;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getTA() {
        String sql = "select id from TA;";
        ArrayList<String> instructors = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                instructors.add(rs.getString(1));
            }
            return instructors;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getinstrIncourse(String course) {
        String sql = "select dept_name from course where course_id = ? ;";
        ArrayList<String> instructors = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                instructors = getinstrInDep(rs.getString(1));
            }
            return instructors;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }

    }

    public ArrayList<String> getTAIncourse(String course) {
        String sql = "select dept_name from course where course_id = ? ;";
        ArrayList<String> TAs = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TAs = getTAInDep(rs.getString(1));
            }
            return TAs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    private void closeEverything() {
        try {
            con.close();
        } catch (SQLException ex) {

        }
    }

    public static void main(String[] args) {
        ConnectToDB test = new ConnectToDB();

    }

}
