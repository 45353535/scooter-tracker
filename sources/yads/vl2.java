package yads;

import kotlin.Pair;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vl2 implements mc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f42 f117076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb3 f117077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jd3 f117078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ul2 f117079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sc3 f117080e;

    public /* synthetic */ vl2(f42 f42Var, xb3 xb3Var, fd3 fd3Var) {
        this(f42Var, xb3Var, new jd3(new h42(f42Var), fd3Var));
    }

    @Override // yads.mc3
    public final void a(bc2 bc2Var) {
        this.f117080e = bc2Var;
    }

    @Override // yads.mc3
    public final void play() {
        do0 do0Var = (do0) this.f117076a;
        do0Var.f110000k = this.f117079d;
        xb3 xb3Var = this.f117077b;
        a52 a52Var = (a52) xb3Var.f117779d;
        a52 a52Var2 = (a52) xb3Var.f117780e;
        do0Var.f109997h = a52Var;
        do0Var.f109998i = a52Var2;
        Pair pair = a52Var2 != null ? TuplesKt.to(a52Var, a52Var2) : null;
        if (pair == null || !do0Var.f110001l.contains(pair)) {
            do0Var.a(a52Var);
        } else {
            do0Var.a(a52Var2);
        }
    }

    @Override // yads.mc3
    public final void stop() {
        this.f117078c.a();
        do0 do0Var = (do0) this.f117076a;
        if (!do0Var.f110002m) {
            ((vm0) do0Var.f109990a).a(false);
        }
        ((do0) this.f117076a).a();
    }

    public vl2(f42 f42Var, xb3 xb3Var, jd3 jd3Var) {
        this.f117076a = f42Var;
        this.f117077b = xb3Var;
        this.f117078c = jd3Var;
        this.f117079d = new ul2(this);
    }
}
