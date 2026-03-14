def lucky(n):
    while n != 0:
        if n % 10 != 4 and n % 10 != 7:
            return False

        n //= 10

    return True


def almost_lucky(n):
    if lucky(n):
        return True

    i = 2

    while i * i <= n:
        if n % i == 0:
            if lucky(i) or lucky(n // i):
                return True

        i += 1

    return False


n = int(input())

if almost_lucky(n):
    print("YES")
else:
    print("NO")
