package s9;

import android.net.Uri;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f99819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f99822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f99823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f99824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f99825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f99826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f99827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f99828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f99829k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f99830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f99831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f99832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f99833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f99834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f99835f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f99836g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f99837h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f99838i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f99839j;

        public k a() {
            q9.a.j(this.f99830a, "The uri must be set.");
            return new k(this.f99830a, this.f99831b, this.f99832c, this.f99833d, this.f99834e, this.f99835f, this.f99836g, this.f99837h, this.f99838i, this.f99839j);
        }

        public b b(int i10) {
            this.f99838i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f99833d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f99832c = i10;
            return this;
        }

        public b e(Map map) {
            this.f99834e = map;
            return this;
        }

        public b f(String str) {
            this.f99837h = str;
            return this;
        }

        public b g(long j10) {
            this.f99836g = j10;
            return this;
        }

        public b h(long j10) {
            this.f99835f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f99830a = uri;
            return this;
        }

        public b j(String str) {
            this.f99830a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f99832c = 1;
            this.f99834e = Collections.EMPTY_MAP;
            this.f99836g = -1L;
        }

        private b(k kVar) {
            this.f99830a = kVar.f99819a;
            this.f99831b = kVar.f99820b;
            this.f99832c = kVar.f99821c;
            this.f99833d = kVar.f99822d;
            this.f99834e = kVar.f99823e;
            this.f99835f = kVar.f99825g;
            this.f99836g = kVar.f99826h;
            this.f99837h = kVar.f99827i;
            this.f99838i = kVar.f99828j;
            this.f99839j = kVar.f99829k;
        }
    }

    static {
        n9.s.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f99821c);
    }

    public boolean d(int i10) {
        return (this.f99828j & i10) == i10;
    }

    public k e(long j10) {
        long j11 = this.f99826h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public k f(long j10, long j11) {
        return (j10 == 0 && this.f99826h == j11) ? this : new k(this.f99819a, this.f99820b, this.f99821c, this.f99822d, this.f99823e, this.f99825g + j10, j11, this.f99827i, this.f99828j, this.f99829k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f99819a + ", " + this.f99825g + ", " + this.f99826h + ", " + this.f99827i + ", " + this.f99828j + C4240b4.j.f42674e;
    }

    private k(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        q9.a.a(j13 >= 0);
        q9.a.a(j11 >= 0);
        q9.a.a(j12 > 0 || j12 == -1);
        this.f99819a = (Uri) q9.a.e(uri);
        this.f99820b = j10;
        this.f99821c = i10;
        this.f99822d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f99823e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f99825g = j11;
        this.f99824f = j13;
        this.f99826h = j12;
        this.f99827i = str;
        this.f99828j = i11;
        this.f99829k = obj;
    }
}
