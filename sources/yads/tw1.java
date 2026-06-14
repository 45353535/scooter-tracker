package yads;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mr1 f116402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aj f116403b;

    public tw1(Context context, es2 es2Var, n5 n5Var, qz qzVar, String str) {
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        this.f116402a = ve.a(context, pr3Var.b());
        this.f116403b = new aj(n5Var, qzVar, str);
    }

    public final void a(ArrayList arrayList, xl2 xl2Var) {
        am2 am2VarA = this.f116403b.a();
        am2VarA.b(arrayList, POBCoreNativeConstants.NATIVE_ASSETS);
        Map map = am2VarA.f108722a;
        this.f116402a.a(new zl2(xl2Var.f117890b, MapsKt.toMutableMap(map), am2VarA.f108723b));
    }
}
