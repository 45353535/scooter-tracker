package g1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f72106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72107c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    public static final class EnumC0885a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0885a f72108b = new EnumC0885a("URI_INVALID", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumC0885a f72109c = new EnumC0885a("URI_UNRECOGNIZED", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0885a f72110d = new EnumC0885a("LOAD_NOT_FINISHED", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC0885a f72111e = new EnumC0885a("INTERNAL", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumC0885a[] f72112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f72113g;

        static {
            EnumC0885a[] enumC0885aArrD = d();
            f72112f = enumC0885aArrD;
            f72113g = qf.a.a(enumC0885aArrD);
        }

        public EnumC0885a(String str, int i10) {
        }

        public static final /* synthetic */ EnumC0885a[] d() {
            return new EnumC0885a[]{f72108b, f72109c, f72110d, f72111e};
        }

        public static EnumC0885a valueOf(String str) {
            return (EnumC0885a) Enum.valueOf(EnumC0885a.class, str);
        }

        public static EnumC0885a[] values() {
            return (EnumC0885a[]) f72112f.clone();
        }

        @Override // g1.a.d
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements d {
        public static final /* synthetic */ b[] I;
        public static final /* synthetic */ EnumEntries J;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f72114b = new b("INTERNAL", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f72115c = new b("INTERNET_UNAVAILABLE", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f72116d = new b("TOO_MANY_CONNECTIONS", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f72117e = new b("WRONG_ORIENTATION", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f72118f = new b("FIRST_SESSION_INTERSTITIALS_DISABLED", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f72119g = new b("NETWORK_FAILURE", 5);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f72120h = new b("NO_AD_FOUND", 6);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f72121i = new b("SESSION_NOT_STARTED", 7);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f72122j = new b("IMPRESSION_ALREADY_VISIBLE", 8);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f72123k = new b("NO_HOST_ACTIVITY", 9);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f72124l = new b("USER_CANCELLATION", 10);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f72125m = new b("INVALID_LOCATION", 11);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f72126n = new b("VIDEO_UNAVAILABLE", 12);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f72127o = new b("VIDEO_ID_MISSING", 13);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f72128p = new b("ERROR_PLAYING_VIDEO", 14);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f72129q = new b("INVALID_RESPONSE", 15);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f72130r = new b("ASSETS_DOWNLOAD_FAILURE", 16);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f72131s = new b("ERROR_CREATING_VIEW", 17);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f72132t = new b("ERROR_DISPLAYING_VIEW", 18);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f72133u = new b("INCOMPATIBLE_API_VERSION", 19);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f72134v = new b("ERROR_LOADING_WEB_VIEW", 20);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f72135w = new b("ASSET_PREFETCH_IN_PROGRESS", 21);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f72136x = new b("ACTIVITY_MISSING_IN_MANIFEST", 22);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f72137y = new b("EMPTY_LOCAL_VIDEO_LIST", 23);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f72138z = new b("END_POINT_DISABLED", 24);
        public static final b A = new b("HARDWARE_ACCELERATION_DISABLED", 25);
        public static final b B = new b("PENDING_IMPRESSION_ERROR", 26);
        public static final b C = new b("VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION", 27);
        public static final b D = new b("ASSET_MISSING", 28);
        public static final b E = new b("WEB_VIEW_PAGE_LOAD_TIMEOUT", 29);
        public static final b F = new b("WEB_VIEW_CLIENT_RECEIVED_ERROR", 30);
        public static final b G = new b("INTERNET_UNAVAILABLE_AT_SHOW", 31);
        public static final b H = new b("INTERNET_UNAVAILABLE_AT_CACHE", 32);

        static {
            b[] bVarArrD = d();
            I = bVarArrD;
            J = qf.a.a(bVarArrD);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f72114b, f72115c, f72116d, f72117e, f72118f, f72119g, f72120h, f72121i, f72122j, f72123k, f72124l, f72125m, f72126n, f72127o, f72128p, f72129q, f72130r, f72131s, f72132t, f72133u, f72134v, f72135w, f72136x, f72137y, f72138z, A, B, C, D, E, F, G, H};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) I.clone();
        }

        @Override // g1.a.d
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f72139b = new c("MISCELLANEOUS", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f72140c = new c("INTERNET_UNAVAILABLE", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f72141d = new c("INVALID_RESPONSE", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f72142e = new c("UNEXPECTED_RESPONSE", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f72143f = new c("NETWORK_FAILURE", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f72144g = new c("HTTP_NOT_FOUND", 5);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f72145h = new c("HTTP_NOT_OK", 6);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f72146i = new c("UNSUPPORTED_OS_VERSION", 7);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ c[] f72147j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f72148k;

        static {
            c[] cVarArrD = d();
            f72147j = cVarArrD;
            f72148k = qf.a.a(cVarArrD);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] d() {
            return new c[]{f72139b, f72140c, f72141d, f72142e, f72143f, f72144g, f72145h, f72146i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f72147j.clone();
        }

        @Override // g1.a.d
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    public interface d {
        String getName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d type, String errorDesc) {
        super(errorDesc);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        this.f72106b = type;
        this.f72107c = errorDesc;
    }

    public final String d() {
        return this.f72107c;
    }

    public final b g() {
        d dVar = this.f72106b;
        return dVar == c.f72140c ? b.f72115c : dVar == c.f72144g ? b.f72120h : dVar == c.f72141d ? b.f72129q : dVar == c.f72143f ? b.f72119g : b.f72114b;
    }

    public final d h() {
        return this.f72106b;
    }
}
