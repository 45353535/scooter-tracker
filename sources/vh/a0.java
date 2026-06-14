package vh;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f106785d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h[] f106786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f106787c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, e eVar, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((h) list.get(i17)).K() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) list.get(i11);
            h hVar2 = (h) list.get(i12 - 1);
            if (i16 == hVar.K()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                h hVar3 = (h) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                hVar = hVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (hVar.l(i16) == hVar2.l(i16)) {
                int iMin = Math.min(hVar.K(), hVar2.K());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && hVar.l(i20) == hVar2.l(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(eVar) + ((long) 2) + ((long) i19) + 1;
                eVar.writeInt(-i19);
                eVar.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    eVar.writeInt(hVar.l(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((h) list.get(i13)).K()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    eVar.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    e eVar2 = new e();
                    eVar.writeInt(((int) (c(eVar2) + jC)) * (-1));
                    a(jC, eVar2, i21, list, i13, i12, list2);
                    eVar.i(eVar2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((h) list.get(i23 - 1)).l(i16) != ((h) list.get(i23)).l(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(eVar) + ((long) 2) + ((long) (i22 * 2));
            eVar.writeInt(i22);
            eVar.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bL = ((h) list.get(i24)).l(i16);
                if (i24 == i13 || bL != ((h) list.get(i24 - 1)).l(i16)) {
                    eVar.writeInt(bL & 255);
                }
            }
            e eVar3 = new e();
            while (i13 < i12) {
                byte bL2 = ((h) list.get(i13)).l(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bL2 != ((h) list.get(i26)).l(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((h) list.get(i13)).K()) {
                    eVar.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    eVar.writeInt(((int) (c(eVar3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, eVar3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            eVar.i(eVar3);
        }

        static /* synthetic */ void b(a aVar, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(e eVar) {
            return eVar.e0() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final vh.a0 d(vh.h... r17) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vh.a0.a.d(vh.h[]):vh.a0");
        }

        private a() {
        }
    }

    public /* synthetic */ a0(h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    public static final a0 l(h... hVarArr) {
        return f106785d.d(hVarArr);
    }

    public /* bridge */ boolean b(h hVar) {
        return super.contains(hVar);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return b((h) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h get(int i10) {
        return this.f106786b[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.f106786b.length;
    }

    public final int[] getTrie$okio() {
        return this.f106787c;
    }

    public final h[] i() {
        return this.f106786b;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return j((h) obj);
        }
        return -1;
    }

    public /* bridge */ int j(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int k(h hVar) {
        return super.lastIndexOf(hVar);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return k((h) obj);
        }
        return -1;
    }

    private a0(h[] hVarArr, int[] iArr) {
        this.f106786b = hVarArr;
        this.f106787c = iArr;
    }
}
