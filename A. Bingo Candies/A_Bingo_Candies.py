"""
. . . But I was convinced that I was special, and
I was searching for the thing that set me apart from everyone else . . .
when I look back on it now, I tell myself . .
"""

from collections import Counter


def solve():
    n = int(input())
    g = []
    for _ in range(n):
        r = list(map(int, input().split()))
        g.extend(r)

    counts = Counter(g)
    mc = max(counts.values())

    if mc > n * (n - 1):
        print("NO")
    else:
        print("YES")


t = int(input())
for _ in range(t):
    solve()
