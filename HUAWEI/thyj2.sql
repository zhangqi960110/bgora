/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : thyj2

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2018-12-05 20:11:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE department (
  id bigint(20) NOT NULL,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `equipmentfile`
-- ----------------------------
DROP TABLE IF EXISTS `equipmentfile`;
CREATE TABLE equipmentfile (
  id int(11) NOT NULL AUTO_INCREMENT,
  eid int(11) DEFAULT NULL,
  filename varchar(255) DEFAULT NULL,
  code varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipmentfile
-- ----------------------------
INSERT INTO `equipmentfile` VALUES ('7', '1', '2018120312125319884.jpg', '86015711');
INSERT INTO `equipmentfile` VALUES ('8', '2', '2018120312125480065.jpg', '86015712');
INSERT INTO `equipmentfile` VALUES ('9', '3', '2018120312125417958.jpg', '86015713');
INSERT INTO `equipmentfile` VALUES ('10', '6', '2018120312125454449.jpg', '86015714');
INSERT INTO `equipmentfile` VALUES ('11', '7', '2018120312125484323.jpg', '86015715');
INSERT INTO `equipmentfile` VALUES ('12', '8', '2018120312125478244.jpg', '86015716');
INSERT INTO `equipmentfile` VALUES ('13', '9', '2018120312125443071.jpg', '86015717');
INSERT INTO `equipmentfile` VALUES ('14', '10', '2018120312125442602.jpg', '86015718');
INSERT INTO `equipmentfile` VALUES ('15', '11', '2018120312125413091.jpg', '86015719');
INSERT INTO `equipmentfile` VALUES ('16', '12', '2018120312125490536.jpg', '86015720');
INSERT INTO `equipmentfile` VALUES ('17', '13', '2018120312125411712.jpg', '86015721');
INSERT INTO `equipmentfile` VALUES ('18', '14', '2018120312125434278.jpg', '86015722');
INSERT INTO `equipmentfile` VALUES ('19', '15', '2018120312125491855.jpg', '86015723');
INSERT INTO `equipmentfile` VALUES ('20', '16', '2018120312125427311.jpg', '86015724');
INSERT INTO `equipmentfile` VALUES ('21', '17', '2018120312125432575.jpg', '86015725');
INSERT INTO `equipmentfile` VALUES ('22', '18', '2018120312125424855.jpg', '86015726');
INSERT INTO `equipmentfile` VALUES ('23', '19', '2018120312125413627.jpg', '86015727');
INSERT INTO `equipmentfile` VALUES ('24', '20', '2018120312125487585.jpg', '86015728');
INSERT INTO `equipmentfile` VALUES ('25', '21', '2018120312125412604.jpg', '86015729');
INSERT INTO `equipmentfile` VALUES ('26', '22', '2018120312125467898.jpg', '86015731');
INSERT INTO `equipmentfile` VALUES ('27', '23', '2018120312125484327.jpg', '86015732');
INSERT INTO `equipmentfile` VALUES ('28', '24', '2018120312125474280.jpg', '86015733');
INSERT INTO `equipmentfile` VALUES ('29', '25', '2018120312125419921.jpg', '86015734');
INSERT INTO `equipmentfile` VALUES ('30', '26', '2018120312125433717.jpg', '86015735');
INSERT INTO `equipmentfile` VALUES ('31', '27', '2018120312125420023.jpg', '86015736');
INSERT INTO `equipmentfile` VALUES ('32', '28', '2018120312125461877.jpg', '86015737');
INSERT INTO `equipmentfile` VALUES ('33', '29', '2018120312125487826.jpg', '86015738');
INSERT INTO `equipmentfile` VALUES ('34', '30', '2018120312125416492.jpg', '86015739');
INSERT INTO `equipmentfile` VALUES ('35', '31', '2018120312125442300.jpg', '86015741');
INSERT INTO `equipmentfile` VALUES ('36', '32', '2018120312125487281.jpg', '86015742');
INSERT INTO `equipmentfile` VALUES ('37', '33', '2018120312125446557.jpg', '86015743');
INSERT INTO `equipmentfile` VALUES ('38', '34', '2018120312125440440.jpg', '86015744');
INSERT INTO `equipmentfile` VALUES ('39', '35', '2018120312125416618.jpg', '86015745');
INSERT INTO `equipmentfile` VALUES ('40', '36', '2018120312125472587.jpg', '86015746');
INSERT INTO `equipmentfile` VALUES ('41', '37', '2018120312125459967.jpg', '86015747');
INSERT INTO `equipmentfile` VALUES ('42', '38', '2018120312125456688.jpg', '86015748');
INSERT INTO `equipmentfile` VALUES ('43', '39', '2018120312125413471.jpg', '86015749');
INSERT INTO `equipmentfile` VALUES ('44', '40', '2018120312125415354.jpg', '86015751');
INSERT INTO `equipmentfile` VALUES ('45', '41', '2018120312125416253.jpg', '86015761');
INSERT INTO `equipmentfile` VALUES ('46', '42', '2018120312125467681.jpg', '86015762');
INSERT INTO `equipmentfile` VALUES ('47', '43', '2018120312125423721.jpg', '86015763');
INSERT INTO `equipmentfile` VALUES ('48', '44', '2018120312125487993.jpg', '86015764');
INSERT INTO `equipmentfile` VALUES ('49', '45', '2018120312125445465.jpg', '86015765');
INSERT INTO `equipmentfile` VALUES ('50', '46', '2018120312125465245.jpg', '86015766');
INSERT INTO `equipmentfile` VALUES ('51', '47', '2018120312125437553.jpg', '86015767');
INSERT INTO `equipmentfile` VALUES ('52', '48', '2018120312125442894.jpg', '86015768');
INSERT INTO `equipmentfile` VALUES ('53', '49', '2018120312125491618.jpg', '86015769');
INSERT INTO `equipmentfile` VALUES ('55', '51', '2018120313353249398.jpg', '123');
INSERT INTO `equipmentfile` VALUES ('60', '56', '2018120317234866483.jpg', 'abc');
INSERT INTO `equipmentfile` VALUES ('61', '57', '2018120317244454500.jpg', 'abcd');
INSERT INTO `equipmentfile` VALUES ('62', '58', '2018120318193477860.jpg', '12346789');
INSERT INTO `equipmentfile` VALUES ('63', '59', '2018120318391773147.jpg', 'hahadaa');
INSERT INTO `equipmentfile` VALUES ('64', '1', '2018120318391798621.jpg', '86015711');
INSERT INTO `equipmentfile` VALUES ('65', '2', '2018120318391799746.jpg', '86015712');
INSERT INTO `equipmentfile` VALUES ('66', '3', '2018120318391743406.jpg', '86015713');
INSERT INTO `equipmentfile` VALUES ('67', '6', '2018120318391743915.jpg', '86015714');
INSERT INTO `equipmentfile` VALUES ('68', '7', '2018120318391756261.jpg', '86015715');
INSERT INTO `equipmentfile` VALUES ('69', '8', '2018120318391731802.jpg', '86015716');
INSERT INTO `equipmentfile` VALUES ('70', '9', '2018120318391818765.jpg', '86015717');
INSERT INTO `equipmentfile` VALUES ('71', '10', '2018120318391873993.jpg', '86015718');
INSERT INTO `equipmentfile` VALUES ('72', '11', '2018120318391816659.jpg', '86015719');
INSERT INTO `equipmentfile` VALUES ('73', '12', '2018120318391824264.jpg', '86015720');
INSERT INTO `equipmentfile` VALUES ('74', '13', '2018120318391862216.jpg', '86015721');
INSERT INTO `equipmentfile` VALUES ('75', '14', '2018120318391860733.jpg', '86015722');
INSERT INTO `equipmentfile` VALUES ('76', '15', '2018120318391814001.jpg', '86015723');
INSERT INTO `equipmentfile` VALUES ('77', '16', '2018120318391831489.jpg', '86015724');
INSERT INTO `equipmentfile` VALUES ('78', '17', '2018120318391855231.jpg', '86015725');
INSERT INTO `equipmentfile` VALUES ('79', '18', '2018120318391898910.jpg', '86015726');
INSERT INTO `equipmentfile` VALUES ('80', '19', '2018120318391892937.jpg', '86015727');
INSERT INTO `equipmentfile` VALUES ('81', '20', '2018120318391857085.jpg', '86015728');
INSERT INTO `equipmentfile` VALUES ('82', '21', '2018120318391818929.jpg', '86015729');
INSERT INTO `equipmentfile` VALUES ('83', '22', '2018120318391858850.jpg', '86015731');
INSERT INTO `equipmentfile` VALUES ('84', '23', '2018120318391891659.jpg', '86015732');
INSERT INTO `equipmentfile` VALUES ('85', '24', '2018120318391832835.jpg', '86015733');
INSERT INTO `equipmentfile` VALUES ('86', '25', '2018120318391889781.jpg', '86015734');
INSERT INTO `equipmentfile` VALUES ('87', '26', '2018120318391815824.jpg', '86015735');
INSERT INTO `equipmentfile` VALUES ('88', '27', '2018120318391852802.jpg', '86015736');
INSERT INTO `equipmentfile` VALUES ('89', '28', '2018120318391851814.jpg', '86015737');
INSERT INTO `equipmentfile` VALUES ('90', '29', '2018120318391818879.jpg', '86015738');
INSERT INTO `equipmentfile` VALUES ('91', '30', '2018120318391880937.jpg', '86015739');
INSERT INTO `equipmentfile` VALUES ('92', '31', '2018120318391851584.jpg', '86015741');
INSERT INTO `equipmentfile` VALUES ('93', '32', '2018120318391829430.jpg', '86015742');
INSERT INTO `equipmentfile` VALUES ('94', '33', '2018120318391846336.jpg', '86015743');
INSERT INTO `equipmentfile` VALUES ('95', '34', '2018120318391835852.jpg', '86015744');
INSERT INTO `equipmentfile` VALUES ('96', '35', '2018120318391858093.jpg', '86015745');
INSERT INTO `equipmentfile` VALUES ('97', '36', '2018120318391879661.jpg', '86015746');
INSERT INTO `equipmentfile` VALUES ('98', '37', '2018120318391847510.jpg', '86015747');
INSERT INTO `equipmentfile` VALUES ('99', '38', '2018120318391861127.jpg', '86015748');
INSERT INTO `equipmentfile` VALUES ('100', '39', '2018120318391875933.jpg', '86015749');
INSERT INTO `equipmentfile` VALUES ('101', '40', '2018120318391847598.jpg', '86015751');
INSERT INTO `equipmentfile` VALUES ('102', '41', '2018120318391855767.jpg', '86015761');
INSERT INTO `equipmentfile` VALUES ('103', '42', '2018120318391880682.jpg', '86015762');
INSERT INTO `equipmentfile` VALUES ('104', '43', '2018120318391822608.jpg', '86015763');
INSERT INTO `equipmentfile` VALUES ('105', '44', '2018120318391873558.jpg', '86015764');
INSERT INTO `equipmentfile` VALUES ('106', '45', '2018120318391847259.jpg', '86015765');
INSERT INTO `equipmentfile` VALUES ('107', '46', '2018120318391852977.jpg', '86015766');
INSERT INTO `equipmentfile` VALUES ('108', '47', '2018120318391867961.jpg', '86015767');
INSERT INTO `equipmentfile` VALUES ('109', '48', '2018120318391898478.jpg', '86015768');
INSERT INTO `equipmentfile` VALUES ('110', '49', '2018120318391826809.jpg', '86015769');
INSERT INTO `equipmentfile` VALUES ('111', '56', '2018120318391892845.jpg', 'abc');
INSERT INTO `equipmentfile` VALUES ('112', '57', '2018120318391825714.jpg', 'abcd');
INSERT INTO `equipmentfile` VALUES ('113', '58', '2018120318391865101.jpg', '12346789');
INSERT INTO `equipmentfile` VALUES ('114', '59', '2018120318391820410.jpg', 'hahadaa');
INSERT INTO `equipmentfile` VALUES ('115', '60', '2018120516071019382.jpg', 'abcde');

-- ----------------------------
-- Table structure for `hibernate_sequence`
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE hibernate_sequence (
  next_val bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for `i_login`
-- ----------------------------
DROP TABLE IF EXISTS `i_login`;
CREATE TABLE i_login (
  lid int(11) NOT NULL AUTO_INCREMENT,
  pid int(11) DEFAULT NULL,
  timestamp varchar(50) DEFAULT NULL,
  PRIMARY KEY (lid),
  KEY INDEX1 (pid),
  KEY INDEX2 (timestamp)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of i_login
-- ----------------------------
INSERT INTO `i_login` VALUES ('44', '3', '1539439113');
INSERT INTO `i_login` VALUES ('45', '3', '1539439113');
INSERT INTO `i_login` VALUES ('47', '3', '1539439113');
INSERT INTO `i_login` VALUES ('49', '3', '1539439113');
INSERT INTO `i_login` VALUES ('51', '3', '1539439113');
INSERT INTO `i_login` VALUES ('53', '3', '1539439113');
INSERT INTO `i_login` VALUES ('54', '1', '1539439113');
INSERT INTO `i_login` VALUES ('55', '1', '1539439113');
INSERT INTO `i_login` VALUES ('56', '3', '1539439113');
INSERT INTO `i_login` VALUES ('57', '1', '1539439113');
INSERT INTO `i_login` VALUES ('58', '1', '1539439113');
INSERT INTO `i_login` VALUES ('60', '1', '1543982724');
INSERT INTO `i_login` VALUES ('61', '3', '1543982829');
INSERT INTO `i_login` VALUES ('62', '3', '1543982939');
INSERT INTO `i_login` VALUES ('63', '1', '1543983020');
INSERT INTO `i_login` VALUES ('64', '1', '1543986517');
INSERT INTO `i_login` VALUES ('65', '1', '1543987531');
INSERT INTO `i_login` VALUES ('66', '1', '1543987705');
INSERT INTO `i_login` VALUES ('67', '1', '1543995215');
INSERT INTO `i_login` VALUES ('68', '1', '1543995612');
INSERT INTO `i_login` VALUES ('69', '1', '1543995808');
INSERT INTO `i_login` VALUES ('70', '1', '1543995918');
INSERT INTO `i_login` VALUES ('71', '1', '1543997057');
INSERT INTO `i_login` VALUES ('72', '1', '1543999226');
INSERT INTO `i_login` VALUES ('73', '1', '1543999313');
INSERT INTO `i_login` VALUES ('74', '1', '1543999392');
INSERT INTO `i_login` VALUES ('75', '1', '1543999421');
INSERT INTO `i_login` VALUES ('76', '1', '1543999650');
INSERT INTO `i_login` VALUES ('77', '1', '1543999678');
INSERT INTO `i_login` VALUES ('78', '1', '1543999826');
INSERT INTO `i_login` VALUES ('79', '1', '1543999920');
INSERT INTO `i_login` VALUES ('80', '1', '1544000045');
INSERT INTO `i_login` VALUES ('81', '1', '1544000355');
INSERT INTO `i_login` VALUES ('82', '1', '1544000637');
INSERT INTO `i_login` VALUES ('83', '1', '1544000700');
INSERT INTO `i_login` VALUES ('84', '1', '1544000715');
INSERT INTO `i_login` VALUES ('85', '1', '1544001560');
INSERT INTO `i_login` VALUES ('86', '1', '1544001604');
INSERT INTO `i_login` VALUES ('87', '1', '1544009215');
INSERT INTO `i_login` VALUES ('88', '1', '1544009847');
INSERT INTO `i_login` VALUES ('89', '1', '1544009876');
INSERT INTO `i_login` VALUES ('90', '1', '1544010413');
INSERT INTO `i_login` VALUES ('91', '2', '1544011156');
INSERT INTO `i_login` VALUES ('92', '2', '1544011226');
INSERT INTO `i_login` VALUES ('93', '2', '1544011283');
INSERT INTO `i_login` VALUES ('94', '2', '1544011304');

-- ----------------------------
-- Table structure for `i_operate`
-- ----------------------------
DROP TABLE IF EXISTS `i_operate`;
CREATE TABLE i_operate (
  oid int(11) NOT NULL AUTO_INCREMENT,
  pid int(11) DEFAULT NULL,
  info varchar(2048) DEFAULT NULL,
  timestamp varchar(40) DEFAULT NULL,
  PRIMARY KEY (oid),
  KEY INDEX1 (pid),
  KEY INDEX2 (timestamp)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of i_operate
-- ----------------------------
INSERT INTO `i_operate` VALUES ('43', '1', '删除操作记录', '1543997089');
INSERT INTO `i_operate` VALUES ('44', '1', '修改客户', '1543997122');
INSERT INTO `i_operate` VALUES ('45', '1', '修改客户', '1543997148');
INSERT INTO `i_operate` VALUES ('46', '1', '修改客户', '1543997158');
INSERT INTO `i_operate` VALUES ('47', '1', '修改客户', '1543997192');
INSERT INTO `i_operate` VALUES ('48', '1', '修改客户', '1543997200');
INSERT INTO `i_operate` VALUES ('49', '1', '添加设备', '1543997230');
INSERT INTO `i_operate` VALUES ('50', '1', '修改合同', '1543997311');
INSERT INTO `i_operate` VALUES ('51', '1', '修改合同', '1543997322');
INSERT INTO `i_operate` VALUES ('52', '1', '修改合同', '1543997331');
INSERT INTO `i_operate` VALUES ('53', '1', '修改客户', '1543997560');
INSERT INTO `i_operate` VALUES ('54', '1', '修改客户', '1543999706');
INSERT INTO `i_operate` VALUES ('55', '1', '修改客户', '1543999835');
INSERT INTO `i_operate` VALUES ('56', '1', '修改客户', '1543999855');
INSERT INTO `i_operate` VALUES ('57', '1', '修改客户', '1543999870');
INSERT INTO `i_operate` VALUES ('58', '1', '修改客户', '1543999926');
INSERT INTO `i_operate` VALUES ('59', '1', '修改客户', '1543999933');
INSERT INTO `i_operate` VALUES ('60', '1', '修改客户', '1544009989');
INSERT INTO `i_operate` VALUES ('61', '1', '修改客户', '1544010002');
INSERT INTO `i_operate` VALUES ('62', '1', '修改客户', '1544010045');

-- ----------------------------
-- Table structure for `i_sale`
-- ----------------------------
DROP TABLE IF EXISTS `i_sale`;
CREATE TABLE i_sale (
  oid bigint(20) NOT NULL,
  eid bigint(20) NOT NULL,
  KEY UK_7nhtmm1dfjkq0gvi2ti2irpib (eid) USING BTREE,
  KEY FKsrgvcpt0t002ald2aa8c7fvvg (oid)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of i_sale
-- ----------------------------
INSERT INTO `i_sale` VALUES ('1', '2');
INSERT INTO `i_sale` VALUES ('1', '1');
INSERT INTO `i_sale` VALUES ('3', '2');
INSERT INTO `i_sale` VALUES ('1', '3');
INSERT INTO `i_sale` VALUES ('2', '6');
INSERT INTO `i_sale` VALUES ('2', '7');
INSERT INTO `i_sale` VALUES ('2', '8');
INSERT INTO `i_sale` VALUES ('2', '10');
INSERT INTO `i_sale` VALUES ('1', '11');
INSERT INTO `i_sale` VALUES ('1', '12');
INSERT INTO `i_sale` VALUES ('1', '13');
INSERT INTO `i_sale` VALUES ('2', '14');
INSERT INTO `i_sale` VALUES ('2', '15');
INSERT INTO `i_sale` VALUES ('3', '1');
INSERT INTO `i_sale` VALUES ('2', '17');
INSERT INTO `i_sale` VALUES ('2', '18');
INSERT INTO `i_sale` VALUES ('2', '19');
INSERT INTO `i_sale` VALUES ('2', '20');
INSERT INTO `i_sale` VALUES ('8', '45');
INSERT INTO `i_sale` VALUES ('8', '42');
INSERT INTO `i_sale` VALUES ('8', '50');
INSERT INTO `i_sale` VALUES ('7', '56');
INSERT INTO `i_sale` VALUES ('7', '57');
INSERT INTO `i_sale` VALUES ('10', '58');
INSERT INTO `i_sale` VALUES ('12', '60');

-- ----------------------------
-- Table structure for `i_systemd`
-- ----------------------------
DROP TABLE IF EXISTS `i_systemd`;
CREATE TABLE i_systemd (
  tid int(11) NOT NULL AUTO_INCREMENT,
  info varchar(4096) DEFAULT NULL,
  timestamp varchar(40) DEFAULT NULL,
  PRIMARY KEY (tid),
  KEY INDEX1 (timestamp)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of i_systemd
-- ----------------------------
INSERT INTO `i_systemd` VALUES ('1', 'sdfasdf', '1539861113');
INSERT INTO `i_systemd` VALUES ('2', 'xzvzxc', '1539861113');
INSERT INTO `i_systemd` VALUES ('4', 'zxv', null);

-- ----------------------------
-- Table structure for `orderfile`
-- ----------------------------
DROP TABLE IF EXISTS `orderfile`;
CREATE TABLE orderfile (
  oid int(11) DEFAULT NULL,
  filename varchar(100) DEFAULT NULL,
  ofid int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (ofid)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderfile
-- ----------------------------
INSERT INTO `orderfile` VALUES ('1', '2018113010363061895.doc', '1');
INSERT INTO `orderfile` VALUES ('1', '2018113011104131159.docx', '2');
INSERT INTO `orderfile` VALUES ('2', '2018113011104156012.js', '3');
INSERT INTO `orderfile` VALUES ('9', '2018120110540374070.jpg', '7');
INSERT INTO `orderfile` VALUES ('20', '123', '8');
INSERT INTO `orderfile` VALUES ('20', '123', '9');
INSERT INTO `orderfile` VALUES ('20', '123', '10');
INSERT INTO `orderfile` VALUES ('9', '2018120213043616496.pdf', '11');
INSERT INTO `orderfile` VALUES ('20', '123', '12');
INSERT INTO `orderfile` VALUES ('20', '123', '13');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE role (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for `t_complaint`
-- ----------------------------
DROP TABLE IF EXISTS `t_complaint`;
CREATE TABLE t_complaint (
  wid int(11) NOT NULL AUTO_INCREMENT,
  seid int(11) DEFAULT NULL,
  info text,
  timestamp varchar(50) DEFAULT NULL,
  PRIMARY KEY (wid),
  KEY INDEX1 (seid)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_complaint
-- ----------------------------
INSERT INTO `t_complaint` VALUES ('1', '2', '态度不好', '1539861113');
INSERT INTO `t_complaint` VALUES ('2', '3', '工作不认真', '1539861113');
INSERT INTO `t_complaint` VALUES ('8', '5', '我不喜欢', '1541559472');
INSERT INTO `t_complaint` VALUES ('10', '12', '刘翔就是我', '1542721249');
INSERT INTO `t_complaint` VALUES ('12', '36', '有个小问题', '1543718644');
INSERT INTO `t_complaint` VALUES ('13', '37', '再一次尝试', '1543718681');
INSERT INTO `t_complaint` VALUES ('14', '38', '员工态度不好', '1539861113');

-- ----------------------------
-- Table structure for `t_customer`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE t_customer (
  cid int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  phone varchar(45) NOT NULL,
  email varchar(45) DEFAULT NULL,
  company varchar(128) DEFAULT NULL,
  address varchar(128) DEFAULT NULL,
  legalperson varchar(45) DEFAULT NULL,
  type varchar(45) DEFAULT NULL,
  founder varchar(45) DEFAULT NULL,
  remarks varchar(256) DEFAULT NULL,
  timestamp varchar(255) DEFAULT NULL,
  PRIMARY KEY (cid),
  UNIQUE KEY INDEX2 (phone) USING BTREE,
  KEY INDEX4 (type) USING BTREE,
  KEY INDEX3 (company),
  KEY index5 (timestamp) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', '林立', '18100732456', '1287040@qq.com', '中南大学', '湖南省长沙市韶山南路138号', '郝有钱', 'a', '曹笑', '好客户', '1539169913');
INSERT INTO `t_customer` VALUES ('2', '林夕', '14789025780', '1287903030@qq.com', '上好佳食品有限公司', '福建省福州市西瓜路168号', '郑好吃', 'b', '曹笑', '好客户', '1539169913');
INSERT INTO `t_customer` VALUES ('3', '尤作为', '13875288126', '137002030@qq.com', '雷雷科技公司', '湖北省武汉市雷锋大道166号', '佟大', null, '倪漂亮', null, '1539169913');
INSERT INTO `t_customer` VALUES ('4', '梁伟文', '14708907654', 'shuxia@qq.com', '好歌声传媒有限公司', '湖南省长沙市天心区胡来街道123号', '钱哈哈', null, '周杰', null, '1539169913');
INSERT INTO `t_customer` VALUES ('5', '黄伟文', '13245638970', 'shuzhong@qq.com', '蓝深传媒', '湖南省长沙市天心区胡来街道233号', '郝听', null, '周杰伦', null, '1539342713');
INSERT INTO `t_customer` VALUES ('6', '周润发', '13030035478', '100@qq.com', '西南大学', '重庆市沙坪坝区', '周润发', '1', '周杰', '好客户', '1539169913');
INSERT INTO `t_customer` VALUES ('7', '张学友', '14567235677', 'geshen@qq.com', '泰润科技开发有限公司', '海南省东方市学习区科技园', '赵丽', 'a', '曹笑', '好客户', '1539342713');
INSERT INTO `t_customer` VALUES ('8', '钱面', '12342345653', '23145@qq.com', '蓝思科技有限公司', '湖南省长沙市星沙经济区理想路233号', '李平', 'a', '周杰', '好客户', '1539342713');
INSERT INTO `t_customer` VALUES ('9', '简易', '19807653465', '12346578@qq.com', '奇奇科技有限公司', '湖南省长沙市天心区不知道街道145号', '倪不懂', 'a', '曹笑', '不咋地', '1539342713');
INSERT INTO `t_customer` VALUES ('10', '欧克', '14789230452', '897650@qq.com', '塔塔科技有限公司', '福建省厦门市思明区123号', '仝戏言', 'a', '毛东东', '好客户', '1539429113');
INSERT INTO `t_customer` VALUES ('11', '李泽', '18670026041', '10500@qq.com', '千千游戏制作公司', '湖北省武汉市草莓区光明街道142号', '李泽楷', 'a', '周杰伦', '不知道', '1539429113');
INSERT INTO `t_customer` VALUES ('12', '何平', '18765892302', 'aihao@163.com', '宝蓝游戏制作公司', '浙江省杭州市萧山区光明路233号', '王爱国', 'a', '周杰', '不咋地', '1539429113');
INSERT INTO `t_customer` VALUES ('13', '郑宇其', '17765489435', '1231242@qq.com', '好吃食品有限公司', '湖南省岳阳市好学区光明路233号', '唐爱国', 'a', '曹笑', '一般般', '1539429113');
INSERT INTO `t_customer` VALUES ('14', '甄小寰', '13675398208', '128700303@qq.com', '橙光游戏制作公司', '湖南省浏阳市天天区中山路233号', '陈建斌', 'a', '毛东东', '顶呱呱', '1539861113');
INSERT INTO `t_customer` VALUES ('15', '叶萧翼', '15627863529', 'lalalalla@qq.com', '全由家具有限公司', '湖南省永州市零陵区光明路123号', '王晓晨', 'a', '曹笑', '好客户', '1539429113');
INSERT INTO `t_customer` VALUES ('16', '眉小庄', '15378920390', '1297504@qq.com', '扶风家装', '江西省南昌市勇气区理想路233号', '李晓琦', 'a', '曹笑', '一般般', '1539429113');
INSERT INTO `t_customer` VALUES ('17', '关皮皮', '16236723629', 'nishishui@qq.com', '芙蓉家装', '江西省赣州市南康区理想街123号', '茅晓东', 'a', '周杰伦', '好客户', '1539861113');
INSERT INTO `t_customer` VALUES ('18', '彭鹏', '17237279830', '1276590@qq.com', '平平科技有限公司', '湖北省武汉市搞不定区学术路233号', '郑大钱', 'a', '刘美丽', '好客户', '1539861113');
INSERT INTO `t_customer` VALUES ('19', '彭程', '18236762909', '1265429@126.com', '升升科技有限公司', '湖南省怀化市天天区中山路233号', '富大龙', 'a', '倪漂亮', '不咋地', '1539861113');
INSERT INTO `t_customer` VALUES ('20', '叶小依', '18790340039', 'buzd@163.com', '安安保险', '湖南省益阳市天天区中山路233号', '宁静', 'a', '于谦', '好客户', '1540984313');
INSERT INTO `t_customer` VALUES ('21', '马良', '12352489083', '8909765@qq.com', '神笔美术培训中心', '湖南省常德市天天区中山路233号', '郑东', 'a', '刘美丽', '', '1540984313');
INSERT INTO `t_customer` VALUES ('22', '张骞', '17232878328', 'hahahha@qq.com', '西域美食', '浙江省杭州市萧山区雷锋路233号', '何涛', 'a', '周杰伦', '好客户', '1540984313');
INSERT INTO `t_customer` VALUES ('23', '巫启功', '18190987699', '2376543@qq.com', '湖南省国土资源信息中心', '湖南省长沙市岳麓区麓山路123号', '吴所为', 'a', '曹笑', '一般般', '1540984313');
INSERT INTO `t_customer` VALUES ('24', '金闪闪', '18765903423', '1289653@qq.com', '最有钱银行', '湖南省长沙市开福区好汉路123号', '吴用', 'a', '于谦', '好客户', '1540984313');
INSERT INTO `t_customer` VALUES ('25', '吴大雄', '18720900799', 'weism@qq.com', '步步高科技有限公司', '湖南省长沙市天心区麓山路111号', '宋江', 'a', '刘美丽', '不咋地', '1539861113');
INSERT INTO `t_customer` VALUES ('26', '何爱国', '18720989999', '123876549@162.com', '四星集团', '湖南省长沙市岳麓区麓山路333号', '李逵', 'a', '倪漂亮', '好说话', '1539861113');
INSERT INTO `t_customer` VALUES ('27', '朱七七', '18976538888', '127860@163.com', '五零科技有限公司', '湖南省永州市天心区麓山路123号', '孙漂亮', 'a', '曹笑', '好客户', '1539861113');
INSERT INTO `t_customer` VALUES ('31', '何盼', '93516540297', '1231232@qq.com', '盼盼食品有限公司', '湖南省张家界市天心区萧山南路123号', '周霞因', null, '曹笑', '好客户', '1539861113');
INSERT INTO `t_customer` VALUES ('32', '周东', '18670026042', '10098511@qq.com', '东东科技有限公司', '浙江省宁波市菠萝区求学路123号', '高亮', '', '周杰', '好客户啊', null);

-- ----------------------------
-- Table structure for `t_equipment`
-- ----------------------------
DROP TABLE IF EXISTS `t_equipment`;
CREATE TABLE t_equipment (
  eid int(11) NOT NULL AUTO_INCREMENT,
  pid int(100) DEFAULT NULL,
  code varchar(100) DEFAULT NULL,
  PRIMARY KEY (eid),
  UNIQUE KEY index1 (code) USING BTREE,
  KEY index2 (pid) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_equipment
-- ----------------------------
INSERT INTO `t_equipment` VALUES ('1', '1', '86015711');
INSERT INTO `t_equipment` VALUES ('2', '2', '86015712');
INSERT INTO `t_equipment` VALUES ('3', '2', '86015713');
INSERT INTO `t_equipment` VALUES ('6', '2', '86015714');
INSERT INTO `t_equipment` VALUES ('7', '3', '86015715');
INSERT INTO `t_equipment` VALUES ('8', '21', '86015716');
INSERT INTO `t_equipment` VALUES ('9', '22', '86015717');
INSERT INTO `t_equipment` VALUES ('10', '4', '86015718');
INSERT INTO `t_equipment` VALUES ('11', '5', '86015719');
INSERT INTO `t_equipment` VALUES ('12', '6', '86015720');
INSERT INTO `t_equipment` VALUES ('13', '26', '86015721');
INSERT INTO `t_equipment` VALUES ('14', '6', '86015722');
INSERT INTO `t_equipment` VALUES ('15', '28', '86015723');
INSERT INTO `t_equipment` VALUES ('16', '27', '86015724');
INSERT INTO `t_equipment` VALUES ('17', '12', '86015725');
INSERT INTO `t_equipment` VALUES ('18', '22', '86015726');
INSERT INTO `t_equipment` VALUES ('19', '21', '86015727');
INSERT INTO `t_equipment` VALUES ('20', '23', '86015728');
INSERT INTO `t_equipment` VALUES ('21', '26', '86015729');
INSERT INTO `t_equipment` VALUES ('22', '25', '86015731');
INSERT INTO `t_equipment` VALUES ('23', '22', '86015732');
INSERT INTO `t_equipment` VALUES ('24', '8', '86015733');
INSERT INTO `t_equipment` VALUES ('25', '11', '86015734');
INSERT INTO `t_equipment` VALUES ('26', '14', '86015735');
INSERT INTO `t_equipment` VALUES ('27', '6', '86015736');
INSERT INTO `t_equipment` VALUES ('28', '4', '86015737');
INSERT INTO `t_equipment` VALUES ('29', '25', '86015738');
INSERT INTO `t_equipment` VALUES ('30', '5', '86015739');
INSERT INTO `t_equipment` VALUES ('31', '18', '86015741');
INSERT INTO `t_equipment` VALUES ('32', '9', '86015742');
INSERT INTO `t_equipment` VALUES ('33', '11', '86015743');
INSERT INTO `t_equipment` VALUES ('34', '18', '86015744');
INSERT INTO `t_equipment` VALUES ('35', '13', '86015745');
INSERT INTO `t_equipment` VALUES ('36', '23', '86015746');
INSERT INTO `t_equipment` VALUES ('37', '19', '86015747');
INSERT INTO `t_equipment` VALUES ('38', '16', '86015748');
INSERT INTO `t_equipment` VALUES ('39', '6', '86015749');
INSERT INTO `t_equipment` VALUES ('40', '14', '86015751');
INSERT INTO `t_equipment` VALUES ('41', '21', '86015761');
INSERT INTO `t_equipment` VALUES ('42', '8', '86015762');
INSERT INTO `t_equipment` VALUES ('43', '6', '86015763');
INSERT INTO `t_equipment` VALUES ('44', '1', '86015764');
INSERT INTO `t_equipment` VALUES ('45', '1', '86015765');
INSERT INTO `t_equipment` VALUES ('46', '1', '86015766');
INSERT INTO `t_equipment` VALUES ('47', '20', '86015767');
INSERT INTO `t_equipment` VALUES ('48', '14', '86015768');
INSERT INTO `t_equipment` VALUES ('49', '17', '86015769');
INSERT INTO `t_equipment` VALUES ('56', '8', 'abc');
INSERT INTO `t_equipment` VALUES ('57', '9', 'abcd');
INSERT INTO `t_equipment` VALUES ('58', '1', '12346789');
INSERT INTO `t_equipment` VALUES ('59', '1', 'hahadaa');
INSERT INTO `t_equipment` VALUES ('60', '1', 'abcde');

-- ----------------------------
-- Table structure for `t_fault`
-- ----------------------------
DROP TABLE IF EXISTS `t_fault`;
CREATE TABLE t_fault (
  fid int(11) NOT NULL AUTO_INCREMENT,
  servicetype int(11) DEFAULT NULL,
  rid int(11) DEFAULT NULL,
  eid int(11) DEFAULT NULL,
  fault_type int(40) DEFAULT NULL,
  fault_des varchar(200) DEFAULT NULL,
  solution varchar(500) DEFAULT NULL,
  PRIMARY KEY (fid)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_fault
-- ----------------------------
INSERT INTO `t_fault` VALUES ('1', '1', '2', '1', '1', '压缩机坏了', '不知道');
INSERT INTO `t_fault` VALUES ('2', '1', '1', '2', '2', '空调漏水', '无');
INSERT INTO `t_fault` VALUES ('4', '0', '3', '2', '3', '压缩机坏了', '更换压缩机');
INSERT INTO `t_fault` VALUES ('5', '0', '5', '2', null, null, null);
INSERT INTO `t_fault` VALUES ('6', '0', '6', '1', null, null, null);
INSERT INTO `t_fault` VALUES ('7', '1', '8', '2', null, null, null);
INSERT INTO `t_fault` VALUES ('8', '1', '9', '1', null, null, null);
INSERT INTO `t_fault` VALUES ('11', '1', '12', '2', null, '机器坏了', null);
INSERT INTO `t_fault` VALUES ('12', '1', '13', '3', null, '机器坏了', null);
INSERT INTO `t_fault` VALUES ('13', '0', '7', '2', null, null, null);
INSERT INTO `t_fault` VALUES ('14', '0', '8', '1', '1', '空调漏水', '更换零件');
INSERT INTO `t_fault` VALUES ('15', '0', '9', '6', null, null, null);
INSERT INTO `t_fault` VALUES ('16', '0', '10', '7', '1', null, null);
INSERT INTO `t_fault` VALUES ('17', '0', '11', '8', '2', null, null);
INSERT INTO `t_fault` VALUES ('18', '0', '12', '10', '1', null, null);
INSERT INTO `t_fault` VALUES ('19', '0', '13', '14', null, null, null);
INSERT INTO `t_fault` VALUES ('20', '0', '14', '15', null, null, null);
INSERT INTO `t_fault` VALUES ('21', '0', '15', '17', null, null, null);
INSERT INTO `t_fault` VALUES ('22', '0', '16', '18', null, null, null);
INSERT INTO `t_fault` VALUES ('23', '0', '17', '19', null, null, null);
INSERT INTO `t_fault` VALUES ('24', '1', '18', '20', null, 'cvbcv', null);
INSERT INTO `t_fault` VALUES ('25', '1', '19', '2', null, 'cvbcv', null);
INSERT INTO `t_fault` VALUES ('26', '0', '20', '1', null, null, null);
INSERT INTO `t_fault` VALUES ('27', '1', '14', '2', null, null, null);
INSERT INTO `t_fault` VALUES ('28', '1', '15', '1', null, null, null);
INSERT INTO `t_fault` VALUES ('29', '0', '21', '2', null, null, null);
INSERT INTO `t_fault` VALUES ('30', '0', '22', '1', null, null, null);
INSERT INTO `t_fault` VALUES ('31', '1', '16', '1', null, 'lizhijiushiwo', null);
INSERT INTO `t_fault` VALUES ('32', '1', '17', '2', null, 'lizhijiushiwo', null);
INSERT INTO `t_fault` VALUES ('33', '1', '20', '1', null, '报修测试', null);
INSERT INTO `t_fault` VALUES ('34', '1', '21', '2', null, '报修测试', null);
INSERT INTO `t_fault` VALUES ('35', '1', '22', '2', null, '报修测试', null);
INSERT INTO `t_fault` VALUES ('36', '1', '23', '2', null, '设备报修小测试', null);
INSERT INTO `t_fault` VALUES ('37', '1', '24', '2', null, '设备报修小测试', null);
INSERT INTO `t_fault` VALUES ('38', '0', '23', '2', null, null, null);
INSERT INTO `t_fault` VALUES ('39', '0', '24', '1', null, null, null);
INSERT INTO `t_fault` VALUES ('40', '0', '25', '3', null, null, null);
INSERT INTO `t_fault` VALUES ('41', '0', '26', '11', null, null, null);
INSERT INTO `t_fault` VALUES ('42', '0', '27', '12', null, null, null);
INSERT INTO `t_fault` VALUES ('43', '0', '28', '13', null, null, null);

-- ----------------------------
-- Table structure for `t_fault_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_fault_type`;
CREATE TABLE t_fault_type (
  ftid int(11) NOT NULL AUTO_INCREMENT,
  fault_type varchar(255) DEFAULT NULL,
  PRIMARY KEY (ftid)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_fault_type
-- ----------------------------
INSERT INTO `t_fault_type` VALUES ('1', '空调坏了');
INSERT INTO `t_fault_type` VALUES ('2', '机器坏了');
INSERT INTO `t_fault_type` VALUES ('3', '压缩机坏了');

-- ----------------------------
-- Table structure for `t_inspection`
-- ----------------------------
DROP TABLE IF EXISTS `t_inspection`;
CREATE TABLE t_inspection (
  iid int(11) NOT NULL AUTO_INCREMENT,
  seid int(11) DEFAULT NULL,
  tablecontent text,
  timestamp varchar(100) DEFAULT NULL,
  report varchar(2048) DEFAULT NULL,
  suggestion varchar(2048) DEFAULT NULL,
  PRIMARY KEY (iid),
  KEY INDEX2 (seid)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_inspection
-- ----------------------------
INSERT INTO `t_inspection` VALUES ('1', '1', '666', '1539861113', 'yyyy', '检测的很好');
INSERT INTO `t_inspection` VALUES ('2', '1', '666', '1539861114', 'reportreportreportreport', 'suggestionsuggestion');
INSERT INTO `t_inspection` VALUES ('4', '4', 'xvxzcvzxcv', '1539861113', 'yyyy', '检测的不错');
INSERT INTO `t_inspection` VALUES ('5', '10', null, '1538323200', null, null);
INSERT INTO `t_inspection` VALUES ('6', '10', null, '1538323200', null, null);
INSERT INTO `t_inspection` VALUES ('7', '15', '<h2><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;电池放电测试记录表</strong></h2><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;客户名称：</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;测试日期：2018144411</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;测试人员：</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;设备编号：0214224</p><figure class=\table\><table><tbody><tr><td>UPS型号</td><td>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 186145511323252 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</td><td>序列号</td><td>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</td></tr><tr><td>电池型号</td><td>&nbsp;</td><td>电池数量</td><td>&nbsp;</td></tr><tr><td>浮充电压V</td><td>&nbsp;</td><td>均充电压V</td><td>&nbsp;</td></tr><tr><td>时间</td><td>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;电池电压V</td><td colspan=\2\>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;放电电流A</td></tr><tr><td>0分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>5分钟</td><td>&nbsp; 14251544</td><td colspan=\2\>5454</td></tr><tr><td>10分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>15分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>20分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>25分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>30分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>35分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>40分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>45分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>50分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>55分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>60分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>65分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>70分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>75分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>80分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>85分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>90分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>95分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr><tr><td>100分钟</td><td>&nbsp;</td><td colspan=\2\>&nbsp;</td></tr></tbody></table></figure><p>&nbsp;</p>', '1519747200', null, null);
INSERT INTO `t_inspection` VALUES ('8', '21', '<h2><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; UPS室配电设备巡检记录</strong></h2><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;巡检日期： &nbsp;&nbsp;&nbsp;201812412&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 上次巡检时间： &nbsp;&nbsp;201854554 &nbsp; &nbsp; &nbsp;检测工程师：进入热热热</p><figure class=\table\><table><tbody><tr><td rowspan=\3\>用户信息登记</td><td colspan=\2\>用户名称：jerryasfasdf</td></tr><tr><td colspan=\2\>设备安装地址：derefe</td></tr><tr><td>用户联系人：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1215454&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</td><td>&nbsp;&nbsp;联系方式： &nbsp; &nbsp;dfdfd &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</td></tr></tbody></table></figure><p>&nbsp;</p><figure class=\table\><table><tbody><tr><td colspan=\5\>设备名称： &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;安装位置：</td></tr><tr><td>&nbsp;</td><td>巡检项目</td><td colspan=\2\>巡检内容</td><td>巡检结果</td></tr><tr><td rowspan=\10\>巡检记 录</td><td rowspan=\4\>1）环境</td><td colspan=\2\>检查配电室有无漏水现象。</td><td>&nbsp;</td></tr><tr><td colspan=\2\>门窗是否完好，老鼠等小动物能否进来。</td><td>法人股法国</td></tr><tr><td colspan=\2\>照明及排风系统是否正常使用。</td><td>&nbsp;</td></tr><tr><td colspan=\2\>配电室卫生清理，设备表面除尘。</td><td>&nbsp;</td></tr><tr><td rowspan=\6\>2）设备</td><td colspan=\2\>配电柜数量表数值是否正常显示。</td><td>&nbsp;</td></tr><tr><td colspan=\2\>配电柜内接线端母排等是否正常，有无变色松动等情况。</td><td>&nbsp;</td></tr><tr><td colspan=\2\>设备周围有无遮挡物，影响设备正常维护否。</td><td>&nbsp;</td></tr><tr><td colspan=\2\>检查设备有无异味或异常声音等。</td><td>&nbsp;</td></tr><tr><td colspan=\2\>检查所有线路有无裸露，破裂现象。</td><td>&nbsp;</td></tr><tr><td colspan=\2\>检查所有线路温度是否正常。</td><td>&nbsp;</td></tr><tr><td colspan=\5\>设备信息登记 &nbsp; &nbsp;hahahahhaha</td></tr><tr><td>数据记 录</td><td colspan=\2\><p>A路</p><p>A相电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Hz</p><p>B相电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Hz</p><p>C相电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Hz</p><p>A相电流：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A</p><p>B相电流：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A</p><p>C相电流：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A</p></td><td><p>AB线电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Hz</p><p>BC线电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Hz</p><p>AC线电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac/&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Hz</p><p>B路</p><p>A相电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Hz</p><p>B相电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Hz</p><p>C相电压：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Vac/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Hz</p></td><td>输入零地电压&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Vac</td></tr></tbody></table></figure>', '1519747200', '良好', '挺好');
INSERT INTO `t_inspection` VALUES ('9', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('10', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('11', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('12', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('13', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('14', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('15', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('16', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('17', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('18', '16', null, '1541001600', null, null);
INSERT INTO `t_inspection` VALUES ('19', '22', null, '1530374400', null, null);
INSERT INTO `t_inspection` VALUES ('20', '22', '<figure class=\table\><table><tbody><tr><td colspan=\4\><h3>&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 机房精密空调巡检维护服务单 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</h3></td></tr><tr><td colspan=\4\>用户名称：aaaaa</td></tr><tr><td>用户联系人</td><td>&nbsp;</td><td>联系方式</td><td>&nbsp;</td></tr><tr><td>巡检日期</td><td>&nbsp;</td><td>巡检工程师</td><td>&nbsp;</td></tr></tbody></table></figure><figure class=\table\><table><tbody><tr><td colspan=\9\><strong>主机信息</strong></td></tr><tr><td colspan=\2\>设备型号</td><td colspan=\3\>&nbsp;</td><td colspan=\2\>序列号</td><td colspan=\2\>&nbsp;</td></tr><tr><td colspan=\9\><strong>读取空调当前运行状态和报警信息</strong></td></tr><tr><td colspan=\9\><p><strong>当前温度：&nbsp;&nbsp;&nbsp; &nbsp;℃ &nbsp;&nbsp;&nbsp;&nbsp;当前湿度：&nbsp; &nbsp; &nbsp;RH% &nbsp;&nbsp;&nbsp;&nbsp;设定温度：&nbsp;&nbsp;&nbsp; &nbsp;℃ &nbsp;&nbsp;&nbsp;设定湿度：&nbsp;&nbsp;&nbsp; &nbsp;RH%</strong></p><p><strong>报警信息：</strong></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p><strong>机器运行信息：</strong></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p></td></tr><tr><td colspan=\9\><strong>压缩机及制冷系统</strong></td></tr><tr><td colspan=\9\><p><strong>压缩机</strong>1#（双系统为右边压缩机）状况：</p><p>压缩机运转是否有异常振动或异响： &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (是 / 否 ) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><p>工作电流：&nbsp;A相电流&nbsp;&nbsp; &nbsp; &nbsp;(A) ，B相电流&nbsp; &nbsp;&nbsp; &nbsp; (A) ，C相电流&nbsp;&nbsp; &nbsp; （A）</p><p>吸气压力：&nbsp;&nbsp; &nbsp;（PSIG） &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;排气压力： &nbsp; &nbsp;（PSIG）</p><p>视镜是否变色： &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; (是 / 否 )&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;</p><p><strong>压缩机</strong>2#（双系统为左边压缩机）状况：</p><p>压缩机运转是否有异常振动或异响： &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(是 / 否 )</p><p>工作电流：A相电流&nbsp; &nbsp; &nbsp; &nbsp; (A) ，B相电流&nbsp;&nbsp; &nbsp; &nbsp; (A) ，C相电流&nbsp;&nbsp; &nbsp; （A）</p><p>吸气压力：<i> &nbsp;</i> &nbsp;&nbsp;（PSIG） &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 排气压力：&nbsp; &nbsp;<i> &nbsp;</i>（PSIG）</p><p>视镜是否变色： &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; (是 / 否 ) &nbsp; &nbsp; &nbsp;&nbsp;</p><p>说明：</p><p>&nbsp;</p></td></tr><tr><td colspan=\9\><strong>蒸发器</strong></td></tr><tr><td colspan=\9\><p>蒸发器表面是否有结霜现象： &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(有 / 无 )</p><p>蒸发器表面洁净状况：<strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong></p><p>&nbsp;</p><p>处理办法：</p><p>&nbsp;</p></td></tr><tr><td colspan=\9\><strong>室内风机</strong></td></tr><tr><td colspan=\9\><p>风机1电流 : A相电流&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;(A) ，B相电流&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;(A) ，C相电流&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(A) &nbsp;</p><p>风机2电流 : A相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; (A) ，B相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;(A) ，C相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;（A）</p><p>风机3电流 : A相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; (A) ，B相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;(A) ，C相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;（A）</p><p>风机1风速：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（m/s）；风机2风速：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（m/s）；风机3风速：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（m/s）</p><p>说明：</p><p>&nbsp;</p></td></tr><tr><td colspan=\9\><strong>过滤网</strong></td></tr><tr><td colspan=\2\><strong>检查内容</strong></td><td colspan=\3\><strong>检查结果</strong></td><td colspan=\4\><strong>型号 &nbsp;数量 &nbsp;（差的时候必填）</strong></td></tr><tr><td colspan=\2\>空气过滤网有无破损、变形</td><td colspan=\3\>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(有 / 无 )</td><td colspan=\4\>&nbsp;</td></tr><tr><td colspan=\2\>空气过滤网透光性</td><td colspan=\3\>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(好 / 坏)</td><td colspan=\4\>&nbsp;</td></tr><tr><td colspan=\9\><strong>加湿器</strong></td></tr><tr><td colspan=\9\><p>加湿器类型： &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; （电极加湿器 / 远红外加湿器）</p><p>电极外加湿器：电极表面是否结垢 &nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;（是 / 否 ） &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;加湿罐内是否结垢 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;（是 / 否）</p><p>远红外加湿器：加湿水盘内是否结垢 &nbsp; &nbsp; &nbsp; &nbsp; （是 / 否 ） &nbsp;&nbsp;&nbsp;&nbsp;加湿灯管是否全亮 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;（是 &nbsp;/ 否）</p><p>加湿水盘过温保护开关是否动作：&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;（是 / 否）</p><p>入水管接头是否连接牢固： &nbsp; &nbsp; &nbsp; &nbsp; （是 / 否） &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;排水管接头是否连接牢固： &nbsp; &nbsp; &nbsp; （是 / 否）</p><p>排水管是否通畅： &nbsp; &nbsp; &nbsp; &nbsp;（是 &nbsp;/ 否）</p><p>加湿电流： A相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;(A) ，B相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;(A) ，C相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;（A）</p><p>处理：</p><p>&nbsp;</p><p>&nbsp;</p></td></tr><tr><td colspan=\9\><strong>再热器</strong></td></tr><tr><td colspan=\9\><p>电再热器的表面的清洁与腐蚀情况：</p><p>再热器电流： A相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;(A) ，B相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;(A) ，C相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;（A）</p><p>说明：</p><p>&nbsp;</p></td></tr><tr><td colspan=\9\><strong>冷凝器</strong></td></tr><tr><td colspan=\9\><p>冷凝器翅片表面是否脏污： &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; (是 / 否 ) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;冷凝器送回风是否通畅： &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(是 / 否 )</p><p>冷凝电机运转是否卡阻及异响：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是 / 否 ) &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</p><p>冷凝器1电流： A相电流&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;(A) ，B相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;(A) ，C相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;（A）</p><p>冷凝器2电流： A相电流&nbsp; &nbsp;&nbsp; &nbsp; &nbsp;(A) ，B相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;(A) ，C相电流&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;（A）</p><p>处理：</p><p>&nbsp;</p></td></tr><tr><td colspan=\9\><strong>电气部分</strong></td></tr><tr><td colspan=\3\><strong>检查内容</strong></td><td colspan=\6\><strong>检查结果</strong></td></tr><tr><td colspan=\3\>线电压</td><td colspan=\6\>L1-L2&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;V； &nbsp;L2-L3&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;V ； L3-L1&nbsp; &nbsp;&nbsp;&nbsp;V</td></tr><tr><td colspan=\3\>控制板电压&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; (V)</td><td colspan=\3\>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;（正常 / 异常）</td><td colspan=\3\>说明:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;</td></tr><tr><td colspan=\3\>所有接线牢固，接触良好</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (正常 / 异常)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>显示面板及各显示灯</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (正常 / 异常)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>采用精度更高的温湿度仪检查机器本身温湿度传感器准确度</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (正常 / 异常)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>在诊断设置菜单中手动开启压缩机，检查压缩机接触器有无拉弧现象</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是 / 否 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>在诊断设置菜单中手动开启加热器，检查加热接触器有无拉弧现象</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是/ 否)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>在诊断设置菜单中手动开启加湿器，检查加湿接触器有无拉弧现象</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是 / 否 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>控制，隔离变压器外观是否有烧痕</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是/ 否)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>检测控制接口板、显示控制板、传感器板、保险板表面有无明显老化</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是 / 否 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>温度控制功能是否正常</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (正常 / 异常)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>湿度控制功能是否正常</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (正常 / 异常)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>用毛刷或干燥空气对元气件及板件表面进行除灰</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是/ 否)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\9\><strong>报警功能检查</strong></td></tr><tr><td colspan=\3\><strong>检查内容</strong></td><td colspan=\6\><strong>检查结果</strong></td></tr><tr><td colspan=\3\>短接漏水探测电极，机器是否有漏水告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>调整高温报警阀值，机器是否有高温告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>调整低温报警阀值，机器是否有低温告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>调整高湿报警阀值，机器是否有高湿告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>调整低湿报警阀值，机器是否有低湿告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>遮挡室内机回风口，使吸气压力低于20帕，机器是否有低压告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>关掉室外机，使排气压力高于400帕，机器是否有高压告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>说明：</td></tr><tr><td colspan=\9\><strong>需停机检查项目</strong></td></tr><tr><td colspan=\3\>风机传送皮带有无龟裂及破损</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有/ 无)&nbsp;</td><td colspan=\3\>&nbsp;</td></tr><tr><td colspan=\3\>转动风机轴承及叶轮有无卡阻及过大移动</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>&nbsp;</td></tr><tr><td colspan=\3\>电机转动有无异常</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有 / 无 )&nbsp;</td><td colspan=\3\>&nbsp;</td></tr><tr><td colspan=\3\>按压压缩机接触器是否灵活，无卡阻</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是/ 否)&nbsp;</td><td colspan=\3\>&nbsp;</td></tr><tr><td colspan=\3\>按压室内风机接触器是否灵活，无卡阻</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是/ 否)&nbsp;</td><td colspan=\3\>&nbsp;</td></tr><tr><td colspan=\3\>按压加热接触器是否灵活，无卡阻</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是/ 否)&nbsp;</td><td colspan=\3\>&nbsp;</td></tr><tr><td colspan=\3\>按压加湿接触器是否灵活，无卡阻</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (是/ 否)&nbsp;</td><td colspan=\3\>&nbsp;</td></tr><tr><td colspan=\3\>断开市电输入开关再合上，机器是否有掉电告警发出</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有/ 无)&nbsp;</td><td colspan=\3\>说明：</td></tr><tr><td colspan=\9\><strong>机房环境检查</strong></td></tr><tr><td colspan=\3\><strong>检查内容</strong></td><td colspan=\6\><strong>检查结果</strong></td></tr><tr><td colspan=\3\>送回风状态（比较回风及机房内）</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (正常 / 异常) &nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>有无漏风洞口</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有/ 无)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\3\>机房保温状况</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (正常 / 异常)&nbsp;</td><td colspan=\3\>说明:</td></tr><tr><td colspan=\9\><strong>设备外观检查</strong></td></tr><tr><td colspan=\3\><strong>检查内容</strong></td><td colspan=\6\><strong>检查结果</strong></td></tr><tr><td colspan=\3\>&nbsp;</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有/ 无)&nbsp;</td><td colspan=\3\>处理:</td></tr><tr><td colspan=\3\>外观有无污渍</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有/ 无)&nbsp;</td><td colspan=\3\>处理:</td></tr><tr><td colspan=\3\>冷媒管路保温管是否有老化或破损</td><td colspan=\3\>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; (有/ 无)&nbsp;</td><td colspan=\3\>处理:</td></tr></tbody></table></figure>', '1530374400', null, null);
INSERT INTO `t_inspection` VALUES ('21', '29', null, '1522512000', null, null);
INSERT INTO `t_inspection` VALUES ('22', '29', null, '1522512000', null, null);
INSERT INTO `t_inspection` VALUES ('23', '54', null, '1515772800', null, null);
INSERT INTO `t_inspection` VALUES ('24', '54', null, '1515772800', null, null);
INSERT INTO `t_inspection` VALUES ('25', '54', null, '1515772800', null, null);
INSERT INTO `t_inspection` VALUES ('26', '54', null, '1515772800', null, null);
INSERT INTO `t_inspection` VALUES ('27', '54', null, '1515772800', null, null);
INSERT INTO `t_inspection` VALUES ('28', '54', null, '1515772800', null, null);

-- ----------------------------
-- Table structure for `t_maintenance`
-- ----------------------------
DROP TABLE IF EXISTS `t_maintenance`;
CREATE TABLE t_maintenance (
  mid int(11) NOT NULL AUTO_INCREMENT,
  seid int(11) DEFAULT NULL,
  tablecontent text,
  timestamp varchar(45) DEFAULT NULL,
  report varchar(2048) DEFAULT NULL,
  suggestion varchar(2048) DEFAULT NULL,
  PRIMARY KEY (mid),
  KEY INDEX1 (seid)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_maintenance
-- ----------------------------
INSERT INTO `t_maintenance` VALUES ('1', '19', '66666', '1539861113', 'report3', 'suggestion3');
INSERT INTO `t_maintenance` VALUES ('2', '19', 'xxv', '1539861112', 'xcvx', '继续保持');
INSERT INTO `t_maintenance` VALUES ('3', '31', 'cvbcvbcb', '1539861112', 'bcvb', '继续保持');
INSERT INTO `t_maintenance` VALUES ('6', '31', 'lizhijiushiwo', '1541643080', null, null);
INSERT INTO `t_maintenance` VALUES ('8', '11', null, '1538323200', null, null);
INSERT INTO `t_maintenance` VALUES ('9', '11', null, '1538323200', null, null);
INSERT INTO `t_maintenance` VALUES ('10', '13', null, null, null, null);
INSERT INTO `t_maintenance` VALUES ('12', '14', '666', null, null, null);
INSERT INTO `t_maintenance` VALUES ('13', '14', '13ttyyyy', null, null, null);
INSERT INTO `t_maintenance` VALUES ('14', '26', null, '1530374400', null, null);
INSERT INTO `t_maintenance` VALUES ('15', '26', null, '1530374400', null, null);
INSERT INTO `t_maintenance` VALUES ('16', '35', null, null, null, null);
INSERT INTO `t_maintenance` VALUES ('17', '35', null, null, null, null);
INSERT INTO `t_maintenance` VALUES ('18', '12', 'lizhijiushiwo', '1538323200', 'bcvb', '很好');
INSERT INTO `t_maintenance` VALUES ('19', '12', 'lizhijiushiwo2', 'lizhijiushiwo', 'bcvb2', '非常好');
INSERT INTO `t_maintenance` VALUES ('20', '47', null, null, null, null);
INSERT INTO `t_maintenance` VALUES ('21', '47', null, null, null, null);
INSERT INTO `t_maintenance` VALUES ('22', '48', null, null, null, null);
INSERT INTO `t_maintenance` VALUES ('23', '52', null, null, null, null);
INSERT INTO `t_maintenance` VALUES ('24', '53', null, null, null, null);

-- ----------------------------
-- Table structure for `t_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE t_order (
  oid int(11) NOT NULL AUTO_INCREMENT,
  cid int(11) DEFAULT NULL,
  sid int(11) DEFAULT NULL,
  name varchar(45) DEFAULT NULL,
  content text,
  insurance varchar(20) DEFAULT NULL,
  position varchar(256) DEFAULT NULL,
  sign_time varchar(45) DEFAULT NULL,
  force_time varchar(45) DEFAULT NULL,
  expire_time varchar(45) DEFAULT NULL,
  add_time varchar(50) DEFAULT NULL,
  modify_time varchar(50) DEFAULT NULL,
  status varchar(20) DEFAULT NULL,
  remarks varchar(1000) DEFAULT NULL,
  tip_time varchar(255) DEFAULT NULL,
  isexpire varchar(20) DEFAULT NULL,
  number varchar(100) DEFAULT NULL,
  PRIMARY KEY (oid),
  KEY INDEX1 (cid),
  KEY INDEX2 (sid),
  KEY index3 (sign_time) USING BTREE,
  KEY index4 (expire_time) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', '9', '12', '盼盼维修合同', 'xxx', '半险', 'yyy', '1539861113', '1539861113', '1544407339', '1539861113', '1542349601', 'available', '无', '1,2,3', 'false', 'CT1212014');
INSERT INTO `t_order` VALUES ('2', '2', '10', '西域美食维修合同', 'cvxcv', '半险', 'zxc', '1539861114', '1539861114', '1544407339', '1539861113', '1542349528', 'available', '有', '2,3,4', 'false', 'CU1239087');
INSERT INTO `t_order` VALUES ('3', '4', '2', '千千游戏制作维修合同', 'xyyy', '半险', 'xcbnbn', '1539861113', '1539861113', '1544407339', '1539861113', '1542349601', 'available', '有', '1,2,3', 'false', 'CH1232132');
INSERT INTO `t_order` VALUES ('7', '2', '13', '雷雷科技维修合同', null, '全险', 'qqqq', '1541433600', '1542124800', '2541952000', '1542272333', '1542350253', 'available', '无', '10,6,2', 'false', 'JU0987692');
INSERT INTO `t_order` VALUES ('8', '1', '4', '蓝思科技维修合同', null, '半险', 'H', '1542124800', '1542038400', '2541952000', '1542349780', '1542351190', 'available', '无', '10,9,11,12', 'false', 'HU2398765');
INSERT INTO `t_order` VALUES ('9', '6', '1', '好歌声传媒维修合同', null, '半险', 'Q', '1541433600', '1541952000', '2541952000', '1542351407', '1542354935', 'available', '有', '10,11,12,8,7', 'false', 'CI21398021');
INSERT INTO `t_order` VALUES ('10', '1', '2', '雷浩科技巡检合同', null, '无险', '湖南省长沙市高新区123号', '1544025600', '1544025600', '1575561600', '1543831963', '1543995241', 'available', '备注测试', '1,4,7,10', 'false', '128765df');
INSERT INTO `t_order` VALUES ('11', '8', '2', '中南大学测试合同2', null, '半险', '韶山南路', '1543852800', '1543507200', '1543939200', '1543995300', '1543995300', 'unavailable', '备注2', '7,11', 'true', 'ACT2008');
INSERT INTO `t_order` VALUES ('12', '9', '1', '中南大学测试合同3', null, '全险', '唱啥23', '1544544000', '1544025600', '1545235200', '1543995677', '1543997331', 'available', '', '10,11', 'false', 'atx003');

-- ----------------------------
-- Table structure for `t_password`
-- ----------------------------
DROP TABLE IF EXISTS `t_password`;
CREATE TABLE t_password (
  pid int(11) NOT NULL AUTO_INCREMENT,
  username varchar(40) DEFAULT NULL,
  password varchar(45) DEFAULT NULL,
  unionid varchar(100) DEFAULT 'Unavailable',
  role enum('customer','staff','superadmin','admin') DEFAULT NULL,
  userid int(11) DEFAULT NULL,
  PRIMARY KEY (pid),
  UNIQUE KEY index4 (username) USING BTREE,
  KEY INDEX1_2 (password),
  KEY INDEX3 (unionid)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_password
-- ----------------------------
INSERT INTO `t_password` VALUES ('1', 'lizhi', '123', 'Unavailable', 'superadmin', '1');
INSERT INTO `t_password` VALUES ('2', 'zhangqi', '123', 'Unavailable', 'staff', '2');
INSERT INTO `t_password` VALUES ('3', 'heheda', '123', 'Unavailable', 'admin', '3');
INSERT INTO `t_password` VALUES ('4', 'zhang', '123', 'Unavailable', 'staff', '4');
INSERT INTO `t_password` VALUES ('8', 'huang', '123', 'abcd', 'customer', '8');
INSERT INTO `t_password` VALUES ('9', '18678908888', '123', 'abc', 'staff', '12');
INSERT INTO `t_password` VALUES ('10', '18670026042', '12977agg', 'Unavailable', 'customer', '32');
INSERT INTO `t_password` VALUES ('11', '12306', 'wolfbolin', 'oeq2G5NUxEVB9Yl4g6g4YALTbxRg', 'customer', '33');

-- ----------------------------
-- Table structure for `t_product`
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE t_product (
  pid int(11) NOT NULL AUTO_INCREMENT,
  model varchar(255) DEFAULT NULL,
  categories varchar(255) DEFAULT NULL,
  manufacturer varchar(255) DEFAULT NULL,
  instruction text,
  PRIMARY KEY (pid),
  KEY index1 (categories) USING BTREE,
  KEY index2 (manufacturer) USING BTREE,
  KEY index3 (model) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('1', ' KG28FS230C', '空调', '西门子', 'xxxx');
INSERT INTO `t_product` VALUES ('2', 'UHA1R-0030', 'UPS', '艾默生', 'uu');
INSERT INTO `t_product` VALUES ('3', 'UHA1R-0031', 'UPS', '艾默生', 'uu2的事实');
INSERT INTO `t_product` VALUES ('4', 'KG28FS231C', '空调', '西门子', 'SV7FREnTgb');
INSERT INTO `t_product` VALUES ('5', 'KG28FS232C', '空调', '西门子', '6aM8Xn98Qq');
INSERT INTO `t_product` VALUES ('6', 'UF-LTS10-1P', 'UPS', '艾默生', '0Ur8qYGtyQ');
INSERT INTO `t_product` VALUES ('7', 'KG28FS234C', '空调', '西门子', 'I1bFpLp8xz');
INSERT INTO `t_product` VALUES ('8', 'KG28FS235C', 'UPS', '西门子', 'nqaBDwhyyE');
INSERT INTO `t_product` VALUES ('9', 'KG28FS236C', '空调', '西门子', '2BIZR169Bs');
INSERT INTO `t_product` VALUES ('10', 'KG28FS237C', '空调', '西门子', 'LAn9h6TvPO');
INSERT INTO `t_product` VALUES ('18', 'UHA1R-0033', '空调', '西门子', 'nzNLk7H81F');
INSERT INTO `t_product` VALUES ('19', 'UHA1R-0034', '空调', '西门子', 'XBsCmGbnl5');
INSERT INTO `t_product` VALUES ('20', 'UHA1R-0035', 'UPS', '艾默生', 'XivUDINLXp');
INSERT INTO `t_product` VALUES ('22', 'UHA1R-0036', 'UPS', '艾默生', 'Sibc4NCXdI');
INSERT INTO `t_product` VALUES ('23', 'KG28FS334C', '空调', '西门子', 'WlQAHdeC8I');
INSERT INTO `t_product` VALUES ('24', 'KG28FS238C', '空调', '西门子', '0JMzHLA5al');
INSERT INTO `t_product` VALUES ('25', 'KG28FS239C', '空调', '西门子', 'h031BKZ9Sx');
INSERT INTO `t_product` VALUES ('29', 'KG28FS254C', '空调', '艾默生', 'nAYboWIWXj');

-- ----------------------------
-- Table structure for `t_register`
-- ----------------------------
DROP TABLE IF EXISTS `t_register`;
CREATE TABLE t_register (
  rid int(11) NOT NULL AUTO_INCREMENT,
  sid int(11) NOT NULL,
  action varchar(45) NOT NULL,
  position varchar(128) NOT NULL,
  timestart varchar(255) DEFAULT NULL,
  status varchar(255) DEFAULT NULL,
  timeend varchar(255) DEFAULT NULL,
  PRIMARY KEY (rid),
  KEY INDEX1 (sid),
  KEY INDEX2 (action),
  KEY index3 (timestart) USING BTREE,
  KEY index4 (timeend) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_register
-- ----------------------------
INSERT INTO `t_register` VALUES ('1', '12', '签到', '长沙xxx', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('2', '12', '签到', '长沙xxx', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('3', '12', '加班签到', '四川yyy', '1539429111', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('4', '12', '加班签到', '四川xxx', '1539429110', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('5', '13', '签到', '阿萨德', '1539429115', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('6', '14', '加班签到', '秩序册', '1539429114', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('7', '12', '签到', 'heheda', null, 'available', null);
INSERT INTO `t_register` VALUES ('8', '12', '签到', 'qqqq', '1539419114', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('9', '14', '加班签到', 'qqqq', '1539419114', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('10', '2', '签到', '长沙3slsC', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('11', '12', '签到', '长沙CMJSl', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('12', '3', '签到', '长沙Cretd', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('13', '2', '签到', '长沙TZBSK', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('14', '12', '签到', '长沙4O2iX', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('15', '5', '签到', '长沙lYvOr', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('16', '2', '签到', '长沙oHsQm', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('17', '2', '签到', '长沙nlTn8', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('18', '4', '签到', '长沙lnikq', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('19', '3', '签到', '长沙UOPqP', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('20', '13', '签到', '长沙0oSvR', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('21', '4', '签到', '长沙TNJfh', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('22', '2', '签到', '长沙dYpyZ', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('23', '7', '签到', '长沙dB2IS', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('24', '8', '签到', '长沙gdMws', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('25', '9', '签到', '长沙V1842', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('26', '7', '签到', '长沙kZZJR', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('27', '5', '签到', '长沙OBbEC', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('28', '8', '签到', '长沙zXqmq', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('29', '10', '签到', '长沙EJwXf', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('30', '4', '加班签到', '长沙qx8Hg', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('31', '4', '加班签到', '长沙i5DZ4', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('32', '8', '加班签到', '长沙wYtvq', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('33', '11', '加班签到', '长沙zEGAT', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('34', '3', '加班签到', '长沙r33B2', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('35', '7', '加班签到', '长沙IPLxY', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('36', '13', '加班签到', '长沙jSldz', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('37', '5', '加班签到', '长沙zZN4P', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('38', '6', '加班签到', '长沙hqQwx', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('39', '4', '加班签到', '长沙WADWS', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('40', '9', '加班签到', '长沙3U1zf', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('41', '10', '加班签到', '长沙FOPAr', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('42', '11', '加班签到', '长沙LSRvy', '1539429113', 'unavailable', '1539439113');
INSERT INTO `t_register` VALUES ('43', '13', '加班签到', '长沙4IIOd', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('44', '6', '加班签到', '长沙5gPOF', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('45', '9', '加班签到', '长沙n2DrP', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('46', '10', '加班签到', '长沙y7lPL', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('47', '6', '加班签到', '长沙yx3cw', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('48', '2', '加班签到', '长沙71s7A', '1539429113', 'available', '1539439113');
INSERT INTO `t_register` VALUES ('49', '11', '加班签到', '长沙LiA9S', '1539429113', 'available', '1539439113');

-- ----------------------------
-- Table structure for `t_repair`
-- ----------------------------
DROP TABLE IF EXISTS `t_repair`;
CREATE TABLE t_repair (
  rid int(11) NOT NULL AUTO_INCREMENT,
  cid int(11) DEFAULT NULL,
  eid varchar(200) DEFAULT NULL,
  info varchar(500) DEFAULT NULL,
  timestamp varchar(100) DEFAULT NULL,
  status varchar(50) DEFAULT NULL,
  jieduan int(11) DEFAULT NULL,
  PRIMARY KEY (rid)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repair
-- ----------------------------
INSERT INTO `t_repair` VALUES ('1', '2', '3,4,5', 'fasd', '1539861113', 'available', '0');
INSERT INTO `t_repair` VALUES ('2', '2', '5,6,3', 'asfxv', '1539861113', 'available', '1');
INSERT INTO `t_repair` VALUES ('4', '31', '1,2', 'lizhijiushiwo', '1541574303', 'available', '0');
INSERT INTO `t_repair` VALUES ('5', '31', '1,2', 'lizhijiushiwo', '1541642992', 'available', '0');
INSERT INTO `t_repair` VALUES ('6', '31', '1,2', 'lizhijiushiwo', '1541643080', 'available', '0');

-- ----------------------------
-- Table structure for `t_service`
-- ----------------------------
DROP TABLE IF EXISTS `t_service`;
CREATE TABLE t_service (
  seid int(11) NOT NULL AUTO_INCREMENT,
  oid int(11) DEFAULT NULL,
  sid int(11) DEFAULT NULL,
  expect_time varchar(100) DEFAULT NULL,
  actual_time varchar(100) DEFAULT NULL,
  service_type int(11) DEFAULT NULL,
  jieduan int(11) DEFAULT NULL,
  PRIMARY KEY (seid)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_service
-- ----------------------------
INSERT INTO `t_service` VALUES ('1', '1', '1', '1539861113', '1539861113', '0', '0');
INSERT INTO `t_service` VALUES ('2', '2', '3', '1538496000', '1539861113', '2', '1');
INSERT INTO `t_service` VALUES ('3', '1', '1', '1539861113', '1539861113', '2', '2');
INSERT INTO `t_service` VALUES ('5', '1', '1', '1539861113', '1539861113', '2', '2');
INSERT INTO `t_service` VALUES ('6', '1', '1', '1538323200', '1539861113', '1', '1');
INSERT INTO `t_service` VALUES ('10', '3', '1', '1538323200', null, '0', '1');
INSERT INTO `t_service` VALUES ('11', '3', '1', '1538323200', null, '1', '0');
INSERT INTO `t_service` VALUES ('12', '7', '12', '1543720809', null, '2', '3');
INSERT INTO `t_service` VALUES ('14', '7', '1', '1542723998', null, '0', '3');
INSERT INTO `t_service` VALUES ('15', '3', '1', '1519747200', null, '1', '3');
INSERT INTO `t_service` VALUES ('16', '2', '12', '1541865600', null, '0', '1');
INSERT INTO `t_service` VALUES ('18', '9', '5', '1528732800', null, '1', '1');
INSERT INTO `t_service` VALUES ('19', '8', '6', '1528214400', null, '1', '3');
INSERT INTO `t_service` VALUES ('20', '8', '8', '1531065600', null, '1', '1');
INSERT INTO `t_service` VALUES ('21', '7', '12', '1543584900', null, '0', '3');
INSERT INTO `t_service` VALUES ('22', '3', '2', '1531238400', null, '0', '1');
INSERT INTO `t_service` VALUES ('26', '3', '2', '1530374400', null, '1', '0');
INSERT INTO `t_service` VALUES ('27', '8', '4', '1533052800', null, '2', '1');
INSERT INTO `t_service` VALUES ('28', '8', '4', '1533052800', null, '2', '2');
INSERT INTO `t_service` VALUES ('29', '3', '4', '1522512000', null, '0', '0');
INSERT INTO `t_service` VALUES ('30', '7', '6', '1527782400', null, '0', '1');
INSERT INTO `t_service` VALUES ('31', '9', '4', '1519833600', null, '0', '0');
INSERT INTO `t_service` VALUES ('32', '9', '9', '1530374400', null, '0', '0');
INSERT INTO `t_service` VALUES ('33', '9', '2', '1523721600', null, '0', '1');
INSERT INTO `t_service` VALUES ('35', '7', '2', '1523721600', null, '1', '0');
INSERT INTO `t_service` VALUES ('36', '7', '2', '1523721600', null, '2', '1');
INSERT INTO `t_service` VALUES ('37', '7', '2', '1523721600', null, '2', '0');
INSERT INTO `t_service` VALUES ('38', '7', '2', '1523721600', null, '2', '0');
INSERT INTO `t_service` VALUES ('39', '7', '2', '1523721600', null, '1', '1');
INSERT INTO `t_service` VALUES ('40', '7', '2', '1543720536', null, '1', '4');
INSERT INTO `t_service` VALUES ('43', '7', null, '1543720536', null, '1', '0');
INSERT INTO `t_service` VALUES ('45', '7', null, '1543720536', null, '1', '0');
INSERT INTO `t_service` VALUES ('46', '7', null, '1543720536', null, '1', '0');
INSERT INTO `t_service` VALUES ('47', '7', null, '', null, '1', '0');
INSERT INTO `t_service` VALUES ('48', '7', null, '', null, '1', '0');
INSERT INTO `t_service` VALUES ('49', '7', null, null, null, '1', '0');
INSERT INTO `t_service` VALUES ('50', '7', null, null, null, '1', '0');
INSERT INTO `t_service` VALUES ('51', '7', null, null, null, '1', '0');
INSERT INTO `t_service` VALUES ('52', '7', null, null, null, '1', '0');
INSERT INTO `t_service` VALUES ('53', '7', null, null, null, '1', '0');
INSERT INTO `t_service` VALUES ('54', '1', '2', '1515772800', null, '0', '1');

-- ----------------------------
-- Table structure for `t_staff`
-- ----------------------------
DROP TABLE IF EXISTS `t_staff`;
CREATE TABLE t_staff (
  sid int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  code varchar(45) DEFAULT NULL,
  phone varchar(45) DEFAULT '123',
  email varchar(45) DEFAULT 'xx@qq.com',
  PRIMARY KEY (sid),
  UNIQUE KEY uni_staff_phone (phone) USING BTREE,
  KEY ind_staff_name (name) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_staff
-- ----------------------------
INSERT INTO `t_staff` VALUES ('1', '李晓晓', '001', '18190768895', '6677867@qq.com');
INSERT INTO `t_staff` VALUES ('2', '张琦', '002', '18670026045', 'caoxiao@163.com');
INSERT INTO `t_staff` VALUES ('3', '毛东东', '003', '14770706455', '128700567@qq.com');
INSERT INTO `t_staff` VALUES ('4', '何开心', '004', '15297876543', '13456728@qq.com');
INSERT INTO `t_staff` VALUES ('5', '周杰', '005', '15084980172', '8976543@qq.com');
INSERT INTO `t_staff` VALUES ('6', '周杰伦', '006', '13546782901', 'zhoujielun@qq.com');
INSERT INTO `t_staff` VALUES ('7', '李东生', '007', '13378906543', '123213289@qq.com');
INSERT INTO `t_staff` VALUES ('8', '欧军旗', '008', '18123455432', '1287004040@qq.com');
INSERT INTO `t_staff` VALUES ('9', '倪漂亮', '009', '13889076543', '8765902@qq.com');
INSERT INTO `t_staff` VALUES ('10', '周杰', '010', '15087902563', '12569034@qq.com');
INSERT INTO `t_staff` VALUES ('11', '刘美丽', '011', '13870030002', '98765433@qq.com');
INSERT INTO `t_staff` VALUES ('12', '赵倩23', '012', '18678908888', '786543@qq.com');
INSERT INTO `t_staff` VALUES ('13', '孙和', '013', '15089898999', '987664@qq.com');
INSERT INTO `t_staff` VALUES ('14', '于谦', '014', '13289700456', '5298645@qq.com');

-- ----------------------------
-- Table structure for `t_whereabouts`
-- ----------------------------
DROP TABLE IF EXISTS `t_whereabouts`;
CREATE TABLE t_whereabouts (
  whid int(11) NOT NULL AUTO_INCREMENT,
  sid int(11) DEFAULT NULL,
  position text,
  timestamp varchar(255) DEFAULT NULL,
  PRIMARY KEY (whid)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_whereabouts
-- ----------------------------
INSERT INTO `t_whereabouts` VALUES ('1', '12', '116.404,39.915;116.423,39.90;111.84,28.88', '1539429115');
INSERT INTO `t_whereabouts` VALUES ('2', '12', '116.423,39.90;111.84,28.88', '1539429116');
