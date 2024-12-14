package finalproject;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {

    private Connection con;

    public DataBase() {
        ConnectToDB c = new ConnectToDB();
        con = c.connect();
    }

    public ArrayList<String> getCourseIDs() {
        String sql = "select distinct course_id from course;";
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

    public String getcourseName(String id, String s, int y) {
        String sql = "select title from course where course_id = ? and semester = ? and year = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setString(2, s);
            st.setInt(3, y);
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

    public String getcourseBook(String id, String s, int y) {
        String sql = "select book from course where course_id = ? and semester = ? and year = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setString(2, s);
            st.setInt(3, y);
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
        String sql = "select distinct dept_name from instructor ;";
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
        String sql = "select distinct id from instructor where dept_name = ? ;";
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
        String sql = "select distinct id from teacher_assistance where dept_name = ? ;";
        ArrayList<String> TAs = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, dept_name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                TAs.add(rs.getString(1));
            }
            return TAs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getinstr() {
        String sql = "select distinct id from instructor;";
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
        String sql = "select distinct id from teacher_assistance;";
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
        String sql = "select distinct dept_name from course where course_id = ? ;";
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

    public String getTAIncourse2(String course, String s, int y) {
        String sql = "select distinct id_ta from course where course_id = ? and year = ? and  semester = ?;";
        String TA = "";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course);
            st.setInt(2, y);
            st.setString(3, s);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TA = rs.getString(1);
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return TA;
    }

    public String getinstIncourse2(String course, String s, int y) {
        String sql = "select distinct id_ins from course where course_id = ? and year = ? and  semester = ?;";
        String TA = "";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course);
            st.setInt(2, y);
            st.setString(3, s);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TA = rs.getString(1);
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return TA;
    }

    public ArrayList<String> getRoomNums(String course_id) {
        String sql = "select distinct room_number from classroom where building = ?;";
        ArrayList<String> rooms = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, getBuildigName(getdeptName(course_id)));
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                rooms.add(rs.getString(1));
            }
            return rooms;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<String> getSectionIncourse(String course, String s, int y) {
        String sql = "select distinct sec_id from section where course_id = ? and semester = ? and year = ?;";
        ArrayList<String> sections = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course);
            st.setString(2, s);
            st.setInt(3, y);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                sections.add(rs.getString(1));
            }
            return sections;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getSection() {
        String sql = "select distinct sec_id from section ;";
        ArrayList<String> sections = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                sections.add(rs.getString(1));
            }
            return sections;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public ArrayList<String> getyear(String course_id) {
        String sql = "select distinct year from course where course_id = ? ;";
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

    public ArrayList<String> getsemester(String course_id, int y) {
        String sql = "select distinct semester from course where course_id = ? and year =? ;";
        ArrayList<String> semester = new ArrayList<>();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, course_id);
            st.setInt(2, y);
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

    public int generateSecID(String c, String s, int y) {
        String sql = "select count(sec_id) from section where course_id=? and semester=? and year=? ;";
        int max;
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, c);
            st.setString(2, s);
            st.setInt(3, y);
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

    public boolean isClassCross(String b, String r, String s, int y) {
        String sql = "select count(sec_id) from section where building=? and room_number =? and semester=? and year=? group by building, room_number,semester,year;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, b);
            st.setString(2, r);
            st.setString(3, s);
            st.setInt(4, y);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;

        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean isCourseExist(String d, String t, String b, String s, int y) {
        String sql = "select count(course_id) from course where dept_name=? and titel=? and book=? and semester=? and year=? group by dept_name, title,book,semester,year;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, d);
            st.setString(2, t);
            st.setString(3, b);
            st.setString(4, s);
            st.setInt(5, y);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }

    public String insertSection(String c, String b, String r, String s, int y) {
        String sql = "insert into section (course_id,sec_id,building,room_number,semester,year) values (?,?,?,?,?,?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            String id = getdeptName(c).charAt(0) + (generateSecID(c, s, y) + 1) + "";
            st.setString(1, c);
            st.setString(2, id);
            st.setString(3, b);
            st.setString(4, r);
            st.setString(5, s);
            st.setInt(6, y);
            if (st.executeUpdate() > 0) {
                return id;
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println("wwwwwwww");
            System.out.println(ex);
        }
        return "";
    }

    public String insertCourse(String d, String t, String b, String s, String i, String ta, int y) {
        String sql = "insert into course (course_id,dept_name,title,book,semester,year,id_ins,id_ta) values (?,?,?,?,?,?,?,?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            String c = t + (generatecourseID(s, y) + 1) + "";
            st.setString(1, c);
            st.setString(2, d);
            st.setString(3, t);
            st.setString(4, b);
            st.setString(5, s);
            st.setInt(6, y);
            st.setString(7, i);
            st.setString(8, ta);
            if (st.executeUpdate() > 0) {
                return c;
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }

    }

    public String deleteCourse(String id, String s, int y) {
        String sql = "delete from course where course_id = ? and semester =? and year = ?;";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            st.setString(2, s);
            st.setInt(3, y);
            if (st.executeUpdate() > 0) {
                return id + " deleted sucessfuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }

    }

    public int generatecourseID(String s, int y) {
        String sql = "select count(course_id) from course "
                + "where semester=? and year=? ;";
        int max = 0;
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, s);
            st.setInt(2, y);
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

    public int generateinstID() {
        String sql = "select count(id) from instructor;";
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

    public String insertInstr(String d, String n, String p) {
        String sql = "insert into instructor (id,dept_name,name,password) values (?,?,?,?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            String id = n.substring(2) + (generateinstID() + 1);
            st.setString(1, id);
            st.setString(2, d);
            st.setString(3, n);
            st.setString(4, Hash.getMd5Hash(p));
            if (st.executeUpdate() > 0) {
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }
        return "";
    }

    public int generateTAID() {
        String sql = "select count(id) from teacher_assistance;";
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

    public String insertTA(String d, String n, String p) {
        String sql = "insert into teacher_assistance (id,dept_name,name,password) values (?,?,?,?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            String ID = n.substring(2) + (generateTAID() + 1) + "";
            st.setString(1, ID);
            st.setString(2, d);
            st.setString(3, n);
            st.setString(4, Hash.getMd5Hash(p));
            if (st.executeUpdate() > 0) {
                return ID;
            } else {
                return "";
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }
    }

    public String getinstrName(String id) {
        String sql = "select name from instructor where id = ? ;";
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

    public String getTAName(String id) {
        String sql = "select name from teacher_assistance where id = ? ;";
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

    public String getdeptNameforIns(String id) {
        String sql = "select dept_name from instructor where id = ? ;";
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

    public String getdeptNameforTA(String id) {
        String sql = "select dept_name from teacher_assistance where id = ? ;";
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

    public String deleteTA(String id) {
        String sql = "delete from teacher_assistance where id = ? ;";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            if (st.executeUpdate() > 0) {
                return id + " deleted sucessfuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }

    }

    public String deleteinst(String id) {
        String sql = "delete from instructor where id = ? ;";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, id);
            if (st.executeUpdate() > 0) {
                return id + " deleted sucessfuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }

    }

    public String deletesec(String course_id, String sec_id, String sem, int y) {
        String sql = "delete from section where sec_id = ? and course_id = ? and semester =? and year = ?;";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, sec_id);
            st.setString(2, course_id);
            st.setString(3, sem);
            st.setInt(4, y);
            if (st.executeUpdate() > 0) {
                return sec_id + " deleted sucessfuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }

    }

    public String editCourse(String id, String t, String b, String s, String i, String ta, int y) {
        String sql = "update course set (title, book ,id_ins , id_ta) =(?,?,?,?) where (course_id , semester ,year) = (?,?,?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, t);
            st.setString(2, b);
            st.setString(3, i);
            st.setString(4, ta);
            st.setString(5, id);
            st.setString(6, s);
            st.setInt(7, y);
            if (st.executeUpdate() > 0) {
                return id + " is Updated succefuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }

    }

    public String editTA(String id, String d, String n) {
        String sql = "update teacher_assistance set (dept_name,name) =(?,?)"
                + "where (id) = (?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, d);
            st.setString(2, n);
            st.setString(3, id);
            if (st.executeUpdate() > 0) {
                return id + " is Updated succefuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }
    }

    public String editInstructor(String id, String d, String n) {
        String sql = "update instructor set (dept_name,name) =(?,?) where (id) = (?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, d);
            st.setString(2, n);
            st.setString(3, id);
            if (st.executeUpdate() > 0) {
                return id + " is Updated succefuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }
    }

    public String editsec(String coursr_id, String sec_id, String s, String r, int y) {
        String sql = "update section set room_number= ? where (course_id ,sec_id ,year,semester)=(?,?,?,?);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, r);
            st.setString(2, coursr_id);
            st.setString(3, sec_id);
            st.setInt(4, y);
            st.setString(5, s);
            if (st.executeUpdate() > 0) {
                return sec_id + " is Updated succefuly..";
            } else {
                return "";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return "";
        }
    }
}
