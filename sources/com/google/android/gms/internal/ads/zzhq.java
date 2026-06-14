package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public class zzhq extends zzhc {
    public final int zzb;

    public zzhq(zzhf zzhfVar, int i10, int i11) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzhq zza(IOException iOException, zzhf zzhfVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzgql.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new zzhp(iOException, zzhfVar) : new zzhq(iOException, zzhfVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }

    public zzhq(IOException iOException, zzhf zzhfVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzhq(String str, zzhf zzhfVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzhq(String str, @Nullable IOException iOException, zzhf zzhfVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = i11;
    }
}
