create table if not exists exchange_value (
    id serial primary key,
    currency_from char(3) not null,
    currency_to char(3) not null,
    conversion_multiple numeric,
    port int
)
