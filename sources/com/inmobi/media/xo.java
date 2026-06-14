package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class xo implements so {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WeakHashMap f39953g = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo f39954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f39955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f39956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f39957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f39958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Df f39959f;

    public xo(Activity activity, uo windowInsetListener, InterfaceC3878m9 interfaceC3878m9) {
        Window window;
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        this.f39954a = windowInsetListener;
        this.f39955b = interfaceC3878m9;
        this.f39957d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.f39958e = weakReference;
        C4148x5.f39893a.getClass();
        if (!C4148x5.u()) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.f39956c = decorView;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = f39953g;
            Object toVar = weakHashMap.get(decorView);
            if (toVar == null) {
                toVar = new to(decorView);
                weakHashMap.put(decorView, toVar);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            ((to) toVar).f39622a.add(this);
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(WindowInsets windowInsets) {
        try {
            Activity activity = (Activity) this.f39958e.get();
            if (!this.f39954a.a()) {
                InterfaceC3878m9 interfaceC3878m9 = this.f39955b;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                InterfaceC3878m9 interfaceC3878m92 = this.f39955b;
                if (interfaceC3878m92 != null) {
                    ((C3903n9) interfaceC3878m92).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            vo voVarB = F3.a(activity) ? AbstractC4061ti.b(windowInsets) : AbstractC4061ti.a(windowInsets);
            Integer numF = J5.f();
            int iIntValue = numF != null ? numF.intValue() : J5.a(windowInsets);
            J5.a(Integer.valueOf(iIntValue));
            a(voVarB, iIntValue);
        } catch (Error e10) {
            InterfaceC3878m9 interfaceC3878m93 = this.f39955b;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).b("WindowInsetsHandler", "Error in getting safeArea " + e10.getMessage());
            }
        } catch (Exception e11) {
            InterfaceC3878m9 interfaceC3878m94 = this.f39955b;
            if (interfaceC3878m94 != null) {
                ((C3903n9) interfaceC3878m94).a("WindowInsetsHandler", "Exception in getting safeArea", e11);
            }
        }
    }

    public final void a(vo insets, int i10) {
        Df orientation = Ef.a(J5.g());
        wo woVar = (wo) this.f39957d.get(Integer.valueOf(i10));
        if (woVar == null) {
            woVar = new wo();
            this.f39957d.put(Integer.valueOf(i10), woVar);
        }
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        vo voVar = (vo) woVar.f39881a.get(orientation);
        if (voVar != null && Intrinsics.areEqual(insets, voVar)) {
            InterfaceC3878m9 interfaceC3878m9 = this.f39955b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            InterfaceC3878m9 interfaceC3878m92 = this.f39955b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(insets, "insets");
            woVar.f39881a.put(orientation, insets);
            ConcurrentHashMap concurrentHashMap = this.f39957d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((wo) entry.getValue()).a());
            }
            J5.a(linkedHashMap);
        }
        if (this.f39959f != orientation) {
            this.f39959f = orientation;
            uo uoVar = this.f39954a;
            Object obj = this.f39957d.get(Integer.valueOf(i10));
            Intrinsics.checkNotNull(obj);
            uoVar.a(orientation, (wo) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xo(GestureDetectorOnGestureListenerC3635ci view, uo windowInsetListener, InterfaceC3878m9 interfaceC3878m9) {
        this((Activity) null, windowInsetListener, interfaceC3878m9);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        C4148x5.f39893a.getClass();
        if (!C4148x5.u()) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.f39956c = view;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = f39953g;
        Object toVar = weakHashMap.get(view);
        if (toVar == null) {
            toVar = new to(view);
            weakHashMap.put(view, toVar);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((to) toVar).f39622a.add(this);
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        View view = this.f39956c;
        if (view != null) {
            WeakHashMap weakHashMap = f39953g;
            to toVar = (to) weakHashMap.get(view);
            if (toVar != null) {
                Intrinsics.checkNotNullParameter(this, "listener");
                toVar.f39622a.remove(this);
                if (toVar.f39622a.isEmpty()) {
                    toVar.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC3878m9 interfaceC3878m9 = this.f39955b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.f39956c = null;
        this.f39957d.clear();
    }
}
