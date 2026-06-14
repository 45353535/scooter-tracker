package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class wd3 extends kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xd3 f117436a;

    /* JADX WARN: Illegal instructions before constructor call */
    public wd3(xd3 xd3Var) {
        vd3 vd3Var = vd3.f116978b;
        this.f117436a = xd3Var;
        super(vd3Var);
    }

    @Override // kotlin.properties.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f117436a.f117805a.add((vd3) obj2);
    }
}
