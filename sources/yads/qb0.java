package yads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.compose.material.TextFieldImplKt;
import androidx.media3.extractor.ts.TsExtractor;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.F9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class qb0 implements am, e63 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final nk2 f114909n = y31.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final nk2 f114910o = y31.a(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final nk2 f114911p = y31.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final nk2 f114912q = y31.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final nk2 f114913r = y31.a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final nk2 f114914s = y31.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static qb0 f114915t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b41 f114916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl f114917b = new yl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ny2 f114918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hv f114919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f114920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f114922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f114923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f114925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f114926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f114927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f114928m;

    public qb0(Context context, HashMap map, int i10, r23 r23Var, boolean z10) {
        this.f114916a = b41.a(map);
        this.f114918c = new ny2(i10);
        this.f114919d = r23Var;
        this.f114920e = z10;
        if (context == null) {
            this.f114924i = 0;
            this.f114927l = a(0);
            return;
        }
        b72 b72VarA = b72.a(context);
        int iA = b72VarA.a();
        this.f114924i = iA;
        this.f114927l = a(iA);
        b72VarA.b(new z62() { // from class: yads.ee0
            @Override // yads.z62
            public final void a(int i11) {
                this.f110347a.b(i11);
            }
        });
    }

    public final void a(Handler handler, me meVar) {
        meVar.getClass();
        yl ylVar = this.f114917b;
        ylVar.getClass();
        for (xl xlVar : ylVar.f118281a) {
            if (xlVar.f117860b == meVar) {
                xlVar.f117861c = true;
                ylVar.f118281a.remove(xlVar);
            }
        }
        ylVar.f118281a.add(new xl(handler, meVar));
    }

    public final synchronized void b(int i10) {
        int i11 = this.f114924i;
        if (i11 == 0 || this.f114920e) {
            if (i11 == i10) {
                return;
            }
            this.f114924i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f114927l = a(i10);
                ((r23) this.f114919d).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i12 = this.f114921f > 0 ? (int) (jElapsedRealtime - this.f114922g) : 0;
                long j10 = this.f114923h;
                long j11 = this.f114927l;
                if (i12 != 0 || j10 != 0 || j11 != this.f114928m) {
                    this.f114928m = j11;
                    this.f114917b.a(i12, j10, j11);
                }
                this.f114922g = jElapsedRealtime;
                this.f114923h = 0L;
                this.f114926k = 0L;
                this.f114925j = 0L;
                ny2 ny2Var = this.f114918c;
                ny2Var.f114128b.clear();
                ny2Var.f114130d = -1;
                ny2Var.f114131e = 0;
                ny2Var.f114132f = 0;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] a(String str) {
        byte b10 = 0;
        str.getClass();
        switch (str.hashCode()) {
            case 2083:
                if (!str.equals("AD")) {
                    b10 = -1;
                }
                break;
            case 2084:
                b10 = !str.equals("AE") ? (byte) -1 : (byte) 1;
                break;
            case 2085:
                b10 = !str.equals("AF") ? (byte) -1 : (byte) 2;
                break;
            case 2086:
                b10 = !str.equals("AG") ? (byte) -1 : (byte) 3;
                break;
            case 2088:
                b10 = !str.equals("AI") ? (byte) -1 : (byte) 4;
                break;
            case 2091:
                b10 = !str.equals("AL") ? (byte) -1 : (byte) 5;
                break;
            case 2092:
                b10 = !str.equals("AM") ? (byte) -1 : (byte) 6;
                break;
            case 2094:
                b10 = !str.equals("AO") ? (byte) -1 : (byte) 7;
                break;
            case 2096:
                b10 = !str.equals("AQ") ? (byte) -1 : (byte) 8;
                break;
            case 2097:
                b10 = !str.equals("AR") ? (byte) -1 : (byte) 9;
                break;
            case 2098:
                b10 = !str.equals("AS") ? (byte) -1 : (byte) 10;
                break;
            case 2099:
                b10 = !str.equals("AT") ? (byte) -1 : Ascii.VT;
                break;
            case 2100:
                b10 = !str.equals("AU") ? (byte) -1 : Ascii.FF;
                break;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                b10 = !str.equals("AW") ? (byte) -1 : (byte) 13;
                break;
            case 2103:
                b10 = !str.equals("AX") ? (byte) -1 : Ascii.SO;
                break;
            case 2105:
                b10 = !str.equals("AZ") ? (byte) -1 : Ascii.SI;
                break;
            case 2111:
                b10 = !str.equals("BA") ? (byte) -1 : Ascii.DLE;
                break;
            case 2112:
                b10 = !str.equals("BB") ? (byte) -1 : (byte) 17;
                break;
            case 2114:
                b10 = !str.equals("BD") ? (byte) -1 : Ascii.DC2;
                break;
            case 2115:
                b10 = !str.equals("BE") ? (byte) -1 : (byte) 19;
                break;
            case 2116:
                b10 = !str.equals("BF") ? (byte) -1 : Ascii.DC4;
                break;
            case 2117:
                b10 = !str.equals("BG") ? (byte) -1 : Ascii.NAK;
                break;
            case 2118:
                b10 = !str.equals("BH") ? (byte) -1 : Ascii.SYN;
                break;
            case 2119:
                b10 = !str.equals("BI") ? (byte) -1 : Ascii.ETB;
                break;
            case 2120:
                b10 = !str.equals("BJ") ? (byte) -1 : Ascii.CAN;
                break;
            case 2122:
                b10 = !str.equals("BL") ? (byte) -1 : Ascii.EM;
                break;
            case 2123:
                b10 = !str.equals("BM") ? (byte) -1 : Ascii.SUB;
                break;
            case 2124:
                b10 = !str.equals("BN") ? (byte) -1 : Ascii.ESC;
                break;
            case 2125:
                b10 = !str.equals("BO") ? (byte) -1 : Ascii.FS;
                break;
            case 2127:
                b10 = !str.equals("BQ") ? (byte) -1 : Ascii.GS;
                break;
            case 2129:
                b10 = !str.equals("BS") ? (byte) -1 : Ascii.RS;
                break;
            case 2130:
                b10 = !str.equals("BT") ? (byte) -1 : Ascii.US;
                break;
            case 2133:
                b10 = !str.equals("BW") ? (byte) -1 : (byte) 32;
                break;
            case 2135:
                b10 = !str.equals("BY") ? (byte) -1 : (byte) 33;
                break;
            case 2136:
                b10 = !str.equals("BZ") ? (byte) -1 : (byte) 34;
                break;
            case 2142:
                b10 = !str.equals("CA") ? (byte) -1 : (byte) 35;
                break;
            case 2145:
                b10 = !str.equals("CD") ? (byte) -1 : (byte) 36;
                break;
            case 2147:
                b10 = !str.equals("CF") ? (byte) -1 : (byte) 37;
                break;
            case 2148:
                b10 = !str.equals("CG") ? (byte) -1 : (byte) 38;
                break;
            case 2149:
                b10 = !str.equals("CH") ? (byte) -1 : (byte) 39;
                break;
            case 2150:
                b10 = !str.equals("CI") ? (byte) -1 : (byte) 40;
                break;
            case 2152:
                b10 = !str.equals("CK") ? (byte) -1 : (byte) 41;
                break;
            case 2153:
                b10 = !str.equals("CL") ? (byte) -1 : (byte) 42;
                break;
            case 2154:
                b10 = !str.equals("CM") ? (byte) -1 : (byte) 43;
                break;
            case 2155:
                b10 = !str.equals("CN") ? (byte) -1 : (byte) 44;
                break;
            case 2156:
                b10 = !str.equals("CO") ? (byte) -1 : (byte) 45;
                break;
            case 2159:
                b10 = !str.equals("CR") ? (byte) -1 : (byte) 46;
                break;
            case 2162:
                b10 = !str.equals("CU") ? (byte) -1 : (byte) 47;
                break;
            case 2163:
                b10 = !str.equals("CV") ? (byte) -1 : (byte) 48;
                break;
            case 2164:
                b10 = !str.equals("CW") ? (byte) -1 : (byte) 49;
                break;
            case 2165:
                b10 = !str.equals("CX") ? (byte) -1 : (byte) 50;
                break;
            case 2166:
                b10 = !str.equals("CY") ? (byte) -1 : (byte) 51;
                break;
            case 2167:
                b10 = !str.equals("CZ") ? (byte) -1 : (byte) 52;
                break;
            case 2177:
                b10 = !str.equals("DE") ? (byte) -1 : (byte) 53;
                break;
            case 2182:
                b10 = !str.equals("DJ") ? (byte) -1 : (byte) 54;
                break;
            case 2183:
                b10 = !str.equals("DK") ? (byte) -1 : (byte) 55;
                break;
            case 2185:
                b10 = !str.equals("DM") ? (byte) -1 : (byte) 56;
                break;
            case 2187:
                b10 = !str.equals("DO") ? (byte) -1 : (byte) 57;
                break;
            case 2198:
                b10 = !str.equals("DZ") ? (byte) -1 : (byte) 58;
                break;
            case 2206:
                b10 = !str.equals("EC") ? (byte) -1 : (byte) 59;
                break;
            case 2208:
                b10 = !str.equals("EE") ? (byte) -1 : (byte) 60;
                break;
            case F9.a.f40881e /* 2210 */:
                b10 = !str.equals("EG") ? (byte) -1 : (byte) 61;
                break;
            case 2221:
                b10 = !str.equals("ER") ? (byte) -1 : (byte) 62;
                break;
            case 2222:
                b10 = !str.equals("ES") ? (byte) -1 : Utf8.REPLACEMENT_BYTE;
                break;
            case 2223:
                b10 = !str.equals("ET") ? (byte) -1 : SignedBytes.MAX_POWER_OF_TWO;
                break;
            case 2243:
                b10 = !str.equals("FI") ? (byte) -1 : (byte) 65;
                break;
            case 2244:
                b10 = !str.equals("FJ") ? (byte) -1 : (byte) 66;
                break;
            case 2245:
                b10 = !str.equals("FK") ? (byte) -1 : (byte) 67;
                break;
            case 2247:
                b10 = !str.equals("FM") ? (byte) -1 : (byte) 68;
                break;
            case 2249:
                b10 = !str.equals("FO") ? (byte) -1 : (byte) 69;
                break;
            case 2252:
                b10 = !str.equals("FR") ? (byte) -1 : (byte) 70;
                break;
            case 2266:
                b10 = !str.equals("GA") ? (byte) -1 : (byte) 71;
                break;
            case 2267:
                b10 = !str.equals("GB") ? (byte) -1 : (byte) 72;
                break;
            case 2269:
                b10 = !str.equals("GD") ? (byte) -1 : (byte) 73;
                break;
            case 2270:
                b10 = !str.equals("GE") ? (byte) -1 : (byte) 74;
                break;
            case 2271:
                b10 = !str.equals("GF") ? (byte) -1 : (byte) 75;
                break;
            case 2272:
                b10 = !str.equals("GG") ? (byte) -1 : (byte) 76;
                break;
            case 2273:
                b10 = !str.equals("GH") ? (byte) -1 : (byte) 77;
                break;
            case 2274:
                b10 = !str.equals("GI") ? (byte) -1 : (byte) 78;
                break;
            case 2277:
                b10 = !str.equals("GL") ? (byte) -1 : (byte) 79;
                break;
            case 2278:
                b10 = !str.equals("GM") ? (byte) -1 : (byte) 80;
                break;
            case 2279:
                b10 = !str.equals("GN") ? (byte) -1 : (byte) 81;
                break;
            case 2281:
                b10 = !str.equals("GP") ? (byte) -1 : (byte) 82;
                break;
            case 2282:
                b10 = !str.equals("GQ") ? (byte) -1 : (byte) 83;
                break;
            case 2283:
                b10 = !str.equals("GR") ? (byte) -1 : (byte) 84;
                break;
            case 2285:
                b10 = !str.equals("GT") ? (byte) -1 : (byte) 85;
                break;
            case 2286:
                b10 = !str.equals("GU") ? (byte) -1 : (byte) 86;
                break;
            case 2288:
                b10 = !str.equals("GW") ? (byte) -1 : (byte) 87;
                break;
            case 2290:
                b10 = !str.equals("GY") ? (byte) -1 : (byte) 88;
                break;
            case 2307:
                b10 = !str.equals("HK") ? (byte) -1 : (byte) 89;
                break;
            case 2314:
                b10 = !str.equals("HR") ? (byte) -1 : (byte) 90;
                break;
            case 2316:
                b10 = !str.equals("HT") ? (byte) -1 : (byte) 91;
                break;
            case 2317:
                b10 = !str.equals("HU") ? (byte) -1 : (byte) 92;
                break;
            case 2331:
                b10 = !str.equals("ID") ? (byte) -1 : (byte) 93;
                break;
            case 2332:
                b10 = !str.equals("IE") ? (byte) -1 : (byte) 94;
                break;
            case 2339:
                b10 = !str.equals("IL") ? (byte) -1 : (byte) 95;
                break;
            case 2340:
                b10 = !str.equals("IM") ? (byte) -1 : (byte) 96;
                break;
            case 2341:
                b10 = !str.equals("IN") ? (byte) -1 : (byte) 97;
                break;
            case 2342:
                b10 = !str.equals("IO") ? (byte) -1 : (byte) 98;
                break;
            case 2344:
                b10 = !str.equals("IQ") ? (byte) -1 : (byte) 99;
                break;
            case 2345:
                b10 = !str.equals("IR") ? (byte) -1 : (byte) 100;
                break;
            case 2346:
                b10 = !str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE) ? (byte) -1 : (byte) 101;
                break;
            case 2347:
                b10 = !str.equals("IT") ? (byte) -1 : (byte) 102;
                break;
            case 2363:
                b10 = !str.equals("JE") ? (byte) -1 : (byte) 103;
                break;
            case 2371:
                b10 = !str.equals("JM") ? (byte) -1 : (byte) 104;
                break;
            case 2373:
                b10 = !str.equals("JO") ? (byte) -1 : (byte) 105;
                break;
            case 2374:
                b10 = !str.equals("JP") ? (byte) -1 : (byte) 106;
                break;
            case 2394:
                b10 = !str.equals("KE") ? (byte) -1 : (byte) 107;
                break;
            case 2396:
                b10 = !str.equals("KG") ? (byte) -1 : (byte) 108;
                break;
            case 2397:
                b10 = !str.equals("KH") ? (byte) -1 : (byte) 109;
                break;
            case 2398:
                b10 = !str.equals("KI") ? (byte) -1 : (byte) 110;
                break;
            case 2402:
                b10 = !str.equals("KM") ? (byte) -1 : (byte) 111;
                break;
            case 2403:
                b10 = !str.equals("KN") ? (byte) -1 : (byte) 112;
                break;
            case 2405:
                b10 = !str.equals("KP") ? (byte) -1 : (byte) 113;
                break;
            case 2407:
                b10 = !str.equals("KR") ? (byte) -1 : (byte) 114;
                break;
            case 2412:
                b10 = !str.equals("KW") ? (byte) -1 : (byte) 115;
                break;
            case 2414:
                b10 = !str.equals("KY") ? (byte) -1 : (byte) 116;
                break;
            case 2415:
                b10 = !str.equals("KZ") ? (byte) -1 : (byte) 117;
                break;
            case 2421:
                b10 = !str.equals("LA") ? (byte) -1 : (byte) 118;
                break;
            case 2422:
                b10 = !str.equals("LB") ? (byte) -1 : (byte) 119;
                break;
            case 2423:
                b10 = !str.equals("LC") ? (byte) -1 : (byte) 120;
                break;
            case 2429:
                b10 = !str.equals("LI") ? (byte) -1 : (byte) 121;
                break;
            case 2431:
                b10 = !str.equals("LK") ? (byte) -1 : (byte) 122;
                break;
            case 2438:
                b10 = !str.equals("LR") ? (byte) -1 : (byte) 123;
                break;
            case 2439:
                b10 = !str.equals("LS") ? (byte) -1 : (byte) 124;
                break;
            case 2440:
                b10 = !str.equals("LT") ? (byte) -1 : (byte) 125;
                break;
            case 2441:
                b10 = !str.equals("LU") ? (byte) -1 : (byte) 126;
                break;
            case 2442:
                b10 = !str.equals("LV") ? (byte) -1 : Ascii.DEL;
                break;
            case 2445:
                b10 = !str.equals("LY") ? (byte) -1 : UnsignedBytes.MAX_POWER_OF_TWO;
                break;
            case 2452:
                b10 = !str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA) ? (byte) -1 : (byte) 129;
                break;
            case 2454:
                b10 = !str.equals("MC") ? (byte) -1 : (byte) 130;
                break;
            case 2455:
                b10 = !str.equals("MD") ? (byte) -1 : (byte) 131;
                break;
            case 2456:
                b10 = !str.equals("ME") ? (byte) -1 : (byte) 132;
                break;
            case 2457:
                b10 = !str.equals("MF") ? (byte) -1 : (byte) 133;
                break;
            case 2458:
                b10 = !str.equals("MG") ? (byte) -1 : (byte) 134;
                break;
            case 2459:
                b10 = !str.equals("MH") ? (byte) -1 : (byte) 135;
                break;
            case 2462:
                b10 = !str.equals("MK") ? (byte) -1 : (byte) 136;
                break;
            case 2463:
                b10 = !str.equals("ML") ? (byte) -1 : (byte) 137;
                break;
            case 2464:
                b10 = !str.equals("MM") ? (byte) -1 : (byte) 138;
                break;
            case 2465:
                b10 = !str.equals("MN") ? (byte) -1 : (byte) 139;
                break;
            case 2466:
                b10 = !str.equals("MO") ? (byte) -1 : (byte) 140;
                break;
            case 2467:
                b10 = !str.equals("MP") ? (byte) -1 : (byte) 141;
                break;
            case 2468:
                b10 = !str.equals("MQ") ? (byte) -1 : (byte) 142;
                break;
            case 2469:
                b10 = !str.equals("MR") ? (byte) -1 : (byte) 143;
                break;
            case 2470:
                b10 = !str.equals("MS") ? (byte) -1 : (byte) 144;
                break;
            case 2471:
                b10 = !str.equals("MT") ? (byte) -1 : (byte) 145;
                break;
            case 2472:
                b10 = !str.equals("MU") ? (byte) -1 : (byte) 146;
                break;
            case 2473:
                b10 = !str.equals("MV") ? (byte) -1 : (byte) 147;
                break;
            case 2474:
                b10 = !str.equals("MW") ? (byte) -1 : (byte) 148;
                break;
            case 2475:
                b10 = !str.equals("MX") ? (byte) -1 : (byte) 149;
                break;
            case 2476:
                b10 = !str.equals("MY") ? (byte) -1 : (byte) 150;
                break;
            case 2477:
                b10 = !str.equals("MZ") ? (byte) -1 : (byte) 151;
                break;
            case 2483:
                b10 = !str.equals("NA") ? (byte) -1 : (byte) 152;
                break;
            case 2485:
                b10 = !str.equals("NC") ? (byte) -1 : (byte) 153;
                break;
            case 2487:
                b10 = !str.equals("NE") ? (byte) -1 : (byte) 154;
                break;
            case 2489:
                b10 = !str.equals("NG") ? (byte) -1 : (byte) 155;
                break;
            case 2491:
                b10 = !str.equals("NI") ? (byte) -1 : (byte) 156;
                break;
            case 2494:
                b10 = !str.equals("NL") ? (byte) -1 : (byte) 157;
                break;
            case 2497:
                b10 = !str.equals("NO") ? (byte) -1 : (byte) 158;
                break;
            case 2498:
                b10 = !str.equals("NP") ? (byte) -1 : (byte) 159;
                break;
            case 2500:
                b10 = !str.equals("NR") ? (byte) -1 : (byte) 160;
                break;
            case F9.b.f40891e /* 2503 */:
                b10 = !str.equals("NU") ? (byte) -1 : (byte) 161;
                break;
            case 2508:
                b10 = !str.equals("NZ") ? (byte) -1 : (byte) 162;
                break;
            case 2526:
                b10 = !str.equals("OM") ? (byte) -1 : (byte) 163;
                break;
            case 2545:
                b10 = !str.equals("PA") ? (byte) -1 : (byte) 164;
                break;
            case 2549:
                b10 = !str.equals("PE") ? (byte) -1 : (byte) 165;
                break;
            case 2550:
                b10 = !str.equals("PF") ? (byte) -1 : (byte) 166;
                break;
            case 2551:
                b10 = !str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG) ? (byte) -1 : (byte) 167;
                break;
            case 2552:
                b10 = !str.equals("PH") ? (byte) -1 : (byte) 168;
                break;
            case 2555:
                b10 = !str.equals("PK") ? (byte) -1 : (byte) 169;
                break;
            case 2556:
                b10 = !str.equals("PL") ? (byte) -1 : (byte) 170;
                break;
            case 2557:
                b10 = !str.equals("PM") ? (byte) -1 : (byte) 171;
                break;
            case 2562:
                b10 = !str.equals("PR") ? (byte) -1 : (byte) 172;
                break;
            case 2563:
                b10 = !str.equals("PS") ? (byte) -1 : (byte) 173;
                break;
            case 2564:
                b10 = !str.equals("PT") ? (byte) -1 : (byte) 174;
                break;
            case 2567:
                b10 = !str.equals("PW") ? (byte) -1 : (byte) 175;
                break;
            case 2576:
                b10 = !str.equals("QA") ? (byte) -1 : (byte) 176;
                break;
            case 2611:
                b10 = !str.equals("RE") ? (byte) -1 : (byte) 177;
                break;
            case 2621:
                b10 = !str.equals("RO") ? (byte) -1 : (byte) 178;
                break;
            case 2625:
                b10 = !str.equals("RS") ? (byte) -1 : (byte) 179;
                break;
            case 2627:
                b10 = !str.equals("RU") ? (byte) -1 : (byte) 180;
                break;
            case 2629:
                b10 = !str.equals("RW") ? (byte) -1 : (byte) 181;
                break;
            case 2638:
                b10 = !str.equals("SA") ? (byte) -1 : (byte) 182;
                break;
            case 2639:
                b10 = !str.equals("SB") ? (byte) -1 : (byte) 183;
                break;
            case 2640:
                b10 = !str.equals("SC") ? (byte) -1 : (byte) 184;
                break;
            case 2641:
                b10 = !str.equals("SD") ? (byte) -1 : (byte) 185;
                break;
            case 2642:
                b10 = !str.equals("SE") ? (byte) -1 : (byte) 186;
                break;
            case 2644:
                b10 = !str.equals("SG") ? (byte) -1 : (byte) 187;
                break;
            case 2645:
                b10 = !str.equals("SH") ? (byte) -1 : (byte) 188;
                break;
            case 2646:
                b10 = !str.equals("SI") ? (byte) -1 : (byte) 189;
                break;
            case 2648:
                b10 = !str.equals("SK") ? (byte) -1 : (byte) 190;
                break;
            case 2649:
                b10 = !str.equals("SL") ? (byte) -1 : (byte) 191;
                break;
            case 2650:
                b10 = !str.equals("SM") ? (byte) -1 : (byte) 192;
                break;
            case 2651:
                b10 = !str.equals("SN") ? (byte) -1 : (byte) 193;
                break;
            case 2652:
                b10 = !str.equals("SO") ? (byte) -1 : (byte) 194;
                break;
            case 2655:
                b10 = !str.equals("SR") ? (byte) -1 : (byte) 195;
                break;
            case 2656:
                b10 = !str.equals("SS") ? (byte) -1 : (byte) 196;
                break;
            case 2657:
                b10 = !str.equals("ST") ? (byte) -1 : (byte) 197;
                break;
            case 2659:
                b10 = !str.equals("SV") ? (byte) -1 : (byte) 198;
                break;
            case 2661:
                b10 = !str.equals("SX") ? (byte) -1 : (byte) 199;
                break;
            case 2662:
                b10 = !str.equals("SY") ? (byte) -1 : (byte) 200;
                break;
            case 2663:
                b10 = !str.equals("SZ") ? (byte) -1 : (byte) 201;
                break;
            case 2671:
                b10 = !str.equals("TC") ? (byte) -1 : (byte) 202;
                break;
            case 2672:
                b10 = !str.equals("TD") ? (byte) -1 : (byte) 203;
                break;
            case 2675:
                b10 = !str.equals("TG") ? (byte) -1 : (byte) 204;
                break;
            case 2676:
                b10 = !str.equals("TH") ? (byte) -1 : (byte) 205;
                break;
            case 2678:
                b10 = !str.equals("TJ") ? (byte) -1 : (byte) 206;
                break;
            case 2679:
                b10 = !str.equals("TK") ? (byte) -1 : (byte) 207;
                break;
            case 2680:
                b10 = !str.equals("TL") ? (byte) -1 : (byte) 208;
                break;
            case 2681:
                b10 = !str.equals("TM") ? (byte) -1 : (byte) 209;
                break;
            case 2682:
                b10 = !str.equals("TN") ? (byte) -1 : (byte) 210;
                break;
            case 2683:
                b10 = !str.equals("TO") ? (byte) -1 : (byte) 211;
                break;
            case 2686:
                b10 = !str.equals("TR") ? (byte) -1 : (byte) 212;
                break;
            case 2688:
                b10 = !str.equals("TT") ? (byte) -1 : (byte) 213;
                break;
            case 2690:
                b10 = !str.equals("TV") ? (byte) -1 : (byte) 214;
                break;
            case 2691:
                b10 = !str.equals("TW") ? (byte) -1 : (byte) 215;
                break;
            case 2694:
                b10 = !str.equals("TZ") ? (byte) -1 : (byte) 216;
                break;
            case 2700:
                b10 = !str.equals("UA") ? (byte) -1 : (byte) 217;
                break;
            case 2706:
                b10 = !str.equals("UG") ? (byte) -1 : (byte) 218;
                break;
            case 2718:
                b10 = !str.equals("US") ? (byte) -1 : (byte) 219;
                break;
            case 2724:
                b10 = !str.equals("UY") ? (byte) -1 : (byte) 220;
                break;
            case 2725:
                b10 = !str.equals("UZ") ? (byte) -1 : (byte) 221;
                break;
            case 2731:
                b10 = !str.equals("VA") ? (byte) -1 : (byte) 222;
                break;
            case 2733:
                b10 = !str.equals("VC") ? (byte) -1 : (byte) 223;
                break;
            case 2735:
                b10 = !str.equals("VE") ? (byte) -1 : (byte) 224;
                break;
            case 2737:
                b10 = !str.equals("VG") ? (byte) -1 : (byte) 225;
                break;
            case 2739:
                b10 = !str.equals("VI") ? (byte) -1 : (byte) 226;
                break;
            case 2744:
                b10 = !str.equals("VN") ? (byte) -1 : (byte) 227;
                break;
            case 2751:
                b10 = !str.equals("VU") ? (byte) -1 : (byte) 228;
                break;
            case 2767:
                b10 = !str.equals("WF") ? (byte) -1 : (byte) 229;
                break;
            case 2780:
                b10 = !str.equals("WS") ? (byte) -1 : (byte) 230;
                break;
            case 2803:
                b10 = !str.equals("XK") ? (byte) -1 : (byte) 231;
                break;
            case 2828:
                b10 = !str.equals("YE") ? (byte) -1 : (byte) 232;
                break;
            case 2843:
                b10 = !str.equals("YT") ? (byte) -1 : (byte) 233;
                break;
            case 2855:
                b10 = !str.equals("ZA") ? (byte) -1 : (byte) 234;
                break;
            case 2867:
                b10 = !str.equals("ZM") ? (byte) -1 : (byte) 235;
                break;
            case 2877:
                b10 = !str.equals("ZW") ? (byte) -1 : (byte) 236;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 26:
            case 29:
            case 73:
            case 79:
            case 112:
            case 116:
            case 120:
            case STALE_CACHED_RESPONSE_VALUE:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 80:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
            case 108:
            case 210:
            case AD_RESPONSE_RETRY_AFTER_VALUE:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case 12:
                return new int[]{0, 1, 1, 1, 2, 0};
            case 13:
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 121:
            case 144:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 75:
            case 128:
            case 169:
            case 194:
            case LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case 56:
            case 69:
            case 78:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case 91:
            case 111:
            case 134:
            case 154:
            case 185:
            case 203:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case 50:
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{0, 1, 2, 3, 2, 2};
            case 34:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 2, 2, 3, 2};
            case 36:
                return new int[]{4, 2, 3, 2, 2, 2};
            case 37:
            case 110:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 61:
            case 87:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 40:
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 41:
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 42:
            case 95:
                return new int[]{1, 2, 2, 2, 3, 2};
            case 43:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 44:
                return new int[]{2, 0, 1, 1, 3, 2};
            case 45:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 46:
                return new int[]{2, 3, 4, 4, 2, 2};
            case 47:
            case 54:
            case 200:
            case 206:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 48:
                return new int[]{2, 1, 0, 0, 2, 2};
            case 51:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 2, 2, 2, 3};
            case 55:
                return new int[]{0, 0, 3, 2, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 60:
            case 101:
            case 127:
            case 174:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 63:
            case 94:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 64:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 3, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 67:
            case 107:
            case 113:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 68:
                return new int[]{4, 2, 4, 1, 2, 2};
            case 70:
                return new int[]{1, 2, 3, 1, 0, 2};
            case 71:
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 72:
                return new int[]{0, 0, 1, 1, 1, 1};
            case 74:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 76:
            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 77:
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 81:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 82:
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 83:
                return new int[]{4, 2, 1, 4, 2, 2};
            case 84:
            case 90:
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 85:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 86:
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 88:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 89:
                return new int[]{0, 1, 2, 3, 2, 0};
            case 92:
                return new int[]{0, 0, 0, 1, 3, 2};
            case 93:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 96:
            case AD_RESPONSE_TIMED_OUT_VALUE:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 97:
                return new int[]{1, 1, 3, 2, 3, 3};
            case 98:
            case 135:
            case INVALID_GZIP_BID_PAYLOAD_VALUE:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 100:
                return new int[]{3, 0, 1, 1, 4, 1};
            case 102:
                return new int[]{0, 0, 0, 1, 1, 2};
            case 103:
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 104:
                return new int[]{2, 4, 3, 2, 2, 2};
            case 105:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 106:
                return new int[]{0, 1, 1, 2, 2, 4};
            case 109:
                return new int[]{2, 1, 4, 2, 2, 2};
            case 114:
                return new int[]{0, 1, 1, 3, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 3, 2, 4, 2, 2};
            case 122:
                return new int[]{3, 1, 3, 3, 4, 2};
            case 124:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 125:
                return new int[]{0, 0, 0, 0, 2, 2};
            case 126:
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                return new int[]{2, 0, 0, 1, 2, 2};
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case TPAT_RETRY_FAILED_VALUE:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 140:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case TextFieldImplKt.AnimationDuration /* 150 */:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case 202:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 201:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 205:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                return new int[]{1, 4, 1, 3, 2, 2};
            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                return new int[]{3, 4, 3, 2, 2, 2};
            case MRAID_JS_COPY_FAILED_VALUE:
                return new int[]{1, 0, 2, 2, 3, 1};
            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                return new int[]{2, 2, 3, 4, 2, 2};
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 227:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long a(int i10) {
        Long l10 = (Long) this.f114916a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = (Long) this.f114916a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }
}
