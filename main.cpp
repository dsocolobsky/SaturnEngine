/* 
 * JupiterEngine
 * Basic template for SFML2 game
 * Author: Dylan "dysoco" S.
 * Email: dysoco97@gmail.com
 * Date: 17-09-2012 (DD-MM-YYYY)
*/
// Main.cpp : Runs the main loop for the game

#include <iostream>
#include <SFML/Graphics.hpp>
#include <SFML/Window.hpp>
#include "Engine.h"
using namespace sf;

int main(){
	// We create a new Engine in the Heap
	Engine* engine = new Engine();

	// Try to init the Engine
	try{
		engine->go(); // Allright, run the main loop
	}
	catch(char* e){ // Some error happens
		std::cout << "Can't initialize the engine" << std::endl;
	}	
}