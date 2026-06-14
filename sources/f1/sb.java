package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sb f71092b = new sb("FAILURE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sb f71093c = new sb("READY_TO_SHOW", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sb f71094d = new sb("SUCCESS", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ sb[] f71095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71096f;

    static {
        sb[] sbVarArrD = d();
        f71095e = sbVarArrD;
        f71096f = qf.a.a(sbVarArrD);
    }

    public sb(String str, int i10) {
    }

    public static final /* synthetic */ sb[] d() {
        return new sb[]{f71092b, f71093c, f71094d};
    }

    public static sb valueOf(String str) {
        return (sb) Enum.valueOf(sb.class, str);
    }

    public static sb[] values() {
        return (sb[]) f71095e.clone();
    }
}
