This branch shows the broken setup
==================================

Run it via

`$ mvn clean verify -Pcheckerframework`

to ensure the checkerframework profile is used.

Expected output:
```
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /tmp/groovy-spock-checkerframework-test/src/main/java/com/mycompany/app/App.java:[19,13] error: (return.type.incompatible) $$ 2 $$ @FBCBottom @Nullable  null $$ @Initialized @NonNull String $$ ( 363, 367 ) $$ incompatible types in return.
  found   : @FBCBottom @Nullable  null
  required: @Initialized @NonNull String
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.442 s
[INFO] Finished at: 2019-02-04T17:52:00+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.0:compile (default-compile) on project my-app: Compilation failure
[ERROR] /tmp/groovy-spock-checkerframework-test/src/main/java/com/mycompany/app/App.java:[19,13] error: (return.type.incompatible) $$ 2 $$ @FBCBottom @Nullable  null $$ @Initialized @NonNull String $$ ( 363, 367 ) $$ incompatible types in return.
[ERROR]   found   : @FBCBottom @Nullable  null
[ERROR]   required: @Initialized @NonNull String
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

**Actually it is:**
```
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /tmp/groovy-spock-checkerframework-test/src/main/java/com/mycompany/app/App.java: 
1. ERROR in /tmp/groovy-spock-checkerframework-test/src/main/java/com/mycompany/app/App.java (at line 0)
	package com.mycompany.app;
	^
Internal compiler error: java.lang.IllegalArgumentException at com.sun.source.util.JavacTask.instance(JavacTask.java:66)
[ERROR] Found 1 error and 0 warnings.
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.226 s
[INFO] Finished at: 2019-02-04T17:55:47+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.0:compile (default-compile) on project my-app: Compilation failure: Compilation failure: 
[ERROR] /tmp/groovy-spock-checkerframework-test/src/main/java/com/mycompany/app/App.java: 
[ERROR] 1. ERROR in /tmp/groovy-spock-checkerframework-test/src/main/java/com/mycompany/app/App.java (at line 0)
[ERROR] 	package com.mycompany.app;
[ERROR] 	^
[ERROR] Internal compiler error: java.lang.IllegalArgumentException at com.sun.source.util.JavacTask.instance(JavacTask.java:66)
[ERROR] Found 1 error and 0 warnings.
[ERROR] -> [Help 1]
```
