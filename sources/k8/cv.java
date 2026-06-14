package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.bv;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cv implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f86846g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f86847h = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Function2 f86848i = a.f86855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f86851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f86852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f86853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f86854f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86855f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cv invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new cv(parsingEnvironment, (cv) null, false, jSONObject, 6, (DefaultConstructorMarker) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public cv(Field field, Field field2, Field field3, Field field4, Field field5, Field field6) {
        this.f86849a = field;
        this.f86850b = field2;
        this.f86851c = field3;
        this.f86852d = field4;
        this.f86853e = field5;
        this.f86854f = field6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((bv.c) BuiltInParserKt.getBuiltInParserComponent().N8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ cv(ParsingEnvironment parsingEnvironment, cv cvVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : cvVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cv(ParsingEnvironment parsingEnvironment, cv cvVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
