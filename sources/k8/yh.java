package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ao;
import k8.b9;
import k8.ca;
import k8.ce;
import k8.cf;
import k8.je;
import k8.ks;
import k8.mo;
import k8.pk;
import k8.re;
import k8.rf;
import k8.rq;
import k8.rt;
import k8.ts;
import k8.vw;
import k8.xg;
import k8.y0;
import k8.yp;
import k8.yr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yh implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92745a;

    public yh(my myVar) {
        this.f92745a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y0 resolve(ParsingContext parsingContext, ts tsVar, JSONObject jSONObject) {
        if (tsVar instanceof ts.h) {
            return new y0.h(((cf.k) this.f92745a.Z3().getValue()).resolve(parsingContext, ((ts.h) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.f) {
            return new y0.f(((je.j) this.f92745a.Q3().getValue()).resolve(parsingContext, ((ts.f) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.r) {
            return new y0.r(((rt.n) this.f92745a.r8().getValue()).resolve(parsingContext, ((ts.r) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.m) {
            return new y0.m(((mo.g) this.f92745a.O6().getValue()).resolve(parsingContext, ((ts.m) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.c) {
            return new y0.c(((b9.k) this.f92745a.o2().getValue()).resolve(parsingContext, ((ts.c) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.g) {
            return new y0.g(((re.i) this.f92745a.T3().getValue()).resolve(parsingContext, ((ts.g) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.e) {
            return new y0.e(((ce.k) this.f92745a.N3().getValue()).resolve(parsingContext, ((ts.e) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.k) {
            return new y0.k(((pk.j) this.f92745a.B5().getValue()).resolve(parsingContext, ((ts.k) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.q) {
            return new y0.q(((ks.g) this.f92745a.W7().getValue()).resolve(parsingContext, ((ts.q) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.o) {
            return new y0.o(((rq.h) this.f92745a.v7().getValue()).resolve(parsingContext, ((ts.o) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.d) {
            return new y0.d(((ca.g) this.f92745a.D2().getValue()).resolve(parsingContext, ((ts.d) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.i) {
            return new y0.i(((rf.h) this.f92745a.f4().getValue()).resolve(parsingContext, ((ts.i) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.n) {
            return new y0.n(((yp.g) this.f92745a.j7().getValue()).resolve(parsingContext, ((ts.n) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.p) {
            return new y0.p(((yr.g) this.f92745a.Q7().getValue()).resolve(parsingContext, ((ts.p) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.j) {
            return new y0.j(((xg.n) this.f92745a.u4().getValue()).resolve(parsingContext, ((ts.j) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.l) {
            return new y0.l(((ao.i) this.f92745a.F6().getValue()).resolve(parsingContext, ((ts.l) tsVar).c(), jSONObject));
        }
        if (tsVar instanceof ts.s) {
            return new y0.s(((vw.h) this.f92745a.p9().getValue()).resolve(parsingContext, ((ts.s) tsVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
