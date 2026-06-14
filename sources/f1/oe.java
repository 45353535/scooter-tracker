package f1;

import com.ironsource.C4424m2;
import kotlin.enums.EnumEntries;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes6.dex */
public abstract class oe {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f70737c = new a("RENDER", 0, Reporting.EventType.RENDER);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f70738d = new a(com.taurusx.tax.w.s.w.f67535o, 1, "click");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f70739e = new a("ENGAGEMENT", 2, "engagement");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70740f = new a("CLOSE", 3, "close");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f70741g = new a("EXPIRATION", 4, "expiration");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f70742h = new a("IMPRESSION", 5, "impression");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f70743i = new a("LOAD", 6, "load");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f70744j = new a("REWARD", 7, "reward");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f70745k = new a("SHOW", 8, C4424m2.f43623v);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f70746l = new a("SKIP", 9, "skip");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ a[] f70747m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f70748n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70749b;

        static {
            a[] aVarArrD = d();
            f70747m = aVarArrD;
            f70748n = qf.a.a(aVarArrD);
        }

        public a(String str, int i10, String str2) {
            this.f70749b = str2;
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f70737c, f70738d, f70739e, f70740f, f70741g, f70742h, f70743i, f70744j, f70745k, f70746l};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f70747m.clone();
        }

        public final String g() {
            return this.f70749b;
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
