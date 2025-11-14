t = int(input())

for _ in range(t):
    s = input()
    
    for word in s.split():
        print(word[0], end="")
    print()