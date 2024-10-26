def print_board(board):
    print("", end="\n")
    for row in board:
        print("  ".join(row), end="\n")
    print("", end="\n")

def is_valid(board, row, col, n = 4):

    # check Up and Down 
    for i in range(n):
        if board[row][i] == "Q" and i != col:
            return False
        if board[i][col] == "Q" and i != row:
            return False
        
    # diagonal Check
    for i in range(n):
        if row + i < n and col + i < n and board[row + i][col + i] == "Q":
            return False
        if row - i >= 0 and col - i >= 0 and board[row - i][col - i] == 'Q':
            return False
        if row - i >= 0 and col + i < n and board[row - i][col + i] == 'Q':
            return False
        if row + i < n and col - i >= 0 and board[row + i][col - i] == 'Q':
            return False

    return True


def solve(matrix, row, n = 4):
    
    # if the matrix combination exist
    if(row >= len(matrix)):
        print_board(matrix)
        return

    # Do backtracking 
    for col in range(len(matrix[row])):
        if is_valid(matrix, row, col, n):
            matrix[row][col] = "Q"
            solve(matrix, row + 1, n)
            matrix[row][col] = "*"


    

n = 4

matrix = [["*"] * n for _ in range(n)]
solve(matrix, 0, n)