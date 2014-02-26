Comp 124: String Tranformer Lab
====
*Acknowledgement: Paul Cantrell created this lab. Thanks, Paul!*

### Overview

In this lab, you will practice:

  - working with strings,
  - more general object-oriented programmign patterns, and
  - collaboration with many people!

I have created an abstract class called StringTransformer. You will create subclasses of it, which transform text in various amusing ways. 

I’ve created two examples for you: Yeller, and IdentityTransformer. Take a look at those two classes, study how they work, and their junit tests, and try them out by running the TransformerTestUI. 

### Your task

Fork this project!

Once you feel ready to create your own StringTransformer, you will implement your own.
I have provided you with [specifications for a variety of transformers](Specification.md).
Pick an appealing one, implement it, **write tests for it**, and try it in the UI. (I added some magic to the UI to detect all subclasses of StringTransformer. Once you’ve created your transformer, it should show up automatically)

Once you’ve completed your first transformer, commit and push, then send me a pull request. 
Then grab another spec — or make up one of your own!

### Helpful resources

* [http://docs.oracle.com/javase/7/docs/api/java/lang/String.html](String javadoc)
* [http://docs.oracle.com/javase/7/docs/api/java/lang/Character.html](Character javadoc)
