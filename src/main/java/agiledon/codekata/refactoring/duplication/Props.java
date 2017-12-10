package agiledon.codekata.refactoring.duplication;

import java.util.Properties;

public class Props {
    int checkInterval;
    int monitorTime;
    int departureOffset;

    public void getTimes(Properties props) throws Exception {
    	checkInterval = this.getIntValue(props, "interval");
    	monitorTime = this.getIntValue(props,"duration");
        departureOffset = this.getIntValue(props,"departure");
    }
    
    public int getIntValue(Properties props, String key) throws Exception {
    	 String valueString;
         int value;
    	 
         valueString = props.getProperty(key);
    	 if (valueString == null) {
             throw new MissingPropertiesException(key);
         }
         value = Integer.parseInt(valueString);
         if (value <= 0) {
             throw new MissingPropertiesException(key + " > 0");
         }
         if ((value % checkInterval) != 0) {
             throw new MissingPropertiesException(key + "  % checkInterval");
         }
         
         return value;
    }
}
