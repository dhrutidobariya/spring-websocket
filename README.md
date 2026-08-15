# Real-Time Chat App

A simple, real-time chat application built using Spring Boot, WebSockets, and Thymeleaf. This project demonstrates how to create a bidirectional communication channel between a web client and a server using the STOMP protocol over WebSockets.

## Features

*   **Real-Time Messaging:** Instantly send and receive messages without page reloads.
*   **WebSocket & STOMP:** Utilizes Spring Boot's WebSocket support with STOMP as the sub-protocol.
*   **Fallback Options:** Uses SockJS to provide WebSocket-like communication for browsers that don't natively support WebSockets.
*   **Simple & Clean UI:** A responsive frontend built with Bootstrap 5.

## Tech Stack

*   **Backend:** Java 21, Spring Boot 3.x, Spring WebMVC, Spring WebSocket
*   **Frontend:** HTML5, Thymeleaf, Bootstrap 5, JavaScript
*   **WebSocket Client Libraries:** SockJS, STOMP.js
*   **Build Tool:** Maven


## How It Works

1.  **Connection:** When the page loads, the frontend uses SockJS and STOMP to connect to the backend WebSocket endpoint (`/chat`).
2.  **Subscription:** The client subscribes to a public topic (`/topic/messages`) to listen for incoming messages.
3.  **Sending Messages:** When a user types a name and message and clicks "Send", the payload is sent to the backend endpoint (`/app/sendMessage`).
4.  **Broadcasting:** The Spring Boot controller receives the message and broadcasts it to all subscribers listening on `/topic/messages`. The UI then dynamically updates to display the new message.
