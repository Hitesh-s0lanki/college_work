# Generate some example data
set.seed(123)
x <- 1:100
y <- 2*x^2 + rnorm(100, mean = 0, sd = 50)

# Define a non-linear model
nonlinear_model <- nls(y ~ a * x^2 + b, start = list(a = 1, b = 1))

# Summary of the non-linear model
summary(nonlinear_model)

# Plot the data and fitted curve
plot(x, y, main = "Non-linear Regression Example", xlab = "X", ylab = "Y")
lines(x, predict(nonlinear_model), col = "red")
