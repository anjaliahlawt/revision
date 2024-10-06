public class arr9 
{
    
        public void setZeroes(int[][] matrix)
            {
                int n=matrix.length;
                int m=matrix[0].length;
              mat(matrix, n, m);
                for (int i = 0; i < n; i++) 
                {
                    for     (int j = 0; j < m; j++)
                    {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
        
                }
            }
            static void mat(int[][]matrix,int n,int m)
            {
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(matrix[i][j]==0)
                        {
                            markrow(matrix,i,m);
                            markcol(matrix,j,n);
                        }
                    }
                }
                  for (int i = 0; i < n; i++) 
                {
                    for (int j = 0; j < m; j++) 
                    {
                        if (matrix[i][j] == -1) 
                        {
                            matrix[i][j] = 0;
                        }
                    }
                }
        
            
            }
            static void markrow(int[][]matrix,int i,int m)
            {
                for (int j = 0; j < m; j++)
                 {
                    if (matrix[i][j] != 0) 
                    {
                        matrix[i][j] = -1;
                    }
                }
            }
             static void markcol(int[][] matrix, int j, int n) 
              {
                for (int i = 0; i < n; i++)
                 {
                    if (matrix[i][j] != 0) 
                    {
                        matrix[i][j] = -1;
                    }
                }
            }
        }
    

