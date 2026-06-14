package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class User extends h0 implements UserOrBuilder {
    public static final int CCPA_FIELD_NUMBER = 3;
    public static final int CONSENT_FIELD_NUMBER = 1;
    public static final int COPPA_FIELD_NUMBER = 6;
    public static final int GDPR_FIELD_NUMBER = 2;
    public static final int GPP_FIELD_NUMBER = 4;
    public static final int GPP_SID_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private volatile Object ccpa_;
    private volatile Object consent_;
    private boolean coppa_;
    private boolean gdpr_;
    private int gppSidMemoizedSerializedSize;
    private j0.g gppSid_;
    private volatile Object gpp_;
    private byte memoizedIsInitialized;
    private static final User DEFAULT_INSTANCE = new User();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.User.1
        @Override // com.explorestack.protobuf.p1
        public User parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new User(lVar, wVar);
        }
    };

    public static User getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (User) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (User) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof User)) {
            return super.equals(obj);
        }
        User user = (User) obj;
        return getConsent().equals(user.getConsent()) && getGdpr() == user.getGdpr() && getCcpa().equals(user.getCcpa()) && getGpp().equals(user.getGpp()) && getGppSidList().equals(user.getGppSidList()) && getCoppa() == user.getCoppa() && this.unknownFields.equals(user.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public String getCcpa() {
        Object obj = this.ccpa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ccpa_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public ByteString getCcpaBytes() {
        Object obj = this.ccpa_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ccpa_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public String getConsent() {
        Object obj = this.consent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.consent_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public ByteString getConsentBytes() {
        Object obj = this.consent_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.consent_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public boolean getCoppa() {
        return this.coppa_;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public boolean getGdpr() {
        return this.gdpr_;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public String getGpp() {
        Object obj = this.gpp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public ByteString getGppBytes() {
        Object obj = this.gpp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpp_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public int getGppSid(int i10) {
        return this.gppSid_.getInt(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public int getGppSidCount() {
        return this.gppSid_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public List<Integer> getGppSidList() {
        return this.gppSid_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getConsentBytes().isEmpty() ? h0.computeStringSize(1, this.consent_) : 0;
        boolean z10 = this.gdpr_;
        if (z10) {
            iComputeStringSize += n.e(2, z10);
        }
        if (!getCcpaBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(3, this.ccpa_);
        }
        if (!getGppBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.gpp_);
        }
        int iZ = 0;
        for (int i11 = 0; i11 < this.gppSid_.size(); i11++) {
            iZ += n.Z(this.gppSid_.getInt(i11));
        }
        int iE = iComputeStringSize + iZ;
        if (!getGppSidList().isEmpty()) {
            iE = iE + 1 + n.y(iZ);
        }
        this.gppSidMemoizedSerializedSize = iZ;
        boolean z11 = this.coppa_;
        if (z11) {
            iE += n.e(6, z11);
        }
        int serializedSize = iE + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getConsent().hashCode()) * 37) + 2) * 53) + j0.d(getGdpr())) * 37) + 3) * 53) + getCcpa().hashCode()) * 37) + 4) * 53) + getGpp().hashCode();
        if (getGppSidCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getGppSidList().hashCode();
        }
        int iD = (((((iHashCode * 37) + 6) * 53) + j0.d(getCoppa())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iD;
        return iD;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_fieldAccessorTable.d(User.class, Builder.class);
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
        return new User();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        getSerializedSize();
        if (!getConsentBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.consent_);
        }
        boolean z10 = this.gdpr_;
        if (z10) {
            nVar.n0(2, z10);
        }
        if (!getCcpaBytes().isEmpty()) {
            h0.writeString(nVar, 3, this.ccpa_);
        }
        if (!getGppBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.gpp_);
        }
        if (getGppSidList().size() > 0) {
            nVar.X0(42);
            nVar.X0(this.gppSidMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.gppSid_.size(); i10++) {
            nVar.X0(this.gppSid_.getInt(i10));
        }
        boolean z11 = this.coppa_;
        if (z11) {
            nVar.n0(6, z11);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements UserOrBuilder {
        private int bitField0_;
        private Object ccpa_;
        private Object consent_;
        private boolean coppa_;
        private boolean gdpr_;
        private j0.g gppSid_;
        private Object gpp_;

        private void ensureGppSidIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.gppSid_ = h0.mutableCopy(this.gppSid_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder addAllGppSid(Iterable<? extends Integer> iterable) {
            ensureGppSidIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.gppSid_);
            onChanged();
            return this;
        }

        public Builder addGppSid(int i10) {
            ensureGppSidIsMutable();
            this.gppSid_.addInt(i10);
            onChanged();
            return this;
        }

        public Builder clearCcpa() {
            this.ccpa_ = User.getDefaultInstance().getCcpa();
            onChanged();
            return this;
        }

        public Builder clearConsent() {
            this.consent_ = User.getDefaultInstance().getConsent();
            onChanged();
            return this;
        }

        public Builder clearCoppa() {
            this.coppa_ = false;
            onChanged();
            return this;
        }

        public Builder clearGdpr() {
            this.gdpr_ = false;
            onChanged();
            return this;
        }

        public Builder clearGpp() {
            this.gpp_ = User.getDefaultInstance().getGpp();
            onChanged();
            return this;
        }

        public Builder clearGppSid() {
            this.gppSid_ = h0.emptyIntList();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public String getCcpa() {
            Object obj = this.ccpa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ccpa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public ByteString getCcpaBytes() {
            Object obj = this.ccpa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ccpa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public String getConsent() {
            Object obj = this.consent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.consent_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public ByteString getConsentBytes() {
            Object obj = this.consent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consent_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public boolean getCoppa() {
            return this.coppa_;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public boolean getGdpr() {
            return this.gdpr_;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public String getGpp() {
            Object obj = this.gpp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public ByteString getGppBytes() {
            Object obj = this.gpp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public int getGppSid(int i10) {
            return this.gppSid_.getInt(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public int getGppSidCount() {
            return this.gppSid_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public List<Integer> getGppSidList() {
            return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.gppSid_) : this.gppSid_;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_fieldAccessorTable.d(User.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setCcpa(String str) {
            str.getClass();
            this.ccpa_ = str;
            onChanged();
            return this;
        }

        public Builder setCcpaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ccpa_ = byteString;
            onChanged();
            return this;
        }

        public Builder setConsent(String str) {
            str.getClass();
            this.consent_ = str;
            onChanged();
            return this;
        }

        public Builder setConsentBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.consent_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCoppa(boolean z10) {
            this.coppa_ = z10;
            onChanged();
            return this;
        }

        public Builder setGdpr(boolean z10) {
            this.gdpr_ = z10;
            onChanged();
            return this;
        }

        public Builder setGpp(String str) {
            str.getClass();
            this.gpp_ = str;
            onChanged();
            return this;
        }

        public Builder setGppBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gpp_ = byteString;
            onChanged();
            return this;
        }

        public Builder setGppSid(int i10, int i11) {
            ensureGppSidIsMutable();
            this.gppSid_.setInt(i10, i11);
            onChanged();
            return this;
        }

        private Builder() {
            this.consent_ = "";
            this.ccpa_ = "";
            this.gpp_ = "";
            this.gppSid_ = h0.emptyIntList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public User build() {
            User userBuildPartial = buildPartial();
            if (userBuildPartial.isInitialized()) {
                return userBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) userBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public User buildPartial() {
            User user = new User(this);
            user.consent_ = this.consent_;
            user.gdpr_ = this.gdpr_;
            user.ccpa_ = this.ccpa_;
            user.gpp_ = this.gpp_;
            if ((this.bitField0_ & 1) != 0) {
                this.gppSid_.makeImmutable();
                this.bitField0_ &= -2;
            }
            user.gppSid_ = this.gppSid_;
            user.coppa_ = this.coppa_;
            onBuilt();
            return user;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public User getDefaultInstanceForType() {
            return User.getDefaultInstance();
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
            this.consent_ = "";
            this.gdpr_ = false;
            this.ccpa_ = "";
            this.gpp_ = "";
            this.gppSid_ = h0.emptyIntList();
            this.bitField0_ &= -2;
            this.coppa_ = false;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof User) {
                return mergeFrom((User) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.consent_ = "";
            this.ccpa_ = "";
            this.gpp_ = "";
            this.gppSid_ = h0.emptyIntList();
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(User user) {
            if (user == User.getDefaultInstance()) {
                return this;
            }
            if (!user.getConsent().isEmpty()) {
                this.consent_ = user.consent_;
                onChanged();
            }
            if (user.getGdpr()) {
                setGdpr(user.getGdpr());
            }
            if (!user.getCcpa().isEmpty()) {
                this.ccpa_ = user.ccpa_;
                onChanged();
            }
            if (!user.getGpp().isEmpty()) {
                this.gpp_ = user.gpp_;
                onChanged();
            }
            if (!user.gppSid_.isEmpty()) {
                if (this.gppSid_.isEmpty()) {
                    this.gppSid_ = user.gppSid_;
                    this.bitField0_ &= -2;
                } else {
                    ensureGppSidIsMutable();
                    this.gppSid_.addAll(user.gppSid_);
                }
                onChanged();
            }
            if (user.getCoppa()) {
                setCoppa(user.getCoppa());
            }
            mergeUnknownFields(((h0) user).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.User.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.User.access$1200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.User r3 = (io.bidmachine.protobuf.sdk.User) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.User r4 = (io.bidmachine.protobuf.sdk.User) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.User.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.User$Builder");
        }
    }

    public static Builder newBuilder(User user) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
    }

    public static User parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (User) PARSER.parseFrom(byteBuffer, wVar);
    }

    private User(h0.b bVar) {
        super(bVar);
        this.gppSidMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static User parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (User) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (User) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public User getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static User parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (User) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (User) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private User() {
        this.gppSidMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.consent_ = "";
        this.ccpa_ = "";
        this.gpp_ = "";
        this.gppSid_ = h0.emptyIntList();
    }

    public static User parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (User) PARSER.parseFrom(bArr, wVar);
    }

    public static User parseFrom(InputStream inputStream) throws IOException {
        return (User) h0.parseWithIOException(PARSER, inputStream);
    }

    public static User parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (User) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static User parseFrom(l lVar) throws IOException {
        return (User) h0.parseWithIOException(PARSER, lVar);
    }

    private User(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.consent_ = lVar.J();
                        } else if (iK == 16) {
                            this.gdpr_ = lVar.q();
                        } else if (iK == 26) {
                            this.ccpa_ = lVar.J();
                        } else if (iK == 34) {
                            this.gpp_ = lVar.J();
                        } else if (iK == 40) {
                            if (!z11) {
                                this.gppSid_ = h0.newIntList();
                                z11 = true;
                            }
                            this.gppSid_.addInt(lVar.L());
                        } else if (iK == 42) {
                            int iP = lVar.p(lVar.C());
                            if (!z11 && lVar.d() > 0) {
                                this.gppSid_ = h0.newIntList();
                                z11 = true;
                            }
                            while (lVar.d() > 0) {
                                this.gppSid_.addInt(lVar.L());
                            }
                            lVar.o(iP);
                        } else if (iK != 48) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.coppa_ = lVar.q();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.gppSid_.makeImmutable();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.gppSid_.makeImmutable();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static User parseFrom(l lVar, w wVar) throws IOException {
        return (User) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
