package com.startapp.sdk.adsbase.adinformation;

import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;

/* JADX INFO: loaded from: classes11.dex */
public enum AdInformationObject$Size {
    SMALL(AdInformationConfig.ImageResourceType.INFO_S, AdInformationConfig.ImageResourceType.INFO_EX_S),
    LARGE(AdInformationConfig.ImageResourceType.INFO_L, AdInformationConfig.ImageResourceType.INFO_EX_L);

    private final AdInformationConfig.ImageResourceType infoExtendedType;
    private final AdInformationConfig.ImageResourceType infoType;

    AdInformationObject$Size(AdInformationConfig.ImageResourceType imageResourceType, AdInformationConfig.ImageResourceType imageResourceType2) {
        this.infoType = imageResourceType;
        this.infoExtendedType = imageResourceType2;
    }

    public final AdInformationConfig.ImageResourceType a() {
        return this.infoType;
    }
}
