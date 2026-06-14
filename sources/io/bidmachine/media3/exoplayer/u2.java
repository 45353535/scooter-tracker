package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes12.dex */
final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f81310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.q f81311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f81312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f81313d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f81314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f81315b;

        public a(Context context) {
            this.f81314a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f81315b == null) {
                PowerManager powerManager = (PowerManager) this.f81314a.getSystemService("power");
                if (powerManager == null) {
                    q9.u.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f81315b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f81315b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public u2(Context context, Looper looper, q9.h hVar) {
        this.f81310a = new a(context.getApplicationContext());
        this.f81311b = hVar.createHandler(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f81312c == z10) {
            return;
        }
        this.f81312c = z10;
        final boolean z11 = this.f81313d;
        this.f81311b.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.s2
            @Override // java.lang.Runnable
            public final void run() {
                this.f81295b.f81310a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f81313d == z10) {
            return;
        }
        this.f81313d = z10;
        if (this.f81312c) {
            this.f81311b.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.t2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81304b.f81310a.a(true, z10);
                }
            });
        }
    }
}
