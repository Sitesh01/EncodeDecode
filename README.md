# Base64 Encode/Decode Web Application

This is a simple web application for encoding and decoding text using Base64. It provides a frontend interface to interact with a backend server built with Spring Boot.

## Features

- Encode text to Base64
- Decode Base64 encoded text

## Setup

### Prerequisites

- Java Development Kit (JDK) installed
- Node.js and npm installed

### Backend Setup

1. Clone this repository:

    ```
    git clone <repository_url>
    ```

2. Navigate to the `backend` directory:

    ```
    cd backend
    ```

3. Build and run the Spring Boot application:

    ```
    ./mvnw spring-boot:run
    ```

4. The backend server should now be running on `http://localhost:8080`.

### Frontend Setup

1. Navigate to the `frontend` directory:

    ```
    cd frontend
    ```

2. Install dependencies:

    ```
    npm install
    ```

3. Start the frontend server:

    ```
    npm start
    ```

4. The frontend should now be accessible in your browser at `http://localhost:8080`.

## Usage

1. Enter the text you want to encode/decode in the input field.
2. Click on the "Encode" button to encode the text or the "Decode" button to decode the text.
3. The result will be displayed in the output field.

## Technologies Used

- Backend: Spring Boot (Java)
- Frontend: HTML, CSS, JavaScript

## Contributors

- [Sitesh Kumar Bhandary](https://www.github.com/Sitesh01)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
