package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.f4;
import k8.i4;
import k8.k5;
import k8.m5;
import k8.n1;
import k8.q5;
import k8.t5;
import k8.w5;
import k8.x3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class p5 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90311a;

    public p5(my myVar) {
        this.f90311a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m5 resolve(ParsingContext parsingContext, q5 q5Var, JSONObject jSONObject) {
        if (q5Var instanceof q5.a) {
            return new m5.a(((n1.f) this.f90311a.M().getValue()).resolve(parsingContext, ((q5.a) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.b) {
            return new m5.b(((s1) this.f90311a.P().getValue()).resolve(parsingContext, ((q5.b) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.c) {
            return new m5.c(((x1) this.f90311a.S().getValue()).resolve(parsingContext, ((q5.c) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.d) {
            return new m5.d(((c2) this.f90311a.V().getValue()).resolve(parsingContext, ((q5.d) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.e) {
            return new m5.e(((h2) this.f90311a.Y().getValue()).resolve(parsingContext, ((q5.e) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.f) {
            return new m5.f(((m2) this.f90311a.b0().getValue()).resolve(parsingContext, ((q5.f) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.i) {
            return new m5.i(((w2) this.f90311a.h0().getValue()).resolve(parsingContext, ((q5.i) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.j) {
            return new m5.j(((b3) this.f90311a.k0().getValue()).resolve(parsingContext, ((q5.j) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.k) {
            return new m5.k(((g3) this.f90311a.n0().getValue()).resolve(parsingContext, ((q5.k) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.l) {
            return new m5.l(((l3) this.f90311a.q0().getValue()).resolve(parsingContext, ((q5.l) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.m) {
            return new m5.m(((q3) this.f90311a.t0().getValue()).resolve(parsingContext, ((q5.m) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.n) {
            return new m5.n(((x3.e) this.f90311a.C0().getValue()).resolve(parsingContext, ((q5.n) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.o) {
            return new m5.o(((f4.d) this.f90311a.I0().getValue()).resolve(parsingContext, ((q5.o) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.p) {
            return new m5.p(((i4.d) this.f90311a.L0().getValue()).resolve(parsingContext, ((q5.p) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.q) {
            return new m5.q(((n4) this.f90311a.O0().getValue()).resolve(parsingContext, ((q5.q) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.r) {
            return new m5.r(((s4) this.f90311a.R0().getValue()).resolve(parsingContext, ((q5.r) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.s) {
            return new m5.s(((x4) this.f90311a.U0().getValue()).resolve(parsingContext, ((q5.s) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.t) {
            return new m5.t(((c5) this.f90311a.X0().getValue()).resolve(parsingContext, ((q5.t) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.u) {
            return new m5.u(((k5.e) this.f90311a.g1().getValue()).resolve(parsingContext, ((q5.u) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.v) {
            return new m5.v(((t5.d) this.f90311a.m1().getValue()).resolve(parsingContext, ((q5.v) q5Var).c(), jSONObject));
        }
        if (q5Var instanceof q5.w) {
            return new m5.w(((w5.e) this.f90311a.p1().getValue()).resolve(parsingContext, ((q5.w) q5Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
