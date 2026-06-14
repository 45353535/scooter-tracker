package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.protobuf.sdk.User;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Context extends h0 implements ContextOrBuilder {
    public static final int APP_FIELD_NUMBER = 2;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int SDK_FIELD_NUMBER = 1;
    public static final int SESSION_FIELD_NUMBER = 5;
    public static final int USER_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private App app_;
    private Device device_;
    private byte memoizedIsInitialized;
    private SDK sdk_;
    private Session session_;
    private User user_;
    private static final Context DEFAULT_INSTANCE = new Context();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Context.1
        @Override // com.explorestack.protobuf.p1
        public Context parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Context(lVar, wVar);
        }
    };

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Context)) {
            return super.equals(obj);
        }
        Context context = (Context) obj;
        if (hasSdk() != context.hasSdk()) {
            return false;
        }
        if ((hasSdk() && !getSdk().equals(context.getSdk())) || hasApp() != context.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(context.getApp())) || hasUser() != context.hasUser()) {
            return false;
        }
        if ((hasUser() && !getUser().equals(context.getUser())) || hasDevice() != context.hasDevice()) {
            return false;
        }
        if ((!hasDevice() || getDevice().equals(context.getDevice())) && hasSession() == context.hasSession()) {
            return (!hasSession() || getSession().equals(context.getSession())) && this.unknownFields.equals(context.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public AppOrBuilder getAppOrBuilder() {
        return getApp();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public DeviceOrBuilder getDeviceOrBuilder() {
        return getDevice();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SDK getSdk() {
        SDK sdk = this.sdk_;
        return sdk == null ? SDK.getDefaultInstance() : sdk;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SDKOrBuilder getSdkOrBuilder() {
        return getSdk();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.sdk_ != null ? n.G(1, getSdk()) : 0;
        if (this.app_ != null) {
            iG += n.G(2, getApp());
        }
        if (this.user_ != null) {
            iG += n.G(3, getUser());
        }
        if (this.device_ != null) {
            iG += n.G(4, getDevice());
        }
        if (this.session_ != null) {
            iG += n.G(5, getSession());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public Session getSession() {
        Session session = this.session_;
        return session == null ? Session.getDefaultInstance() : session;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SessionOrBuilder getSessionOrBuilder() {
        return getSession();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public UserOrBuilder getUserOrBuilder() {
        return getUser();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasApp() {
        return this.app_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasDevice() {
        return this.device_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasSdk() {
        return this.sdk_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasSession() {
        return this.session_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasUser() {
        return this.user_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasSdk()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getSdk().hashCode();
        }
        if (hasApp()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getApp().hashCode();
        }
        if (hasUser()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getUser().hashCode();
        }
        if (hasDevice()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getDevice().hashCode();
        }
        if (hasSession()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getSession().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable.d(Context.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Context();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.sdk_ != null) {
            nVar.J0(1, getSdk());
        }
        if (this.app_ != null) {
            nVar.J0(2, getApp());
        }
        if (this.user_ != null) {
            nVar.J0(3, getUser());
        }
        if (this.device_ != null) {
            nVar.J0(4, getDevice());
        }
        if (this.session_ != null) {
            nVar.J0(5, getSession());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements ContextOrBuilder {
        private a2 appBuilder_;
        private App app_;
        private a2 deviceBuilder_;
        private Device device_;
        private a2 sdkBuilder_;
        private SDK sdk_;
        private a2 sessionBuilder_;
        private Session session_;
        private a2 userBuilder_;
        private User user_;

        private a2 getAppFieldBuilder() {
            if (this.appBuilder_ == null) {
                this.appBuilder_ = new a2(getApp(), getParentForChildren(), isClean());
                this.app_ = null;
            }
            return this.appBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
        }

        private a2 getDeviceFieldBuilder() {
            if (this.deviceBuilder_ == null) {
                this.deviceBuilder_ = new a2(getDevice(), getParentForChildren(), isClean());
                this.device_ = null;
            }
            return this.deviceBuilder_;
        }

        private a2 getSdkFieldBuilder() {
            if (this.sdkBuilder_ == null) {
                this.sdkBuilder_ = new a2(getSdk(), getParentForChildren(), isClean());
                this.sdk_ = null;
            }
            return this.sdkBuilder_;
        }

        private a2 getSessionFieldBuilder() {
            if (this.sessionBuilder_ == null) {
                this.sessionBuilder_ = new a2(getSession(), getParentForChildren(), isClean());
                this.session_ = null;
            }
            return this.sessionBuilder_;
        }

        private a2 getUserFieldBuilder() {
            if (this.userBuilder_ == null) {
                this.userBuilder_ = new a2(getUser(), getParentForChildren(), isClean());
                this.user_ = null;
            }
            return this.userBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearApp() {
            if (this.appBuilder_ == null) {
                this.app_ = null;
                onChanged();
                return this;
            }
            this.app_ = null;
            this.appBuilder_ = null;
            return this;
        }

        public Builder clearDevice() {
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
                onChanged();
                return this;
            }
            this.device_ = null;
            this.deviceBuilder_ = null;
            return this;
        }

        public Builder clearSdk() {
            if (this.sdkBuilder_ == null) {
                this.sdk_ = null;
                onChanged();
                return this;
            }
            this.sdk_ = null;
            this.sdkBuilder_ = null;
            return this;
        }

        public Builder clearSession() {
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
                onChanged();
                return this;
            }
            this.session_ = null;
            this.sessionBuilder_ = null;
            return this;
        }

        public Builder clearUser() {
            if (this.userBuilder_ == null) {
                this.user_ = null;
                onChanged();
                return this;
            }
            this.user_ = null;
            this.userBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public App getApp() {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                return (App) a2Var.e();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        public App.Builder getAppBuilder() {
            onChanged();
            return (App.Builder) getAppFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public AppOrBuilder getAppOrBuilder() {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                return (AppOrBuilder) a2Var.f();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public Device getDevice() {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                return (Device) a2Var.e();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        public Device.Builder getDeviceBuilder() {
            onChanged();
            return (Device.Builder) getDeviceFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public DeviceOrBuilder getDeviceOrBuilder() {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                return (DeviceOrBuilder) a2Var.f();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SDK getSdk() {
            a2 a2Var = this.sdkBuilder_;
            if (a2Var != null) {
                return (SDK) a2Var.e();
            }
            SDK sdk = this.sdk_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        public SDK.Builder getSdkBuilder() {
            onChanged();
            return (SDK.Builder) getSdkFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SDKOrBuilder getSdkOrBuilder() {
            a2 a2Var = this.sdkBuilder_;
            if (a2Var != null) {
                return (SDKOrBuilder) a2Var.f();
            }
            SDK sdk = this.sdk_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public Session getSession() {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                return (Session) a2Var.e();
            }
            Session session = this.session_;
            return session == null ? Session.getDefaultInstance() : session;
        }

        public Session.Builder getSessionBuilder() {
            onChanged();
            return (Session.Builder) getSessionFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SessionOrBuilder getSessionOrBuilder() {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                return (SessionOrBuilder) a2Var.f();
            }
            Session session = this.session_;
            return session == null ? Session.getDefaultInstance() : session;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public User getUser() {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                return (User) a2Var.e();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public User.Builder getUserBuilder() {
            onChanged();
            return (User.Builder) getUserFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public UserOrBuilder getUserOrBuilder() {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                return (UserOrBuilder) a2Var.f();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasApp() {
            return (this.appBuilder_ == null && this.app_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasDevice() {
            return (this.deviceBuilder_ == null && this.device_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasSdk() {
            return (this.sdkBuilder_ == null && this.sdk_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasSession() {
            return (this.sessionBuilder_ == null && this.session_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasUser() {
            return (this.userBuilder_ == null && this.user_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable.d(Context.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeApp(App app) {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                a2Var.g(app);
                return this;
            }
            App app2 = this.app_;
            if (app2 != null) {
                this.app_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
            } else {
                this.app_ = app;
            }
            onChanged();
            return this;
        }

        public Builder mergeDevice(Device device) {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                a2Var.g(device);
                return this;
            }
            Device device2 = this.device_;
            if (device2 != null) {
                this.device_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
            } else {
                this.device_ = device;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdk(SDK sdk) {
            a2 a2Var = this.sdkBuilder_;
            if (a2Var != null) {
                a2Var.g(sdk);
                return this;
            }
            SDK sdk2 = this.sdk_;
            if (sdk2 != null) {
                this.sdk_ = SDK.newBuilder(sdk2).mergeFrom(sdk).buildPartial();
            } else {
                this.sdk_ = sdk;
            }
            onChanged();
            return this;
        }

        public Builder mergeSession(Session session) {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                a2Var.g(session);
                return this;
            }
            Session session2 = this.session_;
            if (session2 != null) {
                this.session_ = Session.newBuilder(session2).mergeFrom(session).buildPartial();
            } else {
                this.session_ = session;
            }
            onChanged();
            return this;
        }

        public Builder mergeUser(User user) {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                a2Var.g(user);
                return this;
            }
            User user2 = this.user_;
            if (user2 != null) {
                this.user_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
            } else {
                this.user_ = user;
            }
            onChanged();
            return this;
        }

        public Builder setApp(App app) {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                a2Var.i(app);
                return this;
            }
            app.getClass();
            this.app_ = app;
            onChanged();
            return this;
        }

        public Builder setDevice(Device device) {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                a2Var.i(device);
                return this;
            }
            device.getClass();
            this.device_ = device;
            onChanged();
            return this;
        }

        public Builder setSdk(SDK sdk) {
            a2 a2Var = this.sdkBuilder_;
            if (a2Var != null) {
                a2Var.i(sdk);
                return this;
            }
            sdk.getClass();
            this.sdk_ = sdk;
            onChanged();
            return this;
        }

        public Builder setSession(Session session) {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                a2Var.i(session);
                return this;
            }
            session.getClass();
            this.session_ = session;
            onChanged();
            return this;
        }

        public Builder setUser(User user) {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                a2Var.i(user);
                return this;
            }
            user.getClass();
            this.user_ = user;
            onChanged();
            return this;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Context build() {
            Context contextBuildPartial = buildPartial();
            if (contextBuildPartial.isInitialized()) {
                return contextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Context buildPartial() {
            Context context = new Context(this);
            a2 a2Var = this.sdkBuilder_;
            if (a2Var == null) {
                context.sdk_ = this.sdk_;
            } else {
                context.sdk_ = (SDK) a2Var.a();
            }
            a2 a2Var2 = this.appBuilder_;
            if (a2Var2 == null) {
                context.app_ = this.app_;
            } else {
                context.app_ = (App) a2Var2.a();
            }
            a2 a2Var3 = this.userBuilder_;
            if (a2Var3 == null) {
                context.user_ = this.user_;
            } else {
                context.user_ = (User) a2Var3.a();
            }
            a2 a2Var4 = this.deviceBuilder_;
            if (a2Var4 == null) {
                context.device_ = this.device_;
            } else {
                context.device_ = (Device) a2Var4.a();
            }
            a2 a2Var5 = this.sessionBuilder_;
            if (a2Var5 == null) {
                context.session_ = this.session_;
            } else {
                context.session_ = (Session) a2Var5.a();
            }
            onBuilt();
            return context;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Context getDefaultInstanceForType() {
            return Context.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(r2 r2Var) {
            return (Builder) super.setUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(r2 r2Var) {
            return (Builder) super.mergeUnknownFields(r2Var);
        }

        private Builder(h0.c cVar) {
            super(cVar);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.sdkBuilder_ == null) {
                this.sdk_ = null;
            } else {
                this.sdk_ = null;
                this.sdkBuilder_ = null;
            }
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
                return this;
            }
            this.session_ = null;
            this.sessionBuilder_ = null;
            return this;
        }

        public Builder setApp(App.Builder builder) {
            a2 a2Var = this.appBuilder_;
            if (a2Var == null) {
                this.app_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setDevice(Device.Builder builder) {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var == null) {
                this.device_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setSdk(SDK.Builder builder) {
            a2 a2Var = this.sdkBuilder_;
            if (a2Var == null) {
                this.sdk_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setSession(Session.Builder builder) {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var == null) {
                this.session_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setUser(User.Builder builder) {
            a2 a2Var = this.userBuilder_;
            if (a2Var == null) {
                this.user_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Context) {
                return mergeFrom((Context) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Context context) {
            if (context == Context.getDefaultInstance()) {
                return this;
            }
            if (context.hasSdk()) {
                mergeSdk(context.getSdk());
            }
            if (context.hasApp()) {
                mergeApp(context.getApp());
            }
            if (context.hasUser()) {
                mergeUser(context.getUser());
            }
            if (context.hasDevice()) {
                mergeDevice(context.getDevice());
            }
            if (context.hasSession()) {
                mergeSession(context.getSession());
            }
            mergeUnknownFields(((h0) context).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.Context.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Context.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Context r3 = (io.bidmachine.protobuf.sdk.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.sdk.Context r4 = (io.bidmachine.protobuf.sdk.Context) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Context.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Context$Builder");
        }
    }

    public static Builder newBuilder(Context context) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Context(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Context parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Context) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Context getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Context parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Context() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Context parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr, wVar);
    }

    private Context(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            SDK sdk = this.sdk_;
                            SDK.Builder builder = sdk != null ? sdk.toBuilder() : null;
                            SDK sdk2 = (SDK) lVar.A(SDK.parser(), wVar);
                            this.sdk_ = sdk2;
                            if (builder != null) {
                                builder.mergeFrom(sdk2);
                                this.sdk_ = builder.buildPartial();
                            }
                        } else if (iK == 18) {
                            App app = this.app_;
                            App.Builder builder2 = app != null ? app.toBuilder() : null;
                            App app2 = (App) lVar.A(App.parser(), wVar);
                            this.app_ = app2;
                            if (builder2 != null) {
                                builder2.mergeFrom(app2);
                                this.app_ = builder2.buildPartial();
                            }
                        } else if (iK == 26) {
                            User user = this.user_;
                            User.Builder builder3 = user != null ? user.toBuilder() : null;
                            User user2 = (User) lVar.A(User.parser(), wVar);
                            this.user_ = user2;
                            if (builder3 != null) {
                                builder3.mergeFrom(user2);
                                this.user_ = builder3.buildPartial();
                            }
                        } else if (iK == 34) {
                            Device device = this.device_;
                            Device.Builder builder4 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) lVar.A(Device.parser(), wVar);
                            this.device_ = device2;
                            if (builder4 != null) {
                                builder4.mergeFrom(device2);
                                this.device_ = builder4.buildPartial();
                            }
                        } else if (iK != 42) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Session session = this.session_;
                            Session.Builder builder5 = session != null ? session.toBuilder() : null;
                            Session session2 = (Session) lVar.A(Session.parser(), wVar);
                            this.session_ = session2;
                            if (builder5 != null) {
                                builder5.mergeFrom(session2);
                                this.session_ = builder5.buildPartial();
                            }
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Context parseFrom(l lVar) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, lVar);
    }

    public static Context parseFrom(l lVar, w wVar) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
