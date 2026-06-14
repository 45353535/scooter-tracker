package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
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
import k8.yp;
import k8.yr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xh implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92399a;

    public xh(my myVar) {
        this.f92399a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ts deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        ts tsVar = entityTemplate instanceof ts ? (ts) entityTemplate : null;
        if (tsVar != null && (strA = tsVar.a()) != null) {
            string = strA;
        }
        switch (string.hashCode()) {
            case -1349088399:
                if (string.equals("custom")) {
                    return new ts.d(((ca.f) this.f92399a.C2().getValue()).deserialize(parsingContext, (da) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case -906021636:
                if (string.equals("select")) {
                    return new ts.l(((ao.h) this.f92399a.E6().getValue()).deserialize(parsingContext, (fo) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case -899647263:
                if (string.equals("slider")) {
                    return new ts.n(((yp.f) this.f92399a.i7().getValue()).deserialize(parsingContext, (cq) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case -889473228:
                if (string.equals("switch")) {
                    return new ts.p(((yr.f) this.f92399a.P7().getValue()).deserialize(parsingContext, (zr) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case -711999985:
                if (string.equals("indicator")) {
                    return new ts.i(((rf.g) this.f92399a.e4().getValue()).deserialize(parsingContext, (sf) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case -410956671:
                if (string.equals("container")) {
                    return new ts.c(((b9.j) this.f92399a.n2().getValue()).deserialize(parsingContext, (d9) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case -196315310:
                if (string.equals("gallery")) {
                    return new ts.e(((ce.j) this.f92399a.M3().getValue()).deserialize(parsingContext, (de) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 102340:
                if (string.equals("gif")) {
                    return new ts.f(((je.i) this.f92399a.P3().getValue()).deserialize(parsingContext, (ke) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 3181382:
                if (string.equals("grid")) {
                    return new ts.g(((re.h) this.f92399a.S3().getValue()).deserialize(parsingContext, (se) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 3552126:
                if (string.equals("tabs")) {
                    return new ts.q(((ks.f) this.f92399a.V7().getValue()).deserialize(parsingContext, (ss) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 3556653:
                if (string.equals("text")) {
                    return new ts.r(((rt.m) this.f92399a.q8().getValue()).deserialize(parsingContext, (xu) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new ts.h(((cf.j) this.f92399a.Y3().getValue()).deserialize(parsingContext, (ef) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 100358090:
                if (string.equals("input")) {
                    return new ts.j(((xg.m) this.f92399a.t4().getValue()).deserialize(parsingContext, (hh) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 106426307:
                if (string.equals("pager")) {
                    return new ts.k(((pk.i) this.f92399a.A5().getValue()).deserialize(parsingContext, (vk) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 109757585:
                if (string.equals("state")) {
                    return new ts.o(((rq.g) this.f92399a.u7().getValue()).deserialize(parsingContext, (vq) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new ts.s(((vw.g) this.f92399a.o9().getValue()).deserialize(parsingContext, (fx) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
            case 1732829925:
                if (string.equals("separator")) {
                    return new ts.m(((mo.f) this.f92399a.N6().getValue()).deserialize(parsingContext, (no) (tsVar != null ? tsVar.b() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ts tsVar) {
        if (tsVar instanceof ts.h) {
            return ((cf.j) this.f92399a.Y3().getValue()).serialize(parsingContext, ((ts.h) tsVar).c());
        }
        if (tsVar instanceof ts.f) {
            return ((je.i) this.f92399a.P3().getValue()).serialize(parsingContext, ((ts.f) tsVar).c());
        }
        if (tsVar instanceof ts.r) {
            return ((rt.m) this.f92399a.q8().getValue()).serialize(parsingContext, ((ts.r) tsVar).c());
        }
        if (tsVar instanceof ts.m) {
            return ((mo.f) this.f92399a.N6().getValue()).serialize(parsingContext, ((ts.m) tsVar).c());
        }
        if (tsVar instanceof ts.c) {
            return ((b9.j) this.f92399a.n2().getValue()).serialize(parsingContext, ((ts.c) tsVar).c());
        }
        if (tsVar instanceof ts.g) {
            return ((re.h) this.f92399a.S3().getValue()).serialize(parsingContext, ((ts.g) tsVar).c());
        }
        if (tsVar instanceof ts.e) {
            return ((ce.j) this.f92399a.M3().getValue()).serialize(parsingContext, ((ts.e) tsVar).c());
        }
        if (tsVar instanceof ts.k) {
            return ((pk.i) this.f92399a.A5().getValue()).serialize(parsingContext, ((ts.k) tsVar).c());
        }
        if (tsVar instanceof ts.q) {
            return ((ks.f) this.f92399a.V7().getValue()).serialize(parsingContext, ((ts.q) tsVar).c());
        }
        if (tsVar instanceof ts.o) {
            return ((rq.g) this.f92399a.u7().getValue()).serialize(parsingContext, ((ts.o) tsVar).c());
        }
        if (tsVar instanceof ts.d) {
            return ((ca.f) this.f92399a.C2().getValue()).serialize(parsingContext, ((ts.d) tsVar).c());
        }
        if (tsVar instanceof ts.i) {
            return ((rf.g) this.f92399a.e4().getValue()).serialize(parsingContext, ((ts.i) tsVar).c());
        }
        if (tsVar instanceof ts.n) {
            return ((yp.f) this.f92399a.i7().getValue()).serialize(parsingContext, ((ts.n) tsVar).c());
        }
        if (tsVar instanceof ts.p) {
            return ((yr.f) this.f92399a.P7().getValue()).serialize(parsingContext, ((ts.p) tsVar).c());
        }
        if (tsVar instanceof ts.j) {
            return ((xg.m) this.f92399a.t4().getValue()).serialize(parsingContext, ((ts.j) tsVar).c());
        }
        if (tsVar instanceof ts.l) {
            return ((ao.h) this.f92399a.E6().getValue()).serialize(parsingContext, ((ts.l) tsVar).c());
        }
        if (tsVar instanceof ts.s) {
            return ((vw.g) this.f92399a.o9().getValue()).serialize(parsingContext, ((ts.s) tsVar).c());
        }
        throw new lf.m();
    }
}
