package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class xd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f117792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f117793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(Context context, Continuation continuation) {
        super(2, continuation);
        this.f117793c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new xd(this.f117793c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xd(this.f117793c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        wd wdVar;
        Object objG = pf.b.g();
        int i10 = this.f117792b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        Object obj2 = wd.f117422d;
        Context context = this.f117793c;
        wd wdVar2 = wd.f117423e;
        if (wdVar2 == null) {
            synchronized (wd.f117422d) {
                wdVar = wd.f117423e;
                if (wdVar == null) {
                    wdVar = new wd(kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(new j10())), new fe(), new ce(context));
                    wd.f117423e = wdVar;
                }
            }
            wdVar2 = wdVar;
        }
        this.f117792b = 1;
        Object objE = eg.x1.e(((Number) wdVar2.f117425b.f116585b.getValue()).longValue(), new vd(wdVar2, null), this);
        return objE == objG ? objG : objE;
    }
}
