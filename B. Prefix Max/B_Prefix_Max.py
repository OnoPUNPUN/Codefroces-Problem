t = int(input())


def value(arr):
    current_max = 0
    ans = 0

    for x in arr:
        current_max = max(current_max, x)
        ans += current_max

    return ans


for _ in range(t):
    n = int(input())

    arr = list(map(int, input().split()))

    original = value(arr[:])

    max_idx = arr.index(max(arr))

    arr[0], arr[max_idx] = arr[max_idx], arr[0]

    swapped = value(arr)

    print(max(original, swapped))
