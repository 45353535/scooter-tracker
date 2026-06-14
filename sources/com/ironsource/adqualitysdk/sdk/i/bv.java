package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bv extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1069 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1070 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1071 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1072;

    static {
        char[] cArr = new char[1352];
        ByteBuffer.wrap("\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_,óÚ\u0088w\u001c7°ÓD\u009eÙ^mâ\u0001\u009f\u0096^*\u0014¾½Sjç\r{Å\u0010G¤68ÐÌ\u009aa4õø\u0089\u0094\u001eV{Úï\u0099SJÇz*ã\u009eK\u0002\u0001uõÙ³MP°Æ$²\u0088cóßg\u0099Ëy?*¢ò\u0016^z\u0012íðQìÅ\u0000(Ä\u009cº\u0000 kÞß\u008fCi·#\u001a\u008d\u008eAò-eÿÉ¢=\u0007 \u008b\u0014\u009bxmãÞW\u0084»l/.\u0092\u009f\u0006Yj3ÝýA]µ \u0018È\u008c£ða[ÇÏ\u008c3r§,\n³~\\â0Uû¹N-\u000f\u0090é\u0004\u0089h\u001aÓÂG\u008e«b\u001f,\u0082\u0086öZ\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*:¾®SXç\u000b{Ã\u0010o¤#8ÍÌ\u0087a;¬Ò8\u0091\u0084B\u0010rýëICÕ\t¢ý\u000e»\u009aXgÎóº_k$×°\u0091\u001cqè\"uúÁV\u00ad\u001a:ø\u0086ä\u0012\bÿÌK²×(¼Ö\b\u0087\u0094a`+Í\u0085YI%%²÷\u001eªê\u000fw\u0083Ã\u0093¯e4Ö\u0080\u008cldø&E\u0097ÑQ½;\nõ\u0096Ub'ÏÛ[³'`\u008cÎ\u0018\u0089äip-Ý\u009c©H5\u0016\u0082àntú\u0001GçÓ©¿\u0007\u0004×\u0090\u009b|e\u0080\u0003\u0014k¨º<ÂÑ\u0004e ùó\u008e\u0017\"[¶ûK9ß}s\u0097\b*\u009cp0¦ÄßY\u0011í\u00ad\u0081ö\u00160ªX>äÓ6gMû\u00ad\u0090 $~¸\u0097LÜázu\u009a\tÉ\u009e\u00112]Æñ[?ïU\u0083\u0089\u0018\u0000¬}@\u009fÔÙ¥¼1ÿ\u008d,\u0019\u001cô\u0085@-Üg«\u0093\u0007Õ\u00936n úÔV\u0005-¹¹ÿ\u0015\u001fáL|\u0094È8¤t3\u0096\u008f\u008a\u001bfö¢BÜÞFµ¸\u0001é\u009d\u000fiEÄëP',K»\u0099\u0017Äãa~íÊý¦\u000b=¸\u0089âe\nñHLùØ?´U\u0003\u009b\u009f;k]Æ©RÒ.\n\u0085\u009e\u0011áí\u0011yOÔö \u001e<P\u008b\u008eg>ócN\u00adÚÂ¶~\r©\u0099äu\u0000Áb\\÷(1\u0084_\u0013\u0091ï1{}Ö\u0083¢è>s\u0095¿aÛ\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_$óÐ\u0088P\u001c\"°ÎD\u0084\u0017\u009d\u0083õ?$«\\F\u009aò>nm\u0019\u0089µÅ!eÜ§Hðä\u0004\u009f\u0085\u000bã§\u0004SQÎ\u008ez)\u0016}\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_$óÐ\u0088Q\u001c7°ÏD\u0094ÙZmü\u0001¸\u0096^\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_(óÑ\u0088g\u001c;°ÀD\u0084ÙVmá\u0001³\u0096b*\u001a¾§S|EgÑ móù¬\u0014| Ã<\u009dK`ç\u001bs\u0088\u008eV\u001a*¶ýÍHY\u000e\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_&óÛ\u0088m\u001c&°ÄD\u009eÙKmÍ\u0001²\u0096B*\u000f¾¸Svç\u0004{Û\u0010c¤'\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_0óÚ\u0088j\u001c&°âD\u009fÙQmú\u0001¯\u0096C*\u0017¾¦S|ç\u001aå\u0092qúÍ+YS´\u0095\u00001\u009cbë\u0086GÊÓj.¨ºÿ\u0016\u000bm\u008eùàU\u001f¡\\<±\u0088;äos\u0083Ïã[~¶¬\u0002Ç\u009e\u001eõ²AâÝ\u0013)M\u0084ëDËÐ¿liø\u0007\u0015æ¡|=7JÇæ\u008ar8\u008fñ\u001b¯·SÌíX©\u0000E\u00949(û¼\u0083QHåøy\u0096\u000e@¢\u000b6³Ës_\u000bóÑ\u0088q\u0000R\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*-¾£S}ç\r{Ø\u0010E¤:8ÊÌ\u0087a'õÿ\u0089\u0094\u001el²\u0011F£Ûho\u0019\u0003Õ\u0098e,4ÀÂT\u0084\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*:¾®S\\ç\u001e{Ò\u0010h¤!8×Ì¿a+õâ\u0089\u0094\u001eJ²\u0010F¨Ûnªm>\u001d\u0082Á\u0016³ûhOóÓ\u008e¤|\b7\u009c\u0099aCõ*YÃ\"Q¶\u001a\u001aîî®sjÇÐ«\u0094\u0099B\r*±á%\u0083ÈE|îà°\u0097N;1¯¾RrÆ\u0019jÌ\u0011m\u0085+)æÝ\u0092@Gôñ\u0098³\u000fI³\u0015'³\u0000T\u0094.(î\u0002\u0004\u0096l*½¾ÅS\u0003ç§{ô\f\u0010 \\4üÉ>]nñ\u008c\u008a\"\u001es²\u009fFÞÛ\u0000o¦\u0003õ\u0094\u000f(w¼ãQ\u0011åSy\u009f\u0012%¦l:\u009aÎòcf÷¯\u008bÙ\u001c\u0007°]DåÙ#mg\u0001\u0093\u009a%.eÂ\u009eVÞëzîJz\"ÆóR\u008b¿M\u000bé\u0097ºà^L\u0012Ø²%p± \u001dÂflò=^Ñª\u00907N\u0083èï»xAÄ-P§½s\t\u001f\u0095÷þjJ8ÖÓ\"\u0082\u008f.\u001bþg\u008fðI\\\u000f\u0091·\u0005ß¹\u000e-vÀ°t\u0014èG\u009f£3ï§OZ\u008dÎÚb.\u0019«\u008dÅ!:ÕyH\u0097ü\u0019\u0090G\u0007·»ê/wÂ\u0088vøê=\u0081\u009d5Å©.]NðÓd\u0001\u0018j\u008f£#ï×_J\u008eþð\u00926\u0000E\u00949(û¼\u0083QHåøy\u0096\u000e@¢\u000b6³Ës_\u000bóÑ\u0088q\u001c\u0013°ÅD\u0091ÙOmú\u0001¸\u0096^ðâd\u0092ØNL<¡ç\u0015|\u0089\u0001þóR¸Æ\u0016;Ì¯¥\u0003LxÞì\u0095@a´!)å\u009d_ñ\u001bfÙÚ«N\u001f£Ý\u0017¨\u008bfàÀ\u0000I\u0094\u000e(Ó¼\u009fQ]åây¾\u000eb¢\u00116³\u0000I\u0094\u000e(ó¼\u009fQ]åây¾\u000e~¢\u001d6¥Ë@_\fóÑ\u0088t\u001c\u0011°ÎD\u009eÙKmü\u0001²\u0096@*\u0017¾¯Sk\u000e£\u009aä&\"²n_²ë\u0004w_\u0000\u0088¬û8Y\u0000I\u0094\"(î¼\u009fQYåøy©\u000e@¢\u00176©ËR_\u0004óÀ\u0088b\u0095:\u0001}½\u009f)÷Ä,p\u0090ìä\u009b?7o£Ý^\u0004Ê@f®\u001d\u0014\u0089D%½ÑÕL%ø\u0098\u0094Ù\u0000B\u0094.(í¼\u0088Qjåây¾\u000eL¢\u00176\u0091Ë\u007f_\u0000óÃ\u0088O\u001c;°ÒD\u0084ÙZmà\u0001¸\u0096^\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*:¾®S\\ç\u001e{Ò\u0010h¤!8×Ì¿a+õâ\u0089\u0094\u001eJ²\u0010F¨Ûno<\u0003Ó\u0098},0ÀîT\u009bé5}æ\u0011\u0086¦A:òÎ¹cp÷\u0000\u008bù m´/HË\t4\u009d\\!\u008dµõX3ì\u0097pÄ\u0007 «l?ÌÂ\u000eVYú\u00ad\u0081(\u0015F¹¹MúÐ\u0007d\u0085\bÅ\u009f?#r·ÄZ(î|r¹\u0019\u000f\u00adM1·ÅëhMü»\u0080ô\u0017&»kOùÒ\fff\nµ\u0091\u0011%VÉ©]âàWt\u0087\u0018Ú¯.3\u0088ÇÌ\u0000g\u0094*(ê¼®QIåùy¨\u000eL¢\u00166³ËF_\u0017óÛ\u0088`\u001c7°ÒD\u0083ÙZmê\u0001\u008f\u0096I*\n¾¿S|ç\u001b{Ã\u001c¨\u0088å4% qM\u0083ù+ea\u0012¯¾Ó\u0000g\u0094*(ê¼¬QXåÈyµ\u000eG¢\f6¢Ëx_\u0011/¢»÷\u0007\u0013\u0093S~\u009bÊ,Vb!\u0081\u008dÁ\u0019iä¸pÀÜ>§¬Â\u0090VÅê1~}\u0093¡'\u0017»LÌ\u0091`å1\u008a¥Ç\u0019\u0007\u008dC`½Ô\u000fHT?¯\u0093Á\u0007Bú\u0089nçÂ,¹\u0089-×\u0081\u0019uoè¾\u0000g\u0094*(ê¼¡Q]åòyµ\u000e\\¢\f® :m\u0086\u00ad\u0012ùÿ\u001eK ×ø \r\fK\u0098åe5ñw]\u009d&-²a\u001e¥êØw\u0016Ã½¯è8\u0004\u0084P\u0010áý;I]MôÙ¹eyñ-\u001cÊ¨t4,CÙï\u009f{1\u0086á\u0012µ¾HÅþQµýW\t\r\u0094Ø ^L!ÛÑg\u009có+\u001eåª\u00976H]ðé´\u0000g\u0094*(ê¼¨QJåîy´\u000e]¢\u000b6\u008bË\u007f_\u0016óÀ\u0088f\u001c<°ÄD\u0082\u0000s\u0094*(ê¼¨QJåîy´\u000e]¢\u000b6\u008bË\u007f_\u0016óÀ\u0088f\u001c<°ÄD\u0082/\u0011»\\\u0007\u009c\u0093Ú~.Ê®VÜ!0\u008dzÆPR\u001dîÝz\u008f\u0097e#Õ¿\u0099ÈZd&ð\u0083\rQ\u0099>5âNMÚ1vï\u0082·\u001fm«üÇ\u0084Pnì!\u0000g\u0094*(ê¼ QNåêy³\u000eM¢:6¦Ëx_\u000bóÑ\u0088q\u001c\u0004°ÈD\u0095ÙHmÇ\u0001¹»#/n\u0093®\u0007àê\u0015^¿Âìµ\b\u0019O\u008dðp;äNH\u009e3\u0003§w\u000b\u0091ÿÕb?Ö¥ºô-\t\u0091V\u0005à\u009e\u0015\n]¶\u0096\"ôÏ2{\u0084çÒ\u0090<<p¨ÒU\u000bÁuà\u0097tÕÈ\u000b\\r±´\u0005\u0013\u0099@î¢Bæ2Î¦\u009e\u001aX\u008e-cë«~?2\u0083ì\u0017\u009fúENå\u0000R\u0094\n(É¼¬QnåÏy\u009f\u000emµþ!³\u009df\t\u0001äÃPc\u0016\u0088\u0082Ô>\u0012ªgG«ó\u0016oE\u0018»\u0000D\u0094\n(Ø¼¬QiåÇy\u008e".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1352);
        f1069 = cArr;
        f1072 = -2745927091437923249L;
    }

    public bv(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m5453(InneractiveAdSpot inneractiveAdSpot) {
        f1070 = (f1071 + 23) % 128;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        int i10 = f1071 + 107;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return clickThroughUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static InneractiveUnitController m5454(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1071 + 65;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return inneractiveAdSpot.getSelectedUnitController();
        }
        inneractiveAdSpot.getSelectedUnitController();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ int m5455() {
        f1071 = (f1070 + 61) % 128;
        int iM5457 = m5457();
        int i10 = f1070 + 41;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return iM5457;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static InneractiveAdRequest m5458(InneractiveAdSpot inneractiveAdSpot) {
        f1070 = (f1071 + 95) % 128;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        int i10 = f1071 + 91;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return currentProcessedRequest;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Object m5460(InneractiveAdSpot inneractiveAdSpot) {
        f1071 = (f1070 + 87) % 128;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        int i10 = f1071 + 111;
        f1070 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 80 / 0;
        }
        return adContent;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ InneractiveUnitController m5461(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1071 + 3;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5454(inneractiveAdSpot);
        }
        m5454(inneractiveAdSpot);
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean m5462(InneractiveAdSpot inneractiveAdSpot) {
        f1070 = (f1071 + 45) % 128;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        f1071 = (f1070 + 51) % 128;
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ InneractiveContentController.EventsListener m5464(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f1070 = (f1071 + 7) % 128;
        InneractiveContentController.EventsListener eventsListenerM5479 = m5479(inneractiveFullscreenVideoContentController);
        int i10 = f1070 + 65;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return eventsListenerM5479;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Enum m5469(String str) {
        int i10 = f1071 + 89;
        f1070 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM5459 = m5459(str);
        if (i11 != 0) {
            int i12 = 15 / 0;
        }
        int i13 = f1070 + 91;
        f1071 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 97 / 0;
        }
        return enumM5459;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ InneractiveAdRequest m5472(InneractiveAdSpot inneractiveAdSpot) {
        f1071 = (f1070 + 93) % 128;
        InneractiveAdRequest inneractiveAdRequestM5458 = m5458(inneractiveAdSpot);
        int i10 = f1071 + 7;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return inneractiveAdRequestM5458;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5476(InneractiveAdSpot inneractiveAdSpot) {
        f1071 = (f1070 + 61) % 128;
        String strM5453 = m5453(inneractiveAdSpot);
        int i10 = f1070 + 113;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5453;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ InneractiveAdSpot m5478(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        f1070 = (f1071 + 51) % 128;
        InneractiveAdSpot inneractiveAdSpotM5463 = m5463(inneractiveAdViewUnitController);
        f1071 = (f1070 + 79) % 128;
        return inneractiveAdSpotM5463;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean m5456(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1071 + 29;
        f1070 = i10 % 128;
        int i11 = i10 % 2;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        if (i11 != 0) {
            adContent.isFullscreenAd();
            throw null;
        }
        boolean zIsFullscreenAd = adContent.isFullscreenAd();
        f1070 = (f1071 + 37) % 128;
        return zIsFullscreenAd;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int m5457() {
        int i10 = f1070 + 53;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return R.id.inneractive_webview_mraid;
        }
        int i11 = 21 / 0;
        return R.id.inneractive_webview_mraid;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Enum m5459(String str) {
        byte b10 = -1;
        byte b11 = 2;
        switch (str.hashCode()) {
            case -2032180703:
                b11 = 7;
                if (str.equals(m5474(View.getDefaultSize(0, 0) + 1345, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.alpha(0) + 7).intern())) {
                    b10 = b11;
                }
                break;
            case -1841345251:
                if (str.equals(m5474(1331 - Color.argb(0, 0, 0, 0), (char) (46510 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6).intern())) {
                    b10 = 5;
                }
                break;
            case -1372958932:
                if (str.equals(m5474((-16775925) - Color.rgb(0, 0, 0), (char) (40540 - View.MeasureSpec.getSize(0)), Color.alpha(0) + 12).intern())) {
                    int i10 = f1070;
                    int i11 = i10 + 93;
                    f1071 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 1 : (byte) 0;
                    f1071 = (i10 + 121) % 128;
                }
                break;
            case -1201514634:
                if (str.equals(m5474(1337 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf("", "") + 5854), TextUtils.indexOf("", "", 0) + 8).intern())) {
                    f1070 = (f1071 + 55) % 128;
                    b10 = 6;
                }
                break;
            case -77725029:
                if (str.equals(m5474(MotionEvent.axisFromString("") + 1304, (char) (57563 - TextUtils.indexOf("", "", 0)), (Process.myPid() >> 22) + 9).intern())) {
                    b10 = 1;
                }
                break;
            case 73622449:
                if (str.equals(m5474(Color.alpha(0) + 1312, (char) (TextUtils.getTrimmedLength("") + 12931), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4).intern())) {
                    f1071 = (f1070 + 105) % 128;
                    b10 = b11;
                }
                break;
            case 543046670:
                if (str.equals(m5474(1323 - TextUtils.getTrimmedLength(""), (char) View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionType(0L) + 8).intern())) {
                    f1070 = (f1071 + 61) % 128;
                    b10 = 4;
                }
                break;
            case 1951953708:
                if (str.equals(m5474(1317 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43836), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6).intern())) {
                    f1070 = (f1071 + 51) % 128;
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
                return UnitDisplayType.INTERSTITIAL;
            case 1:
                return UnitDisplayType.LANDSCAPE;
            case 2:
                return UnitDisplayType.MRECT;
            case 3:
                return UnitDisplayType.BANNER;
            case 4:
                return UnitDisplayType.REWARDED;
            case 5:
                return UnitDisplayType.SQUARE;
            case 6:
                return UnitDisplayType.VERTICAL;
            case 7:
                return UnitDisplayType.DEFAULT;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m5466(InneractiveAdSpot inneractiveAdSpot) {
        f1070 = (f1071 + 95) % 128;
        Object objM5460 = m5460(inneractiveAdSpot);
        int i10 = f1071 + 105;
        f1070 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 63 / 0;
        }
        return objM5460;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Object m5470(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        f1071 = (f1070 + 87) % 128;
        Object objM5465 = m5465(inneractiveFullscreenAdActivity);
        f1070 = (f1071 + 103) % 128;
        return objM5465;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5475(InneractiveAdRequest inneractiveAdRequest) {
        f1070 = (f1071 + 103) % 128;
        String spotId = inneractiveAdRequest.getSpotId();
        int i10 = f1070 + 15;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return spotId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5477(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i10 = f1070 + 53;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        inneractiveContentController.setEventsListener(eventsListener);
        if (i11 == 0) {
            int i12 = 77 / 0;
        }
        int i13 = f1070 + 15;
        f1071 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Object m5480(InneractiveUnitController inneractiveUnitController) {
        f1070 = (f1071 + 31) % 128;
        Object objM5473 = m5473(inneractiveUnitController);
        f1070 = (f1071 + 7) % 128;
        return objM5473;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5468(InneractiveAdRequest inneractiveAdRequest) {
        f1070 = (f1071 + 65) % 128;
        String strM5475 = m5475(inneractiveAdRequest);
        f1071 = (f1070 + 35) % 128;
        return strM5475;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m5471(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1070 + 103;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM5456 = m5456(inneractiveAdSpot);
        if (i11 == 0) {
            int i12 = 90 / 0;
        }
        int i13 = f1071 + 93;
        f1070 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 1 / 0;
        }
        return zM5456;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m5473(InneractiveUnitController inneractiveUnitController) {
        f1070 = (f1071 + 43) % 128;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        int i10 = f1071 + 29;
        f1070 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 33 / 0;
        }
        return selectedContentController;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5481(ImpressionData impressionData) {
        int i10 = f1070 + 83;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        String strM5467 = m5467(impressionData);
        if (i11 == 0) {
            int i12 = 62 / 0;
        }
        return strM5467;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5474(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1069[i10 + i12]) ^ (((long) i12) * f1072)) ^ ((long) c10));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5482(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        f1071 = (f1070 + 103) % 128;
        m5477(inneractiveContentController, eventsListener);
        int i10 = f1071 + 67;
        f1070 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5474(TextUtils.indexOf("", "", 0, 0) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (char) (ViewConfiguration.getTouchSlop() >> 8), 26 - TextUtils.getOffsetBefore("", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5472((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5474(1059 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (7375 - TextUtils.getOffsetAfter("", 0)), KeyEvent.getDeadChar(0, 0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5468((InneractiveAdRequest) list.get(0));
            }
        });
        map.put(m5474(1068 - TextUtils.getTrimmedLength(""), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5466((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5474(KeyEvent.getDeadChar(0, 0) + 1080, (char) (12235 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bv.m5471((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m5474((ViewConfiguration.getPressedStateDuration() >> 16) + 1094, (char) (ExpandableListView.getPackedPositionChild(0L) + 49914), View.MeasureSpec.makeMeasureSpec(0, 0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bv.m5483((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m5474(TextUtils.getOffsetAfter("", 0) + 1103, (char) (12781 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 18 - Color.blue(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5476((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5474(TextUtils.indexOf("", "") + 1121, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5470((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        map.put(m5474(1129 - TextUtils.lastIndexOf("", '0'), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44615), 24 - TextUtils.lastIndexOf("", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5461((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5474(TextUtils.getOffsetAfter("", 0) + 1155, (char) (19859 - View.getDefaultSize(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5480((InneractiveUnitController) list.get(0));
            }
        });
        map.put(m5474(1183 - Color.argb(0, 0, 0, 0), (char) (Process.getGidForName("") + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5464((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        map.put(m5474(1200 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bv.m5482((InneractiveContentController) list.get(0), (VideoContentListener) list.get(1));
                return null;
            }
        });
        map.put(m5474(Color.rgb(0, 0, 0) + 16778433, (char) (12150 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), '9' - AndroidCharacter.getMirror('0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5478((InneractiveAdViewUnitController) list.get(0));
            }
        });
        map.put(m5474(((byte) KeyEvent.getModifierMetaStateMask()) + 1227, (char) (Color.green(0) + 50743), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5469((String) list.get(0));
            }
        });
        map.put(m5474(1248 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 20 - Drawable.resolveOpacity(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Integer.valueOf(bv.m5455());
            }
        });
        map.put(m5474(1316 - AndroidCharacter.getMirror('0'), (char) ((-16729276) - Color.rgb(0, 0, 0)), 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bv.m5481((ImpressionData) list.get(0));
            }
        });
        int i10 = f1070 + 43;
        f1071 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        int i10 = f1070 + 75;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return InneractiveAdManager.getVersion();
        }
        InneractiveAdManager.getVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m5483(InneractiveAdSpot inneractiveAdSpot) {
        f1071 = (f1070 + 81) % 128;
        boolean zM5462 = m5462(inneractiveAdSpot);
        int i10 = f1071 + 61;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM5462;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0126  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bv.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Object m5465(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i10 = f1070 + 31;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        if (i11 == 0) {
            int i12 = 85 / 0;
        }
        f1070 = (f1071 + 89) % 128;
        return layout;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static InneractiveAdSpot m5463(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        f1070 = (f1071 + 21) % 128;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        int i10 = f1071 + 81;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return adSpot;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5467(ImpressionData impressionData) {
        int i10 = f1071 + 81;
        f1070 = i10 % 128;
        int i11 = i10 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        if (i11 != 0) {
            int i12 = 24 / 0;
        }
        f1070 = (f1071 + 125) % 128;
        return advertiserDomain;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m5479(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i10 = f1071 + 97;
        f1070 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        if (i11 != 0) {
            int i12 = 1 / 0;
        }
        return eventsListener;
    }
}
