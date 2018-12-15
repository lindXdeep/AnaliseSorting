package Analyze;
public final class ResultsAnalyze{
    
    ResultsList resultsList = new ResultsList();

    int count = 0;

    private static volatile ResultsAnalyze instance = new ResultsAnalyze();

    public ResultsAnalyze(){}

    public static ResultsAnalyze getInstance() {
            if(instance == null){
                synchronized(ResultsAnalyze.class)
                {
                    instance = new ResultsAnalyze();
                }
                
            }
        return instance;
    }

    public void pushResult(Analyze analyze){
        resultsList.insertAtEnd(analyze);
    }

    public void viewResults(){
        resultsList.displayAllResults();
    }
}