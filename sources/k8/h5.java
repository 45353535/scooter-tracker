package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.g5;
import k8.z4;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h5 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f87962e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f87963f = a.f87968f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87967d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87968f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new h5(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public h5(Field field, Field field2, Field field3, Field field4) {
        this.f87964a = field;
        this.f87965b = field2;
        this.f87966c = field3;
        this.f87967d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((b5) BuiltInParserKt.getBuiltInParserComponent().W0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f87969d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Expression f87970e = Expression.Companion.constant$default(Expression.INSTANCE, z4.c.d.POST, null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Function2 f87971f = a.f87975f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f87972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f87973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f87974c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87975f = new a();

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
            this.f87972a = field;
            this.f87973b = field2;
            this.f87974c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((g5.d) BuiltInParserKt.getBuiltInParserComponent().c1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* JADX INFO: renamed from: k8.h5$c$c, reason: collision with other inner class name */
        public static final class C1042c implements JSONSerializable, JsonTemplate {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f87976c = new b(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final Function2 f87977d = a.f87980f;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Field f87978a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Field f87979b;

            /* JADX INFO: renamed from: k8.h5$c$c$a */
            static final class a extends Lambda implements Function2 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final a f87980f = new a();

                a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C1042c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new C1042c(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            }

            /* JADX INFO: renamed from: k8.h5$c$c$b */
            public static final class b {
                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private b() {
                }
            }

            public C1042c(Field field, Field field2) {
                this.f87978a = field;
                this.f87979b = field2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((e5) BuiltInParserKt.getBuiltInParserComponent().Z0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            public /* synthetic */ C1042c(ParsingEnvironment parsingEnvironment, C1042c c1042c, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(parsingEnvironment, (i10 & 2) != 0 ? null : c1042c, (i10 & 4) != 0 ? false : z10, jSONObject);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C1042c(ParsingEnvironment parsingEnvironment, C1042c c1042c, boolean z10, JSONObject jSONObject) {
                Field.Companion companion = Field.INSTANCE;
                this(companion.nullField(false), companion.nullField(false));
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }
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

    public /* synthetic */ h5(ParsingEnvironment parsingEnvironment, h5 h5Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : h5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h5(ParsingEnvironment parsingEnvironment, h5 h5Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
