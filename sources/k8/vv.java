package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.fv;
import k8.gv;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vv implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f92029l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f92030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f92031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final gv.c f92032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Function2 f92033p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f92037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f92038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f92039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f92040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f92041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f92042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f92043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f92044k;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92045f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vv invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new vv(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f92030m = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f92031n = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f92032o = new gv.c(new kv());
        f92033p = a.f92045f;
    }

    public vv(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.f92034a = field;
        this.f92035b = field2;
        this.f92036c = field3;
        this.f92037d = field4;
        this.f92038e = field5;
        this.f92039f = field6;
        this.f92040g = field7;
        this.f92041h = field8;
        this.f92042i = field9;
        this.f92043j = field10;
        this.f92044k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((fv.d) BuiltInParserKt.getBuiltInParserComponent().Q8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ vv(ParsingEnvironment parsingEnvironment, vv vvVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : vvVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vv(ParsingEnvironment parsingEnvironment, vv vvVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
