package yads;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class rx implements ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115636a;

    public rx(List list) {
        this.f115636a = list;
    }

    @Override // yads.ze
    public final void a(View view) {
        Iterator it = this.f115636a.iterator();
        while (it.hasNext()) {
            ((ze) it.next()).a(view);
        }
    }

    @Override // yads.ze
    public final void cancel() {
        Iterator it = this.f115636a.iterator();
        while (it.hasNext()) {
            ((ze) it.next()).cancel();
        }
    }
}
