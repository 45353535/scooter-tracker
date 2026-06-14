package f1;

import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a6 f69372c = new a6("UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a6 f69373d = new a6("HTML", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a6 f69374e = new a6("VIDEO", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a6 f69375f = new a6("AUDIO", 3, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a6 f69376g = new a6(MobileFuseNativeAdKt.AD_TYPE, 4, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a6[] f69377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f69378i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69379b;

    static {
        a6[] a6VarArrD = d();
        f69377h = a6VarArrD;
        f69378i = qf.a.a(a6VarArrD);
    }

    public a6(String str, int i10, int i11) {
        this.f69379b = i11;
    }

    public static final /* synthetic */ a6[] d() {
        return new a6[]{f69372c, f69373d, f69374e, f69375f, f69376g};
    }

    public static EnumEntries g() {
        return f69378i;
    }

    public static a6 valueOf(String str) {
        return (a6) Enum.valueOf(a6.class, str);
    }

    public static a6[] values() {
        return (a6[]) f69377h.clone();
    }

    public final int h() {
        return this.f69379b;
    }
}
