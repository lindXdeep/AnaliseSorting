package Analyze;
public class ResultsList{

    ResultUnit beginLink = null;
    ResultUnit endLink =  null;
    int size = 0;
    
    public ResultsList(){
        this.beginLink = null;
        this.endLink = null;
        this.size = 0;
    }

    public void insertAtEnd(Analyze analyze){
        
        ResultUnit node = new ResultUnit(analyze);
           
        if(beginLink == null){
            beginLink = node;
            endLink = beginLink;
        }else{
            
            endLink.setLink(node);
            endLink = node;
        }
        size++;
    }

    public void displayAllResults(){
        
        ResultUnit print = beginLink;
        while(print != null){
                System.out.printf("\n\n Algorithm: %s. ", print.name);
                System.out.printf("\n|\t\t Time: \u001B[32m  %d ms", print.time);
                System.out.printf("\n|\t Total iterations: %d\t", print.iterations);
                System.out.printf("\t|\tSteps: %d", print.steps);
                System.out.printf("\t|\tCycles: %d", print.cycles);
                System.out.printf("\t|\tCompares: %d \t|", print.compares);
            print = print.link;
        }


       
        
        
        
    }
}