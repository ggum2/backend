CREATE TABLE USERS (
  username varchar(100) not null primary key,
  password varchar(255) not null,
  name varchar(50) not null,
  nickname varchar(50) not null UNIQUE,
  role varchar(20) not null default 'FRIEND',
  is_enabled tinyint(1) not null default true
);

CREATE TABLE PERSISTENT_LOGINS (
  username varchar(100) not null,
  series varchar(64) primary key,
  token varchar(64) not null,
  last_used timestamp not null
)