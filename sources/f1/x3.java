package f1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class x3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f71489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3 f71490d = new x3("NONE", 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x3 f71491e = new x3("STOPPED_QUEUE", 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x3 f71492f = new x3("MAX_COUNT_TIME_WINDOW", 2, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x3 f71493g = new x3("FORCED_OUT", 3, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x3[] f71494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71495i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71496b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        x3[] x3VarArrD = d();
        f71494h = x3VarArrD;
        f71495i = qf.a.a(x3VarArrD);
        f71489c = new a(null);
    }

    public x3(String str, int i10, int i11) {
        this.f71496b = i11;
    }

    public static final /* synthetic */ x3[] d() {
        return new x3[]{f71490d, f71491e, f71492f, f71493g};
    }

    public static x3 valueOf(String str) {
        return (x3) Enum.valueOf(x3.class, str);
    }

    public static x3[] values() {
        return (x3[]) f71494h.clone();
    }

    public final int g() {
        return this.f71496b;
    }
}
