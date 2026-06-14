package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ej;
import k8.n9;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fj implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f87525l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f87526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f87527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final n9.c f87528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Expression f87529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Function2 f87530q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f87535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f87536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f87537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f87538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f87539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f87540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f87541k;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87542f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fj invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new fj(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f87526m = Expression.Companion.constant$default(companion, b6.NORMAL, null, 2, null);
        f87527n = Expression.Companion.constant$default(companion, c6.LINEAR, null, 2, null);
        f87528o = new n9.c(new mc(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f87529p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87530q = a.f87542f;
    }

    public fj(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.f87531a = field;
        this.f87532b = field2;
        this.f87533c = field3;
        this.f87534d = field4;
        this.f87535e = field5;
        this.f87536f = field6;
        this.f87537g = field7;
        this.f87538h = field8;
        this.f87539i = field9;
        this.f87540j = field10;
        this.f87541k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ej.e) BuiltInParserKt.getBuiltInParserComponent().i5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ fj(ParsingEnvironment parsingEnvironment, fj fjVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : fjVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fj(ParsingEnvironment parsingEnvironment, fj fjVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
