package com.appodeal.ads.unified;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedBannerCallback extends UnifiedViewAdCallback {
    public abstract void onAdLoaded(@NonNull View view, int i10);

    public abstract void onAdLoaded(@NonNull View view, int i10, @Nullable ImpressionLevelData impressionLevelData);
}
