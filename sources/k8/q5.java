package k8;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class q5 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f90509a = new h(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f90510b = g.f90517f;

    public static final class a extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o1 f90511c;

        public a(o1 o1Var) {
            super(null);
            this.f90511c = o1Var;
        }

        public final o1 c() {
            return this.f90511c;
        }
    }

    public static final class b extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t1 f90512c;

        public b(t1 t1Var) {
            super(null);
            this.f90512c = t1Var;
        }

        public final t1 c() {
            return this.f90512c;
        }
    }

    public static final class c extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y1 f90513c;

        public c(y1 y1Var) {
            super(null);
            this.f90513c = y1Var;
        }

        public final y1 c() {
            return this.f90513c;
        }
    }

    public static final class d extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d2 f90514c;

        public d(d2 d2Var) {
            super(null);
            this.f90514c = d2Var;
        }

        public final d2 c() {
            return this.f90514c;
        }
    }

    public static final class e extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i2 f90515c;

        public e(i2 i2Var) {
            super(null);
            this.f90515c = i2Var;
        }

        public final i2 c() {
            return this.f90515c;
        }
    }

    public static final class f extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n2 f90516c;

        public f(n2 n2Var) {
            super(null);
            this.f90516c = n2Var;
        }

        public final n2 c() {
            return this.f90516c;
        }
    }

    static final class g extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f90517f = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return h.b(q5.f90509a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ q5 b(h hVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return hVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final q5 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((o5) BuiltInParserKt.getBuiltInParserComponent().i1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private h() {
        }
    }

    public static final class i extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x2 f90518c;

        public i(x2 x2Var) {
            super(null);
            this.f90518c = x2Var;
        }

        public final x2 c() {
            return this.f90518c;
        }
    }

    public static final class j extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c3 f90519c;

        public j(c3 c3Var) {
            super(null);
            this.f90519c = c3Var;
        }

        public final c3 c() {
            return this.f90519c;
        }
    }

    public static final class k extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h3 f90520c;

        public k(h3 h3Var) {
            super(null);
            this.f90520c = h3Var;
        }

        public final h3 c() {
            return this.f90520c;
        }
    }

    public static final class l extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m3 f90521c;

        public l(m3 m3Var) {
            super(null);
            this.f90521c = m3Var;
        }

        public final m3 c() {
            return this.f90521c;
        }
    }

    public static final class m extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final r3 f90522c;

        public m(r3 r3Var) {
            super(null);
            this.f90522c = r3Var;
        }

        public final r3 c() {
            return this.f90522c;
        }
    }

    public static final class n extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y3 f90523c;

        public n(y3 y3Var) {
            super(null);
            this.f90523c = y3Var;
        }

        public final y3 c() {
            return this.f90523c;
        }
    }

    public static final class o extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g4 f90524c;

        public o(g4 g4Var) {
            super(null);
            this.f90524c = g4Var;
        }

        public final g4 c() {
            return this.f90524c;
        }
    }

    public static final class p extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j4 f90525c;

        public p(j4 j4Var) {
            super(null);
            this.f90525c = j4Var;
        }

        public final j4 c() {
            return this.f90525c;
        }
    }

    public static final class q extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o4 f90526c;

        public q(o4 o4Var) {
            super(null);
            this.f90526c = o4Var;
        }

        public final o4 c() {
            return this.f90526c;
        }
    }

    public static final class r extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t4 f90527c;

        public r(t4 t4Var) {
            super(null);
            this.f90527c = t4Var;
        }

        public final t4 c() {
            return this.f90527c;
        }
    }

    public static final class s extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y4 f90528c;

        public s(y4 y4Var) {
            super(null);
            this.f90528c = y4Var;
        }

        public final y4 c() {
            return this.f90528c;
        }
    }

    public static final class t extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h5 f90529c;

        public t(h5 h5Var) {
            super(null);
            this.f90529c = h5Var;
        }

        public final h5 c() {
            return this.f90529c;
        }
    }

    public static final class u extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l5 f90530c;

        public u(l5 l5Var) {
            super(null);
            this.f90530c = l5Var;
        }

        public final l5 c() {
            return this.f90530c;
        }
    }

    public static final class v extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u5 f90531c;

        public v(u5 u5Var) {
            super(null);
            this.f90531c = u5Var;
        }

        public final u5 c() {
            return this.f90531c;
        }
    }

    public static final class w extends q5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x5 f90532c;

        public w(x5 x5Var) {
            super(null);
            this.f90532c = x5Var;
        }

        public final x5 c() {
            return this.f90532c;
        }
    }

    public /* synthetic */ q5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return "animator_start";
        }
        if (this instanceof b) {
            return "animator_stop";
        }
        if (this instanceof c) {
            return "array_insert_value";
        }
        if (this instanceof d) {
            return "array_remove_value";
        }
        if (this instanceof e) {
            return "array_set_value";
        }
        if (this instanceof f) {
            return "clear_focus";
        }
        if (this instanceof i) {
            return "copy_to_clipboard";
        }
        if (this instanceof j) {
            return "dict_set_value";
        }
        if (this instanceof k) {
            return NativeAdPresenter.DOWNLOAD;
        }
        if (this instanceof l) {
            return "focus_element";
        }
        if (this instanceof m) {
            return "hide_tooltip";
        }
        if (this instanceof n) {
            return "scroll_by";
        }
        if (this instanceof o) {
            return "scroll_to";
        }
        if (this instanceof p) {
            return "set_state";
        }
        if (this instanceof q) {
            return "set_stored_value";
        }
        if (this instanceof r) {
            return "set_variable";
        }
        if (this instanceof s) {
            return "show_tooltip";
        }
        if (this instanceof t) {
            return "submit";
        }
        if (this instanceof u) {
            return "timer";
        }
        if (this instanceof v) {
            return "update_structure";
        }
        if (this instanceof w) {
            return "video";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        if (this instanceof t) {
            return ((t) this).c();
        }
        if (this instanceof u) {
            return ((u) this).c();
        }
        if (this instanceof v) {
            return ((v) this).c();
        }
        if (this instanceof w) {
            return ((w) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((o5) BuiltInParserKt.getBuiltInParserComponent().i1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private q5() {
    }
}
