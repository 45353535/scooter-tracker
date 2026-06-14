package com.inmobi.media;

import android.view.Surface;

/* JADX INFO: loaded from: classes9.dex */
public final class L7 implements Ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f37269a;

    public L7(N7 n72) {
        this.f37269a = n72;
    }

    @Override // com.inmobi.media.Ij
    public final void a() {
        this.f37269a.d();
    }

    @Override // com.inmobi.media.Ij
    public final void b() {
        this.f37269a.c();
    }

    @Override // com.inmobi.media.Ij
    public final void c() {
        Surface surface;
        N7 n72 = this.f37269a;
        if (n72.f37418q != null) {
            C3927o8 c3927o8 = n72.f37427z;
            if (c3927o8.f39175g || (surface = c3927o8.f39173e) == null) {
                return;
            }
            c3927o8.f39175g = true;
            c3927o8.f39170b.setVideoSurface(surface);
        }
    }
}
