INSERT INTO dbo.Analyst
(firstName, lastName, employeeID, email, status)
VALUES
('Xiaofang', 'Chen', '402515', 'XiChen@stanfordchildrens.org', 'Active');

INSERT INTO dbo.Analyst
(firstName, lastName, employeeID, email, status)
VALUES
('John', 'Yu', '402649', 'JohYu@stanfordchildrens.org', 'Active');

INSERT INTO dbo.Analyst
(firstName, lastName, employeeID, email, status)
VALUES
('April', 'Sims', '402627', 'ASims@stanfordchildrens.org', 'Active');

INSERT INTO dbo.Analyst
(firstName, lastName, employeeID, email, status)
VALUES
('Henry', 'Stepanian', '900019', 'HStepanian@stanfordchildrens.org', 'Active');

INSERT INTO dbo.Operation
(operationType, operationDesc)
VALUES
('Add', 'Provision new access/account');

INSERT INTO dbo.Operation
(operationType, operationDesc)
VALUES
('Disable', 'Disable account');

INSERT INTO dbo.Operation
(operationType, operationDesc)
VALUES
('Modify', 'Update access or account attributes');

INSERT INTO dbo.Operation
(operationType, operationDesc)
VALUES
('Password Reset', 'Reset password');

INSERT INTO dbo.Operation
(operationType, operationDesc)
VALUES
('Reactivate', 'Enable account');

INSERT INTO dbo.Operation
(operationType, operationDesc)
VALUES
('Rename', 'Change user name');

INSERT INTO dbo.Operation
(operationType, operationDesc)
VALUES
('Terminate', 'Terminate user access');

INSERT INTO dbo.Application (appCode, appName) VALUES ('AD', 'Active Directory');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Exchange', 'Exchange');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Lync', 'Lync');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Box', 'Box');
INSERT INTO dbo.Application (appCode, appName) VALUES ('ShareDrive', 'Share Drive');
INSERT INTO dbo.Application (appCode, appName) VALUES ('ShareMailbox', 'Share Mailbox');
INSERT INTO dbo.Application (appCode, appName) VALUES ('EPIC', 'EPIC Hyperspace');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Cerner', 'Cerner');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Kronos', 'Kronos');
INSERT INTO dbo.Application (appCode, appName) VALUES ('AccessHR', 'AccessHR');
INSERT INTO dbo.Application (appCode, appName) VALUES ('FSCM', 'FSCM');

INSERT INTO dbo.Application (appCode, appName) VALUES ('OnBase', 'OnBase');
INSERT INTO dbo.Application (appCode, appName) VALUES ('MDPortal', 'MD Portal (Sumcweb)');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Haiku', 'Haiku/Canto');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Voalte', 'Voalte');

INSERT INTO dbo.Application (appCode, appName) VALUES ('GRASP', 'Acuity/GRASP');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Passport', 'Passport');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Payor', 'Payor Websites');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Analytics', 'Analytics (Business Objects)');

INSERT INTO dbo.Application (appCode, appName) VALUES ('FundsFlow', 'Funds Flow');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Lane', 'Lane Library');
INSERT INTO dbo.Application (appCode, appName) VALUES ('FANSOS', 'FANSOS');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Zirmed', 'Zirmed');

INSERT INTO dbo.Application (appCode, appName) VALUES ('Emdeon', 'Emdeon');
INSERT INTO dbo.Application (appCode, appName) VALUES ('LogMeIn', 'LogMeIn');
INSERT INTO dbo.Application (appCode, appName) VALUES ('ResQ', 'Res-Q');
INSERT INTO dbo.Application (appCode, appName) VALUES ('VersusRTLS', 'Versus RTLS');

INSERT INTO dbo.Application (appCode, appName) VALUES ('Meditech', 'Meditech');
INSERT INTO dbo.Application (appCode, appName) VALUES ('MCCM', 'MCCM');
INSERT INTO dbo.Application (appCode, appName) VALUES ('ExercisePro', 'Exercise Pro');
INSERT INTO dbo.Application (appCode, appName) VALUES ('iCares', 'iCares');

INSERT INTO dbo.Application (appCode, appName) VALUES ('Connexall', 'Connexall');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Vocera', 'Vocera');
INSERT INTO dbo.Application (appCode, appName) VALUES ('MyChild', 'MyChild');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Qualtrics', 'Qualtrics');

INSERT INTO dbo.Application (appCode, appName) VALUES ('Syngo', 'Syngo');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Teamsite', 'Teamsite');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Wordpress', 'Wordpress');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Server', 'Server');
INSERT INTO dbo.Application (appCode, appName) VALUES ('TrackCore', 'TrackCore');

INSERT INTO dbo.Application (appCode, appName) VALUES ('VHI', 'VHI');
INSERT INTO dbo.Application (appCode, appName) VALUES ('SharePoint', 'SharePoint');
INSERT INTO dbo.Application (appCode, appName) VALUES ('TSI', 'TSI');
INSERT INTO dbo.Application (appCode, appName) VALUES ('EPSi', 'EPSi');

INSERT INTO dbo.Application (appCode, appName) VALUES ('Tableau', 'Tableau');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Getwell', 'Getwell');
INSERT INTO dbo.Application (appCode, appName) VALUES ('GotoMeeting', 'Goto Meeting');
INSERT INTO dbo.Application (appCode, appName) VALUES ('SNOW', 'Service Now');

INSERT INTO dbo.Application (appCode, appName) VALUES ('SHCPRISM', 'SHC PRISM');
INSERT INTO dbo.Application (appCode, appName) VALUES ('BabySentry', 'BabySentry');

INSERT INTO dbo.Application (appCode, appName) VALUES ('AvayaCMS', 'Avaya CMS');
INSERT INTO dbo.Application (appCode, appName) VALUES ('AGFA', 'AGFA/PACS');
INSERT INTO dbo.Application (appCode, appName) VALUES ('Voxida', 'Voxida');
INSERT INTO dbo.Application (appCode, appName) VALUES ('TwentytwoMile', 'TwentytwoMile');