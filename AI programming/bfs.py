graph = {
    'A':["B" , "C"],
    'B':["A", 'D'],
    'C':["A", 'D', "G"],
    'D':["B", "C", "E", "F"],
    'E':["D"],
    'F':["D"],
    'G':["C"]
}

def bfs(graph, node, visited):
    queue = [node]
    visited = set(node)
    levels = {}
    levels[node] = 0

    while len(queue) != 0 :
        top = queue.pop(0)
        for e in graph[top] :
            if e not in visited :
                queue.append(e)
                visited.add(e)
                levels[e] = levels[top] + 1

    return levels

ans = bfs(graph, "A", [])
print(ans)