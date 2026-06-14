package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.f6;
import k8.n9;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g6 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f87743i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f87744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f87745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final n9.d f87746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f87747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function2 f87748n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f87753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f87754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f87755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f87756h;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87757f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new g6(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f87744j = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        f87745k = Expression.Companion.constant$default(companion, c6.SPRING, null, 2, null);
        f87746l = new n9.d(new tf());
        f87747m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87748n = a.f87757f;
    }

    public g6(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8) {
        this.f87749a = field;
        this.f87750b = field2;
        this.f87751c = field3;
        this.f87752d = field4;
        this.f87753e = field5;
        this.f87754f = field6;
        this.f87755g = field7;
        this.f87756h = field8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((f6.e) BuiltInParserKt.getBuiltInParserComponent().r1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ g6(ParsingEnvironment parsingEnvironment, g6 g6Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : g6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g6(ParsingEnvironment parsingEnvironment, g6 g6Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
