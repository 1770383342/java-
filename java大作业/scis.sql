/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : scis

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-06-08 12:50:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `ID` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('111', '111');

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `Cno` varchar(10) NOT NULL,
  `Cname` varchar(40) NOT NULL,
  `Ccredit` float(2,1) DEFAULT NULL,
  PRIMARY KEY (`Cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('001', 'java', '4.0');
INSERT INTO `course` VALUES ('002', 'c', '4.0');
INSERT INTO `course` VALUES ('003', 'c++', '4.0');
INSERT INTO `course` VALUES ('004', 'c#', '4.0');
INSERT INTO `course` VALUES ('005', '网页设计', '4.0');

-- ----------------------------
-- Table structure for `result`
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `Sno` varchar(12) NOT NULL,
  `Cno` varchar(10) NOT NULL,
  `Grade` smallint(3) DEFAULT NULL,
  `Point` float(2,1) DEFAULT NULL,
  PRIMARY KEY (`Sno`,`Cno`),
  KEY `Cno` (`Cno`),
  CONSTRAINT `result_ibfk_1` FOREIGN KEY (`Sno`) REFERENCES `student` (`ID`),
  CONSTRAINT `result_ibfk_2` FOREIGN KEY (`Cno`) REFERENCES `course` (`Cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of result
-- ----------------------------
INSERT INTO `result` VALUES ('0001', '005', '90', '4.0');
INSERT INTO `result` VALUES ('0002', '005', '92', '4.0');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `ID` varchar(12) NOT NULL,
  `Sname` varchar(20) NOT NULL,
  `Ssex` varchar(2) NOT NULL,
  `Sbirth` date DEFAULT NULL,
  `Stel` varchar(15) DEFAULT NULL,
  `Sacademy` varchar(20) NOT NULL,
  `Sclass` varchar(20) NOT NULL,
  `Saddress` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Stel` (`Stel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('0001', '小李', '男', '1994-01-13', '1350000000', '计算机科学与技术学院', '计科1501班', '重庆师范大学');
INSERT INTO `student` VALUES ('0002', '小红', '女', '1997-01-24', '135000000', '计算机科学与技术学院', '计科1501班', '重庆师范大学');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `ID` varchar(12) NOT NULL,
  `Tname` varchar(20) NOT NULL,
  `Tbirth` date DEFAULT NULL,
  `Tprotitle` varchar(6) DEFAULT NULL,
  `Cno` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Cno` (`Cno`),
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`Cno`) REFERENCES `course` (`Cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('0001', '王老师', '1966-01-20', '讲师', '005');
INSERT INTO `teacher` VALUES ('0002', '李老师', '1980-01-07', '副教授', '002');
INSERT INTO `teacher` VALUES ('0003', '周老师', '1983-01-25', '副教授', '003');
