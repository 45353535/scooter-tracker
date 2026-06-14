package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class G8 implements Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J8 f36927a;

    public G8(J8 j82) {
        this.f36927a = j82;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            H8 h82 = (H8) this.f36927a.f37110a.get(view);
            if (h82 == null) {
                this.f36927a.a(view);
            } else {
                H8 h83 = (H8) this.f36927a.f37111b.get(view);
                if (!Intrinsics.areEqual(h82.f36994a, h83 != null ? h83.f36994a : null)) {
                    h82.f36997d = SystemClock.uptimeMillis();
                    this.f36927a.f37111b.put(view, h82);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f36927a.f37111b.remove((View) it2.next());
        }
        J8 j82 = this.f36927a;
        if (j82.f37114e.hasMessages(0)) {
            return;
        }
        j82.f37114e.postDelayed(j82.f37115f, j82.f37116g);
    }
}
