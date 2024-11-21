"""
L3 = L1.concat(L2)
Both L1 and L2 should not undergo any change. 
Instead a new list obbject containing all objects 
in L1 and L2 in order should be returned. 
This function is also known as immutable concat. 
(immutable because input lists do not change)

L1.append(L2)
Unlike concat here a new list is NOT allocated and 
returned. The append functions attaches all nodes 
with data in L2 behind the last node of L1. 

Please note that the append function must take care 
of all of the possibilities 
L1 empty, L2 empty 
L1 not empty, L2 empty 
L1 empty, L2 not empty 
L1 not empty, L2 not empty 


L1.merge(L2)
PRECONDITION: Both L1 and L2 must be sorted lists 
The merge() method does not change anything L1 and L2 
It returns a third list which is a merged version of L1 
and L2. 

Merged Version: All elements in L1 and L2 are present L3 
but in the sorted order. 

Please note that the merge() method must take care 
of all of the possibilities 
L1 empty, L2 empty 
L1 not empty, L2 empty 
L1 empty, L2 not empty 
L1 not empty, L2 not empty 

"""