package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class ld3 extends kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3 f113048a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld3(md3 md3Var) {
        super(null);
        this.f113048a = md3Var;
    }

    @Override // kotlin.properties.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        androidx.privacysandbox.ads.adservices.topics.a.a(obj2);
        androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        this.f113048a.f113441f.getClass();
    }
}
