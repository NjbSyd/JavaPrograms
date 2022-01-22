import java.util.*;
class Eight{

public static void main(String[] arg){

int[][] given={ {34,56,15,33,30},
		{60,35,67,23,54},
		{67,42,75,76,90},
		{56,78,14,79,30},
		{45,65,34,23,55}};
int i,j,temp;
for(i=0;i<5;i++){
	temp=given[i][0];
	for(j=0;j<5;j++){
	if(temp<=given[i][j]){

		temp=given[i][j];
		}
	}
	System.out.println("Maximum number in Row# "+(i+1)+" is "+temp);
	}

System.out.println("\n");
for(i=0;i<5;i++){
	temp=given[0][i];
	for(j=0;j<5;j++){
	if(temp>=given[j][i]){
		temp=given[j][i];
		}
	}
	System.out.println("Minimum number in Column# "+(i+1)+" is "+temp);
	}
}


}