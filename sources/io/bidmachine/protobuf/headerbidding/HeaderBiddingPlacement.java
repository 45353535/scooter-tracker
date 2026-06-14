package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class HeaderBiddingPlacement extends h0 implements HeaderBiddingPlacementOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 1;
    private static final HeaderBiddingPlacement DEFAULT_INSTANCE = new HeaderBiddingPlacement();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.1
        @Override // com.explorestack.protobuf.p1
        public HeaderBiddingPlacement parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new HeaderBiddingPlacement(lVar, wVar);
        }
    };
    private static final long serialVersionUID = 0;
    private List<AdUnit> adUnits_;
    private byte memoizedIsInitialized;

    public static final class AdUnit extends h0 implements AdUnitOrBuilder {
        public static final int BIDDER_FIELD_NUMBER = 1;
        public static final int BIDDER_SDKVER_FIELD_NUMBER = 2;
        public static final int CLIENT_PARAMS_FIELD_NUMBER = 3;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.1
            @Override // com.explorestack.protobuf.p1
            public AdUnit parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AdUnit(lVar, wVar);
            }
        };
        public static final int PRICE_ESTIMATE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object bidderSdkver_;
        private volatile Object bidder_;
        private w0 clientParams_;
        private byte memoizedIsInitialized;
        private double priceEstimate_;

        private static final class ClientParamsDefaultEntryHolder {
            static final u0 defaultEntry;

            static {
                Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_descriptor;
                z2.b bVar = z2.b.f19481l;
                defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
            }

            private ClientParamsDefaultEntryHolder() {
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w0 internalGetClientParams() {
            w0 w0Var = this.clientParams_;
            return w0Var == null ? w0.g(ClientParamsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public boolean containsClientParams(String str) {
            str.getClass();
            return internalGetClientParams().i().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return super.equals(obj);
            }
            AdUnit adUnit = (AdUnit) obj;
            return getBidder().equals(adUnit.getBidder()) && getBidderSdkver().equals(adUnit.getBidderSdkver()) && internalGetClientParams().equals(adUnit.internalGetClientParams()) && Double.doubleToLongBits(getPriceEstimate()) == Double.doubleToLongBits(adUnit.getPriceEstimate()) && this.unknownFields.equals(adUnit.unknownFields);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getBidder() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidder_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public ByteString getBidderBytes() {
            Object obj = this.bidder_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidder_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getBidderSdkver() {
            Object obj = this.bidderSdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidderSdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public ByteString getBidderSdkverBytes() {
            Object obj = this.bidderSdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidderSdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        @Deprecated
        public Map<String, String> getClientParams() {
            return getClientParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public int getClientParamsCount() {
            return internalGetClientParams().i().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public Map<String, String> getClientParamsMap() {
            return internalGetClientParams().i();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getClientParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetClientParams().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
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

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public double getPriceEstimate() {
            return this.priceEstimate_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getBidderBytes().isEmpty() ? h0.computeStringSize(1, this.bidder_) : 0;
            if (!getBidderSdkverBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.bidderSdkver_);
            }
            for (Map.Entry entry : internalGetClientParams().i().entrySet()) {
                iComputeStringSize += n.G(3, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
            }
            double d10 = this.priceEstimate_;
            if (d10 != 0.0d) {
                iComputeStringSize += n.j(4, d10);
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
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBidder().hashCode()) * 37) + 2) * 53) + getBidderSdkver().hashCode();
            if (!internalGetClientParams().i().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetClientParams().hashCode();
            }
            int i11 = (((((iHashCode * 37) + 4) * 53) + j0.i(Double.doubleToLongBits(getPriceEstimate()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = i11;
            return i11;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0
        protected w0 internalGetMapField(int i10) {
            if (i10 == 3) {
                return internalGetClientParams();
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
            return new AdUnit();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getBidderBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.bidder_);
            }
            if (!getBidderSdkverBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.bidderSdkver_);
            }
            h0.serializeStringMapTo(nVar, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 3);
            double d10 = this.priceEstimate_;
            if (d10 != 0.0d) {
                nVar.t0(4, d10);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AdUnitOrBuilder {
            private Object bidderSdkver_;
            private Object bidder_;
            private int bitField0_;
            private w0 clientParams_;
            private double priceEstimate_;

            public static final Descriptors.Descriptor getDescriptor() {
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
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

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearBidder() {
                this.bidder_ = AdUnit.getDefaultInstance().getBidder();
                onChanged();
                return this;
            }

            public Builder clearBidderSdkver() {
                this.bidderSdkver_ = AdUnit.getDefaultInstance().getBidderSdkver();
                onChanged();
                return this;
            }

            public Builder clearClientParams() {
                internalGetMutableClientParams().l().clear();
                return this;
            }

            public Builder clearPriceEstimate() {
                this.priceEstimate_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public boolean containsClientParams(String str) {
                str.getClass();
                return internalGetClientParams().i().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getBidder() {
                Object obj = this.bidder_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bidder_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public ByteString getBidderBytes() {
                Object obj = this.bidder_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bidder_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getBidderSdkver() {
                Object obj = this.bidderSdkver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bidderSdkver_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public ByteString getBidderSdkverBytes() {
                Object obj = this.bidderSdkver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bidderSdkver_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getClientParams() {
                return getClientParamsMap();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public int getClientParamsCount() {
                return internalGetClientParams().i().size();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public Map<String, String> getClientParamsMap() {
                return internalGetClientParams().i();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getClientParamsOrDefault(String str, String str2) {
                str.getClass();
                Map mapI = internalGetClientParams().i();
                return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
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
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
            }

            @Deprecated
            public Map<String, String> getMutableClientParams() {
                return internalGetMutableClientParams().l();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public double getPriceEstimate() {
                return this.priceEstimate_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMapField(int i10) {
                if (i10 == 3) {
                    return internalGetClientParams();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMutableMapField(int i10) {
                if (i10 == 3) {
                    return internalGetMutableClientParams();
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

            public Builder putClientParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableClientParams().l().put(str, str2);
                return this;
            }

            public Builder removeClientParams(String str) {
                str.getClass();
                internalGetMutableClientParams().l().remove(str);
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

            public Builder setBidderSdkver(String str) {
                str.getClass();
                this.bidderSdkver_ = str;
                onChanged();
                return this;
            }

            public Builder setBidderSdkverBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.bidderSdkver_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPriceEstimate(double d10) {
                this.priceEstimate_ = d10;
                onChanged();
                return this;
            }

            private Builder() {
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit build() {
                AdUnit adUnitBuildPartial = buildPartial();
                if (adUnitBuildPartial.isInitialized()) {
                    return adUnitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit buildPartial() {
                AdUnit adUnit = new AdUnit(this);
                adUnit.bidder_ = this.bidder_;
                adUnit.bidderSdkver_ = this.bidderSdkver_;
                adUnit.clientParams_ = internalGetClientParams();
                adUnit.clientParams_.n();
                adUnit.priceEstimate_ = this.priceEstimate_;
                onBuilt();
                return adUnit;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return AdUnit.getDefaultInstance();
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
                this.bidderSdkver_ = "";
                internalGetMutableClientParams().a();
                this.priceEstimate_ = 0.0d;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdUnit) {
                    return mergeFrom((AdUnit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdUnit adUnit) {
                if (adUnit == AdUnit.getDefaultInstance()) {
                    return this;
                }
                if (!adUnit.getBidder().isEmpty()) {
                    this.bidder_ = adUnit.bidder_;
                    onChanged();
                }
                if (!adUnit.getBidderSdkver().isEmpty()) {
                    this.bidderSdkver_ = adUnit.bidderSdkver_;
                    onChanged();
                }
                internalGetMutableClientParams().o(adUnit.internalGetClientParams());
                if (adUnit.getPriceEstimate() != 0.0d) {
                    setPriceEstimate(adUnit.getPriceEstimate());
                }
                mergeUnknownFields(((h0) adUnit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit$Builder");
            }
        }

        public static Builder newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AdUnit(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdUnit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdUnit parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdUnit() {
            this.memoizedIsInitialized = (byte) -1;
            this.bidder_ = "";
            this.bidderSdkver_ = "";
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static AdUnit parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr, wVar);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, inputStream);
        }

        private AdUnit(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.bidder_ = lVar.J();
                            } else if (iK == 18) {
                                this.bidderSdkver_ = lVar.J();
                            } else if (iK == 26) {
                                if (!z11) {
                                    this.clientParams_ = w0.p(ClientParamsDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                u0 u0Var = (u0) lVar.A(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                this.clientParams_.l().put(u0Var.i(), u0Var.k());
                            } else if (iK != 33) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.priceEstimate_ = lVar.s();
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

        public static AdUnit parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static AdUnit parseFrom(l lVar) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, lVar);
        }

        public static AdUnit parseFrom(l lVar, w wVar) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface AdUnitOrBuilder extends MessageOrBuilder {
        boolean containsClientParams(String str);

        String getBidder();

        ByteString getBidderBytes();

        String getBidderSdkver();

        ByteString getBidderSdkverBytes();

        @Deprecated
        Map<String, String> getClientParams();

        int getClientParamsCount();

        Map<String, String> getClientParamsMap();

        String getClientParamsOrDefault(String str, String str2);

        String getClientParamsOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        double getPriceEstimate();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static HeaderBiddingPlacement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingPlacement)) {
            return super.equals(obj);
        }
        HeaderBiddingPlacement headerBiddingPlacement = (HeaderBiddingPlacement) obj;
        return getAdUnitsList().equals(headerBiddingPlacement.getAdUnitsList()) && this.unknownFields.equals(headerBiddingPlacement.unknownFields);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public AdUnit getAdUnits(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
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
        int iG = 0;
        for (int i11 = 0; i11 < this.adUnits_.size(); i11++) {
            iG += n.G(1, this.adUnits_.get(i11));
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
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
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getAdUnitsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getAdUnitsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable.d(HeaderBiddingPlacement.class, Builder.class);
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
        return new HeaderBiddingPlacement();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        for (int i10 = 0; i10 < this.adUnits_.size(); i10++) {
            nVar.J0(1, this.adUnits_.get(i10));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements HeaderBiddingPlacementOrBuilder {
        private v1 adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 1;
            }
        }

        private v1 getAdUnitsFieldBuilder() {
            if (this.adUnitsBuilder_ == null) {
                this.adUnitsBuilder_ = new v1(this.adUnits_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getAdUnitsFieldBuilder();
            }
        }

        public Builder addAdUnits(AdUnit adUnit) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.e(adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.add(adUnit);
            onChanged();
            return this;
        }

        public AdUnit.Builder addAdUnitsBuilder() {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().c(AdUnit.getDefaultInstance());
        }

        public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureAdUnitsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.adUnits_);
            onChanged();
            return this;
        }

        public Builder clearAdUnits() {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.adUnits_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public AdUnit getAdUnits(int i10) {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? this.adUnits_.get(i10) : (AdUnit) v1Var.n(i10);
        }

        public AdUnit.Builder getAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().k(i10);
        }

        public List<AdUnit.Builder> getAdUnitsBuilderList() {
            return getAdUnitsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public int getAdUnitsCount() {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? this.adUnits_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public List<AdUnit> getAdUnitsList() {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.adUnits_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? this.adUnits_.get(i10) : (AdUnitOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.adUnits_);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable.d(HeaderBiddingPlacement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeAdUnits(int i10) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureAdUnitsIsMutable();
            this.adUnits_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit adUnit) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.set(i10, adUnit);
            onChanged();
            return this;
        }

        private Builder() {
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingPlacement build() {
            HeaderBiddingPlacement headerBiddingPlacementBuildPartial = buildPartial();
            if (headerBiddingPlacementBuildPartial.isInitialized()) {
                return headerBiddingPlacementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBiddingPlacementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingPlacement buildPartial() {
            HeaderBiddingPlacement headerBiddingPlacement = new HeaderBiddingPlacement(this);
            int i10 = this.bitField0_;
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                if ((i10 & 1) != 0) {
                    this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -2;
                }
                headerBiddingPlacement.adUnits_ = this.adUnits_;
            } else {
                headerBiddingPlacement.adUnits_ = v1Var.f();
            }
            onBuilt();
            return headerBiddingPlacement;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public HeaderBiddingPlacement getDefaultInstanceForType() {
            return HeaderBiddingPlacement.getDefaultInstance();
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

        public AdUnit.Builder addAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().b(i10, AdUnit.getDefaultInstance());
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
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                this.adUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            v1Var.g();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addAdUnits(int i10, AdUnit adUnit) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, adUnit);
                onChanged();
                return this;
            }
            v1Var.d(i10, adUnit);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof HeaderBiddingPlacement) {
                return mergeFrom((HeaderBiddingPlacement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit.Builder builder) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(HeaderBiddingPlacement headerBiddingPlacement) {
            if (headerBiddingPlacement == HeaderBiddingPlacement.getDefaultInstance()) {
                return this;
            }
            if (this.adUnitsBuilder_ == null) {
                if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = headerBiddingPlacement.adUnits_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(headerBiddingPlacement.adUnits_);
                    }
                    onChanged();
                }
            } else if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                if (!this.adUnitsBuilder_.t()) {
                    this.adUnitsBuilder_.a(headerBiddingPlacement.adUnits_);
                } else {
                    this.adUnitsBuilder_.h();
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = headerBiddingPlacement.adUnits_;
                    this.bitField0_ &= -2;
                    this.adUnitsBuilder_ = h0.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) headerBiddingPlacement).unknownFields);
            onChanged();
            return this;
        }

        public Builder addAdUnits(AdUnit.Builder builder) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addAdUnits(int i10, AdUnit.Builder builder) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.access$2100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$Builder");
        }
    }

    public static Builder newBuilder(HeaderBiddingPlacement headerBiddingPlacement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingPlacement);
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteBuffer, wVar);
    }

    private HeaderBiddingPlacement(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (HeaderBiddingPlacement) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public HeaderBiddingPlacement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private HeaderBiddingPlacement() {
        this.memoizedIsInitialized = (byte) -1;
        this.adUnits_ = Collections.EMPTY_LIST;
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(bArr, wVar);
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) h0.parseWithIOException(PARSER, inputStream);
    }

    private HeaderBiddingPlacement(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK != 10) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.adUnits_ = new ArrayList();
                                    z11 = true;
                                }
                                this.adUnits_.add((AdUnit) lVar.A(AdUnit.parser(), wVar));
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
                if (z11) {
                    this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (HeaderBiddingPlacement) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static HeaderBiddingPlacement parseFrom(l lVar) throws IOException {
        return (HeaderBiddingPlacement) h0.parseWithIOException(PARSER, lVar);
    }

    public static HeaderBiddingPlacement parseFrom(l lVar, w wVar) throws IOException {
        return (HeaderBiddingPlacement) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
