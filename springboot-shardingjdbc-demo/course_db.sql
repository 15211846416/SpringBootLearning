/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : course_db

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 08/05/2022 17:56:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course_1
-- ----------------------------
DROP TABLE IF EXISTS `course_1`;
CREATE TABLE `course_1`  (
  `cid` bigint(20) NOT NULL,
  `cname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `cstatus` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_1
-- ----------------------------
INSERT INTO `course_1` VALUES (730113707039784960, 'java2', 100, 'Normal2');
INSERT INTO `course_1` VALUES (730113707085922304, 'java4', 100, 'Normal4');
INSERT INTO `course_1` VALUES (730113707136253952, 'java6', 100, 'Normal6');
INSERT INTO `course_1` VALUES (730113707182391296, 'java8', 100, 'Normal8');
INSERT INTO `course_1` VALUES (730113707220140032, 'java10', 100, 'Normal10');

-- ----------------------------
-- Table structure for course_2
-- ----------------------------
DROP TABLE IF EXISTS `course_2`;
CREATE TABLE `course_2`  (
  `cid` bigint(20) NOT NULL,
  `cname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `cstatus` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_2
-- ----------------------------
INSERT INTO `course_2` VALUES (730113706444193793, 'java1', 100, 'Normal1');
INSERT INTO `course_2` VALUES (730113707064950785, 'java3', 100, 'Normal3');
INSERT INTO `course_2` VALUES (730113707111088129, 'java5', 100, 'Normal5');
INSERT INTO `course_2` VALUES (730113707157225473, 'java7', 100, 'Normal7');
INSERT INTO `course_2` VALUES (730113707199168513, 'java9', 100, 'Normal9');

SET FOREIGN_KEY_CHECKS = 1;
