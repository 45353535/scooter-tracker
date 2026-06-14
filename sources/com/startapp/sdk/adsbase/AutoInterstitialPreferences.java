package com.startapp.sdk.adsbase;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = -9010452850291284559L;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(AdsCommonMetaData.k().f());
        setSecondsBetweenAds(AdsCommonMetaData.k().g());
    }

    @Keep
    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    @Keep
    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    @Keep
    public AutoInterstitialPreferences setActivitiesBetweenAds(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.activitiesBetweenAds = i10;
        return this;
    }

    @Keep
    public AutoInterstitialPreferences setSecondsBetweenAds(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.secondsBetweenAds = i10;
        return this;
    }
}
