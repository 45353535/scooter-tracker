package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class x9 implements e4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f117737b = {kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(x9.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk2 f117738a = hk2.a(null);

    @Override // yads.e4
    public final void a(int i10, Bundle bundle) {
        gk2 gk2Var = this.f117738a;
        KProperty kProperty = f117737b[0];
        e4 e4Var = (e4) gk2Var.f111244a.get();
        if (e4Var != null) {
            e4Var.a(i10, bundle);
            boolean z10 = lb1.f113032a;
        }
    }

    public final void a(e4 e4Var) {
        gk2 gk2Var = this.f117738a;
        KProperty kProperty = f117737b[0];
        gk2Var.getClass();
        gk2Var.f111244a = new WeakReference(e4Var);
    }
}
