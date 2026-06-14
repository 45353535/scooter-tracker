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
import k8.vw;
import k8.xg;
import k8.y0;
import k8.yp;
import k8.yr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wh implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92185a;

    public wh(my myVar) {
        this.f92185a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y0 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1349088399:
                if (string.equals("custom")) {
                    return new y0.d(((ca.e) this.f92185a.B2().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -906021636:
                if (string.equals("select")) {
                    return new y0.l(((ao.g) this.f92185a.D6().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -899647263:
                if (string.equals("slider")) {
                    return new y0.n(((yp.e) this.f92185a.h7().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -889473228:
                if (string.equals("switch")) {
                    return new y0.p(((yr.e) this.f92185a.O7().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -711999985:
                if (string.equals("indicator")) {
                    return new y0.i(((rf.f) this.f92185a.d4().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -410956671:
                if (string.equals("container")) {
                    return new y0.c(((b9.i) this.f92185a.m2().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -196315310:
                if (string.equals("gallery")) {
                    return new y0.e(((ce.i) this.f92185a.L3().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 102340:
                if (string.equals("gif")) {
                    return new y0.f(((je.h) this.f92185a.O3().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3181382:
                if (string.equals("grid")) {
                    return new y0.g(((re.g) this.f92185a.R3().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3552126:
                if (string.equals("tabs")) {
                    return new y0.q(((ks.e) this.f92185a.U7().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3556653:
                if (string.equals("text")) {
                    return new y0.r(((rt.l) this.f92185a.p8().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new y0.h(((cf.i) this.f92185a.X3().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100358090:
                if (string.equals("input")) {
                    return new y0.j(((xg.l) this.f92185a.s4().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 106426307:
                if (string.equals("pager")) {
                    return new y0.k(((pk.h) this.f92185a.z5().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757585:
                if (string.equals("state")) {
                    return new y0.o(((rq.f) this.f92185a.t7().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new y0.s(((vw.f) this.f92185a.n9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1732829925:
                if (string.equals("separator")) {
                    return new y0.m(((mo.e) this.f92185a.M6().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        ts tsVar = orThrow instanceof ts ? (ts) orThrow : null;
        if (tsVar != null) {
            return ((yh) this.f92185a.O4().getValue()).resolve(parsingContext, tsVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, y0 y0Var) {
        if (y0Var instanceof y0.h) {
            return ((cf.i) this.f92185a.X3().getValue()).serialize(parsingContext, ((y0.h) y0Var).d());
        }
        if (y0Var instanceof y0.f) {
            return ((je.h) this.f92185a.O3().getValue()).serialize(parsingContext, ((y0.f) y0Var).d());
        }
        if (y0Var instanceof y0.r) {
            return ((rt.l) this.f92185a.p8().getValue()).serialize(parsingContext, ((y0.r) y0Var).d());
        }
        if (y0Var instanceof y0.m) {
            return ((mo.e) this.f92185a.M6().getValue()).serialize(parsingContext, ((y0.m) y0Var).d());
        }
        if (y0Var instanceof y0.c) {
            return ((b9.i) this.f92185a.m2().getValue()).serialize(parsingContext, ((y0.c) y0Var).d());
        }
        if (y0Var instanceof y0.g) {
            return ((re.g) this.f92185a.R3().getValue()).serialize(parsingContext, ((y0.g) y0Var).d());
        }
        if (y0Var instanceof y0.e) {
            return ((ce.i) this.f92185a.L3().getValue()).serialize(parsingContext, ((y0.e) y0Var).d());
        }
        if (y0Var instanceof y0.k) {
            return ((pk.h) this.f92185a.z5().getValue()).serialize(parsingContext, ((y0.k) y0Var).d());
        }
        if (y0Var instanceof y0.q) {
            return ((ks.e) this.f92185a.U7().getValue()).serialize(parsingContext, ((y0.q) y0Var).d());
        }
        if (y0Var instanceof y0.o) {
            return ((rq.f) this.f92185a.t7().getValue()).serialize(parsingContext, ((y0.o) y0Var).d());
        }
        if (y0Var instanceof y0.d) {
            return ((ca.e) this.f92185a.B2().getValue()).serialize(parsingContext, ((y0.d) y0Var).d());
        }
        if (y0Var instanceof y0.i) {
            return ((rf.f) this.f92185a.d4().getValue()).serialize(parsingContext, ((y0.i) y0Var).d());
        }
        if (y0Var instanceof y0.n) {
            return ((yp.e) this.f92185a.h7().getValue()).serialize(parsingContext, ((y0.n) y0Var).d());
        }
        if (y0Var instanceof y0.p) {
            return ((yr.e) this.f92185a.O7().getValue()).serialize(parsingContext, ((y0.p) y0Var).d());
        }
        if (y0Var instanceof y0.j) {
            return ((xg.l) this.f92185a.s4().getValue()).serialize(parsingContext, ((y0.j) y0Var).d());
        }
        if (y0Var instanceof y0.l) {
            return ((ao.g) this.f92185a.D6().getValue()).serialize(parsingContext, ((y0.l) y0Var).d());
        }
        if (y0Var instanceof y0.s) {
            return ((vw.f) this.f92185a.n9().getValue()).serialize(parsingContext, ((y0.s) y0Var).d());
        }
        throw new lf.m();
    }
}
