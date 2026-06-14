package com.iab.omid.library.chartboost.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f34761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f34762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f34763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.a f34764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f34765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f34766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f34767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f34768h;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.chartboost.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0384a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f34770a;

            RunnableC0384a(float f10) {
                this.f34770a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f34765e.a(this.f34770a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f34767g.set(false);
            if (((Float) d.this.f34766f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f34761a.post(new RunnableC0384a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.chartboost.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f34766f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f34767g = new AtomicBoolean(false);
        this.f34768h = Executors.newSingleThreadExecutor();
        this.f34761a = handler;
        this.f34762b = context;
        this.f34763c = (AudioManager) context.getSystemService("audio");
        this.f34764d = aVar;
        this.f34765e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f34764d.a(this.f34763c.getStreamVolume(3), this.f34763c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f34767g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f34768h.submit(new a());
    }

    public void b() {
        d();
        this.f34762b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f34762b.getContentResolver().unregisterContentObserver(this);
    }
}
