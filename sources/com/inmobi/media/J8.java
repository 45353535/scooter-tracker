package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f37110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f37111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f37112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f37114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I8 f37115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f37116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3926o7 f37117h;

    public J8(AdConfig.ViewabilityConfig viewabilityConfig, T7 visibilityTracker, C3926o7 listener) {
        Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f37110a = weakHashMap;
        this.f37111b = weakHashMap2;
        this.f37112c = visibilityTracker;
        this.f37113d = J8.class.getSimpleName();
        this.f37116g = viewabilityConfig.getImpressionPollIntervalMillis();
        G8 g82 = new G8(this);
        InterfaceC3878m9 interfaceC3878m9 = visibilityTracker.f37741d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.f37745h = g82;
        this.f37114e = handler;
        this.f37115f = new I8(this);
        this.f37117h = listener;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f37110a.remove(view);
        this.f37111b.remove(view);
        this.f37112c.a(view);
    }
}
