package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ro;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class so implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f91077e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f91078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f91079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f91080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Function2 f91081i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91085d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91086f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final so invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new so(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f91078f = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f91079g = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f91080h = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f91081i = a.f91086f;
    }

    public so(Field field, Field field2, Field field3, Field field4) {
        this.f91082a = field;
        this.f91083b = field2;
        this.f91084c = field3;
        this.f91085d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ro.c) BuiltInParserKt.getBuiltInParserComponent().Q6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ so(ParsingEnvironment parsingEnvironment, so soVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : soVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public so(ParsingEnvironment parsingEnvironment, so soVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
