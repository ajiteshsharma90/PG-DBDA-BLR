import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Step 1: Read the CSV file into a DataFrame
df = pd.read_csv(r'D:\PG-DBDA-EC1BLR\Python\day 6 task\data12.csv')  # Replace with the path to your CSV file

# Step 2: Select only numeric columns (excluding non-numeric columns)
numeric_df = df.select_dtypes(include=['float64', 'int64'])

# Step 3: Calculate the correlation matrix
correlation_matrix = numeric_df.corr()

# Step 4: Plot the heatmap of the correlation matrix
plt.figure(figsize=(10, 8))  # Set the size of the plot
sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm', fmt='.2f', linewidths=0.5)
plt.title('Correlation Heatmap')
plt.show()

# Step 5: Find the most correlated columns
correlation_values = correlation_matrix.unstack()  # Flatten the correlation matrix
correlation_values = correlation_values[correlation_values < 1]  # Remove diagonal values (correlation with itself)
most_correlated = correlation_values.idxmax()  # Get the pair of columns with the highest correlation
print(f"The two most correlated columns are: {most_correlated}")

# Step 6: Plot a scatter plot for the two most correlated columns
col1, col2 = most_correlated
plt.scatter(df[col1], df[col2], color='blue', alpha=0.5)
plt.title(f'Scatter Plot: {col1} vs {col2}')
plt.xlabel(col1)
plt.ylabel(col2)
plt.show()
