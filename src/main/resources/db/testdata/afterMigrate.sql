ALTER TABLE product DISABLE TRIGGER ALL;

DELETE FROM product;

ALTER TABLE product ENABLE TRIGGER ALL;

SELECT setval('product_id_seq', 1, false);

insert into product ( name, description, price, sku, creation_date, update_date) values ( 'acer laptop', 'Notebook Acer Aspire 5 A514-54-789C Intel Core i7 11th Gen Windows 11 Home 8GB 512GB SDD 14 Full HD', 4300.50, 99,  current_timestamp, current_timestamp);
insert into product ( name, description, price, sku, creation_date, update_date) values ( 'Gamer Chair', 'EXTREMELY COMFORTABLE ERGONOMIC UPHOLSTERY AND BACKRESTS GAMER CHAIR PU SYNTHETIC LEATHER.', 789.90, 23 , current_timestamp, current_timestamp);
insert into product ( name, description, price, sku, creation_date, update_date) values ( 'Java - Programmers Guide', 'Develop applications using Java 16! Explore all the benefits of object-oriented programming through elegant Java syntax', 109.90 , 56, current_timestamp, current_timestamp);

