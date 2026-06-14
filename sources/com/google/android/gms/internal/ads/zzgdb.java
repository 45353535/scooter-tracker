package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgdb extends zzgct {
    private final ExecutorService zzb;
    private final zzgda zzc;
    private final Function zzd;

    public zzgdb(File file, ExecutorService executorService, zzgda zzgdaVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgdaVar;
        this.zzd = function;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzb() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgcy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzc(final Object obj) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgcx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ Object zzd() {
        Object objApply;
        Object objZzb;
        synchronized (this) {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.zza);
                    try {
                        objZzb = this.zzc.zzb(fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (zzgcw e10) {
                    objApply = this.zzd.apply(e10);
                    return objApply;
                } catch (IOException e11) {
                    objApply = this.zzd.apply(new zzgcw(e11));
                    return objApply;
                }
            } catch (FileNotFoundException unused) {
                objApply = this.zzc.zzc();
                return objApply;
            }
        }
        return objZzb;
    }

    final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgxm.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
            sb2.append(name);
            sb2.append(".temp");
            File file2 = new File(parent, sb2.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                file2.delete();
                throw e10;
            }
        }
        return null;
    }
}
