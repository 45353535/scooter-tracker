package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class cu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u92 f109597a;

    public cu1(su1 su1Var) {
        this.f109597a = su1Var;
    }

    public final void a(String str) {
        this.f109597a.loadUrl("javascript: " + str);
        boolean z10 = lb1.f113032a;
    }

    public final void b(String str) {
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str2 = String.format("window.mraidbridge.%s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        a(str2);
    }

    public final void a(oc1... oc1VarArr) {
        int i10 = 0;
        if (oc1VarArr.length == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("fireChangeEvent({");
        int length = oc1VarArr.length;
        String str = "";
        while (i10 < length) {
            oc1 oc1Var = oc1VarArr[i10];
            sb2.append(str);
            sb2.append(oc1Var.a());
            i10++;
            str = ", ";
        }
        sb2.append("})");
        b(sb2.toString());
    }

    public final void a(nu1 nu1Var, String str) {
        b("notifyErrorEvent(" + JSONObject.quote(nu1Var.a()) + ", " + JSONObject.quote(str) + ")");
    }

    public final void a(nu1 nu1Var) {
        b("nativeCallComplete(" + JSONObject.quote(nu1Var.a()) + ")");
    }
}
