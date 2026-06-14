package sg.bigo.ads.core.player;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.taurusx.tax.n.z;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import sg.bigo.ads.common.u.a.e;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.f.a.n;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f104678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f104679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f104681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.e.a.b f104682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.core.c.b f104683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f104684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f104685h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Integer> f104687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Integer> f104688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f104689l = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f104686i = false;

    public c(Context context, @NonNull p pVar, @NonNull sg.bigo.ads.core.e.a.b bVar) {
        ArrayList arrayList = new ArrayList(4);
        this.f104687j = arrayList;
        ArrayList arrayList2 = new ArrayList(5);
        this.f104688k = arrayList2;
        this.f104685h = context;
        this.f104678a = pVar;
        this.f104682e = bVar;
        arrayList.add(0);
        arrayList.add(25);
        arrayList.add(50);
        arrayList.add(75);
        arrayList2.add(2000);
        arrayList2.add(3000);
        arrayList2.add(5000);
        arrayList2.add(8000);
        arrayList2.add(10000);
    }

    public static String a(String str) {
        if (q.a((CharSequence) str)) {
            return "";
        }
        String strA = q.a(str, "[TIMESTAMP]", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date()), true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((int) (Math.random() * 9.0E7d)) + 10000000);
        return q.a(strA, z.f66396c, sb2.toString(), true);
    }

    private static String b(String str, int i10) {
        if (q.a((CharSequence) str)) {
            return "";
        }
        try {
            return q.a(str, "ad_click_indx=__ad_click_indx__", "ad_click_indx=".concat(String.valueOf(i10)), true);
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String a(String str, int i10) {
        if (q.a((CharSequence) str)) {
            return "";
        }
        try {
            return q.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=".concat(String.valueOf(i10)), true);
        } catch (Throwable unused) {
            return str;
        }
    }

    public final boolean b(sg.bigo.ads.api.core.b bVar) {
        return a(bVar, this.f104678a.f104275z, "va_cpn_cli");
    }

    public final void a() {
        a(this.f104678a.f104274y, "va_cpn_imp");
    }

    public static void a(Context context, List<n> list) {
        if (list != null) {
            for (n nVar : list) {
                if (nVar != null) {
                    String str = nVar.f104245b;
                    if (q.a((CharSequence) str) || (nVar.f104246c && !nVar.f104247d)) {
                        sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                    } else {
                        sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(str), context);
                        aVar.f102749l = e.g();
                        g.a(aVar, null);
                    }
                }
            }
        }
    }

    public final void a(sg.bigo.ads.api.core.b bVar) {
        if (this.f104689l) {
            return;
        }
        a(bVar, this.f104678a.f104259j, "va_cli");
    }

    public static void a(sg.bigo.ads.core.a.a aVar, int i10) {
        sg.bigo.ads.core.d.b.a(aVar, i10, aVar.aK(), aVar.aM());
    }

    public final void a(@NonNull n nVar, String str) {
        String str2 = nVar.f104245b;
        if (q.a((CharSequence) str2) || (nVar.f104246c && !nVar.f104247d)) {
            sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
            return;
        }
        String strA = a(str2);
        nVar.f104246c = true;
        if (q.a((CharSequence) strA)) {
            return;
        }
        this.f104682e.a(this.f104685h, str, strA, "bigoad");
        sg.bigo.ads.common.t.a.a(0, 3, "VASTController", "Send track info, action: " + str + ", url: " + strA);
    }

    public final void a(@NonNull n nVar, String str, sg.bigo.ads.api.core.b bVar) {
        String str2 = nVar.f104245b;
        if (q.a((CharSequence) str2) || (nVar.f104246c && !nVar.f104247d)) {
            sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
            return;
        }
        String strA = a(str2);
        if ("va_show".equals(str) && (bVar instanceof sg.bigo.ads.core.a.a) && strA.contains("ad_imp_indx=__ad_imp_indx__")) {
            strA = a(strA, ((sg.bigo.ads.core.a.a) bVar).bn());
        }
        if (("va_cli".equals(str) || "va_cpn_cli".equals(str)) && (bVar instanceof sg.bigo.ads.core.a.a) && strA.contains("ad_click_indx=__ad_click_indx__")) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) bVar;
            strA = b(strA, aVar.bo());
            if (strA.contains("ad_imp_indx=__ad_imp_indx__")) {
                strA = a(strA, aVar.bn());
            }
        }
        nVar.f104246c = true;
        if (q.a((CharSequence) strA)) {
            return;
        }
        this.f104682e.a(this.f104685h, str, strA, "bigoad");
        sg.bigo.ads.common.t.a.a(0, 3, "VASTController", "Send track info, action: " + str + ", url: " + strA);
    }

    public final boolean a(@NonNull List<? extends n> list, String str) {
        Iterator<? extends n> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.f104689l = true;
            }
            a(it.next(), str);
            it.remove();
            z10 = true;
        }
        return z10;
    }

    private boolean a(sg.bigo.ads.api.core.b bVar, @NonNull List<? extends n> list, String str) {
        Iterator<? extends n> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.f104689l = true;
            }
            a(it.next(), str, bVar);
            it.remove();
            z10 = true;
        }
        return z10;
    }
}
