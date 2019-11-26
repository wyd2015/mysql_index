package com.mallo.index.model.po.generator;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table monitor_alert
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class MonitorAlert implements Serializable {
    /**
     *   报送表自增主键
     *
     * @mbg.generated
     */
    private Integer alertId;

    /**
     *   预警区域  1有用区 2无用区 0未分区
     *
     * @mbg.generated
     */
    private Integer region;

    /**
     *   是否收藏 1已收藏
     *
     * @mbg.generated
     */
    private Integer isFavorite;

    /**
     *   创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *   预警开始时间
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *   通道内数据的唯一标识
     *
     * @mbg.generated
     */
    private String msgKey;

    /**
     *   该条消息的用户标识
     *
     * @mbg.generated
     */
    private String msgUGChKey;

    /**
     *   内容相似度标签
     *
     * @mbg.generated
     */
    private String msgSemblance;

    /**
     *   消息生成/发布时间
     *
     * @mbg.generated
     */
    private Date msgPublishTime;

    /**
     *   文档标题
     *
     * @mbg.generated
     */
    private String msgTitle;

    /**
     *
     * @mbg.generated
     */
    private String msgAbstract;

    /**
     *   原文链接
     *
     * @mbg.generated
     */
    private String msgUrl;

    /**
     *   引发热点舆论场编号
     *
     * @mbg.generated
     */
    private Integer situation;

    /**
     *   预警类型（参考config表）
     *
     * @mbg.generated
     */
    private String alertType;

    /**
     *   监测时段（1、3、12）
     *
     * @mbg.generated
     */
    private Integer timeType;

    /**
     *   预警值涨幅
     *
     * @mbg.generated
     */
    private Integer threshold;

    /**
     *   预警值涨幅的热度
     *
     * @mbg.generated
     */
    private Integer thresholdHot;

    /**
     *   是否删除 1已删除
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     *   删除时间
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *   删除用户ID
     *
     * @mbg.generated
     */
    private String deleteUserId;

    /**
     *   是否报送 1已报送
     *
     * @mbg.generated
     */
    private Integer isReceive;

    /**
     *   预警时的相关数量
     *
     * @mbg.generated
     */
    private Integer alertNum;

    /**
     *   文档频道
     *
     * @mbg.generated
     */
    private String msgBoard;

    /**
     *   文档来源网站
     *
     * @mbg.generated
     */
    private String msgWebsite;

    /**
     *   昵称
     *
     * @mbg.generated
     */
    private String msgUname;

    /**
     *   回复数
     *
     * @mbg.generated
     */
    private Integer msgReplyNum;

    /**
     *   转发数
     *
     * @mbg.generated
     */
    private Integer msgForwardNum;

    /**
     *   阅读数
     *
     * @mbg.generated
     */
    private Integer msgReadNum;

    /**
     *   点赞数
     *
     * @mbg.generated
     */
    private Integer msgLikeNum;

    /**
     *   1是；0非
     *
     * @mbg.generated
     */
    private Integer isTopic;

    /**
     *
     * @mbg.generated
     */
    private Integer regionType;

    /**
     *   根节点,合并预警信息用,默认为0，其他类型时为最大time_type的alert_id
     *
     * @mbg.generated
     */
    private Integer rootId;

    /**
     *   0 未被合并 ；1 1小时事件 ； 2 3小时事件 ； 4 12小时事件； 3 1、3小时事件； 5 1、12小时事件； 6 3、12小时事件； 7 1、3、12小时事件(判断是&运算判断)
     *
     * @mbg.generated
     */
    private Integer mergeTime;

    /**
     *   是否重点关注0代表未重点关注，1代表重点关注
     *
     * @mbg.generated
     */
    private Integer isFocus;

    /**
     *   标题相似度标签
     *
     * @mbg.generated
     */
    private String msgTitleSemblance;

    /**
     *   存储网站id
     *
     * @mbg.generated
     */
    private Integer msgWebsiteId;

    /**
     *   消息倾向性,取值[0,100]
     *
     * @mbg.generated
     */
    private Integer msgSentiment;

    /**
     *   文档内容
     *
     * @mbg.generated
     */
    private String msgContent;

    /**
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @mbg.generated
     */
    public Integer getAlertId() {
        return alertId;
    }

    /**
     *
     * @mbg.generated
     */
    public void setAlertId(Integer alertId) {
        this.alertId = alertId;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getRegion() {
        return region;
    }

    /**
     *
     * @mbg.generated
     */
    public void setRegion(Integer region) {
        this.region = region;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getIsFavorite() {
        return isFavorite;
    }

    /**
     *
     * @mbg.generated
     */
    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }

    /**
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgKey() {
        return msgKey;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgUGChKey() {
        return msgUGChKey;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgUGChKey(String msgUGChKey) {
        this.msgUGChKey = msgUGChKey;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgSemblance() {
        return msgSemblance;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgSemblance(String msgSemblance) {
        this.msgSemblance = msgSemblance;
    }

    /**
     *
     * @mbg.generated
     */
    public Date getMsgPublishTime() {
        return msgPublishTime;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgPublishTime(Date msgPublishTime) {
        this.msgPublishTime = msgPublishTime;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgTitle() {
        return msgTitle;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgAbstract() {
        return msgAbstract;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgAbstract(String msgAbstract) {
        this.msgAbstract = msgAbstract;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgUrl() {
        return msgUrl;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgUrl(String msgUrl) {
        this.msgUrl = msgUrl;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getSituation() {
        return situation;
    }

    /**
     *
     * @mbg.generated
     */
    public void setSituation(Integer situation) {
        this.situation = situation;
    }

    /**
     *
     * @mbg.generated
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     *
     * @mbg.generated
     */
    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getTimeType() {
        return timeType;
    }

    /**
     *
     * @mbg.generated
     */
    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getThreshold() {
        return threshold;
    }

    /**
     *
     * @mbg.generated
     */
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getThresholdHot() {
        return thresholdHot;
    }

    /**
     *
     * @mbg.generated
     */
    public void setThresholdHot(Integer thresholdHot) {
        this.thresholdHot = thresholdHot;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     *
     * @mbg.generated
     */
    public String getDeleteUserId() {
        return deleteUserId;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getIsReceive() {
        return isReceive;
    }

    /**
     *
     * @mbg.generated
     */
    public void setIsReceive(Integer isReceive) {
        this.isReceive = isReceive;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getAlertNum() {
        return alertNum;
    }

    /**
     *
     * @mbg.generated
     */
    public void setAlertNum(Integer alertNum) {
        this.alertNum = alertNum;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgBoard() {
        return msgBoard;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgBoard(String msgBoard) {
        this.msgBoard = msgBoard;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgWebsite() {
        return msgWebsite;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgWebsite(String msgWebsite) {
        this.msgWebsite = msgWebsite;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgUname() {
        return msgUname;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgUname(String msgUname) {
        this.msgUname = msgUname;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getMsgReplyNum() {
        return msgReplyNum;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgReplyNum(Integer msgReplyNum) {
        this.msgReplyNum = msgReplyNum;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getMsgForwardNum() {
        return msgForwardNum;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgForwardNum(Integer msgForwardNum) {
        this.msgForwardNum = msgForwardNum;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getMsgReadNum() {
        return msgReadNum;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgReadNum(Integer msgReadNum) {
        this.msgReadNum = msgReadNum;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getMsgLikeNum() {
        return msgLikeNum;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgLikeNum(Integer msgLikeNum) {
        this.msgLikeNum = msgLikeNum;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getIsTopic() {
        return isTopic;
    }

    /**
     *
     * @mbg.generated
     */
    public void setIsTopic(Integer isTopic) {
        this.isTopic = isTopic;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getRegionType() {
        return regionType;
    }

    /**
     *
     * @mbg.generated
     */
    public void setRegionType(Integer regionType) {
        this.regionType = regionType;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getRootId() {
        return rootId;
    }

    /**
     *
     * @mbg.generated
     */
    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getMergeTime() {
        return mergeTime;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMergeTime(Integer mergeTime) {
        this.mergeTime = mergeTime;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getIsFocus() {
        return isFocus;
    }

    /**
     *
     * @mbg.generated
     */
    public void setIsFocus(Integer isFocus) {
        this.isFocus = isFocus;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgTitleSemblance() {
        return msgTitleSemblance;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgTitleSemblance(String msgTitleSemblance) {
        this.msgTitleSemblance = msgTitleSemblance;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getMsgWebsiteId() {
        return msgWebsiteId;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgWebsiteId(Integer msgWebsiteId) {
        this.msgWebsiteId = msgWebsiteId;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getMsgSentiment() {
        return msgSentiment;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgSentiment(Integer msgSentiment) {
        this.msgSentiment = msgSentiment;
    }

    /**
     *
     * @mbg.generated
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
}