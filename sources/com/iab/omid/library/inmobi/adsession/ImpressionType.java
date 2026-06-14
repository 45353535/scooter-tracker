package com.iab.omid.library.inmobi.adsession;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes9.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(C4240b4.i.f42648r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String impressionType;

    ImpressionType(String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.impressionType;
    }
}
