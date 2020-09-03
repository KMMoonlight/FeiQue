package com.kmmoonlight.entity;

public class FindDocRepo {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private String title;

        private String cover;

        private String created_at;

        private String updated_at;

        private String body_html;

        private UserBean creator;

        public UserBean getUser() {
            return creator;
        }

        public void setUser(UserBean user) {
            this.creator = user;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getBody_html() {
            return body_html;
        }

        public void setBody_html(String body_html) {
            this.body_html = body_html;
        }

        public static class UserBean {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }



}
