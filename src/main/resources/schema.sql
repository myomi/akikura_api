CREATE TABLE owners (
  id bigserial NOT NULL,
  name character varying(50) NOT NULL,
  unit_rate numeric(3,2) NOT NULL,
  contract_date date NOT NULL,
  PRIMARY KEY (id)
);