package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
public enum zzfsr {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(C4240b4.i.f42648r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzi;

    zzfsr(String str) {
        this.zzi = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzi;
    }
}
