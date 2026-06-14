package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ob;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class pb implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f90354h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f90355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f90356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f90357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f90358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f90359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function2 f90360n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f90362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f90363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f90364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f90365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f90366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f90367g;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90368f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pb invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new pb(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f90355i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90356j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90357k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90358l = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90359m = Expression.Companion.constant$default(companion, jp.DP, null, 2, null);
        f90360n = a.f90368f;
    }

    public pb(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.f90361a = field;
        this.f90362b = field2;
        this.f90363c = field3;
        this.f90364d = field4;
        this.f90365e = field5;
        this.f90366f = field6;
        this.f90367g = field7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ob.d) BuiltInParserKt.getBuiltInParserComponent().Z2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ pb(ParsingEnvironment parsingEnvironment, pb pbVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : pbVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pb(ParsingEnvironment parsingEnvironment, pb pbVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
