CREATE TABLE Company (
    id UUID NOT NULL,
    company_name varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE Food (
    id UUID NOT NULL,
    company_id UUID NOT NULL,
    food_name varchar(255),
    food_price varchar(255),
    food_description varchar(255),
    FOREIGN KEY (company_id) REFERENCES Company(id),
    PRIMARY KEY (id)
);

CREATE TABLE Pizza(
    id uuid NOT NULL,
    food_id uuid,
    PRIMARY KEY (id),
    FOREIGN KEY (food_id) REFERENCES Food(id)
);

CREATE TABLE Burger(
    id uuid NOT NULL,
    food_id uuid,
    PRIMARY KEY (id),
    FOREIGN KEY (food_id) REFERENCES Food(id)
);

CREATE TABLE Sandwich (
    id uuid NOT NULL,
    food_id uuid,
    PRIMARY KEY (id),
    FOREIGN KEY (food_id) REFERENCES Food(id)
);


--INSERT COMPANY
INSERT INTO public.company(
id, company_name)
VALUES ('c0129280-f352-4d8f-af59-c7375cb5eb3f', 'Pizza Garden'),
      ('20eafff6-6d68-442c-9358-4b783fbd4451', 'Fratteli'),
      ('d42490f1-bb4c-4d2a-a614-2972474b9190', 'M house');

--INSERT FOOD
INSERT INTO public.food(
id, company_id, food_name, food_price, food_description)
VALUES ('9b03fc46-b463-4004-aa33-d828655ad88b',
'd42490f1-bb4c-4d2a-a614-2972474b9190',
'Club Sandwich',
5.99,
  'With cheese, lettuce, tomatoes, salami, onion.'),
  ('3666354e-a5a4-4cf0-b2a9-2a2664369c46',
'c0129280-f352-4d8f-af59-c7375cb5eb3f',
'Chicago Burger',
9.99,
  'With cheese, lettuce, BBQ sauce, onion.'),
  ('792dbc1c-9d0f-4836-be4c-9b1a4f38bdef',
'20eafff6-6d68-442c-9358-4b783fbd4451',
'King Burger',
7.99,
  'With cheese, pickles, lettuce, ketchup, sweet potatoes.'),
   ('0683b68e-d6af-4dba-997c-97952a5f2141',
'c0129280-f352-4d8f-af59-c7375cb5eb3f',
'Mixed Pizza',
10.99,
  'With cheese, tomatoe sauce, olives, pepperoni, mushroom, pepper.');

--INSERT PIZZA
INSERT INTO public.pizza(
id, food_id)
VALUES ('6320831e-49a3-4df9-8e33-457f31398a69',
'0683b68e-d6af-4dba-997c-97952a5f2141');

--INSERT BURGER
INSERT INTO public.burger(
id, food_id)
VALUES ('f66e31f6-693c-410f-8175-6d383e287932',
'3666354e-a5a4-4cf0-b2a9-2a2664369c46'),
('47f110aa-1162-4bb1-b56c-af76bef400e8',
'792dbc1c-9d0f-4836-be4c-9b1a4f38bdef');

--INSERT SANDWICH
INSERT INTO public.sandwich(
id, food_id)
VALUES ('3fdaa0f6-15d1-425e-aa26-a2484fd3b027',
'9b03fc46-b463-4004-aa33-d828655ad88b');