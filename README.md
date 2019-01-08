# Analyzing sorting Algorithms in multi thread.

  This is my program for analyze a algorithms. For now, this is a beta version. 0.1. Today it can analyze the sorting algorithms in multi-threaded mode. 
  
### In this version it can analyze and get following informations:
  * *Time* - algorithm execution time
  * *Steps* - for how many steps the algorithm was performed.
  * *Cycles* - sum of internal cycles.
  * *Compares* - how many comparisons did the algorithm for solving the sorting problem
  * *Iteration* - total number of iterations was needed to solve the problem
  * *Total operations* - The total sum of all operations, including other comparisons and other calculation steps in of algorithm

  
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

First your need get random array, for test, and set what num elements you want

```markdown
  private static int[] array = arrayHandle.getRandomIntArray(1000);    
```

all you need is in this function, which is in ExampleMain.java

```markdown
public void sortingAlgorithms()
{
    //... there 
}
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/lindXdeep/AnalyzingSorting/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
