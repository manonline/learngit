CREATE TABLE ord_line (
    id bigint NOT NULL,
    order_id bigint NOT NULL,
    line bigint NOT NULL,
    item character varying(20),

    CONSTRAINT ord_line_pk PRIMARY KEY (id),
    CONSTRAINT ord_line_order_fk 
        FOREIGN KEY (order_id)
        REFERENCES _order (id) 
        MATCH SIMPLE
        ON UPDATE NO ACTION 
        ON DELETE NO ACTION
);

