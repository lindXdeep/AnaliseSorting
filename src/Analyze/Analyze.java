package Analyze;
public class Analyze{
    private String name;                //Name researching algorithm
    private long iterations;             //Total number iterations
    private long step;                   //Sum steps
    private long cycle;                  //Sum cycle
    private long compare;                //Sum compare

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
	public long getIterations()  {   return this.iterations; }
	public long getStep()        {   return this.step;       }
	public long getCycle()       {   return this.cycle;      }
	public long getCompare()     {   return this.compare;    }
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
        System.out.println(this.name + " complet! \t -> \t" + this.stopTime + " ms.");
    }      
    
    public void view(){
        ResultsAnalyze.getInstance().viewResults();
    }
}