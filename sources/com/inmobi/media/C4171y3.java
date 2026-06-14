package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C4171y3;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4171y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f39974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3878m9 f39977d;

    public C4171y3(GestureDetectorOnGestureListenerC3635ci renderView, boolean z10, boolean z11, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        this.f39974a = renderView;
        this.f39975b = z10;
        this.f39976c = z11;
        this.f39977d = interfaceC3878m9;
    }

    public final void a(final vo insets) {
        Handler handler;
        Intrinsics.checkNotNullParameter(insets, "insets");
        final ViewGroup viewGroup = (ViewGroup) this.f39974a.getRootView().findViewById(65534);
        if (viewGroup == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: w3.hd
            @Override // java.lang.Runnable
            public final void run() {
                C4171y3.a(this.f107089b, viewGroup, insets);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.inmobi.media.C4171y3 r13, android.view.ViewGroup r14, com.inmobi.media.vo r15) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4171y3.a(com.inmobi.media.y3, android.view.ViewGroup, com.inmobi.media.vo):void");
    }

    public final void a(View view) {
        Fn viewableAd;
        ko webViewFactory = this.f39974a.getWebViewFactory();
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter("default", "id");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) webViewFactory.f38911b.get("default");
        if (gestureDetectorOnGestureListenerC3635ci == null || (viewableAd = gestureDetectorOnGestureListenerC3635ci.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final Pair a() {
        float f10 = J5.d().f37267c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: w3.gd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4171y3.a(this.f107073b, view);
            }
        };
        int i10 = (int) (50 * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(11);
        return TuplesKt.to(onClickListener, layoutParams);
    }

    public static final void a(C4171y3 c4171y3, View view) {
        try {
            c4171y3.f39974a.m();
        } catch (Exception e10) {
            e10.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
