package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.m8;
import k8.n8;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class o8 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90161d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f90162e = "it";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f90163f = a.f90167f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f90165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f90166c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90167f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new o8(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public o8(Field field, Field field2, Field field3) {
        this.f90164a = field;
        this.f90165b = field2;
        this.f90166c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((m8.c) BuiltInParserKt.getBuiltInParserComponent().e2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f90168d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Expression f90169e = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Function2 f90170f = a.f90174f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f90171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f90172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f90173c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f90174f = new a();

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
            this.f90171a = field;
            this.f90172b = field2;
            this.f90173c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((n8.c) BuiltInParserKt.getBuiltInParserComponent().h2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ o8(ParsingEnvironment parsingEnvironment, o8 o8Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : o8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o8(ParsingEnvironment parsingEnvironment, o8 o8Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
