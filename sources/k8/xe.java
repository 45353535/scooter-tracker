package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.we;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xe implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f92342h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f92343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f92344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f92345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f92346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f92347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function2 f92348n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f92352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f92353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f92354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f92355g;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92356f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xe invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new xe(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f92343i = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f92344j = Expression.Companion.constant$default(companion, y5.CENTER, null, 2, null);
        f92345k = Expression.Companion.constant$default(companion, z5.CENTER, null, 2, null);
        f92346l = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f92347m = Expression.Companion.constant$default(companion, df.FILL, null, 2, null);
        f92348n = a.f92356f;
    }

    public xe(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.f92349a = field;
        this.f92350b = field2;
        this.f92351c = field3;
        this.f92352d = field4;
        this.f92353e = field5;
        this.f92354f = field6;
        this.f92355g = field7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((we.f) BuiltInParserKt.getBuiltInParserComponent().V3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ xe(ParsingEnvironment parsingEnvironment, xe xeVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : xeVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xe(ParsingEnvironment parsingEnvironment, xe xeVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
