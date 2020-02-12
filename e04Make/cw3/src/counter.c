#include <lexer.h>
#include <counter.h>
void counter(int counts[4]) {
	while(yylex())
		;
	counts[0]=feeCount;
	counts[1]=fieCount;
	counts[2]=foeCount;
	counts[3]=fumCount;
}
