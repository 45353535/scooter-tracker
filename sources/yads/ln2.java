package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public final class ln2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f113165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jn2 f113166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hn2 f113167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f113168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kn2 f113170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f113171g;

    public ln2(Context context, jn2 jn2Var) {
        hn2 hn2Var = ti0.f116250h;
        this.f113165a = context.getApplicationContext();
        this.f113166b = jn2Var;
        this.f113167c = hn2Var;
        this.f113168d = w83.b();
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.f113171g = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.f113171g.post(new Runnable() { // from class: yads.xi
            @Override // java.lang.Runnable
            public final void run() {
                this.f117821b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        final int iA = this.f113167c.a(this.f113165a);
        if (this.f113169e != iA) {
            this.f113169e = iA;
            this.f113168d.post(new Runnable() { // from class: yads.yi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118190b.a(iA);
                }
            });
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if ((this.f113167c.f111639b & 1) != 0) {
            if (w83.f117341a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f113165a.getSystemService("connectivity");
                connectivityManager.getClass();
                kn2 kn2Var = new kn2(this);
                this.f113170f = kn2Var;
                connectivityManager.registerDefaultNetworkCallback(kn2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.f113167c.f111639b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.f113167c.f111639b & 4) != 0) {
            if (w83.f117341a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((this.f113167c.f111639b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f113165a.registerReceiver(new in2(this), intentFilter, null, this.f113168d);
        return this.f113169e;
    }

    public final /* synthetic */ void a(int i10) {
        this.f113166b.a(this, i10);
    }
}
