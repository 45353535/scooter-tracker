package yads;

import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pb2 implements go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hr2 f114602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s53 f114603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x53 f114604c;

    public pb2(String str, hr2 hr2Var, s53 s53Var, x53 x53Var) {
        this.f114602a = hr2Var;
        this.f114603b = s53Var;
        this.f114604c = x53Var;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        oj3Var.getClass();
        boolean z10 = lb1.f113032a;
        Pair pair = TuplesKt.to("tracking_result", "failure");
        String lowerCase = this.f114604c.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Pair pair2 = TuplesKt.to("tracking_url_type", lowerCase);
        String message = oj3Var.getMessage();
        if (message == null) {
            message = "Unknown Volley error";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to("error_message", message));
        s53 s53Var = this.f114603b;
        xl2 xl2Var = xl2.f117866c;
        s53Var.a(mapMutableMapOf, this.f114602a);
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        int i10 = ((r62) obj).f115340a;
        boolean z10 = lb1.f113032a;
        Pair pair = TuplesKt.to("tracking_result", "success");
        String lowerCase = this.f114604c.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map mapMutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("tracking_url_type", lowerCase), TuplesKt.to("code", Integer.valueOf(i10)));
        s53 s53Var = this.f114603b;
        xl2 xl2Var = xl2.f117866c;
        s53Var.a(mapMutableMapOf, this.f114602a);
    }
}
