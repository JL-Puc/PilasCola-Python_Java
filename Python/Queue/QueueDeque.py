
# Python program to
# demonstrate queue implementation
# using collections.dequeue
  
  
from collections import deque
  
# Initializing a queue
cola = deque()
  
# Adding elements to a queue
cola.append('a')
cola.append('b')
cola.append('c')
  
print("Initial queue")
print(cola)
  
# Removing elements from a queue
print("\nElements dequeued from the queue")
print(cola.popleft())
print(cola.popleft())
print(cola.popleft())
  
print("\nQueue after removing elements")
print(cola)
  
# Uncommenting q.popleft()
# will raise an IndexError
# as queue is now empty

print(cola.popleft())