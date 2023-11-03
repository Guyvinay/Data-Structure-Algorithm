def stock_broker(A) :
    curr_price = A[0]
    max_profit = 0
    for num in A :
        if curr_price > num :
            curr_price = num
        else :
            max_profit = max(max_profit,num-curr_price)
    return max_profit

T = int(input())
for _ in range(T) :
    N = int(input())
    A = list(map(int, input().split()))
    ans = stock_broker(A)
    print(ans)            