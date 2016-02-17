# FrogOverLake
Frog crosses lake by jumping over falling leaves. This is solution to the modified version where the frog can only take D steps at a time.




My approach is very simple. 


1. Every time a leaf falls, note down the position where it falls.
2. Now check if frog can jump to any leaf.
3. If such a leaf available, make frog jump to farthest leaf. Update frog position
4. Check if frog can cross lake from new position
5. If yes, thats it. Return time. 
6. Increment time by 1 second
7. GoTo 1
8. Return -1


Explaination-

1. Every time leaf falls, set appropriate value in countArray. countArray has position of fallen leaves. If leaf is fallen at pos 2, countArray[2] will be set.

2,3. Check if frog can make a jump. Obviously we want the frog to make the maximum jump possible. 

So if D=3, first check if there is a leaf in FrogPosition+3rd position by checking countArray. 
If yes, Jump
If no, check if there is a leaf in FrogPosition+2nd position by checking countArray.
If yes, Jump
If no, check if there is a leaf in FrogPosition+1st position by checking countArray.
If yes, Jump
If no, make next leef fall (loop)

4,5,6,7. Check if frog can cross lake from new positon

If Yes, Return time
If no, increment time, continue loop

8. Return -1. Frog cant make it




Time Complexity:

O(N+D)

Space Complexity:
O(X)
