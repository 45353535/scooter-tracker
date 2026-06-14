package sg.bigo.ads.common.h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.f;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f102458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f102459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f102460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f102462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f102463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f102464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f102465i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f102469m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f102472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f102473q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f102475s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f102466j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f102467k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f102468l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f102470n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f102471o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1262a f102474r = new C1262a();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.a$a, reason: collision with other inner class name */
    public static class C1262a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102476a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f102477b = false;

        final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.f102476a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z10, boolean z11, boolean z12, @Nullable c cVar) {
        this.f102458b = str;
        this.f102459c = str2;
        this.f102460d = str3;
        this.f102461e = z10 ? 1 : 0;
        this.f102462f = z12;
        this.f102473q = z11;
        String strA = a();
        long jA = f.a(strA, 1);
        this.f102463g = jA <= 0 ? f.a(f.d(strA), 1) : jA;
        String strValueOf = String.valueOf(str.hashCode());
        this.f102457a = strValueOf;
        this.f102475s = cVar;
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "newInstance mId = " + strValueOf + ", savedSize = " + this.f102463g + ", mIsSupportFillTime = " + c());
    }

    public final String a() {
        return this.f102459c + File.separator + this.f102460d;
    }

    public final boolean b() {
        return this.f102466j == 3;
    }

    public final boolean c() {
        c cVar = this.f102475s;
        return cVar != null && cVar.f102524a;
    }

    public final boolean d() {
        c cVar = this.f102475s;
        return cVar != null && cVar.f102525b;
    }

    public final int e() {
        c cVar = this.f102475s;
        if (cVar != null) {
            return cVar.f102526c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f102458b.equals(aVar.f102458b) && this.f102460d.equals(aVar.f102460d) && this.f102459c.equals(aVar.f102459c);
    }

    public final int f() {
        c cVar = this.f102475s;
        if (cVar != null) {
            return cVar.f102527d;
        }
        return 5;
    }

    public final int g() {
        c cVar = this.f102475s;
        if (cVar != null) {
            return cVar.f102528e;
        }
        return 20;
    }

    public final boolean h() {
        if (this.f102458b.endsWith(".mp4") && this.f102474r.f102476a == -1) {
            if (f.a(f.d(a()))) {
                this.f102474r.f102476a = 1;
            } else {
                this.f102474r.f102476a = 0;
            }
        }
        return this.f102474r.f102476a == 1;
    }

    @NonNull
    public String toString() {
        return " url = " + this.f102458b + StringUtils.COMMA + " fileName = " + this.f102460d + StringUtils.COMMA + " filePath = " + this.f102459c + StringUtils.COMMA + " downloadCount = " + this.f102467k + StringUtils.COMMA + " totalSize = " + this.f102465i + StringUtils.COMMA + " loadedSize = " + this.f102463g + StringUtils.COMMA + " mState = " + this.f102466j + StringUtils.COMMA + " mLastDownloadEndTime = " + this.f102468l + StringUtils.COMMA + " mExt = " + this.f102474r.a() + StringUtils.COMMA + " contentType = " + this.f102472p + " isSupportFillTime = " + c() + " adFillTime = " + e() + " adCheckProcessTime = " + f() + " adCheckMinProcess = " + g();
    }
}
