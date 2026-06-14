package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public class zzfw {
    public final int zzd;

    public static String zze(int i10) {
        char c10 = (char) ((i10 >> 24) & 255);
        int length = String.valueOf(c10).length();
        char c11 = (char) ((i10 >> 16) & 255);
        int length2 = String.valueOf(c11).length();
        char c12 = (char) ((i10 >> 8) & 255);
        char c13 = (char) (i10 & 255);
        StringBuilder sb2 = new StringBuilder(length + length2 + String.valueOf(c12).length() + String.valueOf(c13).length());
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(c12);
        sb2.append(c13);
        return sb2.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
