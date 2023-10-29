create table brand(
    id bigserial primary key ,
    name text unique not null,
    image text
);

create table model(
    id bigserial primary key ,
    name text not null ,
    body_type text,
    img text,
    brand_id bigint references brand(id)
);

create table car_shop(
    id bigserial primary key ,
    name text not null ,
    address text not null
);

create table users(
    id bigserial primary key ,
    firstname text not null ,
    lastname text not null ,
    role text not null
);

create table car(
    id bigserial primary key ,
    model_id bigint references model(id),
    user_id bigint references users(id)
);

create table car_image(
    id bigserial primary key ,
    car_id bigint references car(id),
    ref text not null
);

create table car_description(
    id bigserial primary key ,
    car_id bigint references car(id),
    description text not null
);

create table car_warehouse(
    id bigserial primary key ,
    car_shop_id bigint references car_shop(id),
    car_id bigint references car(id),
    count bigint
);



