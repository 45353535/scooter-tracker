package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import androidx.annotation.MainThread;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.d10;
import yads.fn3;
import yads.or3;
import yads.pr3;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/ads/rewarded/RewardedAdLoader;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/rewarded/RewardedAdLoadListener;", "rewardedAdLoadListener", "", "setAdLoadListener", "(Lcom/yandex/mobile/ads/rewarded/RewardedAdLoadListener;)V", "Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "adRequestConfiguration", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequestConfiguration;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
@MainThread
public final class RewardedAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d10 f68295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fn3 f68296b = new fn3();

    public RewardedAdLoader(@NotNull Context context) {
        this.f68295a = new d10(context, new pr3(context));
    }

    public final void loadAd(@NotNull AdRequestConfiguration adRequestConfiguration) {
        this.f68295a.f109691a.a(this.f68296b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(@Nullable RewardedAdLoadListener rewardedAdLoadListener) {
        this.f68295a.f109691a.a(rewardedAdLoadListener != null ? new or3(rewardedAdLoadListener) : null);
    }
}
