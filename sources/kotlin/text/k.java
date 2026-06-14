package kotlin.text;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f93534d = new k("IGNORE_CASE", 0, 2, 0, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f93535e = new k("MULTILINE", 1, 8, 0, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f93536f = new k("LITERAL", 2, 16, 0, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f93537g = new k("UNIX_LINES", 3, 1, 0, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f93538h = new k("COMMENTS", 4, 4, 0, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f93539i = new k("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f93540j = new k("CANON_EQ", 6, 128, 0, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ k[] f93541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f93542l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f93544c;

    static {
        k[] kVarArrD = d();
        f93541k = kVarArrD;
        f93542l = qf.a.a(kVarArrD);
    }

    private k(String str, int i10, int i11, int i12) {
        this.f93543b = i11;
        this.f93544c = i12;
    }

    private static final /* synthetic */ k[] d() {
        return new k[]{f93534d, f93535e, f93536f, f93537g, f93538h, f93539i, f93540j};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f93541k.clone();
    }

    public int g() {
        return this.f93543b;
    }

    /* synthetic */ k(String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
