############################ ------------------- STRINGS ------------------- ############################

print("* " * 9 + "*")
intro_msg = "Hi Pravith"
print(intro_msg)
print(len(intro_msg))
print(intro_msg[0]) # indexing starts from beginning
print(intro_msg[-2]) # negative indexing starts form the end
print(intro_msg[0:4]) # startIndex, endIndex -> endIndex is not inclusive
print(intro_msg[1:4])
print(intro_msg[3:]) # if there is no endIndex -> it goes up to the last
print(intro_msg[:6]) # if there is no startIndex -> it considers 0 as the startIndex
print(intro_msg[:]) # no indices at all -> complete string will be printed

# Formatted Strings
first = "Hello"
last = "Pravith"
full_string = f" len({first}): {len(first)} and len({last}): {len(last)} "
print(full_string)

# Built-in methods of strings
print(full_string.upper())
print(full_string.lower())
print(full_string.title()) # all words into camel case
print(full_string.strip()) # removed leading and trailing empty chars

print(full_string.find("len")) # returns the index
print("len" in full_string) # returns the bool value
print("pra" not in full_string)


############################ ------------------- NUMBERS ------------------- ############################

# Arithmetic Operations
print(10 * 3) # multiplication
print(10 ** 3) # power
print(10 / 3) # division with float quotient
print(10 // 3) # division with integer quotient
print(10 % 3) # remainder

# Built in methods
import math

print(round(2.9))
print(abs(-2.9))
print(math.ceil(2.4))

############################ ------------------- TYPE CONVERSION ------------------- ############################
x = input("Enter the value of x: ")
y = int(x) + 1
print(f"x: {x}, y: {y}")

# Falsy values -> 0, "", None
print(bool(0))
print(bool(""))
print(bool(None))

# Strings can have > < = comparisons. The comparisons are done based on the alphabetical order
print("pravith" > "omi")

############################ ------------------- CONDITIONAL STATEMENTS ------------------- ############################
x = int(x)
if y > x:
    print("y > x")
elif y < x:
    print("x > y")
else:
    print("x = y")

# Ternary operator
message = "x > y" if x > y else "x <= y"

# Chain in comparison operator
if 23 <= x < 90: # we are using 23 <=x < 90 instead of 23 <= x and x < 90
    print(x)

############################ ------------------- LOOPING ------------------- ############################

# This will start from 0 to 4
for number in range(5):
    print(number)

# 0 to 4
for number in range(0, 5):
    print(number)

# 0, 2, 4 i.e. 0 to 4 with an increment of 2
for number in range(0, 5, 2):
    print(number)

# ------- for-else
# The for-else construct is only useful when:
#   You have a break statement that might exit early
#   You want different behavior depending on whether the loop completed vs was broken out of
successful = False
for number in range(3):
    print("Attempt")
    if successful:
        print("Successful")
        break
else:
    print("Attempted 3 times and failed") # if break is called from the for loop, this else will never be called. This else will be called only after the loop has been successfully iterated completely

# ------------ iterables
for x in range(5): # Range
    break

for x in "Pravith": # String
    break

for x in [1, 2, 3, 4, 5]: # List
    break

# ------------ while loop
while 10 > 2:
    break

############################ ------------------- FUNCTIONS ------------------- ############################

def greet():
    print("greet method is called")

greet()

############################ ------------------- COLLECTIONS ------------------- ############################

# Python Collections (Arrays)
# There are four collection data types in python:
#       List - ordered, changeable, allows duplicates
#       Tuple - ordered, unchangeable, allows duplicates
#       Set - unordered, unchangeable, unindexed, no duplicates
#       Dictionary - ordered, changeable, no duplicates

# --------- list
names = ['Pravith', 'Avi', 'Goutham']
print(names[1:])

# --------- tuple
names = ('Pravith', 'Avi', 'Goutham')
print(names[1:])

# --------- set
names = {'Pravith', 'Avi', 'Goutham'}
print(names[1:])

# --------- dictionary
thisdict = {
    "brand" : "Ford",
    "model" : "Mustang",
    "year" : 1964
}
print(thisdict)

############################ ------------------- EXCEPTIONAL HANDLING ------------------- ############################

# --------- try, except, else, finally
#   try     - try in java
#   except  - catch in java
#   else    - will be executed always only if try block is successful i.e. no exception occurred
#   finally - finally in java

############################ ------------------- CLASSES ------------------- ############################

class Person:
    def __init__(self, name):
        self.name = name

    def talk(self):
        print("This is ", self.name)
        print(f"This is {self.name}")

person1 = Person("Pravith")
print(person1.name)
person1.talk()

class Car:
    num_people = 0
    driver_name = None

car = Car()
car.num_people = 4
print(car.num_people)

############################ ------------------- INHERITANCE ------------------- ############################

class Mammal:
    def __init__(self):
        self.lays_eggs = False

class Dog(Mammal):
    pass

class Cat(Mammal):
    def __init__(self):
        super().__init__()
        self.is_loyal = True

cat = Cat()
print("cat is loyal" if cat.is_loyal else "cat is not loyal")
print("cat lays eggs" if cat.lays_eggs else "cat does not lay eggs")

############################ ------------------- MODULES & PACKAGES ------------------- ############################
import modules_practice
print(modules_practice.absolute_value(-23))

from modules_practice import add_one
print(add_one(2))
# similar approach for packages as well