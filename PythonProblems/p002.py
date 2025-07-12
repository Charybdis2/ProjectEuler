'''
Basic approach
'''
def sumOfEvenFib(limit):
    """
    Calculate the sum of even-valued Fibonacci numbers that do not exceed the given limit.

    Args:
        limit (int): The upper bound for Fibonacci numbers.

    Returns:
        int: The sum of even Fibonacci numbers less than the given limit.
    """
    a, b = 1, 2
    total = 0
    while b < limit:
        if b % 2 == 0:
            total += b
        a, b = b, a + b
    return total

'''
Optimised Version
'''
def sumOfEvenFibOP(limit):
    a, b = 2, 8  
    total = a

    while b < limit:
        total += b
        a, b = b, 4 * b + a  

    return total

