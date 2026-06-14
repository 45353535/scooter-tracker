package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbbl extends zzbby {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbbl(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        super(zzbakVar, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", zzawgVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zza(ExifInterface.LONGITUDE_EAST);
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zza(zzh);
        }
    }
}
