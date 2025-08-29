
def isGirl(s: str) -> bool:
    
    count = len(set(s))
    return count % 2 == 0
    


if __name__ == "__main__":
    s = input().strip()
    
    if(isGirl(s)):
        print("CHAT WITH HER!")
    else:
        print("IGNORE HIM!")