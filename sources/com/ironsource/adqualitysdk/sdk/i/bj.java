package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.chartboost.sdk.CBImpressionActivity;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bj extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f847 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f849;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f848 = {'1', 'h', 'o', 'q', 's', 'Z', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '^', 'U', 'd', 'i', 's', 128, 'h', ']', '^', 137, 138, 132, 143, '|', 132, Ascii.MAX, 'Z', 177, 173, 178, 167, 166, 183, 181, 183, 179, 174, 175, 173, 162, '?', 128, 'h', 'L', 'O', 'e', 'x', '{', 'u', 'v', '}', 'x', 'v', 'x', 'g', 'b', 'p', 'n', 'l', 'x', 'g', IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 'x', 'y', 'y', 196, 209, 207, 204, 168, 161, 162, 141, 216, 194, 192, 198, 196, 203, 141, 202, 195, 210, 141, 211, 210, 206, 206, 193, 211, 209, 192, 199, 194, 141, 204, 206, 194, 216, 211, 200, 213, 200, 211, 194, 160, 205, 206, 200, 210, 210, '$', '[', 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'W', 'R', 'f', 'l', 'g', 'a', 'b', 'g', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', IOUtils.DIR_SEPARATOR_WINDOWS, 'n', 'g', '_', 'b', 'n', 'l', 'n', 's', 'l', 'k', 'q', 'n', '[', 'E', 'B', '4', 'e', 'H', 'M', 'n', 'i', 'n', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'W', 'n', 'l', 'n', 's', 'l', 'k', 'q', 'n', '[', 'E', 'B', '8', 'R', 'n', 'g', 'o', 'R', 'L', 'g', 'k', 'P', 'Q', 's', 'q', 'o', 'h', 'k', 's', 'i', '3', 'n', 'l', 'f', 'h', 'j', 'j', 'V', 'U', ']', 'f', 'n', 'n', 148, 303, 301, 295, 297, 299, 299, 279, 287, 310, 308, 306, 299, 302, 310, 300, 295, 280, 286, 303, 297, 'g', 206, 212, 195, 189, 204, 209, 219, 211, 208, 215, 217, 219, 205, 175, 179, 177, 177, 175, 162, 188, 208, 208, 206, 204, 210, 212, '1', 'j', 'k', 'c', 'j', 'l', IOUtils.DIR_SEPARATOR_WINDOWS, 'K', 'B', 'U', 'd', 'i', 's', 'k', 'h', 'o', 'q', 's', IOUtils.DIR_SEPARATOR_WINDOWS, 'T', 'h', 'h', 'f', 'd', 'j', 'l', 'q', 228, 236, 227, 220, 225, 218, 221, 229, 236, 220, 215, 229, 223, 229, 230, 'o', 222, 228, 216, 213, 225, 218, 226, 230, 228, 230, '\"', 'S', '[', 'c', 'n', 'g', 'l', 'j', 'd', 'f', 'h', 'h'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f851 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f850 = -2119553104;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f852 = 0;

    class e extends ChartboostDelegate implements hg<ChartboostDelegate> {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f862 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f863 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f864;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f865;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f867;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ChartboostDelegate f868;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¦Í$Ê¬ÈOÅÝÃLÀÍ¾s»ü¹q¶\u001e³\u0081±\u001d®©¬9©º§ ¤Î¢@\u009fÞ\u009dH\u009aì\u0098f\u0095ç\u0092\u0091\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¦Í$Ê¬ÈOÅÝÃLÀÛ¾\u007f»þ¹t¶\u0017³\u0093±\u0010®©¬9©º§ ¤Î¢@\u009fÞ\u009dH\u009aì\u0098f\u0095ç\u0092\u0091 Å]\u0099Z\tX\u0091U.S·P#N¨KMIÝFdDþA~\u007fè|cy\u001ew\u0082t\u0004röo7m£j!hÿeVcÍ`q\u001eõ\u001bB\u0019ì\u0016\u0089\u0013\u0011\u0011\u009d\u000e\u0015\f¥\t!\u0007·\u0004S\u0002Ô?@\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È|ÅÐÃAÀó¾B»â¹H¶\u0014³\u0093±\r®©¬9©º§ ¤Î¢@\u009fÞ\u009dH\u009aì\u0098f\u0095ç\u0092\u0091_1¢m¥ý§eªÚ¬C¯×±\\´¹¶)¹\u0090»\n¾\u008a\u0080\u001c\u0083\u0097\u0086ê\u0088v\u008bð\u008d\u0002\u0090Ã\u0092W\u0095Õ\u0097\f\u009aª\u009c)\u009f\u0080á\rä\u008cæ\u0005é@ìîîoñ÷óWöÏøCû§ý5À±Â2Å\u0086\u008a\u0005wYpÉrQ\u007fîywzãdha\u008dc\u001dl¤n>k¾U(V£SÞ]B^ÄX6E÷Gc@áB?O\u009bI\u0001Jª451\u00823,<I9Ñ;]$Õ&e#á-w.\u0093(\u0014\u0015\u0080\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÝÃAÀü¾}»Ä¹j¶\u000f³\u0097±\u001b®\u0093¬#©§§1¤Õ¢R\u009fÆ\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È~ÅØÃ[Àï¾z»ì¹}¶2³\u009c±\u001d®\u0085¬%©½§1¤Õ¢G\u009fÃ\u009d@\u009aô\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÞÃEÀï¾z»è¹p¶\u001e³»±\u0007®\u0094¬2©¼§6¤È¢Z\u009fÞ\u009dH\u009aù\u0098c_Ý¢\u0081¥\u0011§\u0089ª6¬¯¯;±°´U¶Å¹|»æ¾f\u0080ð\u0083{\u0086\u0006\u0088\u009a\u008b\u001c\u008dî\u00908\u0092º\u00952\u0097Ñ\u009aC\u009cÒ\u009fSáíäbæïé\u0080ì\u001fî\u0083ñ3ó¦ö\"ø¾ûcýÝÀDÂÌ\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÐÃKÀ÷¾s»À¹k¶\t³\u0097±(®\u0090¬'©½Gÿº£½3¿«²\u0014´\u008d·\u0019©\u0092¬w®ç¡^£Ä¦D\u0098Ò\u009bY\u009e$\u0090¸\u0093>\u0095Ì\u0088\u001a\u008a\u0098\u008d\u0010\u008fó\u0082a\u0084ð\u0087gùÃüBþÈñ«ô/ö¬é\u0011ë\u0084î\u0000à\u009cãAåÿØfÚîß\\\"\u0000%\u0090'\b*·,./º114Ô6D9ý;g>ç\u0000q\u0003ú\u0006\u0087\b\u001b\u000b\u009d\ro\u0010®\u0012:\u0015¸\u0017c\u001aÏ\u001c^\u001fìa]dýfWi\u000bl\u008cn\u0012q²s'v£x?{â}\\@ÅBM\u0099²dîc~aælYjÀiTwßr:pª\u007f\u0013}\u0089x\tF\u009fE\u0014@iNõMsK\u0081V@TÔSVQ\u008f\\)ZªY\u0003'\u008e\"\u000f \u0086/Ç*l(ê7t5ç0O>Ä=>\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÝÃGÀì¾s»À¹k¶\t³\u0097±(®\u0090¬'©½U\\¨\u0000¯\u0090\u00ad\b ·¦.¥º»1¾Ô¼D³ý±g´ç\u008aq\u0089ú\u008c\u0087\u0082\u001b\u0081\u009d\u0087o\u009a®\u0098:\u009f¸\u009df\u0090Â\u0096^\u0095ãëbîßìtã\u0016æ\u0088ä7û\u008fù8ü¢\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È~ÅØÃ[Àï¾z»ì¹}¶6³\u009d±\u001b®\u0085¬\u0016©¾§5¤Ïï\u0013\u0012O\u0015ß\u0017G\u001aø\u001ca\u001fõ\u0001~\u0004\u009b\u0006\u000b\t²\u000b(\u000e¨0>3µ6È8T;Ò=  á\"u%÷',*\u0080,\u0011/£Q\u0012T²V\u0006YN\\Á^VAÂCcFÝHyK\u0085M\u0000p\u00917¥ÊùÍiÏñÂNÄ×ÇCÙÈÜ-Þ½Ñ\u0004Ó\u009eÖ\u001eè\u0088ë\u0003î~àâãdå\u0096øWúÃýAÿ\u008cò6ô»÷\n\u0089\u0095\u008c(\u008e\u008e\u0081ô\u0084w\u0086ä\u0099@\u009bÞ\u009eZ\u0090à\u00935\u0095»¨*ª®\u00ad\f¯\u0084¢\u0001¥o§ûºb¼êÃî>\u00949\u0000;¿670¬33-®(q*É%E'ô\"u\u001cÇ\u001fg\u001a\u0001\u0014¹\u0017\u0002\u0011º\f9\u000e¯\t;\u000bÝ\u0006Z\u0000Ö\u0003|}óxi\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¦Í$Ê¬ÈOÅÝÃLÀÛ¾\u007f»þ¹t¶\u0017³\u0093±\u0010®²¬2©¹§$¤Î¢W\u009fÏ\u009dE\u009aÎ\u0098f\u0095â\u0092\u0098\u0090\u001bR\t¯U¨Åª]§â¡{¢ï¼d¹\u0081»\u0011´¨¶2³²\u008d$\u008e¯\u008bÒ\u0085N\u0086È\u0080:\u009dû\u009fo\u0098í\u009a3\u0097\u009a\u0091\u0001\u0092½ì9é\u0095ë+äFáÙãQüÎþxûàõYö\u009fð\u001dÍ\u0085Ï\u0004\u009bûf§a7c¯n\u0010h\u0089k\u001du\u0096psrã}Z\u007fÀz@DÖG]B L¼O:IÈT\tV\u009dQ\u001fSÄ^hXù[K%ú Z\"ð-¬(+*µ5\n7\u008a2\u0001<\u009c?v9ï\u0004w\u0006ý\u0001v\u0003Þ\u000eZ\t \u000b£î\u008a\u0013Ö\u0014F\u0016Þ\u001ba\u001dø\u001el\u0000ç\u0005\u0002\u0007\u0092\b+\n±\u000f11§2,7Q9Í:K<¹!x#ì$n&·+\u0011-\u0092.;P¶U7W¾Xà]^_×@HBìGcIéJ\u0011L¬q\ns\u008ct4v©\u000f\u0000ò\\õÌ÷Túëürÿæámä\u0088æ\u0018é¡ë;î»Ð-Ó¦ÖÛØGÛÁÝ3ÀòÂfÅäÇ:Ê\u009eÌ\u0004Ï¯±0´\u009c¶\"¹O¼Ð¾X¡Ç£q¦é¨P«\u0096\u00ad\u0014\u0090\u008c\u0092\rìD\u0011\u0018\u0016\u0088\u0014\u0010\u0019¯\u001f6\u001c¢\u0002)\u0007Ì\u0005\\\nå\b\u007f\rÿ3i0â5\u009f;\u00038\u0085>w#¶!\"& $~)Ú/F,ûRzWØUfZ\u000b_\u0094]\u001cB\u0083@5E\u00adK\u0014HÒNPsÈqI\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÞÃEÀï¾z»è¹p¶\u001e³ ±\f®\u0097¬6©¼§!¤Ù¢W\u009fü\u009dH\u009aü\u0098j\u0095é6ÍË\u0091Ì\u0001Î\u0099Ã&Å¿Æ+Ø ÝEßÕÐlÒö×véàêkï\u0016á\u008aâ\fäþù?û«ü)þðóVõÕöa\u0088ô\u008db\u008fó\u0080§\u0085\u0019\u0087\u0090\u0098\u000f\u009a«\u009f$\u0091®\u0092V\u0094ë©M«Ë¬s®î\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¢Í%Ê¯ÈVÅõÃAÀì¾f»á¹e¶\u0002³¤±\u0000®\u0084¬2©¡\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÐÃKÀ÷¾s»Ä¹j¶+³\u009e±\b®\u0099\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È|ÅÐÃAÀó¾B»â¹H¶\u0014³\u0093±\r®©¬9©\u009e§)¤Ý¢J\u001a»ççàwâïïPéÉê]ôÖñ3ó£ü\u001aþ\u0080û\u0000Å\u0096Æ\u001dÃ`ÍüÎzÈ\u0088ÕI×ÝÐ_Ò\u008bß'Ù¹Ú\u0013¤\u0087¡\u0014£\u0090¬ê©p«ô".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1261);
            f864 = cArr;
            f865 = 6327416800644824439L;
        }

        e(ChartboostDelegate chartboostDelegate, ch chVar) {
            this.f868 = chartboostDelegate;
            this.f867 = chVar;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ChartboostDelegate m5173() {
            int i10 = f862;
            int i11 = i10 + 79;
            f863 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            ChartboostDelegate chartboostDelegate = this.f868;
            f863 = (i10 + 89) % 128;
            return chartboostDelegate;
        }

        public void didCacheInPlay(String str) {
            f863 = (f862 + 93) % 128;
            bj.this.m5106(this, this.f867, m5174(1158 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 33).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f863 = (f862 + 63) % 128;
                chartboostDelegate.didCacheInPlay(str);
            }
            int i10 = f863 + 119;
            f862 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public void didCacheInterstitial(String str) {
            bj.this.m5106(this, this.f867, m5174((-16777128) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41093), 39 - TextUtils.indexOf("", "")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f862 + 45;
                f863 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCacheInterstitial(str);
                if (i11 == 0) {
                    throw null;
                }
            }
            int i12 = f862 + 99;
            f863 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        public void didCacheMoreApps(String str) {
            f863 = (f862 + 55) % 128;
            bj.this.m5106(this, this.f867, m5174(413 - TextUtils.indexOf("", ""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f863 = (f862 + 55) % 128;
                chartboostDelegate.didCacheMoreApps(str);
            }
            f862 = (f863 + 55) % 128;
        }

        public void didCacheRewardedVideo(String str) {
            bj.this.m5106(this, this.f867, m5174((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 831, (char) (21066 - ExpandableListView.getPackedPositionGroup(0L)), 40 - Color.blue(0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f862 = (f863 + 19) % 128;
                chartboostDelegate.didCacheRewardedVideo(str);
            }
            int i10 = f863 + 57;
            f862 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public void didClickInterstitial(String str) {
            bj.this.m5106(this, this.f867, m5174(251 - (Process.myPid() >> 22), (char) (TextUtils.lastIndexOf("", '0') + 1), 39 - View.resolveSizeAndState(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f863 + 11;
                f862 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didClickInterstitial(str);
                if (i11 != 0) {
                    int i12 = 70 / 0;
                }
            }
            f863 = (f862 + 99) % 128;
        }

        public void didClickMoreApps(String str) {
            bj.this.m5106(this, this.f867, m5174(View.MeasureSpec.makeMeasureSpec(0, 0) + 600, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 21791), TextUtils.lastIndexOf("", '0') + 36).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f862 + 9;
                f863 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didClickMoreApps(str);
                if (i11 == 0) {
                    throw null;
                }
            }
            f862 = (f863 + 17) % 128;
        }

        public void didClickRewardedVideo(String str) {
            f862 = (f863 + 75) % 128;
            bj.this.m5106(this, this.f867, m5174((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 997, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 60422), 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f862 + 61;
                f863 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didClickRewardedVideo(str);
                if (i11 == 0) {
                    throw null;
                }
            }
        }

        public void didCloseInterstitial(String str) {
            f863 = (f862 + 45) % 128;
            bj.this.m5106(this, this.f867, m5174(260 - AndroidCharacter.getMirror('0'), (char) (35398 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 39 - ExpandableListView.getPackedPositionType(0L)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseInterstitial(str);
                f863 = (f862 + 123) % 128;
            }
        }

        public void didCloseMoreApps(String str) {
            bj.this.m5106(this, this.f867, m5174((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 565, (char) KeyEvent.keyCodeFromString(""), 35 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f863 = (f862 + 103) % 128;
                chartboostDelegate.didCloseMoreApps(str);
                f863 = (f862 + 43) % 128;
            }
            f863 = (f862 + 87) % 128;
        }

        public void didCloseRewardedVideo(String str) {
            f863 = (f862 + 47) % 128;
            bj.this.m5106(this, this.f867, m5174(958 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 3907), (ViewConfiguration.getPressedStateDuration() >> 16) + 40).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f862 + 81;
                f863 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCloseRewardedVideo(str);
                if (i11 == 0) {
                    throw null;
                }
            }
            int i12 = f862 + 65;
            f863 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        public void didCompleteInterstitial(String str) {
            f863 = (f862 + 103) % 128;
            bj.this.m5106(this, this.f867, m5174(View.MeasureSpec.getMode(0) + 331, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f863 + 115;
                f862 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCompleteInterstitial(str);
                if (i11 != 0) {
                    throw null;
                }
            }
            int i12 = f862 + 99;
            f863 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        public void didCompleteRewardedVideo(String str, int i10) {
            bj.this.m5106(this, this.f867, m5174(1038 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 43 - View.getDefaultSize(0, 0)).intern(), str, Integer.valueOf(i10));
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f863 = (f862 + 95) % 128;
                chartboostDelegate.didCompleteRewardedVideo(str, i10);
            }
            f863 = (f862 + 107) % 128;
        }

        public void didDismissInterstitial(String str) {
            f863 = (f862 + 19) % 128;
            bj.this.m5106(this, this.f867, m5174(170 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((Process.myTid() >> 22) + 24434), 41 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDismissInterstitial(str);
            }
            int i10 = f863 + 41;
            f862 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public void didDismissMoreApps(String str) {
            f863 = (f862 + 117) % 128;
            bj.this.m5106(this, this.f867, m5174(527 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ExpandableListView.getPackedPositionType(0L) + 39409), 37 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f863 = (f862 + 61) % 128;
                chartboostDelegate.didDismissMoreApps(str);
            }
            int i10 = f863 + 103;
            f862 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public void didDismissRewardedVideo(String str) {
            f862 = (f863 + 13) % 128;
            bj.this.m5106(this, this.f867, m5174((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 915, (char) (Process.getGidForName("") + 61130), (-16777174) - Color.rgb(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f862 + 19;
                f863 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didDismissRewardedVideo(str);
                if (i11 == 0) {
                    int i12 = 98 / 0;
                }
            }
            int i13 = f862 + 21;
            f863 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 32 / 0;
            }
        }

        public void didDisplayInterstitial(String str) {
            bj.this.m5106(this, this.f867, m5174((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 290, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 41 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f862 = (f863 + 63) % 128;
                chartboostDelegate.didDisplayInterstitial(str);
            }
            int i10 = f862 + 123;
            f863 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didDisplayMoreApps(String str) {
            f863 = (f862 + 91) % 128;
            bj.this.m5106(this, this.f867, m5174((ViewConfiguration.getJumpTapTimeout() >> 16) + 635, (char) View.resolveSizeAndState(0, 0, 0), 37 - Color.argb(0, 0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f863 + 13;
                f862 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didDisplayMoreApps(str);
                if (i11 != 0) {
                    int i12 = 43 / 0;
                }
                f863 = (f862 + 9) % 128;
            }
        }

        public void didDisplayRewardedVideo(String str) {
            bj.this.m5106(this, this.f867, m5174(Color.blue(0) + 1081, (char) (13965 - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionChild(0L) + 43).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f862 = (f863 + 63) % 128;
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
            int i10 = f862 + 67;
            f863 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            bj.this.m5106(this, this.f867, m5174((ViewConfiguration.getPressedStateDuration() >> 16) + 1191, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "", 0) + 38).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f862 = (f863 + 99) % 128;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                f863 = (f862 + 85) % 128;
            }
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            f862 = (f863 + 65) % 128;
            bj.this.m5106(this, this.f867, m5174((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, (char) View.MeasureSpec.getMode(0), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f863 + 29;
                f862 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                if (i11 != 0) {
                    throw null;
                }
            }
            f862 = (f863 + 39) % 128;
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            f862 = (f863 + 19) % 128;
            bj.this.m5106(this, this.f867, m5174((Process.myPid() >> 22) + 488, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 57119), 40 - View.MeasureSpec.getMode(0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                int i10 = f862 + 31;
                f863 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                if (i11 == 0) {
                    throw null;
                }
            }
            int i12 = f862 + 39;
            f863 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            f863 = (f862 + 71) % 128;
            bj.this.m5106(this, this.f867, m5174(TextUtils.getOffsetBefore("", 0) + 871, (char) (39864 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.argb(0, 0, 0, 0) + 45).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
            }
            f863 = (f862 + 31) % 128;
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            f862 = (f863 + 75) % 128;
            bj.this.m5106(this, this.f867, m5174((ViewConfiguration.getTapTimeout() >> 16) + 672, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 61264), 40 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
            }
            int i10 = f862 + 51;
            f863 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didInitialize() {
            bj.this.m5106(this, this.f867, m5174((KeyEvent.getMaxKeyCode() >> 16) + 1229, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6905), (ViewConfiguration.getTouchSlop() >> 8) + 32).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f862 = (f863 + 29) % 128;
                chartboostDelegate.didInitialize();
                f862 = (f863 + 63) % 128;
            }
            int i10 = f862 + 29;
            f863 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            f862 = (f863 + 39) % 128;
            bj.this.m5106(this, this.f867, m5174(710 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (14310 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.getMode(0) + 47).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m5174(MotionEvent.axisFromString("") + 759, (char) (ExpandableListView.getPackedPositionType(0L) + 50058), 27 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), Activity.class).invoke(this.f868, activity);
                    f862 = (f863 + 39) % 128;
                    return;
                } catch (Throwable unused) {
                }
            }
            int i10 = f862 + 47;
            f863 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public boolean shouldDisplayInterstitial(String str) {
            f862 = (f863 + 13) % 128;
            bj.this.m5106(this, this.f867, m5174(43 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 44).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f862 = (f863 + 109) % 128;
                return chartboostDelegate.shouldDisplayInterstitial(str);
            }
            int i10 = f862 + 3;
            f863 = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public boolean shouldDisplayMoreApps(String str) {
            f862 = (f863 + 97) % 128;
            bj.this.m5106(this, this.f867, m5174(448 - Drawable.resolveOpacity(0, 0), (char) (18364 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate == null) {
                return false;
            }
            f863 = (f862 + 77) % 128;
            boolean zShouldDisplayMoreApps = chartboostDelegate.shouldDisplayMoreApps(str);
            int i10 = f863 + 101;
            f862 = i10 % 128;
            if (i10 % 2 == 0) {
                return zShouldDisplayMoreApps;
            }
            throw null;
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            f863 = (f862 + 89) % 128;
            bj.this.m5106(this, this.f867, m5174(785 - TextUtils.indexOf((CharSequence) "", '0'), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 45).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                return chartboostDelegate.shouldDisplayRewardedVideo(str);
            }
            f863 = (f862 + 61) % 128;
            return false;
        }

        public boolean shouldRequestInterstitial(String str) {
            f862 = (f863 + 25) % 128;
            bj.this.m5106(this, this.f867, m5174(Color.red(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 43 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f863 = (f862 + 123) % 128;
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            f863 = (f862 + 39) % 128;
            return false;
        }

        public boolean shouldRequestMoreApps(String str) {
            f862 = (f863 + 73) % 128;
            bj.this.m5106(this, this.f867, m5174(Process.getGidForName("") + 374, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 24478), 40 - View.resolveSizeAndState(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f863 = (f862 + 79) % 128;
                return chartboostDelegate.shouldRequestMoreApps(str);
            }
            f862 = (f863 + 41) % 128;
            return false;
        }

        public void willDisplayVideo(String str) {
            f863 = (f862 + 103) % 128;
            bj.this.m5106(this, this.f867, m5174((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1122, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ExpandableListView.getPackedPositionGroup(0L) + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f868;
            if (chartboostDelegate != null) {
                f862 = (f863 + 29) % 128;
                chartboostDelegate.willDisplayVideo(str);
                f863 = (f862 + 41) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ChartboostDelegate mo5030() {
            f863 = (f862 + 69) % 128;
            ChartboostDelegate chartboostDelegateM5173 = m5173();
            f862 = (f863 + 115) % 128;
            return chartboostDelegateM5173;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5174(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1677) {
                try {
                    char[] cArr = new char[i11];
                    d.f1676 = 0;
                    while (true) {
                        int i12 = d.f1676;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f864[i10 + i12]) ^ (((long) i12) * f865)) ^ ((long) c10));
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

    public bj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m5153() {
        int i10 = f849 + 97;
        f847 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5154() instanceof e;
        }
        int i11 = 70 / 0;
        return m5154() instanceof e;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Object m5154() {
        f847 = (f849 + 27) % 128;
        com.chartboost.sdk.a delegate = b1.b.getDelegate();
        f847 = (f849 + 95) % 128;
        return delegate;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static Object m5155() {
        f849 = (f847 + 33) % 128;
        f1.o oVar = com.chartboost.sdk.g.d;
        f849 = (f847 + 35) % 128;
        return oVar;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m5156() {
        f849 = (f847 + 7) % 128;
        boolean zIsWebViewEnabled = b1.b.isWebViewEnabled();
        f847 = (f849 + 29) % 128;
        return zIsWebViewEnabled;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ boolean m5157() {
        int i10 = f847 + 23;
        f849 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5156();
        }
        m5156();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Object m5158() {
        f847 = (f849 + 73) % 128;
        Object objM5155 = m5155();
        f849 = (f847 + 41) % 128;
        return objM5155;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ Object m5159() {
        f847 = (f849 + 53) % 128;
        Object objM5154 = m5154();
        f847 = (f849 + 79) % 128;
        return objM5154;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5163(CBInPlay cBInPlay) {
        f847 = (f849 + 43) % 128;
        String strM5161 = m5161(cBInPlay);
        f847 = (f849 + 101) % 128;
        return strM5161;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5167(ChartboostDelegate chartboostDelegate) {
        f849 = (f847 + 75) % 128;
        m5162(chartboostDelegate);
        int i10 = f847 + 7;
        f849 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 19 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ e m5169(bj bjVar, ChartboostDelegate chartboostDelegate, ch chVar) {
        f849 = (f847 + 97) % 128;
        e eVarM5160 = bjVar.m5160(chartboostDelegate, chVar);
        int i10 = f847 + 71;
        f849 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 15 / 0;
        }
        return eVarM5160;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5171(CBInPlay cBInPlay) {
        f847 = (f849 + 91) % 128;
        String strM5165 = m5165(cBInPlay);
        int i10 = f847 + 1;
        f849 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
        return strM5165;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5166(new int[]{203, 13, 2, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bj.m5164(bj.this, chVar);
                return null;
            }
        });
        map.put(m5166(new int[]{Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 21, 195, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bj.m5159();
            }
        });
        map.put(m5166(new int[]{237, 27, 104, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bj.m5158();
            }
        });
        map.put(m5166(new int[]{264, 26, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bj.m5169(bj.this, (ChartboostDelegate) list.get(0), chVar);
            }
        });
        map.put(m5170("显浵̆滬क़劵♺譔칁᷽䍾줂轏삓핝蓧蝎\uf17e\uf4aa䴿\ue876", (char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", 35602157 - KeyEvent.normalizeMetaState(0), "\uedacἾᄂ骃").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bj.m5167((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m5166(new int[]{290, 16, 126, 1}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bj.m5157());
            }
        });
        map.put(m5166(new int[]{306, 11, 120, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bj.m5163((CBInPlay) list.get(0));
            }
        });
        map.put(m5170("쐍ﲗ\ue1d5귖浳㊎鄪⻩릂ᓼ", (char) KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "敁㨐㡕\u1ad8").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bj.m5171((CBInPlay) list.get(0));
            }
        });
        map.put(m5166(new int[]{317, 12, 0, 5}, "\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bj.m5172(bj.this));
            }
        });
        int i10 = f847 + 83;
        f849 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5164(bj bjVar, ch chVar) {
        int i10 = f847 + 39;
        f849 = i10 % 128;
        int i11 = i10 % 2;
        bjVar.m5168(chVar);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m5168(ch chVar) {
        f847 = (f849 + 85) % 128;
        m5162(m5160((ChartboostDelegate) m5154(), chVar));
        int i10 = f849 + 123;
        f847 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 17 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5170(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f851) ^ ((long) f850)) ^ ((long) f852));
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
    static /* synthetic */ boolean m5172(bj bjVar) {
        int i10 = f849 + 5;
        f847 = i10 % 128;
        if (i10 % 2 == 0) {
            m5153();
            throw null;
        }
        boolean zM5153 = m5153();
        f849 = (f847 + 43) % 128;
        return zM5153;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5165(CBInPlay cBInPlay) {
        f849 = (f847 + 31) % 128;
        String appName = cBInPlay.getAppName();
        int i10 = f849 + 55;
        f847 = i10 % 128;
        if (i10 % 2 != 0) {
            return appName;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f849 = (f847 + 11) % 128;
        try {
            String strE = b1.b.e();
            int i10 = f849 + 23;
            f847 = i10 % 128;
            if (i10 % 2 != 0) {
                return strE;
            }
            throw null;
        } catch (Error unused) {
            return m5170("镋\ud964鉎鐙秬", (char) (8752 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", TextUtils.indexOf((CharSequence) "", '0') - 122362581, "⪲듥⿸\ue322").intern();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    final Class mo5026(String str) {
        f849 = (f847 + 63) % 128;
        int iHashCode = str.hashCode();
        byte b10 = Ascii.VT;
        byte b11 = 2;
        switch (iHashCode) {
            case -1602236458:
                if (!str.equals(m5170("ᎉ\ueee7ภ㝱䑖⇙닄\ue8db\ufaf3稍ꔗ㣖\ued6d㲎ᣝྏ罳ᐃ\ue5e6귞궠㵐\udd4e蓦蔷\uf83d䃲", (char) (TextUtils.indexOf("", "", 0, 0) + 56712), "\u0000\u0000\u0000\u0000", (-712000525) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\uf301辻裕៝").intern())) {
                    b10 = -1;
                } else {
                    int i10 = f847 + 23;
                    f849 = i10 % 128;
                    b10 = i10 % 2 == 0 ? (byte) 6 : (byte) 33;
                }
                break;
            case -1251618628:
                b10 = !str.equals(m5166(new int[]{135, 24, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -921117961:
                b10 = !str.equals(m5170("䘨돰鍵䣛⣆遠䷳ⶴ\u0ab4⛌䩷嶨遘䕷쵤貴떜ꉊ㑎띖", (char) TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "휒븰挵씫").intern()) ? (byte) -1 : (byte) 1;
                break;
            case -869710636:
                b10 = !str.equals(m5166(new int[]{0, 18, 0, 13}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", false).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -513187163:
                b10 = !str.equals(m5170("瘾睴펛ኼᆞ䮇枃䁞៳ຍ", (char) Color.red(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getLongPressTimeout() >> 16, "⽑㕻잩怤").intern()) ? (byte) -1 : b11;
                break;
            case -416101408:
                if (!str.equals(m5166(new int[]{43, 26, 10, 2}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f847 + 27;
                    f849 = i11 % 128;
                    b11 = i11 % 2 != 0 ? (byte) 111 : (byte) 7;
                }
                break;
            case -371244199:
                b10 = !str.equals(m5166(new int[]{18, 11, 27, 4}, null, true).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -352872024:
                if (!str.equals(m5170("婔职ᥓ\uf657璘蔝柅婜쟵鋔", (char) Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000\u0000\u0000", Color.green(0), "\ud96b㈞黓섪").intern())) {
                    b10 = -1;
                } else {
                    f849 = (f847 + 41) % 128;
                    b10 = Ascii.FF;
                }
                break;
            case -305846637:
                if (!str.equals(m5170("⾁⤷\ueed6\uf670\ue360Җ䅶\ue13c₨깞㱉郼\uf5de醇搊쾒", (char) (55362 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetAfter("", 0), "贑\ud9e0䋇俘").intern())) {
                    b10 = -1;
                } else {
                    int i12 = f849 + 7;
                    f847 = i12 % 128;
                    b10 = i12 % 2 != 0 ? Ascii.SI : (byte) 121;
                }
                break;
            case -221039695:
                b10 = !str.equals(m5166(new int[]{115, 20, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", false).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -174936018:
                if (!str.equals(m5170("ᑚ⺛⸣섧ړ\uefed\ue433걫", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "ஹ\uf68d퐞宧").intern())) {
                    b10 = -1;
                } else {
                    f847 = (f849 + 25) % 128;
                }
                break;
            case 2115:
                b10 = !str.equals(m5170("✮ꛂ", (char) (Color.blue(0) + 29239), "\u0000\u0000\u0000\u0000", Process.myPid() >> 22, "웣흚㝪婲").intern()) ? (byte) -1 : (byte) 9;
                break;
            case 296803428:
                b10 = !str.equals(m5170("\u2dd7䌱鎭ᜟᤚ빤ጓ梊嶽盏퇉刾䖉㥵眈䈑창ꣁ翔돾띑", (char) (Color.rgb(0, 0, 0) + 16777216), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0) - 1622857353, "瞾䔩讟餂").intern()) ? (byte) -1 : (byte) 13;
                break;
            case 544981520:
                b10 = !str.equals(m5166(new int[]{159, 44, 0, 6}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 604162924:
                b10 = !str.equals(m5166(new int[]{69, 46, 95, 33}, null, true).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 650412337:
                b10 = !str.equals(m5166(new int[]{29, 14, 73, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", true).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 753858215:
                b10 = !str.equals(m5170("恐\udedf梻冇㚭睎ꈾ阈릱㔏ቺ齸蓞", (char) (ExpandableListView.getPackedPositionGroup(0L) + 57456), "\u0000\u0000\u0000\u0000", (KeyEvent.getMaxKeyCode() >> 16) - 858836275, "춆켲烌ˠ").intern()) ? (byte) -1 : (byte) 16;
                break;
            case 769047372:
                b10 = !str.equals(m5170("\udc2cေ娋娇ꪨᷝ硽䅮\ua63f\ue39d\u1f5c퉻", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "\uf87c㝷쒦\uf358").intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1443881784:
                b10 = !str.equals(m5170("\ue252\uea0fࡠ줤籅ᅗ隅䢄", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "⩤厩㢄\ue6d0").intern()) ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return ChartboostActivity.class;
            case 1:
                return CBImpressionActivity.class;
            case 2:
                return b1.b.class;
            case 3:
                return CBInPlay.class;
            case 4:
                return Chartboost.CBMediation.class;
            case 5:
                return MediationModel.class;
            case 6:
                return e.class;
            case 7:
            case 8:
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case 9:
                return c1.a.class;
            case 10:
                return c1.c.class;
            case 11:
                return c1.d.class;
            case 12:
                return d1.a.class;
            case 13:
                return d1.c.class;
            case 14:
                return d1.d.class;
            case 15:
                return d1.e.class;
            case 16:
                return d1.f.class;
            case 17:
            case 18:
                return com.chartboost.sdk.view.CBImpressionActivity.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5166(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f848, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private e m5160(ChartboostDelegate chartboostDelegate, ch chVar) {
        e eVar = new e(chartboostDelegate, chVar);
        f847 = (f849 + 69) % 128;
        return eVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5162(ChartboostDelegate chartboostDelegate) {
        int i10 = f847 + 33;
        f849 = i10 % 128;
        int i11 = i10 % 2;
        b1.b.setDelegate(chartboostDelegate);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f847 + 11;
        f849 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5161(CBInPlay cBInPlay) {
        f849 = (f847 + 93) % 128;
        String location = cBInPlay.getLocation();
        int i10 = f849 + 51;
        f847 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 77 / 0;
        }
        return location;
    }
}
