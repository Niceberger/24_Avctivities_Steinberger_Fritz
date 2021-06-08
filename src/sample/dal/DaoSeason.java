package sample.dal;

import sample.bll.Season;

import java.sql.SQLException;
import java.util.List;

public interface DaoSeason <T>{
    List<Season> getALlSeasons();


}
