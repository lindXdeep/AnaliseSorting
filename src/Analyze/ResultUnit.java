package Analyze;
public class ResultUnit{
    public String name;
    public long iterations;
    public long steps;
    public long cycles;
    public long compares; 
    public long time;
    public ResultUnit link;

    public ResultUnit(){
        name = null;
        iterations = 0;
        steps = 0;
        cycles = 0;
        compares = 0;
        time = 0;
        link = null;
    }

    public ResultUnit(String name, 
                        long iterations, 
                        long steps, 
                        long cycles, 
                        long compares, 
                        long time, 
                        ResultUnit link){
        this.name = name;
        this.iterations = iterations;
        this.steps = steps;
        this.cycles = cycles;
        this.compares = compares;
        this.time = time;
        this.link = link;                     
    } 

    public ResultUnit(Analyze unit){
        this.name = unit.getName();
        this.iterations = unit.getIterations();
        this.steps = unit.getStep();
        this.cycles = unit.getCycle();
        this.compares = unit.getCompare();
        this.time = unit.getStoptime();
        this.link = null;
    }

    public String getName()	{
		return this.name;
	}

	public void setName(String name)	{
		this.name = name;
	}

	public long getIterations()	{
		return this.iterations;
	}

	public void setIterations(int iterations)	{
		this.iterations = iterations;
	}

	public long getSteps()	{
		return this.steps;
	}

	public void setSteps(long steps)	{
		this.steps = steps;
	}

	public long getCycles()	{
		return this.cycles;
	}

	public void setCycles(long cycles)	{
		this.cycles = cycles;
	}

	public long getCompares()	{
		return this.compares;
	}

	public void setCompares(long compares)	{
		this.compares = compares;
	}

	public long getTime()	{
		return this.time;
	}

	public void setTime(long time)	{
		this.time = time;
	}

	public ResultUnit getLink()	{
		return this.link;
	}

	public void setLink(ResultUnit link)	{
		this.link = link;
	}
}