wordDict = ["friends", "Phoebe", "broke", "after", "cafe",
                "sad", "lived", "Monica", "promised", "went", "happily",
                "Joey", "Chandler", "to", "up", "remained", "forever"]

a = 0;
b = len(wordDict)

print(b);   # QUESTION 1, 20 points
i = 0
j = 0

M = [11, 9, 6, 55, 77, 3, 10, 5, 99, 5, 7, 3, 7, 13, 11, 16, 1]
print(len(M)) # QUESTION 2, 20 points

text = ""

while (i <= a):
    text = text + "Ross "
    text = text + "and "
    text = text + "Rachel "
    print(text);  # QUESTION 3, 30 points

    while (j < b):
        if (M[j] % 2 == 0):
            text = text + wordDict[M[j]]
            text = text + " "
        j = j + 1
    i = i + 1
    text = text + "."

print(text)  # QUESTION 4, 30 points