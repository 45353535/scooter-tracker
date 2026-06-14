package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzieq extends Exception {
    zzieq(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32 + String.valueOf(i11).length());
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i10);
        sb2.append(" of ");
        sb2.append(i11);
        super(sb2.toString());
    }
}
