package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.hn;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class in implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f88261f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final xc f88262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final xc f88263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final xc f88264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f88265j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f88266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f88267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f88268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f88269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f88270e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88271f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final in invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new in(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f88262g = new xc(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f88263h = new xc(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f88264i = new xc(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f88265j = a.f88271f;
    }

    public in(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f88266a = field;
        this.f88267b = field2;
        this.f88268c = field3;
        this.f88269d = field4;
        this.f88270e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((hn.c) BuiltInParserKt.getBuiltInParserComponent().y6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ in(ParsingEnvironment parsingEnvironment, in inVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : inVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public in(ParsingEnvironment parsingEnvironment, in inVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
