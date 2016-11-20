#include <stdio.h>

int main(void) {
int i,j,n,k,zero=0,one=0;
char a[100];
scanf("%d",&n);
for(i=1;i<=n;i++)
{
	zero=0;
	one=0;
	scanf("%s",&a);
	j=strlen(a);
	for(k=0;k<j;k++)
	{
		if(a[k]=='0')
		zero++;
		else
		one++;
	}
	if((zero>1&&one>1)||(zero>1&&one==0)||(one>1&&zero==0))
		printf("Case #%d: No\n",i);
	else if((one>1&&zero==1)||(one==1&&zero>1)||(one==1&&zero==1)||(one==0&&zero==1)||(one==1&&zero==0))
		printf("Case #%d:Yes\n",i);
}
	return 0;
}
