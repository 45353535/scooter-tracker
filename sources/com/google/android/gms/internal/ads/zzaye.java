package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaye {
    private final ListenableFuture zza;
    private final zzazk zzb;
    private final zzavz zzc;

    public zzaye(final Context context, Executor executor, zzavz zzavzVar, zzazk zzazkVar) {
        this.zzb = zzazkVar;
        this.zzc = zzavzVar;
        this.zza = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzayd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(context);
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzb(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaye.zzb(android.content.Context):java.lang.String");
    }

    private static String zzd(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i10 = fileInputStream.read(bArr); i10 != -1; i10 = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i10);
                }
                zzgxa zzgxaVarZzi = zzgxa.zzn().zzi();
                byte[] bArrDigest = messageDigest.digest();
                String strZzj = zzgxaVarZzi.zzj(bArrDigest, 0, bArrDigest.length);
                fileInputStream.close();
                return strZzj;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public final ListenableFuture zza() {
        return this.zza;
    }
}
