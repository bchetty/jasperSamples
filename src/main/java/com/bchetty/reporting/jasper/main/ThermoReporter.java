package com.bchetty.reporting.jasper.main;

import com.bchetty.reporting.jasper.business.ThermoBeanMaker;
import com.bchetty.reporting.jasper.data.ThermoBean;
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
 * Thermo Report Generator.
 *
 * @author Babji Prashanth, Chetty
 */
public class ThermoReporter {
    /**
     * 
     * @param args
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("reports/thermochart.jrxml");

        ThermoBeanMaker thermoBeanMaker = new ThermoBeanMaker();
        ArrayList<ThermoBean> thermoBeanList = thermoBeanMaker.getThermoData();

        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(thermoBeanList);

        Map parameters = new HashMap();

        JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, "reports/thermochart.pdf");
    }
}
