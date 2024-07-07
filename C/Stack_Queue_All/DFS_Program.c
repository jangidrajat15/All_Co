#include <stdio.h>
#include <stdlib.h>

#define MAX_VERTICES 100

struct Graph {
    int visited[MAX_VERTICES];
    int adj[MAX_VERTICES][MAX_VERTICES];
    int numVertices;
};

void addEdge(struct Graph* g, int v, int w) {
    g->adj[v][w] = 1;
}

void DFS(struct Graph* g, int v) {
    g->visited[v] = 1;
    printf("%d ", v);
    
    for (int i = 0; i < g->numVertices; ++i) {
        if (g->adj[v][i] && !g->visited[i])
            DFS(g, i);
    }
}

int main() {
    struct Graph g;
    g.numVertices = 4; // Number of vertices in the graph

    // Initialize visited array
    for (int i = 0; i < MAX_VERTICES; ++i) {
        g.visited[i] = 0;
    }

    // Initialize adjacency matrix to 0
    for (int i = 0; i < MAX_VERTICES; ++i) {
        for (int j = 0; j < MAX_VERTICES; ++j) {
            g.adj[i][j] = 0;
        }
    }

    // Add edges
    addEdge(&g, 0, 1);
    addEdge(&g, 0, 2);
    addEdge(&g, 1, 2);
    addEdge(&g, 2, 0);
    addEdge(&g, 2, 3);
    addEdge(&g, 3, 3);

    printf("Following is Depth First Traversal (starting from vertex 2) \n");
    DFS(&g, 2);

    return 0;
}
