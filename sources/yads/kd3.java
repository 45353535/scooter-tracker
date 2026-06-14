package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class kd3 extends kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3 f112689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd3(md3 md3Var) {
        super(null);
        this.f112689a = md3Var;
    }

    @Override // kotlin.properties.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f112689a.f113441f.f114637e = (od3) obj2;
    }
}
