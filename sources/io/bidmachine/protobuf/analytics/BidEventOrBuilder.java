package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.a;
import com.explorestack.protobuf.openrtb.Response;

/* JADX INFO: loaded from: classes12.dex */
public interface BidEventOrBuilder extends MessageOrBuilder {
    Ad getAd();

    a getAdOrBuilder();

    AuctionContext getAuctionContext();

    AuctionContextOrBuilder getAuctionContextOrBuilder();

    Response.Seatbid.Bid getBid();

    Response.Seatbid.BidOrBuilder getBidOrBuilder();

    String getBidid();

    ByteString getBididBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    String getSeat();

    ByteString getSeatBytes();

    String getTimestamp();

    ByteString getTimestampBytes();

    boolean hasAd();

    boolean hasAuctionContext();

    boolean hasBid();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
