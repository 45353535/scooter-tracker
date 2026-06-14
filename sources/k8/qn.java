package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.pn;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class qn implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f90598g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f90599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f90600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f90601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f90602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f90603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f90604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function2 f90605n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f90607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f90608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f90609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f90610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f90611f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90612f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qn invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new qn(parsingEnvironment, (qn) null, false, jSONObject, 6, (DefaultConstructorMarker) null);
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
        f90599h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f90600i = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f90601j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f90602k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f90603l = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f90604m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90605n = a.f90612f;
    }

    public qn(Field field, Field field2, Field field3, Field field4, Field field5, Field field6) {
        this.f90606a = field;
        this.f90607b = field2;
        this.f90608c = field3;
        this.f90609d = field4;
        this.f90610e = field5;
        this.f90611f = field6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((pn.d) BuiltInParserKt.getBuiltInParserComponent().B6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ qn(ParsingEnvironment parsingEnvironment, qn qnVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : qnVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qn(ParsingEnvironment parsingEnvironment, qn qnVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
