package com.google.android.gms.internal.ads;

import androidx.collection.SieveCacheKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhay implements zzhbl {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzhay(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhay zza(String str) {
        return new zzhay(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzhyl zzhylVar) throws IOException {
        if (!(zzhylVar instanceof zzhyp)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzhylVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhja.zzc(zzhylVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < SieveCacheKt.NodeMetaAndPreviousMask) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzhbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzhql zzb() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhay.zzb():com.google.android.gms.internal.ads.zzhql");
    }
}
