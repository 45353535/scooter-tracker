package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C4329g8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko f37786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f37787b;

    public Ti(ko wvFactory, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(wvFactory, "wvFactory");
        this.f37786a = wvFactory;
        this.f37787b = interfaceC3878m9;
    }

    public final GestureDetectorOnGestureListenerC3635ci a() {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a("default");
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            return gestureDetectorOnGestureListenerC3635ciA;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m9).b("Ti", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String sourceId, String targetId) throws JSONException {
        Object next;
        Integer numA;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ti", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3635ciA2 == null) {
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3635ciA.a("showWebView", jSONObjectA);
            return;
        }
        if (Intrinsics.areEqual(targetId, "default")) {
            a(gestureDetectorOnGestureListenerC3635ciA, targetId, "showWebView");
            return;
        }
        if (!(gestureDetectorOnGestureListenerC3635ciA2 instanceof C3837ki)) {
            Lazy lazy2 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA2 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", 305);
            gestureDetectorOnGestureListenerC3635ciA.a("showWebView", jSONObjectA2);
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA3 = a();
        if (gestureDetectorOnGestureListenerC3635ciA3 != null && !gestureDetectorOnGestureListenerC3635ciA3.isAttachedToWindow()) {
            Lazy lazy3 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA3 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA3.put("errorCode", 305);
            gestureDetectorOnGestureListenerC3635ciA.a("showWebView", jSONObjectA3);
            return;
        }
        Integer numA2 = gestureDetectorOnGestureListenerC3635ciA2.getWvStateMachine().a(5);
        if (numA2 != null) {
            int iIntValue = numA2.intValue();
            Lazy lazy4 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA4 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA4.put("errorCode", iIntValue);
            gestureDetectorOnGestureListenerC3635ciA.a("showWebView", jSONObjectA4);
            return;
        }
        Iterator it = MapsKt.toMap(this.f37786a.f38911b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) next;
            if (gestureDetectorOnGestureListenerC3635ci.getWvStateMachine().f38654b == 105 && !Intrinsics.areEqual(gestureDetectorOnGestureListenerC3635ci, gestureDetectorOnGestureListenerC3635ciA2) && !Intrinsics.areEqual(gestureDetectorOnGestureListenerC3635ci.getRoute().f36741b, "default")) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) next;
        if (gestureDetectorOnGestureListenerC3635ci2 != null && (numA = gestureDetectorOnGestureListenerC3635ci2.getWvStateMachine().a(7)) != null) {
            int iIntValue2 = numA.intValue();
            Lazy lazy5 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA5 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA5.put("errorCode", iIntValue2);
            gestureDetectorOnGestureListenerC3635ciA.a("showWebView", jSONObjectA5);
        }
        C3837ki c3837ki = (C3837ki) gestureDetectorOnGestureListenerC3635ciA2;
        if (c3837ki.isAttachedToWindow()) {
            a(gestureDetectorOnGestureListenerC3635ciA2, gestureDetectorOnGestureListenerC3635ciA, targetId);
            return;
        }
        a(gestureDetectorOnGestureListenerC3635ciA, c3837ki);
        a(gestureDetectorOnGestureListenerC3635ciA2);
        Fn viewableAd = c3837ki.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC3635ciA2.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final GestureDetectorOnGestureListenerC3635ci a(String id2) {
        ko koVar = this.f37786a;
        koVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) koVar.f38911b.get(id2);
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            return gestureDetectorOnGestureListenerC3635ci;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
        ((C3903n9) interfaceC3878m9).b("Ti", "View with ID: " + id2 + " not found.");
        return null;
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, C3837ki c3837ki) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ti", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        Context containerContext = gestureDetectorOnGestureListenerC3635ciA != null ? gestureDetectorOnGestureListenerC3635ciA.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37787b;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m92).b("Ti", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            InterfaceC3878m9 interfaceC3878m93 = this.f37787b;
            if (interfaceC3878m93 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m93).b("Ti", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC3635ci, c3837ki.getRoute().f36741b, "loadWebView");
            return;
        }
        c3837ki.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        InterfaceC3878m9 interfaceC3878m94 = this.f37787b;
        if (interfaceC3878m94 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m94).a("Ti", "target View's Viewable ad - " + c3837ki.getViewableAd());
        }
        View viewC = c3837ki.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((viewC != null ? viewC.getParent() : null) != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewC);
            }
        }
        relativeLayout.addView(viewC, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        c3837ki.a(relativeLayout);
        InterfaceC3878m9 interfaceC3878m95 = this.f37787b;
        if (interfaceC3878m95 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m95).a("Ti", "Target View added - the inflatedView is - " + viewC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.inmobi.media.Fn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.inmobi.media.ci] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        ?? viewableAd;
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ti", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3635ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            gestureDetectorOnGestureListenerC3635ci = viewGroup;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA == null || (viewableAd = gestureDetectorOnGestureListenerC3635ciA.getViewableAd()) == 0) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC3635ci, FriendlyObstructionPurpose.OTHER);
    }

    public final void a(String sourceId, String targetId, String html) throws JSONException {
        Context context;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(html, "html");
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ti", "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA2 = a();
        Context containerContext = gestureDetectorOnGestureListenerC3635ciA2 != null ? gestureDetectorOnGestureListenerC3635ciA2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37787b;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m92).b("Ti", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (gestureDetectorOnGestureListenerC3635ciA = a(sourceId)) == null) {
            return;
        }
        if (Intrinsics.areEqual(targetId, "default")) {
            a(gestureDetectorOnGestureListenerC3635ciA, targetId, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA3 = a();
        if (gestureDetectorOnGestureListenerC3635ciA3 == null) {
            gestureDetectorOnGestureListenerC3635ciA.a("loadWebView", AbstractC4061ti.a(targetId, 304));
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA4 = a(targetId);
        if (gestureDetectorOnGestureListenerC3635ciA4 != null) {
            int i10 = gestureDetectorOnGestureListenerC3635ciA4.getWvStateMachine().f38654b;
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", i10);
            gestureDetectorOnGestureListenerC3635ciA.a("loadWebView", jSONObjectA);
            return;
        }
        C3837ki c3837kiA = a(gestureDetectorOnGestureListenerC3635ciA3, targetId, this, gestureDetectorOnGestureListenerC3635ciA, context, SystemClock.elapsedRealtime());
        if (c3837kiA != null) {
            c3837kiA.h(html);
        }
    }

    public final void b(String sourceId, String targetId, String message) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(message, "message");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3635ciA2 == null) {
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3635ciA.a(C4329g8.f43165j, jSONObjectA);
            return;
        }
        int i10 = gestureDetectorOnGestureListenerC3635ciA2.getWvStateMachine().f38654b;
        if (!Intrinsics.areEqual(gestureDetectorOnGestureListenerC3635ciA2.getRoute().f36741b, "default") && CollectionsKt.listOf((Object[]) new Integer[]{101, 104, 107}).contains(Integer.valueOf(i10))) {
            InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
            if (interfaceC3878m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m9).b("Ti", "WebView is not in state to receive messages: " + targetId);
            }
            int i11 = gestureDetectorOnGestureListenerC3635ciA2.getWvStateMachine().f38654b;
            Lazy lazy2 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA2 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", i11);
            gestureDetectorOnGestureListenerC3635ciA.a(C4329g8.f43165j, jSONObjectA2);
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f37787b;
        if (interfaceC3878m92 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m92).a("Ti", "Sending message to WebView ID: " + targetId);
        }
        gestureDetectorOnGestureListenerC3635ciA2.g(message);
    }

    public static final C3837ki a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, String str, Ti ti, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2, Context context, long j10) {
        String str2;
        C3919o0 c3919o0A;
        C3919o0 c3919o0;
        C3738gi c3738gi;
        C3919o0 adMetaData = gestureDetectorOnGestureListenerC3635ci.getAdMetaData();
        if (adMetaData != null) {
            C3738gi c3738gi2 = gestureDetectorOnGestureListenerC3635ci.getAdMetaData().f39141s;
            if (c3738gi2 != null) {
                C4093v0 placement = c3738gi2.f38640a;
                String markupType = c3738gi2.f38641b;
                String impressionId = c3738gi2.f38642c;
                String telemetryMetadataBlob = c3738gi2.f38643d;
                int i10 = c3738gi2.f38644e;
                String creativeType = c3738gi2.f38645f;
                String creativeId = c3738gi2.f38646g;
                boolean z10 = c3738gi2.f38647h;
                int i11 = c3738gi2.f38648i;
                C3970q1 c3970q1 = c3738gi2.f38649j;
                C3862li c3862li = c3738gi2.f38650k;
                InlineParams inlineParams = c3738gi2.f38652m;
                Intrinsics.checkNotNullParameter(placement, "placement");
                Intrinsics.checkNotNullParameter(markupType, "markupType");
                Intrinsics.checkNotNullParameter(impressionId, "impressionId");
                Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
                Intrinsics.checkNotNullParameter(creativeType, "creativeType");
                Intrinsics.checkNotNullParameter(creativeId, "creativeId");
                c3919o0 = adMetaData;
                str2 = str;
                c3738gi = new C3738gi(placement, markupType, impressionId, telemetryMetadataBlob, i10, creativeType, creativeId, z10, i11, c3970q1, c3862li, str2, inlineParams);
            } else {
                str2 = str;
                c3919o0 = adMetaData;
                c3738gi = null;
            }
            c3919o0A = C3919o0.a(c3919o0, c3738gi, 3665663);
        } else {
            str2 = str;
            c3919o0A = null;
        }
        if (c3919o0A == null) {
            InterfaceC3878m9 interfaceC3878m9 = ti.f37787b;
            if (interfaceC3878m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m9).b("Ti", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = ti.f37786a.a(new Di(gestureDetectorOnGestureListenerC3635ci2.getRoute().f36741b, str2), context, (short) 1, c3919o0A, gestureDetectorOnGestureListenerC3635ci.getAdConfig());
        C3837ki c3837ki = gestureDetectorOnGestureListenerC3635ciA instanceof C3837ki ? (C3837ki) gestureDetectorOnGestureListenerC3635ciA : null;
        if (c3837ki == null) {
            InterfaceC3878m9 interfaceC3878m92 = ti.f37787b;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m92).b("Ti", "Failed to create Sibling WebView with ID: " + str2);
            }
            gestureDetectorOnGestureListenerC3635ci2.a("loadWebView", AbstractC4061ti.a(str2, 313));
            return null;
        }
        Integer numA = c3837ki.getWvStateMachine().a(1);
        if (numA != null) {
            gestureDetectorOnGestureListenerC3635ci2.a("loadWebView", AbstractC4061ti.a(str2, numA.intValue()));
        }
        c3837ki.Z();
        C3887mi renderViewTelemetry = c3837ki.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.f39042b = j10;
        }
        return c3837ki;
    }

    public final void a(String sourceId, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3635ciA2 == null) {
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3635ciA.a("destroyWebView", jSONObjectA);
            return;
        }
        if (Intrinsics.areEqual(targetId, "default")) {
            a(gestureDetectorOnGestureListenerC3635ciA, targetId, "destroyWebView");
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3635ciA2.getWvStateMachine().a(8);
        if (numA != null) {
            int iIntValue = numA.intValue();
            Lazy lazy2 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA2 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", iIntValue);
            gestureDetectorOnGestureListenerC3635ciA.a("destroyWebView", jSONObjectA2);
            return;
        }
        gestureDetectorOnGestureListenerC3635ciA2.b();
        gestureDetectorOnGestureListenerC3635ciA.a(gestureDetectorOnGestureListenerC3635ciA, targetId);
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ti", "WebView with ID: " + targetId + " removed from parent.");
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, String str, String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3903n9) interfaceC3878m9).b("Ti", "Cannot perform operations on default WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC3635ci.a(str2, AbstractC4061ti.a(str, 303));
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2, String str) throws JSONException {
        ViewParent parent = gestureDetectorOnGestureListenerC3635ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC3635ci;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC3635ci2.a("showWebView", AbstractC4061ti.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            InterfaceC3878m9 interfaceC3878m9 = this.f37787b;
            if (interfaceC3878m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m9).a("Ti", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC3635ci);
            }
        } else {
            InterfaceC3878m9 interfaceC3878m92 = this.f37787b;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3903n9) interfaceC3878m92).b("Ti", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC3635ci);
            }
        }
        gestureDetectorOnGestureListenerC3635ci2.c(gestureDetectorOnGestureListenerC3635ci2, str);
    }
}
