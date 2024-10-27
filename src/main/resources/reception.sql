CREATE DATABASE reception_backend;
USE reception_backend;

INSERT INTO rol (name) VALUES ('USER'),
                              ('COMPANY');

INSERT INTO category (img_url, name) VALUES
                                         ('https://i.postimg.cc/hvRm0WJT/Weddings.jpg', 'Weddings'),
                                         ('https://i.postimg.cc/yYvP7xgG/Corporate-Events.jpg', 'Corporate Events'),
                                         ('https://i.postimg.cc/L4vC8NGv/Social-Events.jpg', 'Social Events'),
                                         ('https://i.postimg.cc/TwvdhR58/Business-Events.jpg', 'Business Events'),
                                         ('https://i.postimg.cc/FFqPS7sJ/Cultural-Events.jpg', 'Cultural Events'),
                                         ('https://i.postimg.cc/vmZYVP3h/Charity-Events.jpg', 'Charity Events'),
                                         ('https://i.postimg.cc/fLTNV5fs/Seasonal-Events.jpg', 'Seasonal Events'),
                                         ('https://i.postimg.cc/dtKjKXsL/Entertainment-Events.jpg', 'Entertainment Events'),
                                         ('https://i.postimg.cc/wTT2XHYL/happy-birthday.jpg', 'Birthday Parties');

