def associative_law(a, b, c):
    # Associative Law of Addition
    add1 = (a + b) + c
    add2 = a + (b + c)
    assert add1 == add2, f"Addition law failed: ({a} + {b}) + {c} = {add1}, {a} + ({b} + {c}) = {add2}"
    
    # Associative Law of Multiplication
    mul1 = (a * b) * c
    mul2 = a * (b * c)
    assert mul1 == mul2, f"Multiplication law failed: ({a} * {b}) * {c} = {mul1}, {a} * ({b} * {c}) = {mul2}"
    
    return True

# Example usage
a, b, c = 2, 3, -55
print(f"Associative law test for a={a}, b={b}, c={c}: {associative_law(a, b, c)}")