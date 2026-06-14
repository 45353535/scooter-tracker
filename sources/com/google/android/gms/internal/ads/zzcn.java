package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcn extends Exception {
    public zzcn(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb2.append(str);
        sb2.append(" ");
        sb2.append(strValueOf);
        super(sb2.toString());
    }
}
