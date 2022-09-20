import sys
count = 0
while True:
    L, P, V = map(int, sys.stdin.readline().split())
    if L + P + V == 0:
        break
    day = V // P * L
    day += min(V % P, L)
    count += 1
    print(f'Case {count}:', day)