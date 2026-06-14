package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class f1 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f87409e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f87410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f87411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f87412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f87413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f87414j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87418d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87419f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new f1(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f87410f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87411g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87412h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87413i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87414j = a.f87419f;
    }

    public f1(Field field, Field field2, Field field3, Field field4) {
        this.f87415a = field;
        this.f87416b = field2;
        this.f87417c = field3;
        this.f87418d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((e1.c) BuiltInParserKt.getBuiltInParserComponent().F().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ f1(ParsingEnvironment parsingEnvironment, f1 f1Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : f1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f1(ParsingEnvironment parsingEnvironment, f1 f1Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
