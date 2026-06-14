package f1;

import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vc {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0879a f71401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f71402d = new a("ASPECT", 0, "aspect");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f71403e = new a("FILL", 1, Reporting.EventType.FILL);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71404f = new a("FIXED", 2, "fixed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a[] f71405g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71406h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71407b;

        /* JADX INFO: renamed from: f1.vc$a$a, reason: collision with other inner class name */
        public static final class C0879a {
            public C0879a() {
            }

            public /* synthetic */ C0879a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            a[] aVarArrD = d();
            f71405g = aVarArrD;
            f71406h = qf.a.a(aVarArrD);
            f71401c = new C0879a(null);
        }

        public a(String str, int i10, String str2) {
            this.f71407b = str2;
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f71402d, f71403e, f71404f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f71405g.clone();
        }
    }

    public abstract Map a();

    public abstract a b();

    public abstract Integer c();

    public abstract ye d();

    public abstract Integer e();
}
