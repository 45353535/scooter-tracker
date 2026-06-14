package yads;

import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l23 implements oc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f112932b;

    public l23(u92 u92Var) {
        this.f112932b = u92Var;
    }

    @Override // yads.oc1
    public final String a() {
        boolean zIsHardwareAccelerated = this.f112932b.isHardwareAccelerated();
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(zIsHardwareAccelerated)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
