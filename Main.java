class Main{
    public static void main(String[] args) {
        
        Analize analize = new Analize();

        analize.start("insertions");        //Начало алгоритма
        for (int i = 0; i < 100; i++) {
            analize.step();          //ш    аг любой операции
            for (int j = 0; j < 500; j++) {
                analize.cycle();        //итерация цикла
                if(i == j )
                    analize.compare();      //операция сравнения  
            }
        }
        analize.stop();         //Конец алгоритма
       
        analize.view();

        
        

    }
}