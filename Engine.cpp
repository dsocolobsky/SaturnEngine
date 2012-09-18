// Engine.cpp : Methods for Engine class

#include <SFML/Graphics.hpp>
#include <SFML/Window.hpp>
#include "Engine.h"

Engine::Engine(void){
}


Engine::~Engine(void){
}

/* 
 * This method creates the window to render and
 * returns true if it has been created suscesfully,
 * or returns false if it failed.
*/
bool Engine::init(){
	window = new sf::RenderWindow(sf::VideoMode(800,600,32), "Game");

	if(!window)
		return false;

	return true;
}

void Engine::renderFrame(){
}

/* 
 * This method defines checks if an Event
 * has been triggered, and creates a response
*/
void Engine::pollInput(){
	sf::Event theEvent;
	while(window->pollEvent(theEvent)){
		if(theEvent.type == sf::Event::Closed)
			window->close();
	}
}

void Engine::update(){
}

/* 
 * This method checks for input, updates the logic,
 * and renders the game while the window is open
*/
void Engine::mainLoop(){
	while(window->isOpen()){
		pollInput();
		update();
		renderFrame();
	}
}

/* 
 * This public method runs the
 * main loop, used in "main.cpp"
*/
void Engine::go(){
	if(!init())
		throw "Can't initialize the engine";

	mainLoop();
}