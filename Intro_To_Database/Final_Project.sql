CREATE TABLE zoo_employee_info
 (first_name varchar(20),
  last_name varchar(20),
  email varchar(100),
  employee_ssn varchar(20),
  street_address varchar(50),
  city varchar(30),
  state varchar(20),
  zip number(5,0),
  employee_type varchar(20),
  contractor_name varchar(20),
  department_name varchar(30),
  building_assigned varchar(20),
  shop_type varchar(20));
 
CREATE TABLE contractor_info
 (contractor_name varchar(20),
  contractor_address varchar(50),
  contractor_city varchar(30),
  contractor_state varchar(20),
  contractor_zip number(5,0),
  contractor_phone varchar(20));
   
CREATE TABLE zoo_department_info
 (department_name varchar(30),
  department_phone varchar(20));
     
CREATE TABLE zoo_building_info
 (building_assigned varchar(20),
  enclosure_assigned varchar(100));
  
CREATE TABLE animal_info
 (name varchar(20),
  animal_type varchar(50),
  gender varchar(10),
  enclosure_assigned varchar(100));
  
CREATE TABLE animal_type_info
 (animal_type varchar(50),
  scientific_name varchar(50));
 
ALTER TABLE zoo_employee_info
 MODIFY (contractor_name default null);
 
ALTER TABLE zoo_employee_info
 MODIFY (shop_type default null);
 
ALTER TABLE zoo_building_info
 MODIFY (enclosure_assigned default null);

ALTER TABLE animal_info
 MODIFY (name default null);


