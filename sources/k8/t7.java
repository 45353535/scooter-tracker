package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.s7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class t7 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f91245d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f91246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f91247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f91248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f91249h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91252c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91253f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new t7(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f91246e = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f91247f = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        f91248g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f91249h = a.f91253f;
    }

    public t7(Field field, Field field2, Field field3) {
        this.f91250a = field;
        this.f91251b = field2;
        this.f91252c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((s7.d) BuiltInParserKt.getBuiltInParserComponent().P1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ t7(ParsingEnvironment parsingEnvironment, t7 t7Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : t7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t7(ParsingEnvironment parsingEnvironment, t7 t7Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
