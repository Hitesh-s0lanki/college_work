#The basic syntax for calculating mean in R is −
#mean(x, trim = 0, na.rm = FALSE, ...)
#Following is the description of the parameters used −
#· x is the input vector.
#· trim is used to drop some observations from both end of the sorted vector.
# na.rm is used to remove the missing values from the input vector.


#---------------------Mean-----------------------#

# Create a vector.
x <- c(12,7,3,4.2,18,2,54,-21,8,-5,)

#Find the Mean
result.mean <- mean(x, na.rm = TRUE)
result.mean


#----------------------Median---------------#


# Create a vector.
x <- c(12,7,3,4.2,18,2,54,-21,8,-5,)

# Sort the vector in descending order
sort(x, decreasing = FALSE)

# Compute the length of the vector
length(x)

#Find the Median
result.median <- median(x, na.rm = TRUE)
result.median

#-------------------Mode -------------------#

