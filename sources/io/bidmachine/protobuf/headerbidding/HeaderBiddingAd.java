package io.bidmachine.protobuf.headerbidding;

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

/* JADX INFO: loaded from: classes12.dex */
public final class HeaderBiddingAd extends h0 implements HeaderBiddingAdOrBuilder {
    public static final int BIDDER_FIELD_NUMBER = 1;
    public static final int CLIENT_PARAMS_FIELD_NUMBER = 2;
    private static final HeaderBiddingAd DEFAULT_INSTANCE = new HeaderBiddingAd();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.1
        @Override // com.explorestack.protobuf.p1
        public HeaderBiddingAd parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new HeaderBiddingAd(lVar, wVar);
        }
    };
    public static final int SERVER_PARAMS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private volatile Object bidder_;
    private w0 clientParams_;
    private byte memoizedIsInitialized;
    private w0 serverParams_;

    private static final class ClientParamsDefaultEntryHolder {
        static final u0 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_descriptor;
            z2.b bVar = z2.b.f19481l;
            defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
        }

        private ClientParamsDefaultEntryHolder() {
        }
    }

    private static final class ServerParamsDefaultEntryHolder {
        static final u0 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_descriptor;
            z2.b bVar = z2.b.f19481l;
            defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
        }

        private ServerParamsDefaultEntryHolder() {
        }
    }

    public static HeaderBiddingAd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetClientParams() {
        w0 w0Var = this.clientParams_;
        return w0Var == null ? w0.g(ClientParamsDefaultEntryHolder.defaultEntry) : w0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetServerParams() {
        w0 w0Var = this.serverParams_;
        return w0Var == null ? w0.g(ServerParamsDefaultEntryHolder.defaultEntry) : w0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public boolean containsClientParams(String str) {
        str.getClass();
        return internalGetClientParams().i().containsKey(str);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public boolean containsServerParams(String str) {
        str.getClass();
        return internalGetServerParams().i().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingAd)) {
            return super.equals(obj);
        }
        HeaderBiddingAd headerBiddingAd = (HeaderBiddingAd) obj;
        return getBidder().equals(headerBiddingAd.getBidder()) && internalGetClientParams().equals(headerBiddingAd.internalGetClientParams()) && internalGetServerParams().equals(headerBiddingAd.internalGetServerParams()) && this.unknownFields.equals(headerBiddingAd.unknownFields);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getBidder() {
        Object obj = this.bidder_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidder_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public ByteString getBidderBytes() {
        Object obj = this.bidder_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidder_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    @Deprecated
    public Map<String, String> getClientParams() {
        return getClientParamsMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public int getClientParamsCount() {
        return internalGetClientParams().i().size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public Map<String, String> getClientParamsMap() {
        return internalGetClientParams().i();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getClientParamsOrDefault(String str, String str2) {
        str.getClass();
        Map mapI = internalGetClientParams().i();
        return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getClientParamsOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetClientParams().i();
        if (mapI.containsKey(str)) {
            return (String) mapI.get(str);
        }
        throw new IllegalArgumentException();
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
        int iComputeStringSize = !getBidderBytes().isEmpty() ? h0.computeStringSize(1, this.bidder_) : 0;
        for (Map.Entry entry : internalGetClientParams().i().entrySet()) {
            iComputeStringSize += n.G(2, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
        for (Map.Entry entry2 : internalGetServerParams().i().entrySet()) {
            iComputeStringSize += n.G(3, ServerParamsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry2.getKey()).w(entry2.getValue()).build());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    @Deprecated
    public Map<String, String> getServerParams() {
        return getServerParamsMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public int getServerParamsCount() {
        return internalGetServerParams().i().size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public Map<String, String> getServerParamsMap() {
        return internalGetServerParams().i();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getServerParamsOrDefault(String str, String str2) {
        str.getClass();
        Map mapI = internalGetServerParams().i();
        return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getServerParamsOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetServerParams().i();
        if (mapI.containsKey(str)) {
            return (String) mapI.get(str);
        }
        throw new IllegalArgumentException();
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
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBidder().hashCode();
        if (!internalGetClientParams().i().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetClientParams().hashCode();
        }
        if (!internalGetServerParams().i().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetServerParams().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.d(HeaderBiddingAd.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.h0
    protected w0 internalGetMapField(int i10) {
        if (i10 == 2) {
            return internalGetClientParams();
        }
        if (i10 == 3) {
            return internalGetServerParams();
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
        return new HeaderBiddingAd();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getBidderBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.bidder_);
        }
        h0.serializeStringMapTo(nVar, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 2);
        h0.serializeStringMapTo(nVar, internalGetServerParams(), ServerParamsDefaultEntryHolder.defaultEntry, 3);
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements HeaderBiddingAdOrBuilder {
        private Object bidder_;
        private int bitField0_;
        private w0 clientParams_;
        private w0 serverParams_;

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        private w0 internalGetClientParams() {
            w0 w0Var = this.clientParams_;
            return w0Var == null ? w0.g(ClientParamsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private w0 internalGetMutableClientParams() {
            onChanged();
            if (this.clientParams_ == null) {
                this.clientParams_ = w0.p(ClientParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.clientParams_.m()) {
                this.clientParams_ = this.clientParams_.f();
            }
            return this.clientParams_;
        }

        private w0 internalGetMutableServerParams() {
            onChanged();
            if (this.serverParams_ == null) {
                this.serverParams_ = w0.p(ServerParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.serverParams_.m()) {
                this.serverParams_ = this.serverParams_.f();
            }
            return this.serverParams_;
        }

        private w0 internalGetServerParams() {
            w0 w0Var = this.serverParams_;
            return w0Var == null ? w0.g(ServerParamsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearBidder() {
            this.bidder_ = HeaderBiddingAd.getDefaultInstance().getBidder();
            onChanged();
            return this;
        }

        public Builder clearClientParams() {
            internalGetMutableClientParams().l().clear();
            return this;
        }

        public Builder clearServerParams() {
            internalGetMutableServerParams().l().clear();
            return this;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public boolean containsClientParams(String str) {
            str.getClass();
            return internalGetClientParams().i().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public boolean containsServerParams(String str) {
            str.getClass();
            return internalGetServerParams().i().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getBidder() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidder_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public ByteString getBidderBytes() {
            Object obj = this.bidder_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidder_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        @Deprecated
        public Map<String, String> getClientParams() {
            return getClientParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public int getClientParamsCount() {
            return internalGetClientParams().i().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public Map<String, String> getClientParamsMap() {
            return internalGetClientParams().i();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getClientParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetClientParams().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getClientParamsOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetClientParams().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        @Deprecated
        public Map<String, String> getMutableClientParams() {
            return internalGetMutableClientParams().l();
        }

        @Deprecated
        public Map<String, String> getMutableServerParams() {
            return internalGetMutableServerParams().l();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        @Deprecated
        public Map<String, String> getServerParams() {
            return getServerParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public int getServerParamsCount() {
            return internalGetServerParams().i().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public Map<String, String> getServerParamsMap() {
            return internalGetServerParams().i();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getServerParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetServerParams().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getServerParamsOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetServerParams().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.d(HeaderBiddingAd.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetClientParams();
            }
            if (i10 == 3) {
                return internalGetServerParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMutableMapField(int i10) {
            if (i10 == 2) {
                return internalGetMutableClientParams();
            }
            if (i10 == 3) {
                return internalGetMutableServerParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllClientParams(Map<String, String> map) {
            internalGetMutableClientParams().l().putAll(map);
            return this;
        }

        public Builder putAllServerParams(Map<String, String> map) {
            internalGetMutableServerParams().l().putAll(map);
            return this;
        }

        public Builder putClientParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableClientParams().l().put(str, str2);
            return this;
        }

        public Builder putServerParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableServerParams().l().put(str, str2);
            return this;
        }

        public Builder removeClientParams(String str) {
            str.getClass();
            internalGetMutableClientParams().l().remove(str);
            return this;
        }

        public Builder removeServerParams(String str) {
            str.getClass();
            internalGetMutableServerParams().l().remove(str);
            return this;
        }

        public Builder setBidder(String str) {
            str.getClass();
            this.bidder_ = str;
            onChanged();
            return this;
        }

        public Builder setBidderBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bidder_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingAd build() {
            HeaderBiddingAd headerBiddingAdBuildPartial = buildPartial();
            if (headerBiddingAdBuildPartial.isInitialized()) {
                return headerBiddingAdBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBiddingAdBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingAd buildPartial() {
            HeaderBiddingAd headerBiddingAd = new HeaderBiddingAd(this);
            headerBiddingAd.bidder_ = this.bidder_;
            headerBiddingAd.clientParams_ = internalGetClientParams();
            headerBiddingAd.clientParams_.n();
            headerBiddingAd.serverParams_ = internalGetServerParams();
            headerBiddingAd.serverParams_.n();
            onBuilt();
            return headerBiddingAd;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public HeaderBiddingAd getDefaultInstanceForType() {
            return HeaderBiddingAd.getDefaultInstance();
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
            this.bidder_ = "";
            internalGetMutableClientParams().a();
            internalGetMutableServerParams().a();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof HeaderBiddingAd) {
                return mergeFrom((HeaderBiddingAd) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(HeaderBiddingAd headerBiddingAd) {
            if (headerBiddingAd == HeaderBiddingAd.getDefaultInstance()) {
                return this;
            }
            if (!headerBiddingAd.getBidder().isEmpty()) {
                this.bidder_ = headerBiddingAd.bidder_;
                onChanged();
            }
            internalGetMutableClientParams().o(headerBiddingAd.internalGetClientParams());
            internalGetMutableServerParams().o(headerBiddingAd.internalGetServerParams());
            mergeUnknownFields(((h0) headerBiddingAd).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.headerbidding.HeaderBiddingAd r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.headerbidding.HeaderBiddingAd r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.headerbidding.HeaderBiddingAd$Builder");
        }
    }

    public static Builder newBuilder(HeaderBiddingAd headerBiddingAd) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingAd);
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteBuffer, wVar);
    }

    private HeaderBiddingAd(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (HeaderBiddingAd) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public HeaderBiddingAd getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private HeaderBiddingAd() {
        this.memoizedIsInitialized = (byte) -1;
        this.bidder_ = "";
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(bArr, wVar);
    }

    public static HeaderBiddingAd parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) h0.parseWithIOException(PARSER, inputStream);
    }

    private HeaderBiddingAd(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.bidder_ = lVar.J();
                            } else if (iK == 18) {
                                if ((i10 & 1) == 0) {
                                    this.clientParams_ = w0.p(ClientParamsDefaultEntryHolder.defaultEntry);
                                    i10 |= 1;
                                }
                                u0 u0Var = (u0) lVar.A(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                this.clientParams_.l().put(u0Var.i(), u0Var.k());
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.serverParams_ = w0.p(ServerParamsDefaultEntryHolder.defaultEntry);
                                    i10 |= 2;
                                }
                                u0 u0Var2 = (u0) lVar.A(ServerParamsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                this.serverParams_.l().put(u0Var2.i(), u0Var2.k());
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

    public static HeaderBiddingAd parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (HeaderBiddingAd) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static HeaderBiddingAd parseFrom(l lVar) throws IOException {
        return (HeaderBiddingAd) h0.parseWithIOException(PARSER, lVar);
    }

    public static HeaderBiddingAd parseFrom(l lVar, w wVar) throws IOException {
        return (HeaderBiddingAd) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
