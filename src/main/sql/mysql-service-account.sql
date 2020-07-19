CREATE USER 'appadmin'@'localhost' IDENTIFIED BY 'apapassword'

GRANT SELECT ON app.* to 'appadmin'@'localhost';
GRANT INSERT ON app.* to 'appadmin'@'localhost';
GRANT DELETE ON app.* to 'appadmin'@'localhost';
GRANT UPDATE ON app.* to 'appadmin'@'localhost';