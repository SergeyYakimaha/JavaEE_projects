-- Table: public.dbuser

-- DROP TABLE public.dbuser;

CREATE TABLE public.dbuser
(
    userid integer NOT NULL,
    username character varying COLLATE pg_catalog."default",
    usertype integer,
    CONSTRAINT dbuser_pkey PRIMARY KEY (userid)
)

TABLESPACE pg_default;

ALTER TABLE public.dbuser
    OWNER to postgres;
		
-- Table: public.doctype

-- DROP TABLE public.doctype;

CREATE TABLE public.doctype
(
    doctypeid integer NOT NULL,
    doctypename character varying COLLATE pg_catalog."default",
    CONSTRAINT doctype_pkey PRIMARY KEY (doctypeid)
)

TABLESPACE pg_default;

ALTER TABLE public.doctype
    OWNER to postgres;

-- Table: public.causestate

-- DROP TABLE public.causestate;

CREATE TABLE public.causestate
(
    causestateid integer NOT NULL,
    causestatename character varying COLLATE pg_catalog."default",
    CONSTRAINT causestate_pkey PRIMARY KEY (causestateid)
)

TABLESPACE pg_default;

ALTER TABLE public.causestate
    OWNER to postgres;

-- Table: public.cause

-- DROP TABLE public.cause;

CREATE TABLE public.cause
(
    causeid integer NOT NULL,
    causestateid integer,
    createuser integer,
    changeuser integer,
    causegnum character varying(255) COLLATE pg_catalog."default",
    arbitratorid integer,
    CONSTRAINT cause_pkey PRIMARY KEY (causeid),
    CONSTRAINT fk_arbitrator FOREIGN KEY (arbitratorid)
        REFERENCES public.dbuser (userid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_causestate FOREIGN KEY (causestateid)
        REFERENCES public.causestate (causestateid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_change_user FOREIGN KEY (changeuser)
        REFERENCES public.dbuser (userid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_create_user FOREIGN KEY (createuser)
        REFERENCES public.dbuser (userid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.cause
    OWNER to postgres;

-- Table: public.document

-- DROP TABLE public.document;

CREATE TABLE public.document
(
    documentid integer NOT NULL,
    causeid integer,
    doctypeid integer,
    CONSTRAINT document_pkey PRIMARY KEY (documentid),
    CONSTRAINT fk_cause FOREIGN KEY (causeid)
        REFERENCES public.cause (causeid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_doctype FOREIGN KEY (doctypeid)
        REFERENCES public.doctype (doctypeid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.document
    OWNER to postgres;		
		