package org.ntvru.jsgp.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class StringBigDecimalConverter {

	public static String recuperaValorBigDecimal(BigDecimal bigDecimal) 
	{
	      DecimalFormat decFormat = new DecimalFormat("#,###,##0.00");

	      return decFormat.format(bigDecimal);
	}
	
	public static BigDecimal retornaString(String str) {
		 str = str.replace(".","");
	     str = str.replace(",", ".");
	     str = str.trim();

	     return new BigDecimal(str);
		
	}
	
	public static BigDecimal converteStringParaBigDecimal(String str) throws ParseException {
		Locale locale = new Locale("pt","BR");
		DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(locale);
		 df.setParseBigDecimal(true);      
		return (BigDecimal) df.parseObject(str);
	}
	
}
