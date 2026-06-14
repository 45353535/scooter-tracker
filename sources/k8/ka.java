package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ga;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ka implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f88593h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f88594i = Expression.Companion.constant$default(Expression.INSTANCE, zv.NONE, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f88595j = a.f88603f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f88596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f88597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f88598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f88599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f88600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f88601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f88602g;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88603f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ka invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ka(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public ka(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.f88596a = field;
        this.f88597b = field2;
        this.f88598c = field3;
        this.f88599d = field4;
        this.f88600e = field5;
        this.f88601f = field6;
        this.f88602g = field7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ga.d) BuiltInParserKt.getBuiltInParserComponent().F2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f88604c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Function2 f88605d = a.f88608f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f88606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f88607b;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88608f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new c(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field field, Field field2) {
            this.f88606a = field;
            this.f88607b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((ia) BuiltInParserKt.getBuiltInParserComponent().H2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ ka(ParsingEnvironment parsingEnvironment, ka kaVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : kaVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ka(ParsingEnvironment parsingEnvironment, ka kaVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
