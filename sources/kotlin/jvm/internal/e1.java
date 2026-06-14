package kotlin.jvm.internal;

import androidx.webkit.ProxyConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements KType {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f93299f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KClassifier f93300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f93301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KType f93302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f93303e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e1(KClassifier classifier, List arguments, KType kType, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f93300b = classifier;
        this.f93301c = arguments;
        this.f93302d = kType;
        this.f93303e = i10;
    }

    private final String b(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.getVariance() == null) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        KType type = kTypeProjection.getType();
        e1 e1Var = type instanceof e1 ? (e1) type : null;
        if (e1Var == null || (strValueOf = e1Var.c(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.getType());
        }
        KVariance variance = kTypeProjection.getVariance();
        int i10 = variance == null ? -1 : b.$EnumSwitchMapping$0[variance.ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new lf.m();
        }
        return "out " + strValueOf;
    }

    private final String c(boolean z10) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class clsB = kClass != null ? xf.a.b(kClass) : null;
        if (clsB == null) {
            name = getClassifier().toString();
        } else if ((this.f93303e & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = e(clsB);
        } else if (z10 && clsB.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            Intrinsics.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = xf.a.c((KClass) classifier2).getName();
        } else {
            name = clsB.getName();
        }
        String str = name + (getArguments().isEmpty() ? "" : CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.d(this.f93296b, (KTypeProjection) obj);
            }
        }, 24, null)) + (isMarkedNullable() ? "?" : "");
        KType kType = this.f93302d;
        if (!(kType instanceof e1)) {
            return str;
        }
        String strC = ((e1) kType).c(true);
        if (Intrinsics.areEqual(strC, str)) {
            return str;
        }
        if (Intrinsics.areEqual(strC, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strC + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(e1 e1Var, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return e1Var.b(it);
    }

    private final String e(Class cls) {
        return Intrinsics.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.areEqual(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.areEqual(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.areEqual(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.areEqual(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.areEqual(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.areEqual(getClassifier(), e1Var.getClassifier()) && Intrinsics.areEqual(getArguments(), e1Var.getArguments()) && Intrinsics.areEqual(this.f93302d, e1Var.f93302d) && this.f93303e == e1Var.f93303e;
    }

    public final int f() {
        return this.f93303e;
    }

    public final KType g() {
        return this.f93302d;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KType
    public List getArguments() {
        return this.f93301c;
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f93300b;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + this.f93303e;
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (this.f93303e & 1) != 0;
    }

    public String toString() {
        return c(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1(KClassifier classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}
