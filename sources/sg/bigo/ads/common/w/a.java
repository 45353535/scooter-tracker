package sg.bigo.ads.common.w;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import sg.bigo.ads.common.w.c;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 19)
final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator<C1275a> f103051g = new Comparator<C1275a>() { // from class: sg.bigo.ads.common.w.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C1275a c1275a, C1275a c1275a2) {
            return c1275a2.a() - c1275a.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f103052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f103053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<c.C1277c> f103054c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final c.b[] f103056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f103057f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final TimingLogger f103055d = null;

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.a$a, reason: collision with other inner class name */
    class C1275a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f103058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f103060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f103061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f103062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f103063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f103064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f103065h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f103066i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f103067j;

        C1275a(int i10, int i11) {
            this.f103060c = i10;
            this.f103058a = i11;
            c();
        }

        private int f() {
            return (this.f103058a + 1) - this.f103060c;
        }

        final int a() {
            return ((this.f103063f - this.f103062e) + 1) * ((this.f103065h - this.f103064g) + 1) * ((this.f103067j - this.f103066i) + 1);
        }

        final boolean b() {
            return f() > 1;
        }

        final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f103052a;
            int[] iArr2 = aVar.f103053b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f103060c; i17 <= this.f103058a; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iA = a.a(i18);
                int iB = a.b(i18);
                int iC = a.c(i18);
                if (iA > i11) {
                    i11 = iA;
                }
                if (iA < i10) {
                    i10 = iA;
                }
                if (iB > i12) {
                    i12 = iB;
                }
                if (iB < i15) {
                    i15 = iB;
                }
                if (iC > i13) {
                    i13 = iC;
                }
                if (iC < i16) {
                    i16 = iC;
                }
            }
            this.f103062e = i10;
            this.f103063f = i11;
            this.f103064g = i15;
            this.f103065h = i12;
            this.f103066i = i16;
            this.f103067j = i13;
            this.f103061d = i14;
        }

        final int d() {
            int i10 = this.f103063f - this.f103062e;
            int i11 = this.f103065h - this.f103064g;
            int i12 = this.f103067j - this.f103066i;
            int i13 = (i10 < i11 || i10 < i12) ? (i11 < i10 || i11 < i12) ? -1 : -2 : -3;
            a aVar = a.this;
            int[] iArr = aVar.f103052a;
            int[] iArr2 = aVar.f103053b;
            a.a(iArr, i13, this.f103060c, this.f103058a);
            Arrays.sort(iArr, this.f103060c, this.f103058a + 1);
            a.a(iArr, i13, this.f103060c, this.f103058a);
            int i14 = this.f103061d / 2;
            int i15 = this.f103060c;
            int i16 = 0;
            while (true) {
                int i17 = this.f103058a;
                if (i15 > i17) {
                    return this.f103060c;
                }
                i16 += iArr2[iArr[i15]];
                if (i16 >= i14) {
                    return Math.min(i17 - 1, i15);
                }
                i15++;
            }
        }

        final c.C1277c e() {
            a aVar = a.this;
            int[] iArr = aVar.f103052a;
            int[] iArr2 = aVar.f103053b;
            int i10 = 0;
            int iA = 0;
            int iB = 0;
            int iC = 0;
            for (int i11 = this.f103060c; i11 <= this.f103058a; i11++) {
                int i12 = iArr[i11];
                int i13 = iArr2[i12];
                i10 += i13;
                iA += a.a(i12) * i13;
                iB += a.b(i12) * i13;
                iC += i13 * a.c(i12);
            }
            if (i10 == 0) {
                return new c.C1277c(a.a(0, 0, 0), i10);
            }
            float f10 = i10;
            return new c.C1277c(a.a(Math.round(iA / f10), Math.round(iB / f10), Math.round(iC / f10)), i10);
        }
    }

    a(int[] iArr, int i10, c.b[] bVarArr) {
        this.f103056e = bVarArr;
        int[] iArr2 = new int[32768];
        this.f103053b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int iB = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                b.a(d(i14), this.f103057f);
                if (a(this.f103057f)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f103052a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 > i10) {
            PriorityQueue priorityQueue = new PriorityQueue(i10, f103051g);
            priorityQueue.offer(new C1275a(0, this.f103052a.length - 1));
            a(priorityQueue, i10);
            this.f103054c = a(priorityQueue);
            return;
        }
        this.f103054c = new ArrayList();
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = iArr3[i17];
            this.f103054c.add(new c.C1277c(d(i18), iArr2[i18]));
        }
    }

    static int a(int i10) {
        return (i10 >> 10) & 31;
    }

    static int b(int i10) {
        return (i10 >> 5) & 31;
    }

    static int c(int i10) {
        return i10 & 31;
    }

    private static int d(int i10) {
        return a((i10 >> 10) & 31, (i10 >> 5) & 31, i10 & 31);
    }

    static int a(int i10, int i11, int i12) {
        return Color.rgb(b(i10, 5, 8), b(i11, 5, 8), b(i12, 5, 8));
    }

    private static int b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    private List<c.C1277c> a(Collection<C1275a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C1275a> it = collection.iterator();
        while (it.hasNext()) {
            c.C1277c c1277cE = it.next().e();
            if (!a(c1277cE.a())) {
                arrayList.add(c1277cE);
            }
        }
        return arrayList;
    }

    private static void a(PriorityQueue<C1275a> priorityQueue, int i10) {
        C1275a c1275aPoll;
        while (priorityQueue.size() < i10 && (c1275aPoll = priorityQueue.poll()) != null && c1275aPoll.b()) {
            if (!c1275aPoll.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iD = c1275aPoll.d();
            C1275a c1275a = a.this.new C1275a(iD + 1, c1275aPoll.f103058a);
            c1275aPoll.f103058a = iD;
            c1275aPoll.c();
            priorityQueue.offer(c1275a);
            priorityQueue.offer(c1275aPoll);
        }
    }

    static void a(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
            i11++;
        }
    }

    private boolean a(float[] fArr) {
        c.b[] bVarArr = this.f103056e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.f103056e[i10].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
