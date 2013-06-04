package com.bchetty.reporting.jasper.main;

import com.bchetty.reporting.jasper.business.GanttBeanMaker;
import com.bchetty.reporting.jasper.data.GanttBean;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * Gantt Report Generator.
 *
 * @author Babji Prashanth, Chetty
 */
public class GanttReporter {
    /**
     * 
     * @param args
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("reports/ganttchart.jrxml");

        GanttBeanMaker ganttChartBeanMaker = new GanttBeanMaker();
        ArrayList<GanttBean> ganttChartBeanList = ganttChartBeanMaker.getGanttChartData();

        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(ganttChartBeanList);

        Map parameters = new HashMap();

        JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, "reports/ganttchart.pdf");
    }
}
