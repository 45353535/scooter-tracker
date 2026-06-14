package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Zb implements Wb, ToggleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f76741a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f76742b = C5468ua.k().x().c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mn f76743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f76744d;

    public final void a(@Nullable Toggle toggle) {
        Mn mn = new Mn(toggle);
        this.f76743c = mn;
        mn.f76146c.registerObserver(this, true);
    }

    public final void b(@NotNull Object obj) {
        Mn mn = this.f76743c;
        if (mn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            mn = null;
        }
        mn.f76145b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z10) {
        this.f76742b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.yp
            @Override // java.lang.Runnable
            public final void run() {
                Zb.a(this.f78595b, z10);
            }
        });
    }

    public final void a(@NotNull final LocationControllerObserver locationControllerObserver, final boolean z10) {
        this.f76742b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.zp
            @Override // java.lang.Runnable
            public final void run() {
                Zb.a(this.f78665b, locationControllerObserver, z10);
            }
        });
    }

    public static final void a(Zb zb2, LocationControllerObserver locationControllerObserver, boolean z10) {
        zb2.f76741a.add(locationControllerObserver);
        if (z10) {
            if (zb2.f76744d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Zb zb2, boolean z10) {
        if (zb2.f76744d != z10) {
            zb2.f76744d = z10;
            Function1 function1 = z10 ? Xb.f76665a : Yb.f76705a;
            Iterator it = zb2.f76741a.iterator();
            while (it.hasNext()) {
                function1.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(@NotNull Object obj) {
        Mn mn = this.f76743c;
        if (mn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            mn = null;
        }
        mn.f76145b.a(obj);
    }

    public final void a(boolean z10) {
        Mn mn = this.f76743c;
        if (mn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            mn = null;
        }
        mn.f76144a.a(z10);
    }
}
