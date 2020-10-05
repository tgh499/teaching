def add(a,b):
    return(a+b)

def multiply(a, b):
    return (a * b)

def div(a,b):
    if (b != 0):
        return(a / b)
    else:
        return("Can't divide by zero!")

def subtract(a,b):
    return(a-b)

def logarithm(a,b):
    import math
    return(math.log(a,b))