def slove(n, k):
    num = n
    while k > 0:
        last_digit = num % 10

        if last_digit > 0:
            num = num - 1
        else:
            num = num / 10
        k -= 1
    return int(num)


n, k = list(map(int, input().split()))
print(slove(n, k))
