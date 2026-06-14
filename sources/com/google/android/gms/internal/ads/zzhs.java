package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhs extends zzhq {
    public final int zzc;

    public zzhs(int i10, @Nullable String str, @Nullable IOException iOException, Map map, zzhf zzhfVar, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("Response code: ");
        sb2.append(i10);
        super(sb2.toString(), iOException, zzhfVar, 2004, 1);
        this.zzc = i10;
    }
}
