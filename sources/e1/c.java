package e1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f68702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f68703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f68704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f68705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f68706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Throwable f68707g;

    public static abstract class a extends c {

        /* JADX INFO: renamed from: e1.c$a$a, reason: collision with other inner class name */
        public static final class C0858a extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68708h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68709i;

            public C0858a(String str, Throwable th2) {
                super("CB_202", "CB_CONNECTIVITY_NETWORK_ERROR", "Network request failed.", "A networking error has occurred. " + (str == null ? "" : str), "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", th2, null);
                this.f68708h = str;
                this.f68709i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0858a)) {
                    return false;
                }
                C0858a c0858a = (C0858a) obj;
                return Intrinsics.areEqual(this.f68708h, c0858a.f68708h) && Intrinsics.areEqual(this.f68709i, c0858a.f68709i);
            }

            public int hashCode() {
                String str = this.f68708h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68709i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final b f68710h = new b();

            private b() {
                super("CB_201", "CB_CONNECTIVITY_NO_INTERNET", "Network request failed.", "No Internet connectivity was available.", "Ensure there is Internet connectivity and try again.", null, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1867194601;
            }
        }

        /* JADX INFO: renamed from: e1.c$a$c, reason: collision with other inner class name */
        public static final class C0859c extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68711h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68712i;

            public C0859c(String str, Throwable th2) {
                super("CB_203", "CB_CONNECTIVITY_SERVER_ERROR", "Network request failed.", "Network request failed due to a server error. " + (str == null ? "" : str), "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", th2, null);
                this.f68711h = str;
                this.f68712i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0859c)) {
                    return false;
                }
                C0859c c0859c = (C0859c) obj;
                return Intrinsics.areEqual(this.f68711h, c0859c.f68711h) && Intrinsics.areEqual(this.f68712i, c0859c.f68712i);
            }

            public int hashCode() {
                String str = this.f68711h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68712i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final d f68713h = new d();

            private d() {
                super("CB_204", "CB_CONNECTIVITY_TIMED_OUT", "Network request failed.", "Network request timed out.", "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", null, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -396325090;
            }
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68714h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68715i;

            public e(String str, Throwable th2) {
                super("CB_200", "CB_CONNECTIVITY_UNKNOWN_ERROR", "Network request failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.f68714h = str;
                this.f68715i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f68714h, eVar.f68714h) && Intrinsics.areEqual(this.f68715i, eVar.f68715i);
            }

            public int hashCode() {
                String str = this.f68714h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68715i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th2);
        }

        private a(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    public static abstract class b extends c {

        public static final class a extends b {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68716h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68717i;

            public a(String str, Throwable th2) {
                super("CB_105", "CB_INITIALIZATION_INTERNAL_ERROR", "Initialization has failed.", "An internal error happened during initialization. " + (str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th2, null);
                this.f68716h = str;
                this.f68717i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f68716h, aVar.f68716h) && Intrinsics.areEqual(this.f68717i, aVar.f68717i);
            }

            public int hashCode() {
                String str = this.f68716h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68717i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: e1.c$b$b, reason: collision with other inner class name */
        public static final class C0860b extends b {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final C0860b f68718h = new C0860b();

            private C0860b() {
                super("CB_102", "CB_INITIALIZATION_INVALID_CREDENTIALS", "Initialization has failed.", "Invalid/empty credentials were supplied.", "Double check that the supplied information is correct.", null, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0860b);
            }

            public int hashCode() {
                return 1005114563;
            }
        }

        /* JADX INFO: renamed from: e1.c$b$c, reason: collision with other inner class name */
        public static final class C0861c extends b {
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68719h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68720i;

            public d(String str, Throwable th2) {
                super("CB_107", "CB_INITIALIZATION_PERMISSIONS_NOT_SET", "Initialization has failed.", "App is missing declared permissions in the Android manifest. " + (str == null ? "" : str), "Check your console logs for more details.", th2, null);
                this.f68719h = str;
                this.f68720i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f68719h, dVar.f68719h) && Intrinsics.areEqual(this.f68720i, dVar.f68720i);
            }

            public int hashCode() {
                String str = this.f68719h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68720i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68721h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68722i;

            public e(String str, Throwable th2) {
                super("CB_100", "CB_INITIALIZATION_UNKNOWN_ERROR", "Initialization has failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.f68721h = str;
                this.f68722i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f68721h, eVar.f68721h) && Intrinsics.areEqual(this.f68722i, eVar.f68722i);
            }

            public int hashCode() {
                String str = this.f68721h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68722i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th2);
        }

        private b(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    /* JADX INFO: renamed from: e1.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0862c extends c {

        /* JADX INFO: renamed from: e1.c$c$a */
        public static final class a extends AbstractC0862c {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68723h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68724i;

            public a(String str, Throwable th2) {
                super("CB_311", "CB_LOAD_INTERNAL_ERROR", "Ad load has failed.", "An internal error happened during ad load. " + (str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th2, null);
                this.f68723h = str;
                this.f68724i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f68723h, aVar.f68723h) && Intrinsics.areEqual(this.f68724i, aVar.f68724i);
            }

            public int hashCode() {
                String str = this.f68723h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68724i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public /* synthetic */ AbstractC0862c(String str, String str2, String str3, String str4, String str5, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th2);
        }

        private AbstractC0862c(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    public static abstract class d extends c {

        public static final class a extends d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68725h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68726i;

            public a(String str, Throwable th2) {
                super("CB_900", "CB_OTHER_UNKNOWN_ERROR", "An internal error has occurred.", str == null ? "An unknown internal error has occurred." : str, "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.f68725h = str;
                this.f68726i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f68725h, aVar.f68725h) && Intrinsics.areEqual(this.f68726i, aVar.f68726i);
            }

            public int hashCode() {
                String str = this.f68725h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68726i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th2);
        }

        private d(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    public static abstract class e extends c {

        public static final class a extends e {
        }

        public static final class b extends e {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final b f68727h = new b();

            private b() {
                super("CB_401", "CB_SHOW_NO_AD", "Ad show has failed.", "No loaded ad to show.", "Try loading another ad and ensure it is ready before it's shown.", null, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1841414587;
            }
        }

        /* JADX INFO: renamed from: e1.c$e$c, reason: collision with other inner class name */
        public static final class C0863c extends e {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final C0863c f68728h = new C0863c();

            private C0863c() {
                super("CB_404", "CB_SHOW_NO_CONTEXT", "Ad show has failed.", "No Activity provided to show the ad.", "Ensure that a valid Context is provided when showing ads.", null, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0863c);
            }

            public int hashCode() {
                return -376633139;
            }
        }

        public static final class d extends e {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final d f68729h = new d();

            private d() {
                super("CB_409", "CB_SHOW_NOT_INITIALIZED", "Ad show has failed.", "SDK initialization not started or still in progress.", "Ensure the Chartboost Monetization SDK has completed initialization before showing ads.", null, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -307078846;
            }
        }

        /* JADX INFO: renamed from: e1.c$e$e, reason: collision with other inner class name */
        public static final class C0864e extends e {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68730h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68731i;

            public C0864e(String str, Throwable th2) {
                super("CB_406", "CB_SHOW_TIMED_OUT", "Ad show has failed.", "Operation has timed out. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.f68730h = str;
                this.f68731i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0864e)) {
                    return false;
                }
                C0864e c0864e = (C0864e) obj;
                return Intrinsics.areEqual(this.f68730h, c0864e.f68730h) && Intrinsics.areEqual(this.f68731i, c0864e.f68731i);
            }

            public int hashCode() {
                String str = this.f68730h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68731i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public static final class f extends e {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f68732h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Throwable f68733i;

            public f(String str, Throwable th2) {
                super("CB_400", "CB_SHOW_UNKNOWN_ERROR", "Ad show has failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.f68732h = str;
                this.f68733i = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f68732h, fVar.f68732h) && Intrinsics.areEqual(this.f68733i, fVar.f68733i);
            }

            public int hashCode() {
                String str = this.f68732h;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f68733i;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th2);
        }

        private e(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, th2);
    }

    public final String d() {
        return this.f68705e;
    }

    public final String g() {
        return this.f68702b;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f68707g;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f68704d;
    }

    public final String h() {
        return this.f68703c;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ChartboostError(code='" + this.f68702b + "', constant='" + this.f68703c + "', message='" + getMessage() + "', causeDescription='" + this.f68705e + "', resolution='" + this.f68706f + "', cause=" + getCause() + ")";
    }

    private c(String str, String str2, String str3, String str4, String str5, Throwable th2) {
        super(str3, th2);
        this.f68702b = str;
        this.f68703c = str2;
        this.f68704d = str3;
        this.f68705e = str4;
        this.f68706f = str5;
        this.f68707g = th2;
    }
}
