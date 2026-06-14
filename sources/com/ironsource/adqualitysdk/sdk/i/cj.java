package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class cj extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1351 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1352 = -1920709221;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1353 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1354 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1355 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1356 = 7074;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1357 = 54853;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1358 = 63179;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1359 = 17986;

    public cj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AdInfo m5834(InterstitialAd interstitialAd) {
        int i10 = f1353 + 29;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        AdInfo adInfoM5844 = m5844(interstitialAd);
        if (i11 == 0) {
            int i12 = 74 / 0;
        }
        return adInfoM5844;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5841(AdInfo adInfo) {
        f1351 = (f1353 + 57) % 128;
        String strM5852 = m5852(adInfo);
        f1353 = (f1351 + 61) % 128;
        return strM5852;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m5845(Reward reward) {
        int i10 = f1353 + 101;
        f1351 = i10 % 128;
        if (i10 % 2 == 0) {
            m5837(reward);
            throw null;
        }
        String strM5837 = m5837(reward);
        f1351 = (f1353 + 13) % 128;
        return strM5837;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ MediaFile m5851(VideoAd videoAd) {
        int i10 = f1353 + 75;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        MediaFile mediaFileM5840 = m5840(videoAd);
        if (i11 == 0) {
            int i12 = 59 / 0;
        }
        int i13 = f1351 + 15;
        f1353 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 83 / 0;
        }
        return mediaFileM5840;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ int m5858(Reward reward) {
        int i10 = f1353 + 123;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        int iM5850 = m5850(reward);
        if (i11 == 0) {
            int i12 = 4 / 0;
        }
        f1353 = (f1351 + 63) % 128;
        return iM5850;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5836(ImpressionData impressionData) {
        f1351 = (f1353 + 53) % 128;
        String strM5853 = m5853(impressionData);
        f1351 = (f1353 + 57) % 128;
        return strM5853;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5842(MediaFile mediaFile) {
        f1351 = (f1353 + 123) % 128;
        String strM5854 = m5854(mediaFile);
        int i10 = f1351 + 13;
        f1353 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM5854;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5848(VideoController videoController, VideoEventListener videoEventListener) {
        int i10 = f1351 + 47;
        f1353 = i10 % 128;
        int i11 = i10 % 2;
        m5856(videoController, videoEventListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5852(AdInfo adInfo) {
        f1353 = (f1351 + 11) % 128;
        String adUnitId = adInfo.getAdUnitId();
        int i10 = f1353 + 31;
        f1351 = i10 % 128;
        if (i10 % 2 != 0) {
            return adUnitId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdInfo m5859(RewardedAd rewardedAd) {
        int i10 = f1353 + 41;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        AdInfo adInfoM5835 = m5835(rewardedAd);
        if (i11 == 0) {
            int i12 = 39 / 0;
        }
        return adInfoM5835;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5843(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1353 + 113;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        m5857(rewardedAd, rewardedAdEventListener);
        if (i11 == 0) {
            throw null;
        }
        f1353 = (f1351 + 5) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5849(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1351 + 37;
        f1353 = i10 % 128;
        int i11 = i10 % 2;
        m5839(interstitialAd, interstitialAdEventListener);
        if (i11 != 0) {
            int i12 = 22 / 0;
        }
        f1351 = (f1353 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5853(ImpressionData impressionData) {
        f1351 = (f1353 + 91) % 128;
        String rawData = impressionData.getRawData();
        int i10 = f1351 + 93;
        f1353 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 85 / 0;
        }
        return rawData;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5860(VideoAd videoAd) {
        int i10 = f1351 + 33;
        f1353 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5846(videoAd);
        }
        m5846(videoAd);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5847("û\uf420ሩ\uf750녢\ue12d븼\uf17f㭜㍴捴谛", 11 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5841((AdInfo) list.get(0));
            }
        });
        map.put(m5855("둞뫥緊蘏黡\ue083妱话ᅌ㯦", (char) TextUtils.getCapsMode("", 0, 0), "\u0000\u0000\u0000\u0000", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "䶴↢㘝\uf047").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5836((ImpressionData) list.get(0));
            }
        });
        map.put(m5847("\ufbce┸ⱌ쟆㻺럁ﮮ阮氩✎\u209f\uf294揾\uecde\uf0df\ua87a凷⾡꺱溎괧銠", 21 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                VideoController videoController = (VideoController) list.get(0);
                androidx.privacysandbox.ads.adservices.topics.a.a(list.get(1));
                cj.m5848(videoController, (VideoEventListener) null);
                return null;
            }
        });
        map.put(m5855("䝮ၿ擪⯼\uea80\udb2f⅚组욂荭\u2e6a贋\ue75c쪽\udb35\ue206ﮤ\ue1e1\uf3ac亢", (char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetBefore("", 0), "웥\ue32e砠陟").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5834((InterstitialAd) list.get(0));
            }
        });
        map.put(m5855("鱸팾\uf057ﮑᱨ\uf48c䃠헏켪\uedeb볣瞵龲湦솳", (char) (52744 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", (-1368179779) - Gravity.getAbsoluteGravity(0, 0), "뷫猻ޮ췎").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Integer.valueOf(cj.m5858((Reward) list.get(0)));
            }
        });
        map.put(m5855("ニॢ㡰㨓呐䷂롻\u0e67缎姾뷶洅\uf7c2", (char) (40636 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0) + 324816441, "㦝屎밓㮞").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5845((Reward) list.get(0));
            }
        });
        map.put(m5855("提ኑ≫ˢ絙쬝ⴿʱ숭꿡\ua635ⳃꎎﷂ枉青梴", (char) (19273 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2105121537, "Ǔ禛䥽왋").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5859((RewardedAd) list.get(0));
            }
        });
        map.put(m5855("卙險ᅍ\udc8dꌗ栁ᭇ\u31ea㻔籔햽⮼\uee7f蕀ؓ\ue35d▞툛剕㣙⒊冗樊\ue2c6\uf4ba㜏", (char) (52911 - Color.argb(0, 0, 0, 0)), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString(""), "\u0ffeĈ꿪\u1cce").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                cj.m5843((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m5847("\ufbce┸㭜㍴᭫穾\uf6a9휙ꐊ\ueb1b盦떝荜\ue603̭\u1bf9⊥\ue5fc饇Ƴ᭫穾权豕ꐊ\ueb1b\u209f\uf294\uf6a9휙", Color.argb(0, 0, 0, 0) + 30).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                cj.m5849((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m5855("Η콚ꖹﵝ朘瞧폇文巉돾蔛绥를揔僥", (char) (475 - (Process.myPid() >> 22)), "\u0000\u0000\u0000\u0000", (-1061888820) - TextUtils.lastIndexOf("", '0', 0, 0), "쵉드\udbc0\uf701").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5842((MediaFile) list.get(0));
            }
        });
        map.put(m5847("û\uf420ⱌ쟆㻺럁ﮮ阮軜ླ铍㚨嶶\uf2fa奾攳\u0a0e꧘徵⅐", KeyEvent.normalizeMetaState(0) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5851((VideoAd) list.get(0));
            }
        });
        map.put(m5847("û\uf420ⱌ쟆㻺럁ﮮ阮軜ླ\ue2b0\u0e80쵐钖", ExpandableListView.getPackedPositionChild(0L) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cj.m5860((VideoAd) list.get(0));
            }
        });
        map.put(m5847("\ufbce┸쥙꩗\udd94緿꺱溎쮣ḕ⊥\ue5fc饇Ƴ᭫穾权豕ꐊ\ueb1b\u209f\uf294\uf6a9휙", (ViewConfiguration.getJumpTapTimeout() >> 16) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                cj.m5861((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f1353 + 79;
        f1351 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 72 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdInfo m5844(InterstitialAd interstitialAd) {
        int i10 = f1351 + 17;
        f1353 = i10 % 128;
        if (i10 % 2 != 0) {
            interstitialAd.getInfo();
            throw null;
        }
        AdInfo info = interstitialAd.getInfo();
        f1351 = (f1353 + 61) % 128;
        return info;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5856(VideoController videoController, VideoEventListener videoEventListener) {
        f1353 = (f1351 + 43) % 128;
        videoController.setVideoEventListener(videoEventListener);
        int i10 = f1353 + 79;
        f1351 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 96 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5861(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i10 = f1353 + 71;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        m5838(bannerAdView, bannerAdEventListener);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        String libraryVersion;
        int i10 = f1353 + 77;
        f1351 = i10 % 128;
        if (i10 % 2 == 0) {
            libraryVersion = MobileAds.getLibraryVersion();
            int i11 = 67 / 0;
        } else {
            libraryVersion = MobileAds.getLibraryVersion();
        }
        int i12 = f1351 + 35;
        f1353 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 85 / 0;
        }
        return libraryVersion;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static MediaFile m5840(VideoAd videoAd) {
        f1351 = (f1353 + 47) % 128;
        MediaFile mediaFile = videoAd.getMediaFile();
        int i10 = f1351 + 69;
        f1353 = i10 % 128;
        if (i10 % 2 == 0) {
            return mediaFile;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5846(VideoAd videoAd) {
        int i10 = f1351 + 41;
        f1353 = i10 % 128;
        int i11 = i10 % 2;
        String info = videoAd.getInfo();
        if (i11 != 0) {
            int i12 = 9 / 0;
        }
        f1351 = (f1353 + 47) % 128;
        return info;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m5850(Reward reward) {
        f1353 = (f1351 + 23) % 128;
        int amount = reward.getAmount();
        f1353 = (f1351 + 101) % 128;
        return amount;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f0  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cj.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5847(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1357)) ^ ((c11 >>> 5) + f1358)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1359) ^ ((c12 + i12) ^ ((c12 << 4) + f1356))));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5857(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1353 + 81;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (i11 == 0) {
            int i12 = 52 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5854(MediaFile mediaFile) {
        f1353 = (f1351 + 3) % 128;
        String url = mediaFile.getUrl();
        f1351 = (f1353 + 101) % 128;
        return url;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5855(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1355) ^ ((long) f1352)) ^ ((long) f1354));
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5837(Reward reward) {
        f1353 = (f1351 + 15) % 128;
        String type = reward.getType();
        int i10 = f1351 + 93;
        f1353 = i10 % 128;
        if (i10 % 2 == 0) {
            return type;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AdInfo m5835(RewardedAd rewardedAd) {
        int i10 = f1353 + 41;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        AdInfo info = rewardedAd.getInfo();
        if (i11 == 0) {
            int i12 = 72 / 0;
        }
        f1353 = (f1351 + 33) % 128;
        return info;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5839(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        f1353 = (f1351 + 47) % 128;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        int i10 = f1351 + 85;
        f1353 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5838(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i10 = f1351 + 15;
        f1353 = i10 % 128;
        int i11 = i10 % 2;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        if (i11 != 0) {
            throw null;
        }
    }
}
