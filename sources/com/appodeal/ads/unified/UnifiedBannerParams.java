package com.appodeal.ads.unified;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public interface UnifiedBannerParams extends UnifiedViewAdParams {
    int getMaxHeight(@NonNull Context context);

    int getMaxWidth(@NonNull Context context);

    boolean needLeaderBoard(@NonNull Context context);

    boolean useSmartBanners(@NonNull Context context);
}
