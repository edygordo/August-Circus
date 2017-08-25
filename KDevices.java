package Part1;

import java.util.Scanner;

public class KDevices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
			int N = scn.nextInt();
			int K = scn.nextInt();
			int x[] = new int[N+1];
			int y[] = new int[N+1];
			double R[] = new double[N+1];
			int I[] = new int[N+1];
			for(int i=1;i<=N;i++)
				x[i] = scn.nextInt();
			for(int i=1;i<=N;i++)
				y[i] = scn.nextInt();
			for(int i=1;i<=N;i++)
				R[i] = Math.pow((x[i]*x[i] + y[i]*y[i]), 0.5);
			
			for(int i=1;i<=N;i++)
			{
				int count = 0;
				for(int j=1;j<=N;j++)
				{
					if(R[j] <= R[i])
						count++;
				}
				I[i] = count;
			}
			
			int min = Integer.MAX_VALUE; int ans = 0;
			for(int i=1;i<=N;i++)
			{
				if(I[i] >= K && I[i] < min)
					{
					min = I[i];
					ans = (int)Math.ceil(R[i]);
					}
			}
			System.out.println(ans);
	}

	/*
	 5 3
2 3 -1 3 7
3 6 2 5 2
	 */
}