INSERT INTO zoo_employee_info VALUES ('Costa','Benediktovich','cbenediktovich29@fastcompany.com','152-40-7191','8 Hudson Court','Charlotte','North Carolina',28210,'Contractor','Brainsphere','Animal Feeding','Building Four',NULL);
INSERT INTO zoo_employee_info VALUES ('Duke','Wibrow','dwibrow2n@ustream.tv','638-79-4538','75 Eggendart Place','Topeka','Kansas',66606,'Contractor','Brainsphere','Janitorial','Building Eight',NULL);
INSERT INTO zoo_employee_info VALUES ('Sophronia','McGeneay','smcgeneayp@state.gov','649-29-9191','833 Elgar Crossing','Minneapolis','Minnesota',55412,'Contractor','Brainsphere','Maintenance','Building One',NULL);
INSERT INTO zoo_employee_info VALUES ('Rahal','Caselick','rcaselick13@bbb.org','175-06-0900','833 Golf View Terrace','Huntsville','Alabama',35810,'Contractor','Brainsphere','Veterinarians','Building Eight',NULL);
INSERT INTO zoo_employee_info VALUES ('Silvanus','McIlroy','smcilroy1u@github.com','242-90-2085','1780 Trailsway Court','Waltham','Massachusetts',02453,'Contractor','Brainsphere','Veterinarians','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Darill','Densun','ddensun2p@ezinearticles.com','223-85-6117','7814 Eastlawn Road','Pittsburgh','Pennsylvania',15286,'Contractor','Fliptune','Animal Feeding','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Reamonn','Ibotson','ribotson1x@nsw.gov.au','761-25-8048','41192 Debra Place','Birmingham','Alabama',35279,'Contractor','Fliptune','Animal Feeding','Building Three',NULL);
INSERT INTO zoo_employee_info VALUES ('Joellyn','Babcock','jbabcock8@tamu.edu','484-93-4968','529 Talmadge Lane','Winter Haven','Florida',33884,'Contractor','Fliptune','Janitorial','Building Three',NULL);
INSERT INTO zoo_employee_info VALUES ('Wilow','Jack','wjack2o@nih.gov','807-12-1665','6 Moose Plaza','Madison','Wisconsin',53779,'Contractor','Fliptune','Janitorial','Building Three',NULL);
INSERT INTO zoo_employee_info VALUES ('Reilly','Sandeman','rsandemanx@discuz.net','428-09-4944','9 Westport Street','Charlotte','North Carolina',28225,'Contractor','Fliptune','Maintenance','Building Three',NULL);
INSERT INTO zoo_employee_info VALUES ('Thia','Hamblyn','thamblyn15@arstechnica.com','157-96-9798','53839 8th Terrace','Long Beach','California',90810,'Contractor','Fliptune','Veterinarians','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Clemmy','Jenkison','cjenkison1n@hc360.com','706-68-4472','04 Brickson Park Trail','New York City','New York',10009,'Contractor','Quimm','Veterinarians','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Daniele','McGeouch','dmcgeouch2@pbs.org','771-73-4479','71943 Sunfield Pass','Bethesda','Maryland',20892,'Contractor','Thoughtstorm','Animal Feeding','Building Eight',NULL);
INSERT INTO zoo_employee_info VALUES ('Hoyt','Gilloran','hgilloran2i@free.fr','708-27-9921','17921 Talisman Avenue','Little Rock','Arkansas',72204,'Contractor','Thoughtstorm','Maintenance','Building Four',NULL);
INSERT INTO zoo_employee_info VALUES ('Wyn','Robson','wrobsony@epa.gov','410-91-2241','02 Trailsway Hill','Hartford','Connecticut',06183,'Contractor','Thoughtstorm','Maintenance','Building Four',NULL);
INSERT INTO zoo_employee_info VALUES ('Lenora','Ableson','lableson1h@springer.com','888-73-2852','0257 Sheridan Terrace','Dayton','Ohio',45490,'Contractor','Thoughtstorm','Veterinarians','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Jerrold','Bertomieu','jbertomieu10@virginia.edu','807-34-0339','030 Burrows Park','Wichita','Kansas',67260,'Contractor','Zoonder','Animal Feeding','Building Three',NULL);
INSERT INTO zoo_employee_info VALUES ('Midge','Conti','mconti27@addthis.com','669-78-4487','311 Mariners Cove Park','Portland','Oregon',97232,'Contractor','Zoonder','Animal Feeding','Building Four',NULL);
INSERT INTO zoo_employee_info VALUES ('Jillana','Swannie','jswannie1i@noaa.gov','111-07-7845','75421 Surrey Road','Denver','Colorado',80279,'Contractor','Zoonder','Veterinarians','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Dorrie','Dyke','ddykeu@jiathis.com','282-03-7032','04794 Welch Junction','Sacramento','California',95865,'Direct Employee',NULL,'Accounting','Building Nine',NULL);
INSERT INTO zoo_employee_info VALUES ('Ninetta','Greeves','ngreeves1m@statcounter.com','595-04-3598','84 Gerald Lane','Minneapolis','Minnesota',55423,'Direct Employee',NULL,'Accounting','Building Nine',NULL);
INSERT INTO zoo_employee_info VALUES ('Shani','Husher','shusher2r@slate.com','882-41-6633','463 Becker Drive','Jacksonville','Florida',32204,'Direct Employee',NULL,'Accounting','Building Nine',NULL);
INSERT INTO zoo_employee_info VALUES ('Chrystel','Moughtin','cmoughtinv@gov.uk','615-18-4634','82389 Hudson Junction','Little Rock','Arkansas',72209,'Direct Employee',NULL,'Accounting','Building Nine',NULL);
INSERT INTO zoo_employee_info VALUES ('Hew','Pettie','hpettier@aboutads.info','443-23-8504','7 Dapin Street','Jacksonville','Florida',32204,'Direct Employee',NULL,'Accounting','Building Nine',NULL);
INSERT INTO zoo_employee_info VALUES ('Wilmar','Rosenwald','wrosenwald2f@ifeng.com','445-75-8554','21 Bonner Junction','Tulsa','Oklahoma',74108,'Direct Employee',NULL,'Accounting','Building Nine',NULL);
INSERT INTO zoo_employee_info VALUES ('Ardeen','Wehnerr','awehnerrh@smugmug.com','144-76-1937','13 Debra Trail','Jamaica','New York',11499,'Direct Employee',NULL,'Accounting','Building Nine',NULL);
INSERT INTO zoo_employee_info VALUES ('Marty','Bather','mbather1t@ifeng.com','702-20-0143','93717 Lakewood Gardens Hill','Silver Spring','Maryland',20904,'Direct Employee',NULL,'Animal Feeding','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Lydia','Bedow','lbedowz@bigcartel.com','572-73-4416','601 Ludington Terrace','San Francisco','California',94137,'Direct Employee',NULL,'Animal Feeding','Building Three',NULL);
INSERT INTO zoo_employee_info VALUES ('Bogey','Gudeman','bgudemana@jugem.jp','128-27-8275','93728 Brickson Park Crossing','Young America','Minnesota',55573,'Direct Employee',NULL,'Animal Feeding','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Liana','Learmonth','llearmonth1v@printfriendly.com','328-66-6328','398 Spohn Court','Topeka','Kansas',66642,'Direct Employee',NULL,'Animal Feeding','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Bartolomeo','MacAiline','bmacailine28@amazon.co.uk','660-24-8368','4 Rockefeller Circle','Bakersfield','California',93311,'Direct Employee',NULL,'Animal Feeding','Building One',NULL);
INSERT INTO zoo_employee_info VALUES ('Dreddy','Norcutt','dnorcuttn@japanpost.jp','877-76-3578','984 Carpenter Trail','Detroit','Michigan',48211,'Direct Employee',NULL,'Animal Feeding','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Fidole','Pigdon','fpigdon24@sina.com.cn','385-32-7149','1 Rockefeller Court','Portland','Oregon',97271,'Direct Employee',NULL,'Animal Feeding','Building One',NULL);
INSERT INTO zoo_employee_info VALUES ('Rois','Revington','rrevingtont@japanpost.jp','227-05-2719','22715 Farragut Terrace','Henderson','Nevada',89012,'Direct Employee',NULL,'Animal Feeding','Building Four',NULL);
INSERT INTO zoo_employee_info VALUES ('Wade','Yude','wyudes@goodreads.com','782-20-4775','7788 Iowa Junction','North Little Rock','Arkansas',72199,'Direct Employee',NULL,'Animal Feeding','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Fancie','Cunnington','fcunnington26@amazon.co.uk','781-55-7919','76612 Comanche Plaza','Cincinnati','Ohio',45208,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Sam','Foden','sfoden1r@ft.com','314-90-4517','415 Nelson Road','San Diego','California',92115,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Esteban','Girardet','egirardet14@paypal.com','671-32-4837','9 La Follette Way','Sacramento','California',94263,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Alexia','Jinkins','ajinkins2b@quantcast.com','152-39-6630','2 Union Plaza','Akron','Ohio',44310,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Duff','McCoid','dmccoid1o@wiley.com','120-68-4389','3 Monument Center','New Orleans','Louisiana',70142,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Cissiee','Ramard','cramarde@wordpress.com','637-31-8065','44657 Goodland Place','Little Rock','Arkansas',72231,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Kate','Schulke','kschulke1@independent.co.uk','295-46-6618','90523 Fair Oaks Pass','Galveston','Texas',77554,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Norrie','Van Hault','nvanhault1l@tiny.cc','797-88-5141','225 Bunker Hill Lane','Dallas','Texas',75246,'Direct Employee',NULL,'Engineering','Building Five',NULL);
INSERT INTO zoo_employee_info VALUES ('Boot','Kirkland','bkirkland21@engadget.com','458-15-3622','35175 Warner Lane','Lawrenceville','Georgia',30045,'Direct Employee',NULL,'Food Service','Building Six','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Star','Leehane','sleehane1f@geocities.jp','355-96-8725','57 Lakewood Terrace','Birmingham','Alabama',35225,'Direct Employee',NULL,'Food Service','Building Four','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Lester','Ravilious','lraviliousb@cdc.gov','763-29-5195','891 Waubesa Terrace','Shawnee Mission','Kansas',66215,'Direct Employee',NULL,'Food Service','Building One','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Aleksandr','Ricardot','aricardot1k@baidu.com','639-88-3510','48148 Lakeland Place','Chandler','Arizona',85246,'Direct Employee',NULL,'Food Service','Building Ten','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Jeanie','Rittmeier','jrittmeier6@spotify.com','821-52-6186','65663 Roxbury Drive','Waltham','Massachusetts',02453,'Direct Employee',NULL,'Food Service','Building Four','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Georgine','Rutgers','grutgers1j@scientificamerican.com','623-10-7530','107 Stang Terrace','Dallas','Texas',75277,'Direct Employee',NULL,'Food Service','Building Two','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Jelene','Shapera','jshapera19@ox.ac.uk','183-71-6911','52035 Rutledge Terrace','Evanston','Illinois',60208,'Direct Employee',NULL,'Food Service','Building Three','Ice Cream');
INSERT INTO zoo_employee_info VALUES ('Wilona','Stithe','wstithe2k@ucsd.edu','210-16-5104','19 Spohn Pass','Pensacola','Florida',32595,'Direct Employee',NULL,'Food Service','Building Eight','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Brittney','Lias','blias4@usgs.gov','461-78-5389','984 Algoma Trail','Peoria','Illinois',61629,'Direct Employee',NULL,'Human Resources','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Olympie','Iacovozzo','oiacovozzo25@spiegel.de','285-12-8272','0 Lawn Lane','Clearwater','Florida',34629,'Direct Employee',NULL,'Janitorial','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Derry','Janca','djanca2q@va.gov','158-14-4758','58 Division Point','Louisville','Kentucky',40205,'Direct Employee',NULL,'Janitorial','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Cicily','McPhelim','cmcphelim5@yale.edu','352-43-1451','1 Commercial Junction','Oklahoma City','Oklahoma',73129,'Direct Employee',NULL,'Janitorial','Building One',NULL);
INSERT INTO zoo_employee_info VALUES ('Arabelle','Muck','amuck1s@ucoz.com','726-75-3474','33 Eastwood Alley','Pensacola','Florida',32511,'Direct Employee',NULL,'Janitorial','Building Eight',NULL);
INSERT INTO zoo_employee_info VALUES ('Urson','Wratten','uwrattenq@chronoengine.com','112-07-5545','43384 Old Shore Crossing','Fort Wayne','Indiana',46896,'Direct Employee',NULL,'Janitorial','Building One',NULL);
INSERT INTO zoo_employee_info VALUES ('Arlene','Birkhead','abirkheadl@nytimes.com','109-55-6070','75596 Thackeray Hill','Boston','Massachusetts',02283,'Direct Employee',NULL,'Maintenance','Building Ten',NULL);
INSERT INTO zoo_employee_info VALUES ('Codi','Doble','cdoble1y@irs.gov','739-38-4440','4 Stuart Place','Washington','District of Columbia',20551,'Direct Employee',NULL,'Maintenance','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Anneliese','Gallanders','agallanders23@un.org','882-47-5226','7474 Warner Lane','Oakland','California',94605,'Direct Employee',NULL,'Maintenance','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Linell','Jouning','ljouningk@zdnet.com','792-80-3428','0506 Johnson Road','Memphis','Tennessee',38114,'Direct Employee',NULL,'Maintenance','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Katrinka','Reicharz','kreicharz1e@vinaora.com','433-80-4517','1 Jay Circle','Lubbock','Texas',79415,'Direct Employee',NULL,'Maintenance','Building Four',NULL);
INSERT INTO zoo_employee_info VALUES ('Pebrook','Samudio','psamudio1a@yahoo.co.jp','899-95-7956','59 Stoughton Street','Boston','Massachusetts',02283,'Direct Employee',NULL,'Maintenance','Building One',NULL);
INSERT INTO zoo_employee_info VALUES ('Justinian','Sowerbutts','jsowerbutts2j@cdc.gov','333-94-8309','5 Hoepker Drive','Bozeman','Montana',59771,'Direct Employee',NULL,'Maintenance','Building Eight',NULL);
INSERT INTO zoo_employee_info VALUES ('Margaretta','Trevaskiss','mtrevaskiss2l@mapy.cz','488-90-7425','026 Longview Lane','Indianapolis','Indiana',46216,'Direct Employee',NULL,'Maintenance','Building Four',NULL);
INSERT INTO zoo_employee_info VALUES ('Fitz','Margram','fmargram3@amazon.co.uk','876-74-3642','3560 Warrior Terrace','Lubbock','Texas',79410,'Direct Employee',NULL,'Marketing','Building Six',NULL);
INSERT INTO zoo_employee_info VALUES ('Jaye','Oury','jouryg@fotki.com','324-09-9489','7609 Rigney Pass','Columbia','South Carolina',29240,'Direct Employee',NULL,'Marketing','Building Six',NULL);
INSERT INTO zoo_employee_info VALUES ('Kinsley','Dolligon','kdolligon16@booking.com','759-21-0866','87 Namekagon Alley','Baltimore','Maryland',21229,'Direct Employee',NULL,'Retail','Building Three','Souvenir');
INSERT INTO zoo_employee_info VALUES ('Godart','Peplaw','gpeplaw1q@sphinn.com','577-15-5954','134 Vidon Hill','San Jose','California',95128,'Direct Employee',NULL,'Retail','Building Six','Souvenir');
INSERT INTO zoo_employee_info VALUES ('Walsh','Rippin','wrippinw@wikispaces.com','260-90-2789','043 Old Gate Plaza','Cincinnati','Ohio',45999,'Direct Employee',NULL,'Retail','Building One','Souvenir');
INSERT INTO zoo_employee_info VALUES ('Goldy','Silverman','gsilvermanc@abc.net.au','211-47-1270','81 Kinsman Hill','Kent','Washington',98042,'Direct Employee',NULL,'Retail','Building Four','Souvenir');
INSERT INTO zoo_employee_info VALUES ('Kaleb','Sperrett','ksperretto@wisc.edu','799-03-5236','77674 Kedzie Alley','Houston','Texas',77223,'Direct Employee',NULL,'Retail','Building Two','Food And Drink');
INSERT INTO zoo_employee_info VALUES ('Rhodia','Sutlieff','rsutlieff18@wikipedia.org','716-67-3819','49 Forest Street','Los Angeles','California',90189,'Direct Employee',NULL,'Retail','Building Ten','Souvenir');
INSERT INTO zoo_employee_info VALUES ('Sara','Kingston','skingston2a@jalbum.net','693-45-9990','26 Sunnyside Place','Dayton','Ohio',45414,'Direct Employee',NULL,'Sales','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Kristen','Swancock','kswancock2d@chron.com','405-53-3389','756 Bluestem Court','Macon','Georgia',31210,'Direct Employee',NULL,'Sales','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Amelia','Turn','aturn2g@engadget.com','469-86-4394','14 Basil Street','Monticello','Minnesota',55565,'Direct Employee',NULL,'Sales','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Devi','Bagnold','dbagnold20@techcrunch.com','466-16-8941','4930 Cascade Street','Washington','District of Columbia',20226,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Kenyon','Basill','kbasill1c@washingtonpost.com','269-49-4430','67 Hermina Road','Sacramento','California',95852,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Palmer','Dartan','pdartan2m@twitpic.com','286-29-7711','48 Anhalt Trail','San Francisco','California',94147,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Shurwood','Dimock','sdimock1p@last.fm','582-14-3037','7293 West Crossing','Albuquerque','New Mexico',87190,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Myrta','Golland','mgolland7@symantec.com','749-17-4498','24194 Emmet Court','Madison','Wisconsin',53726,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Chastity','Lyall','clyall1d@hostgator.com','592-46-4632','140 School Drive','Houston','Texas',77281,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Arri','Rowly','arowlym@sourceforge.net','824-19-2046','871 Nelson Terrace','Washington','District of Columbia',20503,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Miner','Wreight','mwreight1g@goodreads.com','641-31-2777','07 Fairfield Terrace','Washington','District of Columbia',20238,'Direct Employee',NULL,'Training','Building Seven',NULL);
INSERT INTO zoo_employee_info VALUES ('Joelie','Gerrietz','jgerrietz9@slate.com','154-53-8312','0345 Artisan Lane','Whittier','California',90605,'Direct Employee',NULL,'Veterinarians','Building Two',NULL);
INSERT INTO zoo_employee_info VALUES ('Isahella','Hane','ihane12@sakura.ne.jp','110-38-0506','3 Cordelia Place','San Jose','California',95160,'Direct Employee',NULL,'Veterinarians','Building Four',NULL);

INSERT INTO contractor_info VALUES ('Brainsphere','8213 Clyde Gallagher Crossing','Asheville','North Carolina',28815,'828-113-8262');
INSERT INTO contractor_info VALUES ('Fliptune','02154 Arkansas Way','Toledo','Ohio',43635,'419-832-4576');
INSERT INTO contractor_info VALUES ('Quimm','4981 Grim Lane','Atlanta','Georgia',31190,'404-875-9906');
INSERT INTO contractor_info VALUES ('Thoughtstorm','06 Ronald Regan Way','Akron','Ohio',44321,'330-554-5929');
INSERT INTO contractor_info VALUES ('Zoonder','282 Eastwood Point','Denver','Colorado',80228,'303-698-2325');

INSERT INTO zoo_department_info VALUES ('Animal Feeding','228-884-8625');
INSERT INTO zoo_department_info VALUES ('Janitorial','518-899-7496');
INSERT INTO zoo_department_info VALUES ('Maintenance','918-963-5584');
INSERT INTO zoo_department_info VALUES ('Veterinarians','127-453-3853');
INSERT INTO zoo_department_info VALUES ('Accounting','265-110-5147');
INSERT INTO zoo_department_info VALUES ('Engineering','989-636-9241');
INSERT INTO zoo_department_info VALUES ('Food Service','555-444-3333');
INSERT INTO zoo_department_info VALUES ('Human Resources','289-567-6575');
INSERT INTO zoo_department_info VALUES ('Marketing','117-576-1486');
INSERT INTO zoo_department_info VALUES ('Retail','854-366-4615');
INSERT INTO zoo_department_info VALUES ('Sales','547-939-2247');
INSERT INTO zoo_department_info VALUES ('Training','114-316-8793');

INSERT INTO zoo_building_info VALUES ('Building One','The George Brown College Enclosure');
INSERT INTO zoo_building_info VALUES ('Building Two','The University of Arkansas Enclosure');
INSERT INTO zoo_building_info VALUES ('Building Three','The Australian College of Kuwait  Enclosure');
INSERT INTO zoo_building_info VALUES ('Building Four','The Hyogo University of Education Enclosure');
INSERT INTO zoo_building_info VALUES ('Building Five',NULL);
INSERT INTO zoo_building_info VALUES ('Building Six',NULL);
INSERT INTO zoo_building_info VALUES ('Building Seven',NULL);
INSERT INTO zoo_building_info VALUES ('Building Eight','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO zoo_building_info VALUES ('Building Nine',NULL);
INSERT INTO zoo_building_info VALUES ('Building Ten','The St. Andrews Presbyterian College Enclosure');

INSERT INTO animal_info VALUES ('Bordie','Eastern Gorilla','Male','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Brian','Eastern Gorilla','Male','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Caryl','Eastern Gorilla','Female','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Stella','Eastern Gorilla','Female','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Elwira','mountain gorilla','Female','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Oates','mountain gorilla','Male','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Pepita','mountain gorilla','Female','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Eugenio','Western Gorilla','Male','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Humberto','Western Gorilla','Male','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Livvie','Western Gorilla','Female','The Chung Shan Medical and Dental College Enclosure');
INSERT INTO animal_info VALUES ('Alexei','Black Rhino','Male','The Hyogo University of Education Enclosure');
INSERT INTO animal_info VALUES ('Iolanthe','Greater One-Horned Rhino','Female','The Hyogo University of Education Enclosure');
INSERT INTO animal_info VALUES ('Harmon','Javan Rhino','Male','The Hyogo University of Education Enclosure');
INSERT INTO animal_info VALUES ('Jodee','Sumatran Rhino','Female','The Hyogo University of Education Enclosure');
INSERT INTO animal_info VALUES ('Aile','White Rhino','Female','The Hyogo University of Education Enclosure');
INSERT INTO animal_info VALUES ('Blanca','African bush elephant','Female','The George Brown College Enclosure');
INSERT INTO animal_info VALUES ('Loree','African bush elephant','Female','The George Brown College Enclosure');
INSERT INTO animal_info VALUES ('Granger','African forest elephant','Male','The George Brown College Enclosure');
INSERT INTO animal_info VALUES ('Wynne','African forest elephant','Female','The George Brown College Enclosure');
INSERT INTO animal_info VALUES ('Rutger','Asian elephant','Male','The George Brown College Enclosure');
INSERT INTO animal_info VALUES ('Eolande','American wigeon','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Gerome','American wigeon','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Karlan','American wigeon','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Sonny','American wigeon','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Cathe','Canada goose','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Claudina','Canada goose','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Kayne','Canada goose','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Lynde','Canada goose','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Stanley','Canada goose','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Adah','Cinnamon teal','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Anetta','Cinnamon teal','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Arch','Cinnamon teal','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Borg','Cinnamon teal','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Bertie','Gadwall','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Forster','Gadwall','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Garfield','Gadwall','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Tomi','Gadwall','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Vasilis','Gadwall','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Dwain','Greater white fronted goose','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Izabel','Greater white fronted goose','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Loree','Greater white fronted goose','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Lothario','Greater white fronted goose','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Melantha','Greater white fronted goose','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Alaine','Green-winged teal','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Barry','Green-winged teal','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Boyce','Green-winged teal','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Sigfried','Green-winged teal','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Cedric','Mallard','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Constanta','Mallard','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Eddi','Mallard','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Rutger','Mallard','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Sabina','Mallard','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Ileana','Northern pintail','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Jorry','Northern pintail','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Kiley','Northern pintail','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Rosabel','Northern pintail','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Helen','Northern shoveler','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Kellby','Northern shoveler','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Pauletta','Northern shoveler','Female','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES ('Thacher','Northern shoveler','Male','The St. Andrews Presbyterian College Enclosure');
INSERT INTO animal_info VALUES (NULL,'Black Rat Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Black/Yellow Rat Snake Integrate','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Carolina Swamp Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern Coachwhip Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern Garter Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern Hognose Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern Milk Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern Smooth Earth Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern Worm Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Florida Redbelly Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Glossy Crayfish Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Midland Brown Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Mole King Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern Black Racer','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern Brown Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern Redbelly Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern Ringneck Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern Scarlet Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern Water Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Pine Woods Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Redbelly Water Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Rough Earth Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Scarlet King Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Southeastern Crowned Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Southern Black Racer','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Southern Hognose Snake','Female','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Southern Ringneck Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'Yellow Rat Snake','Male','The Australian College of Kuwait  Enclosure');
INSERT INTO animal_info VALUES (NULL,'American toad','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'American toad','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'American toad','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'American toad','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern box turtle','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern box turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern box turtle','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern painted turtle','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern painted turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Eastern painted turtle','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Fowlers toad','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Fowlers toad','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Green frog','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Green frog','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Map turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Map turtle','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Map turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'New Jersey chorus frog','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'New Jersey chorus frog','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'New Jersey chorus frog','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'New Jersey chorus frog','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern cricket frog','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern pickerel','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern pickerel','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern two-lined salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern two-lined salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Northern two-lined salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Redbacked salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Redbacked salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Red-bellied turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Red-bellied turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Red-bellied turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Slimy salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Slimy salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Slimy salamander','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Snapping turtle','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Snapping turtle','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Wood frog','Male','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Wood frog','Female','The University of Arkansas Enclosure');
INSERT INTO animal_info VALUES (NULL,'Wood frog','Female','The University of Arkansas Enclosure');

INSERT INTO animal_type_info VALUES ('Eastern Gorilla','Gorilla beringei');
INSERT INTO animal_type_info VALUES ('mountain gorilla','Gorilla beringei beringei');
INSERT INTO animal_type_info VALUES ('Western Gorilla','Gorilla gorilla');
INSERT INTO animal_type_info VALUES ('Black Rhino','Diceros bicornis');
INSERT INTO animal_type_info VALUES ('Greater One-Horned Rhino','Rhinoceros unicornis');
INSERT INTO animal_type_info VALUES ('Javan Rhino','Rhinoceros sondaicus');
INSERT INTO animal_type_info VALUES ('Sumatran Rhino','Dicerorhinus sumatrensis');
INSERT INTO animal_type_info VALUES ('White Rhino','Ceratotherium simum');
INSERT INTO animal_type_info VALUES ('African bush elephant','Loxodonta africana');
INSERT INTO animal_type_info VALUES ('African forest elephant','L. cyclotis');
INSERT INTO animal_type_info VALUES ('Asian elephant','Elephas maximus');
INSERT INTO animal_type_info VALUES ('American wigeon','Anas americana');
INSERT INTO animal_type_info VALUES ('Canada goose','Branta canadensis');
INSERT INTO animal_type_info VALUES ('Cinnamon teal','Anas cyanoptera');
INSERT INTO animal_type_info VALUES ('Gadwall','Anas strepera');
INSERT INTO animal_type_info VALUES ('Greater white fronted goose','Anser albifrons');
INSERT INTO animal_type_info VALUES ('Green-winged teal','Anas crecca');
INSERT INTO animal_type_info VALUES ('Mallard','Anas platyrhynchos');
INSERT INTO animal_type_info VALUES ('Northern pintail','Anas acuta');
INSERT INTO animal_type_info VALUES ('Northern shoveler','Anas clypeata');
INSERT INTO animal_type_info VALUES ('Black Rat Snake','Elaphe obsoleta obsoleta');
INSERT INTO animal_type_info VALUES ('Black/Yellow Rat Snake Integrate','Pantherophis obsoletus');
INSERT INTO animal_type_info VALUES ('Carolina Swamp Snake','Seminatrix pygaea paludis');
INSERT INTO animal_type_info VALUES ('Eastern Coachwhip Snake','Masticophis flagellum flagelum');
INSERT INTO animal_type_info VALUES ('Eastern Garter Snake','Thamnophis sirtalis sirtalis');
INSERT INTO animal_type_info VALUES ('Eastern Hognose Snake','Heterondon platirhinos');
INSERT INTO animal_type_info VALUES ('Eastern Milk Snake','Lampropeltis triangulum triangulum');
INSERT INTO animal_type_info VALUES ('Eastern Smooth Earth Snake','Virginia valeriae valeriae');
INSERT INTO animal_type_info VALUES ('Eastern Worm Snake','Carphophis amoenus amoenus');
INSERT INTO animal_type_info VALUES ('Florida Redbelly Snake','Storeria occipitomaculata obscura');
INSERT INTO animal_type_info VALUES ('Glossy Crayfish Snake','Regina rigida rigida');
INSERT INTO animal_type_info VALUES ('Midland Brown Snake','Storeria dekayi wrightorum');
INSERT INTO animal_type_info VALUES ('Mole King Snake','Lampropeltis calligaster rhombomaculata');
INSERT INTO animal_type_info VALUES ('Northern Black Racer','Coluber constrictor constrictor');
INSERT INTO animal_type_info VALUES ('Northern Brown Snake','Storeria dekayi dekayi');
INSERT INTO animal_type_info VALUES ('Northern Redbelly Snake','Storeria occipitomaculata occipitomaculata');
INSERT INTO animal_type_info VALUES ('Northern Ringneck Snake','Diadophis punctatus edwardsii');
INSERT INTO animal_type_info VALUES ('Northern Scarlet Snake','Cemophora coccinea copei');
INSERT INTO animal_type_info VALUES ('Northern Water Snake','Nerodia sipedon sipedon');
INSERT INTO animal_type_info VALUES ('Pine Woods Snake','Rhadinaea flavilata');
INSERT INTO animal_type_info VALUES ('Redbelly Water Snake','Nerodia erythrogaster erythrogaster');
INSERT INTO animal_type_info VALUES ('Rough Earth Snake','Virginia striatula');
INSERT INTO animal_type_info VALUES ('Scarlet King Snake','Lampropeltis triangulum elapsoides');
INSERT INTO animal_type_info VALUES ('Southeastern Crowned Snake','Tantilla coronata');
INSERT INTO animal_type_info VALUES ('Southern Black Racer','Coluber constrictor priapus');
INSERT INTO animal_type_info VALUES ('Southern Hognose Snake','Heterondon simus');
INSERT INTO animal_type_info VALUES ('Southern Ringneck Snake','Diadophis punctatus punctatus');
INSERT INTO animal_type_info VALUES ('Yellow Rat Snake','Pantherophis alleghaniensis');
INSERT INTO animal_type_info VALUES ('American toad','Anaxyrus americanus');
INSERT INTO animal_type_info VALUES ('Eastern box turtle','Terrapene carolina carolina');
INSERT INTO animal_type_info VALUES ('Eastern painted turtle','Chrysemys picta');
INSERT INTO animal_type_info VALUES ('Fowlers toad','Anaxyrus fowleri');
INSERT INTO animal_type_info VALUES ('Green frog','Rana clamitans');
INSERT INTO animal_type_info VALUES ('Map turtle','Graptemys geographica');
INSERT INTO animal_type_info VALUES ('New Jersey chorus frog','Pseudacris feriarum');
INSERT INTO animal_type_info VALUES ('Northern cricket frog','Pseudacris triseriata kalmi');
INSERT INTO animal_type_info VALUES ('Northern pickerel','Esox lucius');
INSERT INTO animal_type_info VALUES ('Northern two-lined salamander','Eurycea bislineata');
INSERT INTO animal_type_info VALUES ('Redbacked salamander','Plethodon cinereus');
INSERT INTO animal_type_info VALUES ('Red-bellied turtle','Pseudemys rubriventris');
INSERT INTO animal_type_info VALUES ('Slimy salamander','Plethodon glutinosus');
INSERT INTO animal_type_info VALUES ('Snapping turtle','Chelydra serpentina');
INSERT INTO animal_type_info VALUES ('Wood frog','Lithobates sylvaticus');

select first_name || ' ' || last_name as "Name"
from zoo_employee_info
where contractor_name = 'Zoonder';

select e.first_name || ' ' || e.last_name as "Name"
from animal_info a, zoo_employee_info e, zoo_building_info b
where a.name = 'Bordie' and a.enclosure_assigned = b.enclosure_assigned and   b.building_assigned = e.building_assigned and e.employee_type = 'Contractor' and e.department_name = 'Animal Feeding'; 

select name from animal_info
where animal_type = 'Javan Rhino'; 

create view contractors
as select * from zoo_employee_info
where employee_type = 'Contractor';

select count(name) as "Number Of Male Gorillas" from animal_info
where gender = 'Male' and animal_type like '%orilla%';

select enclosure_assigned, count(animal_type)
from animal_info
where gender = 'Female'
group by enclosure_assigned;

select count(animal_type) as "Animals With No Name"
from animal_info
where name is null;

select first_name || ' ' || last_name as "Name"
from zoo_employee_info
where state = 'North Carolina' and contractor_name = 'Fliptune';

select animal_type, count(animal_type)
from animal_info

select department_name, count(employee_ssn) as "Number Of Employees"
from zoo_employee_info
group by department_name;

select department_name, number_of_employees as "Number Of Employees"
from zoo_department_info
where number_of_employees = (select max(number_of_employees) from zoo_department_info);
