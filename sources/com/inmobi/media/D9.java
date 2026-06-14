package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class D9 extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3837ki f36718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3976q7 f36719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3903n9 f36720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D9(C3837ki container, C3837ki renderView, C3976q7 htmlAdTracker, C3903n9 c3903n9) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.f36718d = renderView;
        this.f36719e = htmlAdTracker;
        this.f36720f = c3903n9;
        this.f36721g = D9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        View viewB;
        C3903n9 c3903n9 = this.f36720f;
        if (c3903n9 != null) {
            String tag = this.f36721g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c3903n9.a(tag, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.f36718d.setFriendlyViews(map);
        C3903n9 c3903n92 = this.f36720f;
        if (c3903n92 != null) {
            String tag2 = this.f36721g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            c3903n92.a(tag2, "startTrackingVisibility");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f36893a;
        C3837ki c3837ki = gestureDetectorOnGestureListenerC3635ci instanceof C3837ki ? (C3837ki) gestureDetectorOnGestureListenerC3635ci : null;
        if (c3837ki == null) {
            return;
        }
        C3976q7 c3976q7 = this.f36719e;
        View viewB2 = b();
        if (viewB2 == null || (viewB = b()) == null) {
            return;
        }
        c3976q7.a(viewB2, viewB, c3837ki.getVISIBILITY_CHANGE_LISTENER(), this.f36895c.getViewability(), true);
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        this.f36894b = new WeakReference(this.f36718d);
        return this.f36718d;
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        C3903n9 c3903n9 = this.f36720f;
        if (c3903n9 != null) {
            String tag = this.f36721g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c3903n9.a(tag, "stopTrackingForImpression");
        }
        C3903n9 c3903n92 = this.f36720f;
        if (c3903n92 != null) {
            String tag2 = this.f36721g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            c3903n92.a(tag2, "stopTrackingForVisibility");
        }
        C3976q7 c3976q7 = this.f36719e;
        View viewB = b();
        if (viewB == null) {
            return;
        }
        c3976q7.b(viewB);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        C3903n9 c3903n9 = this.f36720f;
        if (c3903n9 != null) {
            String tag = this.f36721g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c3903n9.a(tag, "addFriendlyView - childView: " + childView + ", obstructionCode: " + obstructionCode);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f36718d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        U exposureTracker = this.f36718d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f36718d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        U exposureTracker = this.f36718d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        C3903n9 c3903n9 = this.f36720f;
        if (c3903n9 != null) {
            String tag = this.f36721g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c3903n9.a(tag, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f36719e.a();
                return;
            }
            if (b10 == 1) {
                C3976q7 c3976q7 = this.f36719e;
                InterfaceC3878m9 interfaceC3878m9 = c3976q7.f39357f;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).c("HtmlAdTracker", "onActivityStopped");
                }
                J8 j82 = c3976q7.f39358g;
                if (j82 != null) {
                    String TAG = j82.f37113d;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    j82.f37112c.a();
                    j82.f37114e.removeCallbacksAndMessages(null);
                    j82.f37111b.clear();
                }
                T7 t72 = c3976q7.f39359h;
                if (t72 != null) {
                    t72.d();
                    return;
                }
                return;
            }
            if (b10 == 2) {
                C3976q7 c3976q72 = this.f36719e;
                InterfaceC3878m9 interfaceC3878m92 = c3976q72.f39357f;
                if (interfaceC3878m92 != null) {
                    ((C3903n9) interfaceC3878m92).c("HtmlAdTracker", "onActivityDestroyed");
                }
                J8 j83 = c3976q72.f39358g;
                if (j83 != null) {
                    j83.f37110a.clear();
                    j83.f37111b.clear();
                    j83.f37112c.a();
                    j83.f37114e.removeMessages(0);
                    j83.f37112c.b();
                }
                c3976q72.f39358g = null;
                T7 t73 = c3976q72.f39359h;
                if (t73 != null) {
                    t73.b();
                }
                c3976q72.f39359h = null;
                return;
            }
            Intrinsics.checkNotNullExpressionValue(this.f36721g, "tag");
        } catch (Exception e10) {
            C3903n9 c3903n92 = this.f36720f;
            if (c3903n92 != null) {
                String tag2 = this.f36721g;
                Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                c3903n92.b(tag2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        C3903n9 c3903n9 = this.f36720f;
        if (c3903n9 != null) {
            String tag = this.f36721g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c3903n9.a(tag, "destroy");
        }
        if (b() != null) {
            C3903n9 c3903n92 = this.f36720f;
            if (c3903n92 != null) {
                String tag2 = this.f36721g;
                Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                c3903n92.a(tag2, "stopTrackingForVisibility");
            }
            C3976q7 c3976q7 = this.f36719e;
            View viewB = b();
            if (viewB != null) {
                c3976q7.b(viewB);
            }
        }
        WeakReference weakReference = this.f36894b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
