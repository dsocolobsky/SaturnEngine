CXX = g++

all:
	g++ -o Game *.cpp *.h -lsfml-window -lsfml-graphics -lsfml-system -lsfml-audio
clean:
	rm -rf Game