package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3609bi extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f38281a;

    public C3609bi(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f38281a = gestureDetectorOnGestureListenerC3635ci;
    }

    @Override // com.inmobi.media.uo
    public final boolean a() {
        return !Intrinsics.areEqual("Hidden", this.f38281a.getViewState());
    }

    @Override // com.inmobi.media.uo
    public final void a(Df orientation, wo finalInsets) {
        GestureDetectorOnGestureListenerC3635ci renderView;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        this.f38281a.a(orientation, finalInsets);
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f38281a;
        gestureDetectorOnGestureListenerC3635ci.getClass();
        finalInsets.getClass();
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        vo voVar = (vo) finalInsets.f39881a.get(orientation);
        if (voVar == null) {
            return;
        }
        if (voVar.f39804b == 0 && voVar.f39805c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC3635ci.setCloseAssetArea(voVar);
        Lazy lazy = AbstractC4061ti.f39603a;
        Intrinsics.checkNotNullParameter(gestureDetectorOnGestureListenerC3635ci, "<this>");
        if (Intrinsics.areEqual(gestureDetectorOnGestureListenerC3635ci.getRoute().f36741b, "default")) {
            renderView = gestureDetectorOnGestureListenerC3635ci;
        } else {
            ko webViewFactory = gestureDetectorOnGestureListenerC3635ci.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter("default", "id");
            renderView = (GestureDetectorOnGestureListenerC3635ci) webViewFactory.f38911b.get("default");
        }
        if (renderView != null) {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            vo insets = gestureDetectorOnGestureListenerC3635ci.f38359d1;
            Intrinsics.checkNotNullParameter(insets, "insets");
            View viewFindViewById = renderView.getRootView().findViewById(65531);
            C3799j5 c3799j5 = viewFindViewById instanceof C3799j5 ? (C3799j5) viewFindViewById : null;
            if (c3799j5 == null) {
                return;
            }
            View viewFindViewById2 = renderView.getRootView().findViewById(65531);
            C3799j5 c3799j52 = viewFindViewById2 instanceof C3799j5 ? (C3799j5) viewFindViewById2 : null;
            if (c3799j52 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c3799j5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c3799j52.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.f39804b, insets.f39805c, 0);
            layoutParams4.setMargins(0, insets.f39804b, insets.f39805c, 0);
        }
    }
}
