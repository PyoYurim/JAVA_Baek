A, B = input().split()

Min = int(A.replace('6', '5')) + int(B.replace('6', '5'))
Max = int(A.replace('5', '6')) + int(B.replace('5', '6'))

print(Min, Max)