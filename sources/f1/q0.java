package f1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f70797d = new q0("CLICK_PREFERENCE_EMBEDDED", 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q0 f70798e = new q0("CLICK_PREFERENCE_NATIVE", 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q0[] f70799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70800g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70801b;

    public static final class a {
        public a() {
        }

        public final q0 a(int i10) {
            return i10 != 0 ? i10 != 1 ? q0.f70797d : q0.f70798e : q0.f70797d;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        q0[] q0VarArrD = d();
        f70799f = q0VarArrD;
        f70800g = qf.a.a(q0VarArrD);
        f70796c = new a(null);
    }

    public q0(String str, int i10, int i11) {
        this.f70801b = i11;
    }

    public static final /* synthetic */ q0[] d() {
        return new q0[]{f70797d, f70798e};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f70799f.clone();
    }

    public final int g() {
        return this.f70801b;
    }
}
