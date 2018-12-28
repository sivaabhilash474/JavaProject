package org.companyname.projectname.utilities;

import java.io.Closeable;
import java.io.IOException;

public class MiscUtils {
	
	private static String DEFLT_DATE_FORMAT = "MM/dd/yyyy";
	
	public MiscUtils(){
		
	}
	
	public static long[] swap(long... tobeSwapped){
		long[] swappedArray = new long[]{tobeSwapped[1], tobeSwapped[0]};
		return swappedArray;
	}
	
	public static void sleep(long millis){
		try{
			Thread.sleep(millis);
		}
		catch(InterruptedException var3){
			CucumberLogUtils.logError(var3.getMessage());
		}
	}

	
	public static void closeQuitely(Closeable... closeable){
		Closeable[] var1 = closeable;
		int var2 = closeable.length;
		for(int var3=0; var3<var2; ++var3){
			Closeable obj2Close = var1[var3];
			if(obj2Close != null){
				try{
					obj2Close.close();
				}
				catch(IOException var6){
					CucumberLogUtils.logDebug("Exception encountered while closing the stream:\n" +var6);
				}
			}
		}
	}
}
