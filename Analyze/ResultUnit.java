package Analyze;
public class ResultUnit{
    public String name;
    public int iterations;
    public int steps;
    public int cycles;
    public int compares; 
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
                        int iterations, 
                        int steps, 
                        int cycles, 
                        int compares, 
                        int time, 
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

	public int getIterations()	{
		return this.iterations;
	}

	public void setIterations(int iterations)	{
		this.iterations = iterations;
	}

	public int getSteps()	{
		return this.steps;
	}

	public void setSteps(int steps)	{
		this.steps = steps;
	}

	public int getCycles()	{
		return this.cycles;
	}

	public void setCycles(int cycles)	{
		this.cycles = cycles;
	}

	public int getCompares()	{
		return this.compares;
	}

	public void setCompares(int compares)	{
		this.compares = compares;
	}

	public int getTime()	{
		return this.time;
	}

	public void setTime(int time)	{
		this.time = time;
	}

	public ResultUnit getLink()	{
		return this.link;
	}

	public void setLink(ResultUnit link)	{
		this.link = link;
	}
}