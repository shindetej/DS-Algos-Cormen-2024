class Date:
    # def __init__(self):
    #     print("Date.__init__() : entered : ")
    #     print("Date.__init__() : type(self) : ",type(self))
    #     print("Date.__init__() : id(self) : ",id(self))
    #     print("Date.__init__() : leaving : ")
    def __init__(self):
        print("self.__dict__:",self.__dict__)
        self.day=1
        print("self.__dict__:",self.__dict__)
        self.month=5
        print("self.__dict__:",self.__dict__)
        self.year = 1994
        print("self.__dict__:",self.__dict__)


D1 = Date()        
      

print("D1.__dict__ :",D1.__dict__)

'''
Output :
self.__dict__: {}
self.__dict__: {'day': 1}
self.__dict__: {'day': 1, 'month': 5}
self.__dict__: {'day': 1, 'month': 5, 'year': 1994}
D1.__dict__ : {'day': 1, 'month': 5, 'year': 1994}
'''
