package sample;

import sample.bll.Activity;
import sample.bll.Person;
import sample.dal.DBdao;

import javax.swing.*;
import javax.swing.text.TableView;
import javax.swing.text.html.ListView;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private ComboBox cbseason;

    @FXML
    private ListView lvActivity;
    @FXML
    private TableView tvNames;

    Dao<Person> daopersonen = new DBdao();
    Activity act;
    //Season ses;

    List<Activity> activityList = new ArrayList<Activity>();


    @FXML
    private void onNewClicked(ActionEvent actionEvent) {
        Person p1;
        p1 = new Person(act,"lol","lol");
        this.tvNames.getItems().add(p1);
        p1.insert(daopersonen);
    }



}
