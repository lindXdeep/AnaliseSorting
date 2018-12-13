package Analyze;
public class Analyze{
    private String name;                //Name researching algorithm
    private int iterations;             //Total number iterations
    private int step;       
                //Sum steps
    private int cycle;                  //Sum cycle
    private int compare;                //Sum compare

    private long startTime;
    private long stopTime;
    
    public Analyze(){
        this.name = null;
        this.iterations = 0;
        this.step = 0;
        this.cycle = 0;
        this.compare = 0;
        this.startTime = 0;
        this.stopTime = 0;
    }
    
    public String getName()	    {   return this.name;	    }
	public int getIterations()  {   return this.iterations; }
	public int getStep()        {   return this.step;       }
	public int getCycle()       {   return this.cycle;      }
	public int getCompare()     {   return this.compare;    }
	public long getStoptime()   {   return this.stopTime;   }

    public void start(String name){                 //beginning of algorithm
        this.name = name;
        startTime = System.currentTimeMillis();
    }        
    public void step(){                             //Step of operation
        this.step++;
        this.iterations++;
    }         
    public void cycle(){                            //loop of cycle
        this.cycle++;
        this.iterations++;
    }        
    public void compare(){                          //loop of compare operation
        this.compare++;
        this.iterations++;
    }     
    public void stop(){                             //End of algorithm
        this.stopTime = System.currentTimeMillis() - this.startTime;
        ResultsAnalyze.getInstance().pushResult(this);
    }      
    
    public void view(){
        ResultsAnalyze.getInstance().viewResults();
    }
}