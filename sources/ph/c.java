package ph;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.h;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f98371d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vh.h f98372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vh.h f98373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vh.h f98374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vh.h f98375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vh.h f98376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vh.h f98377j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh.h f98378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.h f98379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98380c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        h.a aVar = vh.h.f106840e;
        f98372e = aVar.d(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f98373f = aVar.d(Header.RESPONSE_STATUS_UTF8);
        f98374g = aVar.d(Header.TARGET_METHOD_UTF8);
        f98375h = aVar.d(Header.TARGET_PATH_UTF8);
        f98376i = aVar.d(Header.TARGET_SCHEME_UTF8);
        f98377j = aVar.d(Header.TARGET_AUTHORITY_UTF8);
    }

    public c(vh.h name, vh.h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f98378a = name;
        this.f98379b = value;
        this.f98380c = name.K() + 32 + value.K();
    }

    public final vh.h a() {
        return this.f98378a;
    }

    public final vh.h b() {
        return this.f98379b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f98378a, cVar.f98378a) && Intrinsics.areEqual(this.f98379b, cVar.f98379b);
    }

    public int hashCode() {
        return (this.f98378a.hashCode() * 31) + this.f98379b.hashCode();
    }

    public String toString() {
        return this.f98378a.S() + ": " + this.f98379b.S();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        h.a aVar = vh.h.f106840e;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(vh.h name, String value) {
        this(name, vh.h.f106840e.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
