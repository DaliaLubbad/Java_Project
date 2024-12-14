package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.postgresql.ds.PGSimpleDataSource;

public class Create {

    static final String DB_URL = "jdbc:postgresql://localhost/";
    static final String USER = "postgres";
    static final String PASS = "m.1234567899";

    public Create() {
        this.con = connectt();
    }

    public Connection connect() {
        PGSimpleDataSource source = new PGSimpleDataSource();
        source.setServerName("localhost");
        source.setDatabaseName("postgres");
        source.setUser("postgres");
        source.setPassword("m.1234567899");
        source.setCurrentSchema("public");
        try {
            con = source.getConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public Connection getCon() {
        return con;
    }

    public final Connection connectt() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE DATABASE postgres";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
            if (isSchemaExist()) {
                createSchemaExist();
                if (!areTablesExist()) {
                    createTables();
                    con = connect();
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("jjjjj");
        }
        return null;
    }

    public boolean areTablesExist() {
        String schema = "public";
        String[] tables_name = {"teacher_assistance", "takes", "student", "section", "real_player", "phone_number", "lectures",
            "instructor", "department", "course", "classroom", "attendence"};

        ArrayList<String> tables_notExist = new ArrayList<>();
        for (String tables_name1 : tables_name) {
            if (isTableExists(schema, tables_name1) != 1) {
                tables_notExist.add(tables_name1);
            }
        }
        if (tables_notExist.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
    Connection con;

    public int isTableExists(String schema, String table) {
        String sql = "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = ? AND table_name = ?;";
        int c = 0;
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, schema);
            st.setString(2, table);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                c = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return c;
    }

    public boolean createTables() {
        String sql = "create table department (dept_name varchar(20),building varchar(15),primary key (dept_name)); "
                + "create table instructor(ID varchar(20),name varchar(20) not null,dept_name varchar(20),password varchar(50) not null ,primary key (ID),foreign key (dept_name) references department (dept_name) on delete set null);"
                + "create table Teacher_Assistance(ID varchar(5),name varchar(20) not null,dept_name varchar(20),password varchar(50) not null ,primary key (ID),foreign key (dept_name) references department (dept_name) on delete set null);"
                + "create table course(course_id varchar(8), title varchar(50),dept_name varchar(20),book varchar(50) ,ID_ins varchar(20),ID_ta varchar(5),semester varchar(6) check (semester in ('Fall', 'Winter', 'Spring', 'Summer')),year numeric(4,0) check (year > 1701 and year < 2023), primary key (course_id,semester,year),foreign key (dept_name) references department (dept_name) on delete set null,foreign key (ID_ins) references instructor on delete set null, foreign key (ID_ta) references Teacher_Assistance on delete set null);"
                + "create table ClassRoom(Building varchar(20) ,room_number varchar(20),primary key (Building,room_number));"
                + "create table section(course_id varchar(8),sec_id varchar(8),semester varchar(6) check (semester in ('Fall', 'Winter', 'Spring', 'Summer')),year numeric(4,0) check (year > 1701 and year < 2023),room_number varchar(20),Building varchar(20) ,primary key (course_id, sec_id, semester, year),foreign key (course_id,semester,year) references course on delete cascade,foreign key (room_number,Building) references classroom on delete cascade);"
                + "create table lectures(lec_id varchar(8),course_id varchar(8),sec_id varchar(8),semester varchar(6) check (semester in ('Fall', 'Winter', 'Spring', 'Summer')),year numeric(4,0) check (year > 1701 and year < 2023),title varchar(20),cheeck varchar(8),date varchar(20),primary key (lec_id,course_id,sec_id,semester,year),foreign key (course_id,sec_id,semester,year) references section  on delete cascade);"
                + "create table student(ID varchar(5),first_name varchar(20) not null,secound_name varchar(20) not null,third_name varchar(20) not null,last_name varchar(20) not null,dept_name varchar(20),city varchar(20),address varchar(20),primary key (ID),foreign key (dept_name) references department (dept_name)on delete set null);"
                + "create table phone_number(ID varchar(5),phone_number varchar(20) not null,primary key (ID,phone_number),foreign key (ID) references student (ID)on delete cascade on update cascade);"
                + "create table takes(ID varchar(5), course_id varchar(8),sec_id varchar(8),semester varchar(6),year numeric(4,0), primary key (ID, course_id, sec_id, semester, year),foreign key (course_id, sec_id, semester, year) references section (course_id, sec_id, semester, year)on delete cascade,foreign key (ID) references student (ID)on delete cascade);"
                + "create table attendence(ID varchar(5),lec_id varchar(8),course_id varchar(8),sec_id varchar(8),semester varchar(6) check (semester in ('Fall', 'Winter', 'Spring', 'Summer')),year numeric(4,0) check (year > 1701 and year < 2023),Status varchar(1),primary key (ID,lec_id,course_id,sec_id,semester,year),foreign key (lec_id,course_id,sec_id,semester,year) references lectures  on delete cascade on update cascade,foreign key(ID,course_id,sec_id,semester,year) references takes on delete cascade on update cascade);";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.executeUpdate();
            System.out.println("tabeles created successfuly...");
            return true;

        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("66666");
        }

        return false;
    }

    public boolean createSchemaExist() {
        String sql = "CREATE SCHEMA projectSchema";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.executeUpdate();
            System.out.println("schema created successfully...");
            return true;

        } catch (SQLException ex) {

        }

        return false;
    }

    public boolean isSchemaExist() {
        String sql = "CREATE SCHEMA if not exists projectSchema";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.executeUpdate();
            System.out.println("schema created successfully...");
            return true;

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return false;
    }

}
