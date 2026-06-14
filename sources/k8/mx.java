package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.lx;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mx implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f89061l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f89062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f89063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f89064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Expression f89065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Function2 f89066q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f89067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f89068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f89069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f89070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f89071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f89072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f89073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f89074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f89075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f89076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f89077k;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f89078f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mx invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new mx(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f89062m = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f89063n = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f89064o = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f89065p = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f89066q = a.f89078f;
    }

    public mx(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.f89067a = field;
        this.f89068b = field2;
        this.f89069c = field3;
        this.f89070d = field4;
        this.f89071e = field5;
        this.f89072f = field6;
        this.f89073g = field7;
        this.f89074h = field8;
        this.f89075i = field9;
        this.f89076j = field10;
        this.f89077k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((lx.c) BuiltInParserKt.getBuiltInParserComponent().x9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ mx(ParsingEnvironment parsingEnvironment, mx mxVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : mxVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mx(ParsingEnvironment parsingEnvironment, mx mxVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
