package io.bidmachine.analytics.internal.p;

import java.text.ParseException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0958a f79695c = new C0958a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Regex f79696a = new Regex("^(\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}) ([A-Z])\\/(\\S+)\\(\\s*(\\d+)\\): (.*)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f79697b = new i();

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p.a$a, reason: collision with other inner class name */
    public static final class C0958a {
        public /* synthetic */ C0958a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0958a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f79698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f79700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f79701d;

        public b(long j10, String str, String str2, String str3) {
            this.f79698a = j10;
            this.f79699b = str;
            this.f79700c = str2;
            this.f79701d = str3;
        }

        public final String a() {
            return this.f79700c;
        }

        public final String b() {
            return this.f79701d;
        }

        public final String c() {
            return this.f79699b;
        }

        public final long d() {
            return this.f79698a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f79698a == bVar.f79698a && Intrinsics.areEqual(this.f79699b, bVar.f79699b) && Intrinsics.areEqual(this.f79700c, bVar.f79700c) && Intrinsics.areEqual(this.f79701d, bVar.f79701d);
        }

        public int hashCode() {
            return (((((androidx.collection.b.a(this.f79698a) * 31) + this.f79699b.hashCode()) * 31) + this.f79700c.hashCode()) * 31) + this.f79701d.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final b a(String str) throws ParseException {
        MatchResult matchResultC = Regex.c(this.f79696a, str, 0, 2, null);
        if (matchResultC == null) {
            return null;
        }
        MatchResult.b bVarA = matchResultC.a();
        String str2 = (String) bVarA.a().c().get(1);
        String str3 = (String) bVarA.a().c().get(2);
        String str4 = (String) bVarA.a().c().get(3);
        String str5 = (String) bVarA.a().c().get(5);
        Long lA = this.f79697b.a(str2);
        return new b(lA != null ? lA.longValue() : 0L, str4, str3, str5);
    }
}
