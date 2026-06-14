package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.sc;
import k8.vc;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wc implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f92153e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f92154f = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f92155g = a.f92160f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f92159d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92160f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new wc(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public wc(Field field, Field field2, Field field3, Field field4) {
        this.f92156a = field;
        this.f92157b = field2;
        this.f92158c = field3;
        this.f92159d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((sc.c) BuiltInParserKt.getBuiltInParserComponent().r3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f92161d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Expression f92162e = Expression.Companion.constant$default(Expression.INSTANCE, "_", null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Function2 f92163f = a.f92167f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f92164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f92165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f92166c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92167f = new a();

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
            this.f92164a = field;
            this.f92165b = field2;
            this.f92166c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((vc.c) BuiltInParserKt.getBuiltInParserComponent().u3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ wc(ParsingEnvironment parsingEnvironment, wc wcVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : wcVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wc(ParsingEnvironment parsingEnvironment, wc wcVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
