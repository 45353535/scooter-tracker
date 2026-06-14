package com.google.android.gms.internal.ads;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzaud implements zzauy {
    public static final /* synthetic */ zzaud zza;
    public static final /* synthetic */ zzaud zzb;
    public static final /* synthetic */ zzaud zzc;
    public static final /* synthetic */ zzaud zzd;
    public static final /* synthetic */ zzaud zze;
    public static final /* synthetic */ zzaud zzf;
    public static final /* synthetic */ zzaud zzg;
    public static final /* synthetic */ zzaud zzh;
    public static final /* synthetic */ zzaud zzi;
    public static final /* synthetic */ zzaud zzj;
    public static final /* synthetic */ zzaud zzk;
    public static final /* synthetic */ zzaud zzl;
    public static final /* synthetic */ zzaud zzm;
    public static final /* synthetic */ zzaud zzn;
    public static final /* synthetic */ zzaud zzo;
    public static final /* synthetic */ zzaud zzp;
    public static final /* synthetic */ zzaud zzq;
    public static final /* synthetic */ zzaud zzr;
    public static final /* synthetic */ zzaud zzs;
    public static final /* synthetic */ zzaud zzt;
    public static final /* synthetic */ zzaud zzu;
    private final /* synthetic */ int zzv;

    static {
        int i10 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i11 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i12 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i13 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i14 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i15 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i16 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzaud((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzaud((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzaud((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzaud(i16);
        zzq = new zzaud(i13);
        zzp = new zzaud(i14);
        zzaud zzaudVar = new zzaud(i15);
        int i17 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i18 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i19 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i20 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i21 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i22 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i23 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i24 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i25 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzaudVar;
        zzn = new zzaud(i12);
        zzm = new zzaud(i17);
        zzl = new zzaud(i18);
        zzk = new zzaud(i19);
        zzj = new zzaud(i11);
        zzi = new zzaud(i20);
        zzh = new zzaud(i21);
        zzg = new zzaud(i22);
        zzf = new zzaud(i10);
        zze = new zzaud(i23);
        zzd = new zzaud(i24);
        zzc = new zzaud(i25);
        zzb = new zzaud(1);
        zza = new zzaud(0);
    }

    private /* synthetic */ zzaud(int i10) {
        this.zzv = i10;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo7820andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e3 A[Catch: zzauw -> 0x0061, zzaut | zzauv -> 0x00f2, ClassNotFoundException -> 0x01f3, zzavd -> 0x01f7, TryCatch #9 {zzauw -> 0x0061, blocks: (B:5:0x0036, B:9:0x0052, B:11:0x005a, B:16:0x0068, B:18:0x0071, B:32:0x00e3, B:19:0x007a, B:20:0x007f, B:21:0x0080, B:24:0x00a8, B:25:0x00ad, B:29:0x00b6, B:31:0x00be, B:35:0x00eb, B:36:0x00f0, B:37:0x00f1, B:42:0x0101, B:43:0x0111, B:45:0x0117, B:47:0x0125, B:48:0x0127, B:50:0x012c, B:51:0x0132, B:53:0x014a, B:54:0x014d, B:61:0x016c, B:66:0x018a, B:99:0x01e7, B:70:0x0195, B:74:0x01a0, B:81:0x01b4, B:85:0x01bf, B:89:0x01ca, B:93:0x01d5, B:97:0x01e0, B:98:0x01e3, B:105:0x01ff, B:109:0x0216, B:114:0x0239, B:121:0x0267, B:126:0x0288, B:135:0x02b0, B:137:0x02c6, B:138:0x02c8, B:140:0x02cd, B:144:0x02de, B:146:0x02f6, B:147:0x02f9, B:166:0x041b, B:192:0x04c9, B:194:0x04d1, B:198:0x04db, B:199:0x04e1, B:200:0x04e5, B:201:0x04ec, B:214:0x0532, B:218:0x0555, B:222:0x05a5, B:226:0x05c2, B:239:0x060d, B:243:0x0633, B:247:0x0656), top: B:252:0x000f }] */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object apply(java.lang.Object r23) throws com.google.android.gms.internal.ads.zzaum, com.google.android.gms.internal.ads.zzauo {
        /*
            Method dump skipped, instruction units count: 1788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaud.apply(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
