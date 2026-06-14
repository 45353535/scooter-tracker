package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: loaded from: classes12.dex */
public enum TrackEventType {
    GetBidToken(513),
    InitLoading(506),
    AuctionRequest(507),
    AuctionRequestCancel(508),
    AuctionRequestExpired(509),
    AuctionRequestDestroy(510),
    BrokenCreativeDetector(EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE),
    Load(500),
    FillAd(512),
    Impression(502),
    Show(501),
    Click(503),
    Close(504),
    Expired(511),
    Destroy(505),
    Error(1000),
    TrackingError(1001),
    HeaderBiddingNetworksPrepare(703),
    HeaderBiddingNetworkInitialize(701),
    HeaderBiddingNetworkPrepare(702),
    MediationWin(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE),
    MediationLoss(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE),
    WaterfallLoadStart(901),
    WaterfallLoadFinish(904),
    AdUnitLoadStart(902),
    AdUnitLoadFinish(903),
    AdUnitExpired(905),
    AdUnitCheapestDequeued(906),
    AdUnitShown(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION_VALUE),
    AdUnitWin(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_WIN_VALUE),
    AdUnitLoss(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE),
    AdUnitPaidEvent(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE),
    ImpressionOpportunity(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE);

    private final int actionValue;

    TrackEventType(int i10) {
        this.actionValue = i10;
    }

    @Nullable
    public static TrackEventType fromNumber(int i10) {
        for (TrackEventType trackEventType : values()) {
            if (trackEventType.actionValue == i10) {
                return trackEventType;
            }
        }
        return null;
    }

    public int getActionValue() {
        return this.actionValue;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return name() + " (" + this.actionValue + ")";
    }
}
