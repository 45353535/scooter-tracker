package yads;

import android.content.Context;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sz0 extends rn {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z82 f115997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ck2 f115998x;

    public /* synthetic */ sz0(Context context, c4 c4Var, es2 es2Var, v5 v5Var) {
        this(context, c4Var, es2Var, v5Var, l10.a((nl0) ((pr3) es2Var).a()), new z82(), ck2.f109432b.a());
    }

    @Override // yads.rn
    public final hn a(String str, String str2) {
        JSONObject jSONObjectA;
        Context context = this.f115505a;
        c4 c4Var = this.f115507c;
        mr1 mr1VarA = ((pr3) this.f115508d).a();
        rv2.f115619a.getClass();
        i4 i4Var = new i4(context, c4Var, mr1VarA, str, str2, this, this, qv2.a(context), new hz1(new oz1(context, mr1VarA)), new pz1());
        e9 e9Var = this.f115507c.f109198e;
        String strOptString = null;
        String str3 = e9Var != null ? e9Var.f110259h : null;
        this.f115997w.getClass();
        if (str3 != null && (jSONObjectA = rc1.a(str3)) != null && jSONObjectA.has("response")) {
            strOptString = jSONObjectA.optString("response");
        }
        if (strOptString == null) {
            return i4Var;
        }
        ck2 ck2Var = this.f115998x;
        ck2Var.getClass();
        synchronized (ck2.f109433c) {
            ck2Var.f109435a.put(i4Var, strOptString);
            Unit unit = Unit.f93236a;
        }
        return i4Var;
    }

    public sz0(Context context, c4 c4Var, es2 es2Var, v5 v5Var, CoroutineScope coroutineScope, z82 z82Var, ck2 ck2Var) {
        super(context, v5Var, c4Var, es2Var, coroutineScope);
        this.f115997w = z82Var;
        this.f115998x = ck2Var;
    }
}
