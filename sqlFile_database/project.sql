use nucs;
CREATE TABLE fall2023(
batch varchar(5),
name varchar(50),
cnic varchar(50),
email varchar(30),
phoneNo varchar(50),
preference varchar(20),
fatherName varchar(20),
fatherCnic varchar(20),
address varchar(100)
);
insert into fall2023 values("23", "Fiza Ahmad", "3650259070334","fizaahmad@gmail.com","03090732287",  "BS(CS)",  "Sher Ahmad Zafar", "3650259070335", "G10-ISB");
insert into fall2023 values("23", "Sania Sajjad", "3650259070335","saniasajjad@gmail.com","03090732288",  "BS(CS)",  "Sajjad", "3650259070336", "G11-ISB");
insert into fall2023 values("23", "Alishba Nadeem", "3650259070337","alishbanadeem@gmail.com","03090732289",  "BS(CS)",  "Nadeem", "365025907038", "G13-ISB");
insert into fall2023 values("23", "Momina Minahil", "3650259070339","mominaminahil@gmail.com","03090732280",  "BS(CS)",  "Safdar", "365025907040", "D12-ISB");
insert into fall2023 values("23", "Hashir Abbasi", "3650259070341","hashirabbasi@gmail.com","03090732281",  "BS(CS)",  "Shezad", "365025907042", "F6-ISB");
insert into fall2023 values("23", "Abdullah Saqib", "3650259070343","abdullahsaqib@gmail.com","03090732282",  "BS(CS)",  "Saqib", "365025907044", "F7-ISB");
insert into fall2023 values("23", "Rayed Saeed", "3650259070345","rayedsaeed@gmail.com","03090732283",  "BS(CS)",  "Saeed", "365025907046", "I8-ISB");
insert into fall2023 values("23", "Umar Waheed", "3650259070347","umarwaheed@gmail.com","03090732284",  "BS(CS)",  "Waheed", "365025907048", "E11-ISB");
insert into fall2023 values("23", "Abdul Muiz", "3650259070349","abdulmuiz@gmail.com","03090732285",  "BS(CS)",  "Rehman", "365025907050", "G6-ISB");
insert into fall2023 values("23", "Fatima Ahmad", "3650259070351","fatimaahmad@gmail.com","03090732286",  "BS(CS)",  "Ahmad", "365025907052", "F8-ISB");
insert into fall2023 values("23", "Ayesha Nadeem", "3650259070353","ayeshanadeem@gmail.com","03090732290",  "BS(CS)",  "Nadeem", "365025907054", "F10-ISB");
insert into fall2023 values("23", "Maryam Majeed", "3650259070355","maryammajeed@gmail.com","03090732291",  "BS(CS)",  "Majeed", "365025907056", "F11-ISB");
SELECT * FROM fall2023;
-- ----------------------------ADMISSION INFORMATION
DROP TABLE if exists admissionform;
CREATE TABLE admissionform(
batch varchar(5),
name varchar(50),
cnic varchar(50),
email varchar(30),
phoneNo varchar(50),
preference varchar(20),
fatherName varchar(20),
fatherCnic varchar(20),
address varchar(100)
);
insert into admissionform values("23", "Fiza Ahmad", "3650259070334","fizaahmad@gmail.com","03090732287",  "BS(CS)",  "Sher Ahmad Zafar", "3650259070335", "G10-ISB");
insert into admissionform values("23", "Sania Sajjad", "3650259070335","saniasajjad@gmail.com","03090732288",  "BS(CS)",  "Sajjad", "3650259070336", "G11-ISB");
insert into admissionform values("23", "Alishba Nadeem", "3650259070337","alishbanadeem@gmail.com","03090732289",  "BS(CS)",  "Nadeem", "365025907038", "G13-ISB");
insert into admissionform values("23", "Momina Minahil", "3650259070339","mominaminahil@gmail.com","03090732280",  "BS(CS)",  "Safdar", "365025907040", "D12-ISB");
insert into admissionform values("23", "Hashir Abbasi", "3650259070341","hashirabbasi@gmail.com","03090732281",  "BS(CS)",  "Shezad", "365025907042", "F6-ISB");
insert into admissionform values("23", "Abdullah Saqib", "3650259070343","abdullahsaqib@gmail.com","03090732282",  "BS(CS)",  "Saqib", "365025907044", "F7-ISB");
insert into admissionform values("23", "Rayed Saeed", "3650259070345","rayedsaeed@gmail.com","03090732283",  "BS(CS)",  "Saeed", "365025907046", "I8-ISB");
insert into admissionform values("23", "Umar Waheed", "3650259070347","umarwaheed@gmail.com","03090732284",  "BS(CS)",  "Waheed", "365025907048", "E11-ISB");
insert into admissionform values("23", "Abdul Muiz", "3650259070349","abdulmuiz@gmail.com","03090732285",  "BS(CS)",  "Rehman", "365025907050", "G6-ISB");
insert into admissionform values("23", "Fatima Ahmad", "3650259070351","fatimaahmad@gmail.com","03090732286",  "BS(CS)",  "Ahmad", "365025907052", "F8-ISB");
insert into admissionform values("23", "Ayesha Nadeem", "3650259070353","ayeshanadeem@gmail.com","03090732290",  "BS(CS)",  "Nadeem", "365025907054", "F10-ISB");
insert into admissionform values("23", "Maryam Majeed", "3650259070355","maryammajeed@gmail.com","03090732291",  "BS(CS)",  "Majeed", "365025907056", "F11-ISB");
SELECT * FROM admissionform;
-- ----------------------------STUDENT INFORMATION
CREATE TABLE studentInfo(
name varchar(50),
cnic varchar(20),
rollNo varchar(10),
address varchar(80),
phoneNo varchar(15),
primary key(rollNo)
);
insert into studentInfo values("Raffy Ahmad", "3650259070334","230001","G10-ISB","03070832287");
insert into studentInfo values("Aiza Tayyab", "3650259070334","230002","G10-ISB","03090432287");
insert into studentInfo values("Malaika Shahid", "3650259070334","230003","G10-ISB","03350732287");
insert into studentInfo values("Idrees Zohrab", "3650259070334","230004","G10-ISB","03097732287");
insert into studentInfo values("Taimur Syed", "3650259070334","230005","G10-ISB","03045732287");
insert into studentInfo values("Hassan Raza", "3650259070334","230006","G10-ISB","03013732287");
insert into studentInfo values("Syed Hassan", "3650259070334","230007","G10-ISB","03076732287");
insert into studentInfo values("Zeeshan Ali", "3650259070334","230008","G10-ISB","03013461154");
insert into studentInfo values("Ali Ammar", "3650259070334","230009","G10-ISB","03041005154");
select * from studentInfo;
Drop table studentInfo;
delete from studentInfo where rollNo = '230010';

