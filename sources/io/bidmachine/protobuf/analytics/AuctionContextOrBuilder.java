package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.c;
import com.explorestack.protobuf.adcom.d;
import com.explorestack.protobuf.openrtb.Request;

/* JADX INFO: loaded from: classes12.dex */
public interface AuctionContextOrBuilder extends MessageOrBuilder {
    int getAt();

    Context getContext();

    c getContextOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    String getId();

    ByteString getIdBytes();

    Request.Item getItem();

    Request.ItemOrBuilder getItemOrBuilder();

    Placement getPlacement();

    d getPlacementOrBuilder();

    PlacementTag getPlacementTag();

    int getPlacementTagValue();

    boolean getTest();

    String getTimestamp();

    ByteString getTimestampBytes();

    boolean hasContext();

    boolean hasItem();

    boolean hasPlacement();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
