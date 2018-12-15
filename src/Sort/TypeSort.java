package Sort;

public enum TypeSort{
    SELECTION{
        public String nameSort(){
            return "Selection Sorting";
        }
        @Override
        public String toString(){
            return "Selection Sorting";
        }
    },

    INSERTION{
        public String nameSort(){
            return "Insertion Sorting";
        }
        @Override
        public String toString(){
            return "Insertion Sorting";
        }
    },

    BUBBLE{
        public String nameSort(){
            return "Bubble Sorting";
        }
        @Override
        public String toString(){
            return "Bubble Sorting";
        }
    },

    BUBBLETWOFORCKED{
        public String nameSort(){
            return "Bubble Two-Forcked Sorting";
        }
        @Override
        public String toString(){
            return "Bubble Two-Forcked Sorting";
        }
    };

    public abstract String nameSort();
}



