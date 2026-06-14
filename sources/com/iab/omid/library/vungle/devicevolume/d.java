package com.iab.omid.library.vungle.devicevolume;

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
    private final Handler f36358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f36359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f36360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.a f36361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f36362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f36363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f36364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f36365h;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0434a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f36367a;

            RunnableC0434a(float f10) {
                this.f36367a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f36362e.a(this.f36367a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f36364g.set(false);
            if (((Float) d.this.f36363f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f36358a.post(new RunnableC0434a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.vungle.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f36363f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f36364g = new AtomicBoolean(false);
        this.f36365h = Executors.newSingleThreadExecutor();
        this.f36358a = handler;
        this.f36359b = context;
        this.f36360c = (AudioManager) context.getSystemService("audio");
        this.f36361d = aVar;
        this.f36362e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f36361d.a(this.f36360c.getStreamVolume(3), this.f36360c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f36364g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f36365h.submit(new a());
    }

    public void b() {
        d();
        this.f36359b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f36359b.getContentResolver().unregisterContentObserver(this);
    }
}
