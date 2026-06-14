package org.bidon.sdk.adapter.ext;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.WinLossNotifiable;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.models.BidType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001aB\u0010\u0010\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0014*\u0006\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lorg/bidon/sdk/adapter/AdSource;", "", "winnerDemandId", "", "winnerPrice", "", "notifyExternalLoss", "(Lorg/bidon/sdk/adapter/AdSource;Ljava/lang/String;D)V", "notifyExternalWin", "(Lorg/bidon/sdk/adapter/AdSource;)V", "notificationType", "Lkotlin/Function1;", "Lorg/bidon/sdk/stats/StatisticsCollector;", "onRtbNotification", "Lkotlin/Function0;", "onCpmNotification", "processWinLossNotification", "(Lorg/bidon/sdk/adapter/AdSource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "TAG", "Ljava/lang/String;", "Lorg/bidon/sdk/ads/Ad;", "getAd", "(Lorg/bidon/sdk/adapter/AdSource;)Lorg/bidon/sdk/ads/Ad;", "ad", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdSourceExtKt {

    @NotNull
    private static final String TAG = "AdSourceExt";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BidType.values().length];
            try {
                iArr[BidType.RTB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidType.CPM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final Ad getAd(@NotNull AdSource<?> adSource) {
        Intrinsics.checkNotNullParameter(adSource, "<this>");
        return adSource.getAd();
    }

    public static final void notifyExternalLoss(@NotNull AdSource<?> adSource, @NotNull String winnerDemandId, double d10) {
        BidType bidType;
        Intrinsics.checkNotNullParameter(adSource, "<this>");
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        if (!adSource.canSendWinLoseNotifications()) {
            LogExtKt.logInfo(TAG, "Not sending loss notification: " + adSource.getDemandId());
            return;
        }
        adSource.markWinLoseNotificationsSent();
        Ad ad2 = getAd(adSource);
        if (ad2 == null || (bidType = ad2.getBidType()) == null) {
            bidType = adSource.getStats().getBidType();
        }
        int i10 = bidType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bidType.ordinal()];
        if (i10 == -1) {
            LogExtKt.logInfo(TAG, "BidType is null. Not sending loss notification: " + adSource.getDemandId());
            return;
        }
        if (i10 == 1) {
            LogExtKt.logInfo(TAG, "Sending loss notification to server: " + adSource.getDemandId());
            adSource.sendLoss(winnerDemandId, d10);
            return;
        }
        if (i10 != 2) {
            throw new m();
        }
        LogExtKt.logInfo(TAG, "Sending loss notification to adapter: " + adSource.getDemandId());
        WinLossNotifiable winLossNotifiable = adSource instanceof WinLossNotifiable ? (WinLossNotifiable) adSource : null;
        if (winLossNotifiable != null) {
            winLossNotifiable.notifyLoss(winnerDemandId, d10);
        }
    }

    public static final void notifyExternalWin(@NotNull AdSource<?> adSource) {
        BidType bidType;
        Intrinsics.checkNotNullParameter(adSource, "<this>");
        if (!adSource.canSendWinLoseNotifications()) {
            LogExtKt.logInfo(TAG, "Not sending win notification: " + adSource.getDemandId());
            return;
        }
        adSource.markWinLoseNotificationsSent();
        Ad ad2 = getAd(adSource);
        if (ad2 == null || (bidType = ad2.getBidType()) == null) {
            bidType = adSource.getStats().getBidType();
        }
        int i10 = bidType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bidType.ordinal()];
        if (i10 == -1) {
            LogExtKt.logInfo(TAG, "BidType is null. Not sending win notification: " + adSource.getDemandId());
            return;
        }
        if (i10 == 1) {
            LogExtKt.logInfo(TAG, "Sending win notification to server: " + adSource.getDemandId());
            adSource.sendWin();
            return;
        }
        if (i10 != 2) {
            throw new m();
        }
        LogExtKt.logInfo(TAG, "Sending win notification to adapter: " + adSource.getDemandId());
        WinLossNotifiable winLossNotifiable = adSource instanceof WinLossNotifiable ? (WinLossNotifiable) adSource : null;
        if (winLossNotifiable != null) {
            winLossNotifiable.notifyWin();
        }
    }

    private static final void processWinLossNotification(AdSource<?> adSource, String str, Function1<? super StatisticsCollector, Unit> function1, Function0<Unit> function0) {
        BidType bidType;
        Intrinsics.checkNotNull(adSource, "null cannot be cast to non-null type org.bidon.sdk.stats.StatisticsCollector");
        if (!adSource.canSendWinLoseNotifications()) {
            LogExtKt.logInfo(TAG, "Not sending " + str + " notification: " + adSource.getDemandId());
            return;
        }
        adSource.markWinLoseNotificationsSent();
        Ad ad2 = getAd(adSource);
        if (ad2 == null || (bidType = ad2.getBidType()) == null) {
            bidType = adSource.getStats().getBidType();
        }
        int i10 = bidType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bidType.ordinal()];
        if (i10 == -1) {
            LogExtKt.logInfo(TAG, "BidType is null. Not sending " + str + " notification: " + adSource.getDemandId());
            return;
        }
        if (i10 == 1) {
            LogExtKt.logInfo(TAG, "Sending " + str + " notification to server: " + adSource.getDemandId());
            function1.invoke(adSource);
            return;
        }
        if (i10 != 2) {
            throw new m();
        }
        LogExtKt.logInfo(TAG, "Sending " + str + " notification to adapter: " + adSource.getDemandId());
        function0.invoke();
    }
}
