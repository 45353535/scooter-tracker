package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.webkit.Profile;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C4000r7;
import com.inmobi.media.GestureDetectorOnGestureListenerC3635ci;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4000r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f39446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Df f39447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f39450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f39451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f39452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39453h;

    public C4000r7(WeakReference activityRef, GestureDetectorOnGestureListenerC3635ci adContainer, RelativeLayout adBackgroundView) {
        Intrinsics.checkNotNullParameter(activityRef, "activityRef");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.f39446a = adBackgroundView;
        this.f39447b = Ef.a(J5.g());
        this.f39448c = 1.0f;
        this.f39450e = activityRef;
        this.f39451f = adContainer;
        this.f39452g = adBackgroundView;
    }

    public final void a(final Df orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f39447b = orientation;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39451f;
        Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC3635ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        gestureDetectorOnGestureListenerC3635ci.getWebViewFactory().a(new Function1() { // from class: w3.oa
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4000r7.a(orientation, (GestureDetectorOnGestureListenerC3635ci) obj);
            }
        });
    }

    public final void b() {
        Activity activity = (Activity) this.f39450e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f36529e) {
            try {
                B fullScreenEventsListener = this.f39451f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    Vh vh2 = (Vh) fullScreenEventsListener;
                    InterfaceC3878m9 interfaceC3878m9 = vh2.f37915a.f38368i;
                    if (interfaceC3878m9 != null) {
                        String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                        ((C3903n9) interfaceC3878m9).a(str, com.ironsource.Df.f40652m);
                    }
                    if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, vh2.f37915a.getViewState())) {
                        vh2.f37915a.setAndUpdateViewState("Hidden");
                    }
                    vh2.f37915a.W();
                    Unit unit = Unit.f93236a;
                }
            } catch (Exception e10) {
                e10.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                Unit unit2 = Unit.f93236a;
            }
        } else {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39451f;
            Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC3635ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC3635ci.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC3635ci.m();
            } catch (Exception e11) {
                e11.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.f36523k;
            GestureDetectorOnGestureListenerC3635ci container = this.f39451f;
            Intrinsics.checkNotNullParameter(container, "container");
            InMobiAdActivity.f36523k.remove(container.hashCode());
        }
        this.f39451f.b();
    }

    public final void c() {
        I5 i52;
        RelativeLayout.LayoutParams layoutParams;
        if (this.f39448c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f39446a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.f39449d) {
            L5 l52 = J5.f37099a;
            Context context = this.f39446a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i52 = J5.b(context);
        } else {
            L5 l53 = J5.f37099a;
            Context context2 = this.f39446a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Display displayA = J5.a(context2);
            if (displayA == null) {
                i52 = J5.f37100b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getMetrics(displayMetrics);
                i52 = new I5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i10 = i52.f37051a;
        Objects.toString(this.f39447b);
        if (Ef.b(this.f39447b)) {
            layoutParams = new RelativeLayout.LayoutParams(zf.a.d(i52.f37051a * this.f39448c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, zf.a.d(i52.f37052b * this.f39448c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f39446a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.f39452g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Fn viewableAd = this.f39451f.getViewableAd();
        View viewC = viewableAd != null ? viewableAd.c() : null;
        if (viewC != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewC);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.f39452g.getContext());
            relativeLayout.addView(viewC, new RelativeLayout.LayoutParams(-1, -1));
            this.f39452g.addView(relativeLayout, layoutParams);
            this.f39451f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f39451f.getPlacementType()) {
            try {
                HashMap map = new HashMap();
                Fn viewableAd = this.f39451f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(map);
                }
            } catch (Exception e10) {
                e10.getMessage();
                B fullScreenEventsListener = this.f39451f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((Vh) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39451f;
        if (!androidx.activity.s.a(gestureDetectorOnGestureListenerC3635ci)) {
            gestureDetectorOnGestureListenerC3635ci = null;
        }
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3635ci.getWebViewFactory().a(new Function1() { // from class: w3.pa
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4000r7.a((GestureDetectorOnGestureListenerC3635ci) obj);
            }
        });
        if (gestureDetectorOnGestureListenerC3635ci.K) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3635ci.m();
        } catch (Exception e10) {
            e10.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public static final Unit a(GestureDetectorOnGestureListenerC3635ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.r();
        return Unit.f93236a;
    }

    public static final Unit a(Df df2, GestureDetectorOnGestureListenerC3635ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b(df2);
        return Unit.f93236a;
    }
}
