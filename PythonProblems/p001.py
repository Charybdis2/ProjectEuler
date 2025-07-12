def sumOfMultiples(n, a, b):
  """
  finds the sum of all multiples of a and b below n

  Parameters
  -----------
  n : integer
      The largest number
  a : integer
      multiples of number
  b : integer
      multiples of second number

  Returns 
  ------------
  integer
      the sum of all the multiples a and below n
  """
  total = 0
  for i in range(0, n):
    if i % a == 0 or i % b == 0:
      total += i
  return (total)

print(sumOfMultiples(1000, 3, 5))