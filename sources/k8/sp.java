package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.op;
import k8.rp;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sp implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f91087f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f91088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f91089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f91090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f91091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f91092k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91097e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91098f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sp invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new sp(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f91088g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f91089h = Expression.Companion.constant$default(companion, op.c.BOTTOM, null, 2, null);
        f91090i = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        f91091j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f91092k = a.f91098f;
    }

    public sp(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f91093a = field;
        this.f91094b = field2;
        this.f91095c = field3;
        this.f91096d = field4;
        this.f91097e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rp.e) BuiltInParserKt.getBuiltInParserComponent().f7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ sp(ParsingEnvironment parsingEnvironment, sp spVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : spVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sp(ParsingEnvironment parsingEnvironment, sp spVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
