package com.bchetty.reporting.jasper.main;

import com.bchetty.reporting.jasper.business.SimpleBeanMaker;
import com.bchetty.reporting.jasper.data.SimpleBean;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * Simple Report Generator.
 * 
 * @author Babji Prashanth, Chetty
 */
public class SimpleReporter {
    /**
     * 
     * @param args
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("reports/simple.jrxml");

        SimpleBeanMaker simpleBeanMaker = new SimpleBeanMaker();
        ArrayList<SimpleBean> simpleBeanList = simpleBeanMaker.getDataBeanList();
        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(simpleBeanList);

        Map parameters = new HashMap();

        JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, "reports/simple.pdf");
    }
}
