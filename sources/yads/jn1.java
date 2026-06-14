package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jn1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f112399g = CollectionsKt.listOf((Object[]) new xl2[]{xl2.f117875l, xl2.f117876m});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f112400h = CollectionsKt.listOf((Object[]) new xl2[]{xl2.f117877n, xl2.f117878o, xl2.C, xl2.D});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f112401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f112402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9 f112403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final in1 f112404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp1 f112405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oo2 f112406f;

    public /* synthetic */ jn1(c4 c4Var, es2 es2Var, t9 t9Var) {
        this(c4Var, es2Var, t9Var, new in1(), new vp1(), new oo2());
    }

    public final void a(Context context, cp1 cp1Var, Map map) {
        a(context, xl2.f117869f, cp1Var, null, map);
    }

    public final void a(Context context, xl2 xl2Var, cp1 cp1Var, String str, Map map) {
        am2 am2VarA;
        in1 in1Var = this.f112404d;
        t9 t9Var = this.f112403c;
        c4 c4Var = this.f112401a;
        in1Var.getClass();
        if ((t9Var != null ? t9Var.f116120m : null) == ez.f110528b) {
            Object obj = t9Var.f116127t;
            am2VarA = in1Var.f112063b.a(t9Var, c4Var, obj instanceof qz1 ? (qz1) obj : null);
        } else {
            am2VarA = in1Var.f112062a.a(t9Var, c4Var);
        }
        this.f112405e.getClass();
        am2 am2VarA2 = bm2.a(am2VarA, vp1.a(cp1Var));
        am2VarA2.f108722a.putAll(map);
        Map map2 = am2VarA2.f108722a;
        c cVar = am2VarA2.f108723b;
        String str2 = xl2Var.f117890b;
        Map mutableMap = MapsKt.toMutableMap(map2);
        zl2 zl2Var = new zl2(str2, mutableMap, cVar);
        ((pr3) this.f112402b).getClass();
        wr3 wr3Var = wr3.f117545a;
        ((pr3) this.f112402b).getClass();
        ve.a(context, new in3()).a(zl2Var);
        new pe(context).a(xl2Var, mutableMap, str, cp1Var.f109509g);
    }

    public jn1(c4 c4Var, es2 es2Var, t9 t9Var, in1 in1Var, vp1 vp1Var, oo2 oo2Var) {
        this.f112401a = c4Var;
        this.f112402b = es2Var;
        this.f112403c = t9Var;
        this.f112404d = in1Var;
        this.f112405e = vp1Var;
        this.f112406f = oo2Var;
    }
}
