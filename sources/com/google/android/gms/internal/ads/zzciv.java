package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzciv extends zzhq {
    public zzciv(int i10, Map map, zzhf zzhfVar, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("Response code: ");
        sb2.append(i10);
        super(sb2.toString(), zzhfVar, 2000, i11);
    }
}
