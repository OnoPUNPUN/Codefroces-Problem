import math

def steps(position: int)-> int:
    if position < 0:
        return -1
    if position == 0:
        return 0
    return math.ceil(position / 5)


if __name__ == "__main__":
    p = int(input())
    print(steps(p))