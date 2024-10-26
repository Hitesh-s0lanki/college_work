computer = "0"

def is_win(board):
    # Check Upar Niche
    for i in range(n):
        # row check
        if board[i][0] == board[i][1] == board[i][2] and board[i][0] != "-":
            return 1 if board[i][0] == "X" else -1
        
        # column check
        if board[0][i] == board[1][i] == board[2][i] and board[0][i] != "-":
            return 1 if board[i][0] == "X" else -1

def print_board(board):
    for row in board:
        print(" ".join(row), end="\n")

def put_min_max(board, maximizing):
    # write a code here
    pass


n = 3
board = [["-"]*n for _ in range(n)]
end_game = False

while not end_game:
    print_board(board)

    pos = int(input("Enter the place you want to put X from 0 - 8 "))
    pos_row = int(pos / n)
    pos_col = int(pos % n)

    # Check if the chosen spot is empty
    if board[pos_row][pos_col] == "-":
        board[pos_row][pos_col] = "X"
    else:
        print("This spot is already taken. Try again.")
        continue

    board[pos_row][pos_col] = "X"

    # put_min_max(board)

    end_game = is_win(board)

    if end_game :
        print("Is Win")
        print_board(board)


