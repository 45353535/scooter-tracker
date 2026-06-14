package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import com.explorestack.protobuf.adcom.c;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class InitRequest extends h0 implements InitRequestOrBuilder {
    public static final int ANDROID_FIELD_NUMBER = 20;
    public static final int APP_VER_FIELD_NUMBER = 13;
    public static final int BM_IFV_FIELD_NUMBER = 12;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 19;
    public static final int CONTYPE_FIELD_NUMBER = 10;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int EXT_FIELD_NUMBER = 15;
    public static final int GEO_FIELD_NUMBER = 5;
    public static final int HWV_FIELD_NUMBER = 18;
    public static final int IFA_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 11;
    public static final int IOS_FIELD_NUMBER = 21;
    public static final int MAKE_FIELD_NUMBER = 16;
    public static final int MODEL_FIELD_NUMBER = 17;
    public static final int OSV_FIELD_NUMBER = 4;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int SDKVER_FIELD_NUMBER = 7;
    public static final int SDK_FIELD_NUMBER = 6;
    public static final int SELLER_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private volatile Object appVer_;
    private volatile Object bmIfv_;
    private volatile Object bundle_;
    private Context context_;
    private int contype_;
    private int deviceType_;
    private Struct ext_;
    private Context.Geo geo_;
    private volatile Object hwv_;
    private volatile Object ifa_;
    private volatile Object ifv_;
    private volatile Object make_;
    private byte memoizedIsInitialized;
    private volatile Object model_;
    private int os_;
    private volatile Object osv_;
    private int platformDataCase_;
    private Object platformData_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private volatile Object sellerId_;
    private volatile Object sessionId_;
    private static final InitRequest DEFAULT_INSTANCE = new InitRequest();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.InitRequest.1
        @Override // com.explorestack.protobuf.p1
        public InitRequest parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new InitRequest(lVar, wVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.InitRequest$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase;

        static {
            int[] iArr = new int[PlatformDataCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase = iArr;
            try {
                iArr[PlatformDataCase.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[PlatformDataCase.IOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[PlatformDataCase.PLATFORMDATA_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class AndroidPlatformData extends h0 implements AndroidPlatformDataOrBuilder {
        public static final int KOTLIN_VERSION_FIELD_NUMBER = 2;
        public static final int MIN_API_LEVEL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object kotlinVersion_;
        private byte memoizedIsInitialized;
        private int minApiLevel_;
        private static final AndroidPlatformData DEFAULT_INSTANCE = new AndroidPlatformData();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.InitRequest.AndroidPlatformData.1
            @Override // com.explorestack.protobuf.p1
            public AndroidPlatformData parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AndroidPlatformData(lVar, wVar);
            }
        };

        public static AndroidPlatformData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AndroidPlatformData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AndroidPlatformData) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AndroidPlatformData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidPlatformData)) {
                return super.equals(obj);
            }
            AndroidPlatformData androidPlatformData = (AndroidPlatformData) obj;
            return getMinApiLevel() == androidPlatformData.getMinApiLevel() && getKotlinVersion().equals(androidPlatformData.getKotlinVersion()) && this.unknownFields.equals(androidPlatformData.unknownFields);
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public String getKotlinVersion() {
            Object obj = this.kotlinVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kotlinVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public ByteString getKotlinVersionBytes() {
            Object obj = this.kotlinVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.kotlinVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public int getMinApiLevel() {
            return this.minApiLevel_;
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
            int i11 = this.minApiLevel_;
            int iY = i11 != 0 ? n.Y(1, i11) : 0;
            if (!getKotlinVersionBytes().isEmpty()) {
                iY += h0.computeStringSize(2, this.kotlinVersion_);
            }
            int serializedSize = iY + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMinApiLevel()) * 37) + 2) * 53) + getKotlinVersion().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable.d(AndroidPlatformData.class, Builder.class);
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
            return new AndroidPlatformData();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            int i10 = this.minApiLevel_;
            if (i10 != 0) {
                nVar.W0(1, i10);
            }
            if (!getKotlinVersionBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.kotlinVersion_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AndroidPlatformDataOrBuilder {
            private Object kotlinVersion_;
            private int minApiLevel_;

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearKotlinVersion() {
                this.kotlinVersion_ = AndroidPlatformData.getDefaultInstance().getKotlinVersion();
                onChanged();
                return this;
            }

            public Builder clearMinApiLevel() {
                this.minApiLevel_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public String getKotlinVersion() {
                Object obj = this.kotlinVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.kotlinVersion_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public ByteString getKotlinVersionBytes() {
                Object obj = this.kotlinVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.kotlinVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public int getMinApiLevel() {
                return this.minApiLevel_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable.d(AndroidPlatformData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setKotlinVersion(String str) {
                str.getClass();
                this.kotlinVersion_ = str;
                onChanged();
                return this;
            }

            public Builder setKotlinVersionBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.kotlinVersion_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMinApiLevel(int i10) {
                this.minApiLevel_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.kotlinVersion_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AndroidPlatformData build() {
                AndroidPlatformData androidPlatformDataBuildPartial = buildPartial();
                if (androidPlatformDataBuildPartial.isInitialized()) {
                    return androidPlatformDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) androidPlatformDataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AndroidPlatformData buildPartial() {
                AndroidPlatformData androidPlatformData = new AndroidPlatformData(this);
                androidPlatformData.minApiLevel_ = this.minApiLevel_;
                androidPlatformData.kotlinVersion_ = this.kotlinVersion_;
                onBuilt();
                return androidPlatformData;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AndroidPlatformData getDefaultInstanceForType() {
                return AndroidPlatformData.getDefaultInstance();
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
                this.minApiLevel_ = 0;
                this.kotlinVersion_ = "";
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.kotlinVersion_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AndroidPlatformData) {
                    return mergeFrom((AndroidPlatformData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AndroidPlatformData androidPlatformData) {
                if (androidPlatformData == AndroidPlatformData.getDefaultInstance()) {
                    return this;
                }
                if (androidPlatformData.getMinApiLevel() != 0) {
                    setMinApiLevel(androidPlatformData.getMinApiLevel());
                }
                if (!androidPlatformData.getKotlinVersion().isEmpty()) {
                    this.kotlinVersion_ = androidPlatformData.kotlinVersion_;
                    onChanged();
                }
                mergeUnknownFields(((h0) androidPlatformData).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.InitRequest.AndroidPlatformData.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.InitRequest.AndroidPlatformData.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.InitRequest$AndroidPlatformData r3 = (io.bidmachine.protobuf.InitRequest.AndroidPlatformData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.InitRequest$AndroidPlatformData r4 = (io.bidmachine.protobuf.InitRequest.AndroidPlatformData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitRequest.AndroidPlatformData.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.InitRequest$AndroidPlatformData$Builder");
            }
        }

        public static Builder newBuilder(AndroidPlatformData androidPlatformData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(androidPlatformData);
        }

        public static AndroidPlatformData parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AndroidPlatformData(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AndroidPlatformData parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AndroidPlatformData) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AndroidPlatformData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AndroidPlatformData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AndroidPlatformData parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AndroidPlatformData() {
            this.memoizedIsInitialized = (byte) -1;
            this.kotlinVersion_ = "";
        }

        public static AndroidPlatformData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static AndroidPlatformData parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(bArr, wVar);
        }

        public static AndroidPlatformData parseFrom(InputStream inputStream) throws IOException {
            return (AndroidPlatformData) h0.parseWithIOException(PARSER, inputStream);
        }

        private AndroidPlatformData(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.minApiLevel_ = lVar.L();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.kotlinVersion_ = lVar.J();
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

        public static AndroidPlatformData parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AndroidPlatformData) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static AndroidPlatformData parseFrom(l lVar) throws IOException {
            return (AndroidPlatformData) h0.parseWithIOException(PARSER, lVar);
        }

        public static AndroidPlatformData parseFrom(l lVar, w wVar) throws IOException {
            return (AndroidPlatformData) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface AndroidPlatformDataOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getKotlinVersion();

        ByteString getKotlinVersionBytes();

        int getMinApiLevel();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum PlatformDataCase implements j0.c {
        ANDROID(20),
        IOS(21),
        PLATFORMDATA_NOT_SET(0);

        private final int value;

        PlatformDataCase(int i10) {
            this.value = i10;
        }

        public static PlatformDataCase forNumber(int i10) {
            if (i10 == 0) {
                return PLATFORMDATA_NOT_SET;
            }
            if (i10 == 20) {
                return ANDROID;
            }
            if (i10 != 21) {
                return null;
            }
            return IOS;
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PlatformDataCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static final class iOSPlatformData extends h0 implements iOSPlatformDataOrBuilder {
        public static final int MIN_OS_VERSION_FIELD_NUMBER = 1;
        public static final int OS_EXECUTION_ENV_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private StringValue minOsVersion_;
        private int osExecutionEnv_;
        private static final iOSPlatformData DEFAULT_INSTANCE = new iOSPlatformData();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.InitRequest.iOSPlatformData.1
            @Override // com.explorestack.protobuf.p1
            public iOSPlatformData parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new iOSPlatformData(lVar, wVar);
            }
        };

        public static iOSPlatformData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static iOSPlatformData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (iOSPlatformData) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static iOSPlatformData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof iOSPlatformData)) {
                return super.equals(obj);
            }
            iOSPlatformData iosplatformdata = (iOSPlatformData) obj;
            if (hasMinOsVersion() != iosplatformdata.hasMinOsVersion()) {
                return false;
            }
            return (!hasMinOsVersion() || getMinOsVersion().equals(iosplatformdata.getMinOsVersion())) && this.osExecutionEnv_ == iosplatformdata.osExecutionEnv_ && this.unknownFields.equals(iosplatformdata.unknownFields);
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public StringValue getMinOsVersion() {
            StringValue stringValue = this.minOsVersion_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public d2 getMinOsVersionOrBuilder() {
            return getMinOsVersion();
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public OSExecutionEnvironment getOsExecutionEnv() {
            OSExecutionEnvironment oSExecutionEnvironmentValueOf = OSExecutionEnvironment.valueOf(this.osExecutionEnv_);
            return oSExecutionEnvironmentValueOf == null ? OSExecutionEnvironment.UNRECOGNIZED : oSExecutionEnvironmentValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public int getOsExecutionEnvValue() {
            return this.osExecutionEnv_;
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
            int iG = this.minOsVersion_ != null ? n.G(1, getMinOsVersion()) : 0;
            if (this.osExecutionEnv_ != OSExecutionEnvironment.OS_EXECUTION_ENVIRONMENT_UNKNOWN.getNumber()) {
                iG += n.l(2, this.osExecutionEnv_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public boolean hasMinOsVersion() {
            return this.minOsVersion_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasMinOsVersion()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMinOsVersion().hashCode();
            }
            int iHashCode2 = (((((iHashCode * 37) + 2) * 53) + this.osExecutionEnv_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable.d(iOSPlatformData.class, Builder.class);
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
            return new iOSPlatformData();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.minOsVersion_ != null) {
                nVar.J0(1, getMinOsVersion());
            }
            if (this.osExecutionEnv_ != OSExecutionEnvironment.OS_EXECUTION_ENVIRONMENT_UNKNOWN.getNumber()) {
                nVar.v0(2, this.osExecutionEnv_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements iOSPlatformDataOrBuilder {
            private a2 minOsVersionBuilder_;
            private StringValue minOsVersion_;
            private int osExecutionEnv_;

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
            }

            private a2 getMinOsVersionFieldBuilder() {
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersionBuilder_ = new a2(getMinOsVersion(), getParentForChildren(), isClean());
                    this.minOsVersion_ = null;
                }
                return this.minOsVersionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearMinOsVersion() {
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersion_ = null;
                    onChanged();
                    return this;
                }
                this.minOsVersion_ = null;
                this.minOsVersionBuilder_ = null;
                return this;
            }

            public Builder clearOsExecutionEnv() {
                this.osExecutionEnv_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public StringValue getMinOsVersion() {
                a2 a2Var = this.minOsVersionBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.minOsVersion_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getMinOsVersionBuilder() {
                onChanged();
                return (StringValue.Builder) getMinOsVersionFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public d2 getMinOsVersionOrBuilder() {
                a2 a2Var = this.minOsVersionBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.minOsVersion_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public OSExecutionEnvironment getOsExecutionEnv() {
                OSExecutionEnvironment oSExecutionEnvironmentValueOf = OSExecutionEnvironment.valueOf(this.osExecutionEnv_);
                return oSExecutionEnvironmentValueOf == null ? OSExecutionEnvironment.UNRECOGNIZED : oSExecutionEnvironmentValueOf;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public int getOsExecutionEnvValue() {
                return this.osExecutionEnv_;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public boolean hasMinOsVersion() {
                return (this.minOsVersionBuilder_ == null && this.minOsVersion_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable.d(iOSPlatformData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMinOsVersion(StringValue stringValue) {
                a2 a2Var = this.minOsVersionBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.minOsVersion_;
                if (stringValue2 != null) {
                    this.minOsVersion_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.minOsVersion_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder setMinOsVersion(StringValue stringValue) {
                a2 a2Var = this.minOsVersionBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.minOsVersion_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setOsExecutionEnv(OSExecutionEnvironment oSExecutionEnvironment) {
                oSExecutionEnvironment.getClass();
                this.osExecutionEnv_ = oSExecutionEnvironment.getNumber();
                onChanged();
                return this;
            }

            public Builder setOsExecutionEnvValue(int i10) {
                this.osExecutionEnv_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.osExecutionEnv_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public iOSPlatformData build() {
                iOSPlatformData iosplatformdataBuildPartial = buildPartial();
                if (iosplatformdataBuildPartial.isInitialized()) {
                    return iosplatformdataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iosplatformdataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public iOSPlatformData buildPartial() {
                iOSPlatformData iosplatformdata = new iOSPlatformData(this);
                a2 a2Var = this.minOsVersionBuilder_;
                if (a2Var == null) {
                    iosplatformdata.minOsVersion_ = this.minOsVersion_;
                } else {
                    iosplatformdata.minOsVersion_ = (StringValue) a2Var.a();
                }
                iosplatformdata.osExecutionEnv_ = this.osExecutionEnv_;
                onBuilt();
                return iosplatformdata;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public iOSPlatformData getDefaultInstanceForType() {
                return iOSPlatformData.getDefaultInstance();
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
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersion_ = null;
                } else {
                    this.minOsVersion_ = null;
                    this.minOsVersionBuilder_ = null;
                }
                this.osExecutionEnv_ = 0;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.osExecutionEnv_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setMinOsVersion(StringValue.Builder builder) {
                a2 a2Var = this.minOsVersionBuilder_;
                if (a2Var == null) {
                    this.minOsVersion_ = builder.build();
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
                if (message instanceof iOSPlatformData) {
                    return mergeFrom((iOSPlatformData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(iOSPlatformData iosplatformdata) {
                if (iosplatformdata == iOSPlatformData.getDefaultInstance()) {
                    return this;
                }
                if (iosplatformdata.hasMinOsVersion()) {
                    mergeMinOsVersion(iosplatformdata.getMinOsVersion());
                }
                if (iosplatformdata.osExecutionEnv_ != 0) {
                    setOsExecutionEnvValue(iosplatformdata.getOsExecutionEnvValue());
                }
                mergeUnknownFields(((h0) iosplatformdata).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.InitRequest.iOSPlatformData.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.InitRequest.iOSPlatformData.access$1700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.InitRequest$iOSPlatformData r3 = (io.bidmachine.protobuf.InitRequest.iOSPlatformData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.InitRequest$iOSPlatformData r4 = (io.bidmachine.protobuf.InitRequest.iOSPlatformData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitRequest.iOSPlatformData.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.InitRequest$iOSPlatformData$Builder");
            }
        }

        public static Builder newBuilder(iOSPlatformData iosplatformdata) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iosplatformdata);
        }

        public static iOSPlatformData parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteBuffer, wVar);
        }

        private iOSPlatformData(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static iOSPlatformData parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (iOSPlatformData) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static iOSPlatformData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public iOSPlatformData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static iOSPlatformData parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private iOSPlatformData() {
            this.memoizedIsInitialized = (byte) -1;
            this.osExecutionEnv_ = 0;
        }

        public static iOSPlatformData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static iOSPlatformData parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(bArr, wVar);
        }

        public static iOSPlatformData parseFrom(InputStream inputStream) throws IOException {
            return (iOSPlatformData) h0.parseWithIOException(PARSER, inputStream);
        }

        private iOSPlatformData(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                StringValue stringValue = this.minOsVersion_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.minOsVersion_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.minOsVersion_ = builder.buildPartial();
                                }
                            } else if (iK != 16) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.osExecutionEnv_ = lVar.t();
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

        public static iOSPlatformData parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (iOSPlatformData) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static iOSPlatformData parseFrom(l lVar) throws IOException {
            return (iOSPlatformData) h0.parseWithIOException(PARSER, lVar);
        }

        public static iOSPlatformData parseFrom(l lVar, w wVar) throws IOException {
            return (iOSPlatformData) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface iOSPlatformDataOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        StringValue getMinOsVersion();

        d2 getMinOsVersionOrBuilder();

        OSExecutionEnvironment getOsExecutionEnv();

        int getOsExecutionEnvValue();

        boolean hasMinOsVersion();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static InitRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitRequest) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitRequest)) {
            return super.equals(obj);
        }
        InitRequest initRequest = (InitRequest) obj;
        if (!getSellerId().equals(initRequest.getSellerId()) || !getBundle().equals(initRequest.getBundle()) || this.os_ != initRequest.os_ || !getOsv().equals(initRequest.getOsv()) || hasGeo() != initRequest.hasGeo()) {
            return false;
        }
        if ((hasGeo() && !getGeo().equals(initRequest.getGeo())) || !getSdk().equals(initRequest.getSdk()) || !getSdkver().equals(initRequest.getSdkver()) || !getIfa().equals(initRequest.getIfa()) || !getIfv().equals(initRequest.getIfv()) || !getBmIfv().equals(initRequest.getBmIfv()) || this.deviceType_ != initRequest.deviceType_ || this.contype_ != initRequest.contype_ || !getAppVer().equals(initRequest.getAppVer()) || !getSessionId().equals(initRequest.getSessionId()) || hasExt() != initRequest.hasExt()) {
            return false;
        }
        if ((hasExt() && !getExt().equals(initRequest.getExt())) || !getMake().equals(initRequest.getMake()) || !getModel().equals(initRequest.getModel()) || !getHwv().equals(initRequest.getHwv()) || hasContext() != initRequest.hasContext()) {
            return false;
        }
        if ((hasContext() && !getContext().equals(initRequest.getContext())) || !getPlatformDataCase().equals(initRequest.getPlatformDataCase())) {
            return false;
        }
        int i10 = this.platformDataCase_;
        if (i10 != 20) {
            if (i10 == 21 && !getIos().equals(initRequest.getIos())) {
                return false;
            }
        } else if (!getAndroid().equals(initRequest.getAndroid())) {
            return false;
        }
        return this.unknownFields.equals(initRequest.unknownFields);
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public AndroidPlatformData getAndroid() {
        return this.platformDataCase_ == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public AndroidPlatformDataOrBuilder getAndroidOrBuilder() {
        return this.platformDataCase_ == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getBundle() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bundle_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getBundleBytes() {
        Object obj = this.bundle_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bundle_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public c getContextOrBuilder() {
        return getContext();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ConnectionType getContype() {
        ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
        return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getContypeValue() {
        return this.contype_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public DeviceType getDeviceType() {
        DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
        return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public e2 getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context.Geo getGeo() {
        Context.Geo geo = this.geo_;
        return geo == null ? Context.Geo.getDefaultInstance() : geo;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context.GeoOrBuilder getGeoOrBuilder() {
        return getGeo();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getHwv() {
        Object obj = this.hwv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.hwv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getHwvBytes() {
        Object obj = this.hwv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.hwv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getIfa() {
        Object obj = this.ifa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifa_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getIfaBytes() {
        Object obj = this.ifa_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifa_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public iOSPlatformData getIos() {
        return this.platformDataCase_ == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public iOSPlatformDataOrBuilder getIosOrBuilder() {
        return this.platformDataCase_ == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getMake() {
        Object obj = this.make_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.make_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getMakeBytes() {
        Object obj = this.make_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.make_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getModel() {
        Object obj = this.model_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.model_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getModelBytes() {
        Object obj = this.model_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.model_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public OS getOs() {
        OS osValueOf = OS.valueOf(this.os_);
        return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getOsValue() {
        return this.os_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getOsv() {
        Object obj = this.osv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getOsvBytes() {
        Object obj = this.osv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.osv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public PlatformDataCase getPlatformDataCase() {
        return PlatformDataCase.forNumber(this.platformDataCase_);
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSellerId() {
        Object obj = this.sellerId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sellerId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSellerIdBytes() {
        Object obj = this.sellerId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sellerId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getSellerIdBytes().isEmpty() ? h0.computeStringSize(1, this.sellerId_) : 0;
        if (!getBundleBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            iComputeStringSize += n.l(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.osv_);
        }
        if (this.geo_ != null) {
            iComputeStringSize += n.G(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            iComputeStringSize += n.l(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            iComputeStringSize += n.l(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(14, this.sessionId_);
        }
        if (this.ext_ != null) {
            iComputeStringSize += n.G(15, getExt());
        }
        if (!getMakeBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(16, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(17, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(18, this.hwv_);
        }
        if (this.context_ != null) {
            iComputeStringSize += n.G(19, getContext());
        }
        if (this.platformDataCase_ == 20) {
            iComputeStringSize += n.G(20, (AndroidPlatformData) this.platformData_);
        }
        if (this.platformDataCase_ == 21) {
            iComputeStringSize += n.G(21, (iOSPlatformData) this.platformData_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasAndroid() {
        return this.platformDataCase_ == 20;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasGeo() {
        return this.geo_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasIos() {
        return this.platformDataCase_ == 21;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSellerId().hashCode()) * 37) + 2) * 53) + getBundle().hashCode()) * 37) + 3) * 53) + this.os_) * 37) + 4) * 53) + getOsv().hashCode();
        if (hasGeo()) {
            iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getGeo().hashCode();
        }
        int iHashCode3 = (((((((((((((((((((((((((((((((((((iHashCode2 * 37) + 6) * 53) + getSdk().hashCode()) * 37) + 7) * 53) + getSdkver().hashCode()) * 37) + 8) * 53) + getIfa().hashCode()) * 37) + 11) * 53) + getIfv().hashCode()) * 37) + 12) * 53) + getBmIfv().hashCode()) * 37) + 9) * 53) + this.deviceType_) * 37) + 10) * 53) + this.contype_) * 37) + 13) * 53) + getAppVer().hashCode()) * 37) + 14) * 53) + getSessionId().hashCode();
        if (hasExt()) {
            iHashCode3 = (((iHashCode3 * 37) + 15) * 53) + getExt().hashCode();
        }
        int iHashCode4 = (((((((((((iHashCode3 * 37) + 16) * 53) + getMake().hashCode()) * 37) + 17) * 53) + getModel().hashCode()) * 37) + 18) * 53) + getHwv().hashCode();
        if (hasContext()) {
            iHashCode4 = (((iHashCode4 * 37) + 19) * 53) + getContext().hashCode();
        }
        int i12 = this.platformDataCase_;
        if (i12 != 20) {
            if (i12 == 21) {
                i10 = ((iHashCode4 * 37) + 21) * 53;
                iHashCode = getIos().hashCode();
            }
            int iHashCode5 = (iHashCode4 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode5;
            return iHashCode5;
        }
        i10 = ((iHashCode4 * 37) + 20) * 53;
        iHashCode = getAndroid().hashCode();
        iHashCode4 = i10 + iHashCode;
        int iHashCode52 = (iHashCode4 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode52;
        return iHashCode52;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.d(InitRequest.class, Builder.class);
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
        return new InitRequest();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getSellerIdBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.sellerId_);
        }
        if (!getBundleBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            nVar.v0(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.osv_);
        }
        if (this.geo_ != null) {
            nVar.J0(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            h0.writeString(nVar, 6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            h0.writeString(nVar, 7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            h0.writeString(nVar, 8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            nVar.v0(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            nVar.v0(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            h0.writeString(nVar, 11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            h0.writeString(nVar, 12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            h0.writeString(nVar, 13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            h0.writeString(nVar, 14, this.sessionId_);
        }
        if (this.ext_ != null) {
            nVar.J0(15, getExt());
        }
        if (!getMakeBytes().isEmpty()) {
            h0.writeString(nVar, 16, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            h0.writeString(nVar, 17, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            h0.writeString(nVar, 18, this.hwv_);
        }
        if (this.context_ != null) {
            nVar.J0(19, getContext());
        }
        if (this.platformDataCase_ == 20) {
            nVar.J0(20, (AndroidPlatformData) this.platformData_);
        }
        if (this.platformDataCase_ == 21) {
            nVar.J0(21, (iOSPlatformData) this.platformData_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements InitRequestOrBuilder {
        private a2 androidBuilder_;
        private Object appVer_;
        private Object bmIfv_;
        private Object bundle_;
        private a2 contextBuilder_;
        private Context context_;
        private int contype_;
        private int deviceType_;
        private a2 extBuilder_;
        private Struct ext_;
        private a2 geoBuilder_;
        private Context.Geo geo_;
        private Object hwv_;
        private Object ifa_;
        private Object ifv_;
        private a2 iosBuilder_;
        private Object make_;
        private Object model_;
        private int os_;
        private Object osv_;
        private int platformDataCase_;
        private Object platformData_;
        private Object sdk_;
        private Object sdkver_;
        private Object sellerId_;
        private Object sessionId_;

        private a2 getAndroidFieldBuilder() {
            if (this.androidBuilder_ == null) {
                if (this.platformDataCase_ != 20) {
                    this.platformData_ = AndroidPlatformData.getDefaultInstance();
                }
                this.androidBuilder_ = new a2((AndroidPlatformData) this.platformData_, getParentForChildren(), isClean());
                this.platformData_ = null;
            }
            this.platformDataCase_ = 20;
            onChanged();
            return this.androidBuilder_;
        }

        private a2 getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new a2(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        private a2 getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private a2 getGeoFieldBuilder() {
            if (this.geoBuilder_ == null) {
                this.geoBuilder_ = new a2(getGeo(), getParentForChildren(), isClean());
                this.geo_ = null;
            }
            return this.geoBuilder_;
        }

        private a2 getIosFieldBuilder() {
            if (this.iosBuilder_ == null) {
                if (this.platformDataCase_ != 21) {
                    this.platformData_ = iOSPlatformData.getDefaultInstance();
                }
                this.iosBuilder_ = new a2((iOSPlatformData) this.platformData_, getParentForChildren(), isClean());
                this.platformData_ = null;
            }
            this.platformDataCase_ = 21;
            onChanged();
            return this.iosBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearAndroid() {
            a2 a2Var = this.androidBuilder_;
            if (a2Var == null) {
                if (this.platformDataCase_ == 20) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.platformDataCase_ == 20) {
                this.platformDataCase_ = 0;
                this.platformData_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = InitRequest.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = InitRequest.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = InitRequest.getDefaultInstance().getBundle();
            onChanged();
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        public Builder clearContype() {
            this.contype_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDeviceType() {
            this.deviceType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
        }

        public Builder clearGeo() {
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
                onChanged();
                return this;
            }
            this.geo_ = null;
            this.geoBuilder_ = null;
            return this;
        }

        public Builder clearHwv() {
            this.hwv_ = InitRequest.getDefaultInstance().getHwv();
            onChanged();
            return this;
        }

        public Builder clearIfa() {
            this.ifa_ = InitRequest.getDefaultInstance().getIfa();
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = InitRequest.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearIos() {
            a2 a2Var = this.iosBuilder_;
            if (a2Var == null) {
                if (this.platformDataCase_ == 21) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.platformDataCase_ == 21) {
                this.platformDataCase_ = 0;
                this.platformData_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearMake() {
            this.make_ = InitRequest.getDefaultInstance().getMake();
            onChanged();
            return this;
        }

        public Builder clearModel() {
            this.model_ = InitRequest.getDefaultInstance().getModel();
            onChanged();
            return this;
        }

        public Builder clearOs() {
            this.os_ = 0;
            onChanged();
            return this;
        }

        public Builder clearOsv() {
            this.osv_ = InitRequest.getDefaultInstance().getOsv();
            onChanged();
            return this;
        }

        public Builder clearPlatformData() {
            this.platformDataCase_ = 0;
            this.platformData_ = null;
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = InitRequest.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = InitRequest.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearSellerId() {
            this.sellerId_ = InitRequest.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = InitRequest.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public AndroidPlatformData getAndroid() {
            a2 a2Var = this.androidBuilder_;
            return a2Var == null ? this.platformDataCase_ == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance() : this.platformDataCase_ == 20 ? (AndroidPlatformData) a2Var.e() : AndroidPlatformData.getDefaultInstance();
        }

        public AndroidPlatformData.Builder getAndroidBuilder() {
            return (AndroidPlatformData.Builder) getAndroidFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public AndroidPlatformDataOrBuilder getAndroidOrBuilder() {
            a2 a2Var;
            int i10 = this.platformDataCase_;
            return (i10 != 20 || (a2Var = this.androidBuilder_) == null) ? i10 == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance() : (AndroidPlatformDataOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context getContext() {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                return (Context) a2Var.e();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return (Context.Builder) getContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public c getContextOrBuilder() {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                return (c) a2Var.f();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ConnectionType getContype() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getDeviceTypeValue() {
            return this.deviceType_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Struct getExt() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public e2 getExtOrBuilder() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context.Geo getGeo() {
            a2 a2Var = this.geoBuilder_;
            if (a2Var != null) {
                return (Context.Geo) a2Var.e();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        public Context.Geo.Builder getGeoBuilder() {
            onChanged();
            return (Context.Geo.Builder) getGeoFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context.GeoOrBuilder getGeoOrBuilder() {
            a2 a2Var = this.geoBuilder_;
            if (a2Var != null) {
                return (Context.GeoOrBuilder) a2Var.f();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public iOSPlatformData getIos() {
            a2 a2Var = this.iosBuilder_;
            return a2Var == null ? this.platformDataCase_ == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance() : this.platformDataCase_ == 21 ? (iOSPlatformData) a2Var.e() : iOSPlatformData.getDefaultInstance();
        }

        public iOSPlatformData.Builder getIosBuilder() {
            return (iOSPlatformData.Builder) getIosFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public iOSPlatformDataOrBuilder getIosOrBuilder() {
            a2 a2Var;
            int i10 = this.platformDataCase_;
            return (i10 != 21 || (a2Var = this.iosBuilder_) == null) ? i10 == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance() : (iOSPlatformDataOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public OS getOs() {
            OS osValueOf = OS.valueOf(this.os_);
            return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public PlatformDataCase getPlatformDataCase() {
            return PlatformDataCase.forNumber(this.platformDataCase_);
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSellerId() {
            Object obj = this.sellerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sellerId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSellerIdBytes() {
            Object obj = this.sellerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sellerId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasAndroid() {
            return this.platformDataCase_ == 20;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasGeo() {
            return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasIos() {
            return this.platformDataCase_ == 21;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.d(InitRequest.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAndroid(AndroidPlatformData androidPlatformData) {
            a2 a2Var = this.androidBuilder_;
            if (a2Var == null) {
                if (this.platformDataCase_ != 20 || this.platformData_ == AndroidPlatformData.getDefaultInstance()) {
                    this.platformData_ = androidPlatformData;
                } else {
                    this.platformData_ = AndroidPlatformData.newBuilder((AndroidPlatformData) this.platformData_).mergeFrom(androidPlatformData).buildPartial();
                }
                onChanged();
            } else {
                if (this.platformDataCase_ == 20) {
                    a2Var.g(androidPlatformData);
                }
                this.androidBuilder_.i(androidPlatformData);
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder mergeContext(Context context) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                a2Var.g(context);
                return this;
            }
            Context context2 = this.context_;
            if (context2 != null) {
                this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
            } else {
                this.context_ = context;
            }
            onChanged();
            return this;
        }

        public Builder mergeExt(Struct struct) {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.ext_;
            if (struct2 != null) {
                this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.ext_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeGeo(Context.Geo geo) {
            a2 a2Var = this.geoBuilder_;
            if (a2Var != null) {
                a2Var.g(geo);
                return this;
            }
            Context.Geo geo2 = this.geo_;
            if (geo2 != null) {
                this.geo_ = Context.Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
            } else {
                this.geo_ = geo;
            }
            onChanged();
            return this;
        }

        public Builder mergeIos(iOSPlatformData iosplatformdata) {
            a2 a2Var = this.iosBuilder_;
            if (a2Var == null) {
                if (this.platformDataCase_ != 21 || this.platformData_ == iOSPlatformData.getDefaultInstance()) {
                    this.platformData_ = iosplatformdata;
                } else {
                    this.platformData_ = iOSPlatformData.newBuilder((iOSPlatformData) this.platformData_).mergeFrom(iosplatformdata).buildPartial();
                }
                onChanged();
            } else {
                if (this.platformDataCase_ == 21) {
                    a2Var.g(iosplatformdata);
                }
                this.iosBuilder_.i(iosplatformdata);
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder setAndroid(AndroidPlatformData androidPlatformData) {
            a2 a2Var = this.androidBuilder_;
            if (a2Var == null) {
                androidPlatformData.getClass();
                this.platformData_ = androidPlatformData;
                onChanged();
            } else {
                a2Var.i(androidPlatformData);
            }
            this.platformDataCase_ = 20;
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

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setBundle(String str) {
            str.getClass();
            this.bundle_ = str;
            onChanged();
            return this;
        }

        public Builder setBundleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bundle_ = byteString;
            onChanged();
            return this;
        }

        public Builder setContext(Context context) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                a2Var.i(context);
                return this;
            }
            context.getClass();
            this.context_ = context;
            onChanged();
            return this;
        }

        public Builder setContype(ConnectionType connectionType) {
            connectionType.getClass();
            this.contype_ = connectionType.getNumber();
            onChanged();
            return this;
        }

        public Builder setContypeValue(int i10) {
            this.contype_ = i10;
            onChanged();
            return this;
        }

        public Builder setDeviceType(DeviceType deviceType) {
            deviceType.getClass();
            this.deviceType_ = deviceType.getNumber();
            onChanged();
            return this;
        }

        public Builder setDeviceTypeValue(int i10) {
            this.deviceType_ = i10;
            onChanged();
            return this;
        }

        public Builder setExt(Struct struct) {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.ext_ = struct;
            onChanged();
            return this;
        }

        public Builder setGeo(Context.Geo geo) {
            a2 a2Var = this.geoBuilder_;
            if (a2Var != null) {
                a2Var.i(geo);
                return this;
            }
            geo.getClass();
            this.geo_ = geo;
            onChanged();
            return this;
        }

        public Builder setHwv(String str) {
            str.getClass();
            this.hwv_ = str;
            onChanged();
            return this;
        }

        public Builder setHwvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.hwv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfa(String str) {
            str.getClass();
            this.ifa_ = str;
            onChanged();
            return this;
        }

        public Builder setIfaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ifa_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIos(iOSPlatformData iosplatformdata) {
            a2 a2Var = this.iosBuilder_;
            if (a2Var == null) {
                iosplatformdata.getClass();
                this.platformData_ = iosplatformdata;
                onChanged();
            } else {
                a2Var.i(iosplatformdata);
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder setMake(String str) {
            str.getClass();
            this.make_ = str;
            onChanged();
            return this;
        }

        public Builder setMakeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.make_ = byteString;
            onChanged();
            return this;
        }

        public Builder setModel(String str) {
            str.getClass();
            this.model_ = str;
            onChanged();
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.model_ = byteString;
            onChanged();
            return this;
        }

        public Builder setOs(OS os) {
            os.getClass();
            this.os_ = os.getNumber();
            onChanged();
            return this;
        }

        public Builder setOsValue(int i10) {
            this.os_ = i10;
            onChanged();
            return this;
        }

        public Builder setOsv(String str) {
            str.getClass();
            this.osv_ = str;
            onChanged();
            return this;
        }

        public Builder setOsvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.osv_ = byteString;
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

        public Builder setSellerId(String str) {
            str.getClass();
            this.sellerId_ = str;
            onChanged();
            return this;
        }

        public Builder setSellerIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sellerId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.platformDataCase_ = 0;
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitRequest build() {
            InitRequest initRequestBuildPartial = buildPartial();
            if (initRequestBuildPartial.isInitialized()) {
                return initRequestBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) initRequestBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitRequest buildPartial() {
            InitRequest initRequest = new InitRequest(this);
            initRequest.sellerId_ = this.sellerId_;
            initRequest.bundle_ = this.bundle_;
            initRequest.os_ = this.os_;
            initRequest.osv_ = this.osv_;
            a2 a2Var = this.geoBuilder_;
            if (a2Var == null) {
                initRequest.geo_ = this.geo_;
            } else {
                initRequest.geo_ = (Context.Geo) a2Var.a();
            }
            initRequest.sdk_ = this.sdk_;
            initRequest.sdkver_ = this.sdkver_;
            initRequest.ifa_ = this.ifa_;
            initRequest.ifv_ = this.ifv_;
            initRequest.bmIfv_ = this.bmIfv_;
            initRequest.deviceType_ = this.deviceType_;
            initRequest.contype_ = this.contype_;
            initRequest.appVer_ = this.appVer_;
            initRequest.sessionId_ = this.sessionId_;
            a2 a2Var2 = this.extBuilder_;
            if (a2Var2 == null) {
                initRequest.ext_ = this.ext_;
            } else {
                initRequest.ext_ = (Struct) a2Var2.a();
            }
            initRequest.make_ = this.make_;
            initRequest.model_ = this.model_;
            initRequest.hwv_ = this.hwv_;
            a2 a2Var3 = this.contextBuilder_;
            if (a2Var3 == null) {
                initRequest.context_ = this.context_;
            } else {
                initRequest.context_ = (Context) a2Var3.a();
            }
            if (this.platformDataCase_ == 20) {
                a2 a2Var4 = this.androidBuilder_;
                if (a2Var4 == null) {
                    initRequest.platformData_ = this.platformData_;
                } else {
                    initRequest.platformData_ = a2Var4.a();
                }
            }
            if (this.platformDataCase_ == 21) {
                a2 a2Var5 = this.iosBuilder_;
                if (a2Var5 == null) {
                    initRequest.platformData_ = this.platformData_;
                } else {
                    initRequest.platformData_ = a2Var5.a();
                }
            }
            initRequest.platformDataCase_ = this.platformDataCase_;
            onBuilt();
            return initRequest;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public InitRequest getDefaultInstanceForType() {
            return InitRequest.getDefaultInstance();
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
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            this.platformDataCase_ = 0;
            this.platformData_ = null;
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var == null) {
                this.context_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            a2 a2Var = this.extBuilder_;
            if (a2Var == null) {
                this.ext_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setGeo(Context.Geo.Builder builder) {
            a2 a2Var = this.geoBuilder_;
            if (a2Var == null) {
                this.geo_ = builder.build();
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
            if (message instanceof InitRequest) {
                return mergeFrom((InitRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAndroid(AndroidPlatformData.Builder builder) {
            a2 a2Var = this.androidBuilder_;
            if (a2Var == null) {
                this.platformData_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder setIos(iOSPlatformData.Builder builder) {
            a2 a2Var = this.iosBuilder_;
            if (a2Var == null) {
                this.platformData_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder mergeFrom(InitRequest initRequest) {
            if (initRequest == InitRequest.getDefaultInstance()) {
                return this;
            }
            if (!initRequest.getSellerId().isEmpty()) {
                this.sellerId_ = initRequest.sellerId_;
                onChanged();
            }
            if (!initRequest.getBundle().isEmpty()) {
                this.bundle_ = initRequest.bundle_;
                onChanged();
            }
            if (initRequest.os_ != 0) {
                setOsValue(initRequest.getOsValue());
            }
            if (!initRequest.getOsv().isEmpty()) {
                this.osv_ = initRequest.osv_;
                onChanged();
            }
            if (initRequest.hasGeo()) {
                mergeGeo(initRequest.getGeo());
            }
            if (!initRequest.getSdk().isEmpty()) {
                this.sdk_ = initRequest.sdk_;
                onChanged();
            }
            if (!initRequest.getSdkver().isEmpty()) {
                this.sdkver_ = initRequest.sdkver_;
                onChanged();
            }
            if (!initRequest.getIfa().isEmpty()) {
                this.ifa_ = initRequest.ifa_;
                onChanged();
            }
            if (!initRequest.getIfv().isEmpty()) {
                this.ifv_ = initRequest.ifv_;
                onChanged();
            }
            if (!initRequest.getBmIfv().isEmpty()) {
                this.bmIfv_ = initRequest.bmIfv_;
                onChanged();
            }
            if (initRequest.deviceType_ != 0) {
                setDeviceTypeValue(initRequest.getDeviceTypeValue());
            }
            if (initRequest.contype_ != 0) {
                setContypeValue(initRequest.getContypeValue());
            }
            if (!initRequest.getAppVer().isEmpty()) {
                this.appVer_ = initRequest.appVer_;
                onChanged();
            }
            if (!initRequest.getSessionId().isEmpty()) {
                this.sessionId_ = initRequest.sessionId_;
                onChanged();
            }
            if (initRequest.hasExt()) {
                mergeExt(initRequest.getExt());
            }
            if (!initRequest.getMake().isEmpty()) {
                this.make_ = initRequest.make_;
                onChanged();
            }
            if (!initRequest.getModel().isEmpty()) {
                this.model_ = initRequest.model_;
                onChanged();
            }
            if (!initRequest.getHwv().isEmpty()) {
                this.hwv_ = initRequest.hwv_;
                onChanged();
            }
            if (initRequest.hasContext()) {
                mergeContext(initRequest.getContext());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[initRequest.getPlatformDataCase().ordinal()];
            if (i10 == 1) {
                mergeAndroid(initRequest.getAndroid());
            } else if (i10 == 2) {
                mergeIos(initRequest.getIos());
            }
            mergeUnknownFields(((h0) initRequest).unknownFields);
            onChanged();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.platformDataCase_ = 0;
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.InitRequest.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.InitRequest.access$4500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.InitRequest r3 = (io.bidmachine.protobuf.InitRequest) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.InitRequest r4 = (io.bidmachine.protobuf.InitRequest) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitRequest.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.InitRequest$Builder");
        }
    }

    public static Builder newBuilder(InitRequest initRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initRequest);
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteBuffer, wVar);
    }

    private InitRequest(h0.b bVar) {
        super(bVar);
        this.platformDataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (InitRequest) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static InitRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public InitRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InitRequest parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static InitRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private InitRequest() {
        this.platformDataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.sellerId_ = "";
        this.bundle_ = "";
        this.os_ = 0;
        this.osv_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        this.ifa_ = "";
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.deviceType_ = 0;
        this.contype_ = 0;
        this.appVer_ = "";
        this.sessionId_ = "";
        this.make_ = "";
        this.model_ = "";
        this.hwv_ = "";
    }

    public static InitRequest parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(bArr, wVar);
    }

    public static InitRequest parseFrom(InputStream inputStream) throws IOException {
        return (InitRequest) h0.parseWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (InitRequest) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static InitRequest parseFrom(l lVar) throws IOException {
        return (InitRequest) h0.parseWithIOException(PARSER, lVar);
    }

    public static InitRequest parseFrom(l lVar, w wVar) throws IOException {
        return (InitRequest) h0.parseWithIOException(PARSER, lVar, wVar);
    }

    private InitRequest(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 10:
                            this.sellerId_ = lVar.J();
                            break;
                        case 18:
                            this.bundle_ = lVar.J();
                            break;
                        case 24:
                            this.os_ = lVar.t();
                            break;
                        case 34:
                            this.osv_ = lVar.J();
                            break;
                        case 42:
                            Context.Geo geo = this.geo_;
                            Context.Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                            Context.Geo geo2 = (Context.Geo) lVar.A(Context.Geo.parser(), wVar);
                            this.geo_ = geo2;
                            if (builder != null) {
                                builder.mergeFrom(geo2);
                                this.geo_ = builder.buildPartial();
                            }
                            break;
                        case 50:
                            this.sdk_ = lVar.J();
                            break;
                        case 58:
                            this.sdkver_ = lVar.J();
                            break;
                        case 66:
                            this.ifa_ = lVar.J();
                            break;
                        case 72:
                            this.deviceType_ = lVar.t();
                            break;
                        case 80:
                            this.contype_ = lVar.t();
                            break;
                        case 90:
                            this.ifv_ = lVar.J();
                            break;
                        case 98:
                            this.bmIfv_ = lVar.J();
                            break;
                        case 106:
                            this.appVer_ = lVar.J();
                            break;
                        case 114:
                            this.sessionId_ = lVar.J();
                            break;
                        case 122:
                            Struct struct = this.ext_;
                            Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder2 != null) {
                                builder2.mergeFrom(struct2);
                                this.ext_ = builder2.buildPartial();
                            }
                            break;
                        case 130:
                            this.make_ = lVar.J();
                            break;
                        case 138:
                            this.model_ = lVar.J();
                            break;
                        case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                            this.hwv_ = lVar.J();
                            break;
                        case 154:
                            Context context = this.context_;
                            Context.Builder builder3 = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) lVar.A(Context.parser(), wVar);
                            this.context_ = context2;
                            if (builder3 != null) {
                                builder3.mergeFrom(context2);
                                this.context_ = builder3.buildPartial();
                            }
                            break;
                        case 162:
                            AndroidPlatformData.Builder builder4 = this.platformDataCase_ == 20 ? ((AndroidPlatformData) this.platformData_).toBuilder() : null;
                            MessageLite messageLiteA = lVar.A(AndroidPlatformData.parser(), wVar);
                            this.platformData_ = messageLiteA;
                            if (builder4 != null) {
                                builder4.mergeFrom((AndroidPlatformData) messageLiteA);
                                this.platformData_ = builder4.buildPartial();
                            }
                            this.platformDataCase_ = 20;
                            break;
                        case 170:
                            iOSPlatformData.Builder builder5 = this.platformDataCase_ == 21 ? ((iOSPlatformData) this.platformData_).toBuilder() : null;
                            MessageLite messageLiteA2 = lVar.A(iOSPlatformData.parser(), wVar);
                            this.platformData_ = messageLiteA2;
                            if (builder5 != null) {
                                builder5.mergeFrom((iOSPlatformData) messageLiteA2);
                                this.platformData_ = builder5.buildPartial();
                            }
                            this.platformDataCase_ = 21;
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
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
