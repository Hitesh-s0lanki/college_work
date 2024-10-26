def distributive_law(a, b, c):
    left_side = a * (b + c)
    right_side = (a * b) + (a * c)
    
    assert left_side == right_side, f"Distributive law failed: {a} * ({b} + {c}) = {left_side}, ({a} * {b}) + ({a} * {c}) = {right_side}"
    
    return True

# Example usage
a, b, c = 2, 3, 4
print(f"Distributive law test for a={a}, b={b}, c={c}: {distributive_law(a, b, c)}")