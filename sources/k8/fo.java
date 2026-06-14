package k8;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ao;
import k8.ep;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fo implements JSONSerializable, JsonTemplate {
    public static final b T = new b(null);
    private static final Expression U;
    private static final Expression V;
    private static final Expression W;
    private static final ep.e X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f87570a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f87571b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final ep.d f87572c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Function2 f87573d0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f87578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f87579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f87580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f87581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f87582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f87583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f87584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f87585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f87586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f87587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f87588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f87589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f87590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f87591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f87592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f87593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f87594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f87595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f87596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f87597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f87598y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f87599z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87600f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fo invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new fo(parsingEnvironment, null, false, jSONObject, 6, null);
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
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        W = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
        X = new ep.e(new nx(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f87570a0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f87571b0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f87572c0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f87573d0 = a.f87600f;
    }

    public fo(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45) {
        this.f87574a = field;
        this.f87575b = field2;
        this.f87576c = field3;
        this.f87577d = field4;
        this.f87578e = field5;
        this.f87579f = field6;
        this.f87580g = field7;
        this.f87581h = field8;
        this.f87582i = field9;
        this.f87583j = field10;
        this.f87584k = field11;
        this.f87585l = field12;
        this.f87586m = field13;
        this.f87587n = field14;
        this.f87588o = field15;
        this.f87589p = field16;
        this.f87590q = field17;
        this.f87591r = field18;
        this.f87592s = field19;
        this.f87593t = field20;
        this.f87594u = field21;
        this.f87595v = field22;
        this.f87596w = field23;
        this.f87597x = field24;
        this.f87598y = field25;
        this.f87599z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ao.h) BuiltInParserKt.getBuiltInParserComponent().E6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f87601c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Function2 f87602d = a.f87605f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f87603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f87604b;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87605f = new a();

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

        public c(Field field, Field field2) {
            this.f87603a = field;
            this.f87604b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((co) BuiltInParserKt.getBuiltInParserComponent().H6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ fo(ParsingEnvironment parsingEnvironment, fo foVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : foVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fo(ParsingEnvironment parsingEnvironment, fo foVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
