%{
#include <lexer.h>
%}

	int feeCount=0;
	int fieCount=0;
	int foeCount=0;
	int fumCount=0;
%%
fee	feeCount++;
fie	fieCount++;
foe	foeCount++;
fum	fumCount++;
.
\n
