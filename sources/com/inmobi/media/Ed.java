package com.inmobi.media;

import com.inmobi.media.Ed;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Ed extends AbstractC4020s2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Gd f36796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f36797i;

    /* JADX WARN: Illegal instructions before constructor call */
    public Ed(CoroutineScope coroutineScope, K5 displayMRC50Model, MutableStateFlow windowObserver) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(displayMRC50Model, "displayMRC50Model");
        Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        C4091un c4091un = displayMRC50Model.f37208a;
        C4166xn c4166xn = displayMRC50Model.f37209b;
        super(coroutineScope, c4091un, c4166xn, windowObserver);
        this.f36796h = new Gd(new Jn(c4166xn.f39950b, c4166xn.f39951c), this.f39501g.f36800c);
        this.f36797i = lf.i.a(new Function0() { // from class: w3.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ed.a(this.f106972b);
            }
        });
    }

    public static final Bn a(Ed ed2) {
        Gd viewabilityTrackerView = ed2.f36796h;
        Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new Bn(new C4134wg(ed2.f39495a, new C4184yg(ed2.f39496b.f39949a), viewabilityTrackerView), new Dn(ed2.f39495a, ed2.f39496b.f39952d));
    }

    @Override // com.inmobi.media.AbstractC4020s2
    public final Bn c() {
        return (Bn) this.f36797i.getValue();
    }
}
