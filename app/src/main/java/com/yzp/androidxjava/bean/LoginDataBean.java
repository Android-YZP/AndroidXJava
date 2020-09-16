package com.yzp.androidxjava.bean;

public class LoginDataBean {

    /**
     * access_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnRfaWQiOiIwMDAwMDAiLCJ1c2VyX25hbWUiOiJhZG1pbiIsInJlYWxfbmFtZSI6IueuoeeQhuWRmCIsImF2YXRhciI6Imh0dHBzOi8vZ3cuYWxpcGF5b2JqZWN0cy5jb20vem9zL3Jtc3BvcnRhbC9CaWF6ZmFueG1hbU5Sb3h4VnhrYS5wbmciLCJhdXRob3JpdGllcyI6WyJhZG1pbmlzdHJhdG9yIl0sImNsaWVudF9pZCI6InNhYmVyIiwicm9sZV9uYW1lIjoiYWRtaW5pc3RyYXRvciIsImxpY2Vuc2UiOiJwb3dlcmVkIGJ5IGJsYWRleCIsInBvc3RfaWQiOiIxMTIzNTk4ODE3NzM4Njc1MjAxIiwidXNlcl9pZCI6IjExMjM1OTg4MjE3Mzg2NzUyMDEiLCJyb2xlX2lkIjoiMTEyMzU5ODgxNjczODY3NTIwMSIsInNjb3BlIjpbImFsbCJdLCJuaWNrX25hbWUiOiLnrqHnkIblkZgiLCJvYXV0aF9pZCI6IiIsImV4cCI6MTU5NjcwMjEyOCwiZGVwdF9pZCI6IjExMjM1OTg4MTM3Mzg2NzUyMDEiLCJqdGkiOiI2YWQ3NTIwMC1kNGZlLTQ3OTAtOWNlYy0yNzEzNTM1NTBiNDAiLCJhY2NvdW50IjoiYWRtaW4ifQ.ly2WDTJ0qQo-07rYXACZszkSgjJN0l6JIbJ9YyAARfA
     * token_type : bearer
     * refresh_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnRfaWQiOiIwMDAwMDAiLCJ1c2VyX25hbWUiOiJhZG1pbiIsInJlYWxfbmFtZSI6IueuoeeQhuWRmCIsImF2YXRhciI6Imh0dHBzOi8vZ3cuYWxpcGF5b2JqZWN0cy5jb20vem9zL3Jtc3BvcnRhbC9CaWF6ZmFueG1hbU5Sb3h4VnhrYS5wbmciLCJhdXRob3JpdGllcyI6WyJhZG1pbmlzdHJhdG9yIl0sImNsaWVudF9pZCI6InNhYmVyIiwicm9sZV9uYW1lIjoiYWRtaW5pc3RyYXRvciIsImxpY2Vuc2UiOiJwb3dlcmVkIGJ5IGJsYWRleCIsInBvc3RfaWQiOiIxMTIzNTk4ODE3NzM4Njc1MjAxIiwidXNlcl9pZCI6IjExMjM1OTg4MjE3Mzg2NzUyMDEiLCJyb2xlX2lkIjoiMTEyMzU5ODgxNjczODY3NTIwMSIsInNjb3BlIjpbImFsbCJdLCJuaWNrX25hbWUiOiLnrqHnkIblkZgiLCJhdGkiOiI2YWQ3NTIwMC1kNGZlLTQ3OTAtOWNlYy0yNzEzNTM1NTBiNDAiLCJvYXV0aF9pZCI6IiIsImV4cCI6MTU5NzIyMDUyOCwiZGVwdF9pZCI6IjExMjM1OTg4MTM3Mzg2NzUyMDEiLCJqdGkiOiJjODU4ZjcyMi02MDlhLTRjNTEtOTkyZS04ZjdkNDRhYzMzYzciLCJhY2NvdW50IjoiYWRtaW4ifQ.brY9hWJwwVv55onMc3FOtvf7L4pHeDUtmr7BD4jmyog
     * expires_in : 86399
     * scope : all
     * tenant_id : 000000
     * user_name : admin
     * real_name : 管理员
     * avatar : https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png
     * client_id : saber
     * role_name : administrator
     * license : powered by bladex
     * post_id : 1123598817738675201
     * user_id : 1123598821738675201
     * role_id : 1123598816738675201
     * nick_name : 管理员
     * oauth_id :
     * dept_id : 1123598813738675201
     * account : admin
     * jti : 6ad75200-d4fe-4790-9cec-271353550b40
     */

    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String tenant_id;
    private String user_name;
    private String real_name;
    private String avatar;
    private String client_id;
    private String role_name;
    private String license;
    private String post_id;
    private String user_id;
    private String role_id;
    private String nick_name;
    private String oauth_id;
    private String dept_id;
    private String account;
    private String jti;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getOauth_id() {
        return oauth_id;
    }

    public void setOauth_id(String oauth_id) {
        this.oauth_id = oauth_id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }
}
