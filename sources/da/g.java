package da;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.CircularIntArray;
import da.n;
import java.util.ArrayDeque;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class g extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f68505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f68506c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f68511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f68512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f68513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f68514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f68515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f68516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f68517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n.c f68518o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f68504a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CircularIntArray f68507d = new CircularIntArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CircularIntArray f68508e = new CircularIntArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f68509f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f68510g = new ArrayDeque();

    g(HandlerThread handlerThread) {
        this.f68505b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f68508e.addLast(-2);
        this.f68510g.add(mediaFormat);
    }

    private void f() {
        if (!this.f68510g.isEmpty()) {
            this.f68512i = (MediaFormat) this.f68510g.getLast();
        }
        this.f68507d.clear();
        this.f68508e.clear();
        this.f68509f.clear();
        this.f68510g.clear();
    }

    private boolean i() {
        return this.f68515l > 0 || this.f68516m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f68517n;
        if (illegalStateException == null) {
            return;
        }
        this.f68517n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f68514k;
        if (cryptoException == null) {
            return;
        }
        this.f68514k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f68513j;
        if (codecException == null) {
            return;
        }
        this.f68513j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f68504a) {
            try {
                if (this.f68516m) {
                    return;
                }
                long j10 = this.f68515l - 1;
                this.f68515l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f68504a) {
            this.f68517n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f68504a) {
            try {
                j();
                int iPopFirst = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f68507d.isEmpty()) {
                    iPopFirst = this.f68507d.popFirst();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f68504a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f68508e.isEmpty()) {
                    return -1;
                }
                int iPopFirst = this.f68508e.popFirst();
                if (iPopFirst >= 0) {
                    q9.a.i(this.f68511h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f68509f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iPopFirst == -2) {
                    this.f68511h = (MediaFormat) this.f68510g.remove();
                }
                return iPopFirst;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f68504a) {
            this.f68515l++;
            ((Handler) o0.i(this.f68506c)).post(new Runnable() { // from class: da.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68502b.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f68504a) {
            try {
                mediaFormat = this.f68511h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        q9.a.g(this.f68506c == null);
        this.f68505b.start();
        Handler handler = new Handler(this.f68505b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f68506c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f68504a) {
            this.f68514k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f68504a) {
            this.f68513j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f68504a) {
            try {
                this.f68507d.addLast(i10);
                n.c cVar = this.f68518o;
                if (cVar != null) {
                    cVar.onInputBufferAvailable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f68504a) {
            try {
                MediaFormat mediaFormat = this.f68512i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f68512i = null;
                }
                this.f68508e.addLast(i10);
                this.f68509f.add(bufferInfo);
                n.c cVar = this.f68518o;
                if (cVar != null) {
                    cVar.onOutputBufferAvailable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f68504a) {
            b(mediaFormat);
            this.f68512i = null;
        }
    }

    public void p(n.c cVar) {
        synchronized (this.f68504a) {
            this.f68518o = cVar;
        }
    }

    public void q() {
        synchronized (this.f68504a) {
            this.f68516m = true;
            this.f68505b.quit();
            f();
        }
    }
}
