﻿

# Vehicle Management System

## Project Description
The **Vehicle Management System** is a Java-based project that demonstrates object-oriented programming principles, including inheritance, abstraction, and interfaces. It simulates a basic hierarchy of vehicles, each with unique properties and behaviors, such as `Car`, `Truck`, and `Motorcycle`. The project uses packages to organize classes and interfaces logically.

## Project Structure
```plaintext
project-root/
├── src/
│   └── com/
│       └── example/
│           └── vehicle/
│               ├── Main.java
│               ├── Vehicle.java
│               ├── Car.java
│               ├── Truck.java
│               ├── Motorcycle.java
│               ├── Engine.java
│               ├── Transmission.java
│               ├── FuelType.java
│               ├── AirConditioning.java
│               ├── SafetyFeatures.java
│               ├── FourWheeler.java
│               ├── TwoWheeler.java
└── README.md
```

## Features
- **Package Structure**: Organized into `com.example.vehicle` for modular code and easy navigation.
- **Classes and Inheritance**: Defines a set of vehicle classes inherited from abstract classes and implements various interfaces.
- **Interfaces and Abstraction**: Demonstrates abstraction with interfaces like `Engine` and `Transmission`.
- **Code Documentation**: Each class and interface includes comments explaining its purpose and functionality.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) version 8 or above
- A command-line interface or an IDE like IntelliJ IDEA or Eclipse

### Installation
1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd project-root
   ```

2. **Directory Structure**  
   Ensure that your directory structure follows the structure under "Project Structure". This includes a `src/` folder that contains your main package `com.example.vehicle`.

3. **Set Up IDE (Optional)**
   - Import the project into your preferred IDE as a Java project.
   - Verify that the `src` folder is recognized as the source root.

### Compilation

#### Using Command Line
1. Open your terminal or command prompt.
2. Navigate to the root directory (`project-root`).
3. Compile all `.java` files:
   ```bash
   javac -d out src/com/example/vehicle/*.java
   ```

   This command compiles the code and outputs `.class` files to the `out` directory.

### Running the Project
To execute the `Main` class and test the vehicle classes:

```bash
java -cp out com.example.vehicle.Main
```

If you encounter errors, verify that you are in the `project-root` directory and that all files have been correctly compiled.

## Detailed Explanation of Packages and Classes

### Package: `com.example.vehicle`
The `com.example.vehicle` package contains all classes and interfaces for the Vehicle Management System.

#### Classes
1. **Vehicle**: Abstract base class for all vehicles, defining shared attributes such as `model` and `brand`.
2. **Car**: Extends `FourWheeler` and implements `AirConditioning` to represent a four-wheeled vehicle with AC functionality.
3. **Truck**: Extends `FourWheeler` and implements `Engine` and `Transmission`, adding specific attributes like `cargoCapacity`.
4. **Motorcycle**: Extends `TwoWheeler` and implements `FuelType`, representing a two-wheeled vehicle.
5. **Main**: Contains the `main` method, which is the entry point of the program and is used to create instances of vehicles, call methods, and display their information.

#### Abstract Classes
1. **FourWheeler**: Extends `Vehicle` and is a base class for four-wheeled vehicles, like `Car` and `Truck`.
2. **TwoWheeler**: Extends `Vehicle` for two-wheeled vehicles, like `Motorcycle`.

#### Interfaces
1. **Engine**: Declares methods to `startEngine`, `stopEngine`, and `checkEngineStatus`.
2. **Transmission**: Defines methods for changing gears and checking transmission.
3. **FuelType**: Specifies methods for fueling-related actions.
4. **AirConditioning**: Declares methods related to air conditioning controls.
5. **SafetyFeatures**: Lists safety-related features like airbags and anti-lock braking system (ABS).

Each interface includes method declarations that classes implement as required.

## Example Usage
Here is a sample usage of the project:

```java
// Main.java

Car = new Car("Model S", "Tesla", 4, "Electric");
Truck = new Truck("F-150", "Ford", 2, 10000);
Motorcycle = new Motorcycle("CB500F", "Honda", true, 500);

car.startEngine();
car.changeGear(2);
car.turnOnAC();

truck.startEngine();
truck.changeGear(3);

motorcycle.startEngine();
motorcycle.refuel();

System.out.println("Car model: " + car.getModel());
System.out.println("Truck cargo capacity: " + truck.getCargoCapacity());
System.out.println("Motorcycle engine capacity: " + motorcycle.getEngineCapacity());
```

## Naming Conventions
- **Packages**: Lowercase, dot-separated. (`com.example.vehicle`)
- **Classes**: PascalCase (e.g., `Vehicle`, `Car`, `Truck`)
- **Interfaces**: PascalCase, typically noun or adjective forms (e.g., `Engine`, `Transmission`)
- **Methods**: camelCase to represent actions (e.g., `startEngine`, `changeGear`).

## Managing Source and Class Files
- **Source Files**: All `.java` files are kept in the `src/` directory under `com/example/vehicle`.
- **Compiled Files**: Output `.class` files are stored in an `out/` directory to separate source and compiled code easily.

### Clean Up (Optional)
To delete compiled files and clean the project:

```bash
rm -rf out/
```

## License
This project is open-source and available under the [MIT License](LICENSE).

## Author
Developed by David Bassey.
