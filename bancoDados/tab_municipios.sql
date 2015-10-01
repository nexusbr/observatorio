-- Table: tab_municipios

-- DROP TABLE tab_municipios;

CREATE TABLE tab_municipios
(
  id integer NOT NULL DEFAULT nextval('sp_color_gid_seq'::regclass),
  municipio character varying(60),
  cod_ibge character varying(7),
  value double precision,
  colour character varying(6),
  geom geometry(MultiPolygon),
  CONSTRAINT sp_color_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tab_municipios
  OWNER TO postgres;

-- Index: sp_color_geom_idx

-- DROP INDEX sp_color_geom_idx;

CREATE INDEX sp_color_geom_idx
  ON tab_municipios
  USING gist
  (geom);

