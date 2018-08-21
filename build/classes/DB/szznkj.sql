/*
Navicat MySQL Data Transfer

Source Server         : localhost3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : szznkj

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-08-21 17:55:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `uid` varchar(255) NOT NULL,
  `cityname` varchar(255) DEFAULT NULL,
  `cityid` varchar(255) DEFAULT NULL,
  `longitude` varchar(255) DEFAULT NULL,
  `dimension` varchar(255) DEFAULT NULL,
  `level` varchar(255) DEFAULT NULL,
  `pinyin` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `zip_code` varchar(255) DEFAULT NULL,
  `first` varchar(255) DEFAULT NULL,
  `pid` varchar(255) DEFAULT NULL,
  `shortname` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `merger_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '上海', '1', '121.43333', '34.50000', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `city` VALUES ('7c57ad2420744809aa838d56e5a6d2af', '北京', '0', '116.41667', '39.91667', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `city` VALUES ('b0c7029993994e9097afc63e9e3f2014', '广州', '3', '113.23333', '23.16667', null, null, null, null, null, null, null, null, null, null);

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
INSERT INTO `log` VALUES ('09yd1rzo78', 'admin12', 'logout', '2018-06-28 10:50:25');
INSERT INTO `log` VALUES ('0g1b9tua76', 'admin12', 'logout', '2018-06-28 11:39:51');
INSERT INTO `log` VALUES ('0hdce3t92a', 'admin11', 'logout', '2018-04-27 16:14:26');
INSERT INTO `log` VALUES ('0ho41rzubw', 'admin', '添加一个角色', '2018-03-29 15:29:17');
INSERT INTO `log` VALUES ('0mvixdgls9', 'admin11', 'logout', '2018-06-28 10:19:05');
INSERT INTO `log` VALUES ('0nsepakr15', 'admin', 'logout', '2018-04-27 14:41:14');
INSERT INTO `log` VALUES ('0ykhbi1v4z', 'admin', 'logout', '2018-03-29 10:43:25');
INSERT INTO `log` VALUES ('14enckazfy', 'admin11', 'logout', '2018-06-25 14:36:49');
INSERT INTO `log` VALUES ('1ep8aimh4s', 'admin', 'logout', '2018-03-27 10:44:37');
INSERT INTO `log` VALUES ('1kfgcapz26', 'admin', 'logout', '2018-04-17 14:48:17');
INSERT INTO `log` VALUES ('1q4hb2mpz7', 'admin', 'logout', '2018-03-29 10:34:05');
INSERT INTO `log` VALUES ('215zu8h3gv', 'admin11', 'logout', '2018-06-28 14:12:29');
INSERT INTO `log` VALUES ('25nyprvxg0', 'admin11', 'logout', '2018-06-22 13:40:04');
INSERT INTO `log` VALUES ('26pta5necr', 'admin', 'logout', '2018-03-28 17:32:19');
INSERT INTO `log` VALUES ('27kcvanbug', 'admin11', 'logout', '2018-06-27 13:44:59');
INSERT INTO `log` VALUES ('2ba6vqhdil', 'admin12', 'logout', '2018-06-29 13:37:10');
INSERT INTO `log` VALUES ('2d9ui4f5pt', 'admin11', 'logout', '2018-06-28 10:31:24');
INSERT INTO `log` VALUES ('2hxk1gspb0', 'admin', 'logout', '2018-04-17 14:48:18');
INSERT INTO `log` VALUES ('30dkfaemv2', 'admin', 'logout', '2018-03-29 10:32:53');
INSERT INTO `log` VALUES ('30vfr1ith8', 'admin11', 'logout', '2018-06-27 13:44:21');
INSERT INTO `log` VALUES ('312fsbhc7e', 'admin', 'logout', '2018-03-26 16:38:14');
INSERT INTO `log` VALUES ('35ro4xg8uk', 'admin11', 'logout', '2018-06-28 11:05:55');
INSERT INTO `log` VALUES ('35t7ghum9o', 'admin11', 'logout', '2018-06-22 11:01:53');
INSERT INTO `log` VALUES ('374t2gkvcf', 'admin', '添加一个角色', '2018-03-29 11:38:08');
INSERT INTO `log` VALUES ('37tgw2xn90', 'admin11', 'logout', '2018-05-25 17:18:48');
INSERT INTO `log` VALUES ('3f2coerdv8', 'admin', 'logout', '2018-03-26 16:41:41');
INSERT INTO `log` VALUES ('3ndhi7gmcz', 'admin', 'logout', '2018-03-26 16:40:27');
INSERT INTO `log` VALUES ('41ktyg95ba', 'admin12', 'logout', '2018-06-28 14:11:53');
INSERT INTO `log` VALUES ('41riqvlbu3', 'admin', 'logout', '2018-03-29 10:41:54');
INSERT INTO `log` VALUES ('426tym8bz3', 'admin', 'logout', '2018-04-17 15:27:46');
INSERT INTO `log` VALUES ('4ic8ytq3mx', 'admin11', 'logout', '2018-06-28 11:05:55');
INSERT INTO `log` VALUES ('4meoikbfxg', 'admin11', 'logout', '2018-04-27 17:26:55');
INSERT INTO `log` VALUES ('4mwnepav58', 'admin', '添加一个角色', '2018-03-29 11:10:14');
INSERT INTO `log` VALUES ('4ng7wsv6qt', 'admin', 'logout', '2018-03-26 17:38:22');
INSERT INTO `log` VALUES ('4rmqz25wv3', 'admin', '添加一个角色', '2018-03-29 11:48:07');
INSERT INTO `log` VALUES ('5tg0ondi76', 'admin', 'logout', '2018-04-17 14:56:04');
INSERT INTO `log` VALUES ('614chkpgey', 'admin11', 'logout', '2018-06-28 12:44:07');
INSERT INTO `log` VALUES ('69qpmtb2yg', 'admin11', 'logout', '2018-06-28 10:34:01');
INSERT INTO `log` VALUES ('6fv3wmsc7u', 'admin12', 'logout', '2018-06-27 13:34:09');
INSERT INTO `log` VALUES ('6i37z8n45q', 'admin12', 'logout', '2018-06-28 11:10:21');
INSERT INTO `log` VALUES ('6wx8l49ui5', 'admin', 'logout', '2018-04-17 14:56:04');
INSERT INTO `log` VALUES ('7al15ygru0', 'admin11', 'logout', '2018-06-28 11:48:06');
INSERT INTO `log` VALUES ('7g1zfilyxo', 'admin11', 'logout', '2018-06-28 10:21:16');
INSERT INTO `log` VALUES ('7g3z2utsca', 'admin', '添加一个角色', '2018-04-27 15:21:52');
INSERT INTO `log` VALUES ('7ou3mg8prb', 'admin', '添加一个角色', '2018-03-29 10:23:26');
INSERT INTO `log` VALUES ('7ruqk32c1i', 'admin11', 'logout', '2018-06-27 11:46:55');
INSERT INTO `log` VALUES ('7sm9w81t3f', 'admin11', 'logout', '2018-05-23 10:02:05');
INSERT INTO `log` VALUES ('7zoc5g804m', 'admin11', 'logout', '2018-08-21 14:42:10');
INSERT INTO `log` VALUES ('84p2kwt17q', 'admin', '添加一个角色', '2018-04-27 15:27:07');
INSERT INTO `log` VALUES ('85hoxyw76k', 'admin11', 'logout', '2018-06-27 13:47:45');
INSERT INTO `log` VALUES ('8bovqtc50n', 'admin11', 'logout', '2018-05-23 10:02:05');
INSERT INTO `log` VALUES ('8gxo7usi2r', 'admin', 'logout', '2018-03-29 10:34:05');
INSERT INTO `log` VALUES ('8vgnf2om9c', 'admin12', 'logout', '2018-06-22 14:23:29');
INSERT INTO `log` VALUES ('915maetzhq', 'admin11', 'logout', '2018-06-25 14:31:07');
INSERT INTO `log` VALUES ('92s3ryonkx', 'admin11', 'logout', '2018-06-22 14:24:10');
INSERT INTO `log` VALUES ('950bnliafz', 'admin11', 'logout', '2018-06-27 11:54:14');
INSERT INTO `log` VALUES ('9dh5v4zq1f', 'admin', 'logout', '2018-04-17 16:22:17');
INSERT INTO `log` VALUES ('9e3l2ygdza', 'admin12', 'logout', '2018-06-22 14:23:29');
INSERT INTO `log` VALUES ('9kzavogpr3', 'admin', '添加一个角色', '2018-03-29 11:46:27');
INSERT INTO `log` VALUES ('9ovdi35stb', 'admin11', 'logout', '2018-06-28 10:48:50');
INSERT INTO `log` VALUES ('9ra21qcb5e', 'admin11', 'logout', '2018-06-27 10:58:38');
INSERT INTO `log` VALUES ('ac5g3weh24', 'admin11', 'logout', '2018-06-28 11:48:27');
INSERT INTO `log` VALUES ('ac7xzw2h0v', 'admin11', 'logout', '2018-04-27 17:28:54');
INSERT INTO `log` VALUES ('ah83fwq7ys', 'admin11', 'logout', '2018-06-28 13:18:59');
INSERT INTO `log` VALUES ('bca4hqpor0', 'admin11', 'logout', '2018-06-28 13:13:21');
INSERT INTO `log` VALUES ('bgzqri08a9', 'admin', 'logout', '2018-03-29 10:40:16');
INSERT INTO `log` VALUES ('bhfy9s1mwo', 'admin', '添加一个角色', '2018-03-29 11:00:18');
INSERT INTO `log` VALUES ('bpde902sxm', 'admin', 'logout', '2018-04-17 15:52:40');
INSERT INTO `log` VALUES ('bpg15a7cyk', 'admin', 'logout', '2018-03-28 17:32:09');
INSERT INTO `log` VALUES ('bru3z7dtga', 'admin11', 'logout', '2018-06-22 13:43:04');
INSERT INTO `log` VALUES ('bt4xf5komp', 'admin11', 'logout', '2018-06-28 14:09:57');
INSERT INTO `log` VALUES ('bwmz41fdrg', 'admin', 'logout', '2018-04-23 14:21:14');
INSERT INTO `log` VALUES ('cegdsqnz7k', 'admin11', 'logout', '2018-06-22 12:21:01');
INSERT INTO `log` VALUES ('cma4yvr3tf', 'admin11', 'logout', '2018-04-28 11:22:22');
INSERT INTO `log` VALUES ('cqgt207365', 'admin11', 'logout', '2018-06-28 14:09:57');
INSERT INTO `log` VALUES ('d5seognmtw', 'admin', 'logout', '2018-04-23 14:21:13');
INSERT INTO `log` VALUES ('d8bozwsxkp', 'admin', '添加一个角色', '2018-03-29 10:43:50');
INSERT INTO `log` VALUES ('dgpmb3c7fy', 'admin', 'logout', '2018-04-17 15:27:46');
INSERT INTO `log` VALUES ('dlkw7ub8r1', 'admin12', 'logout', '2018-06-27 13:29:57');
INSERT INTO `log` VALUES ('dnprq4lsua', 'admin12', 'logout', '2018-06-27 11:56:42');
INSERT INTO `log` VALUES ('dp1zioqtye', 'admin11', 'logout', '2018-06-28 14:12:11');
INSERT INTO `log` VALUES ('dq4p8glkne', 'admin11', 'logout', '2018-06-28 10:43:13');
INSERT INTO `log` VALUES ('dv5eug13f7', 'admin', 'logout', '2018-03-27 10:44:37');
INSERT INTO `log` VALUES ('eg3h86af45', 'admin11', 'logout', '2018-06-28 12:44:07');
INSERT INTO `log` VALUES ('elwr7qtfgy', 'admin', 'logout', '2018-03-26 16:41:41');
INSERT INTO `log` VALUES ('emilrw0fbh', 'admin11', 'logout', '2018-06-28 10:21:57');
INSERT INTO `log` VALUES ('et3nrv971c', 'admin11', 'logout', '2018-08-09 17:34:57');
INSERT INTO `log` VALUES ('eyfirbtcws', 'admin12', 'logout', '2018-06-28 10:50:25');
INSERT INTO `log` VALUES ('f1l9apqr3o', 'admin', 'logout', '2018-04-17 15:41:20');
INSERT INTO `log` VALUES ('f69y0s2p7d', 'admin', 'logout', '2018-04-17 15:41:56');
INSERT INTO `log` VALUES ('f9cxiq3ups', 'admin11', 'logout', '2018-06-27 13:44:59');
INSERT INTO `log` VALUES ('fig378u5hd', 'admin', 'logout', '2018-03-29 10:41:54');
INSERT INTO `log` VALUES ('flgm6z87ov', 'admin11', 'logout', '2018-06-27 13:46:55');
INSERT INTO `log` VALUES ('flxudgiza1', 'admin11', 'logout', '2018-06-25 14:36:49');
INSERT INTO `log` VALUES ('fp8ghzlnvy', 'admin11', 'logout', '2018-06-22 13:45:19');
INSERT INTO `log` VALUES ('fqy7w3am6d', 'admin11', 'logout', '2018-06-27 13:51:30');
INSERT INTO `log` VALUES ('fzrhbtpn6q', 'admin', 'logout', '2018-03-26 16:40:30');
INSERT INTO `log` VALUES ('g6cy7en3qh', 'admin', 'logout', '2018-04-17 15:38:51');
INSERT INTO `log` VALUES ('g87d50htlx', 'admin', 'logout', '2018-04-17 14:55:13');
INSERT INTO `log` VALUES ('g8yb3e0vkt', 'admin11', 'logout', '2018-06-27 11:54:14');
INSERT INTO `log` VALUES ('ge3p8lc5t1', 'admin11', 'logout', '2018-06-28 11:30:47');
INSERT INTO `log` VALUES ('gkwh3eadp0', 'admin12', 'logout', '2018-06-27 13:34:09');
INSERT INTO `log` VALUES ('gmo09luqth', 'admin', '添加一个角色', '2018-03-29 10:07:18');
INSERT INTO `log` VALUES ('gn145mpu79', 'admin', '添加一个角色', '2018-03-29 11:08:22');
INSERT INTO `log` VALUES ('go029siacq', 'admin11', 'logout', '2018-06-28 11:13:36');
INSERT INTO `log` VALUES ('gpk8bl2d4y', 'admin11', 'logout', '2018-06-22 13:43:04');
INSERT INTO `log` VALUES ('gpz0mcasxr', 'admin11', 'logout', '2018-06-28 10:43:33');
INSERT INTO `log` VALUES ('gs024tl3ce', 'admin11', 'logout', '2018-06-28 10:48:58');
INSERT INTO `log` VALUES ('gsqt62mzyo', 'admin11', 'logout', '2018-05-25 10:50:31');
INSERT INTO `log` VALUES ('gt05slv7ac', 'admin11', 'logout', '2018-05-25 10:50:31');
INSERT INTO `log` VALUES ('gwkazuxsv1', 'admin11', 'logout', '2018-04-27 17:26:54');
INSERT INTO `log` VALUES ('gxv30eb7if', 'admin11', 'logout', '2018-06-22 14:24:10');
INSERT INTO `log` VALUES ('gz1pakdtv7', 'admin', 'logout', '2018-04-27 14:41:14');
INSERT INTO `log` VALUES ('hslepro6wc', 'admin11', 'logout', '2018-06-28 11:37:28');
INSERT INTO `log` VALUES ('ht9xf17dun', 'admin11', 'logout', '2018-06-28 13:09:05');
INSERT INTO `log` VALUES ('hxty40nrmc', 'admin', 'logout', '2018-03-29 10:40:17');
INSERT INTO `log` VALUES ('i0bwed2krg', 'admin12', 'logout', '2018-06-27 11:56:42');
INSERT INTO `log` VALUES ('i81zxynmhp', 'admin11', 'logout', '2018-06-28 11:47:12');
INSERT INTO `log` VALUES ('ibrvcw0alh', 'admin11', 'logout', '2018-06-27 10:57:53');
INSERT INTO `log` VALUES ('ifxy71vu9z', 'admin', 'logout', '2018-03-29 10:56:13');
INSERT INTO `log` VALUES ('ign92d3qkz', 'admin', 'logout', '2018-03-26 16:39:39');
INSERT INTO `log` VALUES ('imd8a9wfnp', 'admin', 'logout', '2018-03-26 17:38:22');
INSERT INTO `log` VALUES ('kfqge1niwz', 'admin', 'logout', '2018-04-17 14:49:33');
INSERT INTO `log` VALUES ('kiu65lgmae', 'admin11', 'logout', '2018-06-28 11:47:00');
INSERT INTO `log` VALUES ('kmfzywb1gi', 'admin11', 'logout', '2018-06-22 11:01:53');
INSERT INTO `log` VALUES ('kq86mcw1og', 'admin', '添加一个角色', '2018-03-29 11:26:54');
INSERT INTO `log` VALUES ('kw8fxogiy1', 'admin12', 'logout', '2018-06-29 13:37:10');
INSERT INTO `log` VALUES ('kxwa8ngt9o', 'admin11', 'logout', '2018-06-28 10:31:24');
INSERT INTO `log` VALUES ('l0i1z5f94t', 'admin11', 'logout', '2018-06-28 10:43:13');
INSERT INTO `log` VALUES ('l1rckagus4', 'admin', 'logout', '2018-03-29 10:56:14');
INSERT INTO `log` VALUES ('leigpxnb28', 'admin11', 'logout', '2018-06-28 13:47:41');
INSERT INTO `log` VALUES ('lu3v2ntgoq', 'admin11', 'logout', '2018-06-28 11:36:49');
INSERT INTO `log` VALUES ('m5t61e7ydv', 'admin11', 'logout', '2018-06-28 11:30:47');
INSERT INTO `log` VALUES ('m9fxawy48b', 'admin', 'logout', '2018-04-17 15:38:51');
INSERT INTO `log` VALUES ('mdn2rzpvec', 'admin11', 'logout', '2018-06-22 13:45:19');
INSERT INTO `log` VALUES ('mh2rav1d0q', 'admin', 'logout', '2018-04-17 16:22:17');
INSERT INTO `log` VALUES ('mrght20ua8', 'admin11', 'logout', '2018-06-25 14:25:43');
INSERT INTO `log` VALUES ('mstxqzwgo4', 'admin', 'logout', '2018-03-29 10:43:25');
INSERT INTO `log` VALUES ('n2q4ipme3w', 'admin', 'logout', '2018-04-17 15:41:21');
INSERT INTO `log` VALUES ('n7w0k5vzb3', 'admin', 'logout', '2018-04-27 15:08:23');
INSERT INTO `log` VALUES ('nlg3mua47v', 'admin', 'logout', '2018-04-17 15:33:05');
INSERT INTO `log` VALUES ('o8k0sx2qpf', 'admin', '添加一个角色', '2018-03-29 09:57:41');
INSERT INTO `log` VALUES ('of61gbn5dk', 'admin11', 'logout', '2018-04-28 11:22:22');
INSERT INTO `log` VALUES ('p31a24ds5c', 'admin12', 'logout', '2018-06-28 11:49:57');
INSERT INTO `log` VALUES ('p4y7gld50o', 'admin12', 'logout', '2018-05-23 10:11:34');
INSERT INTO `log` VALUES ('p6w8sybcxh', 'admin11', 'logout', '2018-06-28 11:39:05');
INSERT INTO `log` VALUES ('pnoybsk2m4', 'admin11', 'logout', '2018-06-28 10:47:11');
INSERT INTO `log` VALUES ('ptyas6m587', 'admin', 'logout', '2018-03-26 17:23:34');
INSERT INTO `log` VALUES ('q1nexhdpi6', 'admin11', 'logout', '2018-06-28 13:47:41');
INSERT INTO `log` VALUES ('q3rebayg8k', 'admin11', 'logout', '2018-06-27 13:57:17');
INSERT INTO `log` VALUES ('qcf0e4bmp2', 'admin11', 'logout', '2018-06-27 13:44:21');
INSERT INTO `log` VALUES ('qh06vawdet', 'admin11', 'logout', '2018-08-21 14:42:10');
INSERT INTO `log` VALUES ('qlsd7zbcgw', 'admin', 'logout', '2018-03-28 16:53:34');
INSERT INTO `log` VALUES ('qp0ovdzys6', 'admin', 'logout', '2018-04-17 14:54:51');
INSERT INTO `log` VALUES ('r0o9neiy1z', 'admin11', 'logout', '2018-04-27 16:14:25');
INSERT INTO `log` VALUES ('r1s6g8qune', 'admin11', 'logout', '2018-08-09 17:34:56');
INSERT INTO `log` VALUES ('r1sn903vga', 'admin', 'logout', '2018-03-29 10:37:48');
INSERT INTO `log` VALUES ('r30sce7ab8', 'admin11', 'logout', '2018-06-28 13:09:05');
INSERT INTO `log` VALUES ('r5vi10sdgk', 'admin', 'logout', '2018-04-17 14:49:33');
INSERT INTO `log` VALUES ('r9a5xw7gyk', 'admin11', 'logout', '2018-06-22 12:21:01');
INSERT INTO `log` VALUES ('re9h1p485z', 'admin11', 'logout', '2018-06-27 10:58:38');
INSERT INTO `log` VALUES ('rie2l0tavn', 'admin', 'logout', '2018-03-29 10:34:32');
INSERT INTO `log` VALUES ('ryihw5azo8', 'admin11', 'logout', '2018-06-27 11:46:55');
INSERT INTO `log` VALUES ('s0b95okghe', 'admin11', 'logout', '2018-05-25 17:18:48');
INSERT INTO `log` VALUES ('s3cm5vdew7', 'admin11', 'logout', '2018-06-28 14:03:14');
INSERT INTO `log` VALUES ('s4hb5rof7g', 'admin11', 'logout', '2018-06-28 11:46:32');
INSERT INTO `log` VALUES ('s7a0ew58b6', 'admin', 'logout', '2018-04-17 14:54:51');
INSERT INTO `log` VALUES ('sacdvutpb5', 'admin12', 'logout', '2018-06-28 11:10:21');
INSERT INTO `log` VALUES ('sgecmqvkyi', 'admin11', 'logout', '2018-06-28 10:19:05');
INSERT INTO `log` VALUES ('t0q7frueko', 'admin', 'logout', '2018-03-26 16:39:50');
INSERT INTO `log` VALUES ('t34wvdc280', 'admin11', 'logout', '2018-06-25 14:23:42');
INSERT INTO `log` VALUES ('tlik58ubhg', 'admin11', 'logout', '2018-06-25 14:23:42');
INSERT INTO `log` VALUES ('tp5mygn7dh', 'admin', 'logout', '2018-04-17 15:41:56');
INSERT INTO `log` VALUES ('tphr3dam1b', 'admin11', 'logout', '2018-06-27 13:46:55');
INSERT INTO `log` VALUES ('txpkig275a', 'admin', 'logout', '2018-03-29 10:37:45');
INSERT INTO `log` VALUES ('ty2p1gqcr6', 'admin12', 'logout', '2018-06-28 14:11:53');
INSERT INTO `log` VALUES ('tz6bigr237', 'admin', 'logout', '2018-04-27 15:08:23');
INSERT INTO `log` VALUES ('u52skfnga3', 'admin11', 'logout', '2018-06-28 10:46:54');
INSERT INTO `log` VALUES ('u6ygo2fa03', 'admin11', 'logout', '2018-06-28 11:46:32');
INSERT INTO `log` VALUES ('udrox1mpf4', 'admin11', 'logout', '2018-06-28 14:05:03');
INSERT INTO `log` VALUES ('uf03kmsz7h', 'admin12', 'logout', '2018-06-27 13:29:57');
INSERT INTO `log` VALUES ('ugsmzcwh2o', 'admin11', 'logout', '2018-06-27 13:47:45');
INSERT INTO `log` VALUES ('un7xm5g831', 'admin', 'logout', '2018-03-26 17:23:34');
INSERT INTO `log` VALUES ('uqwms25vfe', 'admin11', 'logout', '2018-06-28 10:34:22');
INSERT INTO `log` VALUES ('uyt08g5icf', 'admin11', 'logout', '2018-06-27 13:51:30');
INSERT INTO `log` VALUES ('v80lp32wbk', 'admin11', 'logout', '2018-06-28 14:03:14');
INSERT INTO `log` VALUES ('vaw8sx45p9', 'admin', 'logout', '2018-03-26 16:38:14');
INSERT INTO `log` VALUES ('vw61pxf382', 'admin', 'logout', '2018-04-17 14:55:13');
INSERT INTO `log` VALUES ('vxgu3re6dc', 'admin', '添加一个角色', '2018-03-29 11:45:59');
INSERT INTO `log` VALUES ('w0hgc6lm7o', 'admin12', 'logout', '2018-06-28 11:39:51');
INSERT INTO `log` VALUES ('w5lt4sxi6k', 'admin12', 'logout', '2018-05-23 10:10:06');
INSERT INTO `log` VALUES ('w85e02vptn', 'admin', '添加一个角色', '2018-03-29 15:28:44');
INSERT INTO `log` VALUES ('wag8cdqyue', 'admin', 'logout', '2018-03-29 10:56:13');
INSERT INTO `log` VALUES ('wectgvxpb5', 'admin12', 'logout', '2018-06-28 11:49:57');
INSERT INTO `log` VALUES ('wgixa79nr6', 'admin12', 'logout', '2018-05-23 10:10:06');
INSERT INTO `log` VALUES ('wil1go09xf', 'admin11', 'logout', '2018-06-28 13:17:49');
INSERT INTO `log` VALUES ('wknz6symdc', 'admin', 'logout', '2018-04-17 15:52:40');
INSERT INTO `log` VALUES ('x30d9yse2i', 'admin', '添加一个角色', '2018-03-29 09:53:13');
INSERT INTO `log` VALUES ('xdeu8lyo3g', 'admin', 'logout', '2018-03-29 10:34:32');
INSERT INTO `log` VALUES ('xfp5dlnwzt', 'admin', 'logout', '2018-03-29 10:32:53');
INSERT INTO `log` VALUES ('xra89dtch6', 'admin11', 'logout', '2018-06-28 14:05:03');
INSERT INTO `log` VALUES ('y5hz3c70vm', 'admin11', 'logout', '2018-06-28 11:10:57');
INSERT INTO `log` VALUES ('y6l8qcdzbg', 'admin', 'logout', '2018-04-17 15:33:05');
INSERT INTO `log` VALUES ('y7lckqnth6', 'admin11', 'logout', '2018-06-27 13:57:17');
INSERT INTO `log` VALUES ('y8bv2exazc', 'admin', '添加一个角色', '2018-03-29 10:15:57');
INSERT INTO `log` VALUES ('z3puelgocv', 'admin', '添加一个角色', '2018-03-29 14:45:37');
INSERT INTO `log` VALUES ('z5gqs6uo01', 'admin11', 'logout', '2018-06-22 13:40:04');
INSERT INTO `log` VALUES ('z7mce1gft4', 'admin11', 'logout', '2018-06-27 10:57:53');
INSERT INTO `log` VALUES ('z92q81misr', 'admin11', 'logout', '2018-06-25 14:27:11');

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
-- Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `uid` varchar(255) NOT NULL,
  `id` varchar(255) DEFAULT NULL,
  `proname` varchar(255) DEFAULT NULL,
  `prodes` varchar(255) DEFAULT NULL,
  `protime` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('0d571128f21f46e6814461b9b306ccef', 'admin11', '福建农商', '统一收单', '2018-06-29 16:10:23', '1');
INSERT INTO `project` VALUES ('85ac65f29cc34f8da457fae36e9fbe75', 'admin11', '啊实打实大', '啊实打实大', '2018-05-04 16:04:38', '0');
INSERT INTO `project` VALUES ('d0822b945b714aa29cb6369d746ea12b', 'admin11', '南昌农信', '统一收单一码付', '2018-06-29 17:08:20', '1');
INSERT INTO `project` VALUES ('ed72887b1edb41cdbb44b9779dca49f4', 'admin12', '九江银行', '一码付收单', '2018-06-28 14:13:46', '1');

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
INSERT INTO `roles` VALUES ('r10', '权限最大', '83a9542fc5734cf2993e2347ae9fee54', '1', '2018-04-27 15:26:58', null, '超级管理');
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
INSERT INTO `roll` VALUES ('1', '1', '1', '1', '1', '1');

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
  `longitude` varchar(255) DEFAULT NULL,
  `dimension` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0', 'admin', 'admin', null, null, null, '18237145079', null, null, null, '1', '超级编辑', null, null, null);
INSERT INTO `user` VALUES ('28959e6957914c2e9a9be60888591de1', 'admin5', '96e79218965eb72c92a549dd5a330112', null, null, null, '12365654587', null, '岳不群', null, null, '小人', null, null, null);
INSERT INTO `user` VALUES ('4aaa355ea71d4f89b3fa9600207d9141', '111111', '9dbc015778cd5b4de40a545e596eb04d', null, null, null, '12545458758', null, '任我行', null, null, '老爹', null, null, null);
INSERT INTO `user` VALUES ('522fdc876be243048d73b1b32af02d3e', 'admin2', '96e79218965eb72c92a549dd5a330112', null, null, null, '14257896548', null, '任盈盈', null, null, '厂长老婆', null, null, null);
INSERT INTO `user` VALUES ('5bb287b786474935a05517cad315cb61', 'admin1', '29c3eea3f305d6b823f562ac4be35217', null, null, null, '18024712478', null, '令狐少侠', null, null, '厂长', null, null, null);
INSERT INTO `user` VALUES ('733a694d444049ceb575bbea00ca616e', 'admin12', '21232f297a57a5a743894a0e4a801fc3', null, null, null, '12545875478', null, '东方不败', null, '[\"r02\",\"r01\"]', '魔教教主', null, '116.41667', '39.91667');
INSERT INTO `user` VALUES ('7f4af7fa33744979804895076e6862c9', 'admin11', '21232f297a57a5a743894a0e4a801fc3', null, null, null, '12354875478', null, '岳灵珊', null, '[\"r10\"]', '小仙女', null, '113.23333', '23.16667');
INSERT INTO `user` VALUES ('e11877846d8e4493b4fe5003a3e9a0a9', 'admin10', '96e79218965eb72c92a549dd5a330112', null, null, null, '12312312312321', null, '风清扬', null, null, '祖师', null, null, null);
INSERT INTO `user` VALUES ('e53a9e8c78ef4012a840c63b2c7a0316', 'admin3', '96e79218965eb72c92a549dd5a330112', null, null, null, '12545454545', null, '林平之', null, null, '第三者', null, null, null);

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
