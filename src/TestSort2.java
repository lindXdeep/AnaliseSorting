import Sort.*;

public class TestSort2 extends ArchetypeSort{

    public TestSort2(int[] sourceArray,  String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(this.nameSort);

        for (int i = 0; i < this.size; i++) {
            analyze.step();
               
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                //TODO: handle exception
            }

            for (int j = 0; j < this.size; j++) {
                analyze.cycle();
                if(mainArray[i] < mainArray[j]) 
                    swap(i, j);   
            }
        } 
        analyze.stop();
    }
} 