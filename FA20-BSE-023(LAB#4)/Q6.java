import java.util.*;
class Six{

public static void main(String[] arg){

int[][] given={ {34,56,15,33,30},
		{60,35,67,23,54},
		{67,42,75,76,90},
		{56,78,14,79,30}};
int i,j,temp;
for(i=0;i<4;i++){
	temp=0;
	for(j=0;j<5;j++){
	temp=temp+given[i][j];
	}
	System.out.println("The Sum of Row# "+(i+1)+" is "+temp);
	}

System.out.println("\n");
for(i=0;i<5;i++){
	temp=0;
	for(j=0;j<4;j++){
	temp=temp+given[j][i];
	}
	System.out.println("The Sum of Column# "+(i+1)+" is "+temp);
	}
}


}