CREATE TABLE IF NOT EXISTS tb_user (
    id BIGINT NOT NULL,
    email VARCHAR(200) NOT NULL,
    password VARCHAR(129) NOT NULL,
    name VARCHAR(120),
    PRIMARY KEY (id)
);

COMMENT ON TABLE tb_user IS 'All users';
COMMENT ON COLUMN tb_user.id IS 'Unique identifier of the user';
COMMENT ON COLUMN tb_user.email IS 'Email for user';
COMMENT ON COLUMN tb_user.password IS 'Password';
COMMENT ON COLUMN tb_user.name IS 'User name';

CREATE TABLE IF NOT EXISTS tb_user_external_project (
    id VARCHAR(200) NOT NULL,
    user_id BIGINT NOT NULL,
    name VARCHAR(120) NOT NULL,
    PRIMARY KEY (id, user_id)
);

COMMENT ON TABLE tb_user_external_project IS 'External Project identifier for users';
COMMENT ON COLUMN tb_user_external_project.id IS 'Identifier of external project';
COMMENT ON COLUMN tb_user_external_project.user_id IS 'Unique identifier of the user';
COMMENT ON COLUMN tb_user_external_project.name IS 'Name of external project';
