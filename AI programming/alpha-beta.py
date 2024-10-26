# Alpha-Beta Pruning Algorithm

# A simple tree node class to represent the game tree
class TreeNode:
    def __init__(self, value=None, children=None):
        self.value = value  # Node's score, if it's a leaf
        self.children = children if children is not None else []  # Child nodes

# Alpha-Beta Pruning function
def alpha_beta_pruning(node, depth, alpha, beta, maximizing_player):
    # If leaf node or maximum depth reached, return node's value
    if depth == 0 or not node.children:
        return node.value

    if maximizing_player:
        max_eval = float('-inf')
        for child in node.children:
            eval = alpha_beta_pruning(child, depth - 1, alpha, beta, False)
            max_eval = max(max_eval, eval)
            alpha = max(alpha, eval)
            if beta <= alpha:
                break  # Beta cut-off
        return max_eval
    else:
        min_eval = float('inf')
        for child in node.children:
            eval = alpha_beta_pruning(child, depth - 1, alpha, beta, True)
            min_eval = min(min_eval, eval)
            beta = min(beta, eval)
            if beta <= alpha:
                break  # Alpha cut-off
        return min_eval

# Example usage:
# Creating a simple game tree for demonstration
# Level 0
root = TreeNode()

# Level 1
node1 = TreeNode()
node2 = TreeNode()

# Level 2 (leaves)
node1.children = [TreeNode(3), TreeNode(5), TreeNode(6)]
node2.children = [TreeNode(9), TreeNode(1), TreeNode(2)]

root.children = [node1, node2]

# Execute the Alpha-Beta Pruning algorithm
best_value = alpha_beta_pruning(root, depth=2, alpha=float('-inf'), beta=float('inf'), maximizing_player=True)
print("Best value:", best_value)
