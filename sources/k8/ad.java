package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zc;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ad implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f86240c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Expression f86241d = Expression.Companion.constant$default(Expression.INSTANCE, jp.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f86242e = a.f86245f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86244b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86245f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ad invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ad(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public ad(Field field, Field field2) {
        this.f86243a = field;
        this.f86244b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zc.d) BuiltInParserKt.getBuiltInParserComponent().x3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ad(ParsingEnvironment parsingEnvironment, ad adVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : adVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ad(ParsingEnvironment parsingEnvironment, ad adVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
