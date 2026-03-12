s = input()
n = int(input())
m_values = list(map(int, input().split()))

for m in m_values:
    for i in range(m):
        print(s, end="")
    print()
