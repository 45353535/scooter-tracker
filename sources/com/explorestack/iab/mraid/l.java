package com.explorestack.iab.mraid;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public enum l {
    LOADING,
    DEFAULT,
    RESIZED,
    EXPANDED,
    HIDDEN;

    public String g() {
        return toString().toLowerCase(Locale.US);
    }
}
