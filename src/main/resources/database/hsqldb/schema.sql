DROP TABLE buses IF EXISTS;

CREATE TABLE buses (
  id INTEGER IDENTITY PRIMARY KEY,
  bus_model VARCHAR(25)
);


CREATE TABLE rides (
  id INTEGER IDENTITY PRIMARY KEY,
  route_id INTEGER NOT NULL,
  ride_time DATE
);

CREATE TABLE routes (
  id INTEGER IDENTITY PRIMARY KEY,
  start_city VARCHAR(30),
  end_city VARCHAR(30)
);




ALTER TABLE rides ADD CONSTRAINT fk_rides_routes FOREIGN KEY (route_id) REFERENCES routes (id);



CREATE TABLE reservations (
  id INTEGER IDENTITY PRIMARY KEY,
  ride_id INTEGER NOT NULL
);

CREATE TABLE clients (
  id INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30)
);

CREATE TABLE client_reservation (
  client_id INTEGER NOT NULL,
  reservation_id INTEGER NOT NULL
);

ALTER TABLE client_reservation ADD CONSTRAINT fk_client_reservation_clients
  FOREIGN KEY (client_id) REFERENCES clients (id);

ALTER TABLE client_reservation ADD CONSTRAINT fk_client_reservation_reservations
  FOREIGN KEY (reservation_id) REFERENCES reservations (id);

