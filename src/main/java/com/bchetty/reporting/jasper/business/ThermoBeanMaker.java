package com.bchetty.reporting.jasper.business;

import com.bchetty.reporting.jasper.data.ThermoBean;
import java.util.ArrayList;

/**
 *
 * @author Babji Prashanth, Chetty
 */
public class ThermoBeanMaker {
    /**
     * 
     * @return 
     */
    public ArrayList<ThermoBean> getThermoData() {
        ArrayList<ThermoBean> thermoBeanList = new ArrayList<ThermoBean>();

        thermoBeanList.add(create(-10.0, -40.0, 50.0, -40.0, 0.0, 0.0, 15.0, 15.0, 50.0));

        return thermoBeanList;
    }
    
    /**
     * 
     * @param value
     * @param rangeMin
     * @param rangeMax
     * @param firstSubRangeMin
     * @param firstSubRangeMax
     * @param secondSubRangeMin
     * @param secondSubRangeMax
     * @param thirdSubRangeMin
     * @param thirdSubRangeMax
     * @return 
     */
    private ThermoBean create(double value, double rangeMin, double rangeMax, double firstSubRangeMin,
            double firstSubRangeMax, double secondSubRangeMin, double secondSubRangeMax,
            double thirdSubRangeMin, double thirdSubRangeMax) {
        ThermoBean thermoBean = new ThermoBean();

        thermoBean.setTitle("Germany - Temparature Report");
        thermoBean.setValue(value);
        thermoBean.setRangeMin(rangeMin);
        thermoBean.setRangeMax(rangeMax);
        thermoBean.setFirstSubRangeMin(firstSubRangeMin);
        thermoBean.setFirstSubRangeMax(firstSubRangeMax);
        thermoBean.setSecondSubRangeMin(secondSubRangeMin);
        thermoBean.setSecondSubRangeMax(secondSubRangeMax);
        thermoBean.setThirdSubRangeMin(thirdSubRangeMin);
        thermoBean.setThirdSubRangeMax(thirdSubRangeMax);

        return thermoBean;
    }
}
