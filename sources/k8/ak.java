package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zj;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ak implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f86258g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f86259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f86260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f86261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f86262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f86263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f86264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function2 f86265n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f86268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f86269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f86270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f86271f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86272f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ak invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ak(parsingEnvironment, (ak) null, false, jSONObject, 6, (DefaultConstructorMarker) null);
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
        f86259h = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f86260i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86261j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86262k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86263l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86264m = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f86265n = a.f86272f;
    }

    public ak(Field field, Field field2, Field field3, Field field4, Field field5, Field field6) {
        this.f86266a = field;
        this.f86267b = field2;
        this.f86268c = field3;
        this.f86269d = field4;
        this.f86270e = field5;
        this.f86271f = field6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zj.d) BuiltInParserKt.getBuiltInParserComponent().u5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ak(ParsingEnvironment parsingEnvironment, ak akVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : akVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ak(ParsingEnvironment parsingEnvironment, ak akVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
