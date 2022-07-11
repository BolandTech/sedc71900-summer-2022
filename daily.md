# Daily Assignments / Notes

## Day 0 - July 9
  * Class intro
  * What is CS?
  * Why teach CS?
  * Difficulties in teaching and learning computer science?
  * Assignment:
    - Have a lesson plan available to share and discuss in class on Monday. If you have taught CS, use a CS lesson. If you have not had to create a lesson plan ever, spend time thinking about what a lesson plan would look like.
## Day 1 - July 12
  * Ped. notes:
    - Focus students away from code when discussing algorithms, program design, etc.
    - Keys to Success (KtS): Scrap paper for diagramming, sketching, tracing
  * What's in a lesson plan
  * Who are lesson plans for
  * What's in a CS lesson
  * Assignment:
    - Create a lesson plan for a concept covered in the pre-work or the first programming course in this program (not data structures).
    - This should be a lesson plan for a High School class, ~45 miutes in length.
    - Assume the appropraite level of prior knowledge.
    - You need not create supplemental materials like sample code, assignments, etc.
    - You could use the template found [here](https://github.com/hunter-teacher-cert/sedc71900-summer-2021/blob/main/resources/lesson_plan_template.md), but you do not need to, or you cna modify it.
    - Use whatever file format that is more convenient for you, but name the file **01_lesson** and put it in your **meth1** folder.
## Day 2 - July 13
  * Ped. notes:
    - Using constants to remvoe "magic values"
    - Binary/Analog feedback devices
  * Lesson plan share out in breakout rooms
  * Assignment:
    - Create a live-code experience by writing code (or using existing code) and annotating it with teacher-facing comments that would explain how to develop that code live.
    - Include questions for students, when to pause, when to ask for predictions, purposeful mistakes, etc.
    - Here's an example for linear search:
      ```
      public int linearSearch(int value){
        //any setup variables?

        //what kind of loop?
        for (int i=0; i < data.size(); i++) {

          //first thing to do in here?
          int e = data.get(i);

          //now what?
          if (e == value)
            return i;

          //anything else to be done?
          }
        //move over to driver, run
        //what else do we need to do?
        return -1;
      }

      ```
## Day 3 - July 14
  * Assignment:
    - Pair program the given functions.
    - Coding car stuck? "Wave your team flag" by posting `:alert:` to main slack.
    - Use KtS liberally. If possible, note pedagogical aspects.
    - Some test calls:

  `barGraphify(nums)` takes a list of non-negative integers and prints a horizontal bar for each index, commensurate with the value at said index. _Exempli gratia,_ for x = {0,1,2,3}:
  ```
  barGraphify(x)
  0:
  1: =
  2: ==
  3: ===
  ```

  and for x = {1,0,3,2}
  ```
  barGraphify(x)
  0: =
  1:
  2: ===
  3: ==
  ```

  `vertBarGraphify(nums)` takes a list of non-negative integers and prints a set of vertical bars visualizing the magnitude of the value at each index. _Exempli gratia,_ for x = {0,1,2,3}:
  ```
  vertBarGraphify(x)
        *
      * *
    * * *
  0 1 2 3
  ```

  and for x = {1,0,3,2}:
  ```
  vertBarGraphify(x) ->

      *
      * *
  *   * *
  0 1 2 3

  ```
## Day 4 - July 15
  * Code tracing & diagramming.
    - Value table for loops and arithmetic expressions.
    - Expression Expansion for recursive functions.
    - Stack Trace
    - Tree diagram for exponential recursive functions
## Day 5 - July 16
  * Introducing a new programming language.
  * NetLogo exploration
  * Assignment
    * Consider a course where NetLogo is used as the primary programming language (or one of them). How would you introduce NetLogo on day 1? Why would you choose to do things that way? Put your answers in a text file (markdown preferred, not required) in your meth1 folder with the name **05_netlogo**.
    * Useful links:
      - NetLogo home page: https://ccl.northwestern.edu/netlogo/
      - Interface guide: https://ccl.northwestern.edu/netlogo/docs/interface.html
      - Programming guide: https://ccl.northwestern.edu/netlogo/docs/programming.html
      - Dictionary (list of all available commands): https://ccl.northwestern.edu/netlogo/docs/dictionary.html
## Day 6 - July 19
  * Intro to NetLogo approach recap & discussion.
  * CS Unplugged Activities.
  * Assignment
    * Develop an unplugged activity for a CS concept that has been covered this summer in either Programming or Data Structures.
    * Describe your concept and activity in a text file (markdown preferred, not required) in your meth1 folder with the name **06_unplugged**.
## Day 7 - July 20
  * Understanding overcomplicating merge.
  * CS Unplugged activity share.
  * Code Scaffolding strategies. What/when to include various types of scaffolding.
    - Skelton code for generalstructure.
    - Helper code unrelated to the main algorithm.
    - Significant test cases.
    - Comments in the form of descriptive file/function/method headers.
    - Comments as subgoal labels.
## Day 8 - July 21
  * Using javadoc
  * Making class resources easily available over the internet.
    * Using a GitHub repository as a main class website.
    * Using GitHub pages to serve an html/css/js website.
## Day 9 - July 22
  * Project eulr problem 5 & efficiency.
  * Assignment
    * Turn your GH page into a portfolio for this program
      - 1 section per class
      - Each section should provide informaiton about some highlight(s) from that course. It could be code snippet(s) that you are proud of, images of diagrams, screenshots, links to other materials you have produced, etc.  There should be enough information about each entry to descibe what it is.
      - The classes so far:
        - Programming in Java
        - Data Structrues
        - Methods I
      - This website should be directly accessible via: https://<USERNAME>.github.io/nycscertweb/
## Day 10 - July 23
  * Community & Collaboration
  - Fostering a sese of community in your classroom/cs program.
  - Using students as Teaching Assitants.
  - Strategies for successful group projects.
  - CS Dojo!
## Day 11 - July 26
  * Using other people's code.
  * Setting a class tone of openness.
  * Normalizing collaboration while also being clear about plagiarism.
  * Writting & describing code submissions as a way to test student understanding.
  * Open source & real world large scale programming collaboration.
  * Using existing libraries case study: trying jsoup.
## Day 12 - July 27
  * Working with jsoup.
  * Problems with using libraries in the classroom.
  * Producing instructions for students on how to start with jsoup.
  * Looking at Ria Galanos' java Twitter API assignment.
  * Assignment:
    * Create a task for students to use the jsoup library. Make sure to include:
      - Instructions for setup.
      - A starter/primer exercise to get things working.
      - A more meanginful task that uses jsoup.
    * You do not need a complete set of working programming files for everything.
    * If your task is detailed in a single file, put it in your meth1 folder using the name **11_jsoup**. Markdown preferred, but not required.
    * If you have multiple files for this task, create a folder in meth1 called **11_jsoup**, and put all the files in there.
## Day 13 - July 28
  * Library plan review
  * Markov chains as a hash table application with mutiple "hooks"
  * Debugging techniques
    * Diagramming
    * Print statements
    * Using provided tools
    * Sleep on it
    * Talk it out / commenting
    * Rubber duck debugging
  * NY State Standards Overview
  * Assignment:
    * Take your lesson plan from way back when (assignment 01), and add the appropraite NY CS standards to it.
## Day 14 - July 29
  * Portfolio work
## Day 15 - July 30
  * Portfolio work
  * Course evaluations

---

## Portfolio assignment due 1 week after last class session.

   Students are to create two detailed lesson plans,
   outlines and supporting materials for computer science. The lesson plans and outlines should include a description of the intended student
   audience and a detailed explanation of how multiple pedagogical techniques can be used in delivering the lesson.

   Each lesson plan should demonstrate different pedogogical techniques, though there may be some overlap.

   For example, if the lesson includes subgoal labeling, the project should include the finished desired code along with the subgoal labels included within.

   The plans can be sequential, or entirely separate.
   The plans must also be aligned to the New York State Standards for Digital Fluency and Computer Science.
   The completed assignment should be such that the portfolio can be given to any computer science teacher and they could deliver the lessons as intended.

---
