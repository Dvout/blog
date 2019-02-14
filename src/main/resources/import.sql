INSERT INTO user (id, username, password, name, email) VALUES (1, 'admin', '$2a$10$ZApJZ3C2qMhwmSbEnpHcSu79m.G0uM1EvzuYmVi7YhGS/dOdiRm6q', 'admin', 'i@xug.com');
INSERT INTO user (id, username, password, name, email)  VALUES (2, 'xug', '$2a$10$1UmqPYjHLVv0xO6gwTDzZO0wfAnbONKVbZHo4zGqj9VMmwSuouAbu', 'xug', 'xug@xug.com');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_USER');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 2);
