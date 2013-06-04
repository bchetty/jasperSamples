package com.bchetty.reporting.jasper.business;

import com.bchetty.reporting.jasper.data.SimpleBean;
import java.util.ArrayList;

/**
 *
 * @author Babji Prashanth, Chetty
 */
public class SimpleBeanMaker {
    /**
     * 
     * @return 
     */
    public ArrayList<SimpleBean> getDataBeanList() {
        ArrayList<SimpleBean> dataBeanList = new ArrayList<SimpleBean>();

        //dataBeanList.add(produce("Babji, Chetty", "Engineer", "Nuremberg", "Germany"));
        dataBeanList.add(produce("Albert Einstein", "Engineer", "Ulm", "Germany"));
        dataBeanList.add(produce("Alfred Hitchcock", "Movie Director", "London", "UK"));
        dataBeanList.add(produce("Wernher Von Braun", "Rocket Scientist", "Wyrzysk", "Poland (Previously Germany)"));
        dataBeanList.add(produce("Sigmund Freud", "Neurologist", "Pribor", "Czech Republic (Previously Austria)"));
        dataBeanList.add(produce("Mahatma Gandhi", "Lawyer", "Gujarat", "India"));
        dataBeanList.add(produce("Sachin Tendulkar", "Cricket Player", "Mumbai", "India"));
        dataBeanList.add(produce("Michael Schumacher", "F1 Racer", "Cologne", "Germany"));

        return dataBeanList;
    }
    
    /**
     * 
     * @param name
     * @param occupation
     * @param place
     * @param country
     * @return 
     */
    private SimpleBean produce(String name, String occupation, String place, String country) {
        SimpleBean dataBean = new SimpleBean();

        dataBean.setName(name);
        dataBean.setOccupation(occupation);
        dataBean.setPlace(place);
        dataBean.setCountry(country);

        return dataBean;
    }
}
