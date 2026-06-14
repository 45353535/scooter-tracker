package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class SDK extends h0 implements SDKOrBuilder {
    public static final int OMIDPN_FIELD_NUMBER = 3;
    public static final int OMIDPV_FIELD_NUMBER = 4;
    public static final int SDKVER_FIELD_NUMBER = 2;
    public static final int SDK_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object omidpn_;
    private volatile Object omidpv_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private static final SDK DEFAULT_INSTANCE = new SDK();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.SDK.1
        @Override // com.explorestack.protobuf.p1
        public SDK parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new SDK(lVar, wVar);
        }
    };

    public static SDK getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDK parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDK) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDK parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDK)) {
            return super.equals(obj);
        }
        SDK sdk = (SDK) obj;
        return getSdk().equals(sdk.getSdk()) && getSdkver().equals(sdk.getSdkver()) && getOmidpn().equals(sdk.getOmidpn()) && getOmidpv().equals(sdk.getOmidpv()) && this.unknownFields.equals(sdk.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getOmidpn() {
        Object obj = this.omidpn_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.omidpn_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getOmidpnBytes() {
        Object obj = this.omidpn_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.omidpn_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getOmidpv() {
        Object obj = this.omidpv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.omidpv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getOmidpvBytes() {
        Object obj = this.omidpv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.omidpv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getSdkBytes().isEmpty() ? h0.computeStringSize(1, this.sdk_) : 0;
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.sdkver_);
        }
        if (!getOmidpnBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(3, this.omidpn_);
        }
        if (!getOmidpvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.omidpv_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSdk().hashCode()) * 37) + 2) * 53) + getSdkver().hashCode()) * 37) + 3) * 53) + getOmidpn().hashCode()) * 37) + 4) * 53) + getOmidpv().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_fieldAccessorTable.d(SDK.class, Builder.class);
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
        return new SDK();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getSdkBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.sdkver_);
        }
        if (!getOmidpnBytes().isEmpty()) {
            h0.writeString(nVar, 3, this.omidpn_);
        }
        if (!getOmidpvBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.omidpv_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements SDKOrBuilder {
        private Object omidpn_;
        private Object omidpv_;
        private Object sdk_;
        private Object sdkver_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearOmidpn() {
            this.omidpn_ = SDK.getDefaultInstance().getOmidpn();
            onChanged();
            return this;
        }

        public Builder clearOmidpv() {
            this.omidpv_ = SDK.getDefaultInstance().getOmidpv();
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = SDK.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = SDK.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getOmidpn() {
            Object obj = this.omidpn_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.omidpn_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getOmidpnBytes() {
            Object obj = this.omidpn_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.omidpn_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getOmidpv() {
            Object obj = this.omidpv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.omidpv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getOmidpvBytes() {
            Object obj = this.omidpv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.omidpv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_fieldAccessorTable.d(SDK.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setOmidpn(String str) {
            str.getClass();
            this.omidpn_ = str;
            onChanged();
            return this;
        }

        public Builder setOmidpnBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.omidpn_ = byteString;
            onChanged();
            return this;
        }

        public Builder setOmidpv(String str) {
            str.getClass();
            this.omidpv_ = str;
            onChanged();
            return this;
        }

        public Builder setOmidpvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.omidpv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.sdk_ = "";
            this.sdkver_ = "";
            this.omidpn_ = "";
            this.omidpv_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDK build() {
            SDK sdkBuildPartial = buildPartial();
            if (sdkBuildPartial.isInitialized()) {
                return sdkBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sdkBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDK buildPartial() {
            SDK sdk = new SDK(this);
            sdk.sdk_ = this.sdk_;
            sdk.sdkver_ = this.sdkver_;
            sdk.omidpn_ = this.omidpn_;
            sdk.omidpv_ = this.omidpv_;
            onBuilt();
            return sdk;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public SDK getDefaultInstanceForType() {
            return SDK.getDefaultInstance();
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
            this.sdk_ = "";
            this.sdkver_ = "";
            this.omidpn_ = "";
            this.omidpv_ = "";
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SDK) {
                return mergeFrom((SDK) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.sdk_ = "";
            this.sdkver_ = "";
            this.omidpn_ = "";
            this.omidpv_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(SDK sdk) {
            if (sdk == SDK.getDefaultInstance()) {
                return this;
            }
            if (!sdk.getSdk().isEmpty()) {
                this.sdk_ = sdk.sdk_;
                onChanged();
            }
            if (!sdk.getSdkver().isEmpty()) {
                this.sdkver_ = sdk.sdkver_;
                onChanged();
            }
            if (!sdk.getOmidpn().isEmpty()) {
                this.omidpn_ = sdk.omidpn_;
                onChanged();
            }
            if (!sdk.getOmidpv().isEmpty()) {
                this.omidpv_ = sdk.omidpv_;
                onChanged();
            }
            mergeUnknownFields(((h0) sdk).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.SDK.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.SDK.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.SDK r3 = (io.bidmachine.protobuf.sdk.SDK) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.SDK r4 = (io.bidmachine.protobuf.sdk.SDK) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.SDK.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.SDK$Builder");
        }
    }

    public static Builder newBuilder(SDK sdk) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdk);
    }

    public static SDK parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteBuffer, wVar);
    }

    private SDK(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDK parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (SDK) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static SDK parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SDK getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDK parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDK() {
        this.memoizedIsInitialized = (byte) -1;
        this.sdk_ = "";
        this.sdkver_ = "";
        this.omidpn_ = "";
        this.omidpv_ = "";
    }

    public static SDK parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static SDK parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(bArr, wVar);
    }

    public static SDK parseFrom(InputStream inputStream) throws IOException {
        return (SDK) h0.parseWithIOException(PARSER, inputStream);
    }

    public static SDK parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (SDK) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    private SDK(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            this.sdk_ = lVar.J();
                        } else if (iK == 18) {
                            this.sdkver_ = lVar.J();
                        } else if (iK == 26) {
                            this.omidpn_ = lVar.J();
                        } else if (iK != 34) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.omidpv_ = lVar.J();
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

    public static SDK parseFrom(l lVar) throws IOException {
        return (SDK) h0.parseWithIOException(PARSER, lVar);
    }

    public static SDK parseFrom(l lVar, w wVar) throws IOException {
        return (SDK) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
