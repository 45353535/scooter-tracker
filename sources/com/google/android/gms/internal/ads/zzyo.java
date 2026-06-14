package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyo extends zzat {
    public final zzguf zzc;

    public zzyo(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzguf.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzguf zzgufVar = this.zzc;
        String message = super.getMessage();
        if (zzgufVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgufVar);
        StringBuilder sb2 = new StringBuilder(length + 17 + strValueOf.length());
        sb2.append(message);
        sb2.append("\nsniff failures: ");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
