package yads;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class ns2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2 f114009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z41 f114010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v5 f114011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u5 f114012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f114013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f114014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rs2 f114015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114016i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns2(rs2 rs2Var, Continuation continuation) {
        super(continuation);
        this.f114015h = rs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f114014g = obj;
        this.f114016i |= Integer.MIN_VALUE;
        return this.f114015h.a(null, this);
    }
}
