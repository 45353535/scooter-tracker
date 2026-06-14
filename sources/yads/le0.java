package yads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes4.dex */
public final class le0 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ re0 f113069a;

    public le0(re0 re0Var) {
        this.f113069a = re0Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f113069a.b();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f113069a.b();
    }
}
