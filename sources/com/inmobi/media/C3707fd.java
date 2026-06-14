package com.inmobi.media;

import com.inmobi.media.C3707fd;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3707fd extends AbstractC4020s2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3733gd f38573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f38574i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3707fd(CoroutineScope coroutineScope, C4091un viewabilityModel, C4166xn viewabilityCriteria, MutableStateFlow windowObserver) {
        super(coroutineScope, viewabilityModel, viewabilityCriteria, windowObserver);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        this.f38573h = new C3733gd(new Jn(viewabilityCriteria.f39950b, viewabilityCriteria.f39951c), this.f39501g.f36800c);
        this.f38574i = lf.i.a(new Function0() { // from class: w3.a7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3707fd.a(this.f106980b);
            }
        });
    }

    public static final Bn a(C3707fd c3707fd) {
        C3733gd viewabilityTrackerView = c3707fd.f38573h;
        Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new Bn(new C4134wg(c3707fd.f39495a, new C4184yg(c3707fd.f39496b.f39949a), viewabilityTrackerView), new Dn(c3707fd.f39495a, c3707fd.f39496b.f39952d));
    }

    @Override // com.inmobi.media.AbstractC4020s2
    public final Bn c() {
        return (Bn) this.f38574i.getValue();
    }
}
