package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ml;
import k8.xv;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yv implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92819d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ml.d f92820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ml.d f92821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f92822g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92825c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92826f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yv invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new yv(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double dValueOf = Double.valueOf(50.0d);
        f92820e = new ml.d(new tl(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f92821f = new ml.d(new tl(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f92822g = a.f92826f;
    }

    public yv(Field field, Field field2, Field field3) {
        this.f92823a = field;
        this.f92824b = field2;
        this.f92825c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((xv.c) BuiltInParserKt.getBuiltInParserComponent().c9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ yv(ParsingEnvironment parsingEnvironment, yv yvVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : yvVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yv(ParsingEnvironment parsingEnvironment, yv yvVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
