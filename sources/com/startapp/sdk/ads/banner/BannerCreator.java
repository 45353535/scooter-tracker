package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public interface BannerCreator {
    @NonNull
    @Keep
    View create(@NonNull Context context, @Nullable BannerListener bannerListener);
}
