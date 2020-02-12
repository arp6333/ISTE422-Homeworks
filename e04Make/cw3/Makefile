VPATH=src include
CPPFLAGS = -I include

countWords : counter.o lexer.o -lfl
countWords.o : counter.h
counter.o : counter.h lexer.h
lexer.o : lexer.h
