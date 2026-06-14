package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzatt extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatt(zzats zzatsVar, zzatq zzatqVar, long j10) {
        int i10 = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i10];
        objArr[0] = Long.valueOf(zzatsVar.zza());
        objArr[1] = Long.valueOf(zzatqVar.zza());
        int i11 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j10);
        objArr[i11] = lValueOf;
        super(String.format(locale, zzaui.zza("bk3t6gFTc30="), objArr));
        Optional.of(zzatqVar);
        Optional.of(lValueOf);
    }

    public zzatt(zzats zzatsVar, Throwable th2) {
        super(String.format(Locale.US, zzaui.zza("bk0="), Long.valueOf(zzatsVar.zza())), th2);
        Optional.empty();
        Optional.empty();
    }
}
