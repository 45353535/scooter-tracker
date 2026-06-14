package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class Openrtb extends h0 implements a {
    public static final int DOMAINSPEC_FIELD_NUMBER = 2;
    public static final int DOMAINVER_FIELD_NUMBER = 3;
    public static final int REQUEST_FIELD_NUMBER = 4;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    public static final int VER_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object domainspec_;
    private volatile Object domainver_;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;
    private volatile Object ver_;
    private static final Openrtb DEFAULT_INSTANCE = new Openrtb();
    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Openrtb.1
        @Override // com.explorestack.protobuf.p1
        public Openrtb parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Openrtb(lVar, wVar);
        }
    };

    /* JADX INFO: renamed from: com.explorestack.protobuf.openrtb.Openrtb$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase = iArr;
            try {
                iArr[PayloadCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum PayloadCase implements j0.c {
        REQUEST(4),
        RESPONSE(5),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 4) {
                return REQUEST;
            }
            if (i10 != 5) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Openrtb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f19279a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Openrtb) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Openrtb)) {
            return super.equals(obj);
        }
        Openrtb openrtb = (Openrtb) obj;
        if (!getVer().equals(openrtb.getVer()) || !getDomainspec().equals(openrtb.getDomainspec()) || !getDomainver().equals(openrtb.getDomainver()) || !getPayloadCase().equals(openrtb.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 4) {
            if (i10 == 5 && !getResponse().equals(openrtb.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(openrtb.getRequest())) {
            return false;
        }
        return this.unknownFields.equals(openrtb.unknownFields);
    }

    public String getDomainspec() {
        Object obj = this.domainspec_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainspec_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainspecBytes() {
        Object obj = this.domainspec_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainspec_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getDomainver() {
        Object obj = this.domainver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainverBytes() {
        Object obj = this.domainver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    public Request getRequest() {
        return this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
    }

    public c getRequestOrBuilder() {
        return this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
    }

    public Response getResponse() {
        return this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
    }

    public d getResponseOrBuilder() {
        return this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getVerBytes().isEmpty() ? h0.computeStringSize(1, this.ver_) : 0;
        if (!getDomainspecBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            iComputeStringSize += n.G(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            iComputeStringSize += n.G(5, (Response) this.payload_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public String getVer() {
        Object obj = this.ver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVerBytes() {
        Object obj = this.ver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public boolean hasRequest() {
        return this.payloadCase_ == 4;
    }

    public boolean hasResponse() {
        return this.payloadCase_ == 5;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVer().hashCode()) * 37) + 2) * 53) + getDomainspec().hashCode()) * 37) + 3) * 53) + getDomainver().hashCode();
        int i12 = this.payloadCase_;
        if (i12 != 4) {
            if (i12 == 5) {
                i10 = ((iHashCode2 * 37) + 5) * 53;
                iHashCode = getResponse().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 4) * 53;
        iHashCode = getRequest().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return b.f19280b.d(Openrtb.class, Builder.class);
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
        return new Openrtb();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getVerBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.ver_);
        }
        if (!getDomainspecBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            h0.writeString(nVar, 3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            nVar.J0(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            nVar.J0(5, (Response) this.payload_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements a {
        private Object domainspec_;
        private Object domainver_;
        private int payloadCase_;
        private Object payload_;
        private a2 requestBuilder_;
        private a2 responseBuilder_;
        private Object ver_;

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f19279a;
        }

        private a2 getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 4) {
                    this.payload_ = Request.getDefaultInstance();
                }
                this.requestBuilder_ = new a2((Request) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 4;
            onChanged();
            return this.requestBuilder_;
        }

        private a2 getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 5) {
                    this.payload_ = Response.getDefaultInstance();
                }
                this.responseBuilder_ = new a2((Response) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 5;
            onChanged();
            return this.responseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearDomainspec() {
            this.domainspec_ = Openrtb.getDefaultInstance().getDomainspec();
            onChanged();
            return this;
        }

        public Builder clearDomainver() {
            this.domainver_ = Openrtb.getDefaultInstance().getDomainver();
            onChanged();
            return this;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequest() {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 4) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearResponse() {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 5) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearVer() {
            this.ver_ = Openrtb.getDefaultInstance().getVer();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f19279a;
        }

        public String getDomainspec() {
            Object obj = this.domainspec_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainspec_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDomainspecBytes() {
            Object obj = this.domainspec_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainspec_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getDomainver() {
            Object obj = this.domainver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDomainverBytes() {
            Object obj = this.domainver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        public Request getRequest() {
            a2 a2Var = this.requestBuilder_;
            return a2Var == null ? this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance() : this.payloadCase_ == 4 ? (Request) a2Var.e() : Request.getDefaultInstance();
        }

        public Request.Builder getRequestBuilder() {
            return (Request.Builder) getRequestFieldBuilder().d();
        }

        public c getRequestOrBuilder() {
            a2 a2Var;
            int i10 = this.payloadCase_;
            return (i10 != 4 || (a2Var = this.requestBuilder_) == null) ? i10 == 4 ? (Request) this.payload_ : Request.getDefaultInstance() : (c) a2Var.f();
        }

        public Response getResponse() {
            a2 a2Var = this.responseBuilder_;
            return a2Var == null ? this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance() : this.payloadCase_ == 5 ? (Response) a2Var.e() : Response.getDefaultInstance();
        }

        public Response.Builder getResponseBuilder() {
            return (Response.Builder) getResponseFieldBuilder().d();
        }

        public d getResponseOrBuilder() {
            a2 a2Var;
            int i10 = this.payloadCase_;
            return (i10 != 5 || (a2Var = this.responseBuilder_) == null) ? i10 == 5 ? (Response) this.payload_ : Response.getDefaultInstance() : (d) a2Var.f();
        }

        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean hasRequest() {
            return this.payloadCase_ == 4;
        }

        public boolean hasResponse() {
            return this.payloadCase_ == 5;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return b.f19280b.d(Openrtb.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeRequest(Request request) {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ != 4 || this.payload_ == Request.getDefaultInstance()) {
                    this.payload_ = request;
                } else {
                    this.payload_ = Request.newBuilder((Request) this.payload_).mergeFrom(request).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 4) {
                    a2Var.g(request);
                }
                this.requestBuilder_.i(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder mergeResponse(Response response) {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ != 5 || this.payload_ == Response.getDefaultInstance()) {
                    this.payload_ = response;
                } else {
                    this.payload_ = Response.newBuilder((Response) this.payload_).mergeFrom(response).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 5) {
                    a2Var.g(response);
                }
                this.responseBuilder_.i(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setDomainspec(String str) {
            str.getClass();
            this.domainspec_ = str;
            onChanged();
            return this;
        }

        public Builder setDomainspecBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.domainspec_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDomainver(String str) {
            str.getClass();
            this.domainver_ = str;
            onChanged();
            return this;
        }

        public Builder setDomainverBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.domainver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setRequest(Request request) {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                request.getClass();
                this.payload_ = request;
                onChanged();
            } else {
                a2Var.i(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setResponse(Response response) {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                response.getClass();
                this.payload_ = response;
                onChanged();
            } else {
                a2Var.i(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setVer(String str) {
            str.getClass();
            this.ver_ = str;
            onChanged();
            return this;
        }

        public Builder setVerBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.ver_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb build() {
            Openrtb openrtbBuildPartial = buildPartial();
            if (openrtbBuildPartial.isInitialized()) {
                return openrtbBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) openrtbBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb buildPartial() {
            Openrtb openrtb = new Openrtb(this);
            openrtb.ver_ = this.ver_;
            openrtb.domainspec_ = this.domainspec_;
            openrtb.domainver_ = this.domainver_;
            if (this.payloadCase_ == 4) {
                a2 a2Var = this.requestBuilder_;
                if (a2Var == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = a2Var.a();
                }
            }
            if (this.payloadCase_ == 5) {
                a2 a2Var2 = this.responseBuilder_;
                if (a2Var2 == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = a2Var2.a();
                }
            }
            openrtb.payloadCase_ = this.payloadCase_;
            onBuilt();
            return openrtb;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Openrtb getDefaultInstanceForType() {
            return Openrtb.getDefaultInstance();
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
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Openrtb) {
                return mergeFrom((Openrtb) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.payloadCase_ = 5;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(Openrtb openrtb) {
            if (openrtb == Openrtb.getDefaultInstance()) {
                return this;
            }
            if (!openrtb.getVer().isEmpty()) {
                this.ver_ = openrtb.ver_;
                onChanged();
            }
            if (!openrtb.getDomainspec().isEmpty()) {
                this.domainspec_ = openrtb.domainspec_;
                onChanged();
            }
            if (!openrtb.getDomainver().isEmpty()) {
                this.domainver_ = openrtb.domainver_;
                onChanged();
            }
            int i10 = AnonymousClass2.$SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[openrtb.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeRequest(openrtb.getRequest());
            } else if (i10 == 2) {
                mergeResponse(openrtb.getResponse());
            }
            mergeUnknownFields(((h0) openrtb).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.openrtb.Openrtb.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Openrtb.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.openrtb.Openrtb r3 = (com.explorestack.protobuf.openrtb.Openrtb) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.openrtb.Openrtb r4 = (com.explorestack.protobuf.openrtb.Openrtb) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Openrtb.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Openrtb$Builder");
        }
    }

    public static Builder newBuilder(Openrtb openrtb) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(openrtb);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Openrtb(h0.b bVar) {
        super(bVar);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Openrtb) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Openrtb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Openrtb getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Openrtb parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Openrtb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private Openrtb() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.ver_ = "";
        this.domainspec_ = "";
        this.domainver_ = "";
    }

    public static Openrtb parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(bArr, wVar);
    }

    public static Openrtb parseFrom(InputStream inputStream) throws IOException {
        return (Openrtb) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Openrtb) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Openrtb parseFrom(l lVar) throws IOException {
        return (Openrtb) h0.parseWithIOException(PARSER, lVar);
    }

    private Openrtb(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.ver_ = lVar.J();
                            } else if (iK == 18) {
                                this.domainspec_ = lVar.J();
                            } else if (iK != 26) {
                                if (iK == 34) {
                                    Request.Builder builder = this.payloadCase_ == 4 ? ((Request) this.payload_).toBuilder() : null;
                                    MessageLite messageLiteA = lVar.A(Request.parser(), wVar);
                                    this.payload_ = messageLiteA;
                                    if (builder != null) {
                                        builder.mergeFrom((Request) messageLiteA);
                                        this.payload_ = builder.buildPartial();
                                    }
                                    this.payloadCase_ = 4;
                                } else if (iK != 42) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Response.Builder builder2 = this.payloadCase_ == 5 ? ((Response) this.payload_).toBuilder() : null;
                                    MessageLite messageLiteA2 = lVar.A(Response.parser(), wVar);
                                    this.payload_ = messageLiteA2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Response) messageLiteA2);
                                        this.payload_ = builder2.buildPartial();
                                    }
                                    this.payloadCase_ = 5;
                                }
                            } else {
                                this.domainver_ = lVar.J();
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
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

    public static Openrtb parseFrom(l lVar, w wVar) throws IOException {
        return (Openrtb) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
