package com.ruomu.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String zhanghao;

    private String mima;

    private String shoujihao;

    private Integer nianling;

    private String zhuzhi;

    private Integer quanxian;

    private Date zhuceTime;

    private String ip;

    private byte[] touxiang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima == null ? null : mima.trim();
    }

    public String getShoujihao() {
        return shoujihao;
    }

    public void setShoujihao(String shoujihao) {
        this.shoujihao = shoujihao == null ? null : shoujihao.trim();
    }

    public Integer getNianling() {
        return nianling;
    }

    public void setNianling(Integer nianling) {
        this.nianling = nianling;
    }

    public String getZhuzhi() {
        return zhuzhi;
    }

    public void setZhuzhi(String zhuzhi) {
        this.zhuzhi = zhuzhi == null ? null : zhuzhi.trim();
    }

    public Integer getQuanxian() {
        return quanxian;
    }

    public void setQuanxian(Integer quanxian) {
        this.quanxian = quanxian;
    }

    public Date getZhuceTime() {
        return zhuceTime;
    }

    public void setZhuceTime(Date zhuceTime) {
        this.zhuceTime = zhuceTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public byte[] getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(byte[] touxiang) {
        this.touxiang = touxiang;
    }
}
