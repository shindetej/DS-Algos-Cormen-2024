"""
@date : 4th May 2024
@aim : to implement Date class with getter and setter

"""
class Date:
    """
    Date class
    __init__() : constructor accepting day month year
    @get_date(): getter for day attribute
    @get_month(): getter for month attribute
    @get_year(): getter for year attribute
    @set_date(): setter for day attribute
    @set_month(): setter for month attribute
    @set_year(): setter for year attribute
    @show():display object content
    """
    def __init__(self,init_day:int,init_month:int,init_year:int):
        if type(init_day) != int or type(init_month) != int or type(init_year) != int :
            raise TypeError("Invalid date type")
        self.day =init_day
        self.month =init_month
        self.year =init_year

    def get_day(self):
        """@getter for day"""
        return self.day

    def get_month(self):
        """@getter for month"""
        return self.month

    def get_year(self):
        """@getter for year"""
        return self.year
    
    def set_day(self,day:int):
        if(type(day) != int):
            raise TypeError("Day must be int")
        self.day = day

    def set_month(self,month:int):
        if(type(month) != int):
            raise TypeError("month must be int")
        self.month = month

    def set_year(self,year:int):
        if(type(year) != int):
            raise TypeError("year must be int")
        self.year = year

    def show(self):
        print(f"Date : {self.day}/{self.month}/{self.year}" )

def main():
    myDate= Date(4,5,2024)

    myDate.show()
    day =  myDate.get_day()
    month = myDate.get_month()
    print(f"GET Day {day} ,\nGET month {month}")

    myDate.set_day(2)
    myDate.set_month(12)
    myDate.show()

main()