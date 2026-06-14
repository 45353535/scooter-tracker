package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class dr2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u5 f110034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public er2 f110035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vo f110036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f110037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f110038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ er2 f110039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vo f110040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vz f110041i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr2(er2 er2Var, vo voVar, vz vzVar, Continuation continuation) {
        super(2, continuation);
        this.f110039g = er2Var;
        this.f110040h = voVar;
        this.f110041i = vzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        dr2 dr2Var = new dr2(this.f110039g, this.f110040h, this.f110041i, continuation);
        dr2Var.f110038f = obj;
        return dr2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dr2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(1:(1:(3:10|69|70)(2:8|9))(1:11))(2:12|(2:14|68)(1:15))|16|72|17|(4:20|(4:23|(2:80|32)(0)|33|21)|77|18)|74|35|36|(1:38)(1:39)|(1:41)|(1:43)(1:44)|(1:46)|47|(1:49)(1:50)|51|(1:53)(1:54)|(1:56)|57|(4:59|(1:61)(1:62)|63|(1:82))(2:66|(1:81))|69|70) */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dr2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
