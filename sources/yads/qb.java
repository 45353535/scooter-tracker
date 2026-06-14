package yads;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class qb implements e83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl0 f114908a = new bl0();

    @Override // yads.e83
    public final String a(Context context, c4 c4Var, bv2 bv2Var) {
        return this.f114908a.a(context, new jt0(gt0.a(context, c4Var, bv2Var)).toString());
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
        return d83.f109836b;
    }
}
