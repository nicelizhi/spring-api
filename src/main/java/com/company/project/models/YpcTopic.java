package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcTopic {

  private long topicId;
  private String title;
  private String intro;
  private long startTime;
  private long endTime;
  private String data;
  private String template;
  private String css;
  private String topicImg;
  private String titlePic;
  private String baseStyle;
  private String htmls;
  private String keywords;
  private String description;


  public long getTopicId() {
    return topicId;
  }

  public void setTopicId(long topicId) {
    this.topicId = topicId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }


  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }


  public String getTopicImg() {
    return topicImg;
  }

  public void setTopicImg(String topicImg) {
    this.topicImg = topicImg;
  }


  public String getTitlePic() {
    return titlePic;
  }

  public void setTitlePic(String titlePic) {
    this.titlePic = titlePic;
  }


  public String getBaseStyle() {
    return baseStyle;
  }

  public void setBaseStyle(String baseStyle) {
    this.baseStyle = baseStyle;
  }


  public String getHtmls() {
    return htmls;
  }

  public void setHtmls(String htmls) {
    this.htmls = htmls;
  }


  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
