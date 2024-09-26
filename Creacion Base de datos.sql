CREATE DATABASE  IF NOT EXISTS `exampleDB` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `exampleDB`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: exampleDB
-- ------------------------------------------------------
-- Server version	9.0.1

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
-- Table structure for table `Alumno`
--

DROP TABLE IF EXISTS `Alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Alumno` (
  `nroLibreta` int NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) NOT NULL,
  `dni` bigint DEFAULT NULL,
  `fechaNacimiento` date NOT NULL,
  `genero` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `direccion_id` int DEFAULT NULL,
  `alumnoCarrera` varbinary(255) DEFAULT NULL,
  PRIMARY KEY (`nroLibreta`),
  UNIQUE KEY `UK_i7t6tk197mqapln1teornwd68` (`dni`),
  KEY `FK4e74jwq75t2vtgfxr8tle7oli` (`direccion_id`),
  CONSTRAINT `FK4e74jwq75t2vtgfxr8tle7oli` FOREIGN KEY (`direccion_id`) REFERENCES `Direccion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Alumno`
--

LOCK TABLES `Alumno` WRITE;
/*!40000 ALTER TABLE `Alumno` DISABLE KEYS */;
INSERT INTO `Alumno` VALUES (1,'Pérez',12345678,'1995-05-15','Masculino','Juan',1,NULL),(2,'González',87654321,'1994-07-20','Femenino','Ana',2,NULL),(3,'Rodríguez',23456789,'1993-03-30','Masculino','Luis',3,NULL),(4,'Fernández',34567890,'1995-12-25','Femenino','María',4,NULL),(5,'Lopez',45678901,'1996-01-10','Masculino','Carlos',5,NULL),(6,'Sánchez',56789012,'1992-09-15','Femenino','Lucía',6,NULL),(7,'García',67890123,'1994-04-04','Masculino','Martín',7,NULL),(8,'Martínez',78901234,'1991-11-11','Femenino','Valeria',8,NULL),(9,'Díaz',89012345,'1995-06-20','Masculino','Fernando',9,NULL),(10,'Álvarez',90123456,'1990-08-18','Femenino','Silvia',10,NULL),(11,'Torres',11111111,'1995-05-15','Masculino','Joaquín',11,NULL),(12,'Ramírez',22222222,'1994-07-20','Femenino','Claudia',12,NULL),(13,'Ponce',33333333,'1993-03-30','Masculino','Diego',13,NULL),(14,'Castro',44444444,'1995-12-25','Femenino','Carla',14,NULL),(15,'Cabrera',55555555,'1996-01-10','Masculino','Nicolás',15,NULL),(16,'Mendoza',66666666,'1992-09-15','Femenino','Romina',16,NULL),(17,'Sosa',77777777,'1994-04-04','Masculino','Lucas',17,NULL),(18,'Ríos',88888888,'1991-11-11','Femenino','Cecilia',13,NULL),(19,'Vargas',99999999,'1995-06-20','Masculino','Alberto',12,NULL),(20,'Cano',10101010,'1990-08-18','Femenino','Inés',12,NULL);
/*!40000 ALTER TABLE `Alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AlumnoCarrera`
--

DROP TABLE IF EXISTS `AlumnoCarrera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `AlumnoCarrera` (
  `idCarrera` int NOT NULL,
  `nroLibreta` int NOT NULL,
  `fechaInscripcion` date NOT NULL,
  `finalizada` bit(1) NOT NULL,
  `alumno_nroLibreta` int NOT NULL,
  `anioInscripcion` int NOT NULL,
  PRIMARY KEY (`idCarrera`,`nroLibreta`),
  KEY `FKp9bxlgrd3iat6w70bx417f0wy` (`nroLibreta`),
  CONSTRAINT `FK6nv6gmt37t0jmxan8oiwfsfms` FOREIGN KEY (`idCarrera`) REFERENCES `Carrera` (`idCarrera`),
  CONSTRAINT `FKp9bxlgrd3iat6w70bx417f0wy` FOREIGN KEY (`nroLibreta`) REFERENCES `Alumno` (`nroLibreta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AlumnoCarrera`
--

LOCK TABLES `AlumnoCarrera` WRITE;
/*!40000 ALTER TABLE `AlumnoCarrera` DISABLE KEYS */;
INSERT INTO `AlumnoCarrera` VALUES (2,5,'2023-02-20',_binary '',0,2024),(3,2,'2023-03-10',_binary '\0',0,2023),(4,10,'2023-01-30',_binary '',0,2024),(5,15,'2023-04-25',_binary '\0',0,2023),(6,3,'2023-05-15',_binary '',0,2024),(7,1,'2023-01-15',_binary '\0',0,2023),(7,7,'2023-06-20',_binary '\0',0,2020),(8,12,'2023-03-12',_binary '',0,2023),(9,14,'2023-08-05',_binary '\0',0,2021),(10,18,'2023-09-01',_binary '',0,2023);
/*!40000 ALTER TABLE `AlumnoCarrera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Carrera`
--

DROP TABLE IF EXISTS `Carrera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Carrera` (
  `idCarrera` int NOT NULL AUTO_INCREMENT,
  `nombreCarrera` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idCarrera`),
  UNIQUE KEY `UK_ags72l5h1v2d5jy0ivf6b3xag` (`nombreCarrera`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Carrera`
--

LOCK TABLES `Carrera` WRITE;
/*!40000 ALTER TABLE `Carrera` DISABLE KEYS */;
INSERT INTO `Carrera` VALUES (7,'Administración de Empresas'),(2,'Arquitectura'),(8,'Biología'),(6,'Contaduría Pública'),(5,'Derecho'),(10,'Física'),(1,'Ingeniería en Sistemas'),(4,'Medicina'),(3,'Psicología'),(9,'Química');
/*!40000 ALTER TABLE `Carrera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Direccion`
--

DROP TABLE IF EXISTS `Direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Direccion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ciudad` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Direccion`
--

LOCK TABLES `Direccion` WRITE;
/*!40000 ALTER TABLE `Direccion` DISABLE KEYS */;
INSERT INTO `Direccion` VALUES (1,'La Plata'),(2,'Mar del Plata'),(3,'Bahía Blanca'),(4,'Tandil'),(5,'Necochea'),(6,'Pilar'),(7,'San Nicolás'),(8,'San Fernando'),(9,'Zárate'),(10,'Avellaneda'),(11,'Lanús'),(12,'Morón'),(13,'Lomas de Zamora'),(14,'Quilmes'),(15,'Berazategui'),(16,'Esteban Echeverría'),(17,'Ituzaingó');
/*!40000 ALTER TABLE `Direccion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-26  2:25:05
