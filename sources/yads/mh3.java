package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class mh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh3 f113505a;

    public mh3(kh3 kh3Var) {
        this.f113505a = kh3Var;
    }

    public final boolean a() {
        View view = this.f113505a.getView();
        return (view == null || qi3.b(view) || qi3.a(view) < 50) ? false : true;
    }
}
