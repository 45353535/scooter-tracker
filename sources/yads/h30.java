package yads;

import android.net.Uri;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h30 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f111451k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f111452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f111455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f111456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f111457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f111458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f111459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f111460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f111461j;

    static {
        dn0.a("goog.exo.datasource");
    }

    public h30(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        fi.a(j10 + j11 >= 0);
        fi.a(j11 >= 0);
        fi.a(j12 > 0 || j12 == -1);
        this.f111452a = uri;
        this.f111453b = j10;
        this.f111454c = i10;
        this.f111455d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f111456e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f111457f = j11;
        this.f111458g = j12;
        this.f111459h = str;
        this.f111460i = i11;
        this.f111461j = obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f111454c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f111452a);
        sb2.append(", ");
        sb2.append(this.f111457f);
        sb2.append(", ");
        sb2.append(this.f111458g);
        sb2.append(", ");
        sb2.append(this.f111459h);
        sb2.append(", ");
        sb2.append(this.f111460i);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }
}
