#ifndef ENGINE_H
#define ENGINE_H

// Engine.h : Class for the Engine that powers the game
#include <SFML/Graphics.hpp>
#include <SFML/Window.hpp>

using namespace sf;

class Engine{
private:
	RenderWindow* window; // Window to render
	bool init(); // Creates the window
	void mainLoop(); // Runs the main loop for the game
	void renderFrame(); // Renders a frame in the game
	void pollInput(); // Checks user input
	void update(); // Updates the screen and entities

public:
	Engine();
	~Engine();

	void go(); // Starts and runs the engine
};

#endif