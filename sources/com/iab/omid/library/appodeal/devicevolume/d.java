package com.iab.omid.library.appodeal.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f34376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.a f34377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f34378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<Float> f34379e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            if (((Float) d.this.f34379e.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f34378d.a(fA);
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.appodeal.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f34379e = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f34375a = context;
        this.f34376b = (AudioManager) context.getSystemService("audio");
        this.f34377c = aVar;
        this.f34378d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f34377c.a(this.f34376b.getStreamVolume(3), this.f34376b.getStreamMaxVolume(3));
    }

    private void d() {
        new Thread(new a()).start();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        d();
    }

    public void b() {
        d();
        this.f34375a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f34375a.getContentResolver().unregisterContentObserver(this);
    }
}