#PRIMERO CREAMOS UN USUARIO PARA CON ROL DE COMPANY
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('JoseCarlos@gmail.com', 'Jose Carlos', '123456', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('MariaPerez@gmail.com', 'Maria Perez', 'password123', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('JuanRodriguez@gmail.com', 'Juan Rodriguez', 'securepass', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('CarlosLopez@gmail.com', 'Carlos Lopez', 'pass1234', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('LauraMartinez@gmail.com', 'Laura Martinez', 'secret123', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('PedroSanchez@gmail.com', 'Pedro Sanchez', 'myp@ssword', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('MonicaRamirez@gmail.com', 'Monica Ramirez', 'qwerty123', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('DavidGomez@gmail.com', 'David Gomez', 'password456', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('LuisaHernandez@gmail.com', 'Luisa Hernandez', 'securepass456', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('RaulDiaz@gmail.com', 'Raul Diaz', 'mypassword456', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('SofiaTorres@gmail.com', 'Sofia Torres', 'pass12345', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('EduardoVega@gmail.com', 'Eduardo Vega', 'secret456', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('IsabelCruz@gmail.com', 'Isabel Cruz', 'myp@ssword456', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('HectorMendoza@gmail.com', 'Hector Mendoza', 'qwerty456', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('CarmenCastillo@gmail.com', 'Carmen Castillo', 'password789', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('MarioNunez@gmail.com', 'Mario Nunez', 'securepass789', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('PatriciaFernandez@gmail.com', 'Patricia Fernandez', 'mypassword789', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('GabrielLopez@gmail.com', 'Gabriel Lopez', 'passwordabc', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('DanielaGarcia@gmail.com', 'Daniela Garcia', 'securepassxyz', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('RobertoHerrera@gmail.com', 'Roberto Herrera', 'mypassword321', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('KarenRios@gmail.com', 'Karen Rios', 'pass9876', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('JorgeMartinez@gmail.com', 'Jorge Martinez', 'secret789', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('CristinaAlvarez@gmail.com', 'Cristina Alvarez', 'myp@ssword789', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('AlejandroSoto@gmail.com', 'Alejandro Soto', 'qwerty789', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('SaraPerez@gmail.com', 'Sara Perez', 'password999', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('RicardoFlores@gmail.com', 'Ricardo Flores', 'securepass999', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('MonicaLuna@gmail.com', 'Monica Luna', 'mypassword999', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('FernandoRojas@gmail.com', 'Fernando Rojas', 'pass9999', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('NataliaDiaz@gmail.com', 'Natalia Diaz', 'secret999', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('MartinTorres@gmail.com', 'Martin Torres', 'myp@ssword999', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('LorenaGomez@gmail.com', 'Lorena Gomez', 'qwerty999', 2);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('HugoCruz@gmail.com', 'Hugo Cruz', 'password000', 2);


INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('PGutierrez@gmail.com', 'Pedro Gutierrez', 'securepass000', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('FLopez@gmail.com', 'Fernanda Lopez', 'mypassword000', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('GHernandez@gmail.com', 'Gustavo Hernandez', 'pass0000', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('LMartinez@gmail.com', 'Laura Martinez', 'secret000', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('RGarcia@gmail.com', 'Ricardo Garcia', 'myp@ssword000', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('CPerez@gmail.com', 'Carmen Perez', 'qwerty000', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('JGomez@gmail.com', 'Jorge Gomez', 'securepass111', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('VDiaz@gmail.com', 'Valeria Diaz', 'mypassword111', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('MRamirez@gmail.com', 'Mariano Ramirez', 'pass1111', 1);
INSERT INTO tbl_user (email, full_name, password, rol_id) VALUES ('MSoto@gmail.com', 'Monica Soto', 'password111', 1);

INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Huancayo', 'Pedro', 'Gutierrez', 912345679, 33);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Chanchamayo', 'Fernanda', 'Lopez', 934567891, 34);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Jauja', 'Gustavo', 'Hernandez', 956789013, 35);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Tarma', 'Laura', 'Martinez', 978901235, 36);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Chupaca', 'Ricardo', 'Garcia', 990123457, 37);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Junin', 'Carmen', 'Perez', 901234569, 38);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Chanchamayo', 'Jorge', 'Gomez', 923456791, 39);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Concepcion', 'Valeria', 'Diaz', 945678913, 40);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Satipo', 'Mariano', 'Ramirez', 967890135, 41);
INSERT INTO client (address, first_name, last_name, phone_number, user_id) VALUES ('Huancayo', 'Monica', 'Soto', 989012357, 42);


INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('lacabana@gmail.com', 'Av. 9 de Diciembre - Tarma, Junín', 'Eventos La Cabaña', 987654321, 1);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('chichos@gmail.com', 'Av. Los Libertadores - Tarma, Junín', 'Chichos Eventos', 987654322, 2);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('calle4@gmail.com', 'Jr. Junín - Tarma, Junín', 'Calle 4', 987654323, 3);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('maranata@gmail.com', 'Jr. Ayacucho - Tarma, Junín', 'Maranata', 987654324, 4);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('ingenio@gmail.com', 'Av. Túpac Amaru - Tarma, Junín', 'Ingenio Eventos', 987654325, 5);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('ucushpa@gmail.com', 'Av. Circunvalación - Tarma, Junín', 'Ucushpa Eventos', 987654326, 6);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('elportal@gmail.com', 'Jr. San Martín - Tarma, Junín', 'El Portsl', 987654327, 7);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('elgatopardo@gmail.com', 'Av. Bolognesi - Tarma, Junín', 'El Gato Pardo Eventos', 987654328, 8);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('jeranco@gmail.com', 'Av. Dos de Mayo - Tarma, Junín', 'Jeranco Celebraciones', 987654329, 9);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('rossy@gmail.com', 'Jr. Lima - Tarma, Junín', 'Rossy Eventos', 987654330, 10);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('recepcionescruz@gmail.com', 'Av. Huayna Cápac - Tarma, Junín', 'Recepciones Cruz Eventos', 987654331, 11);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('muquis@gmail.com', 'Av. Huancavelica - Tarma, Junín', 'Muquis Celebraciones', 987654332, 12);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('mantra@gmail.com', 'Jr. Puno - Tarma, Junín', 'Mantra Eventos', 987654333, 13);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('kapital@gmail.com', 'Jr. Cusco - Tarma, Junín', 'Kapital Eventos', 987654334, 14);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('tajmajal@gmail.com', 'Av. Huancayo - Huancayo, Junín', 'TajMajal Eventos', 987654335, 15);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('mrjuerga@gmail.com', 'Jr. Ayacucho - Huancayo, Junín', 'MrJuerga Fiestas', 987654336, 16);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('mrrumba@gmail.com', 'Av. Bolognesi - Huancayo, Junín', 'Mr Rumba Eventos', 987654337, 17);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('hollywood@gmail.com', 'Jr. Lima - Huancayo, Junín', 'Hollywood Eventos', 987654338, 18);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('garage@gmail.com', 'Av. Dos de Mayo - Huancayo, Junín', 'Garage Celebraciones', 987654339, 19);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('bunker@gmail.com', 'Jr. Cusco - Huancayo, Junín', 'Bunker Eventos', 987654340, 20);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('tucasacelebraciones@gmail.com', 'Jr. Ayacucho - Tarma, Junín', 'Tu Casa Celebraciones', 987654341, 21);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('solradiante@gmail.com', 'Av. Los Libertadores - Tarma, Junín', 'Sol Radiante Eventos', 987654342, 22);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('happyhour@gmail.com', 'Jr. Junín - Tarma, Junín', 'Happy Hour Eventos', 987654343, 23);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('estilofresco@gmail.com', 'Av. Túpac Amaru - Tarma, Junín', 'Estilo Fresco Celebraciones', 987654344, 24);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('bellezaysalud@gmail.com', 'Av. Circunvalación - Tarma, Junín', 'Belleza y Salud Eventos', 987654345, 25);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('tucasita@gmail.com', 'Jr. San Martín - Tarma, Junín', 'Tu Casita Eventos', 987654346, 26);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('elrinconcelebraciones@gmail.com', 'Av. Bolognesi - Tarma, Junín', 'El Rincón Celebraciones', 987654347, 27);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('pequenoeden@gmail.com', 'Av. Dos de Mayo - Tarma, Junín', 'Pequeño Edén Eventos', 987654348, 28);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('armoniaysalud@gmail.com', 'Jr. Lima - Huancayo, Junín', 'Armonía y Salud Eventos', 987654349, 29);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('elmiradoreventos@gmail.com', 'Av. Dos de Mayo - Huancayo, Junín', 'El Mirador Eventos', 987654350, 30);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('clubnocturno@gmail.com', 'Jr. Cusco - Huancayo, Junín', 'Club Nocturno Eventos', 987654351, 31);
INSERT INTO company (email, location, name, phone_number, user_id) VALUES ('tardesdepasion@gmail.com', 'Av. Huancavelica - Tarma, Junín', 'Tardes de Pasión Eventos', 987654352, 32);


TRUNCATE  TABLE  company;
#ESTABLECIENDO CATEGORIAS AL COMPANY

-- Asignar categorías a las empresas del 1 al 32
INSERT INTO company_category_map (company_id, category_id) VALUES
(1, 1), (1, 2), (1, 3),
(2, 4), (2, 5), (2, 6),
(3, 7), (3, 8), (3, 9),
(4, 1), (4, 2), (4, 3),
(5, 4), (5, 5), (5, 6),
(6, 7), (6, 8), (6, 9),
(7, 1), (7, 2), (7, 3),
(8, 4), (8, 5), (8, 6),
(9, 7), (9, 8), (9, 9),
(10, 1), (10, 2), (10, 3),
(11, 4), (11, 5), (11, 6),
(12, 7), (12, 8), (12, 9),
(13, 1), (13, 2), (13, 3),
(14, 4), (14, 5), (14, 6),
(15, 7), (15, 8), (15, 9),
(16, 1), (16, 2), (16, 3),
(17, 4), (17, 5), (17, 6),
(18, 7), (18, 8), (18, 9),
(19, 1), (19, 2), (19, 3),
(20, 4), (20, 5), (20, 6),
(21, 7), (21, 8), (21, 9),
(22, 1), (22, 2), (22, 3),
(23, 4), (23, 5), (23, 6),
(24, 7), (24, 8), (24, 9),
(25, 1), (25, 2), (25, 3),
(26, 4), (26, 5), (26, 6),
(27, 7), (27, 8), (27, 9),
(28, 1), (28, 2), (28, 3),
(29, 4), (29, 5), (29, 6),
(30, 7), (30, 8), (30, 9),
(31, 1), (31, 2), (31, 3),
(32, 4), (32, 5), (32, 6);



# AÑADIMOS IMAGENES AL COMPANY
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/3RQ3c28d/company1-1.jpg', 1);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/d1RJPD3n/company1-2.jpg', 1);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/MHWqWxjw/company1-3.jpg', 1);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/3RQ3c28d/company1-1.jpg', 2);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/d1RJPD3n/company1-2.jpg', 2);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/MHWqWxjw/company1-3.jpg', 2);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/x1WzbsjC/1.jpg', 3);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/5NdTnJPq/1.webp', 3);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/vHx9HFMj/12.jpg', 3);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/59Q2kDvN/1.jpg', 4);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/3wRZM2gh/2.jpg', 4);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/1XJtZV0x/3.webp', 4);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/m21jQj6J/1.jpg', 5);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/yd59x4Bd/2.jpg', 5);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/CKx81wZG/3.jpg', 5);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/2yZpZH8z/1.jpg', 6);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/tC6Zqpbc/2.jpg', 6);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/dVK7DptV/3.jpg', 6);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/hGcCnKJ8/1.jpg', 7);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/5tD6v2wL/2.jpg', 7);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/rm6wsYk9/3.jpg', 7);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/VNB1Dst3/1.jpg', 8);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/k5X9Y3yG/2.webp', 8);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/PJbRkNXj/3.jpg',8);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/mkCCX6YX/Receoci-n-1.jpg', 9);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/3JzzDyN3/Receoci-n-2.jpg', 9);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/281P6dzH/Receoci-n-3.jpg', 9);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/qRk7VDHD/Receoci-n-4.jpg', 10);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/3rfxVZS9/Receoci-n-5.jpg', 10);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/wMR8SDMb/Receoci-n-6.jpg', 10);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/pd7p8Yws/Receoci-n-7.jpg', 11);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/gJZrKLdm/Receoci-n-8.jpg', 11);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/GtP2W0Hf/Receoci-n-9.jpg',11);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/Wzm6bb96/Receoci-n-10.jpg', 12);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/CMb44mFB/Receoci-n-11.jpg', 12);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/zvkKY2Bx/Receoci-n-12.jpg', 12);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/MKqPghHJ/Receoci-n-13.jpg', 13);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/sxymdhV4/Receoci-n-14.jpg', 13);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/65WcMnb9/Receoci-n-15.jpg', 13);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/QC2Xdhym/Receoci-n-16.jpg', 14);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/m29L61P5/Receoci-n-17.jpg', 14);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/YCfptcfN/Receoci-n-18.jpg', 14);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/fR2MVcpk/Receoci-n-19.jpg', 15);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/Qt5DYRtW/Receoci-n-20.jpg', 15);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/ZnSSGVBs/Receoci-n-21.jpg', 15);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/7YJ3s9Mr/Receoci-n-22.jpg', 16);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/q716M6XG/Receoci-n-23.jpg', 16);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/BQ2pps0G/Receoci-n-24.jpg', 16);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/bNpFSd7t/Receoci-n-25.jpg', 17);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/htGyM6P4/Receoci-n-26.jpg', 17);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/KY60GY74/Receoci-n-27.jpg', 17);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/cChCmXdY/Receoci-n-28.jpg', 18);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/xTjcCDPP/Receoci-n-29.jpg', 18);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/8zjcRR9J/Receoci-n-30.jpg', 18);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/HsjdRp2F/Receoci-n-31.jpg', 19);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/pLFxVq3Z/Receoci-n-32.jpg', 19);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/qBDd8PTw/Receoci-n-33.jpg', 19);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/gjnQS0WD/Receoci-n-34.jpg', 20);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/1X2TLZRZ/Receoci-n-35.jpg', 20);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/X7Bt9XxN/Receoci-n-36.jpg', 20);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/kXtXDJbK/Receoci-n-37.jpg', 21);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/sgYj9TK2/Receoci-n-38.jpg', 21);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/KYQmC46S/Receoci-n-39.jpg', 21);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/xCwHNstP/Receoci-n-40.jpg', 22);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/y6R0CH8p/Receoci-n-41.jpg', 22);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/KvZhhm5m/Receoci-n-42.jpg', 22);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/fb6k8Vmz/Receoci-n-43.jpg', 23);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/CMCd4L10/Receoci-n-44.jpg', 23);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/jS1jjD8H/Receoci-n-45.jpg', 23);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/cJQMMGtb/Receoci-n-46.jpg', 24);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/tJmhCX8Y/Receoci-n-47.jpg', 24);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/WbhGYkJr/Receoci-n-48.jpg', 24);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/jSYD6w6R/Receoci-n-49.jpg', 25);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/ZKHqN7qx/Receoci-n-50.jpg', 25);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/FRVM668P/Receoci-n-51.jpg', 25);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/CMt7g70J/Receoci-n-52.jpg', 26);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/SsP6mSBj/Receoci-n-53.jpg', 26);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/14hDNW5Q/Receoci-n-54.jpg', 26);



INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/v8CnX7pV/pexels-agung-pandit-wiguna-2788488-2.jpg', 27);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/zB0jVLBk/pexels-fu-zhichao-587741.jpg', 27);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/SsBWXW4C/pexels-jonathan-borba-12876490-2.jpg', 27);


INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/JhLpsC1P/pexels-jonathan-borba-12846017.jpg', 28);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/MGgGZm2S/pexels-matheus-bertelli-17315423.jpg', 28);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/Zn4vZxpq/pexels-matheus-bertelli-17206159.jpg', 28);


INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/mDXW2bFF/pexels-matheus-bertelli-16120263.jpg', 29);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/1tsPWCDJ/pexels-matheus-bertelli-17206068.jpg', 29);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/5NYcmdZf/pexels-matheus-bertelli-16120237.jpg', 29);


INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/CxxZ5Twg/pexels-jonathan-borba-12846017.jpg', 30);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/XvD1mbY7/pexels-tae-fuller-1616113.jpg', 30);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/vHqPcy57/pexels-jonathan-borba-9703865.jpg', 30);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/yNdYBrDx/pexels-matheus-bertelli-17315456.jpg', 31);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/fbJZ1tP0/pexels-antony-trivet-15110432.jpg', 31);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/ncpxpw5x/pexels-matheus-bertelli-17315434.jpg', 31);

INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/Gtz5cz83/pexels-matheus-bertelli-16120259.jpg', 32);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/C12RWpJw/pexels-matheus-bertelli-17315415.jpg', 32);
INSERT INTO images (url_image, company_id) VALUES ('https://i.postimg.cc/PrXq2xd1/pexels-matheus-bertelli-16120263-1.jpg',32);

#INSERTAMOS COMENTARIOS PARA ALGUNOS COMPANIES
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES ('2023-10-05', 'Excellent venue for receptions', 5, 4, 2, 3, 3, 1, 1, 1),
       ('2023-10-05', 'Good atmosphere', 2, 2, 4, 1, 5, 1, 1, 5),
       ('2023-10-05', 'I recommend this place I liked it a lot', 5, 4, 3, 4, 4, 1, 1, 7);

-- Compañía 1
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-11-15', 'Great service and beautiful venue', 5, 5, 4, 5, 4, 1, 1, 7),
    ('2023-11-16', 'The location was perfect for our event', 4, 4, 4, 5, 5, 1, 1, 9),
    ('2023-11-17', 'Excellent experience overall', 5, 5, 5, 5, 5, 1, 1, 10);

-- Compañía 2
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-11-18', 'Average services, could be better', 4, 3, 4, 3, 3, 1, 2, 10),
    ('2023-11-19', 'Fair prices for the services offered', 4, 5, 4, 4, 5, 1, 2, 4),
    ('2023-11-20', 'Overall satisfied with the venue', 4, 5, 4, 5, 4, 1, 2, 6);

-- Compañía 3
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-11-21', 'Not up to expectations, needs improvement', 2, 1, 1, 2, 2, 0, 3, 7),
    ('2023-11-22', 'Reasonable services for the price', 3, 4, 4, 3, 4, 1, 3, 8),
    ('2023-11-23', 'Pleased with the location and services', 5, 5, 4, 5, 5, 1, 3, 6);

-- Compañía 4
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-11-21', 'Not up to expectations, needs improvement', 2, 1, 2, 1, 2, 0, 4, 2),
    ('2023-11-22', 'Reasonable services for the price', 3, 4, 4, 3, 4, 1, 4, 4),
    ('2023-11-23', 'Pleased with the location and services', 5, 5, 4, 5, 5, 1, 4, 3);

