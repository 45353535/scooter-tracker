package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.n7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class o7 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f90152f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f90153g = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f90154h = a.f90160f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f90156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f90157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f90158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f90159e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90160f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new o7(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public o7(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f90155a = field;
        this.f90156b = field2;
        this.f90157c = field3;
        this.f90158d = field4;
        this.f90159e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((n7.c) BuiltInParserKt.getBuiltInParserComponent().M1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ o7(ParsingEnvironment parsingEnvironment, o7 o7Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : o7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o7(ParsingEnvironment parsingEnvironment, o7 o7Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
