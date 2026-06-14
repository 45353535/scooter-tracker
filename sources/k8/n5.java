package k8;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.f4;
import k8.i4;
import k8.k5;
import k8.m5;
import k8.n1;
import k8.t5;
import k8.w5;
import k8.x3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class n5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90000a;

    public n5(my myVar) {
        this.f90000a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1623648839:
                if (string.equals("set_variable")) {
                    return new m5.r(((q4) this.f90000a.P0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1623635702:
                if (string.equals("animator_start")) {
                    return new m5.a(((n1.d) this.f90000a.K().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1254965146:
                if (string.equals("clear_focus")) {
                    return new m5.f(((k2) this.f90000a.Z().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1160753574:
                if (string.equals("animator_stop")) {
                    return new m5.b(((q1) this.f90000a.N().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -891535336:
                if (string.equals("submit")) {
                    return new m5.t(((a5) this.f90000a.V0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -796594542:
                if (string.equals("set_stored_value")) {
                    return new m5.q(((l4) this.f90000a.M0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -404256420:
                if (string.equals("copy_to_clipboard")) {
                    return new m5.i(((u2) this.f90000a.f0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -326583939:
                if (string.equals("update_structure")) {
                    return new m5.v(((t5.b) this.f90000a.k1().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 10055918:
                if (string.equals("array_set_value")) {
                    return new m5.e(((f2) this.f90000a.W().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 110364485:
                if (string.equals("timer")) {
                    return new m5.u(((k5.c) this.f90000a.e1().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new m5.w(((w5.c) this.f90000a.n1().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 203934236:
                if (string.equals("array_remove_value")) {
                    return new m5.d(((a2) this.f90000a.T().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 301532353:
                if (string.equals("show_tooltip")) {
                    return new m5.s(((v4) this.f90000a.S0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 417790729:
                if (string.equals("scroll_by")) {
                    return new m5.n(((x3.c) this.f90000a.A0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 417791277:
                if (string.equals("scroll_to")) {
                    return new m5.o(((f4.b) this.f90000a.G0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 932090484:
                if (string.equals("set_state")) {
                    return new m5.p(((i4.b) this.f90000a.J0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1427818632:
                if (string.equals(NativeAdPresenter.DOWNLOAD)) {
                    return new m5.k(((e3) this.f90000a.l0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1550697109:
                if (string.equals("focus_element")) {
                    return new m5.l(((j3) this.f90000a.o0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1587919371:
                if (string.equals("dict_set_value")) {
                    return new m5.j(((z2) this.f90000a.i0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1715728902:
                if (string.equals("hide_tooltip")) {
                    return new m5.m(((o3) this.f90000a.r0().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1811437713:
                if (string.equals("array_insert_value")) {
                    return new m5.c(((v1) this.f90000a.Q().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        q5 q5Var = orThrow instanceof q5 ? (q5) orThrow : null;
        if (q5Var != null) {
            return ((p5) this.f90000a.j1().getValue()).resolve(parsingContext, q5Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, m5 m5Var) {
        if (m5Var instanceof m5.a) {
            return ((n1.d) this.f90000a.K().getValue()).serialize(parsingContext, ((m5.a) m5Var).c());
        }
        if (m5Var instanceof m5.b) {
            return ((q1) this.f90000a.N().getValue()).serialize(parsingContext, ((m5.b) m5Var).c());
        }
        if (m5Var instanceof m5.c) {
            return ((v1) this.f90000a.Q().getValue()).serialize(parsingContext, ((m5.c) m5Var).c());
        }
        if (m5Var instanceof m5.d) {
            return ((a2) this.f90000a.T().getValue()).serialize(parsingContext, ((m5.d) m5Var).c());
        }
        if (m5Var instanceof m5.e) {
            return ((f2) this.f90000a.W().getValue()).serialize(parsingContext, ((m5.e) m5Var).c());
        }
        if (m5Var instanceof m5.f) {
            return ((k2) this.f90000a.Z().getValue()).serialize(parsingContext, ((m5.f) m5Var).c());
        }
        if (m5Var instanceof m5.i) {
            return ((u2) this.f90000a.f0().getValue()).serialize(parsingContext, ((m5.i) m5Var).c());
        }
        if (m5Var instanceof m5.j) {
            return ((z2) this.f90000a.i0().getValue()).serialize(parsingContext, ((m5.j) m5Var).c());
        }
        if (m5Var instanceof m5.k) {
            return ((e3) this.f90000a.l0().getValue()).serialize(parsingContext, ((m5.k) m5Var).c());
        }
        if (m5Var instanceof m5.l) {
            return ((j3) this.f90000a.o0().getValue()).serialize(parsingContext, ((m5.l) m5Var).c());
        }
        if (m5Var instanceof m5.m) {
            return ((o3) this.f90000a.r0().getValue()).serialize(parsingContext, ((m5.m) m5Var).c());
        }
        if (m5Var instanceof m5.n) {
            return ((x3.c) this.f90000a.A0().getValue()).serialize(parsingContext, ((m5.n) m5Var).c());
        }
        if (m5Var instanceof m5.o) {
            return ((f4.b) this.f90000a.G0().getValue()).serialize(parsingContext, ((m5.o) m5Var).c());
        }
        if (m5Var instanceof m5.p) {
            return ((i4.b) this.f90000a.J0().getValue()).serialize(parsingContext, ((m5.p) m5Var).c());
        }
        if (m5Var instanceof m5.q) {
            return ((l4) this.f90000a.M0().getValue()).serialize(parsingContext, ((m5.q) m5Var).c());
        }
        if (m5Var instanceof m5.r) {
            return ((q4) this.f90000a.P0().getValue()).serialize(parsingContext, ((m5.r) m5Var).c());
        }
        if (m5Var instanceof m5.s) {
            return ((v4) this.f90000a.S0().getValue()).serialize(parsingContext, ((m5.s) m5Var).c());
        }
        if (m5Var instanceof m5.t) {
            return ((a5) this.f90000a.V0().getValue()).serialize(parsingContext, ((m5.t) m5Var).c());
        }
        if (m5Var instanceof m5.u) {
            return ((k5.c) this.f90000a.e1().getValue()).serialize(parsingContext, ((m5.u) m5Var).c());
        }
        if (m5Var instanceof m5.v) {
            return ((t5.b) this.f90000a.k1().getValue()).serialize(parsingContext, ((m5.v) m5Var).c());
        }
        if (m5Var instanceof m5.w) {
            return ((w5.c) this.f90000a.n1().getValue()).serialize(parsingContext, ((m5.w) m5Var).c());
        }
        throw new lf.m();
    }
}
