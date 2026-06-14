package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class jx1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kx1 f112493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f112494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f112495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rw1 f112496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f112497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f112499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f112500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kx1 f112501j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx1(List list, kx1 kx1Var, Continuation continuation) {
        super(2, continuation);
        this.f112500i = list;
        this.f112501j = kx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        jx1 jx1Var = new jx1(this.f112500i, this.f112501j, continuation);
        jx1Var.f112499h = obj;
        return jx1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jx1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00de -> B:40:0x00e1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.jx1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
