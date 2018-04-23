package org.hades.wonder.sample.bean;

import org.hades.wonder.framework.bean.ResponseStatusBean;

/**
 * Created by Hades on 2017/10/30.
 */

public class UserBean extends ResponseStatusBean {


    /**
     * status : 1
     * message : 登入成功
     * data : {"env_id":"DEMO-QY","uid":"DEMO-QY-USER-004","user_id":"DEMO-QY-USER-004","user_account":"13880001004","user_sex":"1","user_birthday":null,"user_real_name":null,"user_email":null,"user_phone":"13880001004","company_user_id":"DEMO-QY-USER-004","user_avatar":"http://upload.auto-mooc.com/tmp/avatar/d04.png","user_nick_name":"员工03","company_id":"DEMO-QY","rc_token":"yXRcmYRDXd7ILKmHsU7L0mZrUacXhrpsXrl1wzOA5prLMSEobOWr3VR/w3+sPtIZANLFVYJK116SsU+2XJxsmHTLAYDrw8rQzrhOezcPHkg=","company_domain":"qydemo.auto-mooc.com"}
     */

//    public int status;
//    public String message;
    public DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * env_id : DEMO-QY
         * uid : DEMO-QY-USER-004
         * user_id : DEMO-QY-USER-004
         * user_account : 13880001004
         * user_sex : 1
         * user_birthday : null
         * user_real_name : null
         * user_email : null
         * user_phone : 13880001004
         * company_user_id : DEMO-QY-USER-004
         * user_avatar : http://upload.auto-mooc.com/tmp/avatar/d04.png
         * user_nick_name : 员工03
         * company_id : DEMO-QY
         * rc_token : yXRcmYRDXd7ILKmHsU7L0mZrUacXhrpsXrl1wzOA5prLMSEobOWr3VR/w3+sPtIZANLFVYJK116SsU+2XJxsmHTLAYDrw8rQzrhOezcPHkg=
         * company_domain : qydemo.auto-mooc.com
         */

        private String env_id;
        private String uid;
        private String user_id;
        private String user_account;
        private String user_sex;
        private Object user_birthday;
        private Object user_real_name;
        private Object user_email;
        private String user_phone;
        private String company_user_id;
        private String user_avatar;
        private String user_nick_name;
        private String company_id;
        private String rc_token;
        private String company_domain;

        public String getEnv_id() {
            return env_id;
        }

        public void setEnv_id(String env_id) {
            this.env_id = env_id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_account() {
            return user_account;
        }

        public void setUser_account(String user_account) {
            this.user_account = user_account;
        }

        public String getUser_sex() {
            return user_sex;
        }

        public void setUser_sex(String user_sex) {
            this.user_sex = user_sex;
        }

        public Object getUser_birthday() {
            return user_birthday;
        }

        public void setUser_birthday(Object user_birthday) {
            this.user_birthday = user_birthday;
        }

        public Object getUser_real_name() {
            return user_real_name;
        }

        public void setUser_real_name(Object user_real_name) {
            this.user_real_name = user_real_name;
        }

        public Object getUser_email() {
            return user_email;
        }

        public void setUser_email(Object user_email) {
            this.user_email = user_email;
        }

        public String getUser_phone() {
            return user_phone;
        }

        public void setUser_phone(String user_phone) {
            this.user_phone = user_phone;
        }

        public String getCompany_user_id() {
            return company_user_id;
        }

        public void setCompany_user_id(String company_user_id) {
            this.company_user_id = company_user_id;
        }

        public String getUser_avatar() {
            return user_avatar;
        }

        public void setUser_avatar(String user_avatar) {
            this.user_avatar = user_avatar;
        }

        public String getUser_nick_name() {
            return user_nick_name;
        }

        public void setUser_nick_name(String user_nick_name) {
            this.user_nick_name = user_nick_name;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }

        public String getRc_token() {
            return rc_token;
        }

        public void setRc_token(String rc_token) {
            this.rc_token = rc_token;
        }

        public String getCompany_domain() {
            return company_domain;
        }

        public void setCompany_domain(String company_domain) {
            this.company_domain = company_domain;
        }
    }
}
