class Analize{
    private String name;                //Name researching algorithm
    private int iterations;             //Total number iterations
    private int step;                   //Sum steps
    private int cycle;                  //Sum cycle
    private int compare;                //Sum compare

    private long startTime;
    private long stopTime;

    public Analize(){}

    public void start(String name){       //Начало алгоритма
        this.name = name;
        startTime = System.currentTimeMillis();
    }        
    public void step(){        //шаг любой операции
        this.step++;
        this.iterations++;
    }         
    public void cycle(){       //итерация цикла
        this.cycle++;
        this.iterations++;
    }        
    public void compare(){     //операция сравнения  
        this.compare++;
        this.iterations++;
    }     
    public void stop(){        //Конец алгоритма
        System.out.println("\nstop");
        this.stopTime = System.currentTimeMillis() - this.startTime;
    }        

    public void view(){
        System.out.println("name: " + this.name );
        System.out.println("steps: " + this.step);
        System.out.println("cycle: " + this.cycle);
        System.out.println("compare: " + this.compare );
        System.out.println("iterations: " + this.iterations);
        System.out.println("Time: " + this.stopTime + " ms");


    }
}