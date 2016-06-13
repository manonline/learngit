CREATE TABLE order(
    id bigint NOT NULL,
    ord_num character varying(255),
    client character varying(20),
    erp_num character varying(20),
    pickup_date timestamp without time zone,
    delivery_date timestamp without time zone,
    act_pickup_date timestamp without time zone,
    act_delivery_date timestamp without time zone,
    shipfrom_loc bigint,
    shipto_loc bigint,
    CONSTRAINT order_pk PRIMARY KEY (id),
    CONSTRAINT order_shipfrom_loc_id_fk 
        FOREIGN KEY (shipfrom_loc)
        REFERENCES location (id) 
        MATCH SIMPLE
        ON UPDATE NO ACTION 
        ON DELETE NO ACTION,
    CONSTRAINT order_shipto_loc_id_fk 
        FOREIGN KEY (shipto_loc)
        REFERENCES location (id) 
        MATCH SIMPLE
        ON UPDATE NO ACTION 
        ON DELETE NO ACTION
)

