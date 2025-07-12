def thirteenAdjecent(filename, length=13):
    with open(filename, 'r') as file:
        digits = ''.join(line.strip() for line in file)

    maxProduct = 0

    for i in range(len(digits) - length + 1):
        chunk = digits[i:i+length]
        if '0' in chunk:
            continue  
        product = 1
        for char in chunk:
            product *= int(char)
        if product > maxProduct:
            maxProduct = product

    return maxProduct

'''
filename = 'PythonProblems\p008.txt'
print(thirteenAdjecent(filename))
'''