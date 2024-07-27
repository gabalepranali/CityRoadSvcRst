# CityRoadSvcRst
# Random City Map Generator

## Overview

This Java application generates a random map of 100 cities, each with random latitude and longitude values, and connects them with roads of varying lane types. The map is visualized using the GraphStream library. The application ensures that each city is connected to at least one other city, and the roads follow a specific hierarchy:

- **4 lanes**: National Highways
- **3 lanes**: Inter-State Highways
- **2 lanes**: Highways
- **1 lane**: Main Roads

## Features

- Generates 100 random city names with random latitude and longitude values.
- Establishes connections between cities with different types of roads.
- Visualizes the map with cities as nodes and roads as edges using GraphStream.
- Differentiates roads visually based on the number of lanes.

## Requirements

- Java 8 or higher
- GraphStream Library

## Setup

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/gabalepranali/CityRoadSvcRst/tree/main
    cd random-city-map-generator
    ```

2. **Add GraphStream Library:**
    Download GraphStream from the [official site](https://graphstream-project.org/) and add it to your project libraries.

3. **Compile the Project:**
    ```bash
    javac -cp .:path_to_graphstream.jar *.java
    ```

4. **Run the Application:**
    ```bash
    java -cp .:path_to_graphstream.jar GraphVisualizer
    ```

## Project Structure

- `City.java`: Defines the `City` class with attributes name, latitude, and longitude.
- `Road.java`: Defines the `Road` class with attributes city1, city2, and laneType. Also contains an enumeration `LaneType` for the types of roads.
- `MapGenerator.java`: Contains methods to generate random cities and roads.
- `GraphVisualizer.java`: Contains methods to visualize the map using GraphStream.

## Usage

1. **Generate Random Cities:**
    The `generateRandomCities` method in `MapGenerator` creates a list of 100 cities with random coordinates.

2. **Generate Random Roads:**
    The `generateRandomRoads` method in `MapGenerator` creates connections between the cities with roads of random lane types.

3. **Visualize the Map:**
    The `visualizeMap` method in `GraphVisualizer` visualizes the cities and roads using GraphStream.

## Example Output

Upon running the application, a GraphStream window will open, displaying the map with cities and roads. Roads will be colored based on the number of lanes:
- National Highways (4 lanes): Red
- Inter-State Highways (3 lanes): Orange
- Highways (2 lanes): Yellow
- Main Roads (1 lane): Green
