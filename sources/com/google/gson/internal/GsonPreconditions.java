package com.google.gson.internal;

/* JADX INFO: loaded from: classes9.dex */
public final class GsonPreconditions {
    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }
}
