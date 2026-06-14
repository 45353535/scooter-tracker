package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class I8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f37056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f37057c;

    public I8(J8 impressionTracker) {
        Intrinsics.checkNotNullParameter(impressionTracker, "impressionTracker");
        this.f37055a = I8.class.getSimpleName();
        this.f37056b = new ArrayList();
        this.f37057c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String TAG = this.f37055a;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        J8 j82 = (J8) this.f37057c.get();
        if (j82 != null) {
            for (Map.Entry entry : j82.f37111b.entrySet()) {
                View view = (View) entry.getKey();
                H8 h82 = (H8) entry.getValue();
                String TAG2 = this.f37055a;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                Objects.toString(h82);
                if (SystemClock.uptimeMillis() - h82.f36997d >= h82.f36996c) {
                    String TAG3 = this.f37055a;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    C3926o7 c3926o7 = j82.f37117h;
                    c3926o7.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC3635ci) {
                        InterfaceC3878m9 interfaceC3878m9 = c3926o7.f39168a.f39357f;
                        if (interfaceC3878m9 != null) {
                            ((C3903n9) interfaceC3878m9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((GestureDetectorOnGestureListenerC3635ci) view).u();
                    }
                    this.f37056b.add(view);
                }
            }
            Iterator it = this.f37056b.iterator();
            while (it.hasNext()) {
                j82.a((View) it.next());
            }
            this.f37056b.clear();
            if (j82.f37111b.isEmpty() || j82.f37114e.hasMessages(0)) {
                return;
            }
            j82.f37114e.postDelayed(j82.f37115f, j82.f37116g);
        }
    }
}
