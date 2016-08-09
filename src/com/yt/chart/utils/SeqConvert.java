package com.yt.chart.utils;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class SeqConvert extends ClassicConverter {

	@Override
	public String convert(ILoggingEvent arg0) {
		String resultStr="";
		Object [] argArray=arg0.getArgumentArray();
		if(null!=argArray&&argArray.length>0){
			for(int i=0;i<argArray.length;i++){
				Object obj= argArray[i];
				if(null!=obj&&!obj.toString().trim().toLowerCase().equals(""))
				resultStr="|"+(String) argArray[i];
			}
			
		}
		return resultStr;
	}

}
