-- Table: tab_indicadores

-- DROP TABLE tab_indicadores;

CREATE TABLE tab_indicadores
(
  id serial NOT NULL,
  nome character varying(100),
  descricao character varying(250),
  arquivo character varying(200),
  indicador character(20),
  unidade character varying(10)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tab_indicadores
  OWNER TO postgres;
