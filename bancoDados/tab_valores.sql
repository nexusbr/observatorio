-- Table: tab_valores

-- DROP TABLE tab_valores;

CREATE TABLE tab_valores
(
  id serial NOT NULL,
  cod_ibge integer,
  nome_municipio character varying(100),
  ano integer,
  nome character varying(100),
  valor double precision
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tab_valores
  OWNER TO postgres;
