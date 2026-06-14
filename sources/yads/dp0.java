package yads;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class dp0 implements ep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne2 f110007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oe2 f110008c;

    public dp0(Context context, ne2 ne2Var, oe2 oe2Var) {
        this.f110006a = context;
        this.f110007b = ne2Var;
        this.f110008c = oe2Var;
    }

    @Override // yads.ep0
    public final Parcelable getValue() {
        oe2 oe2Var = this.f110008c;
        Context context = this.f110006a;
        ne2 ne2Var = this.f110007b;
        oe2Var.getClass();
        return oe2.a(context, ne2Var);
    }
}
