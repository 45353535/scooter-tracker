package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzazo extends Exception {
    public zzazo(zzazp zzazpVar) {
        Objects.requireNonNull(zzazpVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzazo(zzazp zzazpVar, Throwable th2) {
        super(th2);
        Objects.requireNonNull(zzazpVar);
    }
}
