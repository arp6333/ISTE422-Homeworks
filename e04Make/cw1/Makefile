countWords : countWords.o lexer.o
	gcc countWords.o lexer.o -lfl -o countWords

countWords.o : countWords.c
	gcc -c countWords.c

lexer.o : lexer.c
	gcc -c lexer.c

lexer.c : lexer.l
	flex -t lexer.l > lexer.c

clean :
	rm *.o lexer.c
