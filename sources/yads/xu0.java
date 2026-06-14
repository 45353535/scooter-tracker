package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class xu0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu0 f117968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(yu0 yu0Var) {
        super(0);
        this.f117968b = yu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f117968b.f118383a;
        xm2 xm2VarA = ym2.a(context, w62.a(context));
        xm2VarA.a();
        return xm2VarA;
    }
}
