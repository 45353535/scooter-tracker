package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzacd extends HandlerThread implements Handler.Callback {
    private zzdt zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzace zze;

    public zzacd() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdt zzdtVar;
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    int i11 = message.arg1;
                    zzdt zzdtVar2 = this.zza;
                    if (zzdtVar2 == null) {
                        throw null;
                    }
                    zzdtVar2.zza(i11);
                    this.zze = new zzace(this, this.zza.zzc(), i11 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdu e10) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzd = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzc = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.zzd = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    zzdtVar = this.zza;
                } finally {
                    try {
                    } finally {
                    }
                }
                if (zzdtVar == null) {
                    throw null;
                }
                zzdtVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzace zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdt(this.zzb, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzace zzaceVar = this.zze;
        zzaceVar.getClass();
        return zzaceVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
