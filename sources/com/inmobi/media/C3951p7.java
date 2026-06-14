package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3951p7 implements Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3976q7 f39250a;

    public C3951p7(C3976q7 c3976q7) {
        this.f39250a = c3976q7;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Ln ln = (Ln) this.f39250a.f39360i.get(view);
            if (ln != null) {
                Oh oh2 = (Oh) ln;
                Intrinsics.checkNotNullParameter(view, "view");
                if (view instanceof GestureDetectorOnGestureListenerC3635ci) {
                    if (oh2.f37503a.hasWindowFocus()) {
                        oh2.f37503a.d(true);
                    } else {
                        oh2.f37503a.d(false);
                    }
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            Ln ln2 = (Ln) this.f39250a.f39360i.get(view2);
            if (ln2 != null) {
                Oh oh3 = (Oh) ln2;
                Intrinsics.checkNotNullParameter(view2, "view");
                if (view2 instanceof GestureDetectorOnGestureListenerC3635ci) {
                    if (oh3.f37503a.hasWindowFocus()) {
                        oh3.f37503a.d(false);
                    } else {
                        oh3.f37503a.d(false);
                    }
                }
            }
        }
    }
}
