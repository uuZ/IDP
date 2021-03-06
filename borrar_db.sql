-- Tables are not sorted because: 
-- Circular reference between DEFAULT_SCHEMA.Inmueble and DEFAULT_SCHEMA.Comunidad
-- Try generating Foreign Keys with ALTER TABLE statements.
DROP TABLE DEFAULT_SCHEMA.Carta IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.Concepto IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.LineaFactura IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.ReciboInmueble IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.Propietario IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.DatosBancarios IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.Inmueble IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.NotaInformativa IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.Factura IF EXISTS;
DROP TABLE DEFAULT_SCHEMA.Comunidad IF EXISTS;











ALTER TABLE DEFAULT_SCHEMA.Comunidad
  ADD CONSTRAINT FK_Comunidad_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.Comunidad
  ADD CONSTRAINT FK_Comunidad_2
      FOREIGN KEY (ID_Inmueble_Presidente)
      REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble);

ALTER TABLE DEFAULT_SCHEMA.Factura
  ADD CONSTRAINT FK_Factura_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.Factura
  ADD CONSTRAINT FK_Factura_2
      FOREIGN KEY (ID_NotaInformativa)
      REFERENCES DEFAULT_SCHEMA.NotaInformativa (ID_NotaInformativa);

ALTER TABLE DEFAULT_SCHEMA.NotaInformativa
  ADD CONSTRAINT FK_NotaInformativa_2
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.Inmueble
  ADD CONSTRAINT FK_Inmueble_2
      FOREIGN KEY (ID_DatosBancarios)
      REFERENCES DEFAULT_SCHEMA.DatosBancarios (ID_DatosBancarios);

ALTER TABLE DEFAULT_SCHEMA.Inmueble
  ADD CONSTRAINT FK_Inmueble_3
      FOREIGN KEY (ID_Propietario)
      REFERENCES DEFAULT_SCHEMA.Propietario (ID_Propietario);

ALTER TABLE DEFAULT_SCHEMA.Inmueble
  ADD CONSTRAINT FK_Inmueble_4
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_1
      FOREIGN KEY (ID_NotaInformativa)
      REFERENCES DEFAULT_SCHEMA.NotaInformativa (ID_NotaInformativa)
   ON DELETE CASCADE;

ALTER TABLE DEFAULT_SCHEMA.ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_2
      FOREIGN KEY (ID_Inmueble)
      REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble);

ALTER TABLE DEFAULT_SCHEMA.ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_3
      FOREIGN KEY (ID_Carta)
      REFERENCES DEFAULT_SCHEMA.Carta (ID_Carta);

ALTER TABLE DEFAULT_SCHEMA.LineaFactura
  ADD CONSTRAINT FK_LineaFactura_1
      FOREIGN KEY (NumFactura)
      REFERENCES DEFAULT_SCHEMA.Factura (NumFactura)
   ON DELETE CASCADE;

ALTER TABLE DEFAULT_SCHEMA.LineaFactura
  ADD CONSTRAINT FK_LineaFactura_2
      FOREIGN KEY (ID_Concepto)
      REFERENCES DEFAULT_SCHEMA.Concepto (ID_Concepto);

