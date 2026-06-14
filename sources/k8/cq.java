package k8;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ep;
import k8.fq;
import k8.yp;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cq implements JSONSerializable, JsonTemplate {
    public static final b V = new b(null);
    private static final Expression W;
    private static final ep.e X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f86779a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f86780b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final ep.d f86781c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Function2 f86782d0;
    public final Field A;
    public final Field B;
    public final Field C;
    public final Field D;
    public final Field E;
    public final Field F;
    public final Field G;
    public final Field H;
    public final Field I;
    public final Field J;
    public final Field K;
    public final Field L;
    public final Field M;
    public final Field N;
    public final Field O;
    public final Field P;
    public final Field Q;
    public final Field R;
    public final Field S;
    public final Field T;
    public final Field U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f86785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f86786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f86787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f86788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f86789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f86790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f86791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f86792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f86793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f86794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f86795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f86796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f86797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f86798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f86799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f86800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f86801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f86802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f86803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f86804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f86805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f86806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f86807y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f86808z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86809f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cq invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new cq(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        X = new ep.e(new nx(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Z = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f86779a0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86780b0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f86781c0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f86782d0 = a.f86809f;
    }

    public cq(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47) {
        this.f86783a = field;
        this.f86784b = field2;
        this.f86785c = field3;
        this.f86786d = field4;
        this.f86787e = field5;
        this.f86788f = field6;
        this.f86789g = field7;
        this.f86790h = field8;
        this.f86791i = field9;
        this.f86792j = field10;
        this.f86793k = field11;
        this.f86794l = field12;
        this.f86795m = field13;
        this.f86796n = field14;
        this.f86797o = field15;
        this.f86798p = field16;
        this.f86799q = field17;
        this.f86800r = field18;
        this.f86801s = field19;
        this.f86802t = field20;
        this.f86803u = field21;
        this.f86804v = field22;
        this.f86805w = field23;
        this.f86806x = field24;
        this.f86807y = field25;
        this.f86808z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
        this.J = field36;
        this.K = field37;
        this.L = field38;
        this.M = field39;
        this.N = field40;
        this.O = field41;
        this.P = field42;
        this.Q = field43;
        this.R = field44;
        this.S = field45;
        this.T = field46;
        this.U = field47;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((yp.f) BuiltInParserKt.getBuiltInParserComponent().i7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f86810f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f86811g = a.f86817f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f86812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f86813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f86814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field f86815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field f86816e;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86817f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new c(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.f86812a = field;
            this.f86813b = field2;
            this.f86814c = field3;
            this.f86815d = field4;
            this.f86816e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((aq) BuiltInParserKt.getBuiltInParserComponent().l7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public static final class d implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f86818j = new b(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Expression f86819k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Expression f86820l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Expression f86821m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Expression f86822n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final Function2 f86823o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f86824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f86825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f86826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field f86827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field f86828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Field f86829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Field f86830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Field f86831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Field f86832i;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86833f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new d(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            f86819k = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            f86820l = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
            f86821m = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f86822n = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
            f86823o = a.f86833f;
        }

        public d(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9) {
            this.f86824a = field;
            this.f86825b = field2;
            this.f86826c = field3;
            this.f86827d = field4;
            this.f86828e = field5;
            this.f86829f = field6;
            this.f86830g = field7;
            this.f86831h = field8;
            this.f86832i = field9;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((fq.e) BuiltInParserKt.getBuiltInParserComponent().o7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ d(ParsingEnvironment parsingEnvironment, d dVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(ParsingEnvironment parsingEnvironment, d dVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ cq(ParsingEnvironment parsingEnvironment, cq cqVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : cqVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cq(ParsingEnvironment parsingEnvironment, cq cqVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
