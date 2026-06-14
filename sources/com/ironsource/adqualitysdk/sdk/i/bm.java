package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class bm extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f904 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f905;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f906;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f907;

    class a extends HashMap<String, DTBFetchManager> implements hg<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f931 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f932 = {'D', 'T', 'B', 'F', 'e', 't', 'c', 'h', 'M', 'a', 'n', 'g', 'r', 'k', 'H', 's', 'p', '.', 'u', 'E', 'G', 'I', 'J', 'K', 'L'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f933 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f934 = 5;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ch f936;

        public a(HashMap<String, DTBFetchManager> map, ch chVar) {
            super(map);
            this.f936 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private DTBFetchManager m5278(String str, DTBFetchManager dTBFetchManager) {
            f931 = (f933 + 89) % 128;
            bm.this.m5106(this, this.f936, m5280("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000e\u0005\u000e\u0001\r\u000e\u0013\u000e\u0011\u0005\t\u0005\u0011\u0012\u0011\u0013¸", 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (68 - ExpandableListView.getPackedPositionType(0L))).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i10 = f931 + 63;
            f933 = i10 % 128;
            if (i10 % 2 == 0) {
                return dTBFetchManager2;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m5279() {
            f933 = (f931 + 57) % 128;
            return this;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            f933 = (f931 + 19) % 128;
            DTBFetchManager dTBFetchManagerM5278 = m5278((String) obj, (DTBFetchManager) obj2);
            f933 = (f931 + 79) % 128;
            return dTBFetchManagerM5278;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo5030() {
            f933 = (f931 + 91) % 128;
            HashMap<String, DTBFetchManager> mapM5279 = m5279();
            f931 = (f933 + 121) % 128;
            return mapM5279;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5280(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2153) {
                try {
                    char[] cArr2 = f932;
                    char c10 = f934;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        g.f2158 = 0;
                        while (true) {
                            int i11 = g.f2158;
                            if (i11 >= i10) {
                                break;
                            }
                            g.f2157 = cArr[i11];
                            g.f2155 = cArr[g.f2158 + 1];
                            if (g.f2157 == g.f2155) {
                                cArr3[g.f2158] = (char) (g.f2157 - b10);
                                cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                            } else {
                                g.f2156 = g.f2157 / c10;
                                g.f2154 = g.f2157 % c10;
                                g.f2159 = g.f2155 / c10;
                                g.f2152 = g.f2155 % c10;
                                if (g.f2154 == g.f2152) {
                                    g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                    g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                    int i12 = (g.f2156 * c10) + g.f2154;
                                    int i13 = (g.f2159 * c10) + g.f2152;
                                    int i14 = g.f2158;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (g.f2156 == g.f2159) {
                                    g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                    g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                    int i15 = (g.f2156 * c10) + g.f2154;
                                    int i16 = (g.f2159 * c10) + g.f2152;
                                    int i17 = g.f2158;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (g.f2156 * c10) + g.f2152;
                                    int i19 = (g.f2159 * c10) + g.f2154;
                                    int i20 = g.f2158;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            g.f2158 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    class c extends ThreadPoolExecutor implements hg<ThreadPoolExecutor> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f937 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f938;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f939 = {'T', 37814, 10157, 48036, 20405, 58279, 30669, 3032, 40911, 13286, 51163, 23321, 61186, 33554, 5937, 43823, 16165, 54042, 26445, 64356, 36725, 9063, 46733, 19096, 56965};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f940 = 3708850498202801140L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f942;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
            this.f942 = chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ThreadPoolExecutor m5282() {
            int i10 = f938 + 125;
            f937 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 59 / 0;
            }
            return this;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f938 = (f937 + 111) % 128;
            bm.this.m5106(this, this.f942, m5281(Process.myPid() >> 22, (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 25).intern(), runnable);
            super.execute(runnable);
            f938 = (f937 + 79) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ThreadPoolExecutor mo5030() {
            f938 = (f937 + 9) % 128;
            ThreadPoolExecutor threadPoolExecutorM5282 = m5282();
            f938 = (f937 + 23) % 128;
            return threadPoolExecutorM5282;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m5281(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1677) {
                try {
                    char[] cArr = new char[i11];
                    d.f1676 = 0;
                    while (true) {
                        int i12 = d.f1676;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f939[i10 + i12]) ^ (((long) i12) * f940)) ^ ((long) c10));
                            d.f1676 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("\u0000.\u0085Õ\u000bÓ\u0091Õ\u0017§\u009d§#\u009e©×/¥µÜ;ßÁÛGÞ\u000f`\u008aº\u0004\u008d\u009e¹\u0018º\u0092³,¨¦¬ «º·4£Î½HºÂ¼\u0000D\u0085«\u000b¼\u0091¼\u0017\u009f\u009d\u008f#\u0093©\u008f/\u0091µ\u0083;\u008f\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0085!\u0091§\u008d-\u0095³\u008b9\u0095¿\u0099\u0000D\u0085«\u000b¼\u0091´\u0017\u0092\u009d\u008f#\u009f©\u008b/\u008bµ\u0083;\u009fÁ\u0081G\u009dÍ\u0092S\u009eÙ°_\u0093å\u009bk\u0087ñ\u009bw\u0085ý\u009f\u0083\u0093\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015®\u009b\u0088!\u0091§\u0081-\u0091³\u00919\u0095¿\u0089E«Ë·Q¼×°]\u009aã¹i\u00adï±u¡û¿\u0081¡\u0007\u00ad\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009dº#\u0099©\u008d/\u0091µ\u0081;\u009fÁ\u0081G\u008d\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0082!¤§\u0087-\u0097³\u008b9\u0097¿\u0089E«Ë§\u0088\u0007\rè\u0083ÿ\u0019ÿ\u009fÛ\u0015ñ«×!Î§Þ=Æ³ÆIÂÏÞEÄÛØQÓ×ß\u0000Y\u0085¶\u000b¡\u0091¡\u0017\u0085\u009dª#\u0088©\u0085/\u0081µ\u008f;\u0099\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081ºÖ?9±.+.\u00ad\n';\u0099\r\u0013\u0018\u0095\u001a\u000f\n\u0081\n{\u0014ý\u0003Z\u0018ß÷QàËàMÄÇñyÏóÀuÓ\u0080]\u0005®\u008b\u00ad\u0011í\u0097£\u001d¨£¥)½¯©5§»æA¯Ç¯M»Ó¥Y¬ß«eÿë±q·÷¡}û\u0003\u0090\u0089\u0083\u000f\u0094\u0095\u0098\u001b¼¡\u008d'³\u00ad¸3«^-ÛÂUÕÏÕIñÃÁ}ú÷êqô\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d\u00ad#\u0093©\u009c/\u008fµ¤;\u0083Á\u0085G\u0084Í\u009cS\u0080Ù\u0085_³å\u0083k\u0087ñ\u0088w\u0082ý\u009fÇhB\u0087Ì\u0090V\u0097ÐµZ£äµn½è\u0092rºü¹\u0006\u00ad\u0080·\n\u00ad\u0094§\u009dé\u0018\u0006\u0096\u0011\f\u0016\u008a4\u0000\"¾44<²\u0018(;¦5\\9Ú>P;Î-jWï¸a¯û¼}\u008a÷\u0086I\u008dÃ\u008fE\u0099ß\u0081Q\u0097\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u0097/\u0096µ\u0092;\u0084Á¹G\u009dÍ\u0080S\u0086Ù\u0094_\u009eå\u008ak\u009c´Y1¶¿¡%¡£\u0085)¤\u0097\u0086\u001d\u0097\u009b\u0080\u0001¨\u008f\u008au\u0086ó\u0087y\u008bç\u009dm ë\u0084Q\u0081ß\u0087E\u0095Ã\u009fI\u00937\u0085\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u008a/\u009dµ¾;\u0098Á\u0081G\u0091Í\u0081S\u0081Ù\u0085_\u0099å\u009bk\u0087ñ\u008cw\u0080ý§\u0083\u0083\t\u009a\u008f\u009c\u0015\u0082\u009b\u0088!\u0080§\u0096Ù\u0092\\}ÒjHjÎNDnúMpCöBlCâA\u0018@\u009eIÄìA\u0003Ï\u0014U\u0014Ó0Y\u0016ç*m!ë1q1ÿ:\u00058\u00838\t\u0017\u00973\u001d*\u009b,!\"¯(5 ³6\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d²#\u0094©\u008d/\u009dµ\u0085;\u0085Á\u0081G\u009dÍ\u0087S\u009bÙ\u0090_\u009cå£k\u0087ñ\u009ew\u0098ý\u008e\u0083\u0084\t\u008c\u008f\u009au\u0080ðo~xäxb\\èsVWÜNZHÀVN\\´T2B\u0000T\u0085½\u000b³\u0091\u009c\u0017\u0092\u009d\u009a#\u009d©\u009c/\u008aµ¿;\u0097Á\u0086G\u009cÍ¾S\u0093Ù\u0081\u0000T\u0085½\u000b»\u0091\u0085\u0017\u0099\u009d\u0098#\u008f©\u008d/\u0097µ\u0085;¥Á\u0090G\u0086Í\u0085S\u009bÙ\u0092_\u0095dÃá\ro\u000fõ6s\u0010ù\rG\u001dÍ\tK\tÑ\u0001_\u001d¥\u0003#\u001f©\u00107\u001c½2;\u0011\u0081\u0019\u000f\u0005\u0095\u0019\u0013\u0007\u0099\u001dç\u0011\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0094G\u0084Í\u0080SÜÙ\u0090_\u0094å\u009ckÀñ\u008cw\u008fý\u009f\u0083\u0083\t\u009f\u008f\u0081\u0015\u0093\u009b\u009f!Ë§¥-\u0093³\u00919¨¿\u008eE«Ë»Q¯×¯]¯ã³i\u00adï±u¶ûº\u0081\u0094\u0007·\u008d§\u0013»\u0099§\u001f¹¥»+·Æ5CûÍùWÈÑì[Îåíoùéåsõýë\u0007õ\u0081ù9\r¼þ2ý¨½.ó¤ø\u001aõ\u0090í\u0016ù\u008c÷\u0002¶øú~êôîj²àþfúÜòR®ÈâNáÄñºí0ñ¶ï,ý¢ñ\u0018¥\u009eË\u0014ý\u008aÿ\u0000Î\u0086ê|ðòÓhÇîÛdÃÚÝPÃÖÏÑ\nTÄÚÆ@÷ÆÓLæòØx×þÄ\u0093ó\u0016=\u0098?\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d¸#\u0095©\u0097/\u008cµ\u0085;\u0099Á\u0099G\u0098Í\u0096S\u0080\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d·#\u0093©\u008a/\u008cµ\u0092;\u0098Á\u0090G\u0086\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081G¸Í\u009aS\u0081Ù\u0085_\u0095å\u0081k\u008bñ\u009f\u0094q\u0011¿\u009f½\u0005\u008c\u0083¨\t\u008d·¥=»»¥!¦¯²\"Å§\u000b)\t³85\u001c¿+\u0001\u0007\u008b\r\r\u0019\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u00810\u009bµf;v¡@'p\u00adw\u0013M\u0099`\u001f} +%Ö«Æ1÷·Õ=Ã\u0083Õ\tÝ\u008fò\u0015Ú\u009bÙaÍç×mÍóÇyôÿÒEÐËÖQÀ×Î]Ä#Ã\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í±S\u009bÙ\u0095_¹å\u008b,\u009c©a'q½G;c±R\u000fd\u0085q\u0003s\u0099c\u0017cí}kjáK\u007f{õosjÉ`G|Ý`[rÑY¯u\u009a±\u001fL\u0091\\\u000bj\u008dN\u0007\u007f¹I3\\µ^/N¡N[PÝGWlÉICWÅT\u007f\\ñKkHíSgR\u0019R\u0093j\u0015L\u008f]\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í¡S\u0097Ù\u009f_\u0094å\u008ak\u009cñ\u0084w\u0082ý\u008c\u0083§\t\u0088\u008f\u0098a\u009fäbjrðDv`üQBgÈrNpÔ`Z` ~&i¬Y2o¸g>l\u0084r\nd\u0090|\u0016z\u009ctâPhdî~t{úr@xh\"íßcÏùü\u007fÜõØKÞÁÉGÑÝÆSå©Ù/Õ¥Ó;Ø±õ7Ñ\u008dÙ\u0003ù\u0099Í\u001fØ\u0095ÛëÊaßçÙ}áóÖIÓÏÕEÉÛÊQô×Ä-è£ú9õ¿êÉ2LÏÂßXéÞÍTüêÊ`ßæÝ|ÍòÍ\bÓ\u008eÄ\u0004ç\u009aÃ\u0010×\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í£S\u0080Ù\u0098_\u0093å\u008ak¾ñ\u0082w\u0085ý\u0085\u0083\u009e ñ%\f«\u001c1*·\u000e=>\u0083\u0005\t\u0015\u008f\u000b\u00152\u009b\fa\fç\u0016m0ó1y.ÿ\"U\u0004Ðù^éÄßBûÈËvðüàzþàÕnñ\u0094Â\u0012î\u0098à\u0006ô¬H)µ§¥=\u0093»·1\u0087\u008f¼\u0005¬\u0083²\u0019\u0088\u0097¬m¸ë\u0088a¹ÿ©uªó¶I®Ç¦]±\u0000i\u0085\u008c\u000b¿\u0091\u0099\u0017¯\u009d\u0092#\u0080©\u009c/±µ\u0099;\u0082Á\u0090G\u0086Í\u0080S\u0086Ù\u0098_\u0084å\u0086k\u008fñ\u0081w\u00adý\u008f\u009eÚ\u001b4\u0095\"\u000f%\u00891\u0003'½\u00177\u0002±\u0007++¥;_/Ù%S\fÍ*G+Á={9õ%o-é\u0018c3\u001d=\u00971\u00116\u008b;\u0005-¿\u00119<³*a\u009eäpjfðavuücBSÈFN@ÔrZn k&|¬z2`¸~>^\u0084w\na\u0090f\u0016x\u009cuâr\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/ªµ\u0092;\u0087Á\u0080G\u0091Í\u0080S\u0086É\u0080L}ÂmXXÞrTxêT`pæy|\u007f^¹ÛDUTÏsIPÃL}G÷BqvëFeA\u009fE\u0019^\u0000g\u0085\u009a\u000b\u008a\u0091®\u0017\u0090\u009d\u0094#\u008e©¬/\u008dµ\u009e;\u0092\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/¾µ\u0098;\u0084Á\u0098G\u0095Í\u0087\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d·#\u0095©\u0098/\u009cµ\u0092;\u0084þF{»õ«o\u009dé¹c\u008cÝ²W½Ñ®".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1191);
        f906 = cArr;
        f907 = 1286376246626059775L;
    }

    public bm(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m5231(ApsAd apsAd) {
        int i10 = f904 + 91;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return apsAd.getSlotUuid();
        }
        apsAd.getSlotUuid();
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Map<String, String> m5232(DTBAdResponse dTBAdResponse) {
        f905 = (f904 + 9) % 128;
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i10 = f904 + 99;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return defaultVideoAdsRequestCustomParams;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m5234() {
        f905 = (f904 + 9) % 128;
        String appKey = AdRegistration.getAppKey();
        f904 = (f905 + 63) % 128;
        return appKey;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBFetchFactory m5238() {
        f905 = (f904 + 3) % 128;
        DTBFetchFactory dTBFetchFactory = DTBFetchFactory.getInstance();
        int i10 = f905 + 21;
        f904 = i10 % 128;
        if (i10 % 2 != 0) {
            return dTBFetchFactory;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static List<DTBAdSize> m5240(DTBAdResponse dTBAdResponse) {
        int i10 = f904 + 61;
        f905 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdResponse.getDTBAds();
            throw null;
        }
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        int i11 = f905 + 1;
        f904 = i11 % 128;
        if (i11 % 2 != 0) {
            return dTBAds;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ DTBAdView m5241(ApsAd apsAd) {
        int i10 = f904 + 67;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5237(apsAd);
        }
        m5237(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ ApsAdRequest m5244(ApsAd apsAd) {
        f904 = (f905 + 125) % 128;
        ApsAdRequest apsAdRequestM5239 = m5239(apsAd);
        f904 = (f905 + 17) % 128;
        return apsAdRequestM5239;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m5249(DTBAdResponse dTBAdResponse) {
        int i10 = f905 + 39;
        f904 = i10 % 128;
        int i11 = i10 % 2;
        String crid = dTBAdResponse.getCrid();
        if (i11 == 0) {
            int i12 = 55 / 0;
        }
        int i13 = f904 + 43;
        f905 = i13 % 128;
        if (i13 % 2 == 0) {
            return crid;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ List m5252(DTBAdResponse dTBAdResponse) {
        f905 = (f904 + 1) % 128;
        List<DTBAdSize> listM5240 = m5240(dTBAdResponse);
        int i10 = f904 + 39;
        f905 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 39 / 0;
        }
        return listM5240;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ Map m5255(DTBAdResponse dTBAdResponse) {
        f905 = (f904 + 107) % 128;
        Map<String, String> mapM5232 = m5232(dTBAdResponse);
        int i10 = f905 + 29;
        f904 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 35 / 0;
        }
        return mapM5232;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ApsAdFormat m5256(ApsAd apsAd) {
        f905 = (f904 + 7) % 128;
        ApsAdFormat apsAdFormatM5233 = m5233(apsAd);
        int i10 = f904 + 5;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return apsAdFormatM5233;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5259(ApsAd apsAd) {
        int i10 = f905 + 107;
        f904 = i10 % 128;
        int i11 = i10 % 2;
        String strM5248 = m5248(apsAd);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
        return strM5248;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ApsAdRequest m5262(ApsAd apsAd) {
        f905 = (f904 + 53) % 128;
        ApsAdRequest apsAdRequestM5253 = m5253(apsAd);
        f905 = (f904 + 15) % 128;
        return apsAdRequestM5253;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Bundle m5266(DTBAdResponse dTBAdResponse) {
        int i10 = f904 + 37;
        f905 = i10 % 128;
        int i11 = i10 % 2;
        Bundle bundleM5236 = m5236(dTBAdResponse);
        if (i11 != 0) {
            int i12 = 34 / 0;
        }
        return bundleM5236;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ a m5272(bm bmVar, HashMap map, ch chVar) {
        int i10 = f904 + 115;
        f905 = i10 % 128;
        int i11 = i10 % 2;
        a aVarM5267 = bmVar.m5267((HashMap<String, DTBFetchManager>) map, chVar);
        if (i11 != 0) {
            int i12 = 77 / 0;
        }
        f904 = (f905 + 27) % 128;
        return aVarM5267;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static HashMap<String, Object> m5235(DTBAdResponse dTBAdResponse) {
        f904 = (f905 + 119) % 128;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        f905 = (f904 + 9) % 128;
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static Bundle m5236(DTBAdResponse dTBAdResponse) {
        int i10 = f904 + 69;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return dTBAdResponse.getRenderingBundle();
        }
        dTBAdResponse.getRenderingBundle();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static ApsAdRequest m5239(ApsAd apsAd) {
        f905 = (f904 + 1) % 128;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        f905 = (f904 + 53) % 128;
        return adLoader;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ String m5242() {
        int i10 = f904 + 7;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5234();
        }
        m5234();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ DTBFetchFactory m5245() {
        f905 = (f904 + 81) % 128;
        DTBFetchFactory dTBFetchFactoryM5238 = m5238();
        f905 = (f904 + 27) % 128;
        return dTBFetchFactoryM5238;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static JSONObject m5250(DTBAdSize dTBAdSize) {
        f905 = (f904 + 57) % 128;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        f904 = (f905 + 87) % 128;
        return pubSettings;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5251(ApsAd apsAd) {
        f905 = (f904 + 77) % 128;
        String bidInfo = apsAd.getBidInfo();
        int i10 = f904 + 25;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return bidInfo;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AdType m5254(DTBAdSize dTBAdSize) {
        f904 = (f905 + 71) % 128;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i10 = f904 + 31;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return dTBAdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AdType m5257(DTBAdSize dTBAdSize) {
        int i10 = f905 + 125;
        f904 = i10 % 128;
        int i11 = i10 % 2;
        AdType adTypeM5254 = m5254(dTBAdSize);
        if (i11 == 0) {
            int i12 = 8 / 0;
        }
        return adTypeM5254;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5260(DTBAdResponse dTBAdResponse) {
        f904 = (f905 + 45) % 128;
        String strM5246 = m5246(dTBAdResponse);
        int i10 = f904 + 19;
        f905 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 0;
        }
        return strM5246;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m5263(DTBAdResponse dTBAdResponse) {
        f905 = (f904 + 73) % 128;
        String strM5249 = m5249(dTBAdResponse);
        int i10 = f905 + 17;
        f904 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5249;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5269(ApsAd apsAd) {
        f904 = (f905 + 99) % 128;
        String strM5251 = m5251(apsAd);
        int i10 = f905 + 3;
        f904 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5251;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ c m5273(bm bmVar, ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        int i10 = f904 + 9;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return bmVar.m5274(threadPoolExecutor, chVar);
        }
        bmVar.m5274(threadPoolExecutor, chVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static ApsAdFormat m5233(ApsAd apsAd) {
        f904 = (f905 + 107) % 128;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i10 = f905 + 41;
        f904 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 23 / 0;
        }
        return apsAdFormat;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBAdView m5237(ApsAd apsAd) {
        int i10 = f905 + 35;
        f904 = i10 % 128;
        if (i10 % 2 != 0) {
            return apsAd.getAdView();
        }
        apsAd.getAdView();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m5243(DTBAdResponse dTBAdResponse) {
        int i10 = f904 + 99;
        f905 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdResponse.getImpressionUrl();
            throw null;
        }
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        int i11 = f904 + 63;
        f905 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
        return impressionUrl;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m5246(DTBAdResponse dTBAdResponse) {
        f904 = (f905 + 17) % 128;
        String bidId = dTBAdResponse.getBidId();
        f904 = (f905 + 13) % 128;
        return bidId;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m5248(ApsAd apsAd) {
        f904 = (f905 + 113) % 128;
        String pricePoint = apsAd.getPricePoint();
        f905 = (f904 + 11) % 128;
        return pricePoint;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static ApsAdRequest m5253(ApsAd apsAd) {
        int i10 = f904 + 71;
        f905 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        if (i11 != 0) {
            int i12 = 38 / 0;
        }
        int i13 = f905 + 17;
        f904 = i13 % 128;
        if (i13 % 2 != 0) {
            return apsAdRequest;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ HashMap m5258(DTBAdResponse dTBAdResponse) {
        int i10 = f904 + 9;
        f905 = i10 % 128;
        int i11 = i10 % 2;
        HashMap<String, Object> mapM5235 = m5235(dTBAdResponse);
        if (i11 != 0) {
            int i12 = 54 / 0;
        }
        return mapM5235;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5261(DTBAdSize dTBAdSize) {
        f904 = (f905 + 55) % 128;
        String strM5277 = m5277(dTBAdSize);
        f905 = (f904 + 79) % 128;
        return strM5277;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m5265(DTBAdSize dTBAdSize) {
        int i10 = f905 + 119;
        f904 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5247(dTBAdSize);
        }
        m5247(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5270(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f905 = (f904 + 117) % 128;
        String strM5264 = m5264(dTBAdResponse, dTBAdSize);
        f904 = (f905 + 95) % 128;
        return strM5264;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5275(ApsAd apsAd) {
        int i10 = f905 + 33;
        f904 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5231(apsAd);
        }
        m5231(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m5247(DTBAdSize dTBAdSize) {
        f904 = (f905 + 125) % 128;
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        int i10 = f904 + 71;
        f905 = i10 % 128;
        if (i10 % 2 == 0) {
            return zIsInterstitialAd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5264(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i10 = f905 + 1;
        f904 = i10 % 128;
        int i11 = i10 % 2;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        if (i11 == 0) {
            int i12 = 10 / 0;
        }
        int i13 = f905 + 21;
        f904 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 37 / 0;
        }
        return pricePoints;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m5271(DTBAdSize dTBAdSize) {
        int i10 = f905 + 125;
        f904 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5250(dTBAdSize);
        }
        m5250(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5276(DTBAdResponse dTBAdResponse) {
        f905 = (f904 + 81) % 128;
        String strM5243 = m5243(dTBAdResponse);
        f904 = (f905 + 3) % 128;
        return strM5243;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5268((ViewConfiguration.getKeyRepeatDelay() >> 16) + 753, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12540), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5242();
            }
        });
        map.put(m5268(762 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (41036 - (KeyEvent.getMaxKeyCode() >> 16)), 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5245();
            }
        });
        map.put(m5268(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 786, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5260((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5268(803 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (11515 - View.MeasureSpec.getMode(0)), 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5263((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5268(826 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39638), View.MeasureSpec.getSize(0) + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5276((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5268((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 851, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSize(0, 0) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5258((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5268(876 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.indexOf("", "", 0, 0) + 25080), 27 - TextUtils.lastIndexOf("", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5266((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5268(905 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (26693 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - ExpandableListView.getPackedPositionType(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5255((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5268((ViewConfiguration.getWindowTouchSlop() >> 8) + 942, (char) (TextUtils.indexOf((CharSequence) "", '0') + 51542), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5252((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5268(959 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.alpha(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5270((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m5268(KeyEvent.keyCodeFromString("") + 981, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41110), Drawable.resolveOpacity(0, 0) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5261((DTBAdSize) list.get(0));
            }
        });
        map.put(m5268(999 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (21859 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5257((DTBAdSize) list.get(0));
            }
        });
        map.put(m5268(1013 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (44079 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5271((DTBAdSize) list.get(0));
            }
        });
        map.put(m5268((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1032, (char) (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bm.m5265((DTBAdSize) list.get(0)));
            }
        });
        map.put(m5268(Process.getGidForName("") + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (char) (40633 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5272(bm.this, (HashMap) list.get(0), chVar);
            }
        });
        map.put(m5268(TextUtils.lastIndexOf("", '0') + 1086, (char) (TextUtils.indexOf("", "", 0) + 25085), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5273(bm.this, (ThreadPoolExecutor) list.get(0), chVar);
            }
        });
        map.put(m5268(1108 - Drawable.resolveOpacity(0, 0), (char) Color.red(0), 14 - TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5262((ApsAd) list.get(0));
            }
        });
        map.put(m5268((ViewConfiguration.getTouchSlop() >> 8) + 1123, (char) (51687 - View.combineMeasuredStates(0, 0)), 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5269((ApsAd) list.get(0));
            }
        });
        map.put(m5268(1133 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (24286 - ExpandableListView.getPackedPositionType(0L)), ((Process.getThreadPriority(0) + 20) >> 6) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5259((ApsAd) list.get(0));
            }
        });
        map.put(m5268(1146 - Color.blue(0), (char) View.combineMeasuredStates(0, 0), 11 - TextUtils.indexOf("", "")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5275((ApsAd) list.get(0));
            }
        });
        map.put(m5268((ViewConfiguration.getTouchSlop() >> 8) + 1157, (char) ((-1) - MotionEvent.axisFromString("")), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5256((ApsAd) list.get(0));
            }
        });
        map.put(m5268(1171 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5244((ApsAd) list.get(0));
            }
        });
        map.put(m5268(View.getDefaultSize(0, 0) + 1182, (char) (65058 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bm.m5241((ApsAd) list.get(0));
            }
        });
        f905 = (f904 + 13) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        Matcher matcher = Pattern.compile(m5268(Color.red(0), (char) Color.red(0), (-16777203) - Color.rgb(0, 0, 0)).intern()).matcher(mo5107());
        if (!matcher.matches()) {
            return null;
        }
        int i10 = f904 + 21;
        f905 = i10 % 128;
        String strGroup = i10 % 2 != 0 ? matcher.group(0) : matcher.group(1);
        int i11 = f905 + 59;
        f904 = i11 % 128;
        if (i11 % 2 != 0) {
            return strGroup;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private a m5267(HashMap<String, DTBFetchManager> map, ch chVar) {
        a aVar = new a(map, chVar);
        f904 = (f905 + 65) % 128;
        return aVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo5107() {
        int i10 = f905 + 23;
        f904 = i10 % 128;
        if (i10 % 2 == 0) {
            AdRegistration.getVersion();
            throw null;
        }
        String version = AdRegistration.getVersion();
        f905 = (f904 + 75) % 128;
        return version;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5268(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f906[i10 + i12]) ^ (((long) i12) * f907)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06c1  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 2084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bm.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5277(DTBAdSize dTBAdSize) {
        int i10 = f904 + 95;
        f905 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdSize.getSlotUUID();
            throw null;
        }
        String slotUUID = dTBAdSize.getSlotUUID();
        int i11 = f904 + 25;
        f905 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 4 / 0;
        }
        return slotUUID;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private c m5274(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        c cVar = new c(threadPoolExecutor, chVar);
        f904 = (f905 + 105) % 128;
        return cVar;
    }
}
