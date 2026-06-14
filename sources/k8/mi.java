package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.hi;
import k8.li;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mi implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f89000d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f89001e = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f89002f = b.f89011f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f89003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f89004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f89005c;

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f89011f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mi invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new mi(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public mi(Field field, Field field2, Field field3) {
        this.f89003a = field;
        this.f89004b = field2;
        this.f89005c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((li.c) BuiltInParserKt.getBuiltInParserComponent().W4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class a implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f89006c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Function2 f89007d = C1045a.f89010f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f89008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f89009b;

        /* JADX INFO: renamed from: k8.mi$a$a, reason: collision with other inner class name */
        static final class C1045a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1045a f89010f = new C1045a();

            C1045a() {
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
            this.f89008a = field;
            this.f89009b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((hi.c) BuiltInParserKt.getBuiltInParserComponent().T4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ mi(ParsingEnvironment parsingEnvironment, mi miVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : miVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mi(ParsingEnvironment parsingEnvironment, mi miVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
