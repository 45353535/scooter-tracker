package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.openrtb.Response;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.analytics.AuctionContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class BidEvent extends h0 implements BidEventOrBuilder {
    public static final int AD_FIELD_NUMBER = 6;
    public static final int AUCTION_CONTEXT_FIELD_NUMBER = 4;
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int BID_FIELD_NUMBER = 5;
    private static final BidEvent DEFAULT_INSTANCE = new BidEvent();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.BidEvent.1
        @Override // com.explorestack.protobuf.p1
        public BidEvent parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new BidEvent(lVar, wVar);
        }
    };
    public static final int SEAT_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Ad ad_;
    private AuctionContext auctionContext_;
    private Response.Seatbid.Bid bid_;
    private volatile Object bidid_;
    private byte memoizedIsInitialized;
    private volatile Object seat_;
    private volatile Object timestamp_;

    public static BidEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidEvent) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BidEvent)) {
            return super.equals(obj);
        }
        BidEvent bidEvent = (BidEvent) obj;
        if (!getTimestamp().equals(bidEvent.getTimestamp()) || !getBidid().equals(bidEvent.getBidid()) || !getSeat().equals(bidEvent.getSeat()) || hasAuctionContext() != bidEvent.hasAuctionContext()) {
            return false;
        }
        if ((hasAuctionContext() && !getAuctionContext().equals(bidEvent.getAuctionContext())) || hasBid() != bidEvent.hasBid()) {
            return false;
        }
        if ((!hasBid() || getBid().equals(bidEvent.getBid())) && hasAd() == bidEvent.hasAd()) {
            return (!hasAd() || getAd().equals(bidEvent.getAd())) && this.unknownFields.equals(bidEvent.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Ad getAd() {
        Ad ad2 = this.ad_;
        return ad2 == null ? Ad.getDefaultInstance() : ad2;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public a getAdOrBuilder() {
        return getAd();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public AuctionContext getAuctionContext() {
        AuctionContext auctionContext = this.auctionContext_;
        return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public AuctionContextOrBuilder getAuctionContextOrBuilder() {
        return getAuctionContext();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Response.Seatbid.Bid getBid() {
        Response.Seatbid.Bid bid = this.bid_;
        return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
        return getBid();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getSeat() {
        Object obj = this.seat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.seat_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public ByteString getSeatBytes() {
        Object obj = this.seat_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.seat_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getTimestampBytes().isEmpty() ? h0.computeStringSize(1, this.timestamp_) : 0;
        if (!getBididBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            iComputeStringSize += n.G(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            iComputeStringSize += n.G(5, getBid());
        }
        if (this.ad_ != null) {
            iComputeStringSize += n.G(6, getAd());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public ByteString getTimestampBytes() {
        Object obj = this.timestamp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timestamp_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasAd() {
        return this.ad_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasAuctionContext() {
        return this.auctionContext_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasBid() {
        return this.bid_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getBidid().hashCode()) * 37) + 3) * 53) + getSeat().hashCode();
        if (hasAuctionContext()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getAuctionContext().hashCode();
        }
        if (hasBid()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getBid().hashCode();
        }
        if (hasAd()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getAd().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.d(BidEvent.class, Builder.class);
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
        return new BidEvent();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getTimestampBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.timestamp_);
        }
        if (!getBididBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            h0.writeString(nVar, 3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            nVar.J0(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            nVar.J0(5, getBid());
        }
        if (this.ad_ != null) {
            nVar.J0(6, getAd());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements BidEventOrBuilder {
        private a2 adBuilder_;
        private Ad ad_;
        private a2 auctionContextBuilder_;
        private AuctionContext auctionContext_;
        private a2 bidBuilder_;
        private Response.Seatbid.Bid bid_;
        private Object bidid_;
        private Object seat_;
        private Object timestamp_;

        private a2 getAdFieldBuilder() {
            if (this.adBuilder_ == null) {
                this.adBuilder_ = new a2(getAd(), getParentForChildren(), isClean());
                this.ad_ = null;
            }
            return this.adBuilder_;
        }

        private a2 getAuctionContextFieldBuilder() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContextBuilder_ = new a2(getAuctionContext(), getParentForChildren(), isClean());
                this.auctionContext_ = null;
            }
            return this.auctionContextBuilder_;
        }

        private a2 getBidFieldBuilder() {
            if (this.bidBuilder_ == null) {
                this.bidBuilder_ = new a2(getBid(), getParentForChildren(), isClean());
                this.bid_ = null;
            }
            return this.bidBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearAd() {
            if (this.adBuilder_ == null) {
                this.ad_ = null;
                onChanged();
                return this;
            }
            this.ad_ = null;
            this.adBuilder_ = null;
            return this;
        }

        public Builder clearAuctionContext() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
                onChanged();
                return this;
            }
            this.auctionContext_ = null;
            this.auctionContextBuilder_ = null;
            return this;
        }

        public Builder clearBid() {
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
                onChanged();
                return this;
            }
            this.bid_ = null;
            this.bidBuilder_ = null;
            return this;
        }

        public Builder clearBidid() {
            this.bidid_ = BidEvent.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder clearSeat() {
            this.seat_ = BidEvent.getDefaultInstance().getSeat();
            onChanged();
            return this;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = BidEvent.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Ad getAd() {
            a2 a2Var = this.adBuilder_;
            if (a2Var != null) {
                return (Ad) a2Var.e();
            }
            Ad ad2 = this.ad_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        public Ad.Builder getAdBuilder() {
            onChanged();
            return (Ad.Builder) getAdFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public a getAdOrBuilder() {
            a2 a2Var = this.adBuilder_;
            if (a2Var != null) {
                return (a) a2Var.f();
            }
            Ad ad2 = this.ad_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public AuctionContext getAuctionContext() {
            a2 a2Var = this.auctionContextBuilder_;
            if (a2Var != null) {
                return (AuctionContext) a2Var.e();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        public AuctionContext.Builder getAuctionContextBuilder() {
            onChanged();
            return (AuctionContext.Builder) getAuctionContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public AuctionContextOrBuilder getAuctionContextOrBuilder() {
            a2 a2Var = this.auctionContextBuilder_;
            if (a2Var != null) {
                return (AuctionContextOrBuilder) a2Var.f();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Response.Seatbid.Bid getBid() {
            a2 a2Var = this.bidBuilder_;
            if (a2Var != null) {
                return (Response.Seatbid.Bid) a2Var.e();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        public Response.Seatbid.Bid.Builder getBidBuilder() {
            onChanged();
            return (Response.Seatbid.Bid.Builder) getBidFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
            a2 a2Var = this.bidBuilder_;
            if (a2Var != null) {
                return (Response.Seatbid.BidOrBuilder) a2Var.f();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timestamp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasAd() {
            return (this.adBuilder_ == null && this.ad_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasAuctionContext() {
            return (this.auctionContextBuilder_ == null && this.auctionContext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasBid() {
            return (this.bidBuilder_ == null && this.bid_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.d(BidEvent.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAd(Ad ad2) {
            a2 a2Var = this.adBuilder_;
            if (a2Var != null) {
                a2Var.g(ad2);
                return this;
            }
            Ad ad3 = this.ad_;
            if (ad3 != null) {
                this.ad_ = Ad.newBuilder(ad3).mergeFrom(ad2).buildPartial();
            } else {
                this.ad_ = ad2;
            }
            onChanged();
            return this;
        }

        public Builder mergeAuctionContext(AuctionContext auctionContext) {
            a2 a2Var = this.auctionContextBuilder_;
            if (a2Var != null) {
                a2Var.g(auctionContext);
                return this;
            }
            AuctionContext auctionContext2 = this.auctionContext_;
            if (auctionContext2 != null) {
                this.auctionContext_ = AuctionContext.newBuilder(auctionContext2).mergeFrom(auctionContext).buildPartial();
            } else {
                this.auctionContext_ = auctionContext;
            }
            onChanged();
            return this;
        }

        public Builder mergeBid(Response.Seatbid.Bid bid) {
            a2 a2Var = this.bidBuilder_;
            if (a2Var != null) {
                a2Var.g(bid);
                return this;
            }
            Response.Seatbid.Bid bid2 = this.bid_;
            if (bid2 != null) {
                this.bid_ = Response.Seatbid.Bid.newBuilder(bid2).mergeFrom(bid).buildPartial();
            } else {
                this.bid_ = bid;
            }
            onChanged();
            return this;
        }

        public Builder setAd(Ad ad2) {
            a2 a2Var = this.adBuilder_;
            if (a2Var != null) {
                a2Var.i(ad2);
                return this;
            }
            ad2.getClass();
            this.ad_ = ad2;
            onChanged();
            return this;
        }

        public Builder setAuctionContext(AuctionContext auctionContext) {
            a2 a2Var = this.auctionContextBuilder_;
            if (a2Var != null) {
                a2Var.i(auctionContext);
                return this;
            }
            auctionContext.getClass();
            this.auctionContext_ = auctionContext;
            onChanged();
            return this;
        }

        public Builder setBid(Response.Seatbid.Bid bid) {
            a2 a2Var = this.bidBuilder_;
            if (a2Var != null) {
                a2Var.i(bid);
                return this;
            }
            bid.getClass();
            this.bid_ = bid;
            onChanged();
            return this;
        }

        public Builder setBidid(String str) {
            str.getClass();
            this.bidid_ = str;
            onChanged();
            return this;
        }

        public Builder setBididBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.bidid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSeat(String str) {
            str.getClass();
            this.seat_ = str;
            onChanged();
            return this;
        }

        public Builder setSeatBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.seat_ = byteString;
            onChanged();
            return this;
        }

        public Builder setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
            onChanged();
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BidEvent build() {
            BidEvent bidEventBuildPartial = buildPartial();
            if (bidEventBuildPartial.isInitialized()) {
                return bidEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) bidEventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BidEvent buildPartial() {
            BidEvent bidEvent = new BidEvent(this);
            bidEvent.timestamp_ = this.timestamp_;
            bidEvent.bidid_ = this.bidid_;
            bidEvent.seat_ = this.seat_;
            a2 a2Var = this.auctionContextBuilder_;
            if (a2Var == null) {
                bidEvent.auctionContext_ = this.auctionContext_;
            } else {
                bidEvent.auctionContext_ = (AuctionContext) a2Var.a();
            }
            a2 a2Var2 = this.bidBuilder_;
            if (a2Var2 == null) {
                bidEvent.bid_ = this.bid_;
            } else {
                bidEvent.bid_ = (Response.Seatbid.Bid) a2Var2.a();
            }
            a2 a2Var3 = this.adBuilder_;
            if (a2Var3 == null) {
                bidEvent.ad_ = this.ad_;
            } else {
                bidEvent.ad_ = (Ad) a2Var3.a();
            }
            onBuilt();
            return bidEvent;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public BidEvent getDefaultInstanceForType() {
            return BidEvent.getDefaultInstance();
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
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
            } else {
                this.auctionContext_ = null;
                this.auctionContextBuilder_ = null;
            }
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
            } else {
                this.bid_ = null;
                this.bidBuilder_ = null;
            }
            if (this.adBuilder_ == null) {
                this.ad_ = null;
                return this;
            }
            this.ad_ = null;
            this.adBuilder_ = null;
            return this;
        }

        public Builder setAd(Ad.Builder builder) {
            a2 a2Var = this.adBuilder_;
            if (a2Var == null) {
                this.ad_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setAuctionContext(AuctionContext.Builder builder) {
            a2 a2Var = this.auctionContextBuilder_;
            if (a2Var == null) {
                this.auctionContext_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setBid(Response.Seatbid.Bid.Builder builder) {
            a2 a2Var = this.bidBuilder_;
            if (a2Var == null) {
                this.bid_ = builder.build();
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
            if (message instanceof BidEvent) {
                return mergeFrom((BidEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(BidEvent bidEvent) {
            if (bidEvent == BidEvent.getDefaultInstance()) {
                return this;
            }
            if (!bidEvent.getTimestamp().isEmpty()) {
                this.timestamp_ = bidEvent.timestamp_;
                onChanged();
            }
            if (!bidEvent.getBidid().isEmpty()) {
                this.bidid_ = bidEvent.bidid_;
                onChanged();
            }
            if (!bidEvent.getSeat().isEmpty()) {
                this.seat_ = bidEvent.seat_;
                onChanged();
            }
            if (bidEvent.hasAuctionContext()) {
                mergeAuctionContext(bidEvent.getAuctionContext());
            }
            if (bidEvent.hasBid()) {
                mergeBid(bidEvent.getBid());
            }
            if (bidEvent.hasAd()) {
                mergeAd(bidEvent.getAd());
            }
            mergeUnknownFields(((h0) bidEvent).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.analytics.BidEvent.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.BidEvent.access$1100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.BidEvent r3 = (io.bidmachine.protobuf.analytics.BidEvent) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.BidEvent r4 = (io.bidmachine.protobuf.analytics.BidEvent) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.BidEvent.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.BidEvent$Builder");
        }
    }

    public static Builder newBuilder(BidEvent bidEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bidEvent);
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteBuffer, wVar);
    }

    private BidEvent(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (BidEvent) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static BidEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public BidEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static BidEvent parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private BidEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.timestamp_ = "";
        this.bidid_ = "";
        this.seat_ = "";
    }

    public static BidEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static BidEvent parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(bArr, wVar);
    }

    public static BidEvent parseFrom(InputStream inputStream) throws IOException {
        return (BidEvent) h0.parseWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (BidEvent) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    private BidEvent(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            this.timestamp_ = lVar.J();
                        } else if (iK == 18) {
                            this.bidid_ = lVar.J();
                        } else if (iK != 26) {
                            if (iK == 34) {
                                AuctionContext auctionContext = this.auctionContext_;
                                AuctionContext.Builder builder = auctionContext != null ? auctionContext.toBuilder() : null;
                                AuctionContext auctionContext2 = (AuctionContext) lVar.A(AuctionContext.parser(), wVar);
                                this.auctionContext_ = auctionContext2;
                                if (builder != null) {
                                    builder.mergeFrom(auctionContext2);
                                    this.auctionContext_ = builder.buildPartial();
                                }
                            } else if (iK == 42) {
                                Response.Seatbid.Bid bid = this.bid_;
                                Response.Seatbid.Bid.Builder builder2 = bid != null ? bid.toBuilder() : null;
                                Response.Seatbid.Bid bid2 = (Response.Seatbid.Bid) lVar.A(Response.Seatbid.Bid.parser(), wVar);
                                this.bid_ = bid2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(bid2);
                                    this.bid_ = builder2.buildPartial();
                                }
                            } else if (iK != 50) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                Ad ad2 = this.ad_;
                                Ad.Builder builder3 = ad2 != null ? ad2.toBuilder() : null;
                                Ad ad3 = (Ad) lVar.A(Ad.parser(), wVar);
                                this.ad_ = ad3;
                                if (builder3 != null) {
                                    builder3.mergeFrom(ad3);
                                    this.ad_ = builder3.buildPartial();
                                }
                            }
                        } else {
                            this.seat_ = lVar.J();
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

    public static BidEvent parseFrom(l lVar) throws IOException {
        return (BidEvent) h0.parseWithIOException(PARSER, lVar);
    }

    public static BidEvent parseFrom(l lVar, w wVar) throws IOException {
        return (BidEvent) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
