package com.kmmoonlight.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookRepo {


    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Parcelable {
        private int id;
        private String slug;
        private String name;
        private int user_id;
        private String description;
        private String doc_typography;
        private UserBean user;
        private String creator;
        private String _serializer;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getDoc_typography() {
            return doc_typography;
        }

        public void setDoc_typography(String doc_typography) {
            this.doc_typography = doc_typography;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String get_serializer() {
            return _serializer;
        }

        public void set_serializer(String _serializer) {
            this._serializer = _serializer;
        }

        public static class UserBean implements Parcelable {

            private int id;
            private String type;
            private String login;
            private String name;
            private String description;
            private String avatar_url;
            @SerializedName("public")
            private int publicX;
            private String scene;
            private String created_at;
            private String updated_at;
            private int organization_id;
            private boolean isPaid;
            private int member_level;
            private String organization;
            private String owners;
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

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public int getPublicX() {
                return publicX;
            }

            public void setPublicX(int publicX) {
                this.publicX = publicX;
            }

            public String getScene() {
                return scene;
            }

            public void setScene(String scene) {
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

            public int getOrganization_id() {
                return organization_id;
            }

            public void setOrganization_id(int organization_id) {
                this.organization_id = organization_id;
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

            public String getOrganization() {
                return organization;
            }

            public void setOrganization(String organization) {
                this.organization = organization;
            }

            public String getOwners() {
                return owners;
            }

            public void setOwners(String owners) {
                this.owners = owners;
            }

            public String get_serializer() {
                return _serializer;
            }

            public void set_serializer(String _serializer) {
                this._serializer = _serializer;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.id);
                dest.writeString(this.type);
                dest.writeString(this.login);
                dest.writeString(this.name);
                dest.writeString(this.description);
                dest.writeString(this.avatar_url);
                dest.writeInt(this.publicX);
                dest.writeString(this.scene);
                dest.writeString(this.created_at);
                dest.writeString(this.updated_at);
                dest.writeInt(this.organization_id);
                dest.writeByte(this.isPaid ? (byte) 1 : (byte) 0);
                dest.writeInt(this.member_level);
                dest.writeString(this.organization);
                dest.writeString(this.owners);
                dest.writeString(this._serializer);
            }

            public UserBean() {
            }

            protected UserBean(Parcel in) {
                this.id = in.readInt();
                this.type = in.readString();
                this.login = in.readString();
                this.name = in.readString();
                this.description = in.readString();
                this.avatar_url = in.readString();
                this.publicX = in.readInt();
                this.scene = in.readString();
                this.created_at = in.readString();
                this.updated_at = in.readString();
                this.organization_id = in.readInt();
                this.isPaid = in.readByte() != 0;
                this.member_level = in.readInt();
                this.organization = in.readString();
                this.owners = in.readString();
                this._serializer = in.readString();
            }

            public static final Creator<UserBean> CREATOR = new Creator<UserBean>() {
                @Override
                public UserBean createFromParcel(Parcel source) {
                    return new UserBean(source);
                }

                @Override
                public UserBean[] newArray(int size) {
                    return new UserBean[size];
                }
            };
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.id);
            dest.writeString(this.slug);
            dest.writeString(this.name);
            dest.writeInt(this.user_id);
            dest.writeString(this.description);
            dest.writeString(this.doc_typography);
            dest.writeParcelable(this.user, flags);
            dest.writeString(this.creator);
            dest.writeString(this._serializer);
        }

        public DataBean() {
        }

        protected DataBean(Parcel in) {
            this.id = in.readInt();
            this.slug = in.readString();
            this.name = in.readString();
            this.user_id = in.readInt();
            this.description = in.readString();
            this.doc_typography = in.readString();
            this.user = in.readParcelable(UserBean.class.getClassLoader());
            this.creator = in.readString();
            this._serializer = in.readString();
        }

        public static final Parcelable.Creator<DataBean> CREATOR = new Parcelable.Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
    }
}
