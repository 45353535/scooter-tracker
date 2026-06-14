package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class C9 extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gn f36664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3976q7 f36665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3878m9 f36666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36667g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9(GestureDetectorOnGestureListenerC3635ci container, Gn mViewableAd, C3976q7 htmlAdTracker, InterfaceC3878m9 interfaceC3878m9) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.f36664d = mViewableAd;
        this.f36665e = htmlAdTracker;
        this.f36666f = interfaceC3878m9;
        this.f36667g = C9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3878m9 interfaceC3878m9 = this.f36666f;
        if (interfaceC3878m9 != null) {
            String TAG = this.f36667g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        View view = this.f36664d.b();
        if (view != null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f36666f;
            if (interfaceC3878m92 != null) {
                String TAG2 = this.f36667g;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).a(TAG2, "start tracking");
            }
            AdConfig.ViewabilityConfig viewabilityConfig = this.f36895c.getViewability();
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f36893a;
            Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC3635ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC3635ci.setFriendlyViews(map);
            C3976q7 c3976q7 = this.f36665e;
            c3976q7.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(view, "token");
            Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
            InterfaceC3878m9 interfaceC3878m93 = c3976q7.f39357f;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (c3976q7.f39352a == 0) {
                InterfaceC3878m9 interfaceC3878m94 = c3976q7.f39357f;
                if (interfaceC3878m94 != null) {
                    ((C3903n9) interfaceC3878m94).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (Intrinsics.areEqual(c3976q7.f39353b, "video") || Intrinsics.areEqual(c3976q7.f39353b, "audio")) {
                InterfaceC3878m9 interfaceC3878m95 = c3976q7.f39357f;
                if (interfaceC3878m95 != null) {
                    ((C3903n9) interfaceC3878m95).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                J8 j8A = c3976q7.a(c3976q7.f39352a, viewabilityConfig);
                InterfaceC3878m9 interfaceC3878m96 = c3976q7.f39357f;
                if (interfaceC3878m96 != null) {
                    ((C3903n9) interfaceC3878m96).c("HtmlAdTracker", "impression tracker add view");
                }
                int i10 = c3976q7.f39355d;
                int i11 = c3976q7.f39354c;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(view, "token");
                H8 h82 = (H8) j8A.f37110a.get(view);
                if (!Intrinsics.areEqual(h82 != null ? h82.f36994a : null, view)) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    j8A.f37110a.remove(view);
                    j8A.f37111b.remove(view);
                    j8A.f37112c.a(view);
                    j8A.f37110a.put(view, new H8(view, i10, i11));
                    T7 t72 = j8A.f37112c;
                    t72.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    t72.a(view, view, view, i10);
                }
            }
            this.f36665e.a(view, view, gestureDetectorOnGestureListenerC3635ci.getVISIBILITY_CHANGE_LISTENER(), viewabilityConfig, false);
            this.f36664d.getClass();
        }
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f36664d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        return this.f36664d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        InterfaceC3878m9 interfaceC3878m9 = this.f36666f;
        if (interfaceC3878m9 != null) {
            String TAG = this.f36667g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "stopTrackingForImpression");
        }
        View viewB = this.f36664d.b();
        if (viewB != null) {
            this.f36665e.a(viewB);
            this.f36664d.getClass();
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        if (childView instanceof C3837ki) {
            InterfaceC3878m9 interfaceC3878m9 = this.f36666f;
            if (interfaceC3878m9 != null) {
                String TAG = this.f36667g;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).a(TAG, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f36666f;
        if (interfaceC3878m92 != null) {
            String TAG2 = this.f36667g;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "Adding friendly view: " + childView.getClass().getSimpleName() + " with obstruction code: " + obstructionCode);
        }
        this.f36664d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        if (childView instanceof C3837ki) {
            return;
        }
        this.f36664d.a(childView);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC3878m9 interfaceC3878m9 = this.f36666f;
        if (interfaceC3878m9 != null) {
            String TAG = this.f36667g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f36665e.a();
            } else if (b10 == 1) {
                C3976q7 c3976q7 = this.f36665e;
                InterfaceC3878m9 interfaceC3878m92 = c3976q7.f39357f;
                if (interfaceC3878m92 != null) {
                    ((C3903n9) interfaceC3878m92).c("HtmlAdTracker", "onActivityStopped");
                }
                J8 j82 = c3976q7.f39358g;
                if (j82 != null) {
                    Intrinsics.checkNotNullExpressionValue(j82.f37113d, "TAG");
                    j82.f37112c.a();
                    j82.f37114e.removeCallbacksAndMessages(null);
                    j82.f37111b.clear();
                }
                T7 t72 = c3976q7.f39359h;
                if (t72 != null) {
                    t72.d();
                }
            } else if (b10 == 2) {
                C3976q7 c3976q72 = this.f36665e;
                InterfaceC3878m9 interfaceC3878m93 = c3976q72.f39357f;
                if (interfaceC3878m93 != null) {
                    ((C3903n9) interfaceC3878m93).c("HtmlAdTracker", "onActivityDestroyed");
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
            } else {
                Intrinsics.checkNotNullExpressionValue(this.f36667g, "TAG");
            }
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m94 = this.f36666f;
            if (interfaceC3878m94 != null) {
                String TAG2 = this.f36667g;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m94).b(TAG2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
        } finally {
            this.f36664d.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f36666f;
        if (interfaceC3878m9 != null) {
            String TAG = this.f36667g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "destroy");
        }
        View viewB = this.f36664d.b();
        if (viewB != null) {
            this.f36665e.a(viewB);
            this.f36665e.b(viewB);
        }
        WeakReference weakReference = this.f36894b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference weakReference2 = this.f36664d.f36894b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }
}
