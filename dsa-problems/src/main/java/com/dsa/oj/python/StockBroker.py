def employee_mng(current_salary, time):
    #Checking if Completed more than 5 years
    if time > 5 :
        #Increasing current salary by 10%
        increased_salary = current_salary * 11/10
        return increased_salary
    #not more than 5 years return current salary
    return current_salary

current_salary = int(input("Enter Current Salary "))
time = int(input("Enter No. of years he is in company "))
salary = employee_mng(current_salary,time)
print(salary)

# def stock_broker(A) :
#     curr_price = A[0]
#     max_profit = 0
#     for num in A :
#         if curr_price > num :
#             curr_price = num
#         else :
#             max_profit = max(max_profit,num-curr_price)
#     return max_profit

# T = int(input())
# for _ in range(T) :
#     N = int(input())
#     A = list(map(int, input().split()))
#     ans = stock_broker(A)
#     print(ans)            
# A = list(map(int, input().split()))
# S = input()
# for _ in range(A[1]) :
#     print(A)            
    
