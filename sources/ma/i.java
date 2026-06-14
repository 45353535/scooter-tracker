package ma;

import android.view.Surface;

/* JADX INFO: loaded from: classes12.dex */
public class i extends da.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f94575f;

    public i(Throwable th2, da.r rVar, Surface surface) {
        super(th2, rVar);
        this.f94574e = System.identityHashCode(surface);
        this.f94575f = surface == null || surface.isValid();
    }
}
