import Analyze.*;

class Main{
    public static void main(String[] args) {
        
        Analyze analyze = new Analyze();

        analyze.start("Insertions");        //Beginning of algorithms
        
        for (int i = 0; i < 10; i++) {
            analyze.step();                 //Step operations
            for (int j = 0; j < 5; j++) {
                analyze.cycle();            //loop iteration
                if(i == j )
                    analyze.compare();      //Comparison operation
            }
        }

        analyze.stop();                     //End of algorithms
      
        Analyze analyze2 = new Analyze();


        analyze2.start("Bubble");        //Beginning of algorithms
        
        for (int i = 0; i < 6; i++) {
            analyze2.step();                 //Step operations
            for (int j = 0; j < 11; j++) {
                analyze2.cycle();            //loop iteration
                if(i == j )
                    analyze2.compare();      //Comparison operation
            }
        }

        analyze2.stop();                     //End of algorithms
       
        Analyze analyze3 = new Analyze();

        analyze3.start("sort");        //Beginning of algorithms
        
        for (int i = 0; i < 6; i++) {
            analyze3.step();                 //Step operations
            for (int j = 0; j < 11; j++) {
                analyze3.cycle();            //loop iteration
                if(i == j )
                    analyze3.compare();      //Comparison operation
            }
        }

        analyze3.stop();                     //End of algorithms




        ResultsAnalyze.getInstance().viewResults();
    }
}