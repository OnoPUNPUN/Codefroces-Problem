import sys

input = sys.stdin.read
data = input().split()

index = 0

t = int(data[index])

index += 1

for _ in range(t):
    n = int(data[index])
    index += 1
    a = data[index]
    index += 1
    m = int(data[index])
    index += 1
    b = data[index]
    index += 1
    c = data[index]
    index += 1
    
    s = a
    for i in range(m):
        if c[i] == 'V':
            s = b[i] + s
        else:
            s = s + b[i]
    
    print(s)