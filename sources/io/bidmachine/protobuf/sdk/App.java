package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class App extends h0 implements AppOrBuilder {
    public static final int APP_NAME_FIELD_NUMBER = 1;
    public static final int APP_VER_FIELD_NUMBER = 2;
    public static final int FIRST_LAUNCH_TIME_FIELD_NUMBER = 5;
    public static final int FMWNAME_FIELD_NUMBER = 8;
    public static final int INSTALL_BEGIN_SERVER_TIMESTAMP_FIELD_NUMBER = 13;
    public static final int INSTALL_REFERRER_CLICK_SERVER_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int INSTALL_REFERRER_CLICK_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int INSTALL_REFERRER_URL_FIELD_NUMBER = 9;
    public static final int INSTALL_TIME_FIELD_NUMBER = 4;
    public static final int INSTALL_VERSION_FIELD_NUMBER = 14;
    public static final int IS_GOOGLE_PLAY_INSTANT_FIELD_NUMBER = 15;
    public static final int RELEASE_FIELD_NUMBER = 3;
    public static final int SDK_INSTALL_TIME_FIELD_NUMBER = 16;
    public static final int STORECAT_FIELD_NUMBER = 6;
    public static final int STORESUBCAT_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private volatile Object appName_;
    private volatile Object appVer_;
    private Timestamp firstLaunchTime_;
    private volatile Object fmwname_;
    private Timestamp installBeginServerTimestamp_;
    private Timestamp installReferrerClickServerTimestamp_;
    private Timestamp installReferrerClickTimestamp_;
    private volatile Object installReferrerUrl_;
    private Timestamp installTime_;
    private volatile Object installVersion_;
    private boolean isGooglePlayInstant_;
    private byte memoizedIsInitialized;
    private Context.App.Release release_;
    private Timestamp sdkInstallTime_;
    private volatile Object storecat_;
    private p0 storesubcat_;
    private static final App DEFAULT_INSTANCE = new App();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.App.1
        @Override // com.explorestack.protobuf.p1
        public App parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new App(lVar, wVar);
        }
    };

    public static final class Builder extends h0.b implements AppOrBuilder {
        private Object appName_;
        private Object appVer_;
        private int bitField0_;
        private a2 firstLaunchTimeBuilder_;
        private Timestamp firstLaunchTime_;
        private Object fmwname_;
        private a2 installBeginServerTimestampBuilder_;
        private Timestamp installBeginServerTimestamp_;
        private a2 installReferrerClickServerTimestampBuilder_;
        private Timestamp installReferrerClickServerTimestamp_;
        private a2 installReferrerClickTimestampBuilder_;
        private Timestamp installReferrerClickTimestamp_;
        private Object installReferrerUrl_;
        private a2 installTimeBuilder_;
        private Timestamp installTime_;
        private Object installVersion_;
        private boolean isGooglePlayInstant_;
        private a2 releaseBuilder_;
        private Context.App.Release release_;
        private a2 sdkInstallTimeBuilder_;
        private Timestamp sdkInstallTime_;
        private Object storecat_;
        private p0 storesubcat_;

        private void ensureStoresubcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.storesubcat_ = new o0(this.storesubcat_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        private a2 getFirstLaunchTimeFieldBuilder() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTimeBuilder_ = new a2(getFirstLaunchTime(), getParentForChildren(), isClean());
                this.firstLaunchTime_ = null;
            }
            return this.firstLaunchTimeBuilder_;
        }

        private a2 getInstallBeginServerTimestampFieldBuilder() {
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestampBuilder_ = new a2(getInstallBeginServerTimestamp(), getParentForChildren(), isClean());
                this.installBeginServerTimestamp_ = null;
            }
            return this.installBeginServerTimestampBuilder_;
        }

        private a2 getInstallReferrerClickServerTimestampFieldBuilder() {
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestampBuilder_ = new a2(getInstallReferrerClickServerTimestamp(), getParentForChildren(), isClean());
                this.installReferrerClickServerTimestamp_ = null;
            }
            return this.installReferrerClickServerTimestampBuilder_;
        }

        private a2 getInstallReferrerClickTimestampFieldBuilder() {
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestampBuilder_ = new a2(getInstallReferrerClickTimestamp(), getParentForChildren(), isClean());
                this.installReferrerClickTimestamp_ = null;
            }
            return this.installReferrerClickTimestampBuilder_;
        }

        private a2 getInstallTimeFieldBuilder() {
            if (this.installTimeBuilder_ == null) {
                this.installTimeBuilder_ = new a2(getInstallTime(), getParentForChildren(), isClean());
                this.installTime_ = null;
            }
            return this.installTimeBuilder_;
        }

        private a2 getReleaseFieldBuilder() {
            if (this.releaseBuilder_ == null) {
                this.releaseBuilder_ = new a2(getRelease(), getParentForChildren(), isClean());
                this.release_ = null;
            }
            return this.releaseBuilder_;
        }

        private a2 getSdkInstallTimeFieldBuilder() {
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTimeBuilder_ = new a2(getSdkInstallTime(), getParentForChildren(), isClean());
                this.sdkInstallTime_ = null;
            }
            return this.sdkInstallTimeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder addAllStoresubcat(Iterable<String> iterable) {
            ensureStoresubcatIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.storesubcat_);
            onChanged();
            return this;
        }

        public Builder addStoresubcat(String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.add(str);
            onChanged();
            return this;
        }

        public Builder addStoresubcatBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureStoresubcatIsMutable();
            this.storesubcat_.c(byteString);
            onChanged();
            return this;
        }

        public Builder clearAppName() {
            this.appName_ = App.getDefaultInstance().getAppName();
            onChanged();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = App.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder clearFirstLaunchTime() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
                onChanged();
                return this;
            }
            this.firstLaunchTime_ = null;
            this.firstLaunchTimeBuilder_ = null;
            return this;
        }

        public Builder clearFmwname() {
            this.fmwname_ = App.getDefaultInstance().getFmwname();
            onChanged();
            return this;
        }

        public Builder clearInstallBeginServerTimestamp() {
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestamp_ = null;
                onChanged();
                return this;
            }
            this.installBeginServerTimestamp_ = null;
            this.installBeginServerTimestampBuilder_ = null;
            return this;
        }

        public Builder clearInstallReferrerClickServerTimestamp() {
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestamp_ = null;
                onChanged();
                return this;
            }
            this.installReferrerClickServerTimestamp_ = null;
            this.installReferrerClickServerTimestampBuilder_ = null;
            return this;
        }

        public Builder clearInstallReferrerClickTimestamp() {
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestamp_ = null;
                onChanged();
                return this;
            }
            this.installReferrerClickTimestamp_ = null;
            this.installReferrerClickTimestampBuilder_ = null;
            return this;
        }

        public Builder clearInstallReferrerUrl() {
            this.installReferrerUrl_ = App.getDefaultInstance().getInstallReferrerUrl();
            onChanged();
            return this;
        }

        public Builder clearInstallTime() {
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
                onChanged();
                return this;
            }
            this.installTime_ = null;
            this.installTimeBuilder_ = null;
            return this;
        }

        public Builder clearInstallVersion() {
            this.installVersion_ = App.getDefaultInstance().getInstallVersion();
            onChanged();
            return this;
        }

        public Builder clearIsGooglePlayInstant() {
            this.isGooglePlayInstant_ = false;
            onChanged();
            return this;
        }

        public Builder clearRelease() {
            if (this.releaseBuilder_ == null) {
                this.release_ = null;
                onChanged();
                return this;
            }
            this.release_ = null;
            this.releaseBuilder_ = null;
            return this;
        }

        public Builder clearSdkInstallTime() {
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTime_ = null;
                onChanged();
                return this;
            }
            this.sdkInstallTime_ = null;
            this.sdkInstallTimeBuilder_ = null;
            return this;
        }

        public Builder clearStorecat() {
            this.storecat_ = App.getDefaultInstance().getStorecat();
            onChanged();
            return this;
        }

        public Builder clearStoresubcat() {
            this.storesubcat_ = o0.f19269e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getFirstLaunchTime() {
            a2 a2Var = this.firstLaunchTimeBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.firstLaunchTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getFirstLaunchTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFirstLaunchTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public j2 getFirstLaunchTimeOrBuilder() {
            a2 a2Var = this.firstLaunchTimeBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.firstLaunchTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getFmwname() {
            Object obj = this.fmwname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fmwname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getFmwnameBytes() {
            Object obj = this.fmwname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fmwname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallBeginServerTimestamp() {
            a2 a2Var = this.installBeginServerTimestampBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.installBeginServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallBeginServerTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallBeginServerTimestampFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public j2 getInstallBeginServerTimestampOrBuilder() {
            a2 a2Var = this.installBeginServerTimestampBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.installBeginServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallReferrerClickServerTimestamp() {
            a2 a2Var = this.installReferrerClickServerTimestampBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.installReferrerClickServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallReferrerClickServerTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallReferrerClickServerTimestampFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public j2 getInstallReferrerClickServerTimestampOrBuilder() {
            a2 a2Var = this.installReferrerClickServerTimestampBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.installReferrerClickServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallReferrerClickTimestamp() {
            a2 a2Var = this.installReferrerClickTimestampBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.installReferrerClickTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallReferrerClickTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallReferrerClickTimestampFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public j2 getInstallReferrerClickTimestampOrBuilder() {
            a2 a2Var = this.installReferrerClickTimestampBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.installReferrerClickTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getInstallReferrerUrl() {
            Object obj = this.installReferrerUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.installReferrerUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getInstallReferrerUrlBytes() {
            Object obj = this.installReferrerUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.installReferrerUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallTime() {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public j2 getInstallTimeOrBuilder() {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getInstallVersion() {
            Object obj = this.installVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.installVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getInstallVersionBytes() {
            Object obj = this.installVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.installVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean getIsGooglePlayInstant() {
            return this.isGooglePlayInstant_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Context.App.Release getRelease() {
            a2 a2Var = this.releaseBuilder_;
            if (a2Var != null) {
                return (Context.App.Release) a2Var.e();
            }
            Context.App.Release release = this.release_;
            return release == null ? Context.App.Release.getDefaultInstance() : release;
        }

        public Context.App.Release.Builder getReleaseBuilder() {
            onChanged();
            return (Context.App.Release.Builder) getReleaseFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
            a2 a2Var = this.releaseBuilder_;
            if (a2Var != null) {
                return (Context.App.ReleaseOrBuilder) a2Var.f();
            }
            Context.App.Release release = this.release_;
            return release == null ? Context.App.Release.getDefaultInstance() : release;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getSdkInstallTime() {
            a2 a2Var = this.sdkInstallTimeBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.sdkInstallTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getSdkInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getSdkInstallTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public j2 getSdkInstallTimeOrBuilder() {
            a2 a2Var = this.sdkInstallTimeBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.sdkInstallTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStorecat() {
            Object obj = this.storecat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storecat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStorecatBytes() {
            Object obj = this.storecat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storecat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStoresubcat(int i10) {
            return (String) this.storesubcat_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStoresubcatBytes(int i10) {
            return this.storesubcat_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public int getStoresubcatCount() {
            return this.storesubcat_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasFirstLaunchTime() {
            return (this.firstLaunchTimeBuilder_ == null && this.firstLaunchTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallBeginServerTimestamp() {
            return (this.installBeginServerTimestampBuilder_ == null && this.installBeginServerTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallReferrerClickServerTimestamp() {
            return (this.installReferrerClickServerTimestampBuilder_ == null && this.installReferrerClickServerTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallReferrerClickTimestamp() {
            return (this.installReferrerClickTimestampBuilder_ == null && this.installReferrerClickTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallTime() {
            return (this.installTimeBuilder_ == null && this.installTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasRelease() {
            return (this.releaseBuilder_ == null && this.release_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasSdkInstallTime() {
            return (this.sdkInstallTimeBuilder_ == null && this.sdkInstallTime_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.d(App.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFirstLaunchTime(Timestamp timestamp) {
            a2 a2Var = this.firstLaunchTimeBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.firstLaunchTime_;
            if (timestamp2 != null) {
                this.firstLaunchTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.firstLaunchTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeInstallBeginServerTimestamp(Timestamp timestamp) {
            a2 a2Var = this.installBeginServerTimestampBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.installBeginServerTimestamp_;
            if (timestamp2 != null) {
                this.installBeginServerTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.installBeginServerTimestamp_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeInstallReferrerClickServerTimestamp(Timestamp timestamp) {
            a2 a2Var = this.installReferrerClickServerTimestampBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.installReferrerClickServerTimestamp_;
            if (timestamp2 != null) {
                this.installReferrerClickServerTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.installReferrerClickServerTimestamp_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeInstallReferrerClickTimestamp(Timestamp timestamp) {
            a2 a2Var = this.installReferrerClickTimestampBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.installReferrerClickTimestamp_;
            if (timestamp2 != null) {
                this.installReferrerClickTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.installReferrerClickTimestamp_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeInstallTime(Timestamp timestamp) {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.installTime_;
            if (timestamp2 != null) {
                this.installTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.installTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeRelease(Context.App.Release release) {
            a2 a2Var = this.releaseBuilder_;
            if (a2Var != null) {
                a2Var.g(release);
                return this;
            }
            Context.App.Release release2 = this.release_;
            if (release2 != null) {
                this.release_ = Context.App.Release.newBuilder(release2).mergeFrom(release).buildPartial();
            } else {
                this.release_ = release;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdkInstallTime(Timestamp timestamp) {
            a2 a2Var = this.sdkInstallTimeBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.sdkInstallTime_;
            if (timestamp2 != null) {
                this.sdkInstallTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.sdkInstallTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder setAppName(String str) {
            str.getClass();
            this.appName_ = str;
            onChanged();
            return this;
        }

        public Builder setAppNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appName_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAppVer(String str) {
            str.getClass();
            this.appVer_ = str;
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appVer_ = byteString;
            onChanged();
            return this;
        }

        public Builder setFirstLaunchTime(Timestamp timestamp) {
            a2 a2Var = this.firstLaunchTimeBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.firstLaunchTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setFmwname(String str) {
            str.getClass();
            this.fmwname_ = str;
            onChanged();
            return this;
        }

        public Builder setFmwnameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.fmwname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInstallBeginServerTimestamp(Timestamp timestamp) {
            a2 a2Var = this.installBeginServerTimestampBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.installBeginServerTimestamp_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setInstallReferrerClickServerTimestamp(Timestamp timestamp) {
            a2 a2Var = this.installReferrerClickServerTimestampBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.installReferrerClickServerTimestamp_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setInstallReferrerClickTimestamp(Timestamp timestamp) {
            a2 a2Var = this.installReferrerClickTimestampBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.installReferrerClickTimestamp_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setInstallReferrerUrl(String str) {
            str.getClass();
            this.installReferrerUrl_ = str;
            onChanged();
            return this;
        }

        public Builder setInstallReferrerUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.installReferrerUrl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInstallTime(Timestamp timestamp) {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.installTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setInstallVersion(String str) {
            str.getClass();
            this.installVersion_ = str;
            onChanged();
            return this;
        }

        public Builder setInstallVersionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.installVersion_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIsGooglePlayInstant(boolean z10) {
            this.isGooglePlayInstant_ = z10;
            onChanged();
            return this;
        }

        public Builder setRelease(Context.App.Release release) {
            a2 a2Var = this.releaseBuilder_;
            if (a2Var != null) {
                a2Var.i(release);
                return this;
            }
            release.getClass();
            this.release_ = release;
            onChanged();
            return this;
        }

        public Builder setSdkInstallTime(Timestamp timestamp) {
            a2 a2Var = this.sdkInstallTimeBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.sdkInstallTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setStorecat(String str) {
            str.getClass();
            this.storecat_ = str;
            onChanged();
            return this;
        }

        public Builder setStorecatBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.storecat_ = byteString;
            onChanged();
            return this;
        }

        public Builder setStoresubcat(int i10, String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.set(i10, str);
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public t1 getStoresubcatList() {
            return this.storesubcat_.getUnmodifiableView();
        }

        private Builder() {
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = o0.f19269e;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            this.installVersion_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public App build() {
            App appBuildPartial = buildPartial();
            if (appBuildPartial.isInitialized()) {
                return appBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) appBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public App buildPartial() {
            App app = new App(this);
            app.appName_ = this.appName_;
            app.appVer_ = this.appVer_;
            a2 a2Var = this.releaseBuilder_;
            if (a2Var == null) {
                app.release_ = this.release_;
            } else {
                app.release_ = (Context.App.Release) a2Var.a();
            }
            a2 a2Var2 = this.installTimeBuilder_;
            if (a2Var2 == null) {
                app.installTime_ = this.installTime_;
            } else {
                app.installTime_ = (Timestamp) a2Var2.a();
            }
            a2 a2Var3 = this.firstLaunchTimeBuilder_;
            if (a2Var3 == null) {
                app.firstLaunchTime_ = this.firstLaunchTime_;
            } else {
                app.firstLaunchTime_ = (Timestamp) a2Var3.a();
            }
            app.storecat_ = this.storecat_;
            if ((this.bitField0_ & 1) != 0) {
                this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            app.storesubcat_ = this.storesubcat_;
            app.fmwname_ = this.fmwname_;
            app.installReferrerUrl_ = this.installReferrerUrl_;
            a2 a2Var4 = this.installReferrerClickTimestampBuilder_;
            if (a2Var4 == null) {
                app.installReferrerClickTimestamp_ = this.installReferrerClickTimestamp_;
            } else {
                app.installReferrerClickTimestamp_ = (Timestamp) a2Var4.a();
            }
            a2 a2Var5 = this.installReferrerClickServerTimestampBuilder_;
            if (a2Var5 == null) {
                app.installReferrerClickServerTimestamp_ = this.installReferrerClickServerTimestamp_;
            } else {
                app.installReferrerClickServerTimestamp_ = (Timestamp) a2Var5.a();
            }
            a2 a2Var6 = this.installBeginServerTimestampBuilder_;
            if (a2Var6 == null) {
                app.installBeginServerTimestamp_ = this.installBeginServerTimestamp_;
            } else {
                app.installBeginServerTimestamp_ = (Timestamp) a2Var6.a();
            }
            app.installVersion_ = this.installVersion_;
            app.isGooglePlayInstant_ = this.isGooglePlayInstant_;
            a2 a2Var7 = this.sdkInstallTimeBuilder_;
            if (a2Var7 == null) {
                app.sdkInstallTime_ = this.sdkInstallTime_;
            } else {
                app.sdkInstallTime_ = (Timestamp) a2Var7.a();
            }
            onBuilt();
            return app;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public App getDefaultInstanceForType() {
            return App.getDefaultInstance();
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

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.appName_ = "";
            this.appVer_ = "";
            if (this.releaseBuilder_ == null) {
                this.release_ = null;
            } else {
                this.release_ = null;
                this.releaseBuilder_ = null;
            }
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
            } else {
                this.firstLaunchTime_ = null;
                this.firstLaunchTimeBuilder_ = null;
            }
            this.storecat_ = "";
            this.storesubcat_ = o0.f19269e;
            this.bitField0_ &= -2;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestamp_ = null;
            } else {
                this.installReferrerClickTimestamp_ = null;
                this.installReferrerClickTimestampBuilder_ = null;
            }
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestamp_ = null;
            } else {
                this.installReferrerClickServerTimestamp_ = null;
                this.installReferrerClickServerTimestampBuilder_ = null;
            }
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestamp_ = null;
            } else {
                this.installBeginServerTimestamp_ = null;
                this.installBeginServerTimestampBuilder_ = null;
            }
            this.installVersion_ = "";
            this.isGooglePlayInstant_ = false;
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTime_ = null;
                return this;
            }
            this.sdkInstallTime_ = null;
            this.sdkInstallTimeBuilder_ = null;
            return this;
        }

        public Builder setFirstLaunchTime(Timestamp.Builder builder) {
            a2 a2Var = this.firstLaunchTimeBuilder_;
            if (a2Var == null) {
                this.firstLaunchTime_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setInstallBeginServerTimestamp(Timestamp.Builder builder) {
            a2 a2Var = this.installBeginServerTimestampBuilder_;
            if (a2Var == null) {
                this.installBeginServerTimestamp_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setInstallReferrerClickServerTimestamp(Timestamp.Builder builder) {
            a2 a2Var = this.installReferrerClickServerTimestampBuilder_;
            if (a2Var == null) {
                this.installReferrerClickServerTimestamp_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setInstallReferrerClickTimestamp(Timestamp.Builder builder) {
            a2 a2Var = this.installReferrerClickTimestampBuilder_;
            if (a2Var == null) {
                this.installReferrerClickTimestamp_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setInstallTime(Timestamp.Builder builder) {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var == null) {
                this.installTime_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setRelease(Context.App.Release.Builder builder) {
            a2 a2Var = this.releaseBuilder_;
            if (a2Var == null) {
                this.release_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setSdkInstallTime(Timestamp.Builder builder) {
            a2 a2Var = this.sdkInstallTimeBuilder_;
            if (a2Var == null) {
                this.sdkInstallTime_ = builder.build();
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
            if (message instanceof App) {
                return mergeFrom((App) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(App app) {
            if (app == App.getDefaultInstance()) {
                return this;
            }
            if (!app.getAppName().isEmpty()) {
                this.appName_ = app.appName_;
                onChanged();
            }
            if (!app.getAppVer().isEmpty()) {
                this.appVer_ = app.appVer_;
                onChanged();
            }
            if (app.hasRelease()) {
                mergeRelease(app.getRelease());
            }
            if (app.hasInstallTime()) {
                mergeInstallTime(app.getInstallTime());
            }
            if (app.hasFirstLaunchTime()) {
                mergeFirstLaunchTime(app.getFirstLaunchTime());
            }
            if (!app.getStorecat().isEmpty()) {
                this.storecat_ = app.storecat_;
                onChanged();
            }
            if (!app.storesubcat_.isEmpty()) {
                if (this.storesubcat_.isEmpty()) {
                    this.storesubcat_ = app.storesubcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureStoresubcatIsMutable();
                    this.storesubcat_.addAll(app.storesubcat_);
                }
                onChanged();
            }
            if (!app.getFmwname().isEmpty()) {
                this.fmwname_ = app.fmwname_;
                onChanged();
            }
            if (!app.getInstallReferrerUrl().isEmpty()) {
                this.installReferrerUrl_ = app.installReferrerUrl_;
                onChanged();
            }
            if (app.hasInstallReferrerClickTimestamp()) {
                mergeInstallReferrerClickTimestamp(app.getInstallReferrerClickTimestamp());
            }
            if (app.hasInstallReferrerClickServerTimestamp()) {
                mergeInstallReferrerClickServerTimestamp(app.getInstallReferrerClickServerTimestamp());
            }
            if (app.hasInstallBeginServerTimestamp()) {
                mergeInstallBeginServerTimestamp(app.getInstallBeginServerTimestamp());
            }
            if (!app.getInstallVersion().isEmpty()) {
                this.installVersion_ = app.installVersion_;
                onChanged();
            }
            if (app.getIsGooglePlayInstant()) {
                setIsGooglePlayInstant(app.getIsGooglePlayInstant());
            }
            if (app.hasSdkInstallTime()) {
                mergeSdkInstallTime(app.getSdkInstallTime());
            }
            mergeUnknownFields(((h0) app).unknownFields);
            onChanged();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = o0.f19269e;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            this.installVersion_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.App.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.App.access$2000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.App r3 = (io.bidmachine.protobuf.sdk.App) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.App r4 = (io.bidmachine.protobuf.sdk.App) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.App.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.App$Builder");
        }
    }

    public static App getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (App) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof App)) {
            return super.equals(obj);
        }
        App app = (App) obj;
        if (!getAppName().equals(app.getAppName()) || !getAppVer().equals(app.getAppVer()) || hasRelease() != app.hasRelease()) {
            return false;
        }
        if ((hasRelease() && !getRelease().equals(app.getRelease())) || hasInstallTime() != app.hasInstallTime()) {
            return false;
        }
        if ((hasInstallTime() && !getInstallTime().equals(app.getInstallTime())) || hasFirstLaunchTime() != app.hasFirstLaunchTime()) {
            return false;
        }
        if ((hasFirstLaunchTime() && !getFirstLaunchTime().equals(app.getFirstLaunchTime())) || !getStorecat().equals(app.getStorecat()) || !getStoresubcatList().equals(app.getStoresubcatList()) || !getFmwname().equals(app.getFmwname()) || !getInstallReferrerUrl().equals(app.getInstallReferrerUrl()) || hasInstallReferrerClickTimestamp() != app.hasInstallReferrerClickTimestamp()) {
            return false;
        }
        if ((hasInstallReferrerClickTimestamp() && !getInstallReferrerClickTimestamp().equals(app.getInstallReferrerClickTimestamp())) || hasInstallReferrerClickServerTimestamp() != app.hasInstallReferrerClickServerTimestamp()) {
            return false;
        }
        if ((hasInstallReferrerClickServerTimestamp() && !getInstallReferrerClickServerTimestamp().equals(app.getInstallReferrerClickServerTimestamp())) || hasInstallBeginServerTimestamp() != app.hasInstallBeginServerTimestamp()) {
            return false;
        }
        if ((!hasInstallBeginServerTimestamp() || getInstallBeginServerTimestamp().equals(app.getInstallBeginServerTimestamp())) && getInstallVersion().equals(app.getInstallVersion()) && getIsGooglePlayInstant() == app.getIsGooglePlayInstant() && hasSdkInstallTime() == app.hasSdkInstallTime()) {
            return (!hasSdkInstallTime() || getSdkInstallTime().equals(app.getSdkInstallTime())) && this.unknownFields.equals(app.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppName() {
        Object obj = this.appName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppNameBytes() {
        Object obj = this.appName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getFirstLaunchTime() {
        Timestamp timestamp = this.firstLaunchTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public j2 getFirstLaunchTimeOrBuilder() {
        return getFirstLaunchTime();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getFmwname() {
        Object obj = this.fmwname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fmwname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getFmwnameBytes() {
        Object obj = this.fmwname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.fmwname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallBeginServerTimestamp() {
        Timestamp timestamp = this.installBeginServerTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public j2 getInstallBeginServerTimestampOrBuilder() {
        return getInstallBeginServerTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallReferrerClickServerTimestamp() {
        Timestamp timestamp = this.installReferrerClickServerTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public j2 getInstallReferrerClickServerTimestampOrBuilder() {
        return getInstallReferrerClickServerTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallReferrerClickTimestamp() {
        Timestamp timestamp = this.installReferrerClickTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public j2 getInstallReferrerClickTimestampOrBuilder() {
        return getInstallReferrerClickTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getInstallReferrerUrl() {
        Object obj = this.installReferrerUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.installReferrerUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getInstallReferrerUrlBytes() {
        Object obj = this.installReferrerUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.installReferrerUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallTime() {
        Timestamp timestamp = this.installTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public j2 getInstallTimeOrBuilder() {
        return getInstallTime();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getInstallVersion() {
        Object obj = this.installVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.installVersion_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getInstallVersionBytes() {
        Object obj = this.installVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.installVersion_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean getIsGooglePlayInstant() {
        return this.isGooglePlayInstant_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Context.App.Release getRelease() {
        Context.App.Release release = this.release_;
        return release == null ? Context.App.Release.getDefaultInstance() : release;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
        return getRelease();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getSdkInstallTime() {
        Timestamp timestamp = this.sdkInstallTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public j2 getSdkInstallTimeOrBuilder() {
        return getSdkInstallTime();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getAppNameBytes().isEmpty() ? h0.computeStringSize(1, this.appName_) : 0;
        if (!getAppVerBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.appVer_);
        }
        if (this.release_ != null) {
            iComputeStringSize += n.G(3, getRelease());
        }
        if (this.installTime_ != null) {
            iComputeStringSize += n.G(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            iComputeStringSize += n.G(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(6, this.storecat_);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.storesubcat_.size(); i11++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.storesubcat_.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + getStoresubcatList().size();
        if (!getFmwnameBytes().isEmpty()) {
            size += h0.computeStringSize(8, this.fmwname_);
        }
        if (!getInstallReferrerUrlBytes().isEmpty()) {
            size += h0.computeStringSize(9, this.installReferrerUrl_);
        }
        if (this.installReferrerClickTimestamp_ != null) {
            size += n.G(10, getInstallReferrerClickTimestamp());
        }
        if (this.installReferrerClickServerTimestamp_ != null) {
            size += n.G(12, getInstallReferrerClickServerTimestamp());
        }
        if (this.installBeginServerTimestamp_ != null) {
            size += n.G(13, getInstallBeginServerTimestamp());
        }
        if (!getInstallVersionBytes().isEmpty()) {
            size += h0.computeStringSize(14, this.installVersion_);
        }
        boolean z10 = this.isGooglePlayInstant_;
        if (z10) {
            size += n.e(15, z10);
        }
        if (this.sdkInstallTime_ != null) {
            size += n.G(16, getSdkInstallTime());
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStorecat() {
        Object obj = this.storecat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storecat_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStorecatBytes() {
        Object obj = this.storecat_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storecat_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStoresubcat(int i10) {
        return (String) this.storesubcat_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStoresubcatBytes(int i10) {
        return this.storesubcat_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public int getStoresubcatCount() {
        return this.storesubcat_.size();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasFirstLaunchTime() {
        return this.firstLaunchTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallBeginServerTimestamp() {
        return this.installBeginServerTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallReferrerClickServerTimestamp() {
        return this.installReferrerClickServerTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallReferrerClickTimestamp() {
        return this.installReferrerClickTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallTime() {
        return this.installTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasRelease() {
        return this.release_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasSdkInstallTime() {
        return this.sdkInstallTime_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAppName().hashCode()) * 37) + 2) * 53) + getAppVer().hashCode();
        if (hasRelease()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getRelease().hashCode();
        }
        if (hasInstallTime()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getInstallTime().hashCode();
        }
        if (hasFirstLaunchTime()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getFirstLaunchTime().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 6) * 53) + getStorecat().hashCode();
        if (getStoresubcatCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getStoresubcatList().hashCode();
        }
        int iHashCode3 = (((((((iHashCode2 * 37) + 8) * 53) + getFmwname().hashCode()) * 37) + 9) * 53) + getInstallReferrerUrl().hashCode();
        if (hasInstallReferrerClickTimestamp()) {
            iHashCode3 = (((iHashCode3 * 37) + 10) * 53) + getInstallReferrerClickTimestamp().hashCode();
        }
        if (hasInstallReferrerClickServerTimestamp()) {
            iHashCode3 = (((iHashCode3 * 37) + 12) * 53) + getInstallReferrerClickServerTimestamp().hashCode();
        }
        if (hasInstallBeginServerTimestamp()) {
            iHashCode3 = (((iHashCode3 * 37) + 13) * 53) + getInstallBeginServerTimestamp().hashCode();
        }
        int iHashCode4 = (((((((iHashCode3 * 37) + 14) * 53) + getInstallVersion().hashCode()) * 37) + 15) * 53) + j0.d(getIsGooglePlayInstant());
        if (hasSdkInstallTime()) {
            iHashCode4 = (((iHashCode4 * 37) + 16) * 53) + getSdkInstallTime().hashCode();
        }
        int iHashCode5 = (iHashCode4 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.d(App.class, Builder.class);
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
        return new App();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getAppNameBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.appName_);
        }
        if (!getAppVerBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.appVer_);
        }
        if (this.release_ != null) {
            nVar.J0(3, getRelease());
        }
        if (this.installTime_ != null) {
            nVar.J0(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            nVar.J0(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            h0.writeString(nVar, 6, this.storecat_);
        }
        for (int i10 = 0; i10 < this.storesubcat_.size(); i10++) {
            h0.writeString(nVar, 7, this.storesubcat_.getRaw(i10));
        }
        if (!getFmwnameBytes().isEmpty()) {
            h0.writeString(nVar, 8, this.fmwname_);
        }
        if (!getInstallReferrerUrlBytes().isEmpty()) {
            h0.writeString(nVar, 9, this.installReferrerUrl_);
        }
        if (this.installReferrerClickTimestamp_ != null) {
            nVar.J0(10, getInstallReferrerClickTimestamp());
        }
        if (this.installReferrerClickServerTimestamp_ != null) {
            nVar.J0(12, getInstallReferrerClickServerTimestamp());
        }
        if (this.installBeginServerTimestamp_ != null) {
            nVar.J0(13, getInstallBeginServerTimestamp());
        }
        if (!getInstallVersionBytes().isEmpty()) {
            h0.writeString(nVar, 14, this.installVersion_);
        }
        boolean z10 = this.isGooglePlayInstant_;
        if (z10) {
            nVar.n0(15, z10);
        }
        if (this.sdkInstallTime_ != null) {
            nVar.J0(16, getSdkInstallTime());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static Builder newBuilder(App app) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
    }

    public static App parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteBuffer, wVar);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public t1 getStoresubcatList() {
        return this.storesubcat_;
    }

    private App(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static App parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (App) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public App getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static App parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private App() {
        this.memoizedIsInitialized = (byte) -1;
        this.appName_ = "";
        this.appVer_ = "";
        this.storecat_ = "";
        this.storesubcat_ = o0.f19269e;
        this.fmwname_ = "";
        this.installReferrerUrl_ = "";
        this.installVersion_ = "";
    }

    public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static App parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(bArr, wVar);
    }

    public static App parseFrom(InputStream inputStream) throws IOException {
        return (App) h0.parseWithIOException(PARSER, inputStream);
    }

    public static App parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (App) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static App parseFrom(l lVar) throws IOException {
        return (App) h0.parseWithIOException(PARSER, lVar);
    }

    public static App parseFrom(l lVar, w wVar) throws IOException {
        return (App) h0.parseWithIOException(PARSER, lVar, wVar);
    }

    private App(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 10:
                            this.appName_ = lVar.J();
                            break;
                        case 18:
                            this.appVer_ = lVar.J();
                            break;
                        case 26:
                            Context.App.Release release = this.release_;
                            Context.App.Release.Builder builder = release != null ? release.toBuilder() : null;
                            Context.App.Release release2 = (Context.App.Release) lVar.A(Context.App.Release.parser(), wVar);
                            this.release_ = release2;
                            if (builder != null) {
                                builder.mergeFrom(release2);
                                this.release_ = builder.buildPartial();
                            }
                            break;
                        case 34:
                            Timestamp timestamp = this.installTime_;
                            Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.installTime_ = timestamp2;
                            if (builder2 != null) {
                                builder2.mergeFrom(timestamp2);
                                this.installTime_ = builder2.buildPartial();
                            }
                            break;
                        case 42:
                            Timestamp timestamp3 = this.firstLaunchTime_;
                            Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                            Timestamp timestamp4 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.firstLaunchTime_ = timestamp4;
                            if (builder3 != null) {
                                builder3.mergeFrom(timestamp4);
                                this.firstLaunchTime_ = builder3.buildPartial();
                            }
                            break;
                        case 50:
                            this.storecat_ = lVar.J();
                            break;
                        case 58:
                            String strJ = lVar.J();
                            z11 = z11;
                            if (!z11) {
                                this.storesubcat_ = new o0();
                                z11 = true;
                            }
                            this.storesubcat_.add(strJ);
                            break;
                        case 66:
                            this.fmwname_ = lVar.J();
                            break;
                        case 74:
                            this.installReferrerUrl_ = lVar.J();
                            break;
                        case 82:
                            Timestamp timestamp5 = this.installReferrerClickTimestamp_;
                            Timestamp.Builder builder4 = timestamp5 != null ? timestamp5.toBuilder() : null;
                            Timestamp timestamp6 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.installReferrerClickTimestamp_ = timestamp6;
                            if (builder4 != null) {
                                builder4.mergeFrom(timestamp6);
                                this.installReferrerClickTimestamp_ = builder4.buildPartial();
                            }
                            break;
                        case 98:
                            Timestamp timestamp7 = this.installReferrerClickServerTimestamp_;
                            Timestamp.Builder builder5 = timestamp7 != null ? timestamp7.toBuilder() : null;
                            Timestamp timestamp8 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.installReferrerClickServerTimestamp_ = timestamp8;
                            if (builder5 != null) {
                                builder5.mergeFrom(timestamp8);
                                this.installReferrerClickServerTimestamp_ = builder5.buildPartial();
                            }
                            break;
                        case 106:
                            Timestamp timestamp9 = this.installBeginServerTimestamp_;
                            Timestamp.Builder builder6 = timestamp9 != null ? timestamp9.toBuilder() : null;
                            Timestamp timestamp10 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.installBeginServerTimestamp_ = timestamp10;
                            if (builder6 != null) {
                                builder6.mergeFrom(timestamp10);
                                this.installBeginServerTimestamp_ = builder6.buildPartial();
                            }
                            break;
                        case 114:
                            this.installVersion_ = lVar.J();
                            break;
                        case 120:
                            this.isGooglePlayInstant_ = lVar.q();
                            break;
                        case 130:
                            Timestamp timestamp11 = this.sdkInstallTime_;
                            Timestamp.Builder builder7 = timestamp11 != null ? timestamp11.toBuilder() : null;
                            Timestamp timestamp12 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.sdkInstallTime_ = timestamp12;
                            if (builder7 != null) {
                                builder7.mergeFrom(timestamp12);
                                this.sdkInstallTime_ = builder7.buildPartial();
                            }
                            break;
                        default:
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
