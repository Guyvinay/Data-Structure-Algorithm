def square_root(num) :
    if (num == 0 or num == 1) :
            return num
    i = 1
    j = num
    ans = 0
    while(i<=j) :
        mid = int((i+j)/2)
        sq = mid*mid
        if(sq==num): return mid
        elif(sq<num) :
            ans = mid
            i = mid+1
        else : j = mid-1
    return ans    
        
test = int(input())
for _ in range(test) :
    print(square_root(int(input())))