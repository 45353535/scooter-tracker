package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.as;
import k8.ep;
import k8.ks;
import k8.ls;
import k8.rs;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ss implements JSONSerializable, JsonTemplate {
    public static final b R = new b(null);
    private static final Expression S;
    private static final Expression T;
    private static final Expression U;
    private static final ep.e V;
    private static final Expression W;
    private static final Expression X;
    private static final Expression Y;
    private static final hb Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f91110a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final hb f91111b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f91112c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final ep.d f91113d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Function2 f91114e0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f91120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f91121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f91122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f91123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f91124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f91125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f91126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f91127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f91128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f91129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f91130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f91131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f91132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f91133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f91134t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f91135u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f91136v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f91137w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f91138x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f91139y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f91140z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91141f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ss invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ss(parsingEnvironment, null, false, jSONObject, 6, null);
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
        S = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        T = Expression.Companion.constant$default(companion, bool, null, 2, null);
        U = Expression.Companion.constant$default(companion, bool, null, 2, null);
        V = new ep.e(new nx(null, null, null, 7, null));
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Y = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Z = new hb(Expression.Companion.constant$default(companion, 0L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), 0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        f91110a0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f91111b0 = new hb(Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        f91112c0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91113d0 = new ep.d(new ni(null, null, null, 7, null));
        f91114e0 = a.f91141f;
    }

    public ss(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43) {
        this.f91115a = field;
        this.f91116b = field2;
        this.f91117c = field3;
        this.f91118d = field4;
        this.f91119e = field5;
        this.f91120f = field6;
        this.f91121g = field7;
        this.f91122h = field8;
        this.f91123i = field9;
        this.f91124j = field10;
        this.f91125k = field11;
        this.f91126l = field12;
        this.f91127m = field13;
        this.f91128n = field14;
        this.f91129o = field15;
        this.f91130p = field16;
        this.f91131q = field17;
        this.f91132r = field18;
        this.f91133s = field19;
        this.f91134t = field20;
        this.f91135u = field21;
        this.f91136v = field22;
        this.f91137w = field23;
        this.f91138x = field24;
        this.f91139y = field25;
        this.f91140z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ks.f) BuiltInParserKt.getBuiltInParserComponent().V7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f91142d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Function2 f91143e = a.f91147f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f91144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f91145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f91146c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91147f = new a();

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

        public c(Field field, Field field2, Field field3) {
            this.f91144a = field;
            this.f91145b = field2;
            this.f91146c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((cs) BuiltInParserKt.getBuiltInParserComponent().S7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public static final class d implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f91148d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final xc f91149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final xc f91150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f91151g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f91152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f91153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f91154c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91155f = new a();

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
            int i10 = 1;
            f91149e = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, 0 == true ? 1 : 0);
            f91150f = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, 0 == true ? 1 : 0);
            f91151g = a.f91155f;
        }

        public d(Field field, Field field2, Field field3) {
            this.f91152a = field;
            this.f91153b = field2;
            this.f91154c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((ls.c) BuiltInParserKt.getBuiltInParserComponent().Y7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ d(ParsingEnvironment parsingEnvironment, d dVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(ParsingEnvironment parsingEnvironment, d dVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public static final class e implements JSONSerializable, JsonTemplate {
        private static final Expression A;
        private static final Expression B;
        private static final Expression C;
        private static final Expression D;
        private static final Expression E;
        private static final hb F;
        private static final Function2 G;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f91156u = new b(null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final Expression f91157v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final Expression f91158w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final Expression f91159x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final Expression f91160y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Expression f91161z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f91162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f91163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f91164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field f91165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field f91166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Field f91167f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Field f91168g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Field f91169h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Field f91170i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Field f91171j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Field f91172k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Field f91173l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Field f91174m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Field f91175n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Field f91176o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Field f91177p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Field f91178q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Field f91179r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Field f91180s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Field f91181t;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91182f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new e(parsingEnvironment, null, false, jSONObject, 6, null);
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
            f91157v = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            f91158w = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            f91159x = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            f91160y = Expression.Companion.constant$default(companion, as.e.a.SLIDE, null, 2, null);
            f91161z = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            A = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
            B = Expression.Companion.constant$default(companion, jd.REGULAR, null, 2, null);
            C = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            D = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            E = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            F = new hb(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            G = a.f91182f;
        }

        public e(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20) {
            this.f91162a = field;
            this.f91163b = field2;
            this.f91164c = field3;
            this.f91165d = field4;
            this.f91166e = field5;
            this.f91167f = field6;
            this.f91168g = field7;
            this.f91169h = field8;
            this.f91170i = field9;
            this.f91171j = field10;
            this.f91172k = field11;
            this.f91173l = field12;
            this.f91174m = field13;
            this.f91175n = field14;
            this.f91176o = field15;
            this.f91177p = field16;
            this.f91178q = field17;
            this.f91179r = field18;
            this.f91180s = field19;
            this.f91181t = field20;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((rs.h) BuiltInParserKt.getBuiltInParserComponent().b8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ e(ParsingEnvironment parsingEnvironment, e eVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public e(ParsingEnvironment parsingEnvironment, e eVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ ss(ParsingEnvironment parsingEnvironment, ss ssVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : ssVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ss(ParsingEnvironment parsingEnvironment, ss ssVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
