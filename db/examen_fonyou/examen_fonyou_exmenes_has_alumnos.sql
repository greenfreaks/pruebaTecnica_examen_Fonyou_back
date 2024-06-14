-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: examen_fonyou
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.21-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `exmenes_has_alumnos`
--

DROP TABLE IF EXISTS `exmenes_has_alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exmenes_has_alumnos` (
  `calificacion` float DEFAULT NULL,
  `alumno_id` bigint(20) DEFAULT NULL,
  `examen_id` bigint(20) DEFAULT NULL,
  `id_examen_has_alumno` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_examen_has_alumno`),
  KEY `FKp0oqi6upcchmemjwjtw5p5be7` (`alumno_id`),
  KEY `FKsh7pn2sh994ulp3keqakntt8b` (`examen_id`),
  CONSTRAINT `FKp0oqi6upcchmemjwjtw5p5be7` FOREIGN KEY (`alumno_id`) REFERENCES `alumnos` (`id_alumno`),
  CONSTRAINT `FKsh7pn2sh994ulp3keqakntt8b` FOREIGN KEY (`examen_id`) REFERENCES `examenes` (`id_examen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exmenes_has_alumnos`
--

LOCK TABLES `exmenes_has_alumnos` WRITE;
/*!40000 ALTER TABLE `exmenes_has_alumnos` DISABLE KEYS */;
/*!40000 ALTER TABLE `exmenes_has_alumnos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-14 17:34:09
