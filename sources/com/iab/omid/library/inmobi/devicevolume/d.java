package com.iab.omid.library.inmobi.devicevolume;

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
    private final Handler f35151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f35152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f35153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.a f35154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f35155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f35156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f35157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f35158h;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.inmobi.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0396a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f35160a;

            RunnableC0396a(float f10) {
                this.f35160a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f35155e.a(this.f35160a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f35157g.set(false);
            if (((Float) d.this.f35156f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f35151a.post(new RunnableC0396a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.inmobi.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f35156f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f35157g = new AtomicBoolean(false);
        this.f35158h = Executors.newSingleThreadExecutor();
        this.f35151a = handler;
        this.f35152b = context;
        this.f35153c = (AudioManager) context.getSystemService("audio");
        this.f35154d = aVar;
        this.f35155e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f35154d.a(this.f35153c.getStreamVolume(3), this.f35153c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f35157g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f35158h.submit(new a());
    }

    public void b() {
        d();
        this.f35152b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f35152b.getContentResolver().unregisterContentObserver(this);
    }
}
