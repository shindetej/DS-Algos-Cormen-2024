Python 3.12.3 (tags/v3.12.3:f6650f9, Apr  9 2024, 14:05:25) [MSC v.1938 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> class Date :
...     pass
... 
>>> type(Date)
<class 'type'>
>>> d1 = Date()
>>> d2 = Date()
>>> type(d1)
<class '__main__.Date'>
>>> id(d1)
2416354523664
>>> type(d2)
<class '__main__.Date'>
>>> id(d2)
2416354525152
>>> d1.__dict__
{}
>>> d2__dict__
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    d2__dict__
NameError: name 'd2__dict__' is not defined
>>> d2.__dict__
{}
>>> class Date:
...     day = 24
...     month = 04
...     
SyntaxError: leading zeros in decimal integer literals are not permitted; use an 0o prefix for octal integers
>>> clase Date:
...     
SyntaxError: invalid syntax
>>> class Date:
...     day =4
...     month = 5
...     year =2024
... 
>>> d1 = Date()
>>> d1.__dict__
{}
>>> Date.__dict__
mappingproxy({'__module__': '__main__', 'day': 4, 'month': 5, 'year': 2024, '__dict__': <attribute '__dict__' of 'Date' objects>, '__weakref__': <attribute '__weakref__' of 'Date' objects>, '__doc__': None})
