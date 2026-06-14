package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f49775f = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f49776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f49777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49778c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f49779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f49780e;

    private static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d> f49781a;

        public a(d dVar) {
            this.f49781a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f49781a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f49776a = context;
        this.f49777b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f49777b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f49777b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f49775f = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.f49779d;
    }

    public void c() {
        if (this.f49776a != null) {
            this.f49780e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f49776a.registerReceiver(this.f49780e, intentFilter);
            this.f49778c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f49778c || (context = this.f49776a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f49780e);
            this.f49779d = null;
            this.f49778c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.f49779d = bVar;
    }
}
