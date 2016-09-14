CREATE TABLE source(
    source_id bigint NOT NULL,
    host character varying(255),
    port character varying(20),
    CONSTRAINT source_pk PRIMARY KEY (source_id)
);
