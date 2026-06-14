package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class lj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f113109g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f113110h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f113111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f113112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jj f113113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f113114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hy f113115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113116f;

    public lj(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new hy());
    }

    public static kj b() {
        ArrayDeque arrayDeque = f113109g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new kj();
                }
                return (kj) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 0
            if (r0 == 0) goto L45
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r0 = r10.f113114d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r2.<init>(r11)
            androidx.compose.animation.core.c.a(r0, r1, r2)
            goto L60
        L1c:
            yads.hy r11 = r10.f113115e
            r11.d()
            goto L60
        L22:
            java.lang.Object r11 = r11.obj
            yads.kj r11 = (yads.kj) r11
            int r3 = r11.f112719a
            int r4 = r11.f112720b
            android.media.MediaCodec$CryptoInfo r5 = r11.f112722d
            long r6 = r11.f112723e
            int r8 = r11.f112724f
            java.lang.Object r9 = yads.lj.f113110h     // Catch: java.lang.RuntimeException -> L3d
            monitor-enter(r9)     // Catch: java.lang.RuntimeException -> L3d
            android.media.MediaCodec r2 = r10.f113111a     // Catch: java.lang.Throwable -> L3a
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3a
            goto L43
        L3a:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.RuntimeException -> L3d
        L3d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r10.f113114d
            androidx.compose.animation.core.c.a(r2, r1, r0)
        L43:
            r1 = r11
            goto L60
        L45:
            java.lang.Object r11 = r11.obj
            yads.kj r11 = (yads.kj) r11
            int r3 = r11.f112719a
            int r4 = r11.f112720b
            int r5 = r11.f112721c
            long r6 = r11.f112723e
            int r8 = r11.f112724f
            android.media.MediaCodec r2 = r10.f113111a     // Catch: java.lang.RuntimeException -> L59
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L59
            goto L43
        L59:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r10.f113114d
            androidx.compose.animation.core.c.a(r2, r1, r0)
            goto L43
        L60:
            if (r1 == 0) goto L65
            a(r1)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lj.a(android.os.Message):void");
    }

    public lj(MediaCodec mediaCodec, HandlerThread handlerThread, hy hyVar) {
        this.f113111a = mediaCodec;
        this.f113112b = handlerThread;
        this.f113115e = hyVar;
        this.f113114d = new AtomicReference();
    }

    public final void a() {
        if (this.f113116f) {
            try {
                jj jjVar = this.f113113c;
                jjVar.getClass();
                jjVar.removeCallbacksAndMessages(null);
                hy hyVar = this.f113115e;
                synchronized (hyVar) {
                    hyVar.f111800a = false;
                }
                jj jjVar2 = this.f113113c;
                jjVar2.getClass();
                jjVar2.obtainMessage(2).sendToTarget();
                this.f113115e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void a(int i10, y10 y10Var, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.f113114d.getAndSet(null);
        if (runtimeException == null) {
            kj kjVarB = b();
            kjVarB.f112719a = i10;
            kjVarB.f112720b = 0;
            kjVarB.f112721c = 0;
            kjVarB.f112723e = j10;
            kjVarB.f112724f = 0;
            MediaCodec.CryptoInfo cryptoInfo = kjVarB.f112722d;
            cryptoInfo.numSubSamples = y10Var.f118053f;
            int[] iArr = y10Var.f118051d;
            int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArrCopyOf != null && iArrCopyOf.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
                } else {
                    iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArrCopyOf;
            int[] iArr2 = y10Var.f118052e;
            int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr2 != null) {
                if (iArrCopyOf2 != null && iArrCopyOf2.length >= iArr2.length) {
                    System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
                } else {
                    iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
            byte[] bArr = y10Var.f118049b;
            byte[] bArrCopyOf = cryptoInfo.key;
            if (bArr != null) {
                if (bArrCopyOf != null && bArrCopyOf.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
                } else {
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArrCopyOf.getClass();
            cryptoInfo.key = bArrCopyOf;
            byte[] bArr2 = y10Var.f118048a;
            byte[] bArrCopyOf2 = cryptoInfo.iv;
            if (bArr2 != null) {
                if (bArrCopyOf2 != null && bArrCopyOf2.length >= bArr2.length) {
                    System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
                } else {
                    bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                }
            }
            bArrCopyOf2.getClass();
            cryptoInfo.iv = bArrCopyOf2;
            cryptoInfo.mode = y10Var.f118050c;
            if (w83.f117341a >= 24) {
                androidx.media3.exoplayer.mediacodec.e.a();
                cryptoInfo.setPattern(androidx.media3.decoder.c.a(y10Var.f118054g, y10Var.f118055h));
            }
            this.f113113c.obtainMessage(1, kjVarB).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public static void a(kj kjVar) {
        ArrayDeque arrayDeque = f113109g;
        synchronized (arrayDeque) {
            arrayDeque.add(kjVar);
        }
    }
}
