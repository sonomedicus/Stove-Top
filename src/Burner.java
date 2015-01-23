
public class Burner {
   public enum Temperature{HOT,WARM,COLD};
   private Setting set;
   private Temperature t;
   private int time_elapsed = 0;
   private static final int TIME_DURATION = 3;
   
   public Burner(Setting set,Temperature t){
	   super();
	   this.set = set.OFF;
	   this.t = t.COLD;
   }
   
   public void increaseSetting() {
	   switch(set){
	     case OFF: this.set = set.LOW;
	                time_elapsed = 0;
	     
	     case LOW: this.set = set.MEDIUM;
	               time_elapsed = 0;
	     
	     case MEDIUM: this.set = set.HIGH;
	                  time_elapsed = 0;
	     default: this.set = set.HIGH;
	                   time_elapsed = 0;
	   }
   }
   
   public void decreaseSetting(){
	   switch(set){
	     case HIGH: this.set = set.MEDIUM;
	                time_elapsed = 0;
	     
	     case MEDIUM: this.set = set.LOW;
	               time_elapsed = 0;
	     
	     case LOW: this.set = set.OFF;
	                  time_elapsed = 0;
	     default: this.set = set.OFF;
	                   time_elapsed = 0;
	   }
   }
   
   public void updateTemperature() {
	   time_elapsed++;
	   if( time_elapsed == TIME_DURATION){
		   if(this.set == set.HIGH){
			   this.t = t.HOT;
		   } else if(this.set == set.MEDIUM || this.set == set.LOW){
			   this.t = t.WARM;
		   } else {
			   this.t = t.COLD;
		   }
	   }
   }

   public Temperature getT() {
	     return t;
     }
   
   public String displayStatus() {
	   if(set == set.HIGH){
		   return set.toSting() + "hotttt";
	   }else if(set == set.MEDIUM){
		   return set.toSting() + "warm";
	   } else if(set == set.LOW){
		   return set.toSting() + "cool";
	   }
	   return set.toSting() + "off";
   }
}
