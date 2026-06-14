package com.inmobi.media;

import com.inmobi.media.C3812ji;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3812ji extends AbstractC3686ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3837ki f38826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko f38827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Di f38828c;

    public C3812ji(C3837ki c3837ki, ko koVar, Di di) {
        this.f38826a = c3837ki;
        this.f38827b = koVar;
        this.f38828c = di;
    }

    public static final void a(ko koVar, Di di, C3837ki c3837ki, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        String id2 = di.f36740a;
        koVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) koVar.f38911b.get(id2);
        if (gestureDetectorOnGestureListenerC3635ci2 == null) {
            InterfaceC3878m9 logger = c3837ki.getLogger();
            if (logger != null) {
                ((C3903n9) logger).b(c3837ki.f38892k1, "Source RenderView not found for id: " + di.f36740a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3635ci.getWvStateMachine().a(3);
        if (numA != null) {
            int iIntValue = numA.intValue();
            InterfaceC3878m9 logger2 = c3837ki.getLogger();
            if (logger2 != null) {
                ((C3903n9) logger2).b(c3837ki.f38892k1, "Failed to transition to FIRE_AD_FAILED state: " + iIntValue);
            }
            gestureDetectorOnGestureListenerC3635ci2.a("loadWebView", AbstractC4061ti.a(gestureDetectorOnGestureListenerC3635ci.getRoute().f36741b, iIntValue));
        }
    }

    public static final void b(ko koVar, Di di, C3837ki c3837ki, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) throws JSONException {
        String id2 = di.f36740a;
        koVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) koVar.f38911b.get(id2);
        if (gestureDetectorOnGestureListenerC3635ci2 == null) {
            InterfaceC3878m9 logger = c3837ki.getLogger();
            if (logger != null) {
                ((C3903n9) logger).b(c3837ki.f38892k1, "Source RenderView not found for id: " + di.f36740a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3635ci.getWvStateMachine().a(2);
        if (numA == null) {
            c3837ki.b(gestureDetectorOnGestureListenerC3635ci2, di.f36741b);
            return;
        }
        int iIntValue = numA.intValue();
        InterfaceC3878m9 logger2 = c3837ki.getLogger();
        if (logger2 != null) {
            ((C3903n9) logger2).b(c3837ki.f38892k1, "Failed to transition to FIRE_AD_READY state: " + iIntValue);
        }
        gestureDetectorOnGestureListenerC3635ci2.a("loadWebView", AbstractC4061ti.a(gestureDetectorOnGestureListenerC3635ci.getRoute().f36741b, iIntValue));
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void e(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void f(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void g(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void h(final GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        final ko koVar = this.f38827b;
        final Di di = this.f38828c;
        final C3837ki c3837ki = this.f38826a;
        Runnable runnable = new Runnable() { // from class: w3.d9
            @Override // java.lang.Runnable
            public final void run() {
                C3812ji.a(koVar, di, c3837ki, renderView);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void i(final GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        final ko koVar = this.f38827b;
        final Di di = this.f38828c;
        final C3837ki c3837ki = this.f38826a;
        Runnable runnable = new Runnable() { // from class: w3.e9
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C3812ji.b(koVar, di, c3837ki, renderView);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void j(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void k(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().k(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(GestureDetectorOnGestureListenerC3635ci renderView, final boolean z10) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        final C3837ki c3837ki = this.f38826a;
        final Di di = this.f38828c;
        Runnable runnable = new Runnable() { // from class: w3.f9
            @Override // java.lang.Runnable
            public final void run() {
                C3812ji.a(c3837ki, di, z10);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void b(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(C3740gk telemetryOnAdImpression) {
        AbstractC3686ei listener;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(String eventType, HashMap kv) {
        AbstractC3686ei listener;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv);
    }

    @Override // com.inmobi.media.AbstractC3686ei, com.inmobi.media.InterfaceC3586al
    public final void a() {
        AbstractC3686ei listener;
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(GestureDetectorOnGestureListenerC3635ci renderView, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(V1 audioStatusInternal) {
        AbstractC3686ei listener;
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(boolean z10) {
        AbstractC3686ei listener;
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z10);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(String data) {
        AbstractC3686ei listener;
        Intrinsics.checkNotNullParameter(data, "data");
        GestureDetectorOnGestureListenerC3635ci adRenderView = this.f38826a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    public static final void a(C3837ki c3837ki, Di di, boolean z10) {
        if (c3837ki.getWvStateMachine().a(4) != null) {
            c3837ki.a("loadWebView", AbstractC4061ti.a(di.f36741b, 307));
        }
        GestureDetectorOnGestureListenerC3635ci adRenderView = c3837ki.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z10);
        }
    }
}
