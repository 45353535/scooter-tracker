package cg;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f6836c = new b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f6837d = new b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f6838e = new b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f6839f = new b("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f6840g = new b("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f6841h = new b("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f6842i = new b("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ b[] f6843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6844k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeUnit f6845b;

    static {
        b[] bVarArrD = d();
        f6843j = bVarArrD;
        f6844k = qf.a.a(bVarArrD);
    }

    private b(String str, int i10, TimeUnit timeUnit) {
        this.f6845b = timeUnit;
    }

    private static final /* synthetic */ b[] d() {
        return new b[]{f6836c, f6837d, f6838e, f6839f, f6840g, f6841h, f6842i};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6843j.clone();
    }

    public final TimeUnit g() {
        return this.f6845b;
    }
}
