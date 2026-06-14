package yads;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k72 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m72 f112626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f112627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx2 f112628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f112629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k72(m72 m72Var, Context context, mx2 mx2Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f112626c = m72Var;
        this.f112627d = context;
        this.f112628e = mx2Var;
        this.f112629f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k72(this.f112626c, this.f112627d, this.f112628e, this.f112629f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k72) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112625b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        m72 m72Var = this.f112626c;
        Context context = this.f112627d;
        mx2 mx2Var = this.f112628e;
        List list = this.f112629f;
        this.f112625b = 1;
        Object objA = m72Var.a(context, mx2Var, list, this);
        return objA == objG ? objG : objA;
    }
}
