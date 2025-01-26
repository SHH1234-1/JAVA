package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Beakjoon_14225 {
	static int [] arr, answer;
	static int N, max = 0;
	static boolean[] visited;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		visited = new boolean[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0;i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max += arr[i];
		}
		answer = new int [max + 2];
		
		dfs(0,0);
		
		for (int i = 1; i< answer.length; i++) {
			if (answer[i] == 0) {
				System.out.println(i);
				break;
			}
		}
				
	}


	public static void dfs(int depth, int sum) {
		if(depth == N) {
			answer[sum] = 1;
			return;
		}
		dfs(depth + 1, sum + arr[depth]);
		dfs(depth + 1, sum);
		
	}
	
	
	

}
