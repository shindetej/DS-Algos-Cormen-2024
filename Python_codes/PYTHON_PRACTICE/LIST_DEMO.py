# The purpose of this program is to illustrate all list operations 

import sys 

def main(): 
	line = "-" * 65
	# Ways of creation 
	# 1 
	print("(A)ways of creation:")
	L = [True, 10, 3.14, (10, 20, 30)]
	print("L:", L)
	print(line)
	# 2
	T = (10, 20, 30)
	s = "Hey!"
	S = {100, 200, 300}
	L1 = list(T)
	L2 = list(s)
	L3 = list(S)
	print("L1:", L1)
	print("L2:", L2)
	print("L3:", L3)
	print(line)
	print("(B):built-in functions")
	L = [10, 20, 30, 40]
	print("print:L:", L)
	print("type(L):", type(L))
	print("id(L):", id(L))
	print("len(L):", len(L))
	print(line)
	# Traversing through string 
	print("traverse : for loop 1")
	L = [True, 10, 3.14, (100, 200, 300)]
	for x in L:
		print(x, type(x))
	print(line)
	print("traverse: for loop 2 : index based")
	for i in range(len(L)):
		print("L[{}]:{} , type(L[{}]:{}".format(i, L[i], i, type(L[i])))
	print(line)
	# (C) Built in operators 
	print("(C):Built in operators")
	# concatenation 
	L1 = [10, 20, 30]
	L2 = [40, 50, 60]
	L3 = L1 + L2
	print("Concatenation:L3 = L1 + L2", L1, L2, L3)
	
	# Multiplication by scalar 
	L = [10, 20, 30]
	L_3 = L * 3
	print("Multiplication by scalar:L_3:", L, L_3)

	# index, range, slice (on RHS) 
	L = [10, 15, 20, 25, 65, 23, 576, 43, 23, 654, 854, 2476, 754, 643, 22]
	print("index range and slice on RHS:")
	print("len(L):", len(L))
	print("index:L[3]:", L[3])
	print("index:L[-3]:", L[-3])
	print("range:L[2:8]:", L[2:8])
	print("range:L[-12:-4]:", L[-12:-4])
	print("slice:L[2:14:3]:", L[2:14:3])
	print("slice:L[12:1:-2]:", L[12:1:-2])
	print("slice:L[::-1]:", L[::-1])
	print(line)
	
	# index, range, slice on LHS 
	print("index, range, slice on LHS:")
	print("index:L[5]:", L[5])
	L[5] = 5000
	print("index:L[5]:", L[5])

	print("range:L[7:11]:", L)
	L[7:11] = (1000, 2000, 3000, 4000)
	print("range:L[7:11]:", L)

	print("slice:L[2:11:3]:", L)	
	L[2:11:3] = "ABC"
	print("slice:L[2:11:3]:", L)
	print(line)

	# in operator 
	L = [100, 200, 300, 400]
	b = (100 in L)
	print("100 in L:", b)
	b = (5000 in L)
	print("5000 in L:", b)
		
	# (D) : class methods
	# index method
	print("(D):Class methods")
	L = [10, 20, 30, 10, 40, 50, 60, 10, 70, 80]
	n = L.index(10)
	print("L.index(10):", n)
	m = L.index(10, n+1)
	print("L.index(10, n+1):", m)
	k = L.index(10, m+1)
	print("L.index(10, m+1):", k)
	n = L.count(10)
	print(line)
	#count method
	print("L.count(10):", L.count(10))
	print(line)
	print("append")
	L = []
	L.append(True)
	print("append:L:", L)
	L.append(100)
	print("append:L:", L)
	T = (100, 200, 300)
	L.append(T)
	print("append:L:", L)
	print(line)

	print("extend")
	L.extend("T")
	print("extend:L:", L)
	s = "SEPARATE"
	L.extend(s)
	print("extend:L:", L)
	print(line)

	print("insert")
	L = [100, 200, 300, 400, 500, 600, 700, 800]
	print("insert:L:", L)
	L.insert(3, 4000)
	print("insert:L:", L)
	L.insert(0, -100)
	print("insert:L", L)
	L.insert(len(L), -200)
	print("insert:L:", L)

	print("insert:L:", L)
	L.insert(L.index(4000), -1)
	print("insert:L:", L)
	L.insert(L.index(4000) + 1, -2)
	print("insert:L:", L)
	print(line)
	print("How to remove elements?")
	# index, range, slice deletion 
	print("del index:L:", L)
	del L[5]
	print("del index:L:", L)
	del L[2 : 7]
	print("del range:L:", L)
	del L[1 : 6 : 2]
	print("del slice:L:", L)
	print(line)
	# data based removal 
	L.remove(500)
	print("remove:L:", L)
	print(line)
	L = [100, 200, 300, 400, 500, 600]
	# pop = remove + return 
	print("pop:initial:L:", L)
	n = L.pop()
	print("pop:L:", L)
	print("n:", n) # expected result 600 with 600 removed
	n = L.pop(2)
	print("pop:L:", L)
	print("n:", n)
	print(line)

	# How to remove all elements from list? 
	print("L:", L, "id(L):", id(L))
	L.clear()
	print("L:", L, "id(L):", id(L))
	print(line)

	# immutable reversal 
	L = [100, 200, 300, 400, 500]
	LR = L[::-1]
	print("L:", L, "LR:", LR)

	print("reverse:L:", L)
	L.reverse()
	print("reverse:L:", L)

	L = [100, 4, 322, 55, 66, 32]
	LS = sorted(L)
	print("L:", L, "LS:", LS)

	L.sort()
	print("sort:L:", L)
	print(line)

	# copy method 
	L = [100, 200, 300, 400]
	print("L:", L, "id(L):", id(L))
	LC = L.copy()
	print("LC:", LC, "id(LC):", id(LC))

	print(line)
main()
