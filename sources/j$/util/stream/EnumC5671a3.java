package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5671a3 {
    public static final EnumC5671a3 DISTINCT;
    public static final EnumC5671a3 ORDERED;
    public static final EnumC5671a3 SHORT_CIRCUIT;
    public static final EnumC5671a3 SIZED;
    public static final EnumC5671a3 SORTED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f85197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f85198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f85200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f85201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f85202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f85203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f85204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f85205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f85206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f85207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f85208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f85209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f85210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f85211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC5671a3[] f85212v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f85213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85217e;

    public static EnumC5671a3 valueOf(String str) {
        return (EnumC5671a3) Enum.valueOf(EnumC5671a3.class, str);
    }

    public static EnumC5671a3[] values() {
        return (EnumC5671a3[]) f85212v.clone();
    }

    static {
        Z2 z22 = Z2.SPLITERATOR;
        j$.time.format.r rVarP = p(z22);
        Z2 z23 = Z2.STREAM;
        rVarP.c(z23);
        Z2 z24 = Z2.OP;
        ((EnumMap) rVarP.f84654b).put(z24, 3);
        EnumC5671a3 enumC5671a3 = new EnumC5671a3("DISTINCT", 0, 0, rVarP);
        DISTINCT = enumC5671a3;
        j$.time.format.r rVarP2 = p(z22);
        rVarP2.c(z23);
        ((EnumMap) rVarP2.f84654b).put(z24, 3);
        EnumC5671a3 enumC5671a32 = new EnumC5671a3("SORTED", 1, 1, rVarP2);
        SORTED = enumC5671a32;
        j$.time.format.r rVarP3 = p(z22);
        rVarP3.c(z23);
        EnumMap enumMap = (EnumMap) rVarP3.f84654b;
        enumMap.put(z24, 3);
        Z2 z25 = Z2.TERMINAL_OP;
        enumMap.put(z25, 2);
        Z2 z26 = Z2.UPSTREAM_TERMINAL_OP;
        enumMap.put(z26, 2);
        EnumC5671a3 enumC5671a33 = new EnumC5671a3("ORDERED", 2, 2, rVarP3);
        ORDERED = enumC5671a33;
        j$.time.format.r rVarP4 = p(z22);
        rVarP4.c(z23);
        ((EnumMap) rVarP4.f84654b).put(z24, 2);
        EnumC5671a3 enumC5671a34 = new EnumC5671a3("SIZED", 3, 3, rVarP4);
        SIZED = enumC5671a34;
        j$.time.format.r rVarP5 = p(z24);
        rVarP5.c(z25);
        int i10 = 0;
        EnumC5671a3 enumC5671a35 = new EnumC5671a3("SHORT_CIRCUIT", 4, 12, rVarP5);
        SHORT_CIRCUIT = enumC5671a35;
        f85212v = new EnumC5671a3[]{enumC5671a3, enumC5671a32, enumC5671a33, enumC5671a34, enumC5671a35};
        f85196f = k(z22);
        f85197g = k(z23);
        f85198h = k(z24);
        k(z25);
        k(z26);
        for (EnumC5671a3 enumC5671a36 : values()) {
            i10 |= enumC5671a36.f85217e;
        }
        f85199i = i10;
        int i11 = f85197g;
        f85200j = i11;
        int i12 = i11 << 1;
        f85201k = i12;
        f85202l = i11 | i12;
        EnumC5671a3 enumC5671a37 = DISTINCT;
        f85203m = enumC5671a37.f85215c;
        f85204n = enumC5671a37.f85216d;
        EnumC5671a3 enumC5671a38 = SORTED;
        f85205o = enumC5671a38.f85215c;
        f85206p = enumC5671a38.f85216d;
        EnumC5671a3 enumC5671a39 = ORDERED;
        f85207q = enumC5671a39.f85215c;
        f85208r = enumC5671a39.f85216d;
        EnumC5671a3 enumC5671a310 = SIZED;
        f85209s = enumC5671a310.f85215c;
        f85210t = enumC5671a310.f85216d;
        f85211u = SHORT_CIRCUIT.f85215c;
    }

    public static j$.time.format.r p(Z2 z22) {
        j$.time.format.r rVar = new j$.time.format.r(12, new EnumMap(Z2.class));
        rVar.c(z22);
        return rVar;
    }

    public EnumC5671a3(String str, int i10, int i11, j$.time.format.r rVar) {
        Z2[] z2ArrValues = Z2.values();
        int length = z2ArrValues.length;
        int i12 = 0;
        while (true) {
            EnumMap enumMap = (EnumMap) rVar.f84654b;
            if (i12 < length) {
                Map.EL.a(enumMap, z2ArrValues[i12], 0);
                i12++;
            } else {
                this.f85213a = enumMap;
                int i13 = i11 * 2;
                this.f85214b = i13;
                this.f85215c = 1 << i13;
                this.f85216d = 2 << i13;
                this.f85217e = 3 << i13;
                return;
            }
        }
    }

    public final boolean n(int i10) {
        return (i10 & this.f85217e) == this.f85215c;
    }

    public static int k(Z2 z22) {
        int iIntValue = 0;
        for (EnumC5671a3 enumC5671a3 : values()) {
            iIntValue |= ((Integer) enumC5671a3.f85213a.get(z22)).intValue() << enumC5671a3.f85214b;
        }
        return iIntValue;
    }

    public static int j(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = f85199i;
        } else {
            i12 = ~(((f85200j & i10) << 1) | i10 | ((f85201k & i10) >> 1));
        }
        return i10 | (i11 & i12);
    }

    public static int m(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i10 = iCharacteristics & 4;
        int i11 = f85196f;
        return (i10 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i11 : iCharacteristics & i11 & (-5);
    }
}
