package yads;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wa3 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua3 f117381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final va3 f117382c;

    /* JADX WARN: Illegal instructions before constructor call */
    public wa3(ua3 ua3Var, va3 va3Var) {
        String lowerCase = va3Var.name().toLowerCase(Locale.US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        super("Verification not executed with reason = " + lowerCase);
        this.f117381b = ua3Var;
        this.f117382c = va3Var;
    }
}
