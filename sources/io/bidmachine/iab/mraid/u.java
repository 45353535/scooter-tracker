package io.bidmachine.iab.mraid;

import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public enum u {
    LOADING,
    DEFAULT,
    RESIZED,
    EXPANDED,
    HIDDEN;

    public String g() {
        return toString().toLowerCase(Locale.US);
    }
}
