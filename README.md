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

### How to use

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
    
    // Set name algorithm and and choose an algorithm from the library
    Sorting name_sorting = sortSelect.getSorting(TypeSort.NAMESORT);
    
    //Add thread
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


## Example output
--------------

get random array of 1000000 elements
```
array = arrayHandle.getRandomIntArray(100000);
```
and run it

```markdown
Thread: Main started . . .

              Comb Sorting complet! 	-> Time: 29 ms.
Sell_Sedgewick_mod Sorting complet! 	-> Time: 49 ms.
             Quick Sorting complet! 	-> Time: 27 ms.
          Counting Sorting complet! 	-> Time: 6 ms.
            Bucket Sorting complet! 	-> Time: 14 ms.
              Heap Sorting complet! 	-> Time: 128 ms.
             Shell Sorting complet! 	-> Time: 2764 ms.
             Merge Sorting complet! 	-> Time: 9229 ms.
 Insertion Guarded Sorting complet! 	-> Time: 11397 ms.
         Insertion Sorting complet! 	-> Time: 13758 ms.
     Bubble Shaker Sorting complet! 	-> Time: 26389 ms.
Bubble Two-Forcked Sorting complet! 	-> Time: 30832 ms.
            Bubble Sorting complet! 	-> Time: 32089 ms.
    Bubble Stopped Sorting complet! 	-> Time: 32330 ms.
   Bubble Even-Odd Sorting complet! 	-> Time: 38368 ms.
         Selection Sorting complet! 	-> Time: 52228 ms.

Result: Selection Sorting -> sorted true
Result: Insertion Sorting -> sorted true
Result: Insertion Guarded Sorting -> sorted true
Result: Bubble Sorting -> sorted true
Result: Bubble Stopped Sorting -> sorted true
Result: Bubble Two-Forcked Sorting -> sorted true
Result: Bubble Shaker Sorting -> sorted true
Result: Bubble Even-Odd Sorting -> sorted true
Result: Comb Sorting -> sorted true
Result: Shell Sorting -> sorted true
Result: Sell_Sedgewick_mod Sorting -> sorted true
Result: Quick Sorting -> sorted true
Result: Merge Sorting -> sorted true
Result: Heap Sorting -> sorted true
Result: Bucket Sorting -> sorted true
Result: Counting Sorting -> sorted true

 - - - - - Detailed analysis of algorithms - - - - - 

Algorithm: ->               Comb Sorting -> Time:    29 ms.
|	 Iterations: 5306056		|	Steps: 48	|	Cycles:   4529726	|	Compares:    776282 	|
Algorithm: -> Sell_Sedgewick_mod Sorting -> Time:    49 ms.
|	 Iterations: 6084648		|	Steps: 3000029	|	Cycles:   3059539	|	Compares:     25080 	|
Algorithm: ->              Quick Sorting -> Time:    27 ms.
|	 Iterations: 2439623		|	Steps: 131903	|	Cycles:   1886026	|	Compares:    421694 	|
Algorithm: ->           Counting Sorting -> Time:     6 ms.
|	 Iterations: 600001		|	Steps: 200001	|	Cycles:    400000	|	Compares:         0 	|
Algorithm: ->             Bucket Sorting -> Time:    14 ms.
|	 Iterations: 400001		|	Steps: 100001	|	Cycles:    300000	|	Compares:         0 	|
Algorithm: ->               Heap Sorting -> Time:   128 ms.
|	 Iterations: 3534682		|	Steps: 150000	|	Cycles:   1709680	|	Compares:   1675002 	|
Algorithm: ->              Shell Sorting -> Time:  2764 ms.
|	 Iterations: 387571669		|	Steps: 200028	|	Cycles: 386311273	|	Compares:   1060368 	|
Algorithm: ->              Merge Sorting -> Time:  9229 ms.
|	 Iterations: 2863292		|	Steps: 199998	|	Cycles:   2663294	|	Compares:         0 	|
Algorithm: ->  Insertion Guarded Sorting -> Time: 11397 ms.
|	 Iterations: 2505121843		|	Steps: 100000	|	Cycles: 2505021843	|	Compares:         0 	|
Algorithm: ->          Insertion Sorting -> Time: 13758 ms.
|	 Iterations: 2505221843		|	Steps: 200000	|	Cycles: 2505021843	|	Compares:         0 	|
Algorithm: ->      Bubble Shaker Sorting -> Time: 26389 ms.
|	 Iterations: 6260216435		|	Steps: 25052	|	Cycles: 3755269540	|	Compares: 2504921843 	|
Algorithm: -> Bubble Two-Forcked Sorting -> Time: 30832 ms.
|	 Iterations: 6574030312		|	Steps: 25051	|	Cycles: 4069083418	|	Compares: 2504921843 	|
Algorithm: ->             Bubble Sorting -> Time: 32089 ms.
|	 Iterations: 7505071843		|	Steps: 100000	|	Cycles: 5000050000	|	Compares: 2504921843 	|
Algorithm: ->     Bubble Stopped Sorting -> Time: 32330 ms.
|	 Iterations: 7504963032		|	Steps: 99534	|	Cycles: 4999941655	|	Compares: 2504921843 	|
Algorithm: ->    Bubble Even-Odd Sorting -> Time: 38368 ms.
|	 Iterations: 12454322349		|	Steps: 99494	|	Cycles: 9949301012	|	Compares: 2504921843 	|
Algorithm: ->          Selection Sorting -> Time: 52228 ms.
|	 Iterations: 6844211245		|	Steps: 100000	|	Cycles: 5000050000	|	Compares: 1844061245 	|

 - - - - - - Total operations - - - - - -
 Algorithm: ->               Comb Sorting  -> 2528942
 Algorithm: -> Sell_Sedgewick_mod Sorting  -> 13603892
 Algorithm: ->              Quick Sorting  -> 1596985
 Algorithm: ->           Counting Sorting  -> 500001
 Algorithm: ->             Bucket Sorting  -> 300001
 Algorithm: ->               Heap Sorting  -> 10204046
 Algorithm: ->              Shell Sorting  -> 1160914943
 Algorithm: ->              Merge Sorting  -> 399998
 Algorithm: ->  Insertion Guarded Sorting  -> 5010330227
 Algorithm: ->          Insertion Sorting  -> 7515265529
 Algorithm: ->      Bubble Shaker Sorting  -> 7514990581
 Algorithm: -> Bubble Two-Forcked Sorting  -> 15652982467
 Algorithm: ->             Bubble Sorting  -> 7515065529
 Algorithm: ->     Bubble Stopped Sorting  -> 7515065063
 Algorithm: ->    Bubble Even-Odd Sorting  -> 7515065023
 Algorithm: ->          Selection Sorting  -> 15532383735


```



