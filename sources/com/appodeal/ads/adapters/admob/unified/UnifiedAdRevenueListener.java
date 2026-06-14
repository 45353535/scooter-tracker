package com.appodeal.ads.adapters.admob.unified;

import com.appodeal.ads.unified.UnifiedAdCallback;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdRevenueListener;", "Lcom/google/android/gms/ads/OnPaidEventListener;", "callback", "Lcom/appodeal/ads/unified/UnifiedAdCallback;", "responseInfo", "Lcom/google/android/gms/ads/ResponseInfo;", "<init>", "(Lcom/appodeal/ads/unified/UnifiedAdCallback;Lcom/google/android/gms/ads/ResponseInfo;)V", "onPaidEvent", "", "adValue", "Lcom/google/android/gms/ads/AdValue;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnifiedAdRevenueListener implements OnPaidEventListener {

    @NotNull
    private final UnifiedAdCallback callback;

    @Nullable
    private final ResponseInfo responseInfo;

    public UnifiedAdRevenueListener(@NotNull UnifiedAdCallback callback, @Nullable ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.responseInfo = responseInfo;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(@NotNull AdValue adValue) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        this.callback.onAdRevenueReceived(UnifiedAdRevenueListenerKt.toImpressionLevelData(adValue, this.responseInfo));
    }
}
