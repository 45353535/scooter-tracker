package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3878m9 f38910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f38911b = new ConcurrentHashMap();

    public ko(InterfaceC3878m9 interfaceC3878m9) {
        this.f38910a = interfaceC3878m9;
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, String str) {
        this.f38911b.put(str, gestureDetectorOnGestureListenerC3635ci);
        InterfaceC3878m9 interfaceC3878m9 = this.f38910a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void b(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ConcurrentHashMap concurrentHashMap = this.f38911b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC3635ci) entry.getValue()) instanceof C3837ki) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC3635ci, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((C3837ki) gestureDetectorOnGestureListenerC3635ci);
        }
    }

    public final void a(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f38911b.remove(id2);
        InterfaceC3878m9 interfaceC3878m9 = this.f38910a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + id2);
        }
    }

    public final void a(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) this.f38911b.get("default");
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            action.invoke(gestureDetectorOnGestureListenerC3635ci);
        }
        ConcurrentHashMap concurrentHashMap = this.f38911b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "default")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((GestureDetectorOnGestureListenerC3635ci) ((Map.Entry) it.next()).getValue());
        }
    }

    public final GestureDetectorOnGestureListenerC3635ci a(Di route, Context context, short s10, C3919o0 adMetaData, AdConfig adConfig) {
        GestureDetectorOnGestureListenerC3635ci c3837ki;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        if (s10 == 0) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38910a;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.f36741b);
            }
            c3837ki = new GestureDetectorOnGestureListenerC3635ci(context, adMetaData.f39137o, adMetaData.f39138p, adMetaData.f39139q, adMetaData.f39140r, 0L, adMetaData.f39141s, adMetaData.f39142t, route, this, adMetaData, adConfig, 80);
        } else if (s10 == 1) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38910a;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + route.f36741b);
            }
            c3837ki = new C3837ki(context, adMetaData.f39137o, adMetaData.f39142t, C3919o0.a(adMetaData, null, 4194047), this, route, adConfig);
        } else {
            InterfaceC3878m9 interfaceC3878m93 = this.f38910a;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s10));
            }
            throw new IllegalArgumentException("Unsupported WebView type: " + ((int) s10));
        }
        a(c3837ki, route.f36741b);
        return c3837ki;
    }
}
