countWords : countWords.o lexer.o -lfl
	gcc $^ -o $@

countWords.o : countWords.c
	gcc -c $<

lexer.o : lexer.c
	gcc -c $<

lexer.c : lexer.l
	flex -t $< > $@

clean :
	rm *.o lexer.c
