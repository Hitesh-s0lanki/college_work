def moveTower(n, fromPole, toPole, withPole):
    if n >= 1:
        moveTower(n - 1, fromPole, withPole, toPole)
        moveDisk(fromPole, toPole)
        moveTower(n - 1, withPole, toPole, fromPole)

def moveDisk(fromPole, toPole):
    print(f"Move disk 1 from {fromPole} to {toPole}")

moveTower(3, "A", "C", "B")