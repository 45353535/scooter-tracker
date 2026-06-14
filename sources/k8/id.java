package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class id implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f88225f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f88226g = a.f88232f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f88227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f88228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f88229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f88230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f88231e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88232f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new id(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public id(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f88227a = field;
        this.f88228b = field2;
        this.f88229c = field3;
        this.f88230d = field4;
        this.f88231e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((dd) BuiltInParserKt.getBuiltInParserComponent().A3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f88233f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f88234g = a.f88240f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f88235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f88236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f88237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field f88238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field f88239e;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88240f = new a();

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

        public c(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.f88235a = field;
            this.f88236b = field2;
            this.f88237c = field3;
            this.f88238d = field4;
            this.f88239e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((gd) BuiltInParserKt.getBuiltInParserComponent().D3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ id(ParsingEnvironment parsingEnvironment, id idVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : idVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public id(ParsingEnvironment parsingEnvironment, id idVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
