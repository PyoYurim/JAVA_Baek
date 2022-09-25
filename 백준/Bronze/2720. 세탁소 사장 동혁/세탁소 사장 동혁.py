n = int(input())
money = [25, 10, 5, 1]
for _ in range(n):
    change = int(input())
    for i in money:
        print(change//i, end=' ')
        change = change % i