package kotlin.jvm.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements KTypeParameter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f93288g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f93289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f93290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KVariance f93291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f93292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile List f93293f;

    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.c1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1066a {
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

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(KTypeParameter typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C1066a.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i10 == 1) {
                Unit unit = Unit.f93236a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new lf.m();
                }
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }

        private a() {
        }
    }

    public c1(Object obj, String name, KVariance variance, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.f93289b = obj;
        this.f93290c = name;
        this.f93291d = variance;
        this.f93292e = z10;
    }

    public final void a(List upperBounds) {
        Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.f93293f == null) {
            this.f93293f = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.areEqual(this.f93289b, c1Var.f93289b) && Intrinsics.areEqual(getName(), c1Var.getName());
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        return this.f93290c;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List getUpperBounds() {
        List list = this.f93293f;
        if (list != null) {
            return list;
        }
        List listListOf = CollectionsKt.listOf(v0.h(Object.class));
        this.f93293f = listListOf;
        return listListOf;
    }

    @Override // kotlin.reflect.KTypeParameter
    public KVariance getVariance() {
        return this.f93291d;
    }

    public int hashCode() {
        Object obj = this.f93289b;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return this.f93292e;
    }

    public String toString() {
        return f93288g.a(this);
    }
}
