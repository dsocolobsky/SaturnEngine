#ifndef PLAYER_H
#define PLAYER_H

#include <SFML/Graphics.hpp>
#include <SFML/Window.hpp>

class Player{
public:
	sf::RectangleShape top;
	sf::RectangleShape left;
	sf::RectangleShape right;
	sf::RectangleShape bottom;

	//top.setPosition(borderSize, 0);

	int x;
	int y;

	Player(int px, int py);
	~Player(void);
};

#endif
