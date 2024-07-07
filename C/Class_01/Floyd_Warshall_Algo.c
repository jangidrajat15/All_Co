#include<stdio.h>

#define V 4

#define INF 99999

void printSolution(int dist[][V]);

void floydWarsall(int dist[][V]){
    int i,j,k;
    for(int k=0;k<V;k++){
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(i==k || j==k || i==j){
                    continue;
                }
                if(dist[i][k] + dist[k][j] < dist[i][j]){
                    dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
    }
    printSolution(dist);
}

void printSolution(int dist[][V]){
    printf("Solutions is :\n");

    for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
            if(dist[i][j] == INF){
                printf("%7s","INF");
            }else{
                printf("%7d",dist[i][j]);
            }
        }
        printf("\n");
    }
}


int main(){

    int graph[V][V]={
        {0,5,INF,10},
        {INF,0,3,INF},
        {INF,INF,0,1},
        {INF,INF,INF,0}
    };
    floydWarsall(graph);
    return 0;
}