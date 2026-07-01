class Animal:
    def __init__(self,name,action):
        self.name = name
        self.action = action
        print(f"{name} {action} in the forest")


    def __del__(self):
        print(f"{self.name} is deleted")


Tiger = Animal("Tiger","walk")
del Tiger


class Maths:
    def __init__(self,num1,num2):
        self.num1 = num1
        self.num2 = num2

    def add(num1,num2):
        return num1+num2







