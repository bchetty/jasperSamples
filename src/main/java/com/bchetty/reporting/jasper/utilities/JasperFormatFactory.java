package com.bchetty.reporting.jasper.utilities;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import net.sf.jasperreports.engine.util.FormatFactory;

/**
 *
 * @author Babji Prashanth, Chetty
 */
public class JasperFormatFactory implements FormatFactory {

    @Override
    public DateFormat createDateFormat(String string, Locale locale, TimeZone tz) {
        DateFormat format = new SimpleDateFormat(string, locale){
            @Override
            public Date parse(String source) throws ParseException {
                if((source == null) || (source.equals("")))
                    return null;
                return super.parse(source);
            }
        };

        return format;
    }

    @Override
    public NumberFormat createNumberFormat(String string, Locale locale) {
        NumberFormat format = new DecimalFormat(string){
            @Override
            public Number parse(String source) throws ParseException {
                if((source == null) || (source.equals("")))
                    return null;
                return super.parse(source);
            }
        };

        return format;
    }
    
}