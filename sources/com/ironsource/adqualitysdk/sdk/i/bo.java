package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bo extends bd {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f967 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f970;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f971 = {1822570755, 561632285, -736641796, 1725186181, -1046851615, 181372043, 76972103, -1511596420, 857250591, 205748874, 1401158660, 1879072045, 744993969, -1676703876, -2009151104, -268656751, 328320185, -287828179};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f972 = -3305206215475391646L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f969 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f968 = 0;

    public bo(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Enum m5306(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bo.m5306(java.lang.String):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Enum m5307(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1097819034(0xffffffffbe909c66, float:-0.28244323)
            r2 = 1
            if (r0 == r1) goto L38
            r1 = 1554700484(0x5caad8c4, float:3.8471266E17)
            if (r0 == r1) goto L10
            goto L60
        L10:
            r0 = 12
            int[] r0 = new int[r0]
            r0 = {x006e: FILL_ARRAY_DATA , data: [1102338735, 534718331, -204734387, 1529807113, 832435028, 459668408, -379821116, 155711183, -681195772, -1914989498, -1576867718, -323308626} // fill-array
            float r1 = android.media.AudioTrack.getMaxVolume()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            int r1 = 22 - r1
            java.lang.String r0 = m5326(r0, r1)
            java.lang.String r0 = r0.intern()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L60
            int r4 = com.ironsource.adqualitysdk.sdk.i.bo.f970
            int r4 = r4 + 71
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.bo.f967 = r4
            r4 = 0
            goto L61
        L38:
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x008a: FILL_ARRAY_DATA , data: [1102338735, 534718331, -204734387, 1529807113, 832435028, 459668408, -2097949543, -1843881562, 1918117154, -1962707943, 31598433, -1919389046, -1438694206, 1262262860} // fill-array
            int r1 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r1 = r1 >> 16
            int r1 = r1 + 25
            java.lang.String r0 = m5326(r0, r1)
            java.lang.String r0 = r0.intern()
            boolean r4 = r4.equals(r0)
            r4 = r4 ^ r2
            if (r4 == r2) goto L60
            int r4 = com.ironsource.adqualitysdk.sdk.i.bo.f967
            int r4 = r4 + 75
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.bo.f970 = r4
            r4 = r2
            goto L61
        L60:
            r4 = -1
        L61:
            if (r4 == 0) goto L6a
            if (r4 == r2) goto L67
            r4 = 0
            return r4
        L67:
            com.inmobi.ads.AdContainer$RenderingProperties$PlacementType r4 = com.inmobi.ads.AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN
            return r4
        L6a:
            com.inmobi.ads.AdContainer$RenderingProperties$PlacementType r4 = com.inmobi.ads.AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bo.m5307(java.lang.String):java.lang.Enum");
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ Enum m5309(String str) {
        f967 = (f970 + 37) % 128;
        Enum enumM5310 = m5310(str);
        int i10 = f967 + 123;
        f970 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 23 / 0;
        }
        return enumM5310;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Enum m5310(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bo.m5310(java.lang.String):java.lang.Enum");
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ Enum m5312(String str) {
        f967 = (f970 + 63) % 128;
        Enum enumM5306 = m5306(str);
        int i10 = f970 + 35;
        f967 = i10 % 128;
        if (i10 % 2 != 0) {
            return enumM5306;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m5314(AdContainer adContainer) {
        f967 = (f970 + 41) % 128;
        Object objM5327 = m5327(adContainer);
        f967 = (f970 + 39) % 128;
        return objM5327;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Enum m5318(String str) {
        int i10 = f967 + 63;
        f970 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM5307 = m5307(str);
        if (i11 != 0) {
            int i12 = 32 / 0;
        }
        int i13 = f967 + 89;
        f970 = i13 % 128;
        if (i13 % 2 == 0) {
            return enumM5307;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m5322(Ad ad2) {
        int i10 = f967 + 89;
        f970 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5308 = m5308(ad2);
        if (i11 != 0) {
            int i12 = 1 / 0;
        }
        return objM5308;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Object m5328(Ad ad2) {
        int i10 = f970 + 113;
        f967 = i10 % 128;
        if (i10 % 2 == 0) {
            m5313(ad2);
            throw null;
        }
        Object objM5313 = m5313(ad2);
        f967 = (f970 + 81) % 128;
        return objM5313;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Object m5331(Ad ad2) {
        f970 = (f967 + 11) % 128;
        Object objM5311 = m5311(ad2);
        int i10 = f970 + 13;
        f967 = i10 % 128;
        if (i10 % 2 != 0) {
            return objM5311;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Object m5313(Ad ad2) {
        int i10 = f967 + 17;
        f970 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> rewards = ad2.getRewards();
        if (i11 != 0) {
            int i12 = 55 / 0;
        }
        int i13 = f967 + 23;
        f970 = i13 % 128;
        if (i13 % 2 == 0) {
            return rewards;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m5315(Ad ad2) {
        f967 = (f970 + 109) % 128;
        Object objM5319 = m5319(ad2);
        f970 = (f967 + 9) % 128;
        return objM5319;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Object m5320(AdResponse adResponse) {
        f967 = (f970 + 11) % 128;
        Object objM5332 = m5332(adResponse);
        f967 = (f970 + 121) % 128;
        return objM5332;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m5323(AdResponse adResponse) {
        f967 = (f970 + 103) % 128;
        Object objM5316 = m5316(adResponse);
        f970 = (f967 + 55) % 128;
        return objM5316;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Object m5329(AdSet adSet) {
        int i10 = f970 + 25;
        f967 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5333 = m5333(adSet);
        if (i11 == 0) {
            int i12 = 28 / 0;
        }
        int i13 = f967 + 85;
        f970 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 75 / 0;
        }
        return objM5333;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    final Class mo5026(String str) {
        byte b10 = Ascii.DC4;
        switch (str.hashCode()) {
            case -2044438337:
                b10 = !str.equals(m5326(new int[]{-1786748720, 807098415, -1352246521, -1387034022, -2024977339, 427678882, -2096849941, 1835288195, 1803609308, 56349780}, KeyEvent.normalizeMetaState(0) + 19).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1769689844:
                b10 = !str.equals(m5325("녹髀솤걃舥ࠋ吠쭟㗴", (char) (ViewConfiguration.getTouchSlop() >> 8), "።焭豵툡", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1891324512, "ꃍ䒭沏ꋚ").intern()) ? (byte) -1 : (byte) 12;
                break;
            case -1716191362:
                b10 = !str.equals(m5326(new int[]{-1295128624, 1749390598, -565503693, 933537317, -384467301, -441595460}, 11 - Color.alpha(0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1405271692:
                b10 = !str.equals(m5326(new int[]{-160109757, 1678485829, 1891531547, -1404799110, 774574488, -1099663893, -1783428777, -1061629040, -53968931, -1511193751, 1685511199, -1426698889, -527445304, 810608813}, 25 - TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -1401317165:
                if (!str.equals(m5326(new int[]{1625591982, 790574268, 1229723793, 538367032, -1596659400, -275655705, -1795803087, -1725255519, -1536317707, -520054232}, Drawable.resolveOpacity(0, 0) + 18).intern())) {
                    b10 = -1;
                }
                break;
            case -1304544044:
                if (!str.equals(m5326(new int[]{-160109757, 1678485829, 74430204, -823607588, 1106577095, 1968763317, -1694827317, 1131959163, -2003933270, 2099061385, -527445304, 810608813}, 21 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    b10 = -1;
                } else {
                    f967 = (f970 + 51) % 128;
                    b10 = 19;
                }
                break;
            case -1062227179:
                b10 = !str.equals(m5326(new int[]{1395736492, 806319114, -1704104017, 1306750858, 610689984, 389459681, -499830729, 142612693, -1009688833, 735439708, 1344011723, -1321062947, 1552852785, -380523406, 1937455649, -1691495417, -343241360, -810816929, 1164655465, 32246573}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -808014786:
                b10 = !str.equals(m5326(new int[]{1679819910, -1822711051, -1956838522, -1536714687, -1045880468, -274648833, 2046077880, 891138012}, 15 - KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -595852006:
                if (!str.equals(m5325("ᄨ鸂衿䒐ভ\uebe1왞똒\u1942홆ɜ罯", (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "።焭豵툡", View.resolveSizeAndState(0, 0, 0), "堡皒쉆\uf51f").intern())) {
                    b10 = -1;
                } else {
                    f970 = (f967 + 1) % 128;
                    b10 = 10;
                }
                break;
            case -560158238:
                b10 = !str.equals(m5326(new int[]{1679819910, -1822711051, -1956838522, -1536714687, -2084779692, 296521876, 989865647, -106285601, 2041232453, -1412510477}, 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -541364416:
                b10 = !str.equals(m5326(new int[]{1679819910, -1822711051, -1956838522, -1536714687, -2084779692, 296521876, 989865647, -106285601}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -520974940:
                b10 = !str.equals(m5325("떫ఒ틟倦籩䁚螘쀄ᐖ\uefbe", (char) (AndroidCharacter.getMirror('0') - '0'), "።焭豵툡", (-1) - TextUtils.lastIndexOf("", '0', 0), "뜑\ued76\ue411ጮ").intern()) ? (byte) -1 : (byte) 21;
                break;
            case -235933147:
                b10 = !str.equals(m5325("熋菝桒༉蟸썴콋憿⺝뵹ꢞበ", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "።焭豵툡", MotionEvent.axisFromString("") + 1, "ၜ彘⻍å").intern()) ? (byte) -1 : (byte) 5;
                break;
            case -204096109:
                b10 = !str.equals(m5325("팊ᴚ胿滹㔑ퟗ⭾\uf8c1뵃먫\ud96b洛틡퍟ɍ疌嚣萕鯂舾棗ꏈꗁ옱觥瘯\u0d84\ue058\uf11a盥趷쒼嚷걄ቶ䙮精䥜쯂\ufddaꚶ", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 52927), "።焭豵툡", 1765806307 - KeyEvent.getDeadChar(0, 0), "\ue367䀐뽩\ue2ce").intern()) ? (byte) -1 : (byte) 3;
                break;
            case -93733047:
                b10 = !str.equals(m5326(new int[]{-160109757, 1678485829, 1219457554, 742174074, -1956193768, -1456532265, -703862154, -1309406059}, 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -32161126:
                if (!str.equals(m5326(new int[]{1679819910, -1822711051, 199368289, -897148001, 1559599823, -446707451, -1091234682, 1030119999, -1071859616, 1633925628}, (ViewConfiguration.getPressedStateDuration() >> 16) + 18).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f967 + 93;
                    f970 = i10 % 128;
                    b10 = i10 % 2 == 0 ? (byte) 11 : (byte) 99;
                }
                break;
            case 2115:
                b10 = !str.equals(m5326(new int[]{178824927, 1043384514}, 2 - View.MeasureSpec.getSize(0)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 63090975:
                b10 = !str.equals(m5325("诵\uf571\uf47d\udcfaᕺ", (char) (AndroidCharacter.getMirror('0') + 54013), "።焭豵툡", Color.rgb(0, 0, 0) + 1220231810, "艬뭂ⵇ㟓").intern()) ? (byte) -1 : Ascii.SYN;
                break;
            case 99044255:
                b10 = !str.equals(m5325("藜\ue1bf腎㟠崙鉕쒧\uf24d᱿킗⅌\ue3c7ྩ", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 56496), "።焭豵툡", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1146599264, "ꇐꡈ낻隆").intern()) ? (byte) -1 : (byte) 8;
                break;
            case 515339810:
                if (!str.equals(m5325("䘅Ḃ揩⢀࠙䝭ሩ\ue9d3妸䝺", (char) KeyEvent.keyCodeFromString(""), "።焭豵툡", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\uf199楦䃍\udd01").intern())) {
                    b10 = -1;
                } else {
                    int i11 = f967 + 65;
                    f970 = i11 % 128;
                    b10 = i11 % 2 != 0 ? (char) 6 : (char) 14;
                }
                break;
            case 957243679:
                b10 = !str.equals(m5326(new int[]{590749542, 1229453111, 1310982333, 359688277, 1106577095, 1968763317, -1694827317, 1131959163, -2003933270, 2099061385, -527445304, 810608813}, 20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1228411167:
                if (!str.equals(m5325("첅æ啚\uec60纏쓽㑃描갠ࣈ軓ঃ䤱좙碴\uf728۟쳹壉\uef42냬찫뎪\ue791䜯⹜㝒", (char) (31630 - TextUtils.indexOf("", "", 0, 0)), "።焭豵툡", (ViewConfiguration.getLongPressTimeout() >> 16) - 75521629, "ꎻ羡軻荻").intern())) {
                    b10 = -1;
                } else {
                    f970 = (f967 + 11) % 128;
                    b10 = 17;
                }
                break;
            case 1564529113:
                b10 = !str.equals(m5326(new int[]{1213012618, -914215525, -27702953, -912641649, 583682277, 1645402073}, 11 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : Ascii.CAN;
                break;
            case 1955888231:
                b10 = !str.equals(m5326(new int[]{-551019317, 566155660, 967163827, -534714254}, (ViewConfiguration.getTapTimeout() >> 16) + 6).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 2035398868:
                b10 = !str.equals(m5325("\uf1fbꉻソ眃缇鯲沀뽥곴", (char) View.getDefaultSize(0, 0), "።焭豵툡", (-2105295333) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u1bf4莾皂喭").intern()) ? (byte) -1 : (byte) 9;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case 8:
                return AdContainer.RenderingProperties.PlacementType.class;
            case 9:
                return AdContainer.EventType.class;
            case 10:
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case 12:
                return InMobiSdk.class;
            case 13:
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m5317(ContextData contextData) {
        int i10 = f970 + 115;
        f967 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5330(contextData);
        }
        m5330(contextData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Object m5321(AdSet adSet) {
        f967 = (f970 + 33) % 128;
        Object objM5324 = m5324(adSet);
        f967 = (f970 + 123) % 128;
        return objM5324;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m5324(AdSet adSet) {
        int i10 = f970 + 111;
        f967 = i10 % 128;
        int i11 = i10 % 2;
        Boolean boolValueOf = Boolean.valueOf(adSet.getIsRewarded());
        if (i11 == 0) {
            int i12 = 61 / 0;
        }
        return boolValueOf;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m5327(AdContainer adContainer) {
        f967 = (f970 + 81) % 128;
        Object dataModel = adContainer.getDataModel();
        f970 = (f967 + 85) % 128;
        return dataModel;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5326(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f971.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m5330(ContextData contextData) {
        int i10 = f967 + 43;
        f970 = i10 % 128;
        if (i10 % 2 != 0) {
            contextData.getAdvertisedContent();
            throw null;
        }
        String advertisedContent = contextData.getAdvertisedContent();
        int i11 = f967 + 19;
        f970 = i11 % 128;
        if (i11 % 2 == 0) {
            return advertisedContent;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5325("\udb3c홵룾່Ꮇ㕻薷ꄊ趴켊㚂ૠ开\u1f58篔䕇㻘\uf0a2䮹\udc79", (char) ((Process.getThreadPriority(0) + 20) >> 6), "።焭豵툡", ViewConfiguration.getEdgeSlop() >> 16, "䱞ꪏ峹肦").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5318((String) list.get(0));
            }
        });
        map.put(m5326(new int[]{-1725793521, -730295222, 1516941440, -713607251, 789143033, 1596857308, 1725840726, 1318708095, -480786985, -2072795879}, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5312((String) list.get(0));
            }
        });
        map.put(m5326(new int[]{1528012993, -984151626, -235226750, -1619835214, 646132679, -1699319494}, (-16777204) - Color.rgb(0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5314((AdContainer) list.get(0));
            }
        });
        map.put(m5325("삃蕿향凝啌滶䗥\ud8d1彄솰쟁\uf88b릆Ꮻ䪥\ue13b\ud9e1", (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22973), "።焭豵툡", (-2142027376) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "輾十부彙").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5309((String) list.get(0));
            }
        });
        map.put(m5325("廹䫆\uf4e6ୠ纼廙毮⻌\ued62䝲ꜝ餍夂㺟", (char) (10641 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "።焭豵툡", ImageFormat.getBitsPerPixel(0) + 1, "ₔ奙酢䄩").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5320((AdResponse) list.get(0));
            }
        });
        map.put(m5325("逡\ue9ecꔠ룙次ᛔ⽊豀ꄂ", (char) Color.red(0), "።焭豵툡", TextUtils.indexOf("", "") - 233891051, "ᕬ༛鱗춝").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5323((AdResponse) list.get(0));
            }
        });
        map.put(m5326(new int[]{-597077963, -1031637315, 919882452, -1324736608, 1721267046, -1545526047}, View.MeasureSpec.getMode(0) + 10).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5321((AdSet) list.get(0));
            }
        });
        map.put(m5326(new int[]{-1725793521, -730295222, -1912473807, -354177865}, (ViewConfiguration.getPressedStateDuration() >> 16) + 6).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5329((AdSet) list.get(0));
            }
        });
        map.put(m5325("ﮦ⮅呔턃プ뿟腫⟢曧ⶈ裐\ueb9c\uedd8ƻ", (char) (56609 - TextUtils.lastIndexOf("", '0')), "።焭豵툡", ExpandableListView.getPackedPositionType(0L), "ᴱ篘∝嗝").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5315((Ad) list.get(0));
            }
        });
        map.put(m5325("\ue51f⺫ቭ\udc1aⱑꊁ̀튟Ȫ鐖", (char) View.getDefaultSize(0, 0), "።焭豵툡", TextUtils.getOffsetBefore("", 0), "㐫쬑塪̼").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5328((Ad) list.get(0));
            }
        });
        map.put(m5326(new int[]{1752849683, 1688297142, 1224009197, -2053678699, 688876440, 1077574284}, 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5322((Ad) list.get(0));
            }
        });
        map.put(m5326(new int[]{1860770838, -478187289, -1596450849, 37691170, 794507622, 1934799711, 203279309, -367153691}, Color.blue(0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5331((Ad) list.get(0));
            }
        });
        map.put(m5325("뒖砼㥼⍷Ϩ㌶칆\udc34\uf290팽ᅽ쇧⿒\ueb95詰ⴧ䅟\ue393\ue5c1\uf065", (char) (KeyEvent.getMaxKeyCode() >> 16), "።焭豵툡", View.MeasureSpec.makeMeasureSpec(0, 0), "\ueac3⻔験\uf2e1").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bo.m5317((ContextData) list.get(0));
            }
        });
        int i10 = f970 + 75;
        f967 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        int i10 = f970 + 21;
        f967 = i10 % 128;
        if (i10 % 2 != 0) {
            return InMobiSdk.getVersion();
        }
        InMobiSdk.getVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m5319(Ad ad2) {
        int i10 = f967 + 79;
        f970 = i10 % 128;
        if (i10 % 2 != 0) {
            ad2.getContextData();
            throw null;
        }
        ContextData contextData = ad2.getContextData();
        int i11 = f970 + 111;
        f967 = i11 % 128;
        if (i11 % 2 != 0) {
            return contextData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Object m5308(Ad ad2) {
        f970 = (f967 + 25) % 128;
        String webVast = ad2.getWebVast();
        int i10 = f970 + 71;
        f967 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 50 / 0;
        }
        return webVast;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Object m5311(Ad ad2) {
        f967 = (f970 + 113) % 128;
        String creativeId = ad2.getCreativeId();
        f967 = (f970 + 107) % 128;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Object m5316(AdResponse adResponse) {
        f970 = (f967 + 107) % 128;
        List<AdSet> adSets = adResponse.getAdSets();
        int i10 = f970 + 27;
        f967 = i10 % 128;
        if (i10 % 2 != 0) {
            return adSets;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m5332(AdResponse adResponse) {
        int i10 = f970 + 91;
        f967 = i10 % 128;
        if (i10 % 2 == 0) {
            adResponse.getPlacementId();
            throw null;
        }
        Long lValueOf = Long.valueOf(adResponse.getPlacementId());
        int i11 = f967 + 31;
        f970 = i11 % 128;
        if (i11 % 2 == 0) {
            return lValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m5333(AdSet adSet) {
        int i10 = f967 + 21;
        f970 = i10 % 128;
        if (i10 % 2 == 0) {
            return adSet.getAds();
        }
        adSet.getAds();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5325(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2697) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2699 = 0;
                while (true) {
                    int i11 = j.f2699;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2698 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2699;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f972) ^ ((long) f969)) ^ ((long) f968));
                        j.f2699 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
