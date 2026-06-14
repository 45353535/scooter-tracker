package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3976q7 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3901n7 f39351k = new C3901n7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f39352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3878m9 f39357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J8 f39358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T7 f39359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f39360i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3926o7 f39361j = new C3926o7(this);

    public C3976q7(byte b10, String str, int i10, int i11, int i12, InterfaceC3878m9 interfaceC3878m9) {
        this.f39352a = b10;
        this.f39353b = str;
        this.f39354c = i10;
        this.f39355d = i11;
        this.f39356e = i12;
        this.f39357f = interfaceC3878m9;
    }

    public final void a(View view) {
        J8 j82;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f39357f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (Intrinsics.areEqual(this.f39353b, "video") || Intrinsics.areEqual(this.f39353b, "audio") || (j82 = this.f39358g) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        j82.f37110a.remove(view);
        j82.f37111b.remove(view);
        j82.f37112c.a(view);
        if (j82.f37110a.isEmpty()) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39357f;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            J8 j83 = this.f39358g;
            if (j83 != null) {
                j83.f37110a.clear();
                j83.f37111b.clear();
                j83.f37112c.a();
                j83.f37114e.removeMessages(0);
                j83.f37112c.b();
            }
            this.f39358g = null;
        }
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f39357f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        T7 t72 = this.f39359h;
        if (t72 != null) {
            t72.a(view);
            if (t72.f37738a.isEmpty()) {
                InterfaceC3878m9 interfaceC3878m92 = this.f39357f;
                if (interfaceC3878m92 != null) {
                    ((C3903n9) interfaceC3878m92).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                T7 t73 = this.f39359h;
                if (t73 != null) {
                    t73.b();
                }
                this.f39359h = null;
            }
        }
        this.f39360i.remove(view);
    }

    public final void a(View view, View token, Ln listener, AdConfig.ViewabilityConfig config, boolean z10) {
        int companionVisibilityMinPercentageViewed;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(config, "config");
        InterfaceC3878m9 interfaceC3878m9 = this.f39357f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        T7 t72 = this.f39359h;
        if (t72 == null) {
            if (z10) {
                t72 = new S3(config, this.f39357f);
            } else {
                t72 = new T7(config, (byte) 1, this.f39357f);
            }
            this.f39359h = t72;
        }
        C3951p7 c3951p7 = new C3951p7(this);
        InterfaceC3878m9 interfaceC3878m92 = t72.f37741d;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        t72.f37745h = c3951p7;
        this.f39360i.put(view, listener);
        if (z10) {
            companionVisibilityMinPercentageViewed = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.f39356e;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        t72.a(view, view, token, companionVisibilityMinPercentageViewed);
    }

    public final void a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f39357f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("HtmlAdTracker", "onActivityStarted");
        }
        J8 j82 = this.f39358g;
        if (j82 != null) {
            String TAG = j82.f37113d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            for (Map.Entry entry : j82.f37110a.entrySet()) {
                View view = (View) entry.getKey();
                H8 h82 = (H8) entry.getValue();
                T7 t72 = j82.f37112c;
                View view2 = h82.f36994a;
                int i10 = h82.f36995b;
                t72.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                t72.a(view, view, view2, i10);
            }
            if (!j82.f37114e.hasMessages(0)) {
                j82.f37114e.postDelayed(j82.f37115f, j82.f37116g);
            }
            j82.f37112c.e();
        }
        T7 t73 = this.f39359h;
        if (t73 != null) {
            t73.e();
        }
    }

    public final J8 a(byte b10, AdConfig.ViewabilityConfig viewabilityConfig) {
        J8 j82 = this.f39358g;
        if (j82 != null) {
            return j82;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f39357f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b10));
        }
        T7 t72 = new T7(viewabilityConfig, b10, this.f39357f);
        InterfaceC3878m9 interfaceC3878m92 = this.f39357f;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b10));
        }
        J8 j83 = new J8(viewabilityConfig, t72, this.f39361j);
        this.f39358g = j83;
        return j83;
    }
}
