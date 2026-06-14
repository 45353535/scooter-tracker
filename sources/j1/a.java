package j1;

import com.amazon.device.ads.DtbConstants;
import com.ironsource.adapters.custom.bmwf.BMConstants;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f85456e = new b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j1.a$a, reason: collision with other inner class name */
    public static final class EnumC1018a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1019a f85457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC1018a f85458d = new EnumC1018a("OPT_OUT_SALE", 0, BMConstants.BM_CCPA_NO_CONSENT_VALUE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC1018a f85459e = new EnumC1018a("OPT_IN_SALE", 1, BMConstants.BM_CCPA_CONSENT_VALUE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumC1018a[] f85460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f85461g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85462b;

        /* JADX INFO: renamed from: j1.a$a$a, reason: collision with other inner class name */
        public static final class C1019a {
            public /* synthetic */ C1019a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1019a() {
            }
        }

        static {
            EnumC1018a[] enumC1018aArrD = d();
            f85460f = enumC1018aArrD;
            f85461g = qf.a.a(enumC1018aArrD);
            f85457c = new C1019a(null);
        }

        public EnumC1018a(String str, int i10, String str2) {
            this.f85462b = str2;
        }

        public static final /* synthetic */ EnumC1018a[] d() {
            return new EnumC1018a[]{f85458d, f85459e};
        }

        public static EnumC1018a valueOf(String str) {
            return (EnumC1018a) Enum.valueOf(EnumC1018a.class, str);
        }

        public static EnumC1018a[] values() {
            return (EnumC1018a[]) f85460f.clone();
        }

        public final String g() {
            return this.f85462b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EnumC1018a consent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(consent, "consent");
        if (g(consent.g())) {
            f(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY);
            c(consent.g());
        } else {
            d("Invalid CCPA consent values. Use provided values or Custom class. Value: " + consent);
        }
    }

    public final boolean g(String str) {
        return Intrinsics.areEqual(EnumC1018a.f85458d.g(), str) || Intrinsics.areEqual(EnumC1018a.f85459e.g(), str);
    }

    @Override // j1.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String getConsent() {
        Object objB = b();
        Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type kotlin.String");
        return (String) objB;
    }
}
