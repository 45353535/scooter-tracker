package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class mj extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f113520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f113521c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f113526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f113527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f113528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f113529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f113531m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f113519a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final da1 f113522d = new da1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final da1 f113523e = new da1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f113524f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f113525g = new ArrayDeque();

    public mj(HandlerThread handlerThread) {
        this.f113520b = handlerThread;
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f113519a) {
            try {
                if (this.f113529k <= 0 && !this.f113530l) {
                    IllegalStateException illegalStateException = this.f113531m;
                    if (illegalStateException != null) {
                        this.f113531m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = this.f113528j;
                    if (codecException != null) {
                        this.f113528j = null;
                        throw codecException;
                    }
                    da1 da1Var = this.f113523e;
                    int i10 = da1Var.f109858c;
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = da1Var.f109859d;
                    int i11 = da1Var.f109856a;
                    int i12 = iArr[i11];
                    da1Var.f109856a = (i11 + 1) & da1Var.f109860e;
                    da1Var.f109858c = i10 - 1;
                    if (i12 >= 0) {
                        if (this.f113526h == null) {
                            throw new IllegalStateException();
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f113524f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i12 == -2) {
                        this.f113526h = (MediaFormat) this.f113525g.remove();
                    }
                    return i12;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f113519a) {
            try {
                if (this.f113530l) {
                    return;
                }
                long j10 = this.f113529k - 1;
                this.f113529k = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                if (!this.f113525g.isEmpty()) {
                    this.f113527i = (MediaFormat) this.f113525g.getLast();
                }
                da1 da1Var = this.f113522d;
                da1Var.f109856a = 0;
                da1Var.f109857b = -1;
                da1Var.f109858c = 0;
                da1 da1Var2 = this.f113523e;
                da1Var2.f109856a = 0;
                da1Var2.f109857b = -1;
                da1Var2.f109858c = 0;
                this.f113524f.clear();
                this.f113525g.clear();
                this.f113528j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f113519a) {
            this.f113528j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f113519a) {
            this.f113522d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f113519a) {
            try {
                MediaFormat mediaFormat = this.f113527i;
                if (mediaFormat != null) {
                    this.f113523e.a(-2);
                    this.f113525g.add(mediaFormat);
                    this.f113527i = null;
                }
                this.f113523e.a(i10);
                this.f113524f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f113519a) {
            this.f113523e.a(-2);
            this.f113525g.add(mediaFormat);
            this.f113527i = null;
        }
    }

    public final void a() {
        synchronized (this.f113519a) {
            this.f113529k++;
            Handler handler = this.f113521c;
            int i10 = w83.f117341a;
            handler.post(new Runnable() { // from class: yads.on
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114376b.b();
                }
            });
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.f113521c == null) {
            this.f113520b.start();
            Handler handler = new Handler(this.f113520b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.f113521c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.f113519a) {
            this.f113531m = illegalStateException;
        }
    }
}
