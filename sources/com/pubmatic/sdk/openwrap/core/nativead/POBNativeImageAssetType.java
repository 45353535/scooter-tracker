package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public enum POBNativeImageAssetType {
    ICON(1),
    MAIN(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f62891a;

    POBNativeImageAssetType(int i10) {
        this.f62891a = i10;
    }

    @Nullable
    public static POBNativeImageAssetType getImageAssetType(int i10) {
        if (i10 == 1) {
            return ICON;
        }
        if (i10 != 3) {
            return null;
        }
        return MAIN;
    }

    public int getImageAssetTypeValue() {
        return this.f62891a;
    }
}
