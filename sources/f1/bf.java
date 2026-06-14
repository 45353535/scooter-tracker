package f1;

import h1.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.EnumC0890a f69478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.EnumC0890a f69479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f69480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f69481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f69482f;

    public static final class a extends bf {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f69483g = new a();

        public a() {
            super("Banner", a.EnumC0890a.f72855j, a.EnumC0890a.f72856k, true, false, 16, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 312973325;
        }

        public String toString() {
            return "Banner";
        }
    }

    public static final class b extends bf {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f69484g = new b();

        public b() {
            super("Interstitial", a.EnumC0890a.f72851f, a.EnumC0890a.f72852g, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 743805773;
        }

        public String toString() {
            return "Interstitial";
        }
    }

    public static final class c extends bf {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f69485g = new c();

        public c() {
            super("Rewarded", a.EnumC0890a.f72853h, a.EnumC0890a.f72854i, false, false, 8, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1735897263;
        }

        public String toString() {
            return "Rewarded";
        }
    }

    public bf(String str, a.EnumC0890a enumC0890a, a.EnumC0890a enumC0890a2, boolean z10, boolean z11) {
        this.f69477a = str;
        this.f69478b = enumC0890a;
        this.f69479c = enumC0890a2;
        this.f69480d = z10;
        this.f69481e = z11;
        this.f69482f = !z10;
    }

    public final a.EnumC0890a a() {
        return this.f69478b;
    }

    public final String b() {
        return this.f69477a;
    }

    public final boolean c() {
        return this.f69480d;
    }

    public final a.EnumC0890a d() {
        return this.f69479c;
    }

    public final boolean e() {
        return this.f69482f;
    }

    public /* synthetic */ bf(String str, a.EnumC0890a enumC0890a, a.EnumC0890a enumC0890a2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC0890a, enumC0890a2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, null);
    }

    public /* synthetic */ bf(String str, a.EnumC0890a enumC0890a, a.EnumC0890a enumC0890a2, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC0890a, enumC0890a2, z10, z11);
    }
}
