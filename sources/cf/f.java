package cf;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f6824d = new f("MONDAY", 0, "Mon");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f6825e = new f("TUESDAY", 1, "Tue");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f6826f = new f("WEDNESDAY", 2, "Wed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f6827g = new f("THURSDAY", 3, "Thu");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f6828h = new f("FRIDAY", 4, "Fri");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f6829i = new f("SATURDAY", 5, "Sat");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f6830j = new f("SUNDAY", 6, "Sun");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ f[] f6831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6832l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6833b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(int i10) {
            return (f) f.g().get(i10);
        }

        private a() {
        }
    }

    static {
        f[] fVarArrD = d();
        f6831k = fVarArrD;
        f6832l = qf.a.a(fVarArrD);
        f6823c = new a(null);
    }

    private f(String str, int i10, String str2) {
        this.f6833b = str2;
    }

    private static final /* synthetic */ f[] d() {
        return new f[]{f6824d, f6825e, f6826f, f6827g, f6828h, f6829i, f6830j};
    }

    public static EnumEntries g() {
        return f6832l;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f6831k.clone();
    }
}
