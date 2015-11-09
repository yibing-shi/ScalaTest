# Welcome to the Suncorp Scala Developers Test

![Suncorp](http://www.suncorpgroup.com.au/sites/default/files/fm/images/brands/Suncorp_Hor_RGB_sm.jpg)

## Overview

This test will determine your basic Scala skills. In this repo you will find a test class called StringTests. The StringTests have 4 specs which currently fail.
Your mission should you choose to accept it, is to implement the missing functionality for FileUtils. You do not need to modify the FileUtils.scala file to do this.
Feel free to use whatever technique you feel suitable with the following restrictions: 

-	Use Scala, not Java, Not Groovy not Clojure or any other language
-	The only changes to be done under the test folder are to add import statements
-   All code should go into src/main/scala

On Linux and Mac you can execute the tests by running

```
./sbt test
```

The full output should look something like

```
./sbt test
[info] Loading project definition from /Users/jrobinson/dev/github/bigdata-test/project
[info] Set current project to DeveloperTest (in build file:/Users/jrobinson/dev/github/bigdata-test/)
[info] Compiling 2 Scala sources to /Users/jrobinson/dev/github/bigdata-test/target/scala-2.11/test-classes...
[info] StringTests:
[info] String
[info] - should have a row level filter function to support multiple filters
[info] - should be able to be chain line level filters
[info] - should also have a word level filter
[info] word level filters
[info] - should be chained to line level filters
[info] Run completed in 427 milliseconds.
[info] Total number of tests run: 4
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 4, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 4 s, completed 09/11/2015 6:38:22 PM
```
