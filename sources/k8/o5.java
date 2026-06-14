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
import k8.n1;
import k8.q5;
import k8.t5;
import k8.w5;
import k8.x3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class o5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90151a;

    public o5(my myVar) {
        this.f90151a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        q5 q5Var = entityTemplate instanceof q5 ? (q5) entityTemplate : null;
        if (q5Var != null && (strA = q5Var.a()) != null) {
            string = strA;
        }
        switch (string.hashCode()) {
            case -1623648839:
                if (string.equals("set_variable")) {
                    return new q5.r(((r4) this.f90151a.Q0().getValue()).deserialize(parsingContext, (t4) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case -1623635702:
                if (string.equals("animator_start")) {
                    return new q5.a(((n1.e) this.f90151a.L().getValue()).deserialize(parsingContext, (o1) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case -1254965146:
                if (string.equals("clear_focus")) {
                    return new q5.f(((l2) this.f90151a.a0().getValue()).deserialize(parsingContext, (n2) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case -1160753574:
                if (string.equals("animator_stop")) {
                    return new q5.b(((r1) this.f90151a.O().getValue()).deserialize(parsingContext, (t1) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case -891535336:
                if (string.equals("submit")) {
                    return new q5.t(((b5) this.f90151a.W0().getValue()).deserialize(parsingContext, (h5) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case -796594542:
                if (string.equals("set_stored_value")) {
                    return new q5.q(((m4) this.f90151a.N0().getValue()).deserialize(parsingContext, (o4) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case -404256420:
                if (string.equals("copy_to_clipboard")) {
                    return new q5.i(((v2) this.f90151a.g0().getValue()).deserialize(parsingContext, (x2) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case -326583939:
                if (string.equals("update_structure")) {
                    return new q5.v(((t5.c) this.f90151a.l1().getValue()).deserialize(parsingContext, (u5) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 10055918:
                if (string.equals("array_set_value")) {
                    return new q5.e(((g2) this.f90151a.X().getValue()).deserialize(parsingContext, (i2) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 110364485:
                if (string.equals("timer")) {
                    return new q5.u(((k5.d) this.f90151a.f1().getValue()).deserialize(parsingContext, (l5) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new q5.w(((w5.d) this.f90151a.o1().getValue()).deserialize(parsingContext, (x5) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 203934236:
                if (string.equals("array_remove_value")) {
                    return new q5.d(((b2) this.f90151a.U().getValue()).deserialize(parsingContext, (d2) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 301532353:
                if (string.equals("show_tooltip")) {
                    return new q5.s(((w4) this.f90151a.T0().getValue()).deserialize(parsingContext, (y4) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 417790729:
                if (string.equals("scroll_by")) {
                    return new q5.n(((x3.d) this.f90151a.B0().getValue()).deserialize(parsingContext, (y3) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 417791277:
                if (string.equals("scroll_to")) {
                    return new q5.o(((f4.c) this.f90151a.H0().getValue()).deserialize(parsingContext, (g4) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 932090484:
                if (string.equals("set_state")) {
                    return new q5.p(((i4.c) this.f90151a.K0().getValue()).deserialize(parsingContext, (j4) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 1427818632:
                if (string.equals(NativeAdPresenter.DOWNLOAD)) {
                    return new q5.k(((f3) this.f90151a.m0().getValue()).deserialize(parsingContext, (h3) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 1550697109:
                if (string.equals("focus_element")) {
                    return new q5.l(((k3) this.f90151a.p0().getValue()).deserialize(parsingContext, (m3) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 1587919371:
                if (string.equals("dict_set_value")) {
                    return new q5.j(((a3) this.f90151a.j0().getValue()).deserialize(parsingContext, (c3) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 1715728902:
                if (string.equals("hide_tooltip")) {
                    return new q5.m(((p3) this.f90151a.s0().getValue()).deserialize(parsingContext, (r3) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
            case 1811437713:
                if (string.equals("array_insert_value")) {
                    return new q5.c(((w1) this.f90151a.R().getValue()).deserialize(parsingContext, (y1) (q5Var != null ? q5Var.b() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, q5 q5Var) {
        if (q5Var instanceof q5.a) {
            return ((n1.e) this.f90151a.L().getValue()).serialize(parsingContext, ((q5.a) q5Var).c());
        }
        if (q5Var instanceof q5.b) {
            return ((r1) this.f90151a.O().getValue()).serialize(parsingContext, ((q5.b) q5Var).c());
        }
        if (q5Var instanceof q5.c) {
            return ((w1) this.f90151a.R().getValue()).serialize(parsingContext, ((q5.c) q5Var).c());
        }
        if (q5Var instanceof q5.d) {
            return ((b2) this.f90151a.U().getValue()).serialize(parsingContext, ((q5.d) q5Var).c());
        }
        if (q5Var instanceof q5.e) {
            return ((g2) this.f90151a.X().getValue()).serialize(parsingContext, ((q5.e) q5Var).c());
        }
        if (q5Var instanceof q5.f) {
            return ((l2) this.f90151a.a0().getValue()).serialize(parsingContext, ((q5.f) q5Var).c());
        }
        if (q5Var instanceof q5.i) {
            return ((v2) this.f90151a.g0().getValue()).serialize(parsingContext, ((q5.i) q5Var).c());
        }
        if (q5Var instanceof q5.j) {
            return ((a3) this.f90151a.j0().getValue()).serialize(parsingContext, ((q5.j) q5Var).c());
        }
        if (q5Var instanceof q5.k) {
            return ((f3) this.f90151a.m0().getValue()).serialize(parsingContext, ((q5.k) q5Var).c());
        }
        if (q5Var instanceof q5.l) {
            return ((k3) this.f90151a.p0().getValue()).serialize(parsingContext, ((q5.l) q5Var).c());
        }
        if (q5Var instanceof q5.m) {
            return ((p3) this.f90151a.s0().getValue()).serialize(parsingContext, ((q5.m) q5Var).c());
        }
        if (q5Var instanceof q5.n) {
            return ((x3.d) this.f90151a.B0().getValue()).serialize(parsingContext, ((q5.n) q5Var).c());
        }
        if (q5Var instanceof q5.o) {
            return ((f4.c) this.f90151a.H0().getValue()).serialize(parsingContext, ((q5.o) q5Var).c());
        }
        if (q5Var instanceof q5.p) {
            return ((i4.c) this.f90151a.K0().getValue()).serialize(parsingContext, ((q5.p) q5Var).c());
        }
        if (q5Var instanceof q5.q) {
            return ((m4) this.f90151a.N0().getValue()).serialize(parsingContext, ((q5.q) q5Var).c());
        }
        if (q5Var instanceof q5.r) {
            return ((r4) this.f90151a.Q0().getValue()).serialize(parsingContext, ((q5.r) q5Var).c());
        }
        if (q5Var instanceof q5.s) {
            return ((w4) this.f90151a.T0().getValue()).serialize(parsingContext, ((q5.s) q5Var).c());
        }
        if (q5Var instanceof q5.t) {
            return ((b5) this.f90151a.W0().getValue()).serialize(parsingContext, ((q5.t) q5Var).c());
        }
        if (q5Var instanceof q5.u) {
            return ((k5.d) this.f90151a.f1().getValue()).serialize(parsingContext, ((q5.u) q5Var).c());
        }
        if (q5Var instanceof q5.v) {
            return ((t5.c) this.f90151a.l1().getValue()).serialize(parsingContext, ((q5.v) q5Var).c());
        }
        if (q5Var instanceof q5.w) {
            return ((w5.d) this.f90151a.o1().getValue()).serialize(parsingContext, ((q5.w) q5Var).c());
        }
        throw new lf.m();
    }
}
