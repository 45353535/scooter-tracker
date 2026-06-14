package com.appodeal.ads.unified;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedMrecCallback extends UnifiedViewAdCallback {
    public abstract void onAdLoaded(@NonNull View view);

    public abstract void onAdLoaded(@NonNull View view, @Nullable ImpressionLevelData impressionLevelData);
}
