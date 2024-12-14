package finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBais {

    private Connection con;

    public DataBais() {
        ConnectToDB c = new ConnectToDB();
        con = c.connect();
    }

    public ArrayList<String> getCourseID(String TA_ID) {
        String sql = "select distinct course_id from course where id_ta = ?;";
        ArrayList<String> id = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, TA_ID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                id.add(rs.getString(1) + "");
            }
            return id;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getStudentNotInAtten(String course_id, String sec_id, String lec_id, int year, String semester) {
        ArrayList<String> std_id = new ArrayList<>();
        String sql = "select t.id from takes t where t.course_id = ? and t.sec_id = ? and t.year = ? and t.semester = ? and t.id not in (select a.id from attendence a where  a.course_id = t.course_id  and a.sec_id = t.sec_id and a.lec_id = ? and a.year = t.year and a.semester = t.semester ) ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, sec_id);
            st.setInt(3, year);
            st.setString(4, semester);
            st.setString(5, lec_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                std_id.add(rs.getString(1) + "");
            }
            return std_id;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<String> getStudentInCourse(String courseID, String secID, String semester, int year) {
        String sql = "select  distinct id from takes where course_id =? and sec_id = ? and semester = ? and year = ?;";
        ArrayList<String> studentsIds = new ArrayList<>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, courseID);
            st.setString(2, secID);
            st.setString(3, semester);
            st.setInt(4, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                studentsIds.add(rs.getString(1));
            }
            return studentsIds;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getStudentID() {
        String sql = "select id from student ;";
        ArrayList<String> lectureName = new ArrayList<>();
        try (Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lectureName.add(rs.getString(1));
            }
            return lectureName;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getStudentName(String course_id, String sec_id, String semester, int year) {
        String sql = "select CONCAT(s.first_name,' ', s.secound_name ,' ', s.third_name ,' ', s.last_name ) as Name from student s  natural join takes t  where t.course_id =? and t.sec_id =? and t.semester =? and t.year = ?;";
        ArrayList<String> students_Names = new ArrayList<>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, course_id);
            st.setString(2, sec_id);
            st.setString(3, semester);
            st.setInt(4, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                students_Names.add(rs.getString(1));
            }
            return students_Names;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getphon(String courseId, String sec_id, String semester, int year) {
        String sql = "select pn.phone_number from phone_number pn natural join takes t where t.course_id = ?  and t.sec_id = ? and t.semester = ? and year = ? ;";
        ArrayList<String> ph = new ArrayList<>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, courseId);
            st.setString(2, sec_id);
            st.setString(3, semester);
            st.setInt(4, year);
            ResultSet rs=st.executeQuery();

            while (rs.next()) {
                ph.add(rs.getString(1));
            }

            return ph;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getsemester(String course_id, int year) {
        String sql = "select semester from course where course_id = ? and year = ? ;";
        ArrayList<String> semester = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setInt(2, year);
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

    public ArrayList<String> getsemesterT(String course_id) {
        String sql = "select distinct semester from course where id_ta = ? ;";
        ArrayList<String> semester = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
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

    public ArrayList<String> getTeacherCourse(String id, int year, String semester) {
        ArrayList<String> courses = new ArrayList<>();
        String sql = "select  distinct course_id from course where (id_ta , year ,semester )= (?,?,?) ;";
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

    public ArrayList<String> getTeacherYears(String id) {
        ArrayList<String> years = new ArrayList<>();
        String sql = "select distinct year from course where id_ta= ? ;";
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

    public ArrayList<String> getDepartment() {
        String sql = "select distinct  dept_name from department ;";
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

    public ArrayList<String> getyear(String course_id) {
        String sql = "select year from course where course_id = ? ;";
        ArrayList<String> years = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                years.add(rs.getString(1));
            }
            return years;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getlecid(String courseId, String sec_id, String semester, int year) {
        String sql = "select distinct lec_id from lectures where (course_id,sec_id,semester,year) =(?,?,?,?) ;";
        ArrayList<String> id = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, courseId);
            st.setString(2, sec_id);
            st.setString(3, semester);
            st.setInt(4, year);

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

    public ArrayList<String> getStudentInLec(String lec_id, String courseId, String sec_id, String semester, int year) {
        String sql = "select distinct id from attendence where (lec_id,course_id,sec_id,semester,year) =(?,?,?,?,?) ;";
        ArrayList<String> id = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, lec_id);
            st.setString(2, courseId);
            st.setString(3, sec_id);
            st.setString(4, semester);
            st.setInt(5, year);

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

    public String FullName(String id) {
        String sql = "select  CONCAT(first_name  ,' ', secound_name ,' ', third_name ,' ', last_name ) as Name from student where student.id = ? ; ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString(1));
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public String getStdentAddress(String id) {
        String sql = "select CONCAT(city  ,' ', address)  from student where student.id=? ;";
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

    public String getStudentPhone(String id) {
        String sql = "select phone_number from phone_number where  student.id=? ;";
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

    public String getStudentIDFromPhone(String phon) {
        String sql = "select id  from phone_number where phone_number= ? ; ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, phon);
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

    public String getNameFromPhone(String phon) {
        String sql = "select CONCAT(first_name  ,' ', secound_name ,' ', third_name ,' ', last_name ) as name  from student natural join phone_number where phone_number= ? ; ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, phon);
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

    public String getAddressfromPhone(String phon) {
        String sql = "select  CONCAT(city  ,' ', address)  from student natural join phone_number where phone_number= ? ; ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, phon);
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

    public String getIDFromName(String Name) {
        String sql = "select id from student where  CONCAT(first_name  ,' ', secound_name ,' ', third_name ,' ', last_name ) = ? ; ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, Name);
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

    public String getPhoneFromName(String phon) {
        String sql = "select  phone_number  from student natural join phone_number  where CONCAT(first_name  ,' ', secound_name ,' ', third_name ,' ', last_name )  = ? ; ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, phon);
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

    public String getAddressFromName(String Name) {
        String sql = "select  CONCAT(city  ,' ', address) from student where  CONCAT(first_name  ,' ', secound_name ,' ', third_name ,' ', last_name ) = ? ; ";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, Name);
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

    public String getChickFromLec(String lec_id, String course_id, String sec_id, String semester, int year) {
        String sql = "select cheeck from lectures where (lec_id,course_id,sec_id,semester,year)=(?,?,?,?,?)";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, lec_id);
            st.setString(2, course_id);
            st.setString(3, sec_id);
            st.setString(4, semester);
            st.setInt(5, year);
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

    public String getTitleForLec(String lec_id, String course_id, String sec_id, String semester, int year) {
        String sql = "select title from lectures where (lec_id,course_id,sec_id,semester,year)=(?,?,?,?,?)";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, lec_id);
            st.setString(2, course_id);
            st.setString(3, sec_id);
            st.setString(4, semester);
            st.setInt(5, year);
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

    public String getDateForLec(String lec_id, String course_id, String sec_id, String semester, int year) {
        String sql = "select date from lectures where (lec_id,course_id,sec_id,semester,year)=(?,?,?,?,?)";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, lec_id);
            st.setString(2, course_id);
            st.setString(3, sec_id);
            st.setString(4, semester);
            st.setInt(5, year);
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

    public int generateStudentID() {
        String sql = "select count(id) from student;";
        int max = 0;
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                max = rs.getInt(1);
                if (max > 0) {
                    return max;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            return 0;
        }
    }

    public String insertStudent(String firstName, String ScoundName, String ThirdName, String LastName, String dept_name, String city, String address) {
        String sql = "insert into student (id,first_name,secound_name,third_name,last_name,dept_name,city,address) values (?,?,?,?,?,?,?,?);";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            String id = firstName.substring(2) + (generateStudentID() + 1);
            st.setString(1, id);
            st.setString(2, firstName);
            st.setString(3, ScoundName);
            st.setString(4, ThirdName);
            st.setString(5, LastName);
            st.setString(6, dept_name);
            st.setString(7, city);
            st.setString(8, address);
            if (st.executeUpdate() > 0) {
                return id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public void insertAttendance(String id, String lec_id, String course_id, String sec_id, String semester, int year, String status) {
        String sql = "insert into attendence (id,lec_id,course_id ,  sec_id  ,  semester ,  year, status ) values (?,?,?,?,?,?,?);";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setString(2, lec_id);
            st.setString(3, course_id);
            st.setString(4, sec_id);
            st.setString(5, semester);
            st.setInt(6, year);
            st.setString(7, status);
            if (st.executeUpdate() > 0) {
                System.out.println("\tstudent added successfully\n\tattendencet ");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int generateLectureID(String c, String sec_id, String s, int y) {
        String sql = "select count(*) from lectures where course_id=? and semester=? and year=? and sec_id = ?;";
        int max;
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, c);
            st.setString(2, s);
            st.setInt(3, y);
            st.setString(4, sec_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                max = rs.getInt(1);
                if (max > 0) {
                    return max;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        }
    }

    public boolean isLecExist(String course_id, String sec_id, String semester, int year, String title, String cheeck, String date) {
        String sql = "select count(*) from lectures where course_id=? and sec_id=? and  semester=? and year=? and  title=? and  cheeck=? and date = ?"
                + "group by course_id ,  sec_id , semester ,  year ,  title, cheeck, date;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setString(2, sec_id);
            st.setString(3, semester);
            st.setInt(4, year);
            st.setString(5, title);
            st.setString(6, cheeck);
            st.setString(7, date);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }

    public String insertLecture(String course_id, String sec_id, String semester, int year, String title, String cheeck, String date) {
        String sql = "insert into lectures ( lec_id , course_id ,  sec_id , semester ,  year ,  title, cheeck, date) values (?,?,?,?,?,?,?,?);";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            String id = "lec_" + (generateLectureID(course_id, sec_id, semester, year) + 1);
            st.setString(1, id);
            st.setString(2, course_id);
            st.setString(3, sec_id);
            st.setString(4, semester);
            st.setInt(5, year);
            st.setString(6, title);
            st.setString(7, cheeck);
            st.setString(8, date);
            if (st.executeUpdate() > 0) {
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("ooooooo");

        }
        return "";
    }

    public String UpdateLecture(String title, String cheeck, String date, String lec_id, String course_id, String sec_id, String semester, int year) {

        String sql = "update lectures set (title,cheeck,date )=(?,?,?) where ( lec_id , course_id ,  sec_id , semester ,  year ) =(?,?,?,?,?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, title);
            st.setString(2, cheeck);
            st.setString(3, date);
            st.setString(4, lec_id);
            st.setString(5, course_id);
            st.setString(6, sec_id);
            st.setString(7, semester);
            st.setInt(8, year);
            if (st.executeUpdate() > 0) {
                return lec_id + " is Updated succefuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }
    }

    public String UpdateAttendance(String status, String id, String lec_id, String course_id, String sec_id, String semester, int year) {
        String sql = "update attendence set status =? where ( id,lec_id , course_id ,  sec_id , semester ,  year ) =(?,?,?,?,?,?);";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, status);
            st.setString(2, id);
            st.setString(3, lec_id);
            st.setString(4, course_id);
            st.setString(5, sec_id);
            st.setString(6, semester);
            st.setInt(7, year);
            if (st.executeUpdate() > 0) {
                return "Updeted Succesfully.";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "";
    }

    public String DeletStudent(String id) {
        String sql = "delete from student where id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            if (st.executeUpdate() > 0) {
                return id + " deleted sucessfuly..";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "";
    }

    public String DeletLecture(String lec_id, String course_id, String sec_id, String semester, int year) {
        String sql = "delete from lectures where (lec_id, course_id,sec_id,semester,year )= (?,?,?,?,?);";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, lec_id);
            st.setString(2, course_id);
            st.setString(3, sec_id);
            st.setString(4, semester);
            st.setInt(5, year);
            if (st.executeUpdate() > 0) {
                return lec_id + " deleted sucessfuly..";
            }
        } catch (SQLException ex) {

            System.out.println(ex);
        }
        return "";
    }

    public String getTeacherID(String id) {
        String sql = "select id from teacher_assistance where id = ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public String getCourseTitleFromid(String course_id) {
        String sql = "select title from course where  course_id= ? ;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String numOfSectionsInCourse(String course_id, String semester, int year) {
        String sql = "select count(*) from section where course_id=? and semester=? and year=?; ";
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

    public String numOfStudentsInCourse(String course_id, String semester, int year) {
        String sql = "select count(*) from takes  where course_id=? and semester=? and year=?;";
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

    public String getTeacherName(String id) {
        String sql = "select name from teacher_assistance where id = ? ;";
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
}
