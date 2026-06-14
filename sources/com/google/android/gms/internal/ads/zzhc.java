package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class zzhc extends IOException {
    public final int zza;

    public zzhc(int i10) {
        this.zza = i10;
    }

    public zzhc(@Nullable String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzhc(@Nullable String str, @Nullable Throwable th2, int i10) {
        super(str, th2);
        this.zza = i10;
    }

    public zzhc(@Nullable Throwable th2, int i10) {
        super(th2);
        this.zza = i10;
    }
}
