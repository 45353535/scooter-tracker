package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.va;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wa implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f92123l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f92124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f92125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f92126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Expression f92127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Function2 f92128q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f92132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f92133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f92134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f92135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f92136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f92137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f92138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f92139k;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92140f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wa invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new wa(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f92124m = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f92125n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f92126o = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f92127p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92128q = a.f92140f;
    }

    public wa(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.f92129a = field;
        this.f92130b = field2;
        this.f92131c = field3;
        this.f92132d = field4;
        this.f92133e = field5;
        this.f92134f = field6;
        this.f92135g = field7;
        this.f92136h = field8;
        this.f92137i = field9;
        this.f92138j = field10;
        this.f92139k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((va.c) BuiltInParserKt.getBuiltInParserComponent().Q2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ wa(ParsingEnvironment parsingEnvironment, wa waVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : waVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wa(ParsingEnvironment parsingEnvironment, wa waVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
