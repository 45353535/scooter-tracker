package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.dx;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ex implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f87380e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f87381f = a.f87386f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87385d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87386f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ex invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ex(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public ex(Field field, Field field2, Field field3, Field field4) {
        this.f87382a = field;
        this.f87383b = field2;
        this.f87384c = field3;
        this.f87385d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zw) BuiltInParserKt.getBuiltInParserComponent().r9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f87387c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Function2 f87388d = a.f87391f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f87389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f87390b;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87391f = new a();

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
            this.f87389a = field;
            this.f87390b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((dx.c) BuiltInParserKt.getBuiltInParserComponent().u9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ ex(ParsingEnvironment parsingEnvironment, ex exVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : exVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ex(ParsingEnvironment parsingEnvironment, ex exVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
