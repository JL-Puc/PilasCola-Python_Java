from queue import SimpleQueue

colaSimple = SimpleQueue()

for i in range(1, 6):
    colaSimple.put(i)

print("Size: ", colaSimple.qsize())

while not colaSimple.empty():
    print(colaSimple.get())