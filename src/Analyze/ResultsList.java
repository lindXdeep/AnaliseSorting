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
        
        if(beginLink != null)
        {           
            ResultUnit print = beginLink;
            while(print != null){
                    System.out.printf("Algorithm: -> %26s -> Time: %5d ms.", print.name, print.time);
                    System.out.printf("\n|\t Iterations: %4d\t", print.iterations);
                    System.out.printf("\t|\tSteps: %d", print.steps);
                    System.out.printf("\t|\tCycles: %9d", print.cycles);
                    System.out.printf("\t|\tCompares: %9d \t|\n", print.compares);
                print = print.link;
            }

            ResultUnit print2 = beginLink;
            System.out.print("\n - - - - - - Total operations - - - - - -");
            while(print2 != null){
                System.out.printf("\n Algorithm: -> %26s  -> %1d", print2.name, print2.operations );
                print2 = print2.link;
            }

        }
    }
}