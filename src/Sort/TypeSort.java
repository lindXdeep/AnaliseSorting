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

    INSERTIONGUARDED{
        public String nameSort(){
            return "Insertion Guarded Sorting";
        }
        @Override
        public String toString(){
            return "Insertion Guarded Sorting";
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
    //FIXME: change name on BUBBLE_OPTIM
    BUBBLEOPTIM{
        public String nameSort(){
            return "Bubble Stopped Sorting";
        }
        @Override
        public String toString(){
            return "Bubble Stopped Sorting";
        }
    },
    //FIXME: change name on TWOFORCKED_BUBBLE_MOD
    BUBBLETWOFORCKED{
        public String nameSort(){
            return "Bubble Two-Forcked Sorting";
        }
        @Override
        public String toString(){
            return "Bubble Two-Forcked Sorting";
        }
    },
    //FIXME: change name on SHAKER_BUBBLE_MOD
    BUBBLESHAKER{
        public String nameSort(){
            return "Bubble Shaker Sorting";
        }
        @Override
        public String toString(){
            return "Bubble Shaker Sorting";
        }
    },
    //FIXME: change name on EVEN_ODD
    BUBBLEEVENODD{
        public String nameSort(){
            return "Bubble Even-Odd Sorting";
        }
        @Override
        public String toString(){
            return "Bubble Even-Odd Sorting";
        }
    },
    
    COMB{
        public String nameSort(){
            return "Comb Sorting";
        }
        @Override
        public String toString(){
            return "Comb Sorting";
        }
    },

    SHELL{
        public String nameSort(){
            return "Shell Sorting";
        }
        @Override
        public String toString(){
            return "Shell Sorting";
        }
    },
    
    SHELL_SEDGEWICK{
        public String nameSort(){
            return "Sell_Sedgewick_mod Sorting";
        }
        @Override
        public String toString(){
            return "Sell_Sedgewick_mod Sorting";
        }
    },
    
    QUICK{
        public String nameSort(){
            return "Quick Sorting";
        }
        @Override
        public String toString(){
            return "Quick Sorting";
        }
    },
    
    MERGE{
        public String nameSort(){
            return "Merge Sorting";
        }
        @Override
        public String toString(){
            return "Merge Sorting";
        }
    },

    HEAP{
        public String nameSort(){
            return "Heap Sorting";
        }
        @Override
        public String toString(){
            return "Heap Sorting";
        }
    },

    BUCKET{
        public String nameSort(){
            return "Bucket Sorting";
        }
        @Override
        public String toString(){
            return "Bucket Sorting";
        }
    },

    COUNTING{
        public String nameSort(){
            return "Counting Sorting";
        }
        @Override
        public String toString(){
            return "Counting Sorting";
        }
    };

    public abstract String nameSort();
}



