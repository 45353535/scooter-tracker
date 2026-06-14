package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.a.k;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f103178a = r.f102831d.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f103179b = r.f102829b.a(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f103183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f103184h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<a> f103182f = c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f103180d = f103178a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f103181e = f103179b;

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("google", "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.a.a.g
    @Nullable
    public final k a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                if (sg.bigo.ads.common.utils.k.a((Collection) this.f103182f) || ((aVarA = g.a((List<a>) sg.bigo.ads.common.utils.k.a(this.f103182f, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.e.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                        a aVar2 = aVar;
                        return (aVar2 == null || !aVar2.f103144d || aVar2.f103304b) ? 0 : 1;
                    }
                }))) == null && (aVarA = g.a((List<a>) sg.bigo.ads.common.utils.k.a(this.f103182f, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.e.2
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                        a aVar2 = aVar;
                        return (aVar2 != null && aVar2.f103144d && aVar2.f103304b) ? 1 : 0;
                    }
                }))) == null)) {
                    return null;
                }
                return aVarA;
            } finally {
            }
        }
    }

    public final void b() {
        this.f103183g = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (!sg.bigo.ads.common.utils.k.a((Collection) this.f103182f)) {
                    Iterator<a> it = this.f103182f.iterator();
                    while (it.hasNext()) {
                        it.next().f103144d = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f103180d);
            parcel.writeLong(this.f103181e);
            n.a(parcel, this.f103182f);
            parcel.writeLong(this.f103183g);
            parcel.writeLong(this.f103184h);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.f103180d = n.a(parcel, f103178a);
                this.f103181e = n.a(parcel, f103179b);
                List<a> listA = n.a(parcel, a.f103143c);
                this.f103182f = listA;
                if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                    this.f103182f = c();
                }
                this.f103183g = n.a(parcel, 0L);
                this.f103184h = n.a(parcel, 0L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            try {
                long jOptLong = jSONObject.optLong("suc_interval", f103178a / 1000) * 1000;
                long j10 = g.f103199c;
                long jMax = Math.max(jOptLong, j10);
                long jMax2 = Math.max(jSONObject.optLong("fail_interval", f103179b / 1000) * 1000, j10);
                List<a> listC = c();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        String strOptString = jSONObjectOptJSONObject.optString("name", "");
                        String strOptString2 = jSONObjectOptJSONObject.optString("url", "");
                        if (URLUtil.isNetworkUrl(strOptString2)) {
                            listC.add(new a(strOptString, strOptString2, false));
                        }
                    }
                }
                this.f103180d = jMax;
                this.f103181e = jMax2;
                this.f103182f = listC;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sg.bigo.ads.controller.a.a.g
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f103184h = System.currentTimeMillis();
        }
    }

    public final boolean a() {
        long j10 = this.f103183g;
        long j11 = this.f103184h;
        if (j10 == j11) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j10 > j11 ? Math.abs(jCurrentTimeMillis - this.f103183g) > this.f103181e : Math.abs(jCurrentTimeMillis - this.f103184h) > this.f103180d;
    }
}
