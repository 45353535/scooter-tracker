package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface HeaderBiddingPlacementOrBuilder extends MessageOrBuilder {
    HeaderBiddingPlacement.AdUnit getAdUnits(int i10);

    int getAdUnitsCount();

    List<HeaderBiddingPlacement.AdUnit> getAdUnitsList();

    HeaderBiddingPlacement.AdUnitOrBuilder getAdUnitsOrBuilder(int i10);

    List<? extends HeaderBiddingPlacement.AdUnitOrBuilder> getAdUnitsOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
