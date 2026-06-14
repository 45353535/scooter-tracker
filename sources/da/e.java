package da;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
class e implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f68485g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f68486h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f68487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f68488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f68489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f68490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q9.k f68491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68492f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.g(message);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f68495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f68497d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f68498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f68499f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f68494a = i10;
            this.f68495b = i11;
            this.f68496c = i12;
            this.f68498e = j10;
            this.f68499f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new q9.k());
    }

    private void c() {
        this.f68491e.c();
        ((Handler) q9.a.e(this.f68489c)).obtainMessage(3).sendToTarget();
        this.f68491e.a();
    }

    private static void d(t9.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f104979f;
        cryptoInfo.numBytesOfClearData = f(cVar.f104977d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = f(cVar.f104978e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) q9.a.e(e(cVar.f104975b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) q9.a.e(e(cVar.f104974a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f104976c;
        if (o0.f98837a >= 24) {
            androidx.media3.exoplayer.mediacodec.e.a();
            cryptoInfo.setPattern(androidx.media3.decoder.c.a(cVar.f104980g, cVar.f104981h));
        }
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] f(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r3 = 1
            if (r2 == r3) goto L43
            r3 = 2
            if (r2 == r3) goto L2e
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L28
            r3 = 4
            if (r2 == r3) goto L20
            java.util.concurrent.atomic.AtomicReference r2 = r8.f68490d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            androidx.compose.animation.core.c.a(r2, r4, r3)
            goto L57
        L20:
            java.lang.Object r1 = r9.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            r8.j(r1)
            goto L57
        L28:
            q9.k r1 = r8.f68491e
            r1.e()
            goto L57
        L2e:
            java.lang.Object r1 = r9.obj
            r7 = r1
            da.e$b r7 = (da.e.b) r7
            int r1 = r7.f68494a
            int r2 = r7.f68495b
            android.media.MediaCodec$CryptoInfo r3 = r7.f68497d
            long r4 = r7.f68498e
            int r6 = r7.f68499f
            r0 = r8
            r0.i(r1, r2, r3, r4, r6)
        L41:
            r4 = r7
            goto L57
        L43:
            java.lang.Object r0 = r9.obj
            r7 = r0
            da.e$b r7 = (da.e.b) r7
            int r1 = r7.f68494a
            int r2 = r7.f68495b
            int r3 = r7.f68496c
            long r4 = r7.f68498e
            int r6 = r7.f68499f
            r0 = r8
            r0.h(r1, r2, r3, r4, r6)
            goto L41
        L57:
            if (r4 == 0) goto L5c
            m(r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da.e.g(android.os.Message):void");
    }

    private void h(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f68487a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            androidx.compose.animation.core.c.a(this.f68490d, null, e10);
        }
    }

    private void i(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f68486h) {
                this.f68487a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            androidx.compose.animation.core.c.a(this.f68490d, null, e10);
        }
    }

    private void j(Bundle bundle) {
        try {
            this.f68487a.setParameters(bundle);
        } catch (RuntimeException e10) {
            androidx.compose.animation.core.c.a(this.f68490d, null, e10);
        }
    }

    private void k() {
        ((Handler) q9.a.e(this.f68489c)).removeCallbacksAndMessages(null);
        c();
    }

    private static b l() {
        ArrayDeque arrayDeque = f68485g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void m(b bVar) {
        ArrayDeque arrayDeque = f68485g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // da.p
    public void a(int i10, int i11, t9.c cVar, long j10, int i12) {
        maybeThrowException();
        b bVarL = l();
        bVarL.a(i10, i11, 0, j10, i12);
        d(cVar, bVarL.f68497d);
        ((Handler) o0.i(this.f68489c)).obtainMessage(2, bVarL).sendToTarget();
    }

    @Override // da.p
    public void flush() {
        if (this.f68492f) {
            try {
                k();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // da.p
    public void maybeThrowException() {
        RuntimeException runtimeException = (RuntimeException) this.f68490d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // da.p
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        maybeThrowException();
        b bVarL = l();
        bVarL.a(i10, i11, i12, j10, i13);
        ((Handler) o0.i(this.f68489c)).obtainMessage(1, bVarL).sendToTarget();
    }

    @Override // da.p
    public void setParameters(Bundle bundle) {
        maybeThrowException();
        ((Handler) o0.i(this.f68489c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // da.p
    public void shutdown() {
        if (this.f68492f) {
            flush();
            this.f68488b.quit();
        }
        this.f68492f = false;
    }

    @Override // da.p
    public void start() {
        if (this.f68492f) {
            return;
        }
        this.f68488b.start();
        this.f68489c = new a(this.f68488b.getLooper());
        this.f68492f = true;
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, q9.k kVar) {
        this.f68487a = mediaCodec;
        this.f68488b = handlerThread;
        this.f68491e = kVar;
        this.f68490d = new AtomicReference();
    }
}
