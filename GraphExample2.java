import java.util.Arrays;
import java.util.Scanner;
public class GraphExample2 {
	int arr[][];
	int V;
	 GraphExample2(int nodes) {
		 V = nodes;
		 arr = new int[nodes][nodes];
	}
	 void addEdge(int v, int u) {
		 arr[v][u] = 1;
		 arr[u][v] = 1;
	 }
	 void printGraph() {
		 for(int i = 0; i<V; i++) {
			 for (int j = 0; j<V; j++){
				System.out.print(arr[i][j] + " "); 
			 	}
			 System.out.println();
			}
	 }
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the number of vertices");
		 int V = in.nextInt();
		 GraphExample2 matrix = new GraphExample2(V);
		 System.out.println("Enter the number of edges");
		 int E = in.nextInt();
		 for(int i = 0; i<E; i++) {
			 System.out.println("Enter the source vertex");
			 int s = in.nextInt();
			 System.out.println("Enter the destination vertex");
			 int d = in.nextInt();
			 
			 matrix.addEdge(s, d);
		 }
		 matrix.printGraph();
	 }
}
