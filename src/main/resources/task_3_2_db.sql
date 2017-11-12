CREATE DATABASE IF NOT EXISTS task_3_2_db
CHARACTER SET utf8;
USE task_3_2_db;
CREATE TABLE persons (
	pers_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    pers_name VARCHAR(255) NOT NULL,
    pers_surname VARCHAR(255) NOT NULL,
    pers_phone_number VARCHAR(255) NOT NULL,
    pers_email VARCHAR(255) NOT NULL
);
INSERT INTO persons (
	pers_name,
    pers_surname,
    pers_phone_number,
    pers_email
) VALUES (
	'иван',
    'иванов',
    '+23534125345',
    'sfgjkdhg@oretyuoiytiou.com'
);
INSERT INTO persons (
	pers_name,
    pers_surname,
    pers_phone_number,
    pers_email
) VALUES (
	'александр',
    'петров',
    '+85963475684956',
    'kfmhgnkfhg@tpuyoioyu.com'
);
INSERT INTO persons (
	pers_name,
    pers_surname,
    pers_phone_number,
    pers_email
) VALUES (
	'дмитрий',
    'сидоров',
    '+0254523525',
    'afyqterpbod@poinhvbs.com'
);
INSERT INTO persons (
	pers_name,
    pers_surname,
    pers_phone_number,
    pers_email
) VALUES (
	'carl',
    'johnson',
    '+672145091348',
    'calrkahjfdshfk@mbcvnjgfhgdfh.com'
);
INSERT INTO persons (
	pers_name,
    pers_surname,
    pers_phone_number,
    pers_email
) VALUES (
	'john',
    'smith',
    '+12442352345326',
    'johnandfsasdf@afgdasdcvbbfs.com'
);
INSERT INTO persons (
	pers_name,
    pers_surname,
    pers_phone_number,
    pers_email
) VALUES (
	'harry',
    'olafson',
    '+786243745',
    'hsgfhsfdjfdgdsfg@uewyrteiryerwt.com'
);
INSERT INTO persons (
	pers_name,
    pers_surname,
    pers_phone_number,
    pers_email
) VALUES (
	'иван',
    'иванов',
    '+8798798456',
    '12312312@dsghfdghdfgh.com'
);
