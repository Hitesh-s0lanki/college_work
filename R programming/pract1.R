#pract 1.1-------------------------------------------------------
vector1 <- c(5, 9, 3)
vector2 <- c(10:15)

result <- array(c(vector1, vector2), dim = c(3,3,1))
print(result)

#pract 1.2-----------------------------------------------------
vector1 <- c(5, 9, 3)
vector2 <- c(10:15)

column.names <- c("Col1", "Col2", "Col3")
row.names <- c("Row1", "Row2", "Row3")
matrix.names <- c("Matrix1", "Matrix2")

result <- array(c(vector1, vector2), dim = c(3,3,2),
dimnames = list(row.names, column.names, matrix.names))
print(result)

#------------pract 1.3------------------------------
vector1 <- c(5, 9, 3)
vector2 <- c(10:15)

column.names <- c("Col1", "Col2", "Col3")
row.names <- c("Row1", "Row2", "Row3")
matrix.names <- c("Matrix1", "Matrix2")

result <- array(c(vector1, vector2), dim = c(3,3,2),
dimnames = list(row.names, column.names, matrix.names))

# Print the third row of the second matrix of the array.
print(result[3,,2])
# Print the element in the 1st row and 3rd column of the 1st
matrix.
print(result[1,3,1])
# Print the 2nd Matrix.
print(result[,,2])

#---------pract 1.4 ---------------------
#creating the list
list_data <- list("Red", "Green", c(1:3), TRUE, 51.23)

# Print the third element of the list
print(list_data[[3]])

# Extract the first element from the third element of the list
print(list_data[[3]][1])


#-----------------pract 1.5 ----------------------
list_data <- list(c("Jan","Feb","Mar"), matrix(c(3,9,5,1,-2,8),
nrow = 2),list("green",12.3))

#Name to element in the list
names(list_data) <- c("1st array", "@nd MAtrix", "#rd list")

print(list_data)



#---------------pract 1.6------------------------
#Elements of the list can be accessed by the index of the element in the list. In case
#of named lists it can also be accessed using the names.

# Create a list containing a vector, a matrix and a list.
list_data <- list(c("Jan","Feb","Mar"), matrix(c(3,9,5,1,-2,8),
nrow = 2),
list("green",12.3))
# Give names to the elements in the list.
names(list_data) <- c("1st Quarter", "A_Matrix", "A Inner list")

# Access the first element of the list.
print(list_data[1])
# Access the thrid element. As it is also a list, all its
elements will be printed.
print(list_data[3])
# Access the list element using the name of the element.
print(list_data$`1st Quarter`)


#-----------pract 1.7----------------
#Merging Lists
#You can merge many lists into one list by placing all the lists inside one list() function.

# Create two lists.
list1 <- list(1,2,3)
list2 <- list("Sun","Mon","Tue")

#merge using the function
merged.list <- c(list1, list2)

# Print the merged list.
print(merged.list)


#----------Converting List to Vector----------------
list1 <- list(1:5)
print(list1)
list2 <-list(10:14)
print(list2)

#convert the list to vector
v1 <- unlist(list1)
v2 <- unlist(list2)

print(v1)
print(v2)

# Now add the vectors
result <- v1+v2
print(result)