-- Compañía 5
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-11-21', 'Not up to expectations, needs improvement', 2, 1, 1, 1, 2, 0, 5, 7),
    ('2023-11-22', 'Reasonable services for the price', 3, 4, 4, 3, 4, 1, 5, 5),
    ('2023-11-23', 'Pleased with the location and services', 5, 5, 4, 5, 5, 1, 5, 6);

-- Compañía 6
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-11-21', 'Not up to expectations, needs improvement', 2, 1, 2, 2, 2, 0, 3, 2),
    ('2023-11-22', 'Reasonable services for the price', 3, 4, 4, 3, 4, 1, 3, 1),
    ('2023-11-23', 'Pleased with the location and services', 5, 5, 4, 5, 5, 1, 3, 4);

-- Compañía 7
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2024-01-14', 'Adequate flexibility in services', 4, 4, 3, 4, 4, 1, 7, 4),
    ('2024-01-15', 'Good level of professionalism', 4, 5, 4, 4, 5, 1, 7, 8),
    ('2024-01-16', 'Reasonable quality for the price', 3, 4, 3, 3, 4, 0, 7, 9);

-- Compañía 8
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2024-01-17', 'Could improve service flexibility', 3, 3, 3, 3, 3, 0, 8, 9),
    ('2024-01-18', 'Decent level of professionalism', 4, 4, 4, 4, 4, 1, 8, 10),
    ('2024-01-19', 'Fair quality for the offered price', 3, 3, 3, 3, 3, 0, 8, 4);

-- Compañía 9
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-11-30', 'Service flexibility needs enhancement', 3, 5, 4, 3, 5, 1, 9, 1),
    ('2023-12-01', 'Professionality could be improved', 3, 5, 5, 3, 2, 1, 9, 4),
    ('2023-12-02', 'Average quality for the price', 3, 2, 3, 1, 3, 0, 9, 7);

-- Compañía 10
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-12-03', 'Average flexibility, needs enhancement', 3, 3, 1, 3, 3, 0, 10, 8),
    ('2023-12-04', 'Improvement needed in professionalism', 2, 2, 3, 2, 3, 0, 10, 5),
    ('2023-12-05', 'Satisfactory quality for the price', 4, 3, 4, 5, 4, 1, 10, 6);

-- Compañía 11
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-12-06', 'Service could be more flexible', 3, 3, 3, 3, 3, 0, 11, 8),
    ('2023-12-07', 'Improvement needed in professionalism', 2, 2, 2, 2, 2, 0, 11, 6),
    ('2023-12-08', 'Satisfactory quality for the price', 4, 4, 4, 4, 4, 1, 11, 10);

-- Compañía 12
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-12-09', 'Service flexibility needs enhancement', 3, 3, 3, 3, 3, 0, 12, 1),
    ('2023-12-10', 'Professionality could be improved', 3, 2, 2, 3, 2, 0, 12, 2),
    ('2023-12-11', 'Average quality for the price', 3, 3, 3, 3, 3, 0, 12, 6);

-- Compañía 13
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-12-12', 'Service flexibility needs enhancement', 3, 3, 3, 3, 3, 0, 13, 3),
    ('2023-12-13', 'Professionality could be improved', 3, 2, 2, 3, 2, 0, 13, 2),
    ('2023-12-14', 'Average quality for the price', 3, 3, 3, 3, 3, 0, 13, 4);

-- Compañía 14
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-12-15', 'Service could be more flexible', 3, 3, 3, 3, 3, 0, 14, 3),
    ('2023-12-16', 'Improvement needed in professionalism', 2, 2, 2, 2, 2, 0, 14, 2),
    ('2023-12-17', 'Satisfactory quality for the price', 4, 4, 4, 4, 4, 1, 14, 4);

-- Compañía 15
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-12-18', 'Service flexibility needs enhancement', 3, 3, 3, 3, 3, 0, 15, 4),
    ('2023-12-19', 'Professionality could be improved', 3, 2, 2, 3, 2, 0, 15, 6),
    ('2023-12-20', 'Average quality for the price', 3, 3, 3, 3, 3, 0, 15, 2);

-- Compañía 16
INSERT INTO comment (date, description, flexibility, professionalism, quality_price, quality_service,
                     response_time, recommended, company_id, client_id)
VALUES
    ('2023-12-21', 'Service could be more flexible', 3, 3, 3, 3, 3, 0, 16, 4),
    ('2023-12-22', 'Improvement needed in professionalism', 2, 2, 2, 2, 2, 0, 16, 2),
    ('2023-12-23', 'Satisfactory quality for the price', 4, 4, 4, 4, 4, 1, 16, 8);


