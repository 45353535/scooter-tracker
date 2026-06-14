package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f117702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f117703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final db2 f117704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe f117705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zm2 f117706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ao2 f117707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f117708g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x5(Context context, c4 c4Var, es2 es2Var, v5 v5Var) {
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        this(c4Var, ve.a(context, pr3Var.b()), new w5(v5Var), new pe(context));
    }

    public final void a(Object... objArr) {
        int length = objArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (objArr[i10] != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        this.f117708g = z10;
    }

    public final void a(String str) {
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("failure_reason", str);
        map.put("durations", this.f117704c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f117708g));
        a(map);
    }

    public x5(c4 c4Var, dm2 dm2Var, db2 db2Var, pe peVar) {
        this.f117702a = c4Var;
        this.f117703b = dm2Var;
        this.f117704c = db2Var;
        this.f117705d = peVar;
    }

    public final void a(HashMap map) {
        am2 am2Var = new am2(map, 2);
        zm2 zm2Var = this.f117706e;
        if (zm2Var != null) {
            am2Var.f108722a.putAll(zm2Var.a());
        }
        ao2 ao2Var = this.f117707f;
        if (ao2Var != null) {
            am2Var = bm2.a(am2Var, ((vz1) ao2Var).a());
        }
        xl2 xl2Var = xl2.f117866c;
        Map map2 = am2Var.f108722a;
        c cVar = am2Var.f108723b;
        Map mutableMap = MapsKt.toMutableMap(map2);
        this.f117703b.a(new zl2("ad_loading_result", mutableMap, cVar));
        if (Intrinsics.areEqual(map.get("status"), "success")) {
            pe peVar = this.f117705d;
            String str = this.f117702a.f109206m;
            if (str == null) {
                str = wl2.f117511a;
            }
            peVar.a(xl2Var, mutableMap, str, null);
        }
    }

    public final void a() {
        HashMap map = new HashMap();
        map.put("status", "success");
        map.put("durations", this.f117704c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f117708g));
        a(map);
    }
}
