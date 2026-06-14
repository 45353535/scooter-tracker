package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ga2 implements e83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to1 f111131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bl0 f111132b = new bl0();

    public ga2(to1 to1Var) {
        this.f111131a = to1Var;
    }

    @Override // yads.e83
    public final String a(Context context, c4 c4Var, bv2 bv2Var) {
        Map map = this.f111131a.f116309c;
        ft0 ft0VarA = gt0.a(context, c4Var, bv2Var);
        if (map != null) {
            ft0VarA.f110872i.putAll(map);
        }
        return this.f111132b.a(context, new jt0(ft0VarA).toString());
    }

    @Override // yads.e83
    public final String a(c4 c4Var) {
        String str = c4Var.f109195b.f108850a.f110764e;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // yads.e83
    public final d83 a() {
        return d83.f109837c;
    }
}
