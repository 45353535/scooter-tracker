package org.bidon.sdk.ads.rewarded;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0001J\t\u0010\u000b\u001a\u00020\u0007H\u0096\u0001J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\rH\u0096\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0096\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u0011\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0096\u0001¨\u0006\u001d"}, d2 = {"Lorg/bidon/sdk/ads/rewarded/RewardedAd;", "Lorg/bidon/sdk/ads/rewarded/Rewarded;", "auctionKey", "", "<init>", "(Ljava/lang/String;)V", "addExtra", "", C4240b4.i.W, "value", "", "destroyAd", "getExtras", "", "isReady", "", "loadAd", "activity", "Landroid/app/Activity;", "pricefloor", "", "notifyLoss", "winnerDemandId", "winnerPrice", "notifyWin", "setRewardedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/bidon/sdk/ads/rewarded/RewardedListener;", "showAd", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RewardedAd implements Rewarded {
    private final /* synthetic */ RewardedImpl $$delegate_0;

    public RewardedAd() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    public void addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.$$delegate_0.addExtra(key, value);
    }

    @Override // org.bidon.sdk.ads.rewarded.Rewarded
    public void destroyAd() {
        this.$$delegate_0.destroyAd();
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    @NotNull
    public Map<String, Object> getExtras() {
        return this.$$delegate_0.getExtras();
    }

    @Override // org.bidon.sdk.ads.rewarded.Rewarded
    public boolean isReady() {
        return this.$$delegate_0.isReady();
    }

    @Override // org.bidon.sdk.ads.rewarded.Rewarded
    public void loadAd(@NotNull Activity activity, double pricefloor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.$$delegate_0.loadAd(activity, pricefloor);
    }

    @Override // org.bidon.sdk.stats.WinLossNotifier
    public void notifyLoss(@NotNull String winnerDemandId, double winnerPrice) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.$$delegate_0.notifyLoss(winnerDemandId, winnerPrice);
    }

    @Override // org.bidon.sdk.stats.WinLossNotifier
    public void notifyWin() {
        this.$$delegate_0.notifyWin();
    }

    @Override // org.bidon.sdk.ads.rewarded.Rewarded
    public void setRewardedListener(@NotNull RewardedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.$$delegate_0.setRewardedListener(listener);
    }

    @Override // org.bidon.sdk.ads.rewarded.Rewarded
    public void showAd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.$$delegate_0.showAd(activity);
    }

    public RewardedAd(@Nullable String str) {
        this.$$delegate_0 = new RewardedImpl(null, str, null, 5, null);
    }

    public /* synthetic */ RewardedAd(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
