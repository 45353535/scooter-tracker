package com.google.android.gms.internal.common;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzq {
    static final CharSequence zza(Object obj, String str) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
