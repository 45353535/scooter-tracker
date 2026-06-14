package u9;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f105309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f105310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f105311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105312d;

    public h0() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f105309a) {
            try {
                if (this.f105310b == null) {
                    q9.a.g(this.f105312d == 0 && this.f105311c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f105311c = handlerThread;
                    handlerThread.start();
                    this.f105310b = this.f105311c.getLooper();
                }
                this.f105312d++;
                looper = this.f105310b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f105309a) {
            try {
                q9.a.g(this.f105312d > 0);
                int i10 = this.f105312d - 1;
                this.f105312d = i10;
                if (i10 == 0 && (handlerThread = this.f105311c) != null) {
                    handlerThread.quit();
                    this.f105311c = null;
                    this.f105310b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h0(Looper looper) {
        this.f105309a = new Object();
        this.f105310b = looper;
        this.f105311c = null;
        this.f105312d = 0;
    }
}
