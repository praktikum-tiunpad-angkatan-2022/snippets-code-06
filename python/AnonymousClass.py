from traceback import print_tb


class Dog:
    x_value = 10
    def move(self):
        print("The dog walks!")

obj1 = Dog()
obj1.move()
print(type(obj1))
print(obj1.x_value)

obj2 = type('Anonymous Class', (Dog, object), {'move': lambda self: print("The dog flies!")})
obj2.move(obj2)
print(type(obj2))
print(obj2.x_value)