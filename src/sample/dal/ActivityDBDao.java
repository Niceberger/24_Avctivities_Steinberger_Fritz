package sample.dal;

import sample.bll.Activity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActivityDBDao implements DaoActivity {
    @Override
    public ArrayList<Activity> getALlActivitys() throws SQLException {
        return DatabaseManager.getInstance().getAllActivitys();
    }




}
