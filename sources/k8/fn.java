package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.cn;
import k8.fm;
import k8.lm;
import k8.rm;
import k8.sm;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fn implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f87554f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final fm.d f87555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final fm.d f87556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final sm.d f87557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f87558j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f87563e;

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87569f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fn invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new fn(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double dValueOf = Double.valueOf(0.5d);
        f87555g = new fm.d(new xm(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f87556h = new fm.d(new xm(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f87557i = new sm.d(new cn(Expression.Companion.constant$default(companion, cn.c.FARTHEST_CORNER, null, 2, null)));
        f87558j = b.f87569f;
    }

    public fn(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f87559a = field;
        this.f87560b = field2;
        this.f87561c = field3;
        this.f87562d = field4;
        this.f87563e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rm.c) BuiltInParserKt.getBuiltInParserComponent().m6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class a implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f87564c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Function2 f87565d = C1038a.f87568f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f87566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f87567b;

        /* JADX INFO: renamed from: k8.fn$a$a, reason: collision with other inner class name */
        static final class C1038a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1038a f87568f = new C1038a();

            C1038a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new a(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public a(Field field, Field field2) {
            this.f87566a = field;
            this.f87567b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((lm.c) BuiltInParserKt.getBuiltInParserComponent().g6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ a(ParsingEnvironment parsingEnvironment, a aVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(ParsingEnvironment parsingEnvironment, a aVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ fn(ParsingEnvironment parsingEnvironment, fn fnVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : fnVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fn(ParsingEnvironment parsingEnvironment, fn fnVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
