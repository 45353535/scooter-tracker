package yads;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class yf2 {

    @NotNull
    public static final xf2 Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f118171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yf2 f118172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final yf2 f118173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ yf2[] f118174e;

    static {
        yf2 yf2Var = new yf2(0, "SUCCESS");
        f118172c = yf2Var;
        yf2 yf2Var2 = new yf2(1, "ERROR");
        f118173d = yf2Var2;
        yf2[] yf2VarArr = {yf2Var, yf2Var2};
        f118174e = yf2VarArr;
        qf.a.a(yf2VarArr);
        Companion = new xf2();
        f118171b = lf.i.b(lf.l.f94210c, new Function0() { // from class: yads.wf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yg.j0.a("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", yf2.values(), new String[]{"success", "error"}, new Annotation[][]{null, null}, null);
            }
        });
    }

    public yf2(int i10, String str) {
    }

    public static yf2 valueOf(String str) {
        return (yf2) Enum.valueOf(yf2.class, str);
    }

    public static yf2[] values() {
        return (yf2[]) f118174e.clone();
    }
}
