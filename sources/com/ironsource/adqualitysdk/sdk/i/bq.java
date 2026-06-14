package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bq extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f999 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1000 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1001 = -8983181033830927815L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1002 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1003 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1004 = 1538894784;

    public bq(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ FiveAd m5353() {
        f999 = (f1002 + 37) % 128;
        FiveAd fiveAdM5355 = m5355();
        int i10 = f999 + 31;
        f1002 = i10 % 128;
        if (i10 % 2 == 0) {
            return fiveAdM5355;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m5356(FiveAdInterface fiveAdInterface) {
        f999 = (f1002 + 49) % 128;
        String slotId = fiveAdInterface.getSlotId();
        int i10 = f999 + 37;
        f1002 = i10 % 128;
        if (i10 % 2 == 0) {
            return slotId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m5357(FiveAdInterface fiveAdInterface) {
        int i10 = f1002 + 75;
        f999 = i10 % 128;
        if (i10 % 2 != 0) {
            return fiveAdInterface.getAdParameter();
        }
        fiveAdInterface.getAdParameter();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5358(FiveAdInterface fiveAdInterface) {
        f999 = (f1002 + 3) % 128;
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i10 = f999 + 23;
        f1002 = i10 % 128;
        if (i10 % 2 == 0) {
            return fiveAdTag;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static CreativeType m5359(FiveAdInterface fiveAdInterface) {
        int i10 = f1002 + 115;
        f999 = i10 % 128;
        if (i10 % 2 == 0) {
            fiveAdInterface.getCreativeType();
            throw null;
        }
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        f1002 = (f999 + 3) % 128;
        return creativeType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5361(FiveAdCustomLayout fiveAdCustomLayout) {
        f999 = (f1002 + 59) % 128;
        String strM5368 = m5368(fiveAdCustomLayout);
        f999 = (f1002 + 7) % 128;
        return strM5368;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ CreativeType m5364(FiveAdInterface fiveAdInterface) {
        f1002 = (f999 + 47) % 128;
        CreativeType creativeTypeM5359 = m5359(fiveAdInterface);
        int i10 = f1002 + 117;
        f999 = i10 % 128;
        if (i10 % 2 != 0) {
            return creativeTypeM5359;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ FiveAdListener m5367(FiveAdInterface fiveAdInterface) {
        int i10 = f1002 + 65;
        f999 = i10 % 128;
        if (i10 % 2 == 0) {
            m5354(fiveAdInterface);
            throw null;
        }
        FiveAdListener fiveAdListenerM5354 = m5354(fiveAdInterface);
        f999 = (f1002 + 85) % 128;
        return fiveAdListenerM5354;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5371(FiveAdInterface fiveAdInterface) {
        f999 = (f1002 + 67) % 128;
        String strM5356 = m5356(fiveAdInterface);
        int i10 = f1002 + 5;
        f999 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5356;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5373(FiveAdInterface fiveAdInterface) {
        f999 = (f1002 + 93) % 128;
        String strM5357 = m5357(fiveAdInterface);
        int i10 = f1002 + 7;
        f999 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5357;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static FiveAdListener m5354(FiveAdInterface fiveAdInterface) {
        f1002 = (f999 + 7) % 128;
        FiveAdListener listener = fiveAdInterface.getListener();
        f999 = (f1002 + 63) % 128;
        return listener;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static FiveAd m5355() {
        int i10 = f1002 + 99;
        f999 = i10 % 128;
        if (i10 % 2 != 0) {
            return FiveAd.getSingleton();
        }
        int i11 = 50 / 0;
        return FiveAd.getSingleton();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5362(FiveAdInterface fiveAdInterface) {
        f999 = (f1002 + 105) % 128;
        String strM5358 = m5358(fiveAdInterface);
        int i10 = f1002 + 45;
        f999 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 9 / 0;
        }
        return strM5358;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5365(FiveAdConfig fiveAdConfig) {
        f1002 = (f999 + 73) % 128;
        String strM5360 = m5360(fiveAdConfig);
        int i10 = f1002 + 3;
        f999 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5360;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5368(FiveAdCustomLayout fiveAdCustomLayout) {
        int i10 = f1002 + 37;
        f999 = i10 % 128;
        if (i10 % 2 != 0) {
            return fiveAdCustomLayout.getAdvertiserName();
        }
        fiveAdCustomLayout.getAdvertiserName();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5372(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1000) ^ ((long) f1004)) ^ ((long) f1003));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5375(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i10 = f1002 + 83;
        f999 = i10 % 128;
        int i11 = i10 % 2;
        m5366(fiveAdInterface, fiveAdLoadListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5363(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f1002 + 97;
        f999 = i10 % 128;
        int i11 = i10 % 2;
        m5374(fiveAdInterface, fiveAdListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m5370(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        f1002 = (f999 + 1) % 128;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        int i10 = f1002 + 49;
        f999 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5376(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i10 = f999 + 119;
        f1002 = i10 % 128;
        int i11 = i10 % 2;
        m5370(fiveAdInterface, fiveAdViewEventListener);
        if (i11 != 0) {
            int i12 = 1 / 0;
        }
        int i13 = f1002 + 75;
        f999 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        int i10 = f1002 + 103;
        f999 = i10 % 128;
        if (i10 % 2 == 0) {
            FiveAd.getSdkSemanticVersion();
            throw null;
        }
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        f1002 = (f999 + 7) % 128;
        return sdkSemanticVersion;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5366(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f999 = (f1002 + 57) % 128;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        f999 = (f1002 + 125) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5369(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1001);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5372("\udc60ÝᲥ㕸馃\ufe6f돞跛鼩侊鋧\uf7e8妶굲넅浨瀃ﱘ론뢸", (char) (ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", AndroidCharacter.getMirror('0') - '0', "Ⱐ遏둗◅").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5365((FiveAdConfig) list.get(0));
            }
        });
        map.put(m5372("桲䉰턀ꙻ邏౨\uebea閺㫊鉳惷ꪎ䊋\udd0c䮜\ue552ꅪ늢\udcaf熽笥岄즃䌊", (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "捺ퟹጶ奮").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5371((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5369("㉞킯\uf7ab骦릜峰揮\u06dd◅죻\uef29\uf23c鄸된嬕繥ᵪⁿ읻\uea51袢", 58099 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5362((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5369("㉞鵻氃㼊軌妌⢶\uf869䭥ᨯ\ue5d1든ވ횰꙽焑쀪鏋拄춮鵐汫㼗軑姧⢓ﮛ䭝ᨍ\ue537", 44839 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5364((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5372("杋\ued2e⬖\udccf\ue2ecⵔ㤦㻓赤ﮪ족慉\ue01d\ue814챉☘\ufb12⚧釤눾꥓\uf617\uf8ab뿓䖩쑞鄍蠭䢤", (char) (TextUtils.getOffsetAfter("", 0) + 64474), "\u0000\u0000\u0000\u0000", Color.alpha(0) - 1154598813, "揼⸸\udabb泻").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5373((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5369("㉞羅ꓫ历Ἔ쫐\uf1ae봽棅ល썩軜떸慼ⳕ\udb85蝪닟禣╹퀶龂䭾瘢㶔\ue950", View.MeasureSpec.getMode(0) + 52051).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5367((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5372("鈖⩥撶\udecc꽻븊㥄팼괔끃馘嗾眗\ue669䧸쟚媨Ͱڌﺝ뭫꼂焎뼹\ueaf2\ueb9f", (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10807), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), "\ude4a㖏㜬먪").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bq.m5363((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5369("㉞\ue597鷛딞浼Ҹ㲞퓵谅ꑉ徾矮\u2fda윚ｆ隨仦昬", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 55242).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5353();
            }
        });
        map.put(m5369("㉞ⷳഓ浲䳬갤豆\uefb1켥⽝ບ滏乹ꦵ视\ue934좨⣟࠘殱䯡ꬣ譗\ueaf6쨴⩜\u058b攥䕮\ua48f蓉\ue446잸⟛ݢ", 8111 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bq.m5361((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m5372("橙ばꠅ矡᪽膴蔪漶慚ﱚꅑ\uf2bf䤶憭嫸", (char) (TextUtils.indexOf("", "", 0, 0) + 12454), "\u0000\u0000\u0000\u0000", Drawable.resolveOpacity(0, 0) + 11987721, "ञ뛫ꘀ\uf530").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bq.m5375((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m5372("綢ꄉݽ\uefbc嵟⩅粐㸇꺩쪲\uf3b9䙞꼓톣萸沎癥וֹᲪ鵃", (char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16, "\uf3ea兙\u0e7c謘").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bq.m5376((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f999 + 49;
        f1002 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0253  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bq.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5360(FiveAdConfig fiveAdConfig) {
        int i10 = f999 + 113;
        f1002 = i10 % 128;
        int i11 = i10 % 2;
        String str = fiveAdConfig.appId;
        if (i11 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m5374(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        f999 = (f1002 + 69) % 128;
        fiveAdInterface.setListener(fiveAdListener);
        int i10 = f999 + 13;
        f1002 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 78 / 0;
        }
    }
}
