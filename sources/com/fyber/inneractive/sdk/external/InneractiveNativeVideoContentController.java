package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class InneractiveNativeVideoContentController extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f20594a;

    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) v.a(this.f20594a)) != null) {
            ((Renderer) this.f20594a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) v.a(this.f20594a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f20594a = new WeakReference(renderer);
    }
}
