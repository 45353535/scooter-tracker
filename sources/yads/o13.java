package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public final class o13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f114152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m13 f114153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f114154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n13 f114155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HandlerThread f114156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f114158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f114159i;

    public o13(Context context, Handler handler, sm0 sm0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f114151a = applicationContext;
        this.f114152b = handler;
        this.f114153c = sm0Var;
        AudioManager audioManager = (AudioManager) fi.a((AudioManager) applicationContext.getSystemService("audio"));
        this.f114154d = audioManager;
        this.f114157g = 3;
        this.f114158h = b(audioManager, 3);
        this.f114159i = a(audioManager, this.f114157g);
        n13 n13Var = new n13(this);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            HandlerThread handlerThread = new HandlerThread("StreamVolumeReceiver");
            this.f114156f = handlerThread;
            handlerThread.start();
            applicationContext.registerReceiver(n13Var, intentFilter, null, new Handler(this.f114156f.getLooper()));
            this.f114155e = n13Var;
        } catch (RuntimeException e10) {
            uf1.a(e10);
            HandlerThread handlerThread2 = this.f114156f;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.f114156f = null;
            }
        }
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            uf1.d("StreamVolumeManager", uf1.a("Could not retrieve stream volume for stream type " + i10, e10));
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final void a(int i10) {
        if (this.f114157g == i10) {
            return;
        }
        this.f114157g = i10;
        int iB = b(this.f114154d, i10);
        boolean zA = a(this.f114154d, this.f114157g);
        if (this.f114158h != iB || this.f114159i != zA) {
            this.f114158h = iB;
            this.f114159i = zA;
            ((sm0) this.f114153c).a(zA, iB);
        }
        ((sm0) this.f114153c).a();
    }

    public final void b() {
        n13 n13Var = this.f114155e;
        if (n13Var != null) {
            try {
                this.f114151a.unregisterReceiver(n13Var);
            } catch (RuntimeException e10) {
                uf1.d("StreamVolumeManager", uf1.a("Error unregistering stream volume receiver", e10));
            }
            this.f114155e = null;
        }
        HandlerThread handlerThread = this.f114156f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f114156f = null;
        }
    }

    public final int a() {
        if (w83.f117341a >= 28) {
            return this.f114154d.getStreamMinVolume(this.f114157g);
        }
        return 0;
    }

    public static boolean a(AudioManager audioManager, int i10) {
        if (w83.f117341a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return b(audioManager, i10) == 0;
    }
}
