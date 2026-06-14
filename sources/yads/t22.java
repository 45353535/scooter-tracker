package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class t22 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x22 f116039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx1 f116040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg2 f116041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t22(x22 x22Var, dx1 dx1Var, hg2 hg2Var, Continuation continuation) {
        super(2, continuation);
        this.f116039c = x22Var;
        this.f116040d = dx1Var;
        this.f116041e = hg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t22(this.f116039c, this.f116040d, this.f116041e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t22) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.t22.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
