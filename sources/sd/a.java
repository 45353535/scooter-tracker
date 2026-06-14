package sd;

import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: sd.a$a, reason: collision with other inner class name */
    public static final class C1195a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f99937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f99938b;

        public /* synthetic */ C1195a(long j10, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, map);
        }

        public static /* synthetic */ Long e(C1195a c1195a, String str, Long l10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                l10 = null;
            }
            return c1195a.d(str, l10);
        }

        public static /* synthetic */ String g(C1195a c1195a, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return c1195a.f(str, str2);
        }

        public final Long a() {
            return e(this, "Content-Length", null, 2, null);
        }

        public final String b() {
            return g(this, "Content-Type", null, 2, null);
        }

        public final long c() {
            return this.f99937a;
        }

        public final Long d(String key, Long l10) {
            String str;
            Long lX;
            Intrinsics.checkNotNullParameter(key, "key");
            List list = (List) this.f99938b.get(key);
            return (list == null || (str = (String) CollectionsKt.firstOrNull(list)) == null || (lX = StringsKt.x(str)) == null) ? l10 : lX;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1195a)) {
                return false;
            }
            C1195a c1195a = (C1195a) obj;
            return kotlin.time.b.l(this.f99937a, c1195a.f99937a) && Intrinsics.areEqual(this.f99938b, c1195a.f99938b);
        }

        public final String f(String key, String str) {
            String str2;
            Intrinsics.checkNotNullParameter(key, "key");
            List list = (List) this.f99938b.get(key);
            return (list == null || (str2 = (String) CollectionsKt.firstOrNull(list)) == null) ? str : str2;
        }

        public int hashCode() {
            return (kotlin.time.b.y(this.f99937a) * 31) + this.f99938b.hashCode();
        }

        public String toString() {
            return "CallData(executionTime=" + ((Object) kotlin.time.b.L(this.f99937a)) + ", headers=" + this.f99938b + ')';
        }

        private C1195a(long j10, Map map) {
            this.f99937a = j10;
            this.f99938b = map;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f99939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f99940b;

        public /* synthetic */ b(long j10, File file, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, file);
        }

        public final long a() {
            return this.f99939a;
        }

        public final File b() {
            return this.f99940b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.time.b.l(this.f99939a, bVar.f99939a) && Intrinsics.areEqual(this.f99940b, bVar.f99940b);
        }

        public int hashCode() {
            return (kotlin.time.b.y(this.f99939a) * 31) + this.f99940b.hashCode();
        }

        public String toString() {
            return "DownloadData(executionTime=" + ((Object) kotlin.time.b.L(this.f99939a)) + ", output=" + this.f99940b + ')';
        }

        private b(long j10, File file) {
            this.f99939a = j10;
            this.f99940b = file;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Deferred f99942b;

        public c(String url, Deferred deferred) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(deferred, "deferred");
            this.f99941a = url;
            this.f99942b = deferred;
        }

        public final Deferred a() {
            return this.f99942b;
        }

        public final String b() {
            return this.f99941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f99941a, cVar.f99941a) && Intrinsics.areEqual(this.f99942b, cVar.f99942b);
        }

        public int hashCode() {
            return (this.f99941a.hashCode() * 31) + this.f99942b.hashCode();
        }

        public String toString() {
            return "DownloadTask(url=" + this.f99941a + ", deferred=" + this.f99942b + ')';
        }
    }

    c a(String str, File file, kotlin.time.b bVar);

    c b(String str, File file);

    Object c(String str, kotlin.time.b bVar, Continuation continuation);
}
