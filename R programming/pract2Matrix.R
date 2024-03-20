#matrix(data, nrow, ncol, byrow, dimnames)
# Create a matrix taking a vector of numbers as input

# Elements are arranged sequentially by row.
M <- matrix(c(3:14), nrow=4, byrow=TRUE)
print(M)

# Elements are arranged sequentially by column.
N <- matrix(c(3:14), nrow = 4, byrow = FALSE)
print(N)

# Define the column and row names.
rownames = c("row1", "row2", "row3", "row4")
colnames = c("col1", "col2", "col3")

P <- matrix(c(3:14), nrow = 4, byrow = TRUE, dimnames =
list(rownames, colnames))
print(P)


#---------Accessing Elements of a Matrix-------
# Define the column and row names.
rownames = c("row1", "row2", "row3", "row4")
colnames = c("col1", "col2", "col3")
# Create the matrix.
P <- matrix(c(3:14), nrow = 4, byrow = TRUE, dimnames =
list(rownames, colnames))
# Access the element at 3rd column and 1st row.
print(P[1,3])
# Access the element at 2nd column and 4th row.
print(P[4,2])
# Access only the 2nd row.
print(P[2,])
# Access only the 3rd column.
print(P[,3])


#------------------Matrix Computations------------
# Create two 2x3 matrices.
matrix1 <- matrix(c(3, 9, -1, 4, 2, 6), nrow = 2)
print(matrix1)
matrix2 <- matrix(c(5, 2, 0, 9, 3, 4), nrow = 2)
print(matrix2)

# Add the matrices.
result <- matrix1 + matrix2
cat("Result of addition","\n")
print(result)

# Subtract the matrices
result <- matrix1 - matrix2
cat("Result of subtraction","\n")
print(result)

# Multiply the matrices.
result <- matrix1 * matrix2
cat("Result of multiplication","\n")
print(result)

# Divide the matrices
result <- matrix1 / matrix2
cat("Result of division","\n")
print(result)




#--------Inverse of a matrix---------------------
# Create 3 different vectors
# using combine method.
a1 <- c(3, 2, 5)
a2 <- c(2, 3, 2)
a3 <- c(5, 2, 4)

matrix_1 <- rbind(a1, a2, a3)

print(matrix_1)

T1 <- solve(matrix_1)
print(T1)

# print the inverse of the matrix.
print(inv(T1))



#---------Remove Rows and Columns
thismatrix <- matrix(c("apple", "banana", "cherry", "orange", "mango", "pineapple"), nrow = 3, ncol =2)

#Remove the first row and the first column
thismatrix <- thismatrix[-c(1), -c(1)]

thismatrix


#--------Inverse of a matrix---------------------
# Define a matrix
matrix_A <- matrix(c(4, 7, 2, 6), nrow = 2)

# Print the original matrix
print("Original matrix:")
print(matrix_A)

# Compute the inverse of the matrix
inverse_A <- solve(matrix_A)

# Print the inverse matrix
print("Inverse matrix:")
print(det(matrix_A)*inverse_A)


#------------------Transpose of Matrix----------------
# Define a matrix
matrix_A <- matrix(c(4, 7, 2, 6), nrow = 2, byrow=TRUE)

# Print the original matrix
print("Original matrix:")
print(matrix_A)

# Compute the transpose of the matrix
transpose_A <- t(matrix_A)

# Print the transpose matrix
print("Transpose of the matrix:")
print(transpose_A)




