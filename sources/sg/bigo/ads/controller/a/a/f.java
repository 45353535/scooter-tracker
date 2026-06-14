package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.a.i;
import sg.bigo.ads.controller.a.k;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f103187a = r.f102830c.a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f103190e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<a> f103189d = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f103188b = f103187a;

    static class a extends sg.bigo.ads.controller.a.a.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final f.a<a> f103197e = new f.a<a>() { // from class: sg.bigo.ads.controller.a.a.f.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f103198f;

        public a() {
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            super.b(parcel);
            this.f103198f = n.a(parcel, "");
        }

        public a(String str, String str2, boolean z10, String str3) {
            super(str, str2, z10);
            this.f103198f = str3;
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            super.a(parcel);
            parcel.writeString(this.f103198f);
        }
    }

    @Nullable
    private k b(final String str) {
        k kVarA;
        synchronized (this) {
            try {
                if (!sg.bigo.ads.common.utils.k.a((Collection) this.f103189d)) {
                    a aVar = (a) g.a(sg.bigo.ads.common.utils.k.a(this.f103189d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.1
                        @Override // java.lang.Comparable
                        public final /* synthetic */ int compareTo(a aVar2) {
                            a aVar3 = aVar2;
                            return (aVar3 == null || !aVar3.f103144d || aVar3.f103304b || !TextUtils.equals(aVar3.f103198f, str)) ? 0 : 1;
                        }
                    }));
                    if (aVar != null) {
                        return aVar;
                    }
                    List listA = sg.bigo.ads.common.utils.k.a(this.f103189d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.2
                        @Override // java.lang.Comparable
                        public final /* synthetic */ int compareTo(a aVar2) {
                            a aVar3 = aVar2;
                            return (aVar3 != null && aVar3.f103144d && aVar3.f103304b && TextUtils.equals(aVar3.f103198f, str)) ? 1 : 0;
                        }
                    });
                    if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                        List listA2 = sg.bigo.ads.common.utils.k.a(this.f103189d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.3
                            @Override // java.lang.Comparable
                            public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                                a aVar3 = aVar2;
                                return (aVar3 == null || !aVar3.f103144d || aVar3.f103304b) ? 0 : 1;
                            }
                        });
                        if (sg.bigo.ads.common.utils.k.a((Collection) listA2)) {
                            kVarA = (a) g.a(sg.bigo.ads.common.utils.k.a(this.f103189d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.4
                                @Override // java.lang.Comparable
                                public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                                    a aVar3 = aVar2;
                                    return (aVar3 != null && aVar3.f103144d && aVar3.f103304b) ? 1 : 0;
                                }
                            }));
                            if (kVarA != null) {
                            }
                        } else {
                            kVarA = g.a((List<k>) listA2);
                        }
                    } else {
                        kVarA = g.a((List<k>) listA);
                    }
                    return kVarA;
                }
                return null;
            } finally {
            }
        }
    }

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("AWS", "https://ad-host-backup-asia.oss-ap-southeast-1.aliyuncs.com/uni/v2/au.pj", true, "asia"));
        arrayList.add(new a("AWS", "https://ad-host-backup-europe.oss-eu-central-1.aliyuncs.com/uni/v2/au.pj", true, "europe"));
        arrayList.add(new a("AWS", "https://ad-host-backup-america.oss-us-west-1.aliyuncs.com/uni/v2/au.pj", true, "america"));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.a.a.g
    @Nullable
    public final k a(String str) {
        if (sg.bigo.ads.common.utils.k.a((Collection) this.f103189d)) {
            return null;
        }
        return b(i.a(str));
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f103188b);
            n.a(parcel, this.f103189d);
            parcel.writeLong(this.f103190e);
        }
    }

    public final void b() {
        this.f103190e = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (!sg.bigo.ads.common.utils.k.a((Collection) this.f103189d)) {
                    Iterator<a> it = this.f103189d.iterator();
                    while (it.hasNext()) {
                        it.next().f103144d = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            try {
                long jMax = Math.max(jSONObject.optLong("interval", f103187a / 1000) * 1000, g.f103199c);
                List<a> listC = c();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        String strOptString = jSONObjectOptJSONObject.optString("name", "");
                        String strOptString2 = jSONObjectOptJSONObject.optString("url", "");
                        String strOptString3 = jSONObjectOptJSONObject.optString("region", "");
                        if (URLUtil.isNetworkUrl(strOptString2)) {
                            listC.add(new a(strOptString, strOptString2, false, strOptString3));
                        }
                    }
                }
                this.f103188b = jMax;
                this.f103189d = listC;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.f103188b = n.a(parcel, f103187a);
                List<a> listA = n.a(parcel, a.f103197e);
                this.f103189d = listA;
                if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                    this.f103189d = c();
                }
                this.f103190e = n.a(parcel, 0L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a() {
        return Math.abs(System.currentTimeMillis() - this.f103190e) > this.f103188b;
    }
}
