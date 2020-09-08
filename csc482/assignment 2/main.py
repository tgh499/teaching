number = int(input("Please enter a number: ")
if (number % 1 == 0):
    if (number % 2) == 0:
        print_txt=str(number) + "is an integer and even."
        print(print_txt)
    else:
        print_txt=str(number) + "is an integer and odd."
        print(print_txt)
else:
    print("Given number is a not an integer.")