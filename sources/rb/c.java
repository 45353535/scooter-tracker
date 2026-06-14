package rb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p9.a;

/* JADX INFO: loaded from: classes12.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f99355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f99356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f99357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f99358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f99359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f99360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f99361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f99362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap f99363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap f99364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f99365m;

    private c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f99353a = str;
        this.f99354b = str2;
        this.f99361i = str4;
        this.f99358f = gVar;
        this.f99359g = strArr;
        this.f99355c = str2 != null;
        this.f99356d = j10;
        this.f99357e = j11;
        this.f99360h = (String) q9.a.e(str3);
        this.f99362j = cVar;
        this.f99363k = new HashMap();
        this.f99364l = new HashMap();
    }

    private void b(Map map, a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f99358f, this.f99359g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f99362j, map, i12);
            if ("p".equals(this.f99353a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public static c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f99353a);
        boolean zEquals2 = "div".equals(this.f99353a);
        if (z10 || zEquals || (zEquals2 && this.f99361i != null)) {
            long j10 = this.f99356d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f99357e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f99365m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f99365m.size(); i10++) {
            ((c) this.f99365m.get(i10)).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) q9.a.e(((a.b) map.get(str)).e());
    }

    private void n(long j10, String str, List list) {
        if (!"".equals(this.f99360h)) {
            str = this.f99360h;
        }
        if (m(j10) && "div".equals(this.f99353a) && this.f99361i != null) {
            list.add(new Pair(str, this.f99361i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map map, Map map2, String str, Map map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f99360h) ? str : this.f99360h;
            Iterator it = this.f99364l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f99363k.containsKey(str3) ? ((Integer) this.f99363k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (a.b) q9.a.e((a.b) map3.get(str3)), iIntValue, iIntValue2, ((e) q9.a.e((e) map2.get(str2))).f99389j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map map) {
        boolean z11;
        Map map2;
        long j11;
        this.f99363k.clear();
        this.f99364l.clear();
        if ("metadata".equals(this.f99353a)) {
            return;
        }
        if (!"".equals(this.f99360h)) {
            str = this.f99360h;
        }
        String str2 = str;
        if (this.f99355c && z10) {
            k(str2, map).append((CharSequence) q9.a.e(this.f99354b));
            return;
        }
        if ("br".equals(this.f99353a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f99363k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) q9.a.e(((a.b) entry.getValue()).e())).length()));
            }
            boolean zEquals = "p".equals(this.f99353a);
            int i10 = 0;
            while (i10 < g()) {
                c cVarF = f(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                cVarF.p(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map map3 = map;
            if (zEquals) {
                f.c(k(str2, map3));
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                this.f99364l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) q9.a.e(((a.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f99365m == null) {
            this.f99365m = new ArrayList();
        }
        this.f99365m.add(cVar);
    }

    public c f(int i10) {
        List list = this.f99365m;
        if (list != null) {
            return (c) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f99365m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j10, this.f99360h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f99360h, treeMap);
        o(j10, map, map2, this.f99360h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) q9.a.e((e) map2.get(pair.first));
                arrayList2.add(new a.b().f(bitmapDecodeByteArray).k(eVar.f99381b).l(0).h(eVar.f99382c, 0).i(eVar.f99384e).n(eVar.f99385f).g(eVar.f99386g).r(eVar.f99389j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) q9.a.e((e) map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            e((SpannableStringBuilder) q9.a.e(bVar.e()));
            bVar.h(eVar2.f99382c, eVar2.f99383d);
            bVar.i(eVar2.f99384e);
            bVar.k(eVar2.f99381b);
            bVar.n(eVar2.f99385f);
            bVar.q(eVar2.f99388i, eVar2.f99387h);
            bVar.r(eVar2.f99389j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f99359g;
    }

    public boolean m(long j10) {
        long j11 = this.f99356d;
        if (j11 == -9223372036854775807L && this.f99357e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f99357e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f99357e) {
            return j11 <= j10 && j10 < this.f99357e;
        }
        return true;
    }
}
