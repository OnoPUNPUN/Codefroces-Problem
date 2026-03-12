n = int(input())
count = 1
while n >= 1:
    for i in range(4):
        if i == 3:
            print("PUM", end="")
            count += 1
            break
        else:
            print(f"{count} ", end="")
            count += 1

    n -= 1
    print()
