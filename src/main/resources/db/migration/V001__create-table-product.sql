create table product (
        id BIGSERIAL  not null unique,
        name varchar(150) not null unique,
        description varchar(255) not null ,
        price decimal(19,2) not null,
        sku varchar(10) not null,
        creation_date timestamp not null ,
        update_date timestamp not null,

        primary key (id)
    ) ;