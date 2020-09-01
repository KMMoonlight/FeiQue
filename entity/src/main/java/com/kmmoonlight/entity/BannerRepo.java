package com.kmmoonlight.entity;

import com.google.gson.annotations.SerializedName;
import com.stx.xhb.androidx.entity.BaseBannerInfo;

import java.util.List;

public class BannerRepo {


    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements BaseBannerInfo {
        private int id;
        private int space_id;
        private String type;
        private Object sub_type;
        private String title;
        private Object title_draft;
        private Object tag;
        private String slug;
        private int user_id;
        private int book_id;
        private int last_editor_id;
        private String cover;
        private String description;
        private Object custom_description;
        private String format;
        private int status;
        private int read_status;
        private int view_status;
        @SerializedName("public")
        private int publicX;
        private int draft_version;
        private int comments_count;
        private int likes_count;
        private String content_updated_at;
        private String created_at;
        private String updated_at;
        private String published_at;
        private String first_published_at;
        private int word_count;
        private String selected_at;
        private Object pinned_at;
        private MetaBean meta;
        private BookBean book;
        private UserBeanX user;
        private Object last_editor;
        private Object share;
        private boolean isPreimum;
        private String _serializer;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSpace_id() {
            return space_id;
        }

        public void setSpace_id(int space_id) {
            this.space_id = space_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getSub_type() {
            return sub_type;
        }

        public void setSub_type(Object sub_type) {
            this.sub_type = sub_type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getTitle_draft() {
            return title_draft;
        }

        public void setTitle_draft(Object title_draft) {
            this.title_draft = title_draft;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getBook_id() {
            return book_id;
        }

        public void setBook_id(int book_id) {
            this.book_id = book_id;
        }

        public int getLast_editor_id() {
            return last_editor_id;
        }

        public void setLast_editor_id(int last_editor_id) {
            this.last_editor_id = last_editor_id;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Object getCustom_description() {
            return custom_description;
        }

        public void setCustom_description(Object custom_description) {
            this.custom_description = custom_description;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getRead_status() {
            return read_status;
        }

        public void setRead_status(int read_status) {
            this.read_status = read_status;
        }

        public int getView_status() {
            return view_status;
        }

        public void setView_status(int view_status) {
            this.view_status = view_status;
        }

        public int getPublicX() {
            return publicX;
        }

        public void setPublicX(int publicX) {
            this.publicX = publicX;
        }

        public int getDraft_version() {
            return draft_version;
        }

        public void setDraft_version(int draft_version) {
            this.draft_version = draft_version;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public int getLikes_count() {
            return likes_count;
        }

        public void setLikes_count(int likes_count) {
            this.likes_count = likes_count;
        }

        public String getContent_updated_at() {
            return content_updated_at;
        }

        public void setContent_updated_at(String content_updated_at) {
            this.content_updated_at = content_updated_at;
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

        public String getPublished_at() {
            return published_at;
        }

        public void setPublished_at(String published_at) {
            this.published_at = published_at;
        }

        public String getFirst_published_at() {
            return first_published_at;
        }

        public void setFirst_published_at(String first_published_at) {
            this.first_published_at = first_published_at;
        }

        public int getWord_count() {
            return word_count;
        }

        public void setWord_count(int word_count) {
            this.word_count = word_count;
        }

        public String getSelected_at() {
            return selected_at;
        }

        public void setSelected_at(String selected_at) {
            this.selected_at = selected_at;
        }

        public Object getPinned_at() {
            return pinned_at;
        }

        public void setPinned_at(Object pinned_at) {
            this.pinned_at = pinned_at;
        }

        public MetaBean getMeta() {
            return meta;
        }

        public void setMeta(MetaBean meta) {
            this.meta = meta;
        }

        public BookBean getBook() {
            return book;
        }

        public void setBook(BookBean book) {
            this.book = book;
        }

        public UserBeanX getUser() {
            return user;
        }

        public void setUser(UserBeanX user) {
            this.user = user;
        }

        public Object getLast_editor() {
            return last_editor;
        }

        public void setLast_editor(Object last_editor) {
            this.last_editor = last_editor;
        }

        public Object getShare() {
            return share;
        }

        public void setShare(Object share) {
            this.share = share;
        }

        public boolean isIsPreimum() {
            return isPreimum;
        }

        public void setIsPreimum(boolean isPreimum) {
            this.isPreimum = isPreimum;
        }

        public String get_serializer() {
            return _serializer;
        }

        public void set_serializer(String _serializer) {
            this._serializer = _serializer;
        }

        @Override
        public Object getXBannerUrl() {
            return cover;
        }

        @Override
        public String getXBannerTitle() {
            return title;
        }

        public static class MetaBean {
        }

        public static class BookBean {
            /**
             * id : 1617877
             * type : Book
             * slug : wubm60
             * name : iconfont 图标破千万啦～新插画库上线
             * user_id : 1009033
             * description : iconfont 是由阿里妈妈 MUX 打造的矢量素材平台，目前有千万级图标和精美的插画库…
             * public : 1
             * created_at : 2020-08-14T07:06:30.000Z
             * updated_at : 2020-08-26T03:33:43.000Z
             * content_updated_at : 2020-08-26T03:33:43.000Z
             * layout : Book
             * doc_viewport : fixed
             * doc_typography : null
             * user : {"id":1009033,"type":"User","login":"u789664","name":"ice","description":null,"avatar":null,"avatar_url":"https://gw.alipayobjects.com/zos/rmsportal/wYnHWSXDmBhiEmuwXsym.png","followers_count":0,"following_count":0,"status":1,"public":1,"scene":null,"created_at":"2020-02-26T06:39:36.000Z","updated_at":"2020-08-27T07:05:01.000Z","isPaid":false,"member_level":0,"profile":null,"_serializer":"web.user"}
             * creator : null
             * _serializer : web.book
             */

            private int id;
            private String type;
            private String slug;
            private String name;
            private int user_id;
            private String description;
            @SerializedName("public")
            private int publicX;
            private String created_at;
            private String updated_at;
            private String content_updated_at;
            private String layout;
            private String doc_viewport;
            private Object doc_typography;
            private UserBean user;
            private Object creator;
            private String _serializer;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getPublicX() {
                return publicX;
            }

            public void setPublicX(int publicX) {
                this.publicX = publicX;
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

            public String getContent_updated_at() {
                return content_updated_at;
            }

            public void setContent_updated_at(String content_updated_at) {
                this.content_updated_at = content_updated_at;
            }

            public String getLayout() {
                return layout;
            }

            public void setLayout(String layout) {
                this.layout = layout;
            }

            public String getDoc_viewport() {
                return doc_viewport;
            }

            public void setDoc_viewport(String doc_viewport) {
                this.doc_viewport = doc_viewport;
            }

            public Object getDoc_typography() {
                return doc_typography;
            }

            public void setDoc_typography(Object doc_typography) {
                this.doc_typography = doc_typography;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public Object getCreator() {
                return creator;
            }

            public void setCreator(Object creator) {
                this.creator = creator;
            }

            public String get_serializer() {
                return _serializer;
            }

            public void set_serializer(String _serializer) {
                this._serializer = _serializer;
            }

            public static class UserBean {
                /**
                 * id : 1009033
                 * type : User
                 * login : u789664
                 * name : ice
                 * description : null
                 * avatar : null
                 * avatar_url : https://gw.alipayobjects.com/zos/rmsportal/wYnHWSXDmBhiEmuwXsym.png
                 * followers_count : 0
                 * following_count : 0
                 * status : 1
                 * public : 1
                 * scene : null
                 * created_at : 2020-02-26T06:39:36.000Z
                 * updated_at : 2020-08-27T07:05:01.000Z
                 * isPaid : false
                 * member_level : 0
                 * profile : null
                 * _serializer : web.user
                 */

                private int id;
                private String type;
                private String login;
                private String name;
                private Object description;
                private Object avatar;
                private String avatar_url;
                private int followers_count;
                private int following_count;
                private int status;
                @SerializedName("public")
                private int publicX;
                private Object scene;
                private String created_at;
                private String updated_at;
                private boolean isPaid;
                private int member_level;
                private Object profile;
                private String _serializer;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Object getDescription() {
                    return description;
                }

                public void setDescription(Object description) {
                    this.description = description;
                }

                public Object getAvatar() {
                    return avatar;
                }

                public void setAvatar(Object avatar) {
                    this.avatar = avatar;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public int getFollowers_count() {
                    return followers_count;
                }

                public void setFollowers_count(int followers_count) {
                    this.followers_count = followers_count;
                }

                public int getFollowing_count() {
                    return following_count;
                }

                public void setFollowing_count(int following_count) {
                    this.following_count = following_count;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getPublicX() {
                    return publicX;
                }

                public void setPublicX(int publicX) {
                    this.publicX = publicX;
                }

                public Object getScene() {
                    return scene;
                }

                public void setScene(Object scene) {
                    this.scene = scene;
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

                public boolean isIsPaid() {
                    return isPaid;
                }

                public void setIsPaid(boolean isPaid) {
                    this.isPaid = isPaid;
                }

                public int getMember_level() {
                    return member_level;
                }

                public void setMember_level(int member_level) {
                    this.member_level = member_level;
                }

                public Object getProfile() {
                    return profile;
                }

                public void setProfile(Object profile) {
                    this.profile = profile;
                }

                public String get_serializer() {
                    return _serializer;
                }

                public void set_serializer(String _serializer) {
                    this._serializer = _serializer;
                }
            }
        }

        public static class UserBeanX {
            /**
             * id : 1009033
             * type : User
             * login : u789664
             * name : ice
             * description : null
             * avatar : null
             * avatar_url : https://gw.alipayobjects.com/zos/rmsportal/wYnHWSXDmBhiEmuwXsym.png
             * followers_count : 0
             * following_count : 0
             * status : 1
             * public : 1
             * scene : null
             * created_at : 2020-02-26T06:39:36.000Z
             * updated_at : 2020-08-27T07:05:01.000Z
             * isPaid : false
             * member_level : 0
             * profile : null
             * _serializer : web.user
             */

            private int id;
            private String type;
            private String login;
            private String name;
            private Object description;
            private Object avatar;
            private String avatar_url;
            private int followers_count;
            private int following_count;
            private int status;
            @SerializedName("public")
            private int publicX;
            private Object scene;
            private String created_at;
            private String updated_at;
            private boolean isPaid;
            private int member_level;
            private Object profile;
            private String _serializer;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Object getDescription() {
                return description;
            }

            public void setDescription(Object description) {
                this.description = description;
            }

            public Object getAvatar() {
                return avatar;
            }

            public void setAvatar(Object avatar) {
                this.avatar = avatar;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public int getFollowers_count() {
                return followers_count;
            }

            public void setFollowers_count(int followers_count) {
                this.followers_count = followers_count;
            }

            public int getFollowing_count() {
                return following_count;
            }

            public void setFollowing_count(int following_count) {
                this.following_count = following_count;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getPublicX() {
                return publicX;
            }

            public void setPublicX(int publicX) {
                this.publicX = publicX;
            }

            public Object getScene() {
                return scene;
            }

            public void setScene(Object scene) {
                this.scene = scene;
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

            public boolean isIsPaid() {
                return isPaid;
            }

            public void setIsPaid(boolean isPaid) {
                this.isPaid = isPaid;
            }

            public int getMember_level() {
                return member_level;
            }

            public void setMember_level(int member_level) {
                this.member_level = member_level;
            }

            public Object getProfile() {
                return profile;
            }

            public void setProfile(Object profile) {
                this.profile = profile;
            }

            public String get_serializer() {
                return _serializer;
            }

            public void set_serializer(String _serializer) {
                this._serializer = _serializer;
            }
        }
    }
}
