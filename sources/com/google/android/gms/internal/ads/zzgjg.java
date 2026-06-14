package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgjg extends RuntimeException {
    public zzgjg() {
        this(0);
    }

    public zzgjg(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 3);
        sb2.append("r: ");
        sb2.append(i10);
        super(sb2.toString());
    }

    public zzgjg(int i10, Throwable th2) {
        super("r: 2", th2);
    }
}
