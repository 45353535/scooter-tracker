package com.iab.omid.library.pubmatic.devicevolume;

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
    private final Handler f35697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f35698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f35699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.pubmatic.devicevolume.a f35700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f35701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f35702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f35703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f35704h;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.pubmatic.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0413a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f35706a;

            RunnableC0413a(float f10) {
                this.f35706a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f35701e.a(this.f35706a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f35703g.set(false);
            if (((Float) d.this.f35702f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f35697a.post(new RunnableC0413a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.pubmatic.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f35702f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f35703g = new AtomicBoolean(false);
        this.f35704h = Executors.newSingleThreadExecutor();
        this.f35697a = handler;
        this.f35698b = context;
        this.f35699c = (AudioManager) context.getSystemService("audio");
        this.f35700d = aVar;
        this.f35701e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f35700d.a(this.f35699c.getStreamVolume(3), this.f35699c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f35703g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f35704h.submit(new a());
    }

    public void b() {
        d();
        this.f35698b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f35698b.getContentResolver().unregisterContentObserver(this);
    }
}
