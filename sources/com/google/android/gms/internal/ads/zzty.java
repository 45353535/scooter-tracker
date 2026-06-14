package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class zzty implements zzul {

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdq zzg;
    private boolean zzh;

    public zzty(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdqVar;
        this.zzf = new AtomicReference();
    }

    private static zztx zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zztx();
                }
                return (zztx) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    private static int[] zzj(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Nullable
    private static byte[] zzk(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zztw(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzb(int i10, int i11, int i12, long j10, int i13) {
        zzg();
        zztx zztxVarZzi = zzi();
        zztxVarZzi.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(1, zztxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzc(int i10, int i11, zzie zzieVar, long j10, int i12) {
        zzg();
        zztx zztxVarZzi = zzi();
        zztxVarZzi.zza(i10, 0, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = zztxVarZzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzieVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzieVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzieVar.zzc;
        if (Build.VERSION.SDK_INT >= 24) {
            androidx.media3.exoplayer.mediacodec.e.a();
            cryptoInfo.setPattern(androidx.media3.decoder.c.a(zzieVar.zzg, zzieVar.zzh));
        }
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(2, zztxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdq zzdqVar = this.zzg;
                zzdqVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdqVar.zzc();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void zzh(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r0 = r10.zzf
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            androidx.compose.animation.core.c.a(r0, r2, r1)
            goto L74
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L74
        L2a:
            r0 = move-exception
            r11 = r0
            java.util.concurrent.atomic.AtomicReference r0 = r10.zzf
            androidx.compose.animation.core.c.a(r0, r2, r11)
            goto L74
        L32:
            com.google.android.gms.internal.ads.zzdq r11 = r10.zzg
            r11.zza()
            goto L74
        L38:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zztx r11 = (com.google.android.gms.internal.ads.zztx) r11
            int r4 = r11.zza
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzty.zzb     // Catch: java.lang.RuntimeException -> L52
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L52
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.RuntimeException -> L52
        L52:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r10.zzf
            androidx.compose.animation.core.c.a(r1, r2, r0)
        L58:
            r2 = r11
            goto L74
        L5a:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zztx r11 = (com.google.android.gms.internal.ads.zztx) r11
            int r4 = r11.zza
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L6d
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6d
            goto L58
        L6d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r10.zzf
            androidx.compose.animation.core.c.a(r1, r2, r0)
            goto L58
        L74:
            if (r2 == 0) goto L81
            java.util.ArrayDeque r11 = com.google.android.gms.internal.ads.zzty.zza
            monitor-enter(r11)
            r11.add(r2)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7e
            goto L81
        L7e:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7e
            throw r0
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.zzh(android.os.Message):void");
    }
}
