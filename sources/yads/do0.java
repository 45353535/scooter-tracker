package yads;

import android.view.TextureView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class do0 implements f42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om0 f109990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl1 f109991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag3 f109992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e42 f109993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mg3 f109994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final co0 f109995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jn0 f109996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a52 f109997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a52 f109998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qc3 f109999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public yc3 f110000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f110001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f110002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f110003n;

    public do0(vm0 vm0Var, xl1 xl1Var, ag3 ag3Var, e42 e42Var, mg3 mg3Var) {
        this.f109990a = vm0Var;
        this.f109991b = xl1Var;
        this.f109992c = ag3Var;
        this.f109993d = e42Var;
        this.f109994e = mg3Var;
        co0 co0Var = new co0(this);
        this.f109995f = co0Var;
        this.f109996g = new jn0(co0Var);
        this.f110001l = new HashSet();
        vm0Var.a(co0Var);
        vm0Var.a(mg3Var);
        y6.a(this);
    }

    public final void a(qc3 qc3Var) {
        if (this.f110002m) {
            return;
        }
        this.f109999j = qc3Var;
        xl1 xl1Var = this.f109991b;
        xl1Var.getClass();
        bc0 bc0Var = new bc0(xl1Var.f117865b, new fs2(((x23) he.a().f116107a).a(), xp2.a().a(xl1Var.f117865b)));
        Object obj = un0.f116721c;
        er erVarA = tn0.a().a(xl1Var.f117865b);
        hr hrVar = new hr();
        hrVar.f111708a = erVarA;
        hrVar.f111711d = bc0Var;
        qd0 qd0Var = new qd0(hrVar, new bd0());
        xl1Var.f117864a.getClass();
        ml1 ml1VarCreateMediaSource = qd0Var.createMediaSource(rk1.a(qc3Var.getUrl()));
        ((vm0) this.f109990a).a(false);
        ((vm0) this.f109990a).a(ml1VarCreateMediaSource);
        ((vm0) this.f109990a).o();
        jn0 jn0Var = this.f109996g;
        jn0Var.getClass();
        in0 in0Var = new in0(jn0Var);
        ((ma2) jn0Var.f112398b).a(jn0.f112396c, in0Var);
    }

    public final void a(TextureView textureView) {
        if (this.f110002m) {
            return;
        }
        mg3 mg3Var = this.f109994e;
        mg3Var.f113467c = textureView;
        mg3Var.b();
        ((vm0) this.f109990a).a(textureView);
    }

    public final void a() {
        if (this.f110002m) {
            return;
        }
        yc3 yc3Var = this.f110000k;
        qc3 qc3Var = this.f109999j;
        if (yc3Var != null && qc3Var != null) {
            yc3Var.e();
        }
        this.f110002m = true;
        this.f110003n = false;
        ((ma2) this.f109996g.f112398b).a();
        ((vm0) this.f109990a).a((TextureView) null);
        mg3 mg3Var = this.f109994e;
        mg3Var.f113467c = null;
        mg3Var.b();
        ((vm0) this.f109990a).d(this.f109995f);
        ((vm0) this.f109990a).d(this.f109994e);
        ((vm0) this.f109990a).p();
    }
}
