package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class bn extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f943 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f944 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f945 = 39776;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f946 = 50265;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f947 = -7618697074672581355L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f948 = 13662;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f949 = 30504;

    class b extends WeakHashMap<View, WeakReference<Object>> implements hg<WeakHashMap<View, WeakReference<Object>>> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f959 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f960 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f961 = 24654;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f962 = 58341;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f963 = 36148;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f964 = 22631;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ch f965;

        public b(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
            super(weakHashMap);
            this.f965 = chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m5303() {
            f959 = (f960 + 21) % 128;
            return this;
        }

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            f959 = (f960 + 31) % 128;
            WeakReference<Object> weakReferenceM5305 = m5305((View) obj, (WeakReference<Object>) obj2);
            int i10 = f959 + 19;
            f960 = i10 % 128;
            if (i10 % 2 == 0) {
                return weakReferenceM5305;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo5030() {
            WeakHashMap<View, WeakReference<Object>> weakHashMapM5303;
            int i10 = f959 + 109;
            f960 = i10 % 128;
            if (i10 % 2 != 0) {
                weakHashMapM5303 = m5303();
                int i11 = 72 / 0;
            } else {
                weakHashMapM5303 = m5303();
            }
            f959 = (f960 + 49) % 128;
            return weakHashMapM5303;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Object> m5305(View view, WeakReference<Object> weakReference) {
            f960 = (f959 + 13) % 128;
            bn.this.m5106(this, this.f965, m5304("螔㠡㵼碗\uef04懒\uf58a뜜魮ꈹ\ueb96寀괬\ue4c1⇌됈ﻰଲᾢ㻵켅檫렋嶂", ExpandableListView.getPackedPositionChild(0L) + 24).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            f959 = (f960 + 105) % 128;
            return weakReference2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5304(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (n.f3016) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    n.f3015 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = n.f3015;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f962)) ^ ((c11 >>> 5) + f961)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f963) ^ ((c12 + i12) ^ ((c12 << 4) + f964))));
                                i12 -= 40503;
                            }
                            int i14 = n.f3015;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            n.f3015 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public bn(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m5283() {
        int i10 = f944 + 43;
        f943 = i10 % 128;
        String strIntern = m5297("ᐚ㕨ކ톳◫㱕讘쌁疼晦薼왯ꢰ潌蹟㕩㝱䲌訔䘱靭ⷜ⻋⢕\uef13㩙ꢰ潌\udbd0ල钩\udade\u09c5ⴑ", i10 % 2 != 0 ? 7 << TextUtils.indexOf((CharSequence) "", '\'', 1, 1) : 33 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
        f944 = (f943 + 69) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m5284() {
        int i10 = f944 + 1;
        f943 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m5297("懖ᄭ쓭ࢲ恠侊屟䢮", 38 - TextUtils.indexOf((CharSequence) "", (char) 7, 1)) : m5297("懖ᄭ쓭ࢲ恠侊屟䢮", 7 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern();
        int i11 = f944 + 117;
        f943 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 83 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static DynamicLoader m5285() {
        int i10 = f943 + 107;
        f944 = i10 % 128;
        if (i10 % 2 == 0) {
            DynamicLoaderFactory.getDynamicLoader();
            throw null;
        }
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        f944 = (f943 + 111) % 128;
        return dynamicLoader;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ DynamicLoader m5286() {
        f943 = (f944 + 115) % 128;
        DynamicLoader dynamicLoaderM5285 = m5285();
        f943 = (f944 + 37) % 128;
        return dynamicLoaderM5285;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ String m5287() {
        f944 = (f943 + 117) % 128;
        String strM5283 = m5283();
        int i10 = f943 + 55;
        f944 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 33 / 0;
        }
        return strM5283;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ String m5288() {
        f944 = (f943 + 113) % 128;
        String strM5284 = m5284();
        int i10 = f943 + 91;
        f944 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 41 / 0;
        }
        return strM5284;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5289(AdView adView) {
        f944 = (f943 + 47) % 128;
        String strM5302 = m5302(adView);
        int i10 = f944 + 123;
        f943 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM5302;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5293(AdView adView, AdListener adListener) {
        int i10 = f944 + 115;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        m5299(adView, adListener);
        if (i11 != 0) {
            int i12 = 75 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ AdPlacementType m5295(AdAdapter adAdapter) {
        f944 = (f943 + 23) % 128;
        AdPlacementType adPlacementTypeM5291 = m5291(adAdapter);
        f943 = (f944 + 103) % 128;
        return adPlacementTypeM5291;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ WeakHashMap m5298(bn bnVar, WeakHashMap weakHashMap, ch chVar) {
        int i10 = f944 + 5;
        f943 = i10 % 128;
        if (i10 % 2 == 0) {
            return bnVar.m5290((WeakHashMap<View, WeakReference<Object>>) weakHashMap, chVar);
        }
        bnVar.m5290((WeakHashMap<View, WeakReference<Object>>) weakHashMap, chVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5301(Ad ad2) {
        int i10 = f943 + 79;
        f944 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5292(ad2);
        }
        m5292(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5294(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i10 = f943 + 29;
        f944 = i10 % 128;
        int i11 = i10 % 2;
        m5300(interstitialAd, interstitialAdListener);
        if (i11 == 0) {
            int i12 = 77 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5296(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f947, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f947));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5299(AdView adView, AdListener adListener) {
        int i10 = f944 + 109;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        adView.setAdListener(adListener);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f943 + 21;
        f944 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5296("뉔눳\ue5bdꃍ\uee29摷皎Ꙭ맡벵瀴娗骑补岕乲軡柈⥉떨\ue36b玵㔒養\ud7a6佭Ƃ赵", 1 - View.combineMeasuredStates(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bn.m5289((AdView) list.get(0));
            }
        });
        map.put(m5297("톅衫ཽ\uda82\ua7e0Րކ톳풚᧥꣒\ue110ꣁ뭦쿚鍽ᧂ⺖ÞᲫ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bn.m5301((Ad) list.get(0));
            }
        });
        map.put(m5297("㕷\ueb21豫鏤⦋㋭\ue4a4漢透䚂㙽\uf322됣\ueb2c", View.combineMeasuredStates(0, 0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bn.m5293((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m5296("鴳鵔ῥ媕❸괦\udbd9褒ᒧ䛨륯\uf751뗵爻闏\ue30eꆪ鶀\ue029ᣳ찑觫ﱃ㑋\uf8e3딵죀\u202d\ue4bfꂑ⌌巹ጚ쳳㽚䥕㿣\uf835௹攝⮾", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bn.m5288();
            }
        });
        map.put(m5296("獇猠蕝쀭\ue001機\ue787杦⣹\udc50縖쬏宁\ue883劶\udf50俞ܸ❐⒭≥ፓ㬺ࠕᚗ⾍ྐྵᱳો㨩\ue466憠ﵯ噿\uf816甀톃报첪奔엘礡ꅯ꺁롪镹", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bn.m5287();
            }
        });
        map.put(m5297("㕷\ueb21ᤨ䧬꣒\ue110嚊霽킢艨戞릎䃽ꩾÞᲫ辎啘킢艨ె馌嚊霽", KeyEvent.keyCodeFromString("") + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bn.m5294((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5296("湣渄॥䰕䍒줌䑰穎謋偢\udd4d棵䚢撻\uf1cc粃勾謐萑蝂", -ExpandableListView.getPackedPositionChild(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bn.m5286();
            }
        });
        map.put(m5296("蛬蚋\uea6a꼚\ue684泚飈鋔垧덢碙둑긩螲吸ꀴ멄栂⇒对", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bn.m5295((AdAdapter) list.get(0));
            }
        });
        map.put(m5296("즄짧⺳比\ue2b4棻ᘷ\udda4\ud969瞿粞㪸\ue162䍯倒⻧\uf50e곇◓픶颃뢳㦯轢걨葫ഉ\uede2뀱釟\ue6e6", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bn.m5298(bn.this, (WeakHashMap) list.get(0), chVar);
            }
        });
        int i10 = f944 + 65;
        f943 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02cd  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bn.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5300(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i10 = f943 + 115;
        f944 = i10 % 128;
        int i11 = i10 % 2;
        interstitialAd.setAdListener(interstitialAdListener);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f943 = (f944 + 79) % 128;
        try {
            try {
                try {
                    String str = (String) hu.m6637().m6640().m6588(AdSdkVersion.class, String.class).get(null);
                    f944 = (f943 + 107) % 128;
                    return str;
                } catch (Throwable unused) {
                    return hu.m6637().m6639().m6739(BuildConfig.class, m5296("\udc8f\udcd1珗㚞쟃䶍腘좇丼⫚妓귲\uf40cṄ画", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                }
            } catch (Throwable unused2) {
                return (String) hu.m6637().m6640().m6588(AdSdkVersion.class, String.class).get(null);
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5297(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f949)) ^ ((c11 >>> 5) + f946)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f945) ^ ((c12 + i12) ^ ((c12 << 4) + f948))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5292(Ad ad2) {
        int i10 = f944 + 99;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        String placementId = ad2.getPlacementId();
        if (i11 != 0) {
            int i12 = 48 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AdPlacementType m5291(AdAdapter adAdapter) {
        f944 = (f943 + 107) % 128;
        AdPlacementType placementType = adAdapter.getPlacementType();
        int i10 = f944 + 87;
        f943 = i10 % 128;
        if (i10 % 2 == 0) {
            return placementType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private WeakHashMap<View, WeakReference<Object>> m5290(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
        b bVar = new b(weakHashMap, chVar);
        int i10 = f943 + 109;
        f944 = i10 % 128;
        if (i10 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5302(AdView adView) {
        f944 = (f943 + 23) % 128;
        String placementId = adView.getPlacementId();
        f944 = (f943 + 53) % 128;
        return placementId;
    }
}
