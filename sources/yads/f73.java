package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.core.view.ViewCompat;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class f73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f110627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i73 f110628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f110629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f110630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f110631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f73 f110632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f110633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f110634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f110635m;

    public f73(String str, String str2, long j10, long j11, i73 i73Var, String[] strArr, String str3, String str4, f73 f73Var) {
        this.f110623a = str;
        this.f110624b = str2;
        this.f110631i = str4;
        this.f110628f = i73Var;
        this.f110629g = strArr;
        this.f110625c = str2 != null;
        this.f110626d = j10;
        this.f110627e = j11;
        this.f110630h = (String) fi.a((Object) str3);
        this.f110632j = f73Var;
        this.f110633k = new HashMap();
        this.f110634l = new HashMap();
    }

    public final f73 a(int i10) {
        ArrayList arrayList = this.f110635m;
        if (arrayList != null) {
            return (f73) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f110623a);
        boolean zEquals2 = "div".equals(this.f110623a);
        if (z10 || zEquals || (zEquals2 && this.f110631i != null)) {
            long j10 = this.f110626d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f110627e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f110635m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f110635m.size(); i10++) {
            ((f73) this.f110635m.get(i10)).a(treeSet, z10 || zEquals);
        }
    }

    public static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            z10 z10Var = new z10();
            z10Var.f118490a = new SpannableStringBuilder();
            treeMap.put(str, z10Var);
        }
        CharSequence charSequence = ((z10) treeMap.get(str)).f118490a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean a(long j10) {
        long j11 = this.f110626d;
        if (j11 == -9223372036854775807L && this.f110627e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f110627e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f110627e) {
            return j11 <= j10 && j10 < this.f110627e;
        }
        return true;
    }

    public final void a(long j10, String str, ArrayList arrayList) {
        if (!"".equals(this.f110630h)) {
            str = this.f110630h;
        }
        if (a(j10) && "div".equals(this.f110623a) && this.f110631i != null) {
            arrayList.add(new Pair(str, this.f110631i));
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f110635m;
            if (i10 >= (arrayList2 == null ? 0 : arrayList2.size())) {
                return;
            }
            a(i10).a(j10, str, arrayList);
            i10++;
        }
    }

    public final void a(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        if (!a(j10)) {
            return;
        }
        String str2 = "".equals(this.f110630h) ? str : this.f110630h;
        Iterator it = this.f110634l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            int iIntValue = this.f110633k.containsKey(str3) ? ((Integer) this.f110633k.get(str3)).intValue() : 0;
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if (iIntValue != iIntValue2) {
                z10 z10Var = (z10) treeMap.get(str3);
                z10Var.getClass();
                g73 g73Var = (g73) map2.get(str2);
                g73Var.getClass();
                int i10 = g73Var.f111100j;
                i73 i73VarA = h73.a(this.f110628f, this.f110629g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) z10Var.f118490a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    z10Var.f118490a = spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (i73VarA != null) {
                    h73.a(spannableStringBuilder2, iIntValue, iIntValue2, i73VarA, this.f110632j, map, i10);
                    if ("p".equals(this.f110623a)) {
                        float f10 = i73VarA.f111912s;
                        if (f10 != Float.MAX_VALUE) {
                            z10Var.f118506q = (f10 * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = i73VarA.f111908o;
                        if (alignment != null) {
                            z10Var.f118492c = alignment;
                        }
                        Layout.Alignment alignment2 = i73VarA.f111909p;
                        if (alignment2 != null) {
                            z10Var.f118493d = alignment2;
                        }
                    }
                }
            }
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f110635m;
            if (i11 >= (arrayList == null ? 0 : arrayList.size())) {
                return;
            }
            a(i11).a(j10, map, map2, str2, treeMap);
            i11++;
        }
    }

    public final void a(long j10, boolean z10, String str, TreeMap treeMap) {
        boolean z11;
        TreeMap treeMap2;
        long j11;
        this.f110633k.clear();
        this.f110634l.clear();
        if ("metadata".equals(this.f110623a)) {
            return;
        }
        if (!"".equals(this.f110630h)) {
            str = this.f110630h;
        }
        String str2 = str;
        if (this.f110625c && z10) {
            SpannableStringBuilder spannableStringBuilderA = a(str2, treeMap);
            String str3 = this.f110624b;
            str3.getClass();
            spannableStringBuilderA.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f110623a) && z10) {
            a(str2, treeMap).append('\n');
            return;
        }
        if (a(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap map = this.f110633k;
                String str4 = (String) entry.getKey();
                CharSequence charSequence = ((z10) entry.getValue()).f118490a;
                charSequence.getClass();
                map.put(str4, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(this.f110623a);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f110635m;
                if (i10 >= (arrayList == null ? 0 : arrayList.size())) {
                    break;
                }
                f73 f73VarA = a(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    treeMap2 = treeMap;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    treeMap2 = treeMap;
                }
                f73VarA.a(j11, z11, str2, treeMap2);
                j10 = j11;
                i10++;
                treeMap = treeMap2;
            }
            TreeMap treeMap3 = treeMap;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderA2 = a(str2, treeMap3);
                int length = spannableStringBuilderA2.length() - 1;
                while (length >= 0 && spannableStringBuilderA2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderA2.charAt(length) != '\n') {
                    spannableStringBuilderA2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap3.entrySet()) {
                HashMap map2 = this.f110634l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequence2 = ((z10) entry2.getValue()).f118490a;
                charSequence2.getClass();
                map2.put(str5, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public static f73 a(String str) {
        return new f73(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final long[] a() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public final ArrayList a(long j10, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        a(j10, this.f110630h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f110630h, treeMap);
        a(j10, map, map2, this.f110630h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                g73 g73Var = (g73) map2.get(pair.first);
                g73Var.getClass();
                arrayList2.add(new a20(null, null, null, bitmapDecodeByteArray, g73Var.f111093c, 0, g73Var.f111095e, g73Var.f111092b, 0, Integer.MIN_VALUE, -3.4028235E38f, g73Var.f111096f, g73Var.f111097g, false, ViewCompat.MEASURED_STATE_MASK, g73Var.f111100j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            g73 g73Var2 = (g73) map2.get(entry.getKey());
            g73Var2.getClass();
            z10 z10Var = (z10) entry.getValue();
            CharSequence charSequence = z10Var.f118490a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ef0 ef0Var : (ef0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ef0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ef0Var), spannableStringBuilder.getSpanEnd(ef0Var), (CharSequence) "");
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
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = g73Var2.f111093c;
            int i18 = g73Var2.f111094d;
            z10Var.f118494e = f10;
            z10Var.f118495f = i18;
            z10Var.f118496g = g73Var2.f111095e;
            z10Var.f118497h = g73Var2.f111092b;
            z10Var.f118501l = g73Var2.f111096f;
            float f11 = g73Var2.f111099i;
            int i19 = g73Var2.f111098h;
            z10Var.f118500k = f11;
            z10Var.f118499j = i19;
            z10Var.f118505p = g73Var2.f111100j;
            arrayList2.add(z10Var.a());
        }
        return arrayList2;
    }
}
