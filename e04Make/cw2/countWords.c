#include <stdio.h>
extern int feeCount, fieCount, foeCount, fumCount;
extern int yylex(void);
int main(int argc, char ** argv) {
	while(yylex())
		;
	printf("%d %d %d %d\n", feeCount, fieCount, foeCount, fumCount);
}
