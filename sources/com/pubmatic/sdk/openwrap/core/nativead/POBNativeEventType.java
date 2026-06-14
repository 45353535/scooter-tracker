package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public enum POBNativeEventType {
    IMPRESSION(1),
    VIEWABLE_MRC50(2),
    VIEWABLE_MRC100(3),
    VIEWABLE_VIDEO_MRC50(4),
    OMID(555);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f62889a;

    POBNativeEventType(int i10) {
        this.f62889a = i10;
    }

    @Nullable
    public static POBNativeEventType getEventType(int i10) {
        if (i10 == 555) {
            return OMID;
        }
        if (i10 == 1) {
            return IMPRESSION;
        }
        if (i10 == 2) {
            return VIEWABLE_MRC50;
        }
        if (i10 == 3) {
            return VIEWABLE_MRC100;
        }
        if (i10 != 4) {
            return null;
        }
        return VIEWABLE_VIDEO_MRC50;
    }

    public int getEventTypeValue() {
        return this.f62889a;
    }
}
