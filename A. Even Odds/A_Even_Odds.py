n, k = map(int, input().split())


odd_count = int((n + 1) / 2)

if k <= odd_count:
    ans = 2 * k - 1
else:
    idx = k - odd_count
    ans = 2 * idx


print(ans)
