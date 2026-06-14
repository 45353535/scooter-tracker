package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes12.dex */
final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f81403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.q f81404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f81405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f81406d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f81407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f81408b;

        public a(Context context) {
            this.f81407a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f81408b == null) {
                WifiManager wifiManager = (WifiManager) this.f81407a.getApplicationContext().getSystemService(X3.f42018b);
                if (wifiManager == null) {
                    q9.u.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f81408b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f81408b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public x2(Context context, Looper looper, q9.h hVar) {
        this.f81403a = new a(context.getApplicationContext());
        this.f81404b = hVar.createHandler(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f81405c == z10) {
            return;
        }
        this.f81405c = z10;
        final boolean z11 = this.f81406d;
        this.f81404b.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.v2
            @Override // java.lang.Runnable
            public final void run() {
                this.f81376b.f81403a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f81406d == z10) {
            return;
        }
        this.f81406d = z10;
        if (this.f81405c) {
            this.f81404b.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.w2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81396b.f81403a.a(true, z10);
                }
            });
        }
    }
}
