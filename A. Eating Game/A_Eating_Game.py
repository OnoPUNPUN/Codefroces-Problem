"""
I have no idea what to do with myself. And while I wait for my epiphany,
I feel the toxins collecting in my body.
"""

t = int(input())

for _ in range(t):
    n = int(input())  # 4
    l = list(map(int, input().split()))  # 1 4 3 4
    m = max(l)  # 4
    c = l.count(m)
    print(c)
