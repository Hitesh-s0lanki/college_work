graph = {
    'A':["B" , "C"],
    'B':["A", 'D'],
    'C':["A", 'D', "G"],
    'D':["B", "E", "F", "C"],
    'E':["D"],
    'F':["D"],
    'G':["C"]
}

def dfs(graph, node, visited):
    if node not in visited:
        visited.append(node)
        for e in graph[node]:
            dfs(graph, e, visited)
        return visited

ans = dfs(graph, "A", [])
print(ans)