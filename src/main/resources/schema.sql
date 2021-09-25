create table POST (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(400) NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp
);

create table COMMENT (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    post_id BIGINT NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp
);

alter table comment
    add constraint comment_post_id
    foreign key (post_id) references  post(id)