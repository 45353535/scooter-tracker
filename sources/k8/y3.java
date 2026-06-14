package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.w3;
import k8.x3;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class y3 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f92601f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f92602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f92603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f92604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f92605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f92606k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f92610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f92611e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92612f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new y3(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f92602g = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f92603h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92604i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92605j = Expression.Companion.constant$default(companion, w3.c.CLAMP, null, 2, null);
        f92606k = a.f92612f;
    }

    public y3(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f92607a = field;
        this.f92608b = field2;
        this.f92609c = field3;
        this.f92610d = field4;
        this.f92611e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((x3.d) BuiltInParserKt.getBuiltInParserComponent().B0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ y3(ParsingEnvironment parsingEnvironment, y3 y3Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : y3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y3(ParsingEnvironment parsingEnvironment, y3 y3Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
