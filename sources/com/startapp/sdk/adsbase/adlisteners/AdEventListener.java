package com.startapp.sdk.adsbase.adlisteners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.sdk.adsbase.Ad;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public interface AdEventListener {
    @Keep
    void onFailedToReceiveAd(@Nullable Ad ad2);

    @Keep
    void onReceiveAd(@NonNull Ad ad2);
}
