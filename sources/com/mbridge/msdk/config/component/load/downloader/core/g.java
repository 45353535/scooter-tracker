package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class g implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f46997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f46998c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile d f47001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f46996a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b f46999d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f47000e = true;

    class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f47002a;

        a(CountDownLatch countDownLatch) {
            this.f47002a = countDownLatch;
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
        public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            synchronized (g.this.f46996a) {
                try {
                    if (g.this.f47000e) {
                        g.this.f46999d = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f47002a.countDown();
        }
    }

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f47001f = dVar;
        this.f46998c = bVar;
        this.f46997b = cVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        String strF = this.f47001f.f();
        if (this.f47001f.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar.a(true);
            return dVar;
        }
        if (this.f46998c.c() == 0) {
            com.mbridge.msdk.config.component.load.downloader.d dVar2 = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar2.b(true);
            return dVar2;
        }
        String strE = this.f46998c.e();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f46997b.a(strF, strE, new a(countDownLatch));
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f46996a) {
                    this.f47000e = false;
                }
            } catch (InterruptedException e10) {
                q0.a(IDownloadTask.TAG, e10.getMessage(), e10);
                countDownLatch.countDown();
                synchronized (this.f46996a) {
                    this.f47000e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.d dVarRun = k.a(this.f47001f, this.f46999d, this.f46997b, strF, this.f46998c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVarRun) || !dVarRun.c()) {
                if (this.f46998c != null) {
                    this.f46998c.a(false);
                }
                return n.a(this.f47001f, this.f46999d, this.f46997b, this.f46998c).run();
            }
            if (this.f46998c != null) {
                this.f46998c.a(true);
                this.f46998c.a(this.f47001f.l());
                this.f46998c.a(this.f46999d.d());
                this.f46998c.a(((this.f47001f.g() * 1.0f) / this.f47001f.l()) * 100.0f);
            }
            a(this.f47001f, this.f46998c);
            this.f46999d = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f46999d.c(), this.f46999d.e(), this.f46999d.b(), this.f46999d.i(), System.currentTimeMillis(), this.f47001f.l(), this.f46999d.a(), this.f46999d.f(), this.f46999d.d());
            this.f46997b.a(this.f46999d, this.f46998c.e());
            return dVarRun;
        } catch (Throwable th2) {
            synchronized (this.f46996a) {
                this.f47000e = false;
                throw th2;
            }
        }
    }

    static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            long jG = this.f47001f.g();
            long jL = this.f47001f.l();
            dVar.a(bVar, new DownloadProgress(jG, jL, com.mbridge.msdk.config.component.load.downloader.utils.b.a(jL, jG)));
        }
    }
}
