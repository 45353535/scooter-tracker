package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.n1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class o1 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f90128i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f90129j = a.f90138f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f90131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f90132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f90133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f90134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f90135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f90136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f90137h;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90138f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new o1(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public o1(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8) {
        this.f90130a = field;
        this.f90131b = field2;
        this.f90132c = field3;
        this.f90133d = field4;
        this.f90134e = field5;
        this.f90135f = field6;
        this.f90136g = field7;
        this.f90137h = field8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((n1.e) BuiltInParserKt.getBuiltInParserComponent().L().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ o1(ParsingEnvironment parsingEnvironment, o1 o1Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : o1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o1(ParsingEnvironment parsingEnvironment, o1 o1Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
