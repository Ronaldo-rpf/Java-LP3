j = 0
k = 1
for i in range(100):
    fib = j + k
    print(f"J: {j}\tK: {k}\t\t{fib}")
    if fib > 100:
        break
    j = k
    k = fib

