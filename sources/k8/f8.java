package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.e8;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class f8 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f87442d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final xc f87443e = new xc(null, Expression.Companion.constant$default(Expression.INSTANCE, 10L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f87444f = a.f87448f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87447c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87448f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new f8(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public f8(Field field, Field field2, Field field3) {
        this.f87445a = field;
        this.f87446b = field2;
        this.f87447c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((e8.c) BuiltInParserKt.getBuiltInParserComponent().Y1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ f8(ParsingEnvironment parsingEnvironment, f8 f8Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : f8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f8(ParsingEnvironment parsingEnvironment, f8 f8Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
