# The purpose of this program is to demonstrate the dictionay operations 

import sys 

def main(): 
	# A. Ways of creation
	line = '-' * 65
	print("A.ways of creation")
	D1 = {"processor" : "core i7", "ram" : 8, "gpu" : "geforce gtx 1080 ti"}
	print("explicit:D1:{}".format(D1))

	D2 = dict(processor='core i7', ram=8, gpu='geforce gtx 1080ti')
	print("constructor:D2:", D2)


	K = ["processor", "ram", "gpu"]
	D3 = dict.fromkeys(K)
	print("fromkeys:D3:", D3)
	D3['processor'] = 'core i7'
	D3['ram'] = 8
	D3['gpu'] = 'geforce gtx 1080 ti'
	print("fromkeys:D3:", D3)

	K = ['processor', 'ram', 'gpu']
	V = ['core i7', 8, 'geforce gtx 1080ti']
	D4 = dict(zip(K, V))
	print("from keys and values:D4:", D4)
	print(line)

	# B.Built in functions with which dictionary works
	D = {"a" : 10, "b" : 20, "c" : 30}
	print("B.Built in functions with which dictionary works")
	print("D:", D)
	print("type(D):", type(D))
	print("id(D):", id(D))
	print("len(D):", len(D))
	print(line)
	
	# C. Built in operators dictionary is compatible with 
	D = {"a" : 1, "b" : 2, "c" : 3}
	# index 
	print("subscript on rhs:D['a']:", D['a'])
	print("subscript on rhs:D['b']:", D['b'])

	# subscript on lhs
	print("subscript on lhs:before edit:D:", D) 
	D['c'] = 300
	print("subscript on lhs:after edit:D:", D)
	D['x'] = 500
	print("subscript on lhs:before add:D:", D)
	print(line)

	print("del statement")
	print("before del:", D)
	del D['a']
	print("after del D['a']:", D)
	del D['x']
	print("after del D['x']:", D)
	print(line)

	# D. Class functions of dictioary 
	# keys, values, items 
	D = {"a" : 10, "b" : 20, "c" : 30, "d" : 40}
	K = D.keys()
	V = D.values()
	I = D.items()
	print("type(K):{}, type(V):{}, type(I):{}".format(type(K), type(V), type(I)))
	print("trvaersing through K:")
	for k in K:
		print("key:", k)
	print("traversing through V:")
	for v in V:
		print("value:", v)
	print("traversing through I")
	for t in I:
		print("key,value tuple:", t)
	print(line)

	print("get method")
	m = D.get('a')
	n = D.get('d')
	k = D.get('p')
	print("m:{} n:{} k:{}".format(m,n,k))
	print(line)

	# pop, popitem, clear
	print("popitem")
	t = D.popitem()
	print("t:", t, "D:", D)

	n = D.pop('b')
	print("n:", n, "D:", D)
	print(line)

	print("clear:D:", D)
	D.clear()
	print("clear:D:", D)
	print(line)

	# update 
	print("update")
	D1 = {"a" : 10, "b" : 20, "c" : 30, "d" : 40, "e" : 50}
	D2 = {"d" : 400, "e" : 500, "f" : 600, "g" : 700, "h" : 800}
	print("update:D1 and D2 before update:D1:{} D2:{}".format(D1, D2))
	D1.update(D2)
	print("update:D1 and D2 after update:D1:{} D2:{}".format(D1, D2))
	print(line)

	# setdefault 
	D = {"a" : 10, "b" : 20, "c" : 30, "d" : 40}
	n = D.setdefault("b")
	print("setdefault:n:", n, "D:", D)
	n = D.setdefault('x')
	print("setdefault:n:{} D:{}".format(n, D))
	n = D.setdefault('y', 500)
	print("setdefault:n:{} D:{}".format(n, D))
	print(line)

	# copy 
	D = {"a" : 10, "b" : 20, "c" : 30}
	print("copy:D:{} id(D):{}".format(D, id(D)))
	D_copy = D.copy()
	print("copy:D_copy:{} id(D_copy):{}".format(D_copy, id(D_copy)))
	print(line)

main()
 