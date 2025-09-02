def check(word):
    upper_case_count = 0
    for char in word:
        if char.isupper():
            upper_case_count += 1
    
    if upper_case_count > len(word) // 2:
        return word.upper()
    else:
        return word.lower()
    

if __name__ == "__main__":
    word = input()
    
    print(check(word))