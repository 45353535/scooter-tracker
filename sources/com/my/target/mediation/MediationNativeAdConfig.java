package com.my.target.mediation;

import androidx.annotation.Nullable;
import com.my.target.common.menu.MenuFactory;

/* JADX INFO: loaded from: classes11.dex */
public interface MediationNativeAdConfig extends MediationAdConfig {
    int getAdChoicesPlacement();

    int getCachePolicy();

    @Nullable
    MenuFactory getMenuFactory();

    @Deprecated
    boolean isAutoLoadImages();

    @Deprecated
    boolean isAutoLoadVideo();
}
