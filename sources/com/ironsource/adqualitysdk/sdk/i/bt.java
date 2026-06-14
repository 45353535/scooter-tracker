package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class bt extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1051 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1052 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1053 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1054;

    static {
        char[] cArr = new char[1642];
        ByteBuffer.wrap("\u0000AîÙÝ\u0005ÌEº\u009e©Æ\u0098\u0001\u0087iu\u0099d÷S/By0°\u001f\u001a\u000eH\u0000Pî×Ý\u0017ÌRº\u0089©Ê\u0098\u0007\u0087su¬\u0000CîÔÝ\u0018ÌEº\u009e©È\u0098\u000e\u0087qu½dáS\u000fBj0°\u001f\u0016\u000eLü\u009cëÄÚ\u0012\u0000cîÔÝ\u001bÌ\u001fº\u0085©Õ\u0098\r\u0087su«düS;B{0§\u001f\u001a\u000e\u0014ü\u0086ëÔÚ\u0000É\b·\u0082¦ó\u00959\u0084fr¿açP/>\u0092-Ü\u001c\u0006\u000b\u0001ù©èÊ×\u000eÆo´¤£þ\u0092 \u0081ko§^\u000fMy;\u0090*Ú\u0019\u0000\bRö¶åîÔ,\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001c\u000eNü\u009cëÆÚ\u0002ÉR·\u0098'÷É@ú\u008fë\u008b\u009d\u0011\u008eA¿\u0099 çR?Cht¯eï\u001738\u008e)\u0080Û\u0012Ì@ý\u0094î\u009c\u0090\u0016\u0081g²\u00ad£òU+Fsw»\u0019\u0006\nH;\u0092,\u0095Þ7Ï_ð\u0080áê\u00930\u0084vµ¬¦úH\"y\u0080jÍ\u001c\u000b\r{>\u009e/ÄÑ\"Âxó¨äð\u0096&$#Ê§ù\u007fè3\u009eÕ\u008d¹¼b£0Q×@\u008bwKf\u0013\u0014Á;g*/I´§\u0003\u0094Ì\u0085ÈóRà\u0002ÑÚÎ¤<|-+\u001aì\u000b¬ypVÍGÃµQ¢\u0003\u0093×\u0080ßþUï$ÜîÍ±;h(0\u0019øwEd\u000bUÑBÖ°r¡\u0002\u009eÒ\u008f¢ýTê4Û÷È\u0091&v\u0017Þ\u0004\u0086rRc\u0010PÊA\u008a\u0000IîÉÝ\u0019Ì_º¿©È\u0098\u0017\u0087ou»döS\fBh0ª\u001f\u0011\u000e_ü\u0087ëüÚ\nÉ_·\u008e¦é\u0095#ÁÓ/d\u001c«\r¯{5heY½FÃ´\u001b¥L\u0092\u008b\u0083Ëñ\u0017ÞªÏ¤=(*e\u001b¿\bÿv0gXT\u008eEÍ³\u0013 K\u0091\u0097ÿ%ì'Ý\u008dÊí85){\u0016\u0083\u0007Äu\u0013bSS\u009f@Ò®0\u009f¬\u008cæú-ë{Ø«ÉØ7\u000e$S\u0015\u008a\u0002Õp\u000f\u0000BîÚÝ\u0018Ì_º\u0089©Õ\u00981\u0087pu¹dàS&BE0\u00ad\u001f\f\u000eNü\u0090ëÞÚ\u000eÉTé\u007f\u0007ÿ4/%iS\u0089@þq!nY\u009c\u008d\u008dÀÍ\u0002#\u009d\u0010M\u0001\bwÂd\u009fUZJ?¸ü©¶\u009eA\u008f#ýûÒU\u0000IîÖÝ\u0006ÌCº\u0089©Ô\u0098\u0011\u0087tu·dýS\nBh0°\u001f\u001e\u000evü\u009cëÃÚ\u001fÉC·\u008f¦ù\u0095%÷Õ\u0019~*¥;áM\u0019^`o\u009apé\u0082>\u0000cîÔÝ\u001bÌ\u001fº\u008d©Ê\u0098\u0003\u0087gu·dýS`Bm0¡\u001f\t\u000eSü\u0096ëÕÚEÉG·\u0085¦ï\u0095y\u0084Vr\u0099aÊP\u0002>\u009a-ï\u001c\u001d\u000bJù\u009d\u001f\u008bñ\u0019ÂÇÓ\u0093¥G¶0\u0087É\u0098»jf{\u0016Lè] /m\u0000Ý\u0011\u008fã~ô\u001eÅßÖ\u0095¨C¹5\u008aõ\u009b§\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS B}0¡\u001f\r\u000eIü\u0081ëÙÚ\u001fÉO·\u0080¦ð\u0095\u001b\u0084{r¾aüP&>\u0090-Ü\u001c\u0006\u0001\u0012ï\u0080Ü^Í\n»Þ¨©\u0099P\u0086\"tÿe\u009fRuC 1û\u001eS\u000f\u0000ýÎê\u008aÛcÈ\u0011¶Û§§\u0094f\u0085\rsæ`¢Qr?Í,\u0086\u001d^\n\u0018ø×é·ÖWÇ6µü¢ª\u0093|\u0080<nî\u008aÌd^W\u0080FÔ0\u0000#w\u0012\u008e\rüÿ!îAÙ«Èþº%\u0095\u008d\u0084Þv\u0010aTP½CÏ=\u0005,y\u001f¸\u000eÞø$ë{Ú·´\u001b§W\u0096\u0091\u0081Ý\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÁS+B~0¥\u001f\r\u000e^ü\u0090ëÔÚ=ÉO·\u0085¦ù\u00958\u0084_r¬aæP6>\u009f-Õ\u001c8\u000bFù\u0099èÑ×\u0005Æu´³£ã\u0000AîßÝ?Ì_º\u008a©È\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÝS/B}0\u00ad\u001f\t\u000e_ü´ëÔ\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u0094dòS7Bf0±\u001f\u000b\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÝS/B}0\u00ad\u001f\t\u000e_ü´ëÔÚ'ÉO·\u0092¦è\u00952\u0084|r¨aú\fZâÈÑ\u0016ÀB¶\u0096¥á\u0094\u0018\u008bjy·hÈ_=N{<»\u0013\b\u0002zð\u008açÃÖ\n\u0000AîßÝ\u0017ÌAº\u0098©Â\u0098\u0010\u0087Su¹dçS'B\u007f0¡\u001f>\u000e^ü±ëÑÚ\u001fÉG\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u008edúS+B~0\u008c\u001f\u0010\u000eVü\u0091ëÕÚ\u0019\u0000IîÕÝ\u0002ÌTº\u009e©É\u0098\u0003\u0087qu\u0096dòS:B`0²\u001f\u001a\u000e{ü\u0091ëüÚ\u0002ÉU·\u0095¦ù\u00959\u0084wr¿Pº¾.\u008dö\u009c¬ênù6È××\u008d%m4\u0003\u0003Û\u0012\u008d`DOî^¼¬H»*\u008aë\u0099·çgö\u000eÅÂÔ\u0085\"\\î¨\u0000<3ä\"¾T|G$vÅi\u009f\u009bz\u008a\u0014½Ü¬\u008eÞkñ÷à¨\u0012v\u0005$4ë'¡YdH\u001f\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u0091dýS:Bl0¶\u001f\u001e\u000eYü\u0081ëÙÚ\u0004ÉH·\u00ad¦õ\u0095$\u0084fr¨aæP&>\u008c\u008eÝ`IS\u0091BË4\t'Q\u0016°\têû\u0002ênÝ©Ìÿ¾%\u0091\u008a\u0080Èr\u0005eF\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u0094düS/Bm0\u0088\u001f\u0016\u000eIü\u0081ëÕÚ\u0005ÉC·\u0093\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u008bdþS/Bz0¬\u001f3\u000eSü\u0086ëÄÚ\u000eÉH·\u0084¦î\u0005ÎëZØ\u0082ÉØ¿\u001a¬B\u009d£\u0082ùp\u000eazV«Gþ5\u0006\u001a\u0096\u000bÔù\u0011îUß\u0099Ìï²\u000f£h\u0090²\u0081àw+diU ;\u001b\u0000AîßÝ2ÌPº\u0098©Æ¼kRùa'ps\u0006§\u0015Ð$);[É\u0086Øõï\rþg\u008c\u008d£>²r\u008cÞbLQ\u0092@Æ6\u0012%e\u0014\u009c\u000bîù3èCß½Îõ¼8\u0093\u0088\u0082Úp&gFV¯EÝ;\u0016*y\u0000cîÔÝ\u001bÌ\u001fº\u0099©É\u0098\u000b\u0087iu¡d S*B'0©\u001f\u001a\u000e^ü\u009cëÑÚ\u001fÉO·\u008e¦ò\u0095y\u0084pr¬aæP->\u009b-Ë\u001cZ\u000bcù\u008fèÓ×\u0005Æw´\u0086£ý\u0092-\u0081~o\u0080^\u001cMV;\u009d*Ë\u0019\u001b\beö»åÌÔ<Ãu±¼\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÑS/Bg0ª\u001f\u001a\u000eHü´ëÔÚ=ÉO·\u0084¦ë\u0095\u001b\u0084{r¾aüP&>\u0090-Ü\u001c\u0006\u0000IîÉÝ\u0019Ì_º¿©È\u0098\u0017\u0087ou»döS\u000fBm0·\u001f9\u000eUü\u0087ëÝÚ\nÉR\u008c%b½Q\u007f@86î%²\u0014D\u000b\u001eùöè\u009aßOÎ\u0001\u0000BîÚÝ\u0018Ì_º\u0089©Õ\u0098#\u0087yu\u008adöS?B|0¡\u001f\f\u000eN\u0000BîÚÝ\u0018Ì_º\u0089©Õ\u0098#\u0087yu\u008edúS+B~\u0088\ff»UtDp2ö!¦\u0010d\u000f\u0006ýÎìÏÛEÊH¸Â\u0097b\u0086:tôc¬RkA<?ü.\u0090\u001d]\f\u001cúÆé\u0094Ø\u0002¶ó¥·\u0094u\u0083.qà`¸_!N6<Ø+\u0090\u001aM\t\rçßÖSÅ3³Ê¢¨\u0091c\u0080<\u001cæò~Á¼Ðû¦-µq\u0084\u0087\u009bÝi*x^O\u008f^Ú,,\u0003²\u0012íà%÷qÆ¡Õç«7+:Å¦öqç'\u0091í\u0082§³e¬\u0007^ßO\u0089x\\i\u0016\u001bö4h\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001b\u000esü\u009bëÖÚ\u0004\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001b\u000evü\u009cëÃÚ\u001fÉC·\u008f¦ù\u0095%\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001b\u000ehü\u0090ëÁÚ\u001eÉC·\u0092¦è;«Õ'æø÷©\u0081g\u0092:£þ¼\u0080N`_\u000e\u0000RîÞÝ\u0001ÌPº\u009e©Ã\u0098\u0007\u0087yu\u0099d÷S\u0007Bg0¢\u001f\u0010U\u0004»\u0088\u0088W\u0099\u0006ïÈü\u0095ÍQÒ/ Ï1¡\u0006T\u00176eáJ][\t©Í¾\u0083\u008fO\u0000RîÞÝ\u0001ÌPº\u009e©Ã\u0098\u0007\u0087yu\u0099d÷S\u001cBl0µ\u001f\n\u000e_ü\u0086ëÄ\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS B}0¡\u001f\r\u000eIü\u0081ëÙÚ\u001fÉO·\u0080¦ð\u0095\u0016\u0084v\u009cVrÄA\u001aPN&\u009a5í\u0004\u0014\u001bfé»øÀÏ:Þg¬»\u0083\u0017\u0092S`\u009bwÃF\u0005UU+\u009a:ê\t\f\u0018lî\u009býûÌ*¢\u0090±Æ\u0080\u0000\u0097Pe\u0082Ñ\u001a?\u0088\fV\u001d\u0002kÖx¡IXV*¤÷µ\u0097\u0082}\u0093(áóÎ[ß\b-Æ:\u0082\u000b|\u0018\u0014ÓÂ=P\u000e\u008e\u001fÚi\u000ezyK\u0080Tò¦/·O\u0080¥\u0091ðã+Ì\u0083ÝÐ/\u001e8Z\t¤\u001aÌd#u{FªWè¡&²h\u0083¨í\u0002ÿ^\u0011Ì\"\u00123FE\u0092Våg\u001cxn\u008a³\u009bÓ¬9½lÏ·à\u001fñL\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS#By0¶\u001f\u001a\u000eIü\u0086ëÙÚ\u0004ÉH·¥¦ý\u0095#\u0084s\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS#By0¶\u001f\u001a\u000eIü\u0086ëÙÚ\u0004ÉH·¥¦ý\u0095#\u0084sr\u0081aáP0>\u008a-Ü\u001c\u001a\u000bJù\u0098úô\u0014M'\u00916ò@\u0013SUb\u0092}ë\u008f&\u009ee©³¸îÊ\u0019å\u008dôÄ\u0006\u0003\u0000gîÞÝ\u0002Ìsº\u008d©É\u0098\f\u0087xuªdßS/Bp0«\u001f\n\u000eNü¥ëÜÚ\nÉE·\u0084¦ñ\u00952\u0084|r¹aÆP\">\u0093-Ü]ò³K\u0080\u0097\u0091íç\u0014ôBÅ\u0085Úí(>9u\u000e²\u001fóm?B®SÎ¡\u0014¶D\u0087´\u0094Àê\u001bûgdÁ\u008a\u007f¹²¨ØÞ!Íwü°ãØ\u0011\u000b\u0000@7\u0087&ÆT\n{\u009bjû\u0098!\u008fq¾\u0087\u00adïÓ2ÂHñ\u0092àÜ\u0016\b\u0005Z\u0000rîÞÝ\u001bÌ^º\u009a©Â\u0098+\u0087pu¨dáS+Bz0·\u001f\u0016\u000eUü\u009bëôÚ\nÉR·\u0080¦Ð\u0095>\u0084ar¹aíP->\u009b-Ë1.ß\u0097ìKý4\u008bÀ\u0098\u0098©N¶8DÁU¶bfs9\u0001Ä.[?\u0003ÍÎÚ\u009cëQø\u001c\u0086Á\u0097º¤pµ\u001fCåPµak\u000fý\u001c\u0083-R:\bÏ¸!\u0006\u0012Ë\u0003¤uPf\bWÞH¨ºQ«&\u009cö\u008d©ÿTÐËÁ\u00933^$\f\u0015Á\u0006\u008cxQi*ZàK\u0087½}®\"\u009fîñBâ\u000eÓÈÄ\u0084\u0000rîÞÝ\u001bÌ^º\u009a©Â\u0098.\u0087xu®döS\"BY0¨\u001f\u001e\u000eCü¼ëÝÚ\u001bÉT·\u0084¦ï\u0095$\u0084{r¢aæP\u000f>\u0097-Ê\u001c\u0000\u000bJù\u0084èÀ×\u0012\u0000sîÞÝ\u0002Ì\u007fº\u008d©Ó\u0098\u000b\u0087ku½dÒS*BE0\u00ad\u001f\f\u000eNü\u0090ëÞÚ\u000eÉT\u0000gîÞÝ\u0002Ìbº\u0089©Õ\u0098\u0014\u0087xuªd×S/B}0¥".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1642);
        f1054 = cArr;
        f1052 = -7737270007047524677L;
    }

    public bt(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5430(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        f1053 = (f1051 + 19) % 128;
        m5447(levelPlayNativeAd, levelPlayNativeAdListener);
        int i10 = f1051 + 1;
        f1053 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 6 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5433(IronSourceBannerLayout ironSourceBannerLayout) {
        int i10 = f1051 + 83;
        f1053 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5440(ironSourceBannerLayout);
        }
        m5440(ironSourceBannerLayout);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m5441(LevelPlayImpressionData levelPlayImpressionData) {
        int i10 = f1051 + 119;
        f1053 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM5437 = m5437(levelPlayImpressionData);
        if (i11 == 0) {
            int i12 = 35 / 0;
        }
        f1051 = (f1053 + 117) % 128;
        return jSONObjectM5437;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5444(Placement placement) {
        f1051 = (f1053 + 49) % 128;
        if (placement == null) {
            return null;
        }
        String placementName = placement.getPlacementName();
        int i10 = f1051 + 115;
        f1053 = i10 % 128;
        if (i10 % 2 != 0) {
            return placementName;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5448(ImpressionDataListener impressionDataListener) {
        f1051 = (f1053 + 31) % 128;
        m5445(impressionDataListener);
        int i10 = f1051 + 15;
        f1053 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5431(ImpressionDataListener impressionDataListener) {
        f1051 = (f1053 + 37) % 128;
        m5438(impressionDataListener);
        int i10 = f1053 + 21;
        f1051 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5434(AdData adData) {
        int i10 = f1051 + 87;
        f1053 = i10 % 128;
        if (i10 % 2 == 0) {
            m5443(adData);
            throw null;
        }
        String strM5443 = m5443(adData);
        f1053 = (f1051 + 111) % 128;
        return strM5443;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5440(IronSourceBannerLayout ironSourceBannerLayout) {
        f1051 = (f1053 + 87) % 128;
        String placementName = ironSourceBannerLayout.getPlacementName();
        int i10 = f1053 + 29;
        f1051 = i10 % 128;
        if (i10 % 2 == 0) {
            return placementName;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a7  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5026(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 3112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bt.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5432(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i10 = f1051 + 117;
        f1053 = i10 % 128;
        int i11 = i10 % 2;
        m5446(levelPlayImpressionDataListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5435(Placement placement) {
        f1053 = (f1051 + 75) % 128;
        String strM5444 = m5444(placement);
        int i10 = f1053 + 25;
        f1051 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM5444;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m5436(ImpressionData impressionData) {
        int i10 = f1053 + 33;
        f1051 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5429(impressionData);
        }
        m5429(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5445(ImpressionDataListener impressionDataListener) {
        f1053 = (f1051 + 117) % 128;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i10 = f1051 + 37;
        f1053 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5442(TextUtils.lastIndexOf("", '0', 0, 0) + 1400, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64147), 16 - Color.argb(0, 0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bt.m5435((Placement) list.get(0));
            }
        });
        map.put(m5442(1415 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bt.m5433((IronSourceBannerLayout) list.get(0));
            }
        });
        map.put(m5442(1443 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 23957), 21 - View.combineMeasuredStates(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bt.m5436((ImpressionData) list.get(0));
            }
        });
        map.put(m5442(TextUtils.indexOf("", "") + 1464, (char) (TextUtils.indexOf("", "", 0) + 25760), 24 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bt.m5431((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m5442((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1489, (char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bt.m5448((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m5442(1516 - ImageFormat.getBitsPerPixel(0), (char) (12618 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 30 - Color.blue(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bt.m5441((LevelPlayImpressionData) list.get(0));
            }
        });
        map.put(m5442(((Process.getThreadPriority(0) + 20) >> 6) + 1547, (char) (53209 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 30 - View.combineMeasuredStates(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bt.m5439((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m5442((ViewConfiguration.getEdgeSlop() >> 16) + 1577, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 32 - ImageFormat.getBitsPerPixel(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bt.m5432((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m5442(Color.red(0) + 1610, (char) ((-1) - Process.getGidForName("")), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bt.m5430((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5442(1629 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionGroup(0L) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bt.m5434((AdData) list.get(0));
            }
        });
        int i10 = f1051 + 83;
        f1053 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5439(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        f1051 = (f1053 + 65) % 128;
        m5449(levelPlayImpressionDataListener);
        int i10 = f1051 + 5;
        f1053 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 80 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5446(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i10 = f1051 + 123;
        f1053 = i10 % 128;
        int i11 = i10 % 2;
        LevelPlay.removeImpressionDataListener(levelPlayImpressionDataListener);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1053 + 21;
        f1051 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5443(AdData adData) {
        int i10 = f1051 + 5;
        f1053 = i10 % 128;
        if (i10 % 2 == 0) {
            adData.getServerData();
            throw null;
        }
        String serverData = adData.getServerData();
        int i11 = f1053 + 93;
        f1051 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 14 / 0;
        }
        return serverData;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f1053 = (f1051 + 5) % 128;
        try {
            try {
                String sdkVersion = LevelPlay.getSdkVersion();
                int i10 = f1053 + 99;
                f1051 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 97 / 0;
                }
                return sdkVersion;
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5442(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1054[i10 + i12]) ^ (((long) i12) * f1052)) ^ ((long) c10));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5438(ImpressionDataListener impressionDataListener) {
        f1051 = (f1053 + 19) % 128;
        IronSource.addImpressionDataListener(impressionDataListener);
        int i10 = f1051 + 117;
        f1053 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m5437(LevelPlayImpressionData levelPlayImpressionData) {
        int i10 = f1051 + 61;
        f1053 = i10 % 128;
        if (i10 % 2 != 0) {
            return levelPlayImpressionData.getAllData();
        }
        levelPlayImpressionData.getAllData();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m5429(ImpressionData impressionData) {
        f1051 = (f1053 + 39) % 128;
        JSONObject allData = impressionData.getAllData();
        int i10 = f1051 + 47;
        f1053 = i10 % 128;
        if (i10 % 2 != 0) {
            return allData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m5449(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        f1051 = (f1053 + 89) % 128;
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        f1053 = (f1051 + 27) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m5447(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i10 = f1053 + 55;
        f1051 = i10 % 128;
        int i11 = i10 % 2;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        if (i11 != 0) {
            throw null;
        }
    }
}
