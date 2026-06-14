package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.bl;
import k8.wk;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cl implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f86743e = new c(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f86744f = Expression.Companion.constant$default(Expression.INSTANCE, wk.d.PARTIAL, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f86745g = b.f86755f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f86748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f86749d;

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f86755f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new cl(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public cl(Field field, Field field2, Field field3, Field field4) {
        this.f86746a = field;
        this.f86747b = field2;
        this.f86748c = field3;
        this.f86749d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((bl.d) BuiltInParserKt.getBuiltInParserComponent().J5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class a implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f86750c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Function2 f86751d = C1032a.f86754f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f86752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f86753b;

        /* JADX INFO: renamed from: k8.cl$a$a, reason: collision with other inner class name */
        static final class C1032a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1032a f86754f = new C1032a();

            C1032a() {
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
            this.f86752a = field;
            this.f86753b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((yk) BuiltInParserKt.getBuiltInParserComponent().G5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ cl(ParsingEnvironment parsingEnvironment, cl clVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : clVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cl(ParsingEnvironment parsingEnvironment, cl clVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
