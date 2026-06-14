package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xi3 implements oc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f117833b;

    public xi3(boolean z10) {
        this.f117833b = z10;
    }

    @Override // yads.oc1
    public final String a() {
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.f117833b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
