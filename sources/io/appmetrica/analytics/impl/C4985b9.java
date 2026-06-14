package io.appmetrica.analytics.impl;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4985b9 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f76884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C4985b9 f76885i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ed f76886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo f76887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D8 f76888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A9 f76889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC5014cc f76890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4990be f76891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U9 f76892g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC5218ka.FIRST_OCCURRENCE, 1);
        map.put(EnumC5218ka.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC5218ka.UNKNOWN, -1);
        f76884h = DesugarCollections.unmodifiableMap(map);
        f76885i = new C4985b9(new Wi(), new C5025cn(), new C5196je(), new Vi(), new C5369qa(), new C5393ra(), new C5344pa());
    }

    public C4985b9(C4959a9 c4959a9) {
        this(c4959a9.f76799a, c4959a9.f76800b, c4959a9.f76801c, c4959a9.f76802d, c4959a9.f76803e, c4959a9.f76804f, c4959a9.f76805g);
    }

    public final C5243l9 a(S8 s82, C5351ph c5351ph) {
        C5243l9 c5243l9 = new C5243l9();
        C5217k9 c5217k9A = this.f76891f.a(s82.f76419l, s82.f76420m);
        C5114g9 c5114g9A = this.f76890e.a(s82.f76414g);
        if (c5217k9A != null) {
            c5243l9.f77680g = c5217k9A;
        }
        if (c5114g9A != null) {
            c5243l9.f77679f = c5114g9A;
        }
        String strA = this.f76886a.a(s82.f76408a);
        if (strA != null) {
            c5243l9.f77677d = strA;
        }
        c5243l9.f77678e = this.f76887b.a(s82, c5351ph);
        String str = s82.f76417j;
        if (str != null) {
            c5243l9.f77681h = str;
        }
        Integer numA = this.f76889d.a(s82);
        if (numA != null) {
            c5243l9.f77676c = numA.intValue();
        }
        Long l10 = s82.f76410c;
        if (l10 != null) {
            c5243l9.f77674a = l10.longValue();
        }
        Long l11 = s82.f76411d;
        if (l11 != null) {
            c5243l9.f77687n = l11.longValue();
        }
        Long l12 = s82.f76412e;
        if (l12 != null) {
            c5243l9.f77688o = l12.longValue();
        }
        Long l13 = s82.f76413f;
        if (l13 != null) {
            c5243l9.f77675b = l13.longValue();
        }
        Integer num = s82.f76418k;
        if (num != null) {
            c5243l9.f77682i = num.intValue();
        }
        c5243l9.f77683j = this.f76888c.a(s82.f76422o);
        C5366q7 c5366q7 = s82.f76414g;
        c5243l9.f77684k = c5366q7 != null ? new C5315o6().a(c5366q7.f78036a) : -1;
        String str2 = s82.f76421n;
        if (str2 != null) {
            c5243l9.f77685l = str2.getBytes();
        }
        EnumC5218ka enumC5218ka = s82.f76423p;
        Integer num2 = enumC5218ka != null ? (Integer) f76884h.get(enumC5218ka) : null;
        if (num2 != null) {
            c5243l9.f77686m = num2.intValue();
        }
        EnumC5442t9 enumC5442t9 = s82.f76424q;
        if (enumC5442t9 != null) {
            int iOrdinal = enumC5442t9.ordinal();
            if (iOrdinal == 0) {
                c5243l9.f77689p = 0;
            } else if (iOrdinal == 1) {
                c5243l9.f77689p = 1;
            } else if (iOrdinal == 2) {
                c5243l9.f77689p = 2;
            }
        }
        Boolean bool = s82.f76425r;
        if (bool != null) {
            c5243l9.f77690q = bool.booleanValue();
        }
        if (s82.f76426s != null) {
            c5243l9.f77691r = r6.intValue();
        }
        c5243l9.f77692s = ((C5344pa) this.f76892g).a(s82.f76427t);
        return c5243l9;
    }

    public C4985b9(Ed ed2, vo voVar, D8 d82, A9 a92, InterfaceC5014cc interfaceC5014cc, InterfaceC4990be interfaceC4990be, U9 u92) {
        this.f76886a = ed2;
        this.f76887b = voVar;
        this.f76888c = d82;
        this.f76889d = a92;
        this.f76890e = interfaceC5014cc;
        this.f76891f = interfaceC4990be;
        this.f76892g = u92;
    }

    public static C4959a9 a() {
        return new C4959a9(f76885i);
    }
}
