package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f21512a;

    public i(q qVar) {
        this.f21512a = qVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f21512a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureAvailable", IAlog.a(qVar));
        q.a(this.f21512a, surfaceTexture);
        x xVar = this.f21512a.f21525d;
        if (xVar != null) {
            z zVar = xVar.f21544a;
            zVar.getClass();
            IAlog.a("%s onTextureViewAvailable", IAlog.a(zVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        q qVar = this.f21512a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureDestroyed", IAlog.a(qVar));
        this.f21512a.i();
        this.f21512a.a((Surface) null);
        q qVar2 = this.f21512a;
        qVar2.f21536o = true;
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f21526e;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
            IAlog.a("%sReleasing surface texture", IAlog.a(qVar2));
            this.f21512a.f21532k = null;
            return true;
        }
        IAlog.a("%s caching surface texture", IAlog.a(qVar2));
        q qVar3 = this.f21512a;
        qVar3.f21532k = surfaceTexture;
        qVar3.f21530i.post(new h(this));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f21512a;
        if (qVar.f21526e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar = this.f21512a.f21525d;
        if (xVar != null && (fVar = xVar.f21544a.f21547a) != null && (qVar = fVar.f23252a) != null) {
            qVar.f21530i.post(new n(qVar));
        }
        q qVar2 = this.f21512a;
        if (!qVar2.f21536o || (surface = qVar2.f21533l) == null) {
            return;
        }
        qVar2.a(surface);
        this.f21512a.f21536o = false;
    }
}
