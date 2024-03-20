# Generate some example data
set.seed(123)
x <- 1:100
y <- 2*x + rnorm(100, mean=0, sd = 10)

#plot x and y
plot(x, y, main="Linear Regression", xlab="X", ylab="Y")

#Perform linear Regression
model <- lm(y ~ x)

#Summary of linear regression
summary(model)

abline(model, col="red")