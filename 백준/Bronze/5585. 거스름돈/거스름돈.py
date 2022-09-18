change = 1000 - int(input())
count = 0
num = [500, 100, 50, 10, 5, 1]

for x in num:
    if change >= x:
        count += change // x
        change %= x
print(count)