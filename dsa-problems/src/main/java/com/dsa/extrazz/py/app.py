# main.py
import swap_module

# Take user input
a = input("Enter the first value: ")
b = input("Enter the second value: ")

# Call the swap function from the module
a, b = swap_module.swap_values(a, b)

# Display the swapped values
print(f"After swapping:\nFirst value: {a}\nSecond value: {b}")
