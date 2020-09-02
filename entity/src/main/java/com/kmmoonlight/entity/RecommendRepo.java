package com.kmmoonlight.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecommendRepo {


    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<DocsBean> docs;

        public List<DocsBean> getDocs() {
            return docs;
        }

        public void setDocs(List<DocsBean> docs) {
            this.docs = docs;
        }

        public static class DocsBean {

            private int id;
            private int space_id;
            private String type;
            private String title;
            private String slug;
            private int user_id;
            private int book_id;
            private int last_editor_id;
            private String cover;
            private String description;
            private String custom_description;
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
            private MetaBean meta;
            private BookBean book;
            private UserBeanX user;
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


            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
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

            public String getCustom_description() {
                return custom_description;
            }

            public void setCustom_description(String custom_description) {
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

            public static class MetaBean {
            }

            public static class BookBean {

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
                private UserBean user;
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

                public UserBean getUser() {
                    return user;
                }

                public void setUser(UserBean user) {
                    this.user = user;
                }

                public String get_serializer() {
                    return _serializer;
                }

                public void set_serializer(String _serializer) {
                    this._serializer = _serializer;
                }

                public static class UserBean {

                    private int id;
                    private String type;
                    private String login;
                    private String name;
                    private String description;
                    private String avatar;
                    private String avatar_url;
                    private int followers_count;
                    private int following_count;
                    private int status;
                    @SerializedName("public")
                    private int publicX;
                    private String created_at;
                    private String updated_at;
                    private boolean isPaid;
                    private int member_level;
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

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
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

                    public String get_serializer() {
                        return _serializer;
                    }

                    public void set_serializer(String _serializer) {
                        this._serializer = _serializer;
                    }
                }
            }

            public static class UserBeanX {

                private int id;
                private String type;
                private String login;
                private String name;
                private String description;
                private String avatar;
                private String avatar_url;
                private int followers_count;
                private int following_count;
                private int status;
                @SerializedName("public")
                private int publicX;
                private String created_at;
                private String updated_at;
                private boolean isPaid;
                private int member_level;
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

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
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

                public String get_serializer() {
                    return _serializer;
                }

                public void set_serializer(String _serializer) {
                    this._serializer = _serializer;
                }
            }
        }
    }
}
