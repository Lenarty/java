PGDMP     .    *                 x            thefoodu    12.1    12.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16427    thefoodu    DATABASE     �   CREATE DATABASE thefoodu WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE thefoodu;
                postgres    false            �            1259    16436    burger    TABLE     k   CREATE TABLE public.burger (
    id uuid NOT NULL,
    name text,
    price integer,
    companyid uuid
);
    DROP TABLE public.burger;
       public         heap    postgres    false            �            1259    16452    company    TABLE     E   CREATE TABLE public.company (
    id uuid NOT NULL,
    name text
);
    DROP TABLE public.company;
       public         heap    postgres    false            �            1259    16444    pizza    TABLE     j   CREATE TABLE public.pizza (
    id uuid NOT NULL,
    name text,
    price integer,
    companyid uuid
);
    DROP TABLE public.pizza;
       public         heap    postgres    false            �            1259    16428    sandwich    TABLE     m   CREATE TABLE public.sandwich (
    name text,
    id uuid NOT NULL,
    price integer,
    companyid uuid
);
    DROP TABLE public.sandwich;
       public         heap    postgres    false                      0    16436    burger 
   TABLE DATA           <   COPY public.burger (id, name, price, companyid) FROM stdin;
    public          postgres    false    203   K                 0    16452    company 
   TABLE DATA           +   COPY public.company (id, name) FROM stdin;
    public          postgres    false    205   h                 0    16444    pizza 
   TABLE DATA           ;   COPY public.pizza (id, name, price, companyid) FROM stdin;
    public          postgres    false    204   �                 0    16428    sandwich 
   TABLE DATA           >   COPY public.sandwich (name, id, price, companyid) FROM stdin;
    public          postgres    false    202   �       �
           2606    16443    burger Burger_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.burger
    ADD CONSTRAINT "Burger_pkey" PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.burger DROP CONSTRAINT "Burger_pkey";
       public            postgres    false    203            �
           2606    16459    company Company_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.company
    ADD CONSTRAINT "Company_pkey" PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.company DROP CONSTRAINT "Company_pkey";
       public            postgres    false    205            �
           2606    16451    pizza Pizza_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.pizza
    ADD CONSTRAINT "Pizza_pkey" PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.pizza DROP CONSTRAINT "Pizza_pkey";
       public            postgres    false    204            �
           2606    16435    sandwich Sandwich_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.sandwich
    ADD CONSTRAINT "Sandwich_pkey" PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.sandwich DROP CONSTRAINT "Sandwich_pkey";
       public            postgres    false    202            �
           2606    16460    burger burgercompany    FK CONSTRAINT     w   ALTER TABLE ONLY public.burger
    ADD CONSTRAINT burgercompany FOREIGN KEY (companyid) REFERENCES public.company(id);
 >   ALTER TABLE ONLY public.burger DROP CONSTRAINT burgercompany;
       public          postgres    false    205    203    2708            �
           2606    16470    pizza pizzacompany    FK CONSTRAINT     u   ALTER TABLE ONLY public.pizza
    ADD CONSTRAINT pizzacompany FOREIGN KEY (companyid) REFERENCES public.company(id);
 <   ALTER TABLE ONLY public.pizza DROP CONSTRAINT pizzacompany;
       public          postgres    false    2708    204    205            �
           2606    16465    sandwich sandwichcompany    FK CONSTRAINT     {   ALTER TABLE ONLY public.sandwich
    ADD CONSTRAINT sandwichcompany FOREIGN KEY (companyid) REFERENCES public.company(id);
 B   ALTER TABLE ONLY public.sandwich DROP CONSTRAINT sandwichcompany;
       public          postgres    false    202    205    2708                  x������ � �         b   x����0 �O�FL���h?RD������B4
��4!II��9�ZF&��q}���<�7�GUS�꜐"Wr������%�n{���.8 ���             x������ � �            x������ � �     