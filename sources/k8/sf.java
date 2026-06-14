package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ep;
import k8.ff;
import k8.rf;
import k8.to;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sf implements JSONSerializable, JsonTemplate {
    public static final b S = new b(null);
    private static final Expression T;
    private static final Expression U;
    private static final Expression V;
    private static final Expression W;
    private static final ep.e X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final to.d f91026a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final xc f91027b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f91028c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final ep.d f91029d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Function2 f91030e0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f91036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f91037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f91038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f91039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f91040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f91041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f91042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f91043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f91044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f91045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f91046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f91047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f91048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f91049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f91050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f91051u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f91052v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f91053w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f91054x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f91055y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f91056z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91057f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sf invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new sf(parsingEnvironment, null, false, jSONObject, 6, null);
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
        T = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        W = Expression.Companion.constant$default(companion, ff.a.SCALE, null, 2, null);
        X = new ep.e(new nx(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        byte b10 = 0 == true ? 1 : 0;
        f91026a0 = new to.d(new gn(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, b10, 31, null));
        f91027b0 = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, 0 == true ? 1 : 0);
        f91028c0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91029d0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f91030e0 = a.f91057f;
    }

    public sf(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44) {
        this.f91031a = field;
        this.f91032b = field2;
        this.f91033c = field3;
        this.f91034d = field4;
        this.f91035e = field5;
        this.f91036f = field6;
        this.f91037g = field7;
        this.f91038h = field8;
        this.f91039i = field9;
        this.f91040j = field10;
        this.f91041k = field11;
        this.f91042l = field12;
        this.f91043m = field13;
        this.f91044n = field14;
        this.f91045o = field15;
        this.f91046p = field16;
        this.f91047q = field17;
        this.f91048r = field18;
        this.f91049s = field19;
        this.f91050t = field20;
        this.f91051u = field21;
        this.f91052v = field22;
        this.f91053w = field23;
        this.f91054x = field24;
        this.f91055y = field25;
        this.f91056z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rf.g) BuiltInParserKt.getBuiltInParserComponent().e4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ sf(ParsingEnvironment parsingEnvironment, sf sfVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : sfVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sf(ParsingEnvironment parsingEnvironment, sf sfVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
