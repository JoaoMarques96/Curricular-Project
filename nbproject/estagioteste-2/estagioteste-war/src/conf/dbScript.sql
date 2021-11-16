/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  
 * Created: Jun 29, 2018
 */

CREATE DATABASE estagio;

CREATE table DATA(
   ID SERIAL PRIMARY KEY     NOT NULL,
   CORRENTE1           INT    NOT NULL,
   CORRENTE2           INT    NOT NULL,
   CORRENTE3           INT    NOT NULL,
   TENSAO1           INT    NOT NULL,
   TENSAO2           INT    NOT NULL,
   TENSAO3           INT    NOT NULL,
   DATARECOLHA         timestamp NOT NULL
);

INSERT INTO DATA (CORRENTE1, CORRENTE2, CORRENTE3, TENSAO1, TENSAO2, TENSAO3, DATARECOLHA)
    VALUES ('1', '2', '3', '4', '5', '6', CURRENT_TIMESTAMP);