package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c32 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f32 f109188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx1 f109189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c32(f32 f32Var, dx1 dx1Var, Continuation continuation) {
        super(2, continuation);
        this.f109188c = f32Var;
        this.f109189d = dx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c32(this.f109188c, this.f109189d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c32(this.f109188c, this.f109189d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.c32.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
