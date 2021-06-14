package sample.dal;

import com.sun.org.apache.xerces.internal.impl.PropertyManager;
import sample.bll.Activity;
import sample.bll.Person;
import sample.bll.Season;
import sample.util.ProbertyManager;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DatabaseManager {
    private  String driver;
    private String url;
    private String username;
    private String password;
    private static DatabaseManager instance;
 //   private HashMap<Integer,Season> seasons = null;

    private DatabaseManager(){
        ProbertyManager.getInstance().setFilename("db.properties");
        this.driver = ProbertyManager.getInstance().readProperty("driver", "oracle.jdbc.OracleDriver");
        this.url = ProbertyManager.getInstance().readProperty("url", "jdbc:oracle:thin:@tcif.htl-villach.at:1521/orcl");
        this.username = ProbertyManager.getInstance().readProperty("username","d3a19");
        this.password = ProbertyManager.getInstance().readProperty("password","d3a19");;

    }
    private Connection createConnection() {
        Connection con = null;
        //Laden des Treibers
        try {
            Class.forName(this.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
    public static DatabaseManager getInstance() {
        if( instance == null){
            instance = new DatabaseManager();
        }
        return instance;
    }

 /*
    public List<Season> getAllSeasons() throws SQLException {
        ArrayList<Season> seasonArrayList = new ArrayList<>();
        Statement stmt;
        ResultSet resultSet;
        String query = "SELECT * FROM season";

        try(Connection con = this.createConnection()){
            stmt = con.createStatement();
            resultSet = stmt.executeQuery(query);
            //Resultset wird durch iteriert
            while (resultSet.next()){
                seasonArrayList.add(new Season(resultSet.getInt(1),resultSet.getString(2)));

            }
        }catch(SQLException throwables){
            System.out.println(throwables);
        }


        return seasonArrayList;
    }


  */
    public List<Activity> getAllActivitys()  {
        ArrayList<Activity> activityArrayList = new ArrayList<>();
        Statement stmt;
        ResultSet resultSet;
        String query = "SELECT * FROM season";

        try(Connection con = this.createConnection()){
            stmt = con.createStatement();
            resultSet = stmt.executeQuery(query);
            //Resultset wird durch iteriert
            while (resultSet.next()){
                activityArrayList.add(new Activity(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3)));

            }
        }catch(SQLException throwables){
            System.out.println(throwables);
        }


        return activityArrayList;
    }
    public List<Person> getAllPersons() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Statement stmt;
        ResultSet resultSet;
        String query = "SELECT * FROM season";

        try(Connection con = this.createConnection()){
            stmt = con.createStatement();
            resultSet = stmt.executeQuery(query);
            //Resultset wird durch iteriert
            while (resultSet.next()){
                personArrayList.add(new Person(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4)));

            }
        }catch(SQLException throwables){
            System.out.println(throwables);
        }


        return personArrayList;
    }
    public boolean updatePerson (Person p){
        boolean result = false;
        PreparedStatement preparedStatement;
        String stmt_update = "Update student SET cataloguenumber = ?, vorname = ?, nachname = ? WHERE Id = ?";
        int numberrrows = 0;
        try(Connection con = this.createConnection()){

            preparedStatement = con.prepareStatement(stmt_update, new String[]{"id"});
            preparedStatement.setInt(1, p.getIdActivity());
            preparedStatement.setString(2,p.getFirstname());
            preparedStatement.setString(3,p.getLastname());
            preparedStatement.setInt(4,p.getId());
            preparedStatement.executeUpdate();
            if(numberrrows > 0){
                result = true;
            }
        }
        catch (SQLException throwables) {
            System.out.println(throwables);
        }
        return result;
    }
    public boolean deletePerson(int id) {
        boolean result = true;
        PreparedStatement preparedStatement;
        String stmt_update = "DELETE FROM person WHERE id = ?";
        int numberrows = 0;
        try( Connection con = this.createConnection()) {
            preparedStatement = con.prepareStatement(stmt_update);
            preparedStatement.setInt(1,id);
            numberrows = preparedStatement.executeUpdate();
            if(numberrows > 0) {
                result = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public boolean insertPerson(Person p) {
        boolean result = true;
        PreparedStatement preparedStatement;
        String stmt_insert = "INSERT INTO person(id,fristname,Lastname) VALUES (?,?,?)";
        ResultSet resultSet;
        int id = -1;

        try (Connection con = this.createConnection()) {
            preparedStatement = con.prepareStatement(stmt_insert,new String[] {"id"});
            preparedStatement.setInt(1,p.getIdActivity());
            preparedStatement.setString(2,p.getFirstname());
            preparedStatement.setString(3,p.getLastname());
            preparedStatement.execute();
            resultSet = preparedStatement.getGeneratedKeys();
            if(resultSet.next()) {
                id = resultSet.getInt(1);
                p.setId(id);
                result = true;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  result;
    }

}
