package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f10667h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Float f10668i = Float.valueOf(15.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f10669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f10671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f10672d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10673e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10675g;

    public interface a {
        void a(int i10);
    }

    i(k kVar) {
        this.f10671c = kVar;
        Context contextO = k.o();
        this.f10670b = contextO;
        this.f10669a = (AudioManager) contextO.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void d() {
        this.f10671c.O();
        if (o.a()) {
            this.f10671c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f10675g = f10667h;
        this.f10670b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f10671c.O();
        if (o.a()) {
            this.f10671c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f10670b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f10669a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f10669a.getRingerMode());
        }
    }

    private Float a() {
        if (this.f10669a == null) {
            return f10668i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th2) {
            this.f10671c.O();
            if (o.a()) {
                this.f10671c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th2);
            }
            return f10668i;
        }
    }

    public Float b() {
        if (this.f10669a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th2) {
            this.f10671c.O();
            if (o.a()) {
                this.f10671c.O().a("AudioSessionManager", "Unable to collect device volume", th2);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10674f = true;
            this.f10675g = this.f10669a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f10674f = false;
            if (this.f10675g != this.f10669a.getRingerMode()) {
                this.f10675g = f10667h;
                b(this.f10669a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f10673e) {
            try {
                if (this.f10672d.contains(aVar)) {
                    this.f10672d.remove(aVar);
                    if (this.f10672d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f10673e) {
            try {
                if (this.f10672d.contains(aVar)) {
                    return;
                }
                this.f10672d.add(aVar);
                if (this.f10672d.size() == 1) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b(final int i10) {
        if (this.f10674f) {
            return;
        }
        this.f10671c.O();
        if (o.a()) {
            this.f10671c.O().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f10673e) {
            try {
                for (final a aVar : this.f10672d) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar.a(i10);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
