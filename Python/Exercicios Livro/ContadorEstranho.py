cont = 1
num = 1
while cont != 11:
    for i in range(cont):
        print(f"{cont*num:3d} ", end="")
        num += 1
    print()
    num = 1
    cont += 1 