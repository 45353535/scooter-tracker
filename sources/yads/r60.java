package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f115337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z60 f115338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(Context context, z60 z60Var) {
        super(0);
        this.f115337b = context;
        this.f115338c = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new xk2(this.f115337b, (tm2) this.f115338c.f118576u.getValue(), (q90) this.f115338c.f118577v.getValue(), new m51());
    }
}
