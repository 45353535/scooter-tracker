package com.startapp.sdk.adsbase.adlisteners;

import androidx.annotation.Keep;
import com.startapp.sdk.adsbase.Ad;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public interface AdDisplayListener {
    @Keep
    void adClicked(Ad ad2);

    @Keep
    void adDisplayed(Ad ad2);

    @Keep
    void adHidden(Ad ad2);

    @Keep
    void adNotDisplayed(Ad ad2);
}