# ESTABLECEMOS LA INFORMACION DEL COMPANY
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (500, 100, 500, 'Celebrate your love with us on your special day! We understand that your wedding day is unique, and thats why we strive to make it unforgettable. Our catering service stands out for offering an exceptional culinary experience. From exquisite appetizers to exquisitely prepared main courses, each bite is a celebration of flavors. Elegant decoration is our distinctive touch. We ensure that every corner of the venue reflects the beauty and magic of your love story. From floral arrangements to ambient lighting, we pay attention to every detail to create an environment that speaks of romance and sophistication. Personalized attention is key to our service. Our team of event experts will be at your disposal to coordinate every aspect of the day, ensuring that everything goes according to your dreams. On this special day, we commit to offering you a wedding that exceeds all your expectations. Lets celebrate love together!', 1);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (700, 200, 600, 'Celebrate your day in style with our exclusive birthday package! On this special day, we want your birthday to be a unique and memorable experience. Our personalized menu adapts to your tastes and preferences, from delicious appetizers to irresistible desserts. Thematic decoration is our specialty. Whether you desire an elegant and sophisticated party or a celebration full of color and fun, we take care of creating the perfect atmosphere. Quality entertainment is a fundamental part of our proposal. From talented musicians to interactive activities, we design experiences that will make your birthday an unforgettable event. Celebrate your day in style and let our team take care of all the details. Lets make your birthday a unique moment full of joy and surprises!', 2);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (550, 120, 520, 'Make your wedding day unforgettable with us! The day of your wedding is a unique chapter in your love story, and we are here to make it unforgettable. Romantic details are our priority. From the ceremony to the reception, we ensure that every moment is infused with love and emotion. Our exquisite gastronomy is a fusion of flavors that will delight your guests. With options for every palate, we guarantee that each dish is an unforgettable culinary experience. The magical atmosphere is created through careful planning and decoration that reflects the essence of your relationship. From the choice of colors to the arrangement of tables, every detail contributes to the magic of your special day. Make your perfect wedding a reality with us. Lets celebrate the love that unites you!', 3);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (720, 180, 620, 'Luxury Birthday: Gourmet catering, refined decoration, and an unforgettable celebration. Celebrate with distinction. Your birthday deserves to be celebrated with luxury and elegance. Our gourmet catering offers an exceptional culinary experience, with dishes crafted with the finest ingredients. Refined decoration is our commitment. From the entrance to the dance floor, every corner transforms into a space of sophistication and glamour. An unforgettable celebration is our promise. From personalized surprises to exclusive entertainment, we ensure that your birthday is a unique experience. Celebrate with distinction and let our team take care of all the details. Lets celebrate your special day with the opulence you deserve!', 4);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (480, 90, 450, 'Solemn Wedding: Classic decoration, refined banquet, and impeccable attention. Lets celebrate love together. The solemnity of your wedding is something we deeply value. Our classic decoration reflects timeless elegance, creating an atmosphere of reverence and respect. The refined banquet is a celebration of the senses. Each dish is a culinary masterpiece that will delight your guests. Impeccable attention is our standard. From the welcome to the last dance, we commit to providing you with a service that meets the importance of this day. Lets celebrate love together in its most solemn and meaningful form.', 5);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (680, 150, 580, 'Elegant Birthday: Personalized service, chic decoration, and memorable moments. Celebrate your special day with us. Elegance is the key to celebrating your birthday in a unique way. Our personalized service adapts to your needs and desires, from planning to flawless execution. Chic decoration is our signature. Every detail, from the choice of colors to the arrangement of flowers, is designed to create an atmosphere of sophistication. Memorable moments are our promise. From the arrival of guests to the last toast, we ensure that every moment is unforgettable. Celebrate your special day with us and let elegance set the tone.', 6);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (600, 130, 550, 'Charming Wedding: Vintage details, delicious menu, and a romantic atmosphere. Celebrate love in a big way. Charm is the essence of your wedding, and we are here to make it unforgettable. Vintage details are our specialty. From stationery to centerpieces, each element reflects the nostalgia and beauty of the past. The delicious menu is a mix of classic and contemporary flavors, designed to satisfy the most discerning palates. A romantic atmosphere is our promise. Every corner is lit with soft, warm light that creates an atmosphere of romance. Celebrate love in a big way with us and let charm be the star of your special day.', 7);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (800, 200, 700, 'Exclusive Birthday: Personalized surprises, first-class catering, and a festive atmosphere. Celebrate your unique day. Your birthday deserves to be exclusive and full of surprises. Our personalized surprises are designed with you in mind, from small details to unforgettable moments. First-class catering is a gastronomic experience that will delight your guests. Each dish is a carefully prepared delight to satisfy the most discerning tastes. The festive atmosphere is our promise. From the music to the decoration, we ensure that your birthday is an unforgettable party. Celebrate your unique day with us and let exclusivity be the hallmark of your celebration.', 8);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (560, 110, 530, 'Intimate Wedding: Personalized decoration, select menu, and a warm atmosphere. Lets celebrate your union in a special way. Intimacy is the heart of your wedding, and we are committed to creating a special celebration. Personalized decoration reflects your unique style, from the ceremony to the reception. Every detail is carefully chosen to create an atmosphere that is truly yours. The select menu is a showcase of the flavors you love. From appetizers to dessert, each dish is designed to delight your guests. The warm atmosphere is our promise. We ensure that everyone feels at home as we celebrate your union in a special way.', 9);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (750, 160, 650, 'Luxury Birthday: Exclusive attention, exquisite catering, and guaranteed fun. Celebrate your day with distinction. Your birthday deserves to be celebrated with luxury and exclusive attention. Our exclusive attention ensures that every detail is taken care of, from planning to flawless execution. Exquisite catering is a first-class culinary experience, with dishes crafted with the finest ingredients. Guaranteed fun is our promise. From music to surprises, we ensure that your birthday is an event full of unforgettable moments. Celebrate your day with distinction and let luxury set the tone for your celebration.', 10);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (620, 130, 590, 'Solemn Wedding: Personalized details, gourmet menu, and unforgettable moments. Lets celebrate love with you. The solemnity of your wedding is something we deeply value. Personalized details are our specialty. From invitations to gifts, each element is tailored to your unique vision. The gourmet menu is a high-level culinary experience designed to delight food enthusiasts. Unforgettable moments are our promise. We strive to create memories that you will cherish for a lifetime. Lets celebrate love with you in a solemn and meaningful way.', 11);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (750, 160, 650, 'Dream Birthday: Themed decoration, delicious menu, and a unique celebration. Celebrate your special day with us. Your birthday deserves to be a dream come true. Themed decoration is our specialty. From a costume party to an elegant theme, we take care of creating the perfect atmosphere. The delicious menu is a showcase of the flavors you love, from exquisite appetizers to irresistible desserts. A unique celebration is our promise. From personalized surprises to exclusive entertainment, we ensure that your birthday is a unique experience. Celebrate your special day with us and let your dreams come true.', 12);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (800, 200, 700, 'Elegant Wedding: Refined details, high-quality catering, and a romantic atmosphere. Lets celebrate your union exceptionally. Elegance is the key to your wedding, and we are committed to making it exceptional. Refined details are our signature. From the choice of colors to the centerpieces, each element reflects refined and sophisticated style. High-quality catering is an exceptional culinary experience, with dishes crafted with the finest ingredients. A romantic atmosphere is our promise. We ensure that every corner is infused with romance, creating an environment that celebrates your love exceptionally.', 13);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (580, 140, 550, 'Magical Wedding: Enchanting details, exquisite menu, and memorable moments. Celebrate love in our unique space. Magic is the essence of your wedding, and we are committed to making it unforgettable. Enchanting details are our specialty. From the entrance to the dance floor, each element reflects the magic of this special day. The exquisite menu is a culinary experience that will delight your guests. Each dish is a culinary masterpiece designed to satisfy the most discerning palates. Memorable moments are our promise. We strive to create memories that you will cherish for a lifetime. Celebrate love in our unique space and let magic be the star of your special day.', 14);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (800, 200, 700, 'Select Birthday: First-class catering, exclusive surprises, and an unforgettable celebration. Celebrate your special day with us. Your birthday deserves to be select and full of exclusivity. Our first-class catering ensures an exceptional culinary experience, with dishes crafted with the finest ingredients. Exclusive surprises are designed with you in mind, from small details to unforgettable moments. An unforgettable celebration is our promise. From the welcome to the last toast, we ensure that your birthday is a party full of memorable moments. Celebrate your special day with us and let exclusivity set the tone for your celebration.', 15);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (620, 130, 590, 'Stylish Wedding: Modern decoration, innovative menu, and a unique celebration. Lets celebrate your union in a avant-garde way. Style is the key to your wedding, and we are committed to making it avant-garde and unique. Modern decoration reflects the latest trends and creates a contemporary and chic atmosphere. The innovative menu is a showcase of culinary creativity, with options that will surprise and delight your guests. A unique celebration is our promise. We ensure that every detail contributes to making your wedding an unforgettable experience. Lets celebrate your union in a avant-garde and stylish way.', 16);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (750, 160, 650, 'Elegant Birthday: Exclusive attention, refined decoration, and an unforgettable celebration. Celebrate your day with distinction. Your birthday deserves to be celebrated with elegance and exclusive attention. Our exclusive attention ensures that every detail is taken care of, from planning to flawless execution. Refined decoration is our signature. Every corner transforms into a space of sophistication and glamour, creating an elegant and welcoming atmosphere. An unforgettable celebration is our promise. From the welcome to the last toast, we ensure that your birthday is an event full of unforgettable moments. Celebrate your day with distinction and let elegance set the tone for your celebration.', 17);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (520, 110, 490, 'Dream Wedding: Romantic details, exquisite menu, and a magical atmosphere. Lets celebrate your love in an unforgettable way. Your wedding deserves to be a dream come true. Romantic details are our specialty. From the ceremony to the reception, each element reflects passion and romance. The exquisite menu is a high-level culinary experience, with dishes prepared with the finest ingredients. The magical atmosphere is our promise. Every corner is lit with soft, warm light that creates an atmosphere of magic and love. Lets celebrate your love in an unforgettable way and make your wedding a unique day in a lifetime.', 18);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (720, 170, 620, 'High-Level Corporate Event: Exclusive catering, professional decoration, and effective networking. Boost your company with us. Your corporate event deserves to be high-level and effective. Our exclusive catering ensures an exceptional gastronomic experience, with options that will impress your clients and colleagues. Professional decoration creates a corporate environment that reflects seriousness and professionalism. Effective networking is our promise. We ensure to create opportunities to establish valuable connections that drive the success of your company. Boost your company with us and make your corporate event a key moment in your business strategy.', 19);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (550, 120, 520, 'Exclusive Social Event: Personalized celebration with elegant details, delicious gastronomy, and unique moments. Lets celebrate life together. Enjoy a unique experience full of elegance and charm at our exclusive social event. From personalized details to exquisite gastronomy, every moment will be infused with a special atmosphere. Lets celebrate life and joy in this unforgettable event that will leave you with memories for a lifetime.', 20);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (680, 150, 580, 'Distinguished Business Event: Personalized service, professional decoration, and a professional atmosphere. Lets celebrate the success of your company. Experience a distinguished business event that will elevate the image of your company. Our personalized service, professional decoration, and business-like atmosphere guarantee an unforgettable celebration of success. Lets celebrate the achievements of your company with style and elegance.', 21);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (500, 90, 470, 'Fascinating Cultural Event: Authentic details, diverse menu, and enriching atmosphere. Lets celebrate cultural diversity. Immerse yourself in a fascinating cultural event that stands out for its authentic details, diverse menu, and enriching atmosphere. Lets celebrate cultural diversity in a space filled with art, music, and unique experiences. Join us to celebrate cultural richness in an unforgettable way.', 22);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (780, 190, 670, 'Gala Charity Event: High-class service, elegant decoration, and support for noble causes. Lets celebrate solidarity. Join us in an exceptional charity gala event, where we offer high-class service, elegant decoration, and, most importantly, support for noble causes. Lets celebrate solidarity together and contribute to making the world a better place. Every detail of this gala is designed to create a lasting impact.', 23);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (600, 130, 550, 'Enchanting Seasonal Event: Themed decoration, festive menu, and joyful celebration. Lets celebrate the magic of the season. Immerse yourself in the magic of the season with our enchanting seasonal event. From themed decoration to a festive menu, every aspect of this celebration is designed to convey joy and festivity. Join us to celebrate the unique magic of this season in an unforgettable way.', 24);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (740, 180, 640, 'Spectacular Entertainment Event: Exciting surprises, first-class catering, and limitless fun. Lets celebrate joy and entertainment. Get ready for a spectacular entertainment event that offers exciting surprises, first-class catering, and limitless fun. Lets celebrate joy and excitement in an atmosphere full of laughter and unforgettable moments. Join us to enjoy a unique entertainment experience.', 25);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (580, 140, 530, 'Elegant Wedding: Refined details, high-quality catering, and romantic ambiance. Lets celebrate your union exceptionally. Celebrate your union exceptionally with our elegant wedding. From refined details to high-quality catering, each element is carefully planned to create a romantic and magical atmosphere. Join us to celebrate love in an unforgettable way.', 26);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (760, 150, 710, 'Innovative Business Event: Personalized details, exclusive menu, and efficient business ambiance. Lets celebrate the progress of your company. Experience an innovative business event that stands out for personalized details, an exclusive menu, and an efficient business ambiance. Lets celebrate together the progress of your company in a way that highlights your vision and achievements. Join us to celebrate business success uniquely.', 27);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (520, 110, 490, 'Exclusive Social Event: Celebration with elegant details, delicious gastronomy, and unique moments. Lets celebrate life together. Enjoy an exclusive social celebration with elegant details, delicious gastronomy, and unique moments. Lets celebrate life together in an atmosphere of elegance and joy. Join us to create lasting memories at this exceptional social event.', 28);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (700, 180, 620, 'Fascinating Cultural Event: Authentic details, diverse menu, and enriching ambiance. Lets celebrate cultural diversity. Immerse yourself in a fascinating cultural event highlighted by authentic details, a diverse menu, and an enriching ambiance. Lets celebrate cultural diversity in a space filled with art, music, and unique experiences. Join us to celebrate cultural richness in an unforgettable way.', 29);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (560, 120, 530, 'Charity Gala Event: High-class service, elegant decoration, and support for noble causes. Lets celebrate solidarity. Join us at an exceptional charity gala event, where we offer high-class service, elegant decoration, and, most importantly, support for noble causes. Lets celebrate solidarity together and contribute to making the world a better place. Every detail of this gala is designed to create a lasting impact.', 30);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (780, 190, 670, 'Enchanting Seasonal Event: Themed decoration, festive menu, and joyful celebration. Lets celebrate the magic of the season. Immerse yourself in the magic of the season with our enchanting seasonal event. From themed decoration to a festive menu, every aspect of this celebration is designed to convey joy and festivity. Join us to celebrate the unique magic of this season in an unforgettable way.', 31);
INSERT INTO information (max_quantity, min_quantity, initial_price, description, companu_id) VALUES (630, 160, 590, 'Unique Gastronomic Experience: Exclusive dinner with a renowned chef, exquisite pairings, and an intimate atmosphere. Lets celebrate exceptional cuisine. Embark on a unique gastronomic experience with our exclusive dinner. With a renowned chef at the helm, exquisite pairings, and an intimate atmosphere, every bite will be a celebration of culinary excellence. Join us for an unforgettable evening dedicated to delicious gastronomy.', 32);