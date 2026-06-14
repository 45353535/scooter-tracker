package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class bt2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ em1 f109101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f109102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am1 f109103d;

    public bt2(em1 em1Var, CustomizableMediaView customizableMediaView, am1 am1Var) {
        this.f109101b = em1Var;
        this.f109102c = customizableMediaView;
        this.f109103d = am1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109101b.b(this.f109102c, this.f109103d);
    }
}
