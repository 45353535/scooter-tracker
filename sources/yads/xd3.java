package yads;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class xd3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f117804c = {kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(xd3.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f117805a = SetsKt.mutableSetOf(vd3.f116978b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd3 f117806b;

    public xd3() {
        kotlin.properties.a aVar = kotlin.properties.a.f93338a;
        this.f117806b = new wd3(this);
    }

    public final vd3 a() {
        return (vd3) this.f117806b.getValue(this, f117804c[0]);
    }

    public final void a(vd3 vd3Var) {
        this.f117806b.setValue(this, f117804c[0], vd3Var);
    }
}
