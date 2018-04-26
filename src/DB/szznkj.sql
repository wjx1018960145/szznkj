/*
Navicat MySQL Data Transfer

Source Server         : localhost3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : szznkj

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-04-26 16:43:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `interface`
-- ----------------------------
DROP TABLE IF EXISTS `interface`;
CREATE TABLE `interface` (
  `uid` varchar(255) NOT NULL,
  `id` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `ctime` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `prject` varchar(255) DEFAULT NULL,
  `interfaces` varchar(2048) DEFAULT NULL,
  `rank` varchar(255) DEFAULT NULL,
  `des` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of interface
-- ----------------------------
INSERT INTO `interface` VALUES ('2b7352974722455f849cc27112eefb22', 'asdasd', null, '2018-03-31 16:59:40', 'asdasdasdad', 'asdsad', '[\r\n  {\r\n    \"items\": [\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"XAUUSD\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"UKOIL\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"CORN\"\r\n      }\r\n    ],\r\n    \"name\": \"\"\r\n  },\r\n  {\r\n    \"items\": [\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"XAUUSD\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"XAGUSD\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"AUTD\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"AGTD\"\r\n      }\r\n    ],\r\n    \"name\": \"贵金属\"\r\n  },\r\n  {\r\n    \"items\": [\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"CORN\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"WHEAT\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"SOYBEAN\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"SUGAR\"\r\n      }\r\n    ],\r\n    \"name\": \"农产品\"\r\n  },\r\n  {\r\n    \"items\": [\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"UKOIL\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"USOIL\"\r\n      },\r\n      {\r\n        \"market_type\": \"forexdata\",\r\n        \"symbol\": \"NGAS\"\r\n      }\r\n    ],\r\n    \"name\": \"能源化工\"\r\n  }\r\n]', '1', '阿萨阿萨达阿打算多', null);
INSERT INTO `interface` VALUES ('4314c1a157a74c9c84e3134627932b75', '1', null, '2018-04-10 14:21:52', 'login', 'szznkj', '{\"\":\"\",\n\"\":{},\n\"\":\"\"}', null, null, 'http://130.252.9.245:8080/szznkj/tools/creatInterface?name=login');
INSERT INTO `interface` VALUES ('81978dbb437441d8bcb5b472abe4a737', 'asdasdsa', null, '2018-03-31 16:57:50', 'dasdasdasds', 'asdasdsa', '\"{}\"', null, null, 'http://130.252.9.245:8080/szznkj/tools/creatInterface?name=dasdasdasds');
INSERT INTO `interface` VALUES ('90f1456cb8354b9da9303dd90a5c3994', 'asdasddfgh', null, '2018-04-04 17:09:35', 'asdasd', 'asdasd', '[\n  {\n    \"items\": [\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"XAUUSD\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"UKOIL\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"CORN\"\n      }\n    ],\n    \"name\": \"\"\n  },\n  {\n    \"items\": [\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"XAUUSD\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"XAGUSD\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"AUTD\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"AGTD\"\n      }\n    ],\n    \"name\": \"???\"\n  },\n  {\n    \"items\": [\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"CORN\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"WHEAT\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"SOYBEAN\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"SUGAR\"\n      }\n    ],\n    \"name\": \"???\"\n  },\n  {\n    \"items\": [\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"UKOIL\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"USOIL\"\n      },\n      {\n        \"market_type\": \"forexdata\",\n        \"symbol\": \"NGAS\"\n      }\n    ],\n    \"name\": \"????\"\n  }\n]', null, null, null);
INSERT INTO `interface` VALUES ('d573353c3e544abcbfa08cb382f47d9d', 'asdasdsa', null, '2018-03-31 17:03:35', 'asdadasdaasd', 'asdasdasdasd', '\"{\\\"text\\\":{},\\\"text\\\":[]}\"', null, null, null);
INSERT INTO `interface` VALUES ('e05f735866c3436f8d0a924bd4e51c08', 'eqweqwe', null, '2018-04-04 15:52:39', 'qweqwe', 'qweqw', '{\"test\":{\n		},\n\"test\":[]}', null, null, null);

-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `action` varchar(255) DEFAULT NULL,
  `atime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('0ho41rzubw', 'admin', '添加一个角色', '2018-03-29 15:29:17');
INSERT INTO `log` VALUES ('0ykhbi1v4z', 'admin', 'logout', '2018-03-29 10:43:25');
INSERT INTO `log` VALUES ('1ep8aimh4s', 'admin', 'logout', '2018-03-27 10:44:37');
INSERT INTO `log` VALUES ('1kfgcapz26', 'admin', 'logout', '2018-04-17 14:48:17');
INSERT INTO `log` VALUES ('1q4hb2mpz7', 'admin', 'logout', '2018-03-29 10:34:05');
INSERT INTO `log` VALUES ('26pta5necr', 'admin', 'logout', '2018-03-28 17:32:19');
INSERT INTO `log` VALUES ('2hxk1gspb0', 'admin', 'logout', '2018-04-17 14:48:18');
INSERT INTO `log` VALUES ('30dkfaemv2', 'admin', 'logout', '2018-03-29 10:32:53');
INSERT INTO `log` VALUES ('312fsbhc7e', 'admin', 'logout', '2018-03-26 16:38:14');
INSERT INTO `log` VALUES ('374t2gkvcf', 'admin', '添加一个角色', '2018-03-29 11:38:08');
INSERT INTO `log` VALUES ('3f2coerdv8', 'admin', 'logout', '2018-03-26 16:41:41');
INSERT INTO `log` VALUES ('3ndhi7gmcz', 'admin', 'logout', '2018-03-26 16:40:27');
INSERT INTO `log` VALUES ('41riqvlbu3', 'admin', 'logout', '2018-03-29 10:41:54');
INSERT INTO `log` VALUES ('426tym8bz3', 'admin', 'logout', '2018-04-17 15:27:46');
INSERT INTO `log` VALUES ('4mwnepav58', 'admin', '添加一个角色', '2018-03-29 11:10:14');
INSERT INTO `log` VALUES ('4ng7wsv6qt', 'admin', 'logout', '2018-03-26 17:38:22');
INSERT INTO `log` VALUES ('4rmqz25wv3', 'admin', '添加一个角色', '2018-03-29 11:48:07');
INSERT INTO `log` VALUES ('5tg0ondi76', 'admin', 'logout', '2018-04-17 14:56:04');
INSERT INTO `log` VALUES ('6wx8l49ui5', 'admin', 'logout', '2018-04-17 14:56:04');
INSERT INTO `log` VALUES ('7ou3mg8prb', 'admin', '添加一个角色', '2018-03-29 10:23:26');
INSERT INTO `log` VALUES ('8gxo7usi2r', 'admin', 'logout', '2018-03-29 10:34:05');
INSERT INTO `log` VALUES ('9dh5v4zq1f', 'admin', 'logout', '2018-04-17 16:22:17');
INSERT INTO `log` VALUES ('9kzavogpr3', 'admin', '添加一个角色', '2018-03-29 11:46:27');
INSERT INTO `log` VALUES ('bgzqri08a9', 'admin', 'logout', '2018-03-29 10:40:16');
INSERT INTO `log` VALUES ('bhfy9s1mwo', 'admin', '添加一个角色', '2018-03-29 11:00:18');
INSERT INTO `log` VALUES ('bpde902sxm', 'admin', 'logout', '2018-04-17 15:52:40');
INSERT INTO `log` VALUES ('bpg15a7cyk', 'admin', 'logout', '2018-03-28 17:32:09');
INSERT INTO `log` VALUES ('bwmz41fdrg', 'admin', 'logout', '2018-04-23 14:21:14');
INSERT INTO `log` VALUES ('d5seognmtw', 'admin', 'logout', '2018-04-23 14:21:13');
INSERT INTO `log` VALUES ('d8bozwsxkp', 'admin', '添加一个角色', '2018-03-29 10:43:50');
INSERT INTO `log` VALUES ('dgpmb3c7fy', 'admin', 'logout', '2018-04-17 15:27:46');
INSERT INTO `log` VALUES ('dv5eug13f7', 'admin', 'logout', '2018-03-27 10:44:37');
INSERT INTO `log` VALUES ('elwr7qtfgy', 'admin', 'logout', '2018-03-26 16:41:41');
INSERT INTO `log` VALUES ('f1l9apqr3o', 'admin', 'logout', '2018-04-17 15:41:20');
INSERT INTO `log` VALUES ('f69y0s2p7d', 'admin', 'logout', '2018-04-17 15:41:56');
INSERT INTO `log` VALUES ('fig378u5hd', 'admin', 'logout', '2018-03-29 10:41:54');
INSERT INTO `log` VALUES ('fzrhbtpn6q', 'admin', 'logout', '2018-03-26 16:40:30');
INSERT INTO `log` VALUES ('g6cy7en3qh', 'admin', 'logout', '2018-04-17 15:38:51');
INSERT INTO `log` VALUES ('g87d50htlx', 'admin', 'logout', '2018-04-17 14:55:13');
INSERT INTO `log` VALUES ('gmo09luqth', 'admin', '添加一个角色', '2018-03-29 10:07:18');
INSERT INTO `log` VALUES ('gn145mpu79', 'admin', '添加一个角色', '2018-03-29 11:08:22');
INSERT INTO `log` VALUES ('hxty40nrmc', 'admin', 'logout', '2018-03-29 10:40:17');
INSERT INTO `log` VALUES ('ifxy71vu9z', 'admin', 'logout', '2018-03-29 10:56:13');
INSERT INTO `log` VALUES ('ign92d3qkz', 'admin', 'logout', '2018-03-26 16:39:39');
INSERT INTO `log` VALUES ('imd8a9wfnp', 'admin', 'logout', '2018-03-26 17:38:22');
INSERT INTO `log` VALUES ('kfqge1niwz', 'admin', 'logout', '2018-04-17 14:49:33');
INSERT INTO `log` VALUES ('kq86mcw1og', 'admin', '添加一个角色', '2018-03-29 11:26:54');
INSERT INTO `log` VALUES ('l1rckagus4', 'admin', 'logout', '2018-03-29 10:56:14');
INSERT INTO `log` VALUES ('m9fxawy48b', 'admin', 'logout', '2018-04-17 15:38:51');
INSERT INTO `log` VALUES ('mh2rav1d0q', 'admin', 'logout', '2018-04-17 16:22:17');
INSERT INTO `log` VALUES ('mstxqzwgo4', 'admin', 'logout', '2018-03-29 10:43:25');
INSERT INTO `log` VALUES ('n2q4ipme3w', 'admin', 'logout', '2018-04-17 15:41:21');
INSERT INTO `log` VALUES ('nlg3mua47v', 'admin', 'logout', '2018-04-17 15:33:05');
INSERT INTO `log` VALUES ('o8k0sx2qpf', 'admin', '添加一个角色', '2018-03-29 09:57:41');
INSERT INTO `log` VALUES ('ptyas6m587', 'admin', 'logout', '2018-03-26 17:23:34');
INSERT INTO `log` VALUES ('qlsd7zbcgw', 'admin', 'logout', '2018-03-28 16:53:34');
INSERT INTO `log` VALUES ('qp0ovdzys6', 'admin', 'logout', '2018-04-17 14:54:51');
INSERT INTO `log` VALUES ('r1sn903vga', 'admin', 'logout', '2018-03-29 10:37:48');
INSERT INTO `log` VALUES ('r5vi10sdgk', 'admin', 'logout', '2018-04-17 14:49:33');
INSERT INTO `log` VALUES ('rie2l0tavn', 'admin', 'logout', '2018-03-29 10:34:32');
INSERT INTO `log` VALUES ('s7a0ew58b6', 'admin', 'logout', '2018-04-17 14:54:51');
INSERT INTO `log` VALUES ('t0q7frueko', 'admin', 'logout', '2018-03-26 16:39:50');
INSERT INTO `log` VALUES ('tp5mygn7dh', 'admin', 'logout', '2018-04-17 15:41:56');
INSERT INTO `log` VALUES ('txpkig275a', 'admin', 'logout', '2018-03-29 10:37:45');
INSERT INTO `log` VALUES ('un7xm5g831', 'admin', 'logout', '2018-03-26 17:23:34');
INSERT INTO `log` VALUES ('vaw8sx45p9', 'admin', 'logout', '2018-03-26 16:38:14');
INSERT INTO `log` VALUES ('vw61pxf382', 'admin', 'logout', '2018-04-17 14:55:13');
INSERT INTO `log` VALUES ('vxgu3re6dc', 'admin', '添加一个角色', '2018-03-29 11:45:59');
INSERT INTO `log` VALUES ('w85e02vptn', 'admin', '添加一个角色', '2018-03-29 15:28:44');
INSERT INTO `log` VALUES ('wag8cdqyue', 'admin', 'logout', '2018-03-29 10:56:13');
INSERT INTO `log` VALUES ('wknz6symdc', 'admin', 'logout', '2018-04-17 15:52:40');
INSERT INTO `log` VALUES ('x30d9yse2i', 'admin', '添加一个角色', '2018-03-29 09:53:13');
INSERT INTO `log` VALUES ('xdeu8lyo3g', 'admin', 'logout', '2018-03-29 10:34:32');
INSERT INTO `log` VALUES ('xfp5dlnwzt', 'admin', 'logout', '2018-03-29 10:32:53');
INSERT INTO `log` VALUES ('y6l8qcdzbg', 'admin', 'logout', '2018-04-17 15:33:05');
INSERT INTO `log` VALUES ('y8bv2exazc', 'admin', '添加一个角色', '2018-03-29 10:15:57');
INSERT INTO `log` VALUES ('z3puelgocv', 'admin', '添加一个角色', '2018-03-29 14:45:37');

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `selected` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', 'add', '0');

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` varchar(255) NOT NULL DEFAULT '',
  `description` varchar(255) DEFAULT NULL,
  `uid` varchar(255) DEFAULT NULL,
  `isUse` varchar(255) DEFAULT NULL,
  `ctime` varchar(255) DEFAULT NULL,
  `operator` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('p01', '马化腾的主要职责', 'c4adade3f7e1421aa8e1f6da4434bfcf', '0', '2017-07-07 18:57:22', null, '开关游戏服务器');
INSERT INTO `permission` VALUES ('p02', '开启角色类型', 'fbe28f02c33b4fa1a0069e5638d03250', '0', '2017-07-07 19:01:31', null, '设置游戏角色');
INSERT INTO `permission` VALUES ('p03', '修改英雄的皮肤', '00d121bd83b34169babf0fc5b139b47c', '0', '2017-07-07 19:02:41', null, '英雄维护');
INSERT INTO `permission` VALUES ('p04', '修改英雄的各个技能', '0e1b977b0b2a449ea060daa7029c0112', '0', '2017-07-07 19:04:47', null, '英雄技能维护');
INSERT INTO `permission` VALUES ('p05', '坦克专属权限', '75d8952ed2f643a09f306dae6641bf88', '1', '2017-07-07 19:07:07', null, '推塔');
INSERT INTO `permission` VALUES ('p06', '没事打龙玩', '4cbe9c1a46f448a188dddb3474f0cc8f', '1', '2017-07-07 19:07:57', null, '打龙(老夫子专属)');
INSERT INTO `permission` VALUES ('p07', '没事偷野', 'a2e041565cbb423b8f07c0930a2e355b', '0', '2017-07-07 19:09:18', null, '打野(刺客专属)');
INSERT INTO `permission` VALUES ('p08', '没事就是血多，没用', 'dae960b0bd2946c1ae04607d51a0d78e', '1', '2017-07-07 19:10:02', null, '抗塔(坦克专属)');
INSERT INTO `permission` VALUES ('p09', '阿斯顿撒多', 'c8725d3e1b084a84973a26baeed1a8d5', '1', '2018-03-29 15:26:33', 'admin', '阿萨德');

-- ----------------------------
-- Table structure for `roles`
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` varchar(255) DEFAULT '',
  `description` varchar(255) DEFAULT NULL,
  `uid` varchar(255) NOT NULL,
  `isUse` varchar(1) DEFAULT NULL,
  `ctime` varchar(255) DEFAULT NULL,
  `operator` varchar(255) DEFAULT NULL COMMENT '操作者',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('r08', '阿打算 ', '0acdaec557714ed19c411eb6f82080f1', '1', '2017-07-07 09:13:04', null, '小鸟');
INSERT INTO `roles` VALUES ('r06', '阿达', '3b3280bfdce04f8cac497a6dcca2842f', '0', '2017-07-07 09:04:48', null, '虾兵');
INSERT INTO `roles` VALUES ('r02', '负责抗塔', '44a32ad459e546e69f483410f57e0eed', '1', '2017-07-06 19:13:37', null, '坦克');
INSERT INTO `roles` VALUES ('r04', '负责远程攻击', '8f5170e95e9541529ae84d3114dbfe1b', '0', '2017-07-06 19:14:38', null, '射手');
INSERT INTO `roles` VALUES ('r05', '负责控制全场', '95d94aa636184b99b06b0de44c91d498', '0', '2017-07-06 19:14:02', null, '法师');
INSERT INTO `roles` VALUES ('r07', '阿斯达所多', '987443a7de0445c3a844f14a2084998c', '0', '2017-07-07 09:06:30', null, '防御塔');
INSERT INTO `roles` VALUES ('r01', '负责杀人', 'e13b98cafb31459eb677b4accac4786e', '1', '2017-07-06 19:13:18', null, '战士');
INSERT INTO `roles` VALUES ('r09', '阿达', 'e45b28902f2444469b718fa4ff1039fc', '0', '2018-03-29 15:29:17', null, '实习编辑');
INSERT INTO `roles` VALUES ('r03', '负责偷人(猥琐家伙)', 'eba68c0829ae4f7fb87a6fb50c129c71', '0', '2017-07-06 19:16:36', null, '刺客');

-- ----------------------------
-- Table structure for `role_permissions`
-- ----------------------------
DROP TABLE IF EXISTS `role_permissions`;
CREATE TABLE `role_permissions` (
  `RoleID` varchar(255) NOT NULL DEFAULT '',
  `PermissionID` varchar(255) NOT NULL DEFAULT '',
  `UID` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`RoleID`,`PermissionID`,`UID`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of role_permissions
-- ----------------------------
INSERT INTO `role_permissions` VALUES ('r01', 'p06', '9c7a36b705bd4baebeeff3ed05ac5e5e');
INSERT INTO `role_permissions` VALUES ('r01', 'p09', '8fba95baa63d473f90c6e5f579f75dc4');
INSERT INTO `role_permissions` VALUES ('r02', 'p05', 'ac71c7a7397544a190a43004a9b26641');
INSERT INTO `role_permissions` VALUES ('r02', 'p06', 'dae1595ddcae438fadd9bade9fa17745');
INSERT INTO `role_permissions` VALUES ('r02', 'p08', '6bcd8480c13240a4a15dd1ccf8de6e52');
INSERT INTO `role_permissions` VALUES ('r08', 'p05', 'f5b918c397e04e338f01e623493a37c3');
INSERT INTO `role_permissions` VALUES ('r08', 'p08', '93f42b7708dc45adbeae1674023aeadd');

-- ----------------------------
-- Table structure for `roll`
-- ----------------------------
DROP TABLE IF EXISTS `roll`;
CREATE TABLE `roll` (
  `rollid` varchar(255) NOT NULL,
  `rolltitle` varchar(255) DEFAULT NULL,
  `rolldes` varchar(255) DEFAULT NULL,
  `rolllink` varchar(255) DEFAULT NULL,
  `rolltype` varchar(255) DEFAULT NULL,
  `uid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rollid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of roll
-- ----------------------------

-- ----------------------------
-- Table structure for `todo_list`
-- ----------------------------
DROP TABLE IF EXISTS `todo_list`;
CREATE TABLE `todo_list` (
  `text` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `done` varchar(255) DEFAULT NULL,
  `menu_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of todo_list
-- ----------------------------
INSERT INTO `todo_list` VALUES ('asd', '46', '0', '1');
INSERT INTO `todo_list` VALUES ('asd', '47', '0', '4');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `nick` varchar(255) DEFAULT NULL,
  `headImg` varchar(255) DEFAULT NULL,
  `roles` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0', 'admin', 'admin', null, null, null, '18237145079', null, null, null, '1', '超级编辑', null);
INSERT INTO `user` VALUES ('28959e6957914c2e9a9be60888591de1', 'admin5', '96e79218965eb72c92a549dd5a330112', null, null, null, '12365654587', null, '岳不群', null, null, '小人', null);
INSERT INTO `user` VALUES ('4aaa355ea71d4f89b3fa9600207d9141', '111111', '9dbc015778cd5b4de40a545e596eb04d', null, null, null, '12545458758', null, '任我行', null, null, '老爹', null);
INSERT INTO `user` VALUES ('522fdc876be243048d73b1b32af02d3e', 'admin2', '96e79218965eb72c92a549dd5a330112', null, null, null, '14257896548', null, '任盈盈', null, null, '厂长老婆', null);
INSERT INTO `user` VALUES ('5bb287b786474935a05517cad315cb61', 'admin1', '29c3eea3f305d6b823f562ac4be35217', null, null, null, '18024712478', null, '令狐少侠', null, null, '厂长', null);
INSERT INTO `user` VALUES ('e11877846d8e4493b4fe5003a3e9a0a9', 'admin10', '96e79218965eb72c92a549dd5a330112', null, null, null, '12312312312321', null, '风清扬', null, null, '祖师', null);
INSERT INTO `user` VALUES ('e53a9e8c78ef4012a840c63b2c7a0316', 'admin3', '96e79218965eb72c92a549dd5a330112', null, null, null, '12545454545', null, '林平之', null, null, '第三者', null);

-- ----------------------------
-- Table structure for `user_roles`
-- ----------------------------
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE `user_roles` (
  `UserID` varchar(255) NOT NULL DEFAULT '',
  `RoleID` varchar(255) NOT NULL DEFAULT '',
  `UID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`UserID`,`RoleID`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user_roles
-- ----------------------------
INSERT INTO `user_roles` VALUES ('9', 'r02', null);
INSERT INTO `user_roles` VALUES ('admin', 'r01', null);
