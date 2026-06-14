package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ux1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yx1 f116796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dx1 f116797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg2 f116798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wx1 f116799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx1 f116800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux1(yx1 yx1Var, dx1 dx1Var, hg2 hg2Var, wx1 wx1Var, vx1 vx1Var, Continuation continuation) {
        super(2, continuation);
        this.f116796b = yx1Var;
        this.f116797c = dx1Var;
        this.f116798d = hg2Var;
        this.f116799e = wx1Var;
        this.f116800f = vx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ux1(this.f116796b, this.f116797c, this.f116798d, this.f116799e, this.f116800f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ux1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        yx1 yx1Var = this.f116796b;
        ay1 ay1Var = yx1Var.f118432f;
        Context context = yx1Var.f118431e;
        dx1 dx1Var = this.f116797c;
        hg2 hg2Var = this.f116798d;
        jy1 jy1Var = this.f116799e.f117628d;
        tx1 tx1Var = this.f116800f.f117223a;
        ex1 ex1Var = (ex1) ay1Var.f108866d.f110958a.get(ay1Var.f108863a.f109200g);
        if (ex1Var != null) {
            ex1Var.a(context, dx1Var, hg2Var, ay1Var.f108865c, jy1Var, ay1Var.f108864b, tx1Var);
        } else {
            tx1Var.a(f9.f110640a);
        }
        return Unit.f93236a;
    }
}
