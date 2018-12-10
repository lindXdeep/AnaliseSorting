
public final class ResultsAnalise{
    
    private static ResultsAnalise instance = null;

    public ResultsAnalise(){}

     public static ResultsAnalise getInstance() {
        
        if(instance == null){
            instance =  new ResultsAnalise();
        }
        return instance;
    }
}