package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21 + String.valueOf(i11).length() + 1);
        sb2.append("Buffer too small (");
        sb2.append(i10);
        sb2.append(" < ");
        sb2.append(i11);
        sb2.append(")");
        super(sb2.toString());
    }
}
