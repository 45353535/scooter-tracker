package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.d;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.a;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class ResponsePayload extends h0 implements ResponsePayloadOrBuilder {
    public static final int CACHE_TIME_FIELD_NUMBER = 1;
    private static final ResponsePayload DEFAULT_INSTANCE = new ResponsePayload();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.ResponsePayload.1
        @Override // com.explorestack.protobuf.p1
        public ResponsePayload parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new ResponsePayload(lVar, wVar);
        }
    };
    public static final int REQUEST_ITEM_SPEC_FIELD_NUMBER = 4;
    public static final int RESPONSE_CACHE_FIELD_NUMBER = 3;
    public static final int RESPONSE_CACHE_URL_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Timestamp cacheTime_;
    private byte memoizedIsInitialized;
    private int payloadOneofCase_;
    private Object payloadOneof_;
    private Placement requestItemSpec_;

    /* JADX INFO: renamed from: io.bidmachine.protobuf.ResponsePayload$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase;

        static {
            int[] iArr = new int[PayloadOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase = iArr;
            try {
                iArr[PayloadOneofCase.RESPONSE_CACHE_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[PayloadOneofCase.RESPONSE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[PayloadOneofCase.PAYLOADONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum PayloadOneofCase implements j0.c {
        RESPONSE_CACHE_URL(2),
        RESPONSE_CACHE(3),
        PAYLOADONEOF_NOT_SET(0);

        private final int value;

        PayloadOneofCase(int i10) {
            this.value = i10;
        }

        public static PayloadOneofCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOADONEOF_NOT_SET;
            }
            if (i10 == 2) {
                return RESPONSE_CACHE_URL;
            }
            if (i10 != 3) {
                return null;
            }
            return RESPONSE_CACHE;
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadOneofCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static ResponsePayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponsePayload)) {
            return super.equals(obj);
        }
        ResponsePayload responsePayload = (ResponsePayload) obj;
        if (hasCacheTime() != responsePayload.hasCacheTime()) {
            return false;
        }
        if ((hasCacheTime() && !getCacheTime().equals(responsePayload.getCacheTime())) || hasRequestItemSpec() != responsePayload.hasRequestItemSpec()) {
            return false;
        }
        if ((hasRequestItemSpec() && !getRequestItemSpec().equals(responsePayload.getRequestItemSpec())) || !getPayloadOneofCase().equals(responsePayload.getPayloadOneofCase())) {
            return false;
        }
        int i10 = this.payloadOneofCase_;
        if (i10 != 2) {
            if (i10 == 3 && !getResponseCache().equals(responsePayload.getResponseCache())) {
                return false;
            }
        } else if (!getResponseCacheUrl().equals(responsePayload.getResponseCacheUrl())) {
            return false;
        }
        return this.unknownFields.equals(responsePayload.unknownFields);
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Timestamp getCacheTime() {
        Timestamp timestamp = this.cacheTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public j2 getCacheTimeOrBuilder() {
        return getCacheTime();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public PayloadOneofCase getPayloadOneofCase() {
        return PayloadOneofCase.forNumber(this.payloadOneofCase_);
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Placement getRequestItemSpec() {
        Placement placement = this.requestItemSpec_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public d getRequestItemSpecOrBuilder() {
        return getRequestItemSpec();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Openrtb getResponseCache() {
        return this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public a getResponseCacheOrBuilder() {
        return this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public String getResponseCacheUrl() {
        String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (str instanceof String) {
            return (String) str;
        }
        String stringUtf8 = ((ByteString) str).toStringUtf8();
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public ByteString getResponseCacheUrlBytes() {
        String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (!(str instanceof String)) {
            return (ByteString) str;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = byteStringCopyFromUtf8;
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.cacheTime_ != null ? n.G(1, getCacheTime()) : 0;
        if (this.payloadOneofCase_ == 2) {
            iG += h0.computeStringSize(2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            iG += n.G(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            iG += n.G(4, getRequestItemSpec());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasCacheTime() {
        return this.cacheTime_ != null;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasRequestItemSpec() {
        return this.requestItemSpec_ != null;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasResponseCache() {
        return this.payloadOneofCase_ == 3;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasResponseCacheUrl() {
        return this.payloadOneofCase_ == 2;
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
        if (hasCacheTime()) {
            iHashCode2 = (((iHashCode2 * 37) + 1) * 53) + getCacheTime().hashCode();
        }
        if (hasRequestItemSpec()) {
            iHashCode2 = (((iHashCode2 * 37) + 4) * 53) + getRequestItemSpec().hashCode();
        }
        int i12 = this.payloadOneofCase_;
        if (i12 != 2) {
            if (i12 == 3) {
                i10 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = getResponseCache().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 2) * 53;
        iHashCode = getResponseCacheUrl().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.d(ResponsePayload.class, Builder.class);
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
        return new ResponsePayload();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.cacheTime_ != null) {
            nVar.J0(1, getCacheTime());
        }
        if (this.payloadOneofCase_ == 2) {
            h0.writeString(nVar, 2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            nVar.J0(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            nVar.J0(4, getRequestItemSpec());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements ResponsePayloadOrBuilder {
        private a2 cacheTimeBuilder_;
        private Timestamp cacheTime_;
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private a2 requestItemSpecBuilder_;
        private Placement requestItemSpec_;
        private a2 responseCacheBuilder_;

        private a2 getCacheTimeFieldBuilder() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTimeBuilder_ = new a2(getCacheTime(), getParentForChildren(), isClean());
                this.cacheTime_ = null;
            }
            return this.cacheTimeBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        private a2 getRequestItemSpecFieldBuilder() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpecBuilder_ = new a2(getRequestItemSpec(), getParentForChildren(), isClean());
                this.requestItemSpec_ = null;
            }
            return this.requestItemSpecBuilder_;
        }

        private a2 getResponseCacheFieldBuilder() {
            if (this.responseCacheBuilder_ == null) {
                if (this.payloadOneofCase_ != 3) {
                    this.payloadOneof_ = Openrtb.getDefaultInstance();
                }
                this.responseCacheBuilder_ = new a2((Openrtb) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 3;
            onChanged();
            return this.responseCacheBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearCacheTime() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
                onChanged();
                return this;
            }
            this.cacheTime_ = null;
            this.cacheTimeBuilder_ = null;
            return this;
        }

        public Builder clearPayloadOneof() {
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequestItemSpec() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
                onChanged();
                return this;
            }
            this.requestItemSpec_ = null;
            this.requestItemSpecBuilder_ = null;
            return this;
        }

        public Builder clearResponseCache() {
            a2 a2Var = this.responseCacheBuilder_;
            if (a2Var == null) {
                if (this.payloadOneofCase_ == 3) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadOneofCase_ == 3) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearResponseCacheUrl() {
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Timestamp getCacheTime() {
            a2 a2Var = this.cacheTimeBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getCacheTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getCacheTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public j2 getCacheTimeOrBuilder() {
            a2 a2Var = this.cacheTimeBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Placement getRequestItemSpec() {
            a2 a2Var = this.requestItemSpecBuilder_;
            if (a2Var != null) {
                return (Placement) a2Var.e();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Placement.Builder getRequestItemSpecBuilder() {
            onChanged();
            return (Placement.Builder) getRequestItemSpecFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public d getRequestItemSpecOrBuilder() {
            a2 a2Var = this.requestItemSpecBuilder_;
            if (a2Var != null) {
                return (d) a2Var.f();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Openrtb getResponseCache() {
            a2 a2Var = this.responseCacheBuilder_;
            return a2Var == null ? this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance() : this.payloadOneofCase_ == 3 ? (Openrtb) a2Var.e() : Openrtb.getDefaultInstance();
        }

        public Openrtb.Builder getResponseCacheBuilder() {
            return (Openrtb.Builder) getResponseCacheFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public a getResponseCacheOrBuilder() {
            a2 a2Var;
            int i10 = this.payloadOneofCase_;
            return (i10 != 3 || (a2Var = this.responseCacheBuilder_) == null) ? i10 == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance() : (a) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public String getResponseCacheUrl() {
            String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((ByteString) str).toStringUtf8();
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public ByteString getResponseCacheUrlBytes() {
            String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasCacheTime() {
            return (this.cacheTimeBuilder_ == null && this.cacheTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasRequestItemSpec() {
            return (this.requestItemSpecBuilder_ == null && this.requestItemSpec_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasResponseCache() {
            return this.payloadOneofCase_ == 3;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasResponseCacheUrl() {
            return this.payloadOneofCase_ == 2;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.d(ResponsePayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeCacheTime(Timestamp timestamp) {
            a2 a2Var = this.cacheTimeBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.cacheTime_;
            if (timestamp2 != null) {
                this.cacheTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.cacheTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeRequestItemSpec(Placement placement) {
            a2 a2Var = this.requestItemSpecBuilder_;
            if (a2Var != null) {
                a2Var.g(placement);
                return this;
            }
            Placement placement2 = this.requestItemSpec_;
            if (placement2 != null) {
                this.requestItemSpec_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
            } else {
                this.requestItemSpec_ = placement;
            }
            onChanged();
            return this;
        }

        public Builder mergeResponseCache(Openrtb openrtb) {
            a2 a2Var = this.responseCacheBuilder_;
            if (a2Var == null) {
                if (this.payloadOneofCase_ != 3 || this.payloadOneof_ == Openrtb.getDefaultInstance()) {
                    this.payloadOneof_ = openrtb;
                } else {
                    this.payloadOneof_ = Openrtb.newBuilder((Openrtb) this.payloadOneof_).mergeFrom(openrtb).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 3) {
                    a2Var.g(openrtb);
                }
                this.responseCacheBuilder_.i(openrtb);
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder setCacheTime(Timestamp timestamp) {
            a2 a2Var = this.cacheTimeBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.cacheTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setRequestItemSpec(Placement placement) {
            a2 a2Var = this.requestItemSpecBuilder_;
            if (a2Var != null) {
                a2Var.i(placement);
                return this;
            }
            placement.getClass();
            this.requestItemSpec_ = placement;
            onChanged();
            return this;
        }

        public Builder setResponseCache(Openrtb openrtb) {
            a2 a2Var = this.responseCacheBuilder_;
            if (a2Var == null) {
                openrtb.getClass();
                this.payloadOneof_ = openrtb;
                onChanged();
            } else {
                a2Var.i(openrtb);
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder setResponseCacheUrl(String str) {
            str.getClass();
            this.payloadOneofCase_ = 2;
            this.payloadOneof_ = str;
            onChanged();
            return this;
        }

        public Builder setResponseCacheUrlBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.payloadOneofCase_ = 2;
            this.payloadOneof_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ResponsePayload build() {
            ResponsePayload responsePayloadBuildPartial = buildPartial();
            if (responsePayloadBuildPartial.isInitialized()) {
                return responsePayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) responsePayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ResponsePayload buildPartial() {
            ResponsePayload responsePayload = new ResponsePayload(this);
            a2 a2Var = this.cacheTimeBuilder_;
            if (a2Var == null) {
                responsePayload.cacheTime_ = this.cacheTime_;
            } else {
                responsePayload.cacheTime_ = (Timestamp) a2Var.a();
            }
            a2 a2Var2 = this.requestItemSpecBuilder_;
            if (a2Var2 == null) {
                responsePayload.requestItemSpec_ = this.requestItemSpec_;
            } else {
                responsePayload.requestItemSpec_ = (Placement) a2Var2.a();
            }
            if (this.payloadOneofCase_ == 2) {
                responsePayload.payloadOneof_ = this.payloadOneof_;
            }
            if (this.payloadOneofCase_ == 3) {
                a2 a2Var3 = this.responseCacheBuilder_;
                if (a2Var3 == null) {
                    responsePayload.payloadOneof_ = this.payloadOneof_;
                } else {
                    responsePayload.payloadOneof_ = a2Var3.a();
                }
            }
            responsePayload.payloadOneofCase_ = this.payloadOneofCase_;
            onBuilt();
            return responsePayload;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public ResponsePayload getDefaultInstanceForType() {
            return ResponsePayload.getDefaultInstance();
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
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
            } else {
                this.cacheTime_ = null;
                this.cacheTimeBuilder_ = null;
            }
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
            } else {
                this.requestItemSpec_ = null;
                this.requestItemSpecBuilder_ = null;
            }
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setCacheTime(Timestamp.Builder builder) {
            a2 a2Var = this.cacheTimeBuilder_;
            if (a2Var == null) {
                this.cacheTime_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setRequestItemSpec(Placement.Builder builder) {
            a2 a2Var = this.requestItemSpecBuilder_;
            if (a2Var == null) {
                this.requestItemSpec_ = builder.build();
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
            if (message instanceof ResponsePayload) {
                return mergeFrom((ResponsePayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setResponseCache(Openrtb.Builder builder) {
            a2 a2Var = this.responseCacheBuilder_;
            if (a2Var == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder mergeFrom(ResponsePayload responsePayload) {
            if (responsePayload == ResponsePayload.getDefaultInstance()) {
                return this;
            }
            if (responsePayload.hasCacheTime()) {
                mergeCacheTime(responsePayload.getCacheTime());
            }
            if (responsePayload.hasRequestItemSpec()) {
                mergeRequestItemSpec(responsePayload.getRequestItemSpec());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[responsePayload.getPayloadOneofCase().ordinal()];
            if (i10 == 1) {
                this.payloadOneofCase_ = 2;
                this.payloadOneof_ = responsePayload.payloadOneof_;
                onChanged();
            } else if (i10 == 2) {
                mergeResponseCache(responsePayload.getResponseCache());
            }
            mergeUnknownFields(((h0) responsePayload).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.ResponsePayload.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.ResponsePayload.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.ResponsePayload r3 = (io.bidmachine.protobuf.ResponsePayload) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.ResponsePayload r4 = (io.bidmachine.protobuf.ResponsePayload) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.ResponsePayload.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.ResponsePayload$Builder");
        }
    }

    public static Builder newBuilder(ResponsePayload responsePayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(responsePayload);
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteBuffer, wVar);
    }

    private ResponsePayload(h0.b bVar) {
        super(bVar);
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (ResponsePayload) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static ResponsePayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public ResponsePayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ResponsePayload parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ResponsePayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private ResponsePayload() {
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ResponsePayload parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(bArr, wVar);
    }

    public static ResponsePayload parseFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) h0.parseWithIOException(PARSER, inputStream);
    }

    private ResponsePayload(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            Timestamp timestamp = this.cacheTime_;
                            Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.cacheTime_ = timestamp2;
                            if (builder != null) {
                                builder.mergeFrom(timestamp2);
                                this.cacheTime_ = builder.buildPartial();
                            }
                        } else if (iK == 18) {
                            String strJ = lVar.J();
                            this.payloadOneofCase_ = 2;
                            this.payloadOneof_ = strJ;
                        } else if (iK == 26) {
                            Openrtb.Builder builder2 = this.payloadOneofCase_ == 3 ? ((Openrtb) this.payloadOneof_).toBuilder() : null;
                            MessageLite messageLiteA = lVar.A(Openrtb.parser(), wVar);
                            this.payloadOneof_ = messageLiteA;
                            if (builder2 != null) {
                                builder2.mergeFrom((Openrtb) messageLiteA);
                                this.payloadOneof_ = builder2.buildPartial();
                            }
                            this.payloadOneofCase_ = 3;
                        } else if (iK != 34) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Placement placement = this.requestItemSpec_;
                            Placement.Builder builder3 = placement != null ? placement.toBuilder() : null;
                            Placement placement2 = (Placement) lVar.A(Placement.parser(), wVar);
                            this.requestItemSpec_ = placement2;
                            if (builder3 != null) {
                                builder3.mergeFrom(placement2);
                                this.requestItemSpec_ = builder3.buildPartial();
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

    public static ResponsePayload parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (ResponsePayload) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static ResponsePayload parseFrom(l lVar) throws IOException {
        return (ResponsePayload) h0.parseWithIOException(PARSER, lVar);
    }

    public static ResponsePayload parseFrom(l lVar, w wVar) throws IOException {
        return (ResponsePayload) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