-- ----------------------------STUDENT ACCOUNT INFORMATION
DROP TABLE if exists studentAccount;
CREATE TABLE studentAccount(
username varchar(50),
password varchar(50),
primary key(username,password)
);
SELECT * FROM studentAccount;
-- ----------------------------COURSES INFORMATION
CREATE TABLE courses(
name varchar(50),
creditHrs int,
type varchar(15),
primary key(name)
);
select * from courses;
insert into courses values("sda",3,"Core");
insert into courses values("oop",3,"Core");
insert into courses values("data",3,"Core");
DROP table courses;

-- ----------------------------STUDENT'S COURSES INFORMATION
CREATE TABLE studentCourses(
name varchar(50),
rollNo varchar(10),
Foreign key (name) references courses(name) on update cascade on delete cascade,
Foreign key (rollNo) references studentInfo(rollNo)on update cascade on delete cascade,
primary key(name)
);
 insert into studentCourses values("sda","123");
 insert into studentCourses values("oop","123");
 insert into studentCourses values("data","123");

Select c.name
from studentCourses c, studentInfo
Where studentInfo.rollNo = '123';
DROP table studentCourses;

-- ----------------------------FACULTY MEMBER INFORMATION
DROP TABLE if exists facultyinfo;
CREATE TABLE facultyInfo(
fname varchar(50),
lname varchar(50),
cnic varchar(20),
address varchar(80),
phoneNo varchar(15) 
);
insert into facultyInfo values("Hira","Naveed", "3650259077355","G10-ISB","03070832287");
insert into facultyInfo values("Ali","Raza", "3650259073256","G11-ISB","03070832256");
insert into facultyInfo values("Khadija","Irfan", "3650259078744","D12-ISB","030708322863");
insert into facultyInfo values("Hamda","Khan", "3650259076233","F10-ISB","03070832273");
insert into facultyInfo values("Usman","Rashid", "3650259071452","F6-ISB","03070832273");
insert into facultyInfo values("Faisal","Cheema", "3650259076312","F8-ISB","03070832226");
insert into facultyInfo values("Javeria","Zia", "3650259078337","G13-ISB","03070832228");
insert into facultyInfo values("Arsalan","Sheikh", "3650259072336","G6-ISB","03070832274");
insert into facultyInfo values("Shahzeb","Khan", "3650259071335","I8-ISB","03070832255");
select * from facultyInfo;


-- ----------------------------FACULTY ACCOUNT INFORMATION
CREATE TABLE facultyAccount(
username varchar(50),
password varchar(50)
);
SELECT * FROM facultyAccount;
DROP TABLE if exists facultyAccount;

-- ----------------------------ATTENDENCE INFORMATION
Drop table if exists attendence;
CREATE TABLE attendence(
rollno varchar(50),
name varchar(50),
att varchar(50)
);
select * from attendence;

-- ----------------------------STUDENT CARD INFORMATION
CREATE TABLE studentCard(
name varchar(50),
pin varchar(50),
cardno numeric(30),
balance varchar(50),
gym_subs boolean,
expiry_date varchar(20)
);





