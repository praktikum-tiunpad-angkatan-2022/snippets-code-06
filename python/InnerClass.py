class Penutup:
    x = 10

    def printX(self):
        print(self.x)

    class Dalem:
        y = 20

        def printY(self):
            print(self.y)

obj1 = Penutup()
print(obj1.x)
obj1.printX()
# print(obj1.y) ==> Outer class tidak dapat mengakses propert/method inner class
# obj1.printY

obj2 = Penutup.Dalem()
# print(obj1.x) ==> inner class tidak dapat mengakses properti/method outer class
# obj1.printX()
print(obj2.y) 
obj2.printY()
