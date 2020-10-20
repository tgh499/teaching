## Assignment 5
### Due: October 26, 2020 by 11:59pm


Write a class in Python named ***YourName_textStat***. The class should have at least one method that counts the number of English words in a given piece of text.


For example, the following text should return 12.


```Markdown
    Hello Universe! How many galaxies do you have? 
    100 billion or a 1000 trillion?
```


Please note that, 100 and 1000 were not counted since they are not words. Please notice the special cases ***Universe!***, ***have?*** and ***trillion?*** might get ignored if you are just using a string method like isalpha(). 


Once you are done, the following code should run and return 12.


```Python
    text = """Hello Universe! How many galaxies do you have? 
    100 billion or a 1000 trillion?"""

    print(Toru_textStat.eng_word_count(text))
```


Submit only one file (.py or .ipynb ) that contains both the class and code that uses that class. I will test your code using the code above after replacing Toru with your name.

### Hints:

* You might need to research a bit about how to get rid of punctuations from strings.