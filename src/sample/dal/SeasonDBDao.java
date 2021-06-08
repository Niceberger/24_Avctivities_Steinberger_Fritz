package sample.dal;

import sample.bll.Activity;
import sample.bll.Season;

import java.sql.SQLException;
import java.util.List;

public class SeasonDBDao {

    @Override
    public List<Season> getALlSeasons() throws SQLException {
        return DatabaseManager.getInstance().getAllSeasons();
    }



}
