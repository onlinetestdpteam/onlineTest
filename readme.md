# 在线考试系统
## 架构
本项目采用经典的MVC架构，
controller 层 为接近视图层的请求转发层
dao 层 提供数据操纵
model 层 实体类
service,serviceImpl 层 业务层

大致流程为当controller接收到请求之后就会处理相应代码，如果涉及到其它层就会调用service，dao依次处理，然后将返回结果
返回页面或者直接返回数据（格式为json格式）

## 本项目采用技术：
springMVC + mybatis + spring + freemaker + pagehelper + axios + mongdb + shiro

## api风格
resfulAPI
## 数据库技术
mysql + mongdb

## 项目管理
maven

## 项目版本控制
git