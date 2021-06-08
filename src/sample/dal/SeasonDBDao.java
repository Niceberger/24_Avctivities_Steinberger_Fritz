package sample.dal;

import sample.bll.Activity;
import sample.bll.Season;

import java.sql.SQLException;
import java.util.List;

public class SeasonDBDao implements DaoSeason  {

    @Override
    public List<Season> getALlSeasons()  {
        return DatabaseManager.getInstance().getAllSeasons();
    }





}
