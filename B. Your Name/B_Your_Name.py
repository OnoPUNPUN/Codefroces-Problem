"""
I'm not some pure heart chasing after dreams.
I know how difficult it is to live an ordinary life,
having to overlook each other's shortcomings.
"""


def check(str1, str2):
    if sorted(str1) == sorted(str2):
        return "YES"
    else:
        return "NO"


t = int(input())

for _ in range(t):
    n = int(input())

    s, t = input().split(" ")

    print(check(s, t))
