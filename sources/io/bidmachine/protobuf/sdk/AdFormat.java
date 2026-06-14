package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class AdFormat extends h0 implements AdFormatOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int INTERSTITIAL_FIELD_NUMBER = 4;
    public static final int NATIVE_FIELD_NUMBER = 2;
    public static final int REWARDED_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int specCase_;
    private Object spec_;
    private static final AdFormat DEFAULT_INSTANCE = new AdFormat();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AdFormat.1
        @Override // com.explorestack.protobuf.p1
        public AdFormat parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new AdFormat(lVar, wVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.AdFormat$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase;

        static {
            int[] iArr = new int[SpecCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase = iArr;
            try {
                iArr[SpecCase.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.INTERSTITIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.SPEC_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class Banner extends h0 implements BannerOrBuilder {
        public static final int HEIGHT_FIELD_NUMBER = 2;
        public static final int IS_ADAPTIVE_FIELD_NUMBER = 3;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int height_;
        private boolean isAdaptive_;
        private byte memoizedIsInitialized;
        private int width_;
        private static final Banner DEFAULT_INSTANCE = new Banner();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Banner.1
            @Override // com.explorestack.protobuf.p1
            public Banner parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Banner(lVar, wVar);
            }
        };

        public static Banner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Banner) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return super.equals(obj);
            }
            Banner banner = (Banner) obj;
            return getWidth() == banner.getWidth() && getHeight() == banner.getHeight() && getIsAdaptive() == banner.getIsAdaptive() && this.unknownFields.equals(banner.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public boolean getIsAdaptive() {
            return this.isAdaptive_;
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
            int i11 = this.width_;
            int iY = i11 != 0 ? n.Y(1, i11) : 0;
            int i12 = this.height_;
            if (i12 != 0) {
                iY += n.Y(2, i12);
            }
            boolean z10 = this.isAdaptive_;
            if (z10) {
                iY += n.e(3, z10);
            }
            int serializedSize = iY + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getWidth()) * 37) + 2) * 53) + getHeight()) * 37) + 3) * 53) + j0.d(getIsAdaptive())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_fieldAccessorTable.d(Banner.class, Builder.class);
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
            return new Banner();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            int i10 = this.width_;
            if (i10 != 0) {
                nVar.W0(1, i10);
            }
            int i11 = this.height_;
            if (i11 != 0) {
                nVar.W0(2, i11);
            }
            boolean z10 = this.isAdaptive_;
            if (z10) {
                nVar.n0(3, z10);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements BannerOrBuilder {
            private int height_;
            private boolean isAdaptive_;
            private int width_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsAdaptive() {
                this.isAdaptive_ = false;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public boolean getIsAdaptive() {
                return this.isAdaptive_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_fieldAccessorTable.d(Banner.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            public Builder setIsAdaptive(boolean z10) {
                this.isAdaptive_ = z10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
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
            public Banner build() {
                Banner bannerBuildPartial = buildPartial();
                if (bannerBuildPartial.isInitialized()) {
                    return bannerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bannerBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Banner buildPartial() {
                Banner banner = new Banner(this);
                banner.width_ = this.width_;
                banner.height_ = this.height_;
                banner.isAdaptive_ = this.isAdaptive_;
                onBuilt();
                return banner;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Banner getDefaultInstanceForType() {
                return Banner.getDefaultInstance();
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
                this.width_ = 0;
                this.height_ = 0;
                this.isAdaptive_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Banner) {
                    return mergeFrom((Banner) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Banner banner) {
                if (banner == Banner.getDefaultInstance()) {
                    return this;
                }
                if (banner.getWidth() != 0) {
                    setWidth(banner.getWidth());
                }
                if (banner.getHeight() != 0) {
                    setHeight(banner.getHeight());
                }
                if (banner.getIsAdaptive()) {
                    setIsAdaptive(banner.getIsAdaptive());
                }
                mergeUnknownFields(((h0) banner).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AdFormat.Banner.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AdFormat.Banner.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AdFormat$Banner r3 = (io.bidmachine.protobuf.sdk.AdFormat.Banner) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.AdFormat$Banner r4 = (io.bidmachine.protobuf.sdk.AdFormat.Banner) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AdFormat.Banner.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AdFormat$Banner$Builder");
            }
        }

        public static Builder newBuilder(Banner banner) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
        }

        public static Banner parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Banner(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Banner parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Banner) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Banner getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Banner parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Banner() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Banner parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(bArr, wVar);
        }

        private Banner(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.width_ = lVar.L();
                            } else if (iK == 16) {
                                this.height_ = lVar.L();
                            } else if (iK != 24) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.isAdaptive_ = lVar.q();
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

        public static Banner parseFrom(InputStream inputStream) throws IOException {
            return (Banner) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Banner parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Banner) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Banner parseFrom(l lVar) throws IOException {
            return (Banner) h0.parseWithIOException(PARSER, lVar);
        }

        public static Banner parseFrom(l lVar, w wVar) throws IOException {
            return (Banner) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface BannerOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        int getHeight();

        boolean getIsAdaptive();

        int getWidth();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Interstitial extends h0 implements InterstitialOrBuilder {
        public static final int HAS_BANNER_FIELD_NUMBER = 1;
        public static final int HAS_VIDEO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean hasBanner_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Interstitial DEFAULT_INSTANCE = new Interstitial();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Interstitial.1
            @Override // com.explorestack.protobuf.p1
            public Interstitial parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Interstitial(lVar, wVar);
            }
        };

        public static Interstitial getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Interstitial parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Interstitial) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Interstitial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Interstitial)) {
                return super.equals(obj);
            }
            Interstitial interstitial = (Interstitial) obj;
            return getHasBanner() == interstitial.getHasBanner() && getHasVideo() == interstitial.getHasVideo() && this.unknownFields.equals(interstitial.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
        public boolean getHasBanner() {
            return this.hasBanner_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            boolean z10 = this.hasBanner_;
            int iE = z10 ? n.e(1, z10) : 0;
            boolean z11 = this.hasVideo_;
            if (z11) {
                iE += n.e(2, z11);
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getHasBanner())) * 37) + 2) * 53) + j0.d(getHasVideo())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_fieldAccessorTable.d(Interstitial.class, Builder.class);
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
            return new Interstitial();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            boolean z10 = this.hasBanner_;
            if (z10) {
                nVar.n0(1, z10);
            }
            boolean z11 = this.hasVideo_;
            if (z11) {
                nVar.n0(2, z11);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements InterstitialOrBuilder {
            private boolean hasBanner_;
            private boolean hasVideo_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearHasBanner() {
                this.hasBanner_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
            public boolean getHasBanner() {
                return this.hasBanner_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_fieldAccessorTable.d(Interstitial.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setHasBanner(boolean z10) {
                this.hasBanner_ = z10;
                onChanged();
                return this;
            }

            public Builder setHasVideo(boolean z10) {
                this.hasVideo_ = z10;
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
            public Interstitial build() {
                Interstitial interstitialBuildPartial = buildPartial();
                if (interstitialBuildPartial.isInitialized()) {
                    return interstitialBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) interstitialBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Interstitial buildPartial() {
                Interstitial interstitial = new Interstitial(this);
                interstitial.hasBanner_ = this.hasBanner_;
                interstitial.hasVideo_ = this.hasVideo_;
                onBuilt();
                return interstitial;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Interstitial getDefaultInstanceForType() {
                return Interstitial.getDefaultInstance();
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
                this.hasBanner_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Interstitial) {
                    return mergeFrom((Interstitial) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Interstitial interstitial) {
                if (interstitial == Interstitial.getDefaultInstance()) {
                    return this;
                }
                if (interstitial.getHasBanner()) {
                    setHasBanner(interstitial.getHasBanner());
                }
                if (interstitial.getHasVideo()) {
                    setHasVideo(interstitial.getHasVideo());
                }
                mergeUnknownFields(((h0) interstitial).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AdFormat.Interstitial.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AdFormat.Interstitial.access$3600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AdFormat$Interstitial r3 = (io.bidmachine.protobuf.sdk.AdFormat.Interstitial) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.AdFormat$Interstitial r4 = (io.bidmachine.protobuf.sdk.AdFormat.Interstitial) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AdFormat.Interstitial.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AdFormat$Interstitial$Builder");
            }
        }

        public static Builder newBuilder(Interstitial interstitial) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(interstitial);
        }

        public static Interstitial parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Interstitial(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Interstitial parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Interstitial) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Interstitial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Interstitial getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Interstitial parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Interstitial() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Interstitial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Interstitial parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(bArr, wVar);
        }

        private Interstitial(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.hasBanner_ = lVar.q();
                            } else if (iK != 16) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.hasVideo_ = lVar.q();
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

        public static Interstitial parseFrom(InputStream inputStream) throws IOException {
            return (Interstitial) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Interstitial parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Interstitial) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Interstitial parseFrom(l lVar) throws IOException {
            return (Interstitial) h0.parseWithIOException(PARSER, lVar);
        }

        public static Interstitial parseFrom(l lVar, w wVar) throws IOException {
            return (Interstitial) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface InterstitialOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        boolean getHasBanner();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Native extends h0 implements NativeOrBuilder {
        public static final int HAS_ICON_FIELD_NUMBER = 1;
        public static final int HAS_IMAGE_FIELD_NUMBER = 2;
        public static final int HAS_VIDEO_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private boolean hasIcon_;
        private boolean hasImage_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Native DEFAULT_INSTANCE = new Native();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Native.1
            @Override // com.explorestack.protobuf.p1
            public Native parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Native(lVar, wVar);
            }
        };

        public static Native getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Native) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Native)) {
                return super.equals(obj);
            }
            Native r52 = (Native) obj;
            return getHasIcon() == r52.getHasIcon() && getHasImage() == r52.getHasImage() && getHasVideo() == r52.getHasVideo() && this.unknownFields.equals(r52.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasIcon() {
            return this.hasIcon_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasImage() {
            return this.hasImage_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            boolean z10 = this.hasIcon_;
            int iE = z10 ? n.e(1, z10) : 0;
            boolean z11 = this.hasImage_;
            if (z11) {
                iE += n.e(2, z11);
            }
            boolean z12 = this.hasVideo_;
            if (z12) {
                iE += n.e(3, z12);
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
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getHasIcon())) * 37) + 2) * 53) + j0.d(getHasImage())) * 37) + 3) * 53) + j0.d(getHasVideo())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_fieldAccessorTable.d(Native.class, Builder.class);
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
            return new Native();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            boolean z10 = this.hasIcon_;
            if (z10) {
                nVar.n0(1, z10);
            }
            boolean z11 = this.hasImage_;
            if (z11) {
                nVar.n0(2, z11);
            }
            boolean z12 = this.hasVideo_;
            if (z12) {
                nVar.n0(3, z12);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements NativeOrBuilder {
            private boolean hasIcon_;
            private boolean hasImage_;
            private boolean hasVideo_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearHasIcon() {
                this.hasIcon_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasImage() {
                this.hasImage_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasIcon() {
                return this.hasIcon_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasImage() {
                return this.hasImage_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_fieldAccessorTable.d(Native.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setHasIcon(boolean z10) {
                this.hasIcon_ = z10;
                onChanged();
                return this;
            }

            public Builder setHasImage(boolean z10) {
                this.hasImage_ = z10;
                onChanged();
                return this;
            }

            public Builder setHasVideo(boolean z10) {
                this.hasVideo_ = z10;
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
            public Native build() {
                Native nativeBuildPartial = buildPartial();
                if (nativeBuildPartial.isInitialized()) {
                    return nativeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Native buildPartial() {
                Native r02 = new Native(this);
                r02.hasIcon_ = this.hasIcon_;
                r02.hasImage_ = this.hasImage_;
                r02.hasVideo_ = this.hasVideo_;
                onBuilt();
                return r02;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Native getDefaultInstanceForType() {
                return Native.getDefaultInstance();
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
                this.hasIcon_ = false;
                this.hasImage_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Native) {
                    return mergeFrom((Native) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Native r22) {
                if (r22 == Native.getDefaultInstance()) {
                    return this;
                }
                if (r22.getHasIcon()) {
                    setHasIcon(r22.getHasIcon());
                }
                if (r22.getHasImage()) {
                    setHasImage(r22.getHasImage());
                }
                if (r22.getHasVideo()) {
                    setHasVideo(r22.getHasVideo());
                }
                mergeUnknownFields(((h0) r22).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AdFormat.Native.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AdFormat.Native.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AdFormat$Native r3 = (io.bidmachine.protobuf.sdk.AdFormat.Native) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.AdFormat$Native r4 = (io.bidmachine.protobuf.sdk.AdFormat.Native) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AdFormat.Native.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AdFormat$Native$Builder");
            }
        }

        public static Builder newBuilder(Native r12) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(r12);
        }

        public static Native parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Native(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Native parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Native) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Native getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Native parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Native() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Native parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(bArr, wVar);
        }

        private Native(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.hasIcon_ = lVar.q();
                            } else if (iK == 16) {
                                this.hasImage_ = lVar.q();
                            } else if (iK != 24) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.hasVideo_ = lVar.q();
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

        public static Native parseFrom(InputStream inputStream) throws IOException {
            return (Native) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Native parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Native) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Native parseFrom(l lVar) throws IOException {
            return (Native) h0.parseWithIOException(PARSER, lVar);
        }

        public static Native parseFrom(l lVar, w wVar) throws IOException {
            return (Native) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface NativeOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        boolean getHasIcon();

        boolean getHasImage();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Rewarded extends h0 implements RewardedOrBuilder {
        public static final int HAS_BANNER_FIELD_NUMBER = 1;
        public static final int HAS_VIDEO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean hasBanner_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Rewarded DEFAULT_INSTANCE = new Rewarded();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Rewarded.1
            @Override // com.explorestack.protobuf.p1
            public Rewarded parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Rewarded(lVar, wVar);
            }
        };

        public static Rewarded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Rewarded parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rewarded) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rewarded parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rewarded)) {
                return super.equals(obj);
            }
            Rewarded rewarded = (Rewarded) obj;
            return getHasBanner() == rewarded.getHasBanner() && getHasVideo() == rewarded.getHasVideo() && this.unknownFields.equals(rewarded.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
        public boolean getHasBanner() {
            return this.hasBanner_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            boolean z10 = this.hasBanner_;
            int iE = z10 ? n.e(1, z10) : 0;
            boolean z11 = this.hasVideo_;
            if (z11) {
                iE += n.e(2, z11);
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getHasBanner())) * 37) + 2) * 53) + j0.d(getHasVideo())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_fieldAccessorTable.d(Rewarded.class, Builder.class);
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
            return new Rewarded();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            boolean z10 = this.hasBanner_;
            if (z10) {
                nVar.n0(1, z10);
            }
            boolean z11 = this.hasVideo_;
            if (z11) {
                nVar.n0(2, z11);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements RewardedOrBuilder {
            private boolean hasBanner_;
            private boolean hasVideo_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearHasBanner() {
                this.hasBanner_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
            public boolean getHasBanner() {
                return this.hasBanner_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_fieldAccessorTable.d(Rewarded.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setHasBanner(boolean z10) {
                this.hasBanner_ = z10;
                onChanged();
                return this;
            }

            public Builder setHasVideo(boolean z10) {
                this.hasVideo_ = z10;
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
            public Rewarded build() {
                Rewarded rewardedBuildPartial = buildPartial();
                if (rewardedBuildPartial.isInitialized()) {
                    return rewardedBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rewardedBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rewarded buildPartial() {
                Rewarded rewarded = new Rewarded(this);
                rewarded.hasBanner_ = this.hasBanner_;
                rewarded.hasVideo_ = this.hasVideo_;
                onBuilt();
                return rewarded;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Rewarded getDefaultInstanceForType() {
                return Rewarded.getDefaultInstance();
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
                this.hasBanner_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Rewarded) {
                    return mergeFrom((Rewarded) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Rewarded rewarded) {
                if (rewarded == Rewarded.getDefaultInstance()) {
                    return this;
                }
                if (rewarded.getHasBanner()) {
                    setHasBanner(rewarded.getHasBanner());
                }
                if (rewarded.getHasVideo()) {
                    setHasVideo(rewarded.getHasVideo());
                }
                mergeUnknownFields(((h0) rewarded).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AdFormat.Rewarded.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AdFormat.Rewarded.access$2700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AdFormat$Rewarded r3 = (io.bidmachine.protobuf.sdk.AdFormat.Rewarded) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.AdFormat$Rewarded r4 = (io.bidmachine.protobuf.sdk.AdFormat.Rewarded) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AdFormat.Rewarded.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AdFormat$Rewarded$Builder");
            }
        }

        public static Builder newBuilder(Rewarded rewarded) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rewarded);
        }

        public static Rewarded parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Rewarded(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rewarded parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Rewarded) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Rewarded parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Rewarded getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Rewarded parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Rewarded() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rewarded parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Rewarded parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(bArr, wVar);
        }

        private Rewarded(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.hasBanner_ = lVar.q();
                            } else if (iK != 16) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.hasVideo_ = lVar.q();
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

        public static Rewarded parseFrom(InputStream inputStream) throws IOException {
            return (Rewarded) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Rewarded parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Rewarded) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Rewarded parseFrom(l lVar) throws IOException {
            return (Rewarded) h0.parseWithIOException(PARSER, lVar);
        }

        public static Rewarded parseFrom(l lVar, w wVar) throws IOException {
            return (Rewarded) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface RewardedOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        boolean getHasBanner();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum SpecCase implements j0.c {
        BANNER(1),
        NATIVE(2),
        REWARDED(3),
        INTERSTITIAL(4),
        SPEC_NOT_SET(0);

        private final int value;

        SpecCase(int i10) {
            this.value = i10;
        }

        public static SpecCase forNumber(int i10) {
            if (i10 == 0) {
                return SPEC_NOT_SET;
            }
            if (i10 == 1) {
                return BANNER;
            }
            if (i10 == 2) {
                return NATIVE;
            }
            if (i10 == 3) {
                return REWARDED;
            }
            if (i10 != 4) {
                return null;
            }
            return INTERSTITIAL;
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static SpecCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static AdFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdFormat) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdFormat)) {
            return super.equals(obj);
        }
        AdFormat adFormat = (AdFormat) obj;
        if (!getSpecCase().equals(adFormat.getSpecCase())) {
            return false;
        }
        int i10 = this.specCase_;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4 && !getInterstitial().equals(adFormat.getInterstitial())) {
                        return false;
                    }
                } else if (!getRewarded().equals(adFormat.getRewarded())) {
                    return false;
                }
            } else if (!getNative().equals(adFormat.getNative())) {
                return false;
            }
        } else if (!getBanner().equals(adFormat.getBanner())) {
            return false;
        }
        return this.unknownFields.equals(adFormat.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Banner getBanner() {
        return this.specCase_ == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public BannerOrBuilder getBannerOrBuilder() {
        return this.specCase_ == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Interstitial getInterstitial() {
        return this.specCase_ == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public InterstitialOrBuilder getInterstitialOrBuilder() {
        return this.specCase_ == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Native getNative() {
        return this.specCase_ == 2 ? (Native) this.spec_ : Native.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public NativeOrBuilder getNativeOrBuilder() {
        return this.specCase_ == 2 ? (Native) this.spec_ : Native.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Rewarded getRewarded() {
        return this.specCase_ == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public RewardedOrBuilder getRewardedOrBuilder() {
        return this.specCase_ == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.specCase_ == 1 ? n.G(1, (Banner) this.spec_) : 0;
        if (this.specCase_ == 2) {
            iG += n.G(2, (Native) this.spec_);
        }
        if (this.specCase_ == 3) {
            iG += n.G(3, (Rewarded) this.spec_);
        }
        if (this.specCase_ == 4) {
            iG += n.G(4, (Interstitial) this.spec_);
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public SpecCase getSpecCase() {
        return SpecCase.forNumber(this.specCase_);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasBanner() {
        return this.specCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasInterstitial() {
        return this.specCase_ == 4;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasNative() {
        return this.specCase_ == 2;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasRewarded() {
        return this.specCase_ == 3;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = 779 + getDescriptor().hashCode();
        int i12 = this.specCase_;
        if (i12 == 1) {
            i10 = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getBanner().hashCode();
        } else if (i12 == 2) {
            i10 = ((iHashCode2 * 37) + 2) * 53;
            iHashCode = getNative().hashCode();
        } else {
            if (i12 != 3) {
                if (i12 == 4) {
                    i10 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getInterstitial().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            i10 = ((iHashCode2 * 37) + 3) * 53;
            iHashCode = getRewarded().hashCode();
        }
        iHashCode2 = i10 + iHashCode;
        int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_fieldAccessorTable.d(AdFormat.class, Builder.class);
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
        return new AdFormat();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.specCase_ == 1) {
            nVar.J0(1, (Banner) this.spec_);
        }
        if (this.specCase_ == 2) {
            nVar.J0(2, (Native) this.spec_);
        }
        if (this.specCase_ == 3) {
            nVar.J0(3, (Rewarded) this.spec_);
        }
        if (this.specCase_ == 4) {
            nVar.J0(4, (Interstitial) this.spec_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements AdFormatOrBuilder {
        private a2 bannerBuilder_;
        private a2 interstitialBuilder_;
        private a2 nativeBuilder_;
        private a2 rewardedBuilder_;
        private int specCase_;
        private Object spec_;

        private a2 getBannerFieldBuilder() {
            if (this.bannerBuilder_ == null) {
                if (this.specCase_ != 1) {
                    this.spec_ = Banner.getDefaultInstance();
                }
                this.bannerBuilder_ = new a2((Banner) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 1;
            onChanged();
            return this.bannerBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
        }

        private a2 getInterstitialFieldBuilder() {
            if (this.interstitialBuilder_ == null) {
                if (this.specCase_ != 4) {
                    this.spec_ = Interstitial.getDefaultInstance();
                }
                this.interstitialBuilder_ = new a2((Interstitial) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 4;
            onChanged();
            return this.interstitialBuilder_;
        }

        private a2 getNativeFieldBuilder() {
            if (this.nativeBuilder_ == null) {
                if (this.specCase_ != 2) {
                    this.spec_ = Native.getDefaultInstance();
                }
                this.nativeBuilder_ = new a2((Native) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 2;
            onChanged();
            return this.nativeBuilder_;
        }

        private a2 getRewardedFieldBuilder() {
            if (this.rewardedBuilder_ == null) {
                if (this.specCase_ != 3) {
                    this.spec_ = Rewarded.getDefaultInstance();
                }
                this.rewardedBuilder_ = new a2((Rewarded) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 3;
            onChanged();
            return this.rewardedBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearBanner() {
            a2 a2Var = this.bannerBuilder_;
            if (a2Var == null) {
                if (this.specCase_ == 1) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.specCase_ == 1) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearInterstitial() {
            a2 a2Var = this.interstitialBuilder_;
            if (a2Var == null) {
                if (this.specCase_ == 4) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.specCase_ == 4) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearNative() {
            a2 a2Var = this.nativeBuilder_;
            if (a2Var == null) {
                if (this.specCase_ == 2) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.specCase_ == 2) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearRewarded() {
            a2 a2Var = this.rewardedBuilder_;
            if (a2Var == null) {
                if (this.specCase_ == 3) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.specCase_ == 3) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearSpec() {
            this.specCase_ = 0;
            this.spec_ = null;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Banner getBanner() {
            a2 a2Var = this.bannerBuilder_;
            return a2Var == null ? this.specCase_ == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance() : this.specCase_ == 1 ? (Banner) a2Var.e() : Banner.getDefaultInstance();
        }

        public Banner.Builder getBannerBuilder() {
            return (Banner.Builder) getBannerFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public BannerOrBuilder getBannerOrBuilder() {
            a2 a2Var;
            int i10 = this.specCase_;
            return (i10 != 1 || (a2Var = this.bannerBuilder_) == null) ? i10 == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance() : (BannerOrBuilder) a2Var.f();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Interstitial getInterstitial() {
            a2 a2Var = this.interstitialBuilder_;
            return a2Var == null ? this.specCase_ == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance() : this.specCase_ == 4 ? (Interstitial) a2Var.e() : Interstitial.getDefaultInstance();
        }

        public Interstitial.Builder getInterstitialBuilder() {
            return (Interstitial.Builder) getInterstitialFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public InterstitialOrBuilder getInterstitialOrBuilder() {
            a2 a2Var;
            int i10 = this.specCase_;
            return (i10 != 4 || (a2Var = this.interstitialBuilder_) == null) ? i10 == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance() : (InterstitialOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Native getNative() {
            a2 a2Var = this.nativeBuilder_;
            return a2Var == null ? this.specCase_ == 2 ? (Native) this.spec_ : Native.getDefaultInstance() : this.specCase_ == 2 ? (Native) a2Var.e() : Native.getDefaultInstance();
        }

        public Native.Builder getNativeBuilder() {
            return (Native.Builder) getNativeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public NativeOrBuilder getNativeOrBuilder() {
            a2 a2Var;
            int i10 = this.specCase_;
            return (i10 != 2 || (a2Var = this.nativeBuilder_) == null) ? i10 == 2 ? (Native) this.spec_ : Native.getDefaultInstance() : (NativeOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Rewarded getRewarded() {
            a2 a2Var = this.rewardedBuilder_;
            return a2Var == null ? this.specCase_ == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance() : this.specCase_ == 3 ? (Rewarded) a2Var.e() : Rewarded.getDefaultInstance();
        }

        public Rewarded.Builder getRewardedBuilder() {
            return (Rewarded.Builder) getRewardedFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public RewardedOrBuilder getRewardedOrBuilder() {
            a2 a2Var;
            int i10 = this.specCase_;
            return (i10 != 3 || (a2Var = this.rewardedBuilder_) == null) ? i10 == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance() : (RewardedOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public SpecCase getSpecCase() {
            return SpecCase.forNumber(this.specCase_);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasBanner() {
            return this.specCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasInterstitial() {
            return this.specCase_ == 4;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasNative() {
            return this.specCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasRewarded() {
            return this.specCase_ == 3;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_fieldAccessorTable.d(AdFormat.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeBanner(Banner banner) {
            a2 a2Var = this.bannerBuilder_;
            if (a2Var == null) {
                if (this.specCase_ != 1 || this.spec_ == Banner.getDefaultInstance()) {
                    this.spec_ = banner;
                } else {
                    this.spec_ = Banner.newBuilder((Banner) this.spec_).mergeFrom(banner).buildPartial();
                }
                onChanged();
            } else {
                if (this.specCase_ == 1) {
                    a2Var.g(banner);
                }
                this.bannerBuilder_.i(banner);
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder mergeInterstitial(Interstitial interstitial) {
            a2 a2Var = this.interstitialBuilder_;
            if (a2Var == null) {
                if (this.specCase_ != 4 || this.spec_ == Interstitial.getDefaultInstance()) {
                    this.spec_ = interstitial;
                } else {
                    this.spec_ = Interstitial.newBuilder((Interstitial) this.spec_).mergeFrom(interstitial).buildPartial();
                }
                onChanged();
            } else {
                if (this.specCase_ == 4) {
                    a2Var.g(interstitial);
                }
                this.interstitialBuilder_.i(interstitial);
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder mergeNative(Native r42) {
            a2 a2Var = this.nativeBuilder_;
            if (a2Var == null) {
                if (this.specCase_ != 2 || this.spec_ == Native.getDefaultInstance()) {
                    this.spec_ = r42;
                } else {
                    this.spec_ = Native.newBuilder((Native) this.spec_).mergeFrom(r42).buildPartial();
                }
                onChanged();
            } else {
                if (this.specCase_ == 2) {
                    a2Var.g(r42);
                }
                this.nativeBuilder_.i(r42);
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder mergeRewarded(Rewarded rewarded) {
            a2 a2Var = this.rewardedBuilder_;
            if (a2Var == null) {
                if (this.specCase_ != 3 || this.spec_ == Rewarded.getDefaultInstance()) {
                    this.spec_ = rewarded;
                } else {
                    this.spec_ = Rewarded.newBuilder((Rewarded) this.spec_).mergeFrom(rewarded).buildPartial();
                }
                onChanged();
            } else {
                if (this.specCase_ == 3) {
                    a2Var.g(rewarded);
                }
                this.rewardedBuilder_.i(rewarded);
            }
            this.specCase_ = 3;
            return this;
        }

        public Builder setBanner(Banner banner) {
            a2 a2Var = this.bannerBuilder_;
            if (a2Var == null) {
                banner.getClass();
                this.spec_ = banner;
                onChanged();
            } else {
                a2Var.i(banner);
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder setInterstitial(Interstitial interstitial) {
            a2 a2Var = this.interstitialBuilder_;
            if (a2Var == null) {
                interstitial.getClass();
                this.spec_ = interstitial;
                onChanged();
            } else {
                a2Var.i(interstitial);
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder setNative(Native r22) {
            a2 a2Var = this.nativeBuilder_;
            if (a2Var == null) {
                r22.getClass();
                this.spec_ = r22;
                onChanged();
            } else {
                a2Var.i(r22);
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder setRewarded(Rewarded rewarded) {
            a2 a2Var = this.rewardedBuilder_;
            if (a2Var == null) {
                rewarded.getClass();
                this.spec_ = rewarded;
                onChanged();
            } else {
                a2Var.i(rewarded);
            }
            this.specCase_ = 3;
            return this;
        }

        private Builder() {
            this.specCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdFormat build() {
            AdFormat adFormatBuildPartial = buildPartial();
            if (adFormatBuildPartial.isInitialized()) {
                return adFormatBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adFormatBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdFormat buildPartial() {
            AdFormat adFormat = new AdFormat(this);
            if (this.specCase_ == 1) {
                a2 a2Var = this.bannerBuilder_;
                if (a2Var == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = a2Var.a();
                }
            }
            if (this.specCase_ == 2) {
                a2 a2Var2 = this.nativeBuilder_;
                if (a2Var2 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = a2Var2.a();
                }
            }
            if (this.specCase_ == 3) {
                a2 a2Var3 = this.rewardedBuilder_;
                if (a2Var3 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = a2Var3.a();
                }
            }
            if (this.specCase_ == 4) {
                a2 a2Var4 = this.interstitialBuilder_;
                if (a2Var4 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = a2Var4.a();
                }
            }
            adFormat.specCase_ = this.specCase_;
            onBuilt();
            return adFormat;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public AdFormat getDefaultInstanceForType() {
            return AdFormat.getDefaultInstance();
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
            this.specCase_ = 0;
            this.spec_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.specCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdFormat) {
                return mergeFrom((AdFormat) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setBanner(Banner.Builder builder) {
            a2 a2Var = this.bannerBuilder_;
            if (a2Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder setInterstitial(Interstitial.Builder builder) {
            a2 a2Var = this.interstitialBuilder_;
            if (a2Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder setNative(Native.Builder builder) {
            a2 a2Var = this.nativeBuilder_;
            if (a2Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder setRewarded(Rewarded.Builder builder) {
            a2 a2Var = this.rewardedBuilder_;
            if (a2Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.specCase_ = 3;
            return this;
        }

        public Builder mergeFrom(AdFormat adFormat) {
            if (adFormat == AdFormat.getDefaultInstance()) {
                return this;
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[adFormat.getSpecCase().ordinal()];
            if (i10 == 1) {
                mergeBanner(adFormat.getBanner());
            } else if (i10 == 2) {
                mergeNative(adFormat.getNative());
            } else if (i10 == 3) {
                mergeRewarded(adFormat.getRewarded());
            } else if (i10 == 4) {
                mergeInterstitial(adFormat.getInterstitial());
            }
            mergeUnknownFields(((h0) adFormat).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.AdFormat.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AdFormat.access$4500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.AdFormat r3 = (io.bidmachine.protobuf.sdk.AdFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.AdFormat r4 = (io.bidmachine.protobuf.sdk.AdFormat) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AdFormat.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AdFormat$Builder");
        }
    }

    public static Builder newBuilder(AdFormat adFormat) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adFormat);
    }

    public static AdFormat parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteBuffer, wVar);
    }

    private AdFormat(h0.b bVar) {
        super(bVar);
        this.specCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdFormat parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (AdFormat) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static AdFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AdFormat getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdFormat parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static AdFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private AdFormat() {
        this.specCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdFormat parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(bArr, wVar);
    }

    public static AdFormat parseFrom(InputStream inputStream) throws IOException {
        return (AdFormat) h0.parseWithIOException(PARSER, inputStream);
    }

    private AdFormat(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            Banner.Builder builder = this.specCase_ == 1 ? ((Banner) this.spec_).toBuilder() : null;
                            MessageLite messageLiteA = lVar.A(Banner.parser(), wVar);
                            this.spec_ = messageLiteA;
                            if (builder != null) {
                                builder.mergeFrom((Banner) messageLiteA);
                                this.spec_ = builder.buildPartial();
                            }
                            this.specCase_ = 1;
                        } else if (iK == 18) {
                            Native.Builder builder2 = this.specCase_ == 2 ? ((Native) this.spec_).toBuilder() : null;
                            MessageLite messageLiteA2 = lVar.A(Native.parser(), wVar);
                            this.spec_ = messageLiteA2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Native) messageLiteA2);
                                this.spec_ = builder2.buildPartial();
                            }
                            this.specCase_ = 2;
                        } else if (iK == 26) {
                            Rewarded.Builder builder3 = this.specCase_ == 3 ? ((Rewarded) this.spec_).toBuilder() : null;
                            MessageLite messageLiteA3 = lVar.A(Rewarded.parser(), wVar);
                            this.spec_ = messageLiteA3;
                            if (builder3 != null) {
                                builder3.mergeFrom((Rewarded) messageLiteA3);
                                this.spec_ = builder3.buildPartial();
                            }
                            this.specCase_ = 3;
                        } else if (iK != 34) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Interstitial.Builder builder4 = this.specCase_ == 4 ? ((Interstitial) this.spec_).toBuilder() : null;
                            MessageLite messageLiteA4 = lVar.A(Interstitial.parser(), wVar);
                            this.spec_ = messageLiteA4;
                            if (builder4 != null) {
                                builder4.mergeFrom((Interstitial) messageLiteA4);
                                this.spec_ = builder4.buildPartial();
                            }
                            this.specCase_ = 4;
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

    public static AdFormat parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (AdFormat) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static AdFormat parseFrom(l lVar) throws IOException {
        return (AdFormat) h0.parseWithIOException(PARSER, lVar);
    }

    public static AdFormat parseFrom(l lVar, w wVar) throws IOException {
        return (AdFormat) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
