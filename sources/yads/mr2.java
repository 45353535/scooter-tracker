package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class mr2 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pr2 f113595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr2(pr2 pr2Var) {
        super(1);
        this.f113595b = pr2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lr2 lr2Var = this.f113595b.f114754c;
        sm2 sm2Var = lr2Var.f113199f;
        Context context = lr2Var.f113202i;
        sm2Var.getClass();
        sm2.a(context, lr2Var);
        return Unit.f93236a;
    }
}
