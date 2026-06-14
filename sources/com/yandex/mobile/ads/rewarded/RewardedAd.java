package com.yandex.mobile.ads.rewarded;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.ironsource.C4424m2;
import com.yandex.mobile.ads.common.AdInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/mobile/ads/rewarded/RewardedAd;", "", "Lcom/yandex/mobile/ads/rewarded/RewardedAdEventListener;", "rewardedAdEventListener", "", "setAdEventListener", "(Lcom/yandex/mobile/ads/rewarded/RewardedAdEventListener;)V", "Landroid/app/Activity;", "activity", C4424m2.f43623v, "(Landroid/app/Activity;)V", "Lcom/yandex/mobile/ads/common/AdInfo;", "getInfo", "()Lcom/yandex/mobile/ads/common/AdInfo;", "info", "", "getAdAttributes", "()Ljava/util/List;", "adAttributes", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
public interface RewardedAd {
    @NotNull
    List<Object> getAdAttributes();

    @NotNull
    AdInfo getInfo();

    void setAdEventListener(@Nullable RewardedAdEventListener rewardedAdEventListener);

    void show(@NotNull Activity activity);
}
