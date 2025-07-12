def thirteenAdjecent(filename, length=13):
    with open(filename, 'r') as file:
        # Join all digits into one continuous string (remove newlines)
        digits = ''.join(line.strip() for line in file)

    max_product = 0

    for i in range(len(digits) - length + 1):
        chunk = digits[i:i+length]
        if '0' in chunk:
            continue  # Skip chunks containing zero (product will be zero)
        product = 1
        for char in chunk:
            product *= int(char)
        if product > max_product:
            max_product = product

    return max_product

# Usage
filename = 'PythonProblems\p008.txt'
print(thirteenAdjecent(filename))