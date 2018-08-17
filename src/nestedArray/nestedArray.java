package nestedArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class nestedArray {

   

    public static HashMap<String, ArrayList<Float>> hashMinuteValue = new HashMap<String, ArrayList<Float>>();

    public static void main(String args[]) throws ParseException, IOException {
     
        try {
           
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/diksh/eclipse-workspace/nestedArray/src/timeseries.csv"));	//Reading the timeseries file

            String line = null;
            Scanner scanner = null;
            int index = 0;
          
            List<timeseries> ts = new ArrayList<timeseries>();

            reader.readLine();
            while ((line = reader.readLine()) != null) {
               
                timeseries tseries = new timeseries();
                scanner = new Scanner(line);
                scanner.useDelimiter(",");

                while (scanner.hasNext()) {		// Reading the file until there are more tokens (Reading till the end)
                    String data = scanner.next();
                    
                    // Parsing it column by column at 0th position we have label at first position we have data and time and at 2nd position we have the Value
                    if (index == 0) {			// Storing the Label i.e CPU or Memory or Disk
                        tseries.setfld(data);
                    } else if (index == 1) {	// Storing the Date and time                        
                        tseries.setdt((data));
                    } 
                    else if (index == 2) {
                        tseries.setValue(Float.parseFloat(data));		// Storing the value
                    }

                    index++;

                }
                index = 0; 		//Resetting the index for next row
                ts.add(tseries);
             
            }

            reader.close();
            scanner.close();

            CheckTimelimit(ts);

            System.out.println("nestedArray.nestedArray.main()");
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }

    }

    private static void CheckTimelimit(List<timeseries> ts) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Date date;
        String Firstminute = "";
        String Fifthminute;
        int fifthMultipleCounter = 0;
        
        ArrayList<Float> hashValueCpu = new ArrayList<Float>();   // Stores all 5 minutes CPU values in hashValueCpu
        ArrayList<Float> hashValueMemory = new ArrayList<Float>(); // Stores all 5 minutes Memory values in hashValueMemory
        ArrayList<Float> hashValueDisk = new ArrayList<Float>(); //// Stores all 5 minutes Disk values in hashValueDisk

        for (int i = 0; i < ts.size(); i++) {
            date = formatter.parse(ts.get(i).getdt());

            
            // Caluculate Mean Min Max and standard deviation for the bucket of 5 (Calculate everthing only at the 5th counter)
            if (fifthMultipleCounter == 5) {			// Calculate for 5 minutes. Counter set for 5 Minutes
                Fifthminute = date.toString();
                
                
                for (Map.Entry<String, ArrayList<Float>> entry : hashMinuteValue.entrySet()) {

                    String keySet = entry.getKey();
                    ArrayList<Float> valueList = entry.getValue();
                    
                    
                    if ("cpu".equals(keySet)) {			//If the key is CPU is the HashMap then calculate for CPU

                        System.out.println("Cpu processing for time " + Firstminute + " - " + Fifthminute);

                        System.out.println("Mean : " + GetMean(valueList));		// Passing the five value list for calculating Mean
                        System.out.println("Minimum : " + GetMinimum(valueList));		// Passing the five value list for calculating Minimum
                        System.out.println("Maximum : " + GetMaximum(valueList));		// Passing the five value list for calculating Maximum
                        System.out.println("Standard Deviation : " + GetStandardDeviation(valueList));		// Passing the five value list for calculating Standard Deviation
                        System.out.println("");
                    } else if ("memory".equals(keySet)) { 		//If the key is Memory is the HashMap then calculate for Memory
                        System.out.println("Memory processing for time " + Firstminute + " - " + Fifthminute);
                        System.out.println("Mean : " + GetMean(valueList));
                        System.out.println("Minimum : " + GetMinimum(valueList));
                        System.out.println("Maximum : " + GetMaximum(valueList));
                        System.out.println("Standard Deviation : " + GetStandardDeviation(valueList));
                        System.out.println("");
                    } else if ("disk".equals(keySet)) {			//If the key is Disk is the HashMap then calculate for Disk
                        System.out.println("Disk processing for time " + Firstminute + " - " + Fifthminute);
                        System.out.println("Mean : " + GetMean(valueList));
                        System.out.println("Minimum : " + GetMinimum(valueList));
                        System.out.println("Maximum : " + GetMaximum(valueList));
                        System.out.println("Standard Deviation : " + GetStandardDeviation(valueList));
                        System.out.println("");
                    }
                }

                fifthMultipleCounter = 0;   // Resetting the five minute counter for next 5 minutes slot
                hashMinuteValue = new HashMap<String, ArrayList<Float>>();
                
                
                hashValueCpu = new ArrayList<Float>();
                hashValueMemory = new ArrayList<Float>();
                hashValueDisk = new ArrayList<Float>();

            }
            // If we do not have all the 5 minutes value keep on adding until we get values for 5 minutes
            else {
            	
            	// Using Minute as Key 
            	//If the key is already present add just the values into the Array  
                if (hashMinuteValue.containsKey(ts.get(i).getfld())) {
                    if (ts.get(i).getfld().equals("cpu")) {
                        hashValueCpu.add(ts.get(i).getvalue());

                    } else if (ts.get(i).getfld().equals("memory")) {
                        hashValueMemory.add(ts.get(i).getvalue());

                    } else if (ts.get(i).getfld().equals("disk")) {
                        hashValueDisk.add(ts.get(i).getvalue());
                        fifthMultipleCounter++;
                    }

                } else {
                	// If the key is coming in for the first time add the key into the hash table and the value into the Array 
                	// Array is the value in the value field of Hash Map
                	
                    if (ts.get(i).getfld().equals("cpu")) {
                        hashValueCpu.add(ts.get(i).getvalue());
                        hashMinuteValue.put(ts.get(i).getfld(), hashValueCpu);
                    } else if (ts.get(i).getfld().equals("memory")) {
                        hashValueMemory.add(ts.get(i).getvalue());
                        hashMinuteValue.put(ts.get(i).getfld(), hashValueMemory);
                    } else if (ts.get(i).getfld().equals("disk")) {
                        hashValueDisk.add(ts.get(i).getvalue());
                        hashMinuteValue.put(ts.get(i).getfld(), hashValueDisk);
                        Firstminute = date.toString();
                        fifthMultipleCounter++;
                    }

                }
            }
        }
    }

    // Calculate Mean
    private static float GetMean(ArrayList<Float> valueList) {
        float mean = 0;
        for (int i = 0; i < valueList.size(); i++) {
            mean += valueList.get(i);
        }
        mean = mean / valueList.size();
        return mean;

    }

    //Calculate the Minimum
    private static float GetMinimum(ArrayList<Float> valueList) {
        float minimum = 0;
        for (int i = 0; i < valueList.size(); i++) {
            if (i == 0) {
                minimum = valueList.get(i);
            } else if (valueList.get(i) < minimum) {
                minimum = valueList.get(i);
            }
        }
        return minimum;
    }

  //Calculate the Maximum
    private static float GetMaximum(ArrayList<Float> valueList) {
        float maximum = 0;

        for (int i = 0; i < valueList.size(); i++) {
            if (i == 0) { 
                maximum = valueList.get(i);
            } else if (valueList.get(i) > maximum) {
                maximum = valueList.get(i);
            }
        }
        return maximum;
    }

  //Calculate the Standard Deviation
    private static double GetStandardDeviation(ArrayList<Float> valueList) {
        double standardDeviation = 0;
        float mean = 0;
        mean = GetMean(valueList);
        for (double num : valueList) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / valueList.size());

    }

}
