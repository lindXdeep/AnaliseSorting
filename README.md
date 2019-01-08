# Analyzing sorting Algorithms in multi thread.

  This is my program for analyze a algorithms. For now, this is a beta version. 0.1. Today it can analyze the sorting algorithms in multi-threaded mode. 
  
### In this version it can analyze and get following informations:
  * *Time* - algorithm execution time
  * *Steps* - for how many steps the algorithm was performed.
  * *Cycles* - sum of internal cycles.
  * *Compares* - how many comparisons did the algorithm for solving the sorting problem
  * *Iteration* - total number of iterations was needed to solve the problem
  * *Total operations* - The total sum of all operations, including other comparisons and other calculation steps in of algorithm


### So far I have added several algorithms and you can test them.

* Selection Sorting

* Bucket Sorting 
* Bubble Stopped Sorting 
* Even-Odd Sorting
* Shaker Sorting 
* Two-Forcked Sorting 
* Comb Sorting

* Insertion Sorting
* Insertion with Guarded Sorting 

* Shell Sorting 
* Sell_Sedgewick_mod Sorting  

* Quick Sorting 
* Merge Sorting 
* Heap Sorting 
* Radix Sorting

also you can have added yours :)
  
## Getting Started

  To demonstrate the full functionality of API, so to say "out of the box" -  for that I wrote a file ExampleMain.java. You can run it right away.
  
```
-javac ExampleMain.java 
```
and
```
java ExampleMain
```

### Break down into end to end tests

*First:* your need get random array, for test, and set what num elements you want

```markdown
  private static int[] array = arrayHandle.getRandomIntArray(1000);    
```

*Second:* for what to see the results, at the end of your main function, you need to add

```markdown
  ResultsAnalyze.getInstance().viewResults();
```

all you need is in this function, which is in ExampleMain.java

```markdown
public void sortingAlgorithms()
{
    //... there 
}
```

### For example:

```markdown
public void sortingAlgorithms()
{
    //add array for sorting, onece time!
    SelectSort sortSelect = new SelectSort(array);    
    
    //Add thread
    Sorting name_sorting = sortSelect.getSorting(TypeSort.NAMESORT);
    Thread name_thread = new Thread(name_sorting); 
           name_thread.start(); 
    //...
         
    //... join thread, it is important     
   try {
          name_thread.join();
          //...
        } catch (InterruptedException e) {
            e.getMessage();
        }
        
        //helper class to check right sorting
        arrayHandle.checkSequence(name_sorting);
        
        //if you still want to print the resulting array
        //arrayHandle.printArray(selection);
        
        //view results
       ResultsAnalyze.getInstance().viewResults();
}
```

