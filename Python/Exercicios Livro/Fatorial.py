fat = int(input("Fatorial de: "))
if fat == 0 or fat < 0 or fat == 1:
        print(1)
        quit()

num = fat-1
for i in range(100):
    fat *= num
    num -= 1
    if num == 0:
        break

print(f"Fatorial igual a {fat}")