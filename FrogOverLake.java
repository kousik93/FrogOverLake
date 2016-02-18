class Solution {
    public int solution(int[] A, int X, int D) {
        // write your code in Java SE 8
        
        //No leaf has fallen
        int time=0; 
        
        // frog is initially at pos 0
        int frogPos=0;   
        
        
        //countArray has position of fallen leaves. If leaf is fallen at pos 2, countArray[2] will be set
        int[] countArray=new int[X+1];
        
        //initialize countArray to 0
        for(int i=0;i<countArray.length;i++)
            countArray[i]=0;
        
        
        
        // IF possible in 1 jump before any leaf has fallen
        if(X<D){
            return 0; 
        }
        
            
            
        //EveryTime leaf Falls, set appropriate countArray value to 1
        
        
        for(int i=0;i<A.length;i++){
        
         if(countArray[A[i]]==0){
          
          countArray[A[i]]=1; //leaf has fallen in that position
            
         }
           
            /*check if frog can make a jump now
              frog has to make the maximum jump possible. So check in reverse
              If leaf exists in pos, make the jump
            */
            
            for(int j=D;j>0;j--)   //D is constant so no n^2 time. It is O(n+D) - Time Complexity fulfilled
            {                  
                
                if(countArray[frogPos+j]==1){
                    
                    frogPos=frogPos+j;  //Frog has jumped to a new pos
                    
                    
                    //If from current position frog can jump to end of lake return the total time taken
                    if(X-frogPos<=D){
                        
                        return time;
                           
                    }
                    
                    break;
                }
            }
            
            
            //One leaf has fallen, increment time. Its done here cos even if frog can cross after first leaf, it should return 0
            
            time++;    
            
            
        }
        
        
        //frog cant cross lake
         return -1;   

        
        
        
    }
}

