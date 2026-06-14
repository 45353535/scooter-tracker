package org.bidon.amazon;

import com.taurusx.tax.w.s.w;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f97031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f97032d = new f("BANNER", 0, "BANNER");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f97033e = new f("MREC", 1, "MREC");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f97034f = new f("REWARDED_AD", 2, w.f67531f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f97035g = new f("VIDEO", 3, "VIDEO");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f97036h = new f("INTERSTITIAL", 4, "INTERSTITIAL");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ f[] f97037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f97038j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97039b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String format) {
            Intrinsics.checkNotNullParameter(format, "format");
            for (f fVar : f.values()) {
                if (Intrinsics.areEqual(fVar.g(), format)) {
                    return fVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        f[] fVarArrD = d();
        f97037i = fVarArrD;
        f97038j = qf.a.a(fVarArrD);
        f97031c = new a(null);
    }

    private f(String str, int i10, String str2) {
        this.f97039b = str2;
    }

    private static final /* synthetic */ f[] d() {
        return new f[]{f97032d, f97033e, f97034f, f97035g, f97036h};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f97037i.clone();
    }

    public final String g() {
        return this.f97039b;
    }
}
