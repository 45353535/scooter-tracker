package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class q implements com.fyber.inneractive.sdk.player.mediaplayer.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21522a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f21525d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.c f21527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21528g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f21530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextureView f21531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f21532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Surface f21533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f21534m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21536o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.b f21526e = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21535n = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f21523b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f21524c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.h f21529h = new com.fyber.inneractive.sdk.player.h(this);

    public q(Context context) {
        this.f21522a = context.getApplicationContext();
        this.f21530i = new Handler(context.getMainLooper());
        a(true);
    }

    public void a() {
        IAlog.a("%sdestroy started", IAlog.a(this));
        k();
        this.f21529h = null;
        com.fyber.inneractive.sdk.util.v.a(this.f21531j);
        this.f21531j = null;
        SurfaceTexture surfaceTexture = this.f21532k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f21532k = null;
        }
        Surface surface = this.f21533l;
        if (surface != null) {
            surface.release();
            this.f21533l = null;
        }
        this.f21530i.removeCallbacksAndMessages(null);
        this.f21523b.clear();
        this.f21527f = null;
        this.f21528g = true;
        IAlog.a("%sdestroy finished", IAlog.a(this));
    }

    public abstract void a(int i10, boolean z10);

    public abstract void a(Surface surface);

    public abstract void a(String str, int i10);

    public abstract void a(boolean z10);

    public abstract int b();

    public abstract void b(boolean z10);

    public abstract int c();

    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f21527f;
        if (cVar == null || (fVar = cVar.f21436a.f23256e) == null) {
            return;
        }
        if (z10) {
            if (fVar.f21106c == null || !fVar.f21107d) {
                return;
            }
            IAlog.a("%s mute", "OMVideo");
            try {
                fVar.f21106c.volumeChange(0.0f);
                return;
            } catch (Throwable th2) {
                fVar.a(th2);
                return;
            }
        }
        if (fVar.f21106c == null || !fVar.f21107d) {
            return;
        }
        IAlog.a("%s unMute", "OMVideo");
        try {
            fVar.f21106c.volumeChange(1.0f);
        } catch (Throwable th3) {
            fVar.a(th3);
        }
    }

    public abstract String d();

    public abstract void d(boolean z10);

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public boolean h() {
        return this.f21526e == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public abstract void i();

    public abstract void j();

    public final void k() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.h hVar = this.f21529h;
        if (hVar == null || (scheduledThreadPoolExecutor = hVar.f23269b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        hVar.f23269b = null;
    }

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f21531j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.f21531j = textureView;
            if (textureView != null) {
                i iVar = this.f21534m;
                if (iVar == null) {
                    iVar = new i(this);
                    this.f21534m = iVar;
                }
                textureView.setSurfaceTextureListener(iVar);
            }
            if (this.f21532k != null) {
                IAlog.a("%scalling setSurfaceTexture with cached texture", IAlog.a(this));
                if (this.f21531j.getSurfaceTexture() != null && this.f21531j.getSurfaceTexture().equals(this.f21532k)) {
                    IAlog.a("%scalling setSurfaceTexture with cached texture failed", IAlog.a(this));
                } else {
                    IAlog.a("%scalling setSurfaceTexture with cached texture success", IAlog.a(this));
                    this.f21531j.setSurfaceTexture(this.f21532k);
                }
            }
        }
    }

    public static void a(q qVar, SurfaceTexture surfaceTexture) {
        boolean zEquals = surfaceTexture.equals(qVar.f21532k);
        SurfaceTexture surfaceTexture2 = qVar.f21532k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        qVar.f21532k = surfaceTexture;
        Surface surface = qVar.f21533l;
        if (surface == null || !zEquals) {
            if (surface != null) {
                surface.release();
            }
            qVar.f21533l = new Surface(qVar.f21532k);
        }
        qVar.a(qVar.f21533l);
    }

    public void a(int i10) {
        this.f21530i.post(new l(this, i10));
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.f21526e) {
            return;
        }
        this.f21526e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.h hVar = this.f21529h;
            if (hVar != null && hVar.f23269b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                hVar.f23269b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(hVar.f23270c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            k();
        }
        this.f21530i.post(new m(this, bVar));
    }
}
