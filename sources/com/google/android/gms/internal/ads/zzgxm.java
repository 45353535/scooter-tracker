package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgxm {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgxb zzgxbVar = new zzgxb();
        file.getClass();
        zzgup zzgupVarZzp = zzgup.zzp(new zzgxj[0]);
        bArr.getClass();
        FileOutputStream fileOutputStreamZza = zzgxk.zza(file, zzgupVarZzp, zzgxbVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th2) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgrc.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgrc.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgxl zzgxlVar = new zzgxl(file, null);
        zzgxb zzgxbVar = new zzgxb();
        zzgup zzgupVarZzp = zzgup.zzp(new zzgxj[0]);
        zzgxi zzgxiVarZza = zzgxi.zza();
        try {
            InputStream inputStreamZza = zzgxlVar.zza();
            zzgxiVarZza.zzb(inputStreamZza);
            FileOutputStream fileOutputStreamZza = zzgxk.zza(file2, zzgupVarZzp, zzgxbVar);
            zzgxiVarZza.zzb(fileOutputStreamZza);
            int i10 = zzgxf.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int i11 = inputStreamZza.read(bArr);
                if (i11 == -1) {
                    break;
                } else {
                    fileOutputStreamZza.write(bArr, 0, i11);
                }
            }
            zzgxiVarZza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th2) {
            try {
                throw zzgxiVarZza.zzc(th2);
            } catch (Throwable th3) {
                zzgxiVarZza.close();
                throw th3;
            }
        }
    }
}
