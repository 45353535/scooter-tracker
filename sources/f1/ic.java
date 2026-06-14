package f1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ic {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ic f70117d = new ic("TOP_LEFT", 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ic f70118e = new ic("TOP_RIGHT", 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ic f70119f = new ic("BOTTOM_LEFT", 2, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ic f70120g = new ic("BOTTOM_RIGHT", 3, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ic[] f70121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70122i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70123b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ic[] icVarArrD = d();
        f70121h = icVarArrD;
        f70122i = qf.a.a(icVarArrD);
        f70116c = new a(null);
    }

    public ic(String str, int i10, int i11) {
        this.f70123b = i11;
    }

    public static final /* synthetic */ ic[] d() {
        return new ic[]{f70117d, f70118e, f70119f, f70120g};
    }

    public static ic valueOf(String str) {
        return (ic) Enum.valueOf(ic.class, str);
    }

    public static ic[] values() {
        return (ic[]) f70121h.clone();
    }
}
