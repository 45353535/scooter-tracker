package yads;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class of2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2 f114298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f114299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qz f114300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx2 f114301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f114302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f114303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of2(long j10, Context context, qz qzVar, mx2 mx2Var, sf2 sf2Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f114298c = sf2Var;
        this.f114299d = context;
        this.f114300e = qzVar;
        this.f114301f = mx2Var;
        this.f114302g = list;
        this.f114303h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        sf2 sf2Var = this.f114298c;
        return new of2(this.f114303h, this.f114299d, this.f114300e, this.f114301f, sf2Var, this.f114302g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((of2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f114297b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        sf2 sf2Var = this.f114298c;
        Context context = this.f114299d;
        qz qzVar = this.f114300e;
        mx2 mx2Var = this.f114301f;
        List list = this.f114302g;
        long j10 = this.f114303h;
        this.f114297b = 1;
        Object objA = sf2.a(j10, context, qzVar, mx2Var, sf2Var, list, this);
        return objA == objG ? objG : objA;
    }
}
