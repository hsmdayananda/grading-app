DROP TABLE IF EXISTS `results`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `results` (
  `id` int NOT NULL AUTO_INCREMENT,
  `assignment_id` varchar(255) DEFAULT NULL,
  `attempt` int NOT NULL,
  `quest` varchar(2500) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `results` WRITE;
/*!40000 ALTER TABLE `results` DISABLE KEYS */;
INSERT INTO `results` VALUES (1,'001',1,'{\n  \"questId\": \"001\",\n  \"question1\": {\n    \"description\": \"select odd numbers from below\",\n    \"values\": \"A:8&B:3&C:1&D:4\",\n    \"answer\": \"B&C\",\n    \"timeSpent\": 10,\n    \"status\": \"correct\",\n    \"studentAnswer\": \"B&C\"\n  },\n  \"question2\": {\n    \"description\": \"select even numbers from below\",\n    \"values\": \"A:8&B:3&C:1&D:4\",\n    \"answer\": \"A&D\",\n    \"timeSpent\": 20,\n    \"status\": \"partially\",\n    \"studentAnswer\": \"A\"\n  }\n{\"questId\":\"001\",\"question1\":{\"description\":\"select odd numbers from below\",\"values\":\"A:8&B:3&C:1&D:4\",\"answer\":\"B&C\",\"timeSpent\":10,\"status\":\"correct\",\"studentAnswer\":\"B&C\"},\"question2\":{\"description\":\"select even numbers from below\",\"values\":\"A:8&B:3&C:1&D:4\",\"answer\":\"A&D\",\"timeSpent\":20,\"status\":\"partially\",\"studentAnswer\":\"A\"}}','hsmdayananda'),(2,'002',2,'{\"questId\":\"001\",\"question1\":{\"description\":\"select odd numbers from below\",\"values\":\"A:8&B:3&C:1&D:4\",\"answer\":\"B&C\",\"timeSpent\":10,\"status\":\"correct\",\"studentAnswer\":\"B&C\"},\"question2\":{\"description\":\"select even numbers from below\",\"values\":\"A:8&B:3&C:1&D:4\",\"answer\":\"A&D\",\"timeSpent\":20,\"status\":\"partially\",\"studentAnswer\":\"A\"}}','hsmdayananda');
/*!40000 ALTER TABLE `results` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- MySQL dump 10.13  Distrib 8.0.13, for macos10.14 (x86_64)
--
-- Host: localhost    Database: exam
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `stats`
--

DROP TABLE IF EXISTS `stats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `stats` (
  `id` int NOT NULL AUTO_INCREMENT,
  `assignment_id` varchar(255) DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `result_quest` varchar(2500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stats`
--

LOCK TABLES `stats` WRITE;
/*!40000 ALTER TABLE `stats` DISABLE KEYS */;
INSERT INTO `stats` VALUES (1,'001','FIT','{\"grading\":{\"A\":10,\"B\":30,\"C\":50,\"D\":10},\"question\":{\"question1\":{\"time\":10,\"correct\":10,\"incorrect\":20},\"question2\":{\"time\":10,\"correct\":10,\"incorrect\":20}}}'),(2,'002','FIT','{\"grading\":{\"A\":10,\"B\":30,\"C\":50,\"D\":10},\"question\":{\"question1\":{\"time\":10,\"correct\":10,\"incorrect\":20},\"question2\":{\"time\":10,\"correct\":10,\"incorrect\":20}}}');
/*!40000 ALTER TABLE `stats` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-25 13:58:02
