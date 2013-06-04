package com.bchetty.reporting.jasper.business;

import com.bchetty.reporting.jasper.data.GanttBean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Babji Prashanth, Chetty
 */
public class GanttBeanMaker {
    /**
     * 
     * @return 
     */
    public ArrayList<GanttBean> getGanttChartData() {
        ArrayList<GanttBean> ganttChartDataList = new ArrayList<GanttBean>();
        Calendar calendar = Calendar.getInstance();

        for (int i = 1; i < 8; i++) {
            calendar.set(Calendar.HOUR_OF_DAY, i * 1);

            Date startDate = calendar.getTime();

            calendar.set(Calendar.HOUR_OF_DAY, i * 3);

            Date endDate = calendar.getTime();

            String series = (i % 2 == 0) ? "High Priority" : "Normal";

            ganttChartDataList.add(create(series, "Meeting" + i, startDate, endDate));
        }

        return ganttChartDataList;
    }
    
    /**
     * 
     * @param series
     * @param task
     * @param startDate
     * @param endDate
     * @return 
     */
    private GanttBean create(String series, String task, Date startDate, Date endDate) {
        GanttBean ganttChartBean = new GanttBean();

        ganttChartBean.setSeries(series);
        ganttChartBean.setTask(task);
        ganttChartBean.setStartDate(startDate);
        ganttChartBean.setEndDate(endDate);

        return ganttChartBean;
    }
}
