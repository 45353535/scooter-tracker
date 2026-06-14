package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ma;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class na implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90024b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final xc f90025c = new xc(null, Expression.Companion.constant$default(Expression.INSTANCE, 15L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f90026d = a.f90028f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90027a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90028f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final na invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new na(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public na(Field field) {
        this.f90027a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ma.c) BuiltInParserKt.getBuiltInParserComponent().K2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ na(ParsingEnvironment parsingEnvironment, na naVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : naVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public na(ParsingEnvironment parsingEnvironment, na naVar, boolean z10, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
