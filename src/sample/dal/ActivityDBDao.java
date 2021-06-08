package sample.dal;

import sample.bll.Activity;

import java.sql.SQLException;
import java.util.List;

public class ActivityDBDao {
    @Override
    public List<Activity> getALlActivitys() throws SQLException {
        return DatabaseManager.getInstance().getAllActivitys();
    }



}
