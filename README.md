retail microservices project

just a simple project with three services. product, order, and payment.
they all talk to each other.

how to run this thing

    you need docker installed. obviously.

    clone the repo.

    open a terminal in the root folder.

    you need to build the java apps first. go into each service folder (order-service, product-service, payment-service) and run this:
    Bash

mvn clean install

once you've done that for all three, go back to the root and run docker compose:

    docker-compose up --build

    it should all be running now.

testing the endpoints

    order service: http://localhost:8082/orders/some-id

    payment service: http://localhost:8083/payments/some-id

    product service (this one calls the others): http://localhost:8085/products/some-id/order

use postman or whatever to hit these urls. should work.
