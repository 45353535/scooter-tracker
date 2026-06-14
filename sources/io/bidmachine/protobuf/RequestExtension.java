package io.bidmachine.protobuf;

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
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class RequestExtension extends h0 implements RequestExtensionOrBuilder {
    public static final int BM_IFV_FIELD_NUMBER = 5;
    public static final int HEADER_BIDDING_TYPE_FIELD_NUMBER = 3;
    public static final int IFV_FIELD_NUMBER = 4;
    public static final int INTEGRATION_TYPE_FIELD_NUMBER = 7;
    public static final int SELLER_DATA_FIELD_NUMBER = 2;
    public static final int SELLER_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object bmIfv_;
    private int headerBiddingType_;
    private volatile Object ifv_;
    private volatile Object integrationType_;
    private byte memoizedIsInitialized;
    private w0 sellerData_;
    private volatile Object sellerId_;
    private volatile Object sessionId_;
    private static final RequestExtension DEFAULT_INSTANCE = new RequestExtension();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.RequestExtension.1
        @Override // com.explorestack.protobuf.p1
        public RequestExtension parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new RequestExtension(lVar, wVar);
        }
    };

    private static final class SellerDataDefaultEntryHolder {
        static final u0 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_SellerDataEntry_descriptor;
            z2.b bVar = z2.b.f19481l;
            defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
        }

        private SellerDataDefaultEntryHolder() {
        }
    }

    public static RequestExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetSellerData() {
        w0 w0Var = this.sellerData_;
        return w0Var == null ? w0.g(SellerDataDefaultEntryHolder.defaultEntry) : w0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RequestExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestExtension) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public boolean containsSellerData(String str) {
        str.getClass();
        return internalGetSellerData().i().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestExtension)) {
            return super.equals(obj);
        }
        RequestExtension requestExtension = (RequestExtension) obj;
        return getSellerId().equals(requestExtension.getSellerId()) && internalGetSellerData().equals(requestExtension.internalGetSellerData()) && this.headerBiddingType_ == requestExtension.headerBiddingType_ && getIfv().equals(requestExtension.getIfv()) && getBmIfv().equals(requestExtension.getBmIfv()) && getSessionId().equals(requestExtension.getSessionId()) && getIntegrationType().equals(requestExtension.getIntegrationType()) && this.unknownFields.equals(requestExtension.unknownFields);
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public HeaderBiddingType getHeaderBiddingType() {
        HeaderBiddingType headerBiddingTypeValueOf = HeaderBiddingType.valueOf(this.headerBiddingType_);
        return headerBiddingTypeValueOf == null ? HeaderBiddingType.UNRECOGNIZED : headerBiddingTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public int getHeaderBiddingTypeValue() {
        return this.headerBiddingType_;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getIntegrationType() {
        Object obj = this.integrationType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.integrationType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getIntegrationTypeBytes() {
        Object obj = this.integrationType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.integrationType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    @Deprecated
    public Map<String, String> getSellerData() {
        return getSellerDataMap();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public int getSellerDataCount() {
        return internalGetSellerData().i().size();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public Map<String, String> getSellerDataMap() {
        return internalGetSellerData().i();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSellerDataOrDefault(String str, String str2) {
        str.getClass();
        Map mapI = internalGetSellerData().i();
        return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSellerDataOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetSellerData().i();
        if (mapI.containsKey(str)) {
            return (String) mapI.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSellerId() {
        Object obj = this.sellerId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sellerId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
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
        for (Map.Entry entry : internalGetSellerData().i().entrySet()) {
            iComputeStringSize += n.G(2, SellerDataDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
        if (this.headerBiddingType_ != HeaderBiddingType.HEADER_BIDDING_TYPE_INVALID.getNumber()) {
            iComputeStringSize += n.l(3, this.headerBiddingType_);
        }
        if (!getIfvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(5, this.bmIfv_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(6, this.sessionId_);
        }
        if (!getIntegrationTypeBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(7, this.integrationType_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
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

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSellerId().hashCode();
        if (!internalGetSellerData().i().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetSellerData().hashCode();
        }
        int iHashCode2 = (((((((((((((((((((((iHashCode * 37) + 3) * 53) + this.headerBiddingType_) * 37) + 4) * 53) + getIfv().hashCode()) * 37) + 5) * 53) + getBmIfv().hashCode()) * 37) + 6) * 53) + getSessionId().hashCode()) * 37) + 7) * 53) + getIntegrationType().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_fieldAccessorTable.d(RequestExtension.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.h0
    protected w0 internalGetMapField(int i10) {
        if (i10 == 2) {
            return internalGetSellerData();
        }
        throw new RuntimeException("Invalid map field number: " + i10);
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
        return new RequestExtension();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getSellerIdBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.sellerId_);
        }
        h0.serializeStringMapTo(nVar, internalGetSellerData(), SellerDataDefaultEntryHolder.defaultEntry, 2);
        if (this.headerBiddingType_ != HeaderBiddingType.HEADER_BIDDING_TYPE_INVALID.getNumber()) {
            nVar.v0(3, this.headerBiddingType_);
        }
        if (!getIfvBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            h0.writeString(nVar, 5, this.bmIfv_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            h0.writeString(nVar, 6, this.sessionId_);
        }
        if (!getIntegrationTypeBytes().isEmpty()) {
            h0.writeString(nVar, 7, this.integrationType_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements RequestExtensionOrBuilder {
        private int bitField0_;
        private Object bmIfv_;
        private int headerBiddingType_;
        private Object ifv_;
        private Object integrationType_;
        private w0 sellerData_;
        private Object sellerId_;
        private Object sessionId_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
        }

        private w0 internalGetMutableSellerData() {
            onChanged();
            if (this.sellerData_ == null) {
                this.sellerData_ = w0.p(SellerDataDefaultEntryHolder.defaultEntry);
            }
            if (!this.sellerData_.m()) {
                this.sellerData_ = this.sellerData_.f();
            }
            return this.sellerData_;
        }

        private w0 internalGetSellerData() {
            w0 w0Var = this.sellerData_;
            return w0Var == null ? w0.g(SellerDataDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = RequestExtension.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearHeaderBiddingType() {
            this.headerBiddingType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = RequestExtension.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearIntegrationType() {
            this.integrationType_ = RequestExtension.getDefaultInstance().getIntegrationType();
            onChanged();
            return this;
        }

        public Builder clearSellerData() {
            internalGetMutableSellerData().l().clear();
            return this;
        }

        public Builder clearSellerId() {
            this.sellerId_ = RequestExtension.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = RequestExtension.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public boolean containsSellerData(String str) {
            str.getClass();
            return internalGetSellerData().i().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public HeaderBiddingType getHeaderBiddingType() {
            HeaderBiddingType headerBiddingTypeValueOf = HeaderBiddingType.valueOf(this.headerBiddingType_);
            return headerBiddingTypeValueOf == null ? HeaderBiddingType.UNRECOGNIZED : headerBiddingTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public int getHeaderBiddingTypeValue() {
            return this.headerBiddingType_;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getIntegrationType() {
            Object obj = this.integrationType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.integrationType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getIntegrationTypeBytes() {
            Object obj = this.integrationType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.integrationType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Deprecated
        public Map<String, String> getMutableSellerData() {
            return internalGetMutableSellerData().l();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        @Deprecated
        public Map<String, String> getSellerData() {
            return getSellerDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public int getSellerDataCount() {
            return internalGetSellerData().i().size();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public Map<String, String> getSellerDataMap() {
            return internalGetSellerData().i();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSellerDataOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetSellerData().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSellerDataOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetSellerData().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSellerId() {
            Object obj = this.sellerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sellerId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getSellerIdBytes() {
            Object obj = this.sellerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sellerId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_fieldAccessorTable.d(RequestExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetSellerData();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMutableMapField(int i10) {
            if (i10 == 2) {
                return internalGetMutableSellerData();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllSellerData(Map<String, String> map) {
            internalGetMutableSellerData().l().putAll(map);
            return this;
        }

        public Builder putSellerData(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableSellerData().l().put(str, str2);
            return this;
        }

        public Builder removeSellerData(String str) {
            str.getClass();
            internalGetMutableSellerData().l().remove(str);
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

        public Builder setHeaderBiddingType(HeaderBiddingType headerBiddingType) {
            headerBiddingType.getClass();
            this.headerBiddingType_ = headerBiddingType.getNumber();
            onChanged();
            return this;
        }

        public Builder setHeaderBiddingTypeValue(int i10) {
            this.headerBiddingType_ = i10;
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

        public Builder setIntegrationType(String str) {
            str.getClass();
            this.integrationType_ = str;
            onChanged();
            return this;
        }

        public Builder setIntegrationTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.integrationType_ = byteString;
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
            this.sellerId_ = "";
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            this.integrationType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestExtension build() {
            RequestExtension requestExtensionBuildPartial = buildPartial();
            if (requestExtensionBuildPartial.isInitialized()) {
                return requestExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestExtension buildPartial() {
            RequestExtension requestExtension = new RequestExtension(this);
            requestExtension.sellerId_ = this.sellerId_;
            requestExtension.sellerData_ = internalGetSellerData();
            requestExtension.sellerData_.n();
            requestExtension.headerBiddingType_ = this.headerBiddingType_;
            requestExtension.ifv_ = this.ifv_;
            requestExtension.bmIfv_ = this.bmIfv_;
            requestExtension.sessionId_ = this.sessionId_;
            requestExtension.integrationType_ = this.integrationType_;
            onBuilt();
            return requestExtension;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public RequestExtension getDefaultInstanceForType() {
            return RequestExtension.getDefaultInstance();
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
            internalGetMutableSellerData().a();
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            this.integrationType_ = "";
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RequestExtension) {
                return mergeFrom((RequestExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestExtension requestExtension) {
            if (requestExtension == RequestExtension.getDefaultInstance()) {
                return this;
            }
            if (!requestExtension.getSellerId().isEmpty()) {
                this.sellerId_ = requestExtension.sellerId_;
                onChanged();
            }
            internalGetMutableSellerData().o(requestExtension.internalGetSellerData());
            if (requestExtension.headerBiddingType_ != 0) {
                setHeaderBiddingTypeValue(requestExtension.getHeaderBiddingTypeValue());
            }
            if (!requestExtension.getIfv().isEmpty()) {
                this.ifv_ = requestExtension.ifv_;
                onChanged();
            }
            if (!requestExtension.getBmIfv().isEmpty()) {
                this.bmIfv_ = requestExtension.bmIfv_;
                onChanged();
            }
            if (!requestExtension.getSessionId().isEmpty()) {
                this.sessionId_ = requestExtension.sessionId_;
                onChanged();
            }
            if (!requestExtension.getIntegrationType().isEmpty()) {
                this.integrationType_ = requestExtension.integrationType_;
                onChanged();
            }
            mergeUnknownFields(((h0) requestExtension).unknownFields);
            onChanged();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.sellerId_ = "";
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            this.integrationType_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.RequestExtension.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.RequestExtension.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.RequestExtension r3 = (io.bidmachine.protobuf.RequestExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.RequestExtension r4 = (io.bidmachine.protobuf.RequestExtension) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestExtension.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.RequestExtension$Builder");
        }
    }

    public static Builder newBuilder(RequestExtension requestExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestExtension);
    }

    public static RequestExtension parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteBuffer, wVar);
    }

    private RequestExtension(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RequestExtension parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (RequestExtension) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static RequestExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public RequestExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RequestExtension parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private RequestExtension() {
        this.memoizedIsInitialized = (byte) -1;
        this.sellerId_ = "";
        this.headerBiddingType_ = 0;
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.sessionId_ = "";
        this.integrationType_ = "";
    }

    public static RequestExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static RequestExtension parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(bArr, wVar);
    }

    public static RequestExtension parseFrom(InputStream inputStream) throws IOException {
        return (RequestExtension) h0.parseWithIOException(PARSER, inputStream);
    }

    public static RequestExtension parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (RequestExtension) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static RequestExtension parseFrom(l lVar) throws IOException {
        return (RequestExtension) h0.parseWithIOException(PARSER, lVar);
    }

    private RequestExtension(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.sellerId_ = lVar.J();
                            } else if (iK == 18) {
                                if (!z11) {
                                    this.sellerData_ = w0.p(SellerDataDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                u0 u0Var = (u0) lVar.A(SellerDataDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                this.sellerData_.l().put(u0Var.i(), u0Var.k());
                            } else if (iK == 24) {
                                this.headerBiddingType_ = lVar.t();
                            } else if (iK == 34) {
                                this.ifv_ = lVar.J();
                            } else if (iK == 42) {
                                this.bmIfv_ = lVar.J();
                            } else if (iK == 50) {
                                this.sessionId_ = lVar.J();
                            } else if (iK != 58) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.integrationType_ = lVar.J();
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

    public static RequestExtension parseFrom(l lVar, w wVar) throws IOException {
        return (RequestExtension) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
