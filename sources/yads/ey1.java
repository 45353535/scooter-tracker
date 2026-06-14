package yads;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ey1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fy1 f110524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f110525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey1(fy1 fy1Var, View view, Continuation continuation) {
        super(2, continuation);
        this.f110524c = fy1Var;
        this.f110525d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ey1(this.f110524c, this.f110525d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ey1(this.f110524c, this.f110525d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f110523b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            fy1 fy1Var = this.f110524c;
            x3 x3Var = fy1Var.f110977b;
            View view = this.f110525d;
            gi giVar = fy1Var.f110976a;
            td1 td1Var = fy1Var.f110980e;
            yz1 yz1Var = fy1Var.f110978c;
            this.f110523b = 1;
            w3 w3Var = (w3) x3Var;
            f1 f1Var = w3Var.f117292d.f111399b;
            e1 e1Var = new e1(f1Var.f110576e, f1Var.f110572a, f1Var.f110573b, f1Var.f110574c, f1Var.f110575d, td1Var.f116206b);
            f1Var.f110577f = e1Var;
            v02 v02Var = f1Var.f110578g;
            if (v02Var != null) {
                f1Var.f110578g = v02Var;
                e1Var.f110150b.f111830k = v02Var;
            }
            Context context = view.getContext();
            x9 x9Var = w3Var.f117297i.f115317a;
            lx1 lx1Var = w3Var.f117295g;
            vu vuVar = new vu(lx1Var.f113260c, lx1Var.f113258a, new mx1(giVar.f111213a, lx1Var.f113262e), ((pr3) lx1Var.f113259b).a(), new cx(), new pe(lx1Var.f113261d));
            b33 b33Var = w3Var.f117293e;
            es2 es2Var = w3Var.f117289a;
            c4 c4Var = w3Var.f117291c;
            t9 t9Var = w3Var.f117290b;
            b33Var.getClass();
            Object obj2 = vt2.f117186j;
            hr2 hr2VarA = ut2.a().a(context);
            if (hr2VarA != null) {
                boolean z10 = hr2VarA.f111725f;
            }
            p2 p2Var = new p2(es2Var);
            hl0 hl0Var = hl0.f111625c;
            ra0 ra0Var = new ra0(context, c4Var, t9Var, x9Var, p2Var, gl0.a(context));
            xa xaVar = w3Var.f117294f;
            z22 z22Var = new z22(xaVar, ra0Var);
            objA = w3Var.a(view, td1Var, new v0(new p0(w3Var.f117291c, w3Var.f117289a, w3Var.f117290b, vuVar, z22Var, yz1Var, w3Var.f117292d, w3Var.f117296h)), new y22(xaVar, ra0Var, vuVar), this);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objA = obj;
        }
        if (((zy0) objA).f118872a) {
            this.f110524c.f110981f.a();
        }
        return Unit.f93236a;
    }
}
