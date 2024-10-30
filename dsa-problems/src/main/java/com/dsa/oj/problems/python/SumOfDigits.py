def sum_of_digits(num):
    su=0
    while num!=0 :
        su+=int(num%10)
        num/=10
    return su    
    
test = int(input())
for _ in range(test):
    # print(int(input()))
    num = int(input())
    ans = sum_of_digits(num)
    print(ans)