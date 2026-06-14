package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ua1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f70 f116586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f116587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va1 f116589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f116590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua1(va1 va1Var, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f116589e = va1Var;
        this.f116590f = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ua1(this.f116589e, this.f116590f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ua1(this.f116589e, this.f116590f, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041a A[LOOP:3: B:111:0x0414->B:113:0x041a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0238  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ua1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
