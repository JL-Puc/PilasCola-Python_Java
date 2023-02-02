# Implementation of Priority Queue 
# Using PriorityQueue         
from queue import PriorityQueue

cola = PriorityQueue()

cola.put(10)
cola.put(1)
cola.put(0)
cola.put(-5)


while not cola.empty():
        print(cola.get())