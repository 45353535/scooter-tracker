package sg.bigo.ads.core.f.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.taurusx.tax.f.s;
import com.taurusx.tax.f.w;
import com.taurusx.tax.f.y;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.core.f.a.a;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f104228f = {"video/mp4", "video/3gp", "video/3gpp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104229a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public e f104232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<n> f104233e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f104234g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f104237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f104238k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f104230b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f104231c = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<sg.bigo.ads.core.f.a.a.b> f104235h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f104236i = new a() { // from class: sg.bigo.ads.core.f.a.k.1
        @Override // sg.bigo.ads.core.f.a.k.a
        @Nullable
        public final String a(@NonNull Context context, @NonNull q qVar, @NonNull List<n> list) {
            return k.a(k.this, context, qVar, list);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f104239l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<sg.bigo.ads.core.c.a> f104240m = new ArrayList();

    public interface a {
        @Nullable
        String a(@NonNull Context context, @NonNull q qVar, @NonNull List<n> list);
    }

    public k(int i10, int i11) {
        this.f104234g = 0.1f;
        this.f104238k = 0;
        this.f104234g = 30.0f;
        this.f104237j = i10;
        this.f104238k = i11;
    }

    static /* synthetic */ String a(k kVar, Context context, q qVar, List list) {
        String str;
        kVar.f104233e = list;
        String strK = qVar.k();
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strK)) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "The redirect url from wrapper is invalid.");
            kVar.f104232d = new e(10070, "The redirect url from wrapper is invalid.");
            return null;
        }
        int i10 = kVar.f104229a;
        if (i10 >= 6) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "The wrapper redirects too much times.");
            kVar.f104232d = new e(10071, "The wrapper redirects too much times");
            return null;
        }
        kVar.f104229a = i10 + 1;
        kVar.f104231c = strK;
        sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(strK), context);
        aVar.f102749l = sg.bigo.ads.common.u.a.e.f();
        sg.bigo.ads.common.u.c<sg.bigo.ads.common.u.c.a> cVarA = sg.bigo.ads.common.u.g.a(aVar);
        T t10 = cVarA.f102754a;
        if (t10 != 0) {
            return new sg.bigo.ads.common.u.c.d((sg.bigo.ads.common.u.c.a) t10).a();
        }
        sg.bigo.ads.common.t.a.a(1, "VASTParser", "The wrapper failed to redirect http request.");
        if (cVarA.f102755b != null) {
            str = "The wrapper failed to redirect http request., code: " + cVarA.f102755b.f102773a + ", msg: " + cVarA.f102755b.getMessage();
        } else {
            str = "The wrapper failed to redirect http request., response to string failed";
        }
        kVar.f104232d = new e(10072, str);
        return null;
    }

    @Nullable
    private b a(Context context, @NonNull List<i> list) {
        i iVar;
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: Media file node can not found.");
            this.f104232d = new e(10065, " media file node can not found");
            return null;
        }
        Iterator<i> it = list.iterator();
        StringBuilder sb2 = null;
        while (it.hasNext()) {
            String strA = it.next().a();
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strA)) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(f104228f));
                sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f102116a;
                if (hVar != null && hVar.h()) {
                    arrayList2.add("application/javascript");
                }
                if (!arrayList2.contains(strA.toLowerCase())) {
                }
            }
            it.remove();
            if (sb2 == null) {
                sb2 = new StringBuilder(" media file all mimetype unsupport, types are ");
            }
            sb2.append(strA);
            sb2.append(StringUtils.COMMA);
            sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: mime type is unsupported, ignore. mediaType = ".concat(String.valueOf(strA)));
        }
        if (list.isEmpty()) {
            this.f104232d = new e(10066, sb2 == null ? " media file all mimetype unsupport" : sb2.toString());
            return null;
        }
        Iterator<i> it2 = list.iterator();
        while (it2.hasNext()) {
            if (sg.bigo.ads.common.utils.q.a((CharSequence) it2.next().b())) {
                it2.remove();
                sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: Video url is empty.");
            }
        }
        if (list.isEmpty()) {
            this.f104232d = new e(10067, " though mimetype support but url is empty");
            return null;
        }
        Iterator<i> it3 = list.iterator();
        ArrayList arrayList3 = null;
        while (it3.hasNext()) {
            i next = it3.next();
            String strA2 = next.a();
            String strB = next.b();
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
                int iIntValue = sg.bigo.ads.core.f.a.d(next.f104226a, "width").intValue();
                int iIntValue2 = sg.bigo.ads.core.f.a.d(next.f104226a, "height").intValue();
                if (iIntValue <= 0 || iIntValue2 <= 0) {
                    it3.remove();
                    sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: Video width or height is invalidate, ignore and stash.");
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(next);
                } else {
                    int iC = next.c();
                    int iD = next.d();
                    String strE = next.e();
                    int i10 = this.f104237j;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            if (iIntValue <= iIntValue2) {
                            }
                        } else if (i10 != 2 || iIntValue < iIntValue2) {
                        }
                    }
                    arrayList.add(new b(iIntValue, iIntValue2, iC, iD, strB, strA2, strE));
                }
            }
        }
        int iB = 0;
        if (arrayList.isEmpty() && arrayList3 != null && !arrayList3.isEmpty() && (iVar = (i) arrayList3.get(0)) != null) {
            arrayList.add(new b(0, 0, iVar.c(), iVar.d(), iVar.b(), iVar.a(), iVar.e()));
        }
        if (arrayList.isEmpty()) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "Cannot find the best network media config.");
            this.f104232d = new e(10068, "video width to height ratio is not suitable for its direction");
            return null;
        }
        if (arrayList.size() == 1) {
            sg.bigo.ads.common.t.a.a(0, 3, "VASTParser", "find best network media config, bestNetWorkMediaConfigList size  = " + arrayList.size());
            return (b) arrayList.get(0);
        }
        b bVar = (b) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(arrayList);
        if (arrayList4.size() <= 1) {
            return bVar;
        }
        int i11 = this.f104238k;
        if (i11 == 0) {
            iB = sg.bigo.ads.common.utils.e.b(context);
        } else if (i11 != 1) {
            if (i11 == 2) {
                iB = 720;
            } else if (i11 == 3) {
                iB = 1080;
            }
        }
        return a(arrayList4, Math.min(iB, sg.bigo.ads.common.utils.e.b(context)));
    }

    private static b a(List<b> list, int i10) {
        b bVar = null;
        int i11 = Integer.MAX_VALUE;
        for (b bVar2 : list) {
            int iAbs = Math.abs(Math.min(bVar2.f104204a, bVar2.f104205b) - i10);
            if (iAbs < i11) {
                bVar = bVar2;
                i11 = iAbs;
            }
        }
        return bVar;
    }

    @Nullable
    public final p a(Context context, String str) {
        p pVarA = null;
        this.f104232d = null;
        this.f104229a = 0;
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            this.f104232d = new e(10060, "invalidate delivery params");
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            pVarA = a(context, str, this.f104236i, new ArrayList());
            if (pVarA != null) {
                a(pVarA);
            }
            this.f104230b = SystemClock.elapsedRealtime() - jElapsedRealtime;
            sg.bigo.ads.common.t.a.a(0, 3, "VASTParser", "end cost = ".concat(String.valueOf(jElapsedRealtime)));
            return pVarA;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "Parse vast xml failed: " + th2.getCause());
            this.f104232d = new e(10061, th2.getMessage());
            return pVarA;
        }
    }

    @Nullable
    private p a(@NonNull Context context, @NonNull String str, @NonNull a aVar, @NonNull List<n> list) {
        e eVar;
        this.f104233e = list;
        m mVar = new m();
        mVar.f104243a = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str.replaceFirst("<\\?.*\\?>", ""))));
        list.addAll(mVar.b());
        List<d> listA = mVar.a();
        if (listA.isEmpty()) {
            eVar = new e(10062, "not found ad node");
        } else {
            d dVar = listA.get(0);
            Node nodeA = sg.bigo.ads.core.f.a.a(dVar.f104212a, w.f66048w);
            g gVar = nodeA != null ? new g(nodeA) : null;
            if (gVar != null) {
                p pVarA = a(context, gVar, list);
                this.f104235h.addAll(gVar.f104223a);
                if (pVarA != null) {
                    return pVarA;
                }
                if (this.f104232d == null) {
                    this.f104232d = new e(10063, "not match media file found other reason");
                }
                return null;
            }
            Node nodeA2 = sg.bigo.ads.core.f.a.a(dVar.f104212a, w.f66049y);
            q qVar = nodeA2 != null ? new q(nodeA2) : null;
            if (qVar != null) {
                String strH = qVar.h();
                if (sg.bigo.ads.common.utils.q.b((CharSequence) strH)) {
                    this.f104239l = strH;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(qVar.a());
                String strA = aVar.a(context, qVar, arrayList);
                if (strA == null) {
                    return null;
                }
                List<sg.bigo.ads.core.c.a> listJ = qVar.j();
                if (listJ != null && listJ.size() > 0) {
                    this.f104240m.addAll(listJ);
                }
                p pVarA2 = a(context, strA, aVar, arrayList);
                if (pVarA2 == null) {
                    return null;
                }
                pVarA2.a(qVar.b());
                List<h> listA2 = qVar.a(y.f66051a);
                this.f104235h.addAll(qVar.f104223a);
                Iterator<h> it = listA2.iterator();
                while (it.hasNext()) {
                    a(it.next(), pVarA2);
                }
                a(qVar, pVarA2);
                int i10 = qVar.i();
                if (pVarA2.f104271v == -1) {
                    pVarA2.f104271v = i10;
                }
                if (this.f104240m.size() > 0) {
                    pVarA2.C = this.f104240m;
                }
                return pVarA2;
            }
            eVar = new e(10064, "not found wrapper node");
        }
        this.f104232d = eVar;
        return null;
    }

    @Nullable
    private p a(@NonNull Context context, @NonNull g gVar, @NonNull List<n> list) {
        h next;
        b bVarA;
        List<Node> listC;
        List<h> listA = gVar.a(y.f66051a);
        String strH = gVar.h();
        if (sg.bigo.ads.common.utils.q.b((CharSequence) strH)) {
            this.f104239l = strH;
        }
        list.addAll(gVar.a());
        Iterator<h> it = listA.iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            ArrayList arrayList = new ArrayList();
            Node nodeA = sg.bigo.ads.core.f.a.a(next.f104225a, s.f66008a);
            if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, s.f66021n)) != null) {
                Iterator<Node> it2 = listC.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new i(it2.next()));
                }
            }
            bVarA = a(context, arrayList);
        } while (bVarA == null);
        p pVar = new p();
        pVar.a(gVar.b());
        a(next, pVar);
        pVar.f104262m = next.a();
        long jI = next.i();
        if (jI > 0) {
            pVar.f104268s = jI;
        }
        Node nodeA2 = sg.bigo.ads.core.f.a.a(next.f104225a, "AdParameters");
        pVar.B = nodeA2 != null ? new sg.bigo.ads.core.f.a.a.a.a(TextUtils.equals(sg.bigo.ads.core.f.a.e(nodeA2, "xmlEncoded"), "true"), sg.bigo.ads.core.f.a.b(nodeA2)) : null;
        pVar.f104263n = bVarA;
        int i10 = bVarA.f104204a;
        int i11 = bVarA.f104205b;
        pVar.f104273x = i10;
        pVar.f104272w = i11;
        pVar.f104265p = gVar.f();
        pVar.f104266q = gVar.g();
        pVar.f104267r = this.f104239l;
        pVar.f104271v = gVar.i();
        long jA = r.a();
        if (jA > 0) {
            pVar.f104270u = jA;
        }
        pVar.f104269t = ((long) gVar.e()) * 1000;
        pVar.f104260k.addAll(list);
        a(gVar, pVar);
        List<sg.bigo.ads.core.c.a> listJ = gVar.j();
        if (listJ != null && listJ.size() > 0) {
            this.f104240m.addAll(listJ);
        }
        if (this.f104240m.size() > 0) {
            pVar.C = this.f104240m;
        }
        return pVar;
    }

    private static void a(@NonNull g gVar, @NonNull p pVar) {
        pVar.b(gVar.c());
        pVar.c(gVar.d());
    }

    private static void a(@NonNull h hVar, @NonNull p pVar) {
        pVar.l(hVar.h());
        pVar.k(hVar.g());
        pVar.d(hVar.a("complete"));
        pVar.e(hVar.a("skip"));
        pVar.f(hVar.d());
        pVar.g(hVar.c());
        pVar.h(hVar.f());
        pVar.i(hVar.e());
        pVar.j(hVar.b());
    }

    private void a(p pVar) {
        a.C1291a c1291a;
        List<a.C1291a> list;
        List<sg.bigo.ads.core.f.a.a.b> list2 = this.f104235h;
        if (sg.bigo.ads.common.utils.k.a((Collection) list2)) {
            return;
        }
        Iterator<sg.bigo.ads.core.f.a.a.b> it = list2.iterator();
        while (it.hasNext()) {
            List<sg.bigo.ads.core.f.a.a.d> listA = it.next().a();
            if (!sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                sg.bigo.ads.core.f.a.a aVar = new sg.bigo.ads.core.f.a.a();
                for (sg.bigo.ads.core.f.a.a.d dVar : listA) {
                    if (dVar != null) {
                        List<sg.bigo.ads.core.f.a.a.g> listC = dVar.c();
                        if (!sg.bigo.ads.common.utils.k.a((Collection) listC)) {
                            for (sg.bigo.ads.core.f.a.a.g gVar : listC) {
                                if (gVar instanceof sg.bigo.ads.core.f.a.a.h) {
                                    sg.bigo.ads.core.f.a.a.h hVar = (sg.bigo.ads.core.f.a.a.h) gVar;
                                    String strA = hVar.a();
                                    if (strA != null && strA.contains("image/")) {
                                        c1291a = new a.C1291a(hVar.b(), dVar.a(), dVar.b(), strA, dVar.d());
                                        list = aVar.f104178b;
                                        list.add(c1291a);
                                    }
                                } else if (gVar instanceof sg.bigo.ads.core.f.a.a.e) {
                                    c1291a = new a.C1291a(((sg.bigo.ads.core.f.a.a.e) gVar).a(), dVar.a(), dVar.b(), null, dVar.d());
                                    list = aVar.f104177a;
                                    list.add(c1291a);
                                }
                            }
                            List<sg.bigo.ads.core.f.a.a.c> listE = dVar.e();
                            if (!sg.bigo.ads.common.utils.k.a((Collection) listE)) {
                                Iterator<sg.bigo.ads.core.f.a.a.c> it2 = listE.iterator();
                                while (it2.hasNext()) {
                                    pVar.f104275z.add(new n(it2.next().a()));
                                }
                            }
                            List<String> listF = dVar.f();
                            if (!sg.bigo.ads.common.utils.k.a((Collection) listF)) {
                                Iterator<String> it3 = listF.iterator();
                                while (it3.hasNext()) {
                                    pVar.f104274y.add(new n(it3.next()));
                                }
                            }
                        }
                    }
                }
                pVar.A.add(aVar);
            }
        }
    }
}
