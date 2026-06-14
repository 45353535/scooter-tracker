package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.s3;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class i5 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f88197l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f88198m = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function2 f88199n = a.f88211f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f88200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f88201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f88202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f88203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f88204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f88205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f88206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f88207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f88208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f88209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f88210k;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88211f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new i5(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public i5(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.f88200a = field;
        this.f88201b = field2;
        this.f88202c = field3;
        this.f88203d = field4;
        this.f88204e = field5;
        this.f88205f = field6;
        this.f88206g = field7;
        this.f88207h = field8;
        this.f88208i = field9;
        this.f88209j = field10;
        this.f88210k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((s3.d) BuiltInParserKt.getBuiltInParserComponent().v0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f88212d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Function2 f88213e = a.f88217f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f88214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f88215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f88216c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88217f = new a();

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

        public c(Field field, Field field2, Field field3) {
            this.f88214a = field;
            this.f88215b = field2;
            this.f88216c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((u3) BuiltInParserKt.getBuiltInParserComponent().y0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ i5(ParsingEnvironment parsingEnvironment, i5 i5Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : i5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i5(ParsingEnvironment parsingEnvironment, i5 i5Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
