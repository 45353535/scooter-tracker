package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgid extends RuntimeException {
    zzgid(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 3);
        sb2.append("r: ");
        sb2.append(i10);
        super(sb2.toString());
    }
}
