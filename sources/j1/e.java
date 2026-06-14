package j1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f85466e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f85467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f85468d = new b("NON_BEHAVIORAL", 0, "0");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f85469e = new b("BEHAVIORAL", 1, "1");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ b[] f85470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f85471g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85472b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            b[] bVarArrD = d();
            f85470f = bVarArrD;
            f85471g = qf.a.a(bVarArrD);
            f85467c = new a(null);
        }

        public b(String str, int i10, String str2) {
            this.f85472b = str2;
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f85468d, f85469e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f85470f.clone();
        }

        public final String g() {
            return this.f85472b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b consent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(consent, "consent");
        if (g(consent.g())) {
            f("gdpr");
            c(consent.g());
        } else {
            d("Invalid GDPR consent values. Use provided values or Custom class. Value: " + consent);
        }
    }

    private final boolean g(String str) {
        return Intrinsics.areEqual(b.f85468d.g(), str) || Intrinsics.areEqual(b.f85469e.g(), str);
    }

    @Override // j1.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String getConsent() {
        Object objB = b();
        Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type kotlin.String");
        return (String) objB;
    }
}
