package org.bidon.sdk.auction;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.auction.models.AuctionResult;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0001\u0012J[\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00062\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lorg/bidon/sdk/auction/Auction;", "", "Lorg/bidon/sdk/adapter/DemandAd;", "demandAd", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "Lkotlin/Function2;", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "Lorg/bidon/sdk/ads/AuctionInfo;", "", "onSuccess", "", "onFailure", "start", "(Lorg/bidon/sdk/adapter/DemandAd;Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", MenuActionType.CANCEL, "()V", "AuctionState", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Auction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/auction/Auction$AuctionState;", "", "<init>", "(Ljava/lang/String;I)V", "Initialized", "InProgress", LogConstants.EVENT_FINISHED, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuctionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AuctionState[] $VALUES;
        public static final AuctionState Initialized = new AuctionState("Initialized", 0);
        public static final AuctionState InProgress = new AuctionState("InProgress", 1);
        public static final AuctionState Finished = new AuctionState(LogConstants.EVENT_FINISHED, 2);

        private static final /* synthetic */ AuctionState[] $values() {
            return new AuctionState[]{Initialized, InProgress, Finished};
        }

        static {
            AuctionState[] auctionStateArr$values = $values();
            $VALUES = auctionStateArr$values;
            $ENTRIES = a.a(auctionStateArr$values);
        }

        private AuctionState(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AuctionState valueOf(String str) {
            return (AuctionState) Enum.valueOf(AuctionState.class, str);
        }

        public static AuctionState[] values() {
            return (AuctionState[]) $VALUES.clone();
        }
    }

    void cancel();

    void start(@NotNull DemandAd demandAd, @NotNull AdTypeParam adTypeParam, @NotNull Function2<? super List<? extends AuctionResult>, ? super AuctionInfo, Unit> onSuccess, @NotNull Function2<? super AuctionInfo, ? super Throwable, Unit> onFailure);
}
