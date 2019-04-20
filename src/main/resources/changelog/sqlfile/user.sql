SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(10) NOT NULL,
  `name` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL,
  `age` int(3) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `user` VALUES ('1', 'sss', 'aaaaaa', '25', '男');
INSERT INTO `user` VALUES ('2', 'sssd', 'dada', null, null);
INSERT INTO `user` VALUES ('o1oe', '我的世界', '123456', '10', '');
INSERT INTO `user` VALUES ('ooe', '我的世界', '123456', '52', '女');
