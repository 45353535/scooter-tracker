package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
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
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bi extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f822 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f823;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f824;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f825;

    static {
        char[] cArr = new char[2053];
        ByteBuffer.wrap("J|\u0090\u0000þ×Ä\u0096#f\tÊW\u009a²H\u0098\u0006æìÍT\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ù\u0015\u009e\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0088ðRÊõ¤¹\u007fxY\u001d3\u0099\u000eEè!Âî\u009c§wWQó+»\u0006qà-ºÝ\u0095Po:IÅ#\u009a\u0000AÚ)´Ì\u008e\u008eiQCö\u001d\u008døtÒ\u0006¬Á\u0087pa ;ð\u0015\u0085ðSÊñ\u0015\tÏu¡¢\u009bã|\u0013V¿\bïí=Çi¹\u0093\u0092>tb.¦\u0000Òå\nß¢±ìj<LC&\u0093\u001b\rýz×¢\u0089Êb\u0006D¤>î\u0013.\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087va*;î\u0015\u009aðBÊê¤¤\u007ftY\u000b3Û\u000eEè5ÂÚ\u009c\u0082wYQé+½\u0006x\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Aa#;õ\u0015\u008að]ÊÏ¤¹\u007fnY\u001e3Ò\u000ejè4Âì\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Fa&;ï\u0015\u0099ðZÊâ¤©\u007fQY\u00033Ä\u000epè4Âð\u009c\u008ewJ$«þ×\u0090\u0000ªAM±g\u001d9MÜ\u009föÃ\u0088;£ºEÀ\u001f\u00011bÔ®î\r\u0080v[\u009e}ó\u0017)*\u008bÌÕæ\u0011¸s\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ø\u0015\u008cðYÊÓ¤¼\u007f|Y\u00133Õ\u000eeè2Âõ\u009c§wQQö+¦\u0006zà\u0002ºÜ\u0095t\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Qa&;æ\u0015\u008c\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Va6;ì\u0015\u008c\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087aa*;ò\u0015\u009dð_Êõ¤¹\u007fgY\u000f3Ó\u000eMè?Âê\u009c\u008ewJQö+¦\u0006và\u0018ºÐ\u0095go?\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087va*;î\u0015\u009aðBÊê¤¤\u007ftY\u000b3Û\u000eEè5°øj\u0084\u0004S>\u0012ÙâóN\u00ad\u001eHÌb\u0086\u001ci7ÙÑ \u008bL¥5@øz{\u0014\nÏÐéº\u0083x¾ÔX\u009cr^\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Qa*;î\u0015\u009fð_Êà¤µ\u007fTY\u00073Ç\u000eh\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ù\u0015\u009eðsÊõ¤µ\u007fsY\u001e3û\u000emè\"Âê\u009c\u008ewVQà+ 1Ùë¥\u0085r¿3XÃro,?Éíã¦\u009dD¶þP²\nk$'ÁÇû~\u0095?\u0000AÚ)´Ì\u008e\u008eiQCö\u001d\u008døtÒ\u0006¬Á\u0087pa ;ð\u0015\u0085ðSÊñ¤\u0099\u007fpY\u001a3ÛxU¢)Ìþö¿\u0011O;ãe³\u0080aª=ÔÅÿT\u0019:Cûm\u0098\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001fòì(\u008dFC|\u000f\u009bû±Tï\n\nÈ º^`uÊ\u0093\u009aÉTç)\u0002û8cV\u00154Âî£\u0080mº:]Þwy) Ìææ\u0083\u0098_³éU\u0081\u000fwú( IN\u0087tÃ\u00935¹²çÂ\u0002\u001b(zV\u0099}\n\u009bZÁ\u0095\u0000MÚ,´â\u008e¡iACí\u001d¢øhÒ\u000b¬Ç\u0087ga*;ò\u0015¨ðRÊÊ¤½\u007fmY\u0006\u0000MÚ,´â\u008e¦iPCà\u001d¾øoÒ\r¬Ç\u0087Ra.;î\u0015\u0088ð[Êæ¤¤\u007fxY\u00183Ä\u000eMè<Âî\u009c\u0087IW\u00932ýäÇ\u0094 O\nïT½±n\u009b\u001cåüÎ}('rð\\\u009a¹O\u0083üí\u00836j\u0010\u0000zÁ.Éô¨\u009af \"GÔmd3:Öëü\u0089\u0082C\r:×[¹\u0095\u0083Ñd'\u0000MÚ,´â\u008e¦iPCÇ\u001d¡øiÒ\u0005¬Ô\u0087v\u0000MÚ,´â\u008e¦iPCÍ\u001d§øhÒ\u001c¬Ð\u0087la*;î\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001f¬ô\u0087fa\u0003;õ\u0015\u009aðBÊæ¤¾\u007fxY\u0018\u0001pÛ\u0011µß\u008f\u0088hlBË\u001c\u0092ùTÓ1WÒ\u008d³ã}Ù*>Î\u0014iJ0¯ö\u0085\u0093ûOÐù6\u0091lgB:§À\u009doó;(ç\u000e\u009bdMYé\u0000MÚ(´þ\u008e\u008eiUCõ\u001d§øtÒ\u0006¬ô\u0087fa.;ì\u0015\u009dðSÊñ¤\u0092\u007f|Y\u00193Ò\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ%¬Ð\u0087fa&;ý\u0015\u009dð_Êì¤¾\u007f\\Y\u000e3Ö\u000etè%Âû\u009c\u0099ú^ ;Nít\u009d\u0093F¹æç´\u0002g(\u0015Vç}u\u009b=Áÿï\u008e\n@0â^\u0091\u0085a£\fÉÐôr\u00120\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001f¬ô\u0087fa.;ì\u0015\u009dðSÊñ=\u001aç{\u0089µ³ùT\r~¢ üÅ>ïL\u0091\u0096º<\\l\u0006¢(ßÍ\r÷\u0095\u0099ãB+dM\u000e\u009436Õt\u0000MÚ,´â\u008eµiQCö\u001d¯øiÒ\f¬Ð\u0087fa\u000e;ø\u0015\u0088ðFÊ÷¤µ\u007foÏ·\u0015Ö{\u0018AN¦§\u008c\u001cÒZ7\u0080\u001dþc\u001fH\u008a®Úô\u0010Úz?¨\u0005\u001ckX\u0000MÚ,´â\u008e¦iPCà\u001d¾øoÒ\r¬Ç\u0087Ra.;î\u0015\u0088ð[Êæ¤¤\u007fxY\u00183ÄE\u001c\u009f}ñ³Ë÷,\u0001\u0006±Xï½>\u0097\\é\u0096Â\u0001${~¾PÈµ\b\u008f¼áò:)\u001ckv\u0087K'\u00ada\u0087¢Ùß2\u001d\u0014±nñC=Q\u001a\u008b{åµßñ8\u0007\u0012·Lé©8\u0083Zý\u0090Ö\u00060qj¬DÐ¡\u0000\u009b¸õÄ.%\bQb\u008c_6¹e\u0093½ÍÕ&\u0000\u0000¼zÕW)±Ië\u008fÄ<>a\u0018\u0083rß¯\u001f\u0089£Á\u0087\u001bæu(Ol¨\u009a\u0082*Üt9¥\u0013Çm\rF\u0081 ëú?ÔW1\u0095\u000b(ev¾¾\u0098Úò\u001cÏº)ò\u0003;]O¶¢\u0090.êjÇ´!Ë{\u0016T¸®ü\u0088\u0018âTK\u001d\u0091|ÿ²Åö\"\u0000\b°Vî³?\u0099]ç\u0097Ì\u001e*vp¿^Í»\u0003\u0081½ïå4?õ|/\u001dAÓ{\u0097\u009ca¶æè\u0096\rO'.YÅrW\u0094\u001fÎÝà¬\u0005b?ÀQ\u00ad\u008aE¬(ÆòûP\u001d\u000e7Êi¨\u0000MÚ,´â\u008e®iZCõ\u001d«øiÒ\u001b¬Á\u0087ka;;õ\u0015\u0088ðZÊÂ¤´\u007f|Y\u001a3Ã\u000eaè#ÂÒ\u009c\u0082wKQñ+·\u0006qà\tºË\u0000MÚ,´â\u008eµiQCö\u001d¯øiÒ\f¬Ð\u0087fa\u000e;ø\u0015\u0088ðFÊ÷¤µ\u007foY&3Þ\u000ewè%Âû\u009c\u0085w]Q÷\u0000MÚ,´â\u008e´i]Cæ\u001d øzÒ\u0004¬ö\u0087ma#;ð\u0015\u008cðUÊ÷¤¹\u007frY\u00043û\u000emè\"Âê\u009c\u008ewVQà+ \u0000MÚ,´â\u008e¢iFCó\u001d¡øi\u009bYA%/ò\u0015³òCØï\u0086¿cmI27ß\u001cuú6 à\u008e\u0092kOQè?¼äHÂ\u0013¨Á\u0095}s.Yã\u0007\u0081\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ*¬Ç\u0087ma.;ø\u0015\u008aðWÊð¤¤\u007fPY\u000b3Ù\u000eeè6Âû\u009c\u0099wjQà+±\u0006zà\u0005ºÏ\u0095co!e]¿!Ñöë·\fG&ëx»\u009di·7ÉÆâs\u0004>^õp\u009b\u0095C¯üÁ\u00ad\u001au<\u0019VÙkU\u008d(§ñù\u0084\u0012E4þN«\u0000CÚ\"´÷\u008e\u008aiACï\u001d§øxÒ\t¬Á\u0087ma=;Ñ\u0015\u008cðEÊð¤±\u007fzY\u000f3þ\u000eiè!Âò\u0087\u0007]{3¬\tíî\u001dÄ±\u009aá\u007f3Um+\u009c\u0000)æd¼¯\u0092Áw\u0019M¦#÷ø/ÞC´\u0083\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ+¬Ú\u0087oa\";é\u0015\u0087ð_Êà¤±\u007fiY\u00053Å\u000eWè$Âü\u009c\u0098w[Q÷+»\u0006}à\tºË@\u009a\u009aæô1Îp)\u0080\u0003,]|¸®\u0092ðì\u0001Ç´!ù{2U\\°\u0084\u008a;äj?²\u0019Þs\u001eN\u008f¨ÿ\u0082'Ü\\7\u008a\u0011-kaF¡ Åk\u0019±eß²åó\u0002\u0003(¯vÿ\u0093-¹sÇ\u0082ì7\nzP±~ß\u009b\u0007¡¸Ïé\u001412]X\u009de\u0011\u0083l©µ÷À\u001c\u0001:º@ãm)\u008bSÑ²þ;\u0004y\"\u008eHÜ\u0095\u0001³º\u008a_P#>ô\u0004µãEÉé\u0097¹rkX5&Ä\rqë<±÷\u009f\u0099zA@þ.¯õwÓ\u001b¹Û\u0084_b!Hô\u0016\u009cýRÛâ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ.¬À\u0087na#;ï\u0015\u008aðDÊæ¤µ\u007fsY>3ß\u000eaè<Âû\u009c\u008fwyQæ+¦\u0006và\u001aºÐ\u0095ro*\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0088ðRÊõ¤¹\u007fxY\u001d3\u0099\u000eEè!Âî\u009c§wWQó+»\u0006qà*ºÌ\u0095jo?IÓ#\u008eþHØâ²±\u008dOg:AÓ\u001cmö8ÐÇª\u008b\u0085}_ê9¢\u0014Jî\u0006ÈÔ£~}.\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087f\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0003;õ\u0015\u009aðBÊæ¤¾\u007fxY\u0018\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0003;ó\u0015\u0088ðRÊæ¤¢\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0006;ñ\u0015\u0099ðZ\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0019;õ\u0015\u008cðA\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0084ðSÊç¤¹\u007f|Y\u001e3Þ\u000ekè?Â°\u009c\u0085wYQñ+»\u0006ià\tºø\u0095bo I\u008e# þ[Øÿ²\u009a\u008d@g\u001aAÒ\u001c~ö0Ðãª\u008b\u0085j_à9³\u0014TI\u0016\u0093wý¹Çò \u000e\n®Tü±6\u009bVå¯Î=(Br®\\×¹\u001a\u0083\u009aíâ6(\u0010Uz\u0089G-\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ&¬Ô\u0087va&;ê\u0015\u008cðwÊç\u001f\u0084Åø«/\u0091nv\u009e\\2\u0002bç°Íã³\u0011\u0098³~ã$/\nIï²Õ\"»P`®FÊ,\u001c\u0011µ÷ØÝ2\u0083]h\u0089N%4y\u0019¿ÿÛ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ&¬Ô\u0087va&;ê\u0015\u008cðwÊç¤\u0083\u007fxY\u00183Á\u000emè2Âû\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ%¬Ð\u0087fa&;ý\u0015¿ð_Êæ¤§\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ>¬Ô\u0087qa;;Ñ\u0015\u008cðRÊê¤±\u007fKY\u00033Ò\u000es$¥þÙ\u0090\u000eªOM¿g\u00139CÜ\u0091öÂ\u00880£\u0092EÂ\u001f\u000e1hÔ\u0093î\u0003\u0080}[\u0094}þ\u0017?\u0000VÚ\b´È\u008e´i}CÎ\u001d\u0080\u0000^Ú\u0011´þ\u008e¼ihCå\u001dàøFÒC¬é\u0087fak\u0000sÚ(´î\u008e¦iPCÂ\u001d¢ørÒ\u000b¬Þ\u0087Na&;ï\u0015\u009dðSÊí¤µ\u007fo{\u0093¡ÈÏ\u000eõF\u0012°87fG\u0083\u009f©í×:ü²\u001aÃ@\u001dnp\u008b´±\u0002ßS\u0004\u0096\"ÆH>u\u0097\u0093Å¹\u001bçe\f½*\u0017\u0000sÚ(´î\u008e¦iPCÅ\u001d§øhÒ\u0018¬Ù\u0087ca6;Ð\u0015\u0080ðEÊ÷¤µ\u007fsY\u000f3ÅÞ5\u0004zj¼Pô·\u0002\u009d\u0085Ãõ&,\fMr¤Y?¿såºËÉ.\u000b\u0014½zî¡*\u0087Jò\u0095(ÚF\u001c|T\u009b¢±:ïX\n§ ï^*u\u0092\u0093ØÉ\u001c\u0000gÚ(´î\u008e´i]Cû\u001d«\u0000gÚ(´î\u008e³iMCñ\u001d«\u0000gÚ(´î\u008e½i[Cï\u001d«øRÒ\f\u0013ÃÉ\u008c§J\u009d\u0000zâP@\u000e\u000bëËÁ¥¿g\u0094Ãr¢(\\\u0000iÚ>´Ì\u008e\u008eiPCä\u001d¡øZÒ\f\u0000iÚ>´Ø\u008e\u0086iZCï\u001d«øi\u0000iÚ>´Ó\u008e\u0089iWCä\u001d øoÒ\u0001¬Ã\u0087ka5;ù\u0015\u008dðwÊç\u0000gÚ(´î\u008e¦iDCñ\u001d\u0082øtÒ\u001e¬Ü\u0087la\r;î\u0015\u0086ðWÊç¤³\u007f|Y\u00193Ã\u000eIè0Âð\u009c\u008aw_Qà+ 9\u000bãQ\u008d\u0084·÷P>z\u008c$ÒÁ\u0010ëP\u0095¼¾\u000bXz\u0002\u008a,æÉ&ó\u0094\u009dëF\u0016`|\n¯7\u0019ÑKû\u0086¥áN5h®\u0012Î?\u0005Ùp\u0083©¬\tVOp«\u0000uÚ#´è\u008e\u0082iSCè\u001d½øoÒ\r¬Ç\u0087Ca?;ì\u0015¥ðYÊõ¤¹\u007fsY(3Å\u000ekè0Âú\u009c\u0088wYQö+¦\u0006Mà\tºÚ\u0095co:IÖ#\u0088þHuS¯\u001cÁÚû\u0092\u001cp6Åh¶\u008d@§*ÙèòX\u00148NÇ`°\u0085o¿ÂÑ\u008a\n@,=Fâ{D\u009d\n·Øé\u0092\u0002i$Â^\u0095sJ\u0095?Ïèàv\u001a\u0006<àV¸\u0000sÚ8´ø\u008e\u0094iWCó\u001d§øyÒ\r¬á\u0087ma\u000e;ì\u0015\u0099ðzÊì¤¦\u007ftY\u00043ô\u000ekè<Âó\u009c\u009ewVQì+±\u0006~à\u0018ºÖ\u0095t\u0000gÚ(´î\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0002;ý\u0015\u0080ðXÊÊ¤½\u007f|Y\r3Ò\u000eQè#Â÷\u0000sÚ(´î\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\n;ê\u0015\u008cðXÊ÷¤\u009c\u007ftY\u00193Ã\u000eaè?Âû\u009c\u0099:\ràB\u008e\u0084´ÃS?y\u009f'ÍÂ\u0007èg\u0096\u009e½\f[l\u0001\u0095/ìÊ2ð¼\u009eÈE\u001e".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2053);
        f824 = cArr;
        f825 = -1288543479881606579L;
    }

    public bi(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m5112(AppLovinAd appLovinAd) {
        f823 = (f822 + 119) % 128;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        f823 = (f822 + 59) % 128;
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m5113(AppLovinAd appLovinAd) {
        f823 = (f822 + 75) % 128;
        if (appLovinAd == null || !appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
            return false;
        }
        f823 = (f822 + 13) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m5114(AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            return false;
        }
        int i10 = f822 + 35;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            m5118(appLovinAd);
            int i11 = AppLovinAdSize.SPAN;
            throw null;
        }
        if (m5118(appLovinAd) != AppLovinAdSize.BANNER && m5118(appLovinAd) != AppLovinAdSize.LEADER && m5118(appLovinAd) != AppLovinAdSize.MREC) {
            return false;
        }
        int i12 = f823 + 93;
        f822 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ boolean m5115(AppLovinAd appLovinAd) {
        f822 = (f823 + 73) % 128;
        boolean zM5113 = m5113(appLovinAd);
        int i10 = f823 + 23;
        f822 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM5113;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static AppLovinAdType m5116(AppLovinAd appLovinAd) {
        int i10 = f822 + 7;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinAdType type = appLovinAd.getType();
        if (i11 != 0) {
            int i12 = 66 / 0;
        }
        f823 = (f822 + 27) % 128;
        return type;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long m5117(AppLovinAd appLovinAd) {
        long adIdNumber;
        int i10 = f822 + 91;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            adIdNumber = appLovinAd.getAdIdNumber();
            int i11 = 49 / 0;
        } else {
            adIdNumber = appLovinAd.getAdIdNumber();
        }
        int i12 = f822 + 51;
        f823 = i12 % 128;
        if (i12 % 2 == 0) {
            return adIdNumber;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static AppLovinAdSize m5118(AppLovinAd appLovinAd) {
        f822 = (f823 + 5) % 128;
        AppLovinAdSize size = appLovinAd.getSize();
        f822 = (f823 + 3) % 128;
        return size;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m5119(AppLovinAd appLovinAd) {
        f822 = (f823 + 103) % 128;
        String zoneId = appLovinAd.getZoneId();
        f822 = (f823 + 29) % 128;
        return zoneId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AppLovinBroadcastManager m5120(Context context) {
        f822 = (f823 + 101) % 128;
        AppLovinBroadcastManager appLovinBroadcastManagerM5129 = m5129(context);
        int i10 = f823 + 37;
        f822 = i10 % 128;
        if (i10 % 2 != 0) {
            return appLovinBroadcastManagerM5129;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Uri m5128(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        f823 = (f822 + 97) % 128;
        Uri uriM5140 = m5140(appLovinNativeAdImpl);
        int i10 = f822 + 73;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 50 / 0;
        }
        return uriM5140;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ AdViewController m5135(AppLovinAdView appLovinAdView) {
        int i10 = f823 + 9;
        f822 = i10 % 128;
        if (i10 % 2 == 0) {
            m5150(appLovinAdView);
            throw null;
        }
        AdViewController adViewControllerM5150 = m5150(appLovinAdView);
        f823 = (f822 + 13) % 128;
        return adViewControllerM5150;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AppLovinAdType m5142(AppLovinAd appLovinAd) {
        int i10 = f822 + 103;
        f823 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5116(appLovinAd);
        }
        m5116(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ long m5147(AppLovinAd appLovinAd) {
        f823 = (f822 + 77) % 128;
        long jM5117 = m5117(appLovinAd);
        int i10 = f822 + 75;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 44 / 0;
        }
        return jM5117;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AppLovinAdSize m5121(AppLovinAd appLovinAd) {
        int i10 = f823 + 31;
        f822 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5118(appLovinAd);
        }
        m5118(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5131(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i10 = f823 + 121;
        f822 = i10 % 128;
        int i11 = i10 % 2;
        m5144(adViewController, appLovinAdDisplayListener);
        if (i11 == 0) {
            int i12 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m5136(AppLovinAd appLovinAd) {
        int i10 = f822 + 7;
        f823 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5119(appLovinAd);
        }
        m5119(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5143(MaxAd maxAd) {
        f823 = (f822 + 17) % 128;
        String strM5130 = m5130(maxAd);
        f822 = (f823 + 61) % 128;
        return strM5130;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Uri m5148(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        f823 = (f822 + 45) % 128;
        Uri uriM5134 = m5134(appLovinNativeAdImpl);
        f822 = (f823 + 99) % 128;
        return uriM5134;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5126(bi biVar, Context context, String str, String str2) {
        int i10 = f823 + 89;
        f822 = i10 % 128;
        int i11 = i10 % 2;
        biVar.m5123(context, str, str2);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f823 + 35;
        f822 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m5133(AppLovinAd appLovinAd) {
        int i10 = f822 + 35;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            m5112(appLovinAd);
            throw null;
        }
        boolean zM5112 = m5112(appLovinAd);
        int i11 = f822 + 83;
        f823 = i11 % 128;
        if (i11 % 2 == 0) {
            return zM5112;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5137(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = f823 + 31;
        f822 = i10 % 128;
        int i11 = i10 % 2;
        m5132(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m5145(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i10 = f823 + 113;
        f822 = i10 % 128;
        int i11 = i10 % 2;
        m5124(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Bundle m5149(CommunicatorMessageImpl communicatorMessageImpl) {
        f822 = (f823 + 55) % 128;
        Bundle bundleM5141 = m5141(communicatorMessageImpl);
        int i10 = f823 + 37;
        f822 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 31 / 0;
        }
        return bundleM5141;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m5127(bi biVar, AppLovinAd appLovinAd) {
        int i10 = f822 + 13;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            m5114(appLovinAd);
            throw null;
        }
        boolean zM5114 = m5114(appLovinAd);
        f823 = (f822 + 65) % 128;
        return zM5114;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m5138(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        f823 = (f822 + 51) % 128;
        a0.a();
        int i10 = f822 + 27;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m5146(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        f823 = (f822 + 29) % 128;
        m5138(appLovinBroadcastManager, receiver, intentFilter);
        f822 = (f823 + 113) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5151(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        f822 = (f823 + 49) % 128;
        m5125(appLovinBroadcastManager, receiver);
        f822 = (f823 + 45) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        Field declaredField;
        int i10 = f823 + 63;
        f822 = i10 % 128;
        try {
            try {
                if (i10 % 2 == 0) {
                    int iLastIndexOf = 10499 << TextUtils.lastIndexOf("", 'u', 1);
                    SystemClock.currentThreadTimeMillis();
                    declaredField = AppLovinSdk.class.getDeclaredField(m5122(iLastIndexOf, (char) 0, 66 / View.MeasureSpec.getSize(1)).intern());
                } else {
                    declaredField = AppLovinSdk.class.getDeclaredField(m5122(TextUtils.lastIndexOf("", '0', 0) + 1645, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getSize(0) + 7).intern());
                }
                String str = (String) declaredField.get(null);
                f823 = (f822 + 123) % 128;
                return str;
            } catch (Exception unused) {
                return hu.m6637().m6639().m6739(AppLovinSdk.class, m5122(TextUtils.getCapsMode("", 0, 0) + 1651, (char) TextUtils.getCapsMode("", 0, 0), Color.green(0) + 12).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Uri m5134(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f823 + 13;
        f822 = i10 % 128;
        int i11 = i10 % 2;
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        if (i11 == 0) {
            int i12 = 37 / 0;
        }
        int i13 = f823 + 19;
        f822 = i13 % 128;
        if (i13 % 2 != 0) {
            return mainImageUri;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5144(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f822 = (f823 + 69) % 128;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        int i10 = f822 + 87;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5152(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        f823 = (f822 + 97) % 128;
        m5139(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        f822 = (f823 + 89) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5122(1663 - View.resolveSize(0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bi.m5145((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        map.put(m5122(((byte) KeyEvent.getModifierMetaStateMask()) + 1682, (char) (31712 - TextUtils.indexOf("", "", 0, 0)), KeyEvent.keyCodeFromString("") + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bi.m5137((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        map.put(m5122(1707 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 20 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bi.m5131((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        map.put(m5122(1727 - View.combineMeasuredStates(0, 0), (char) (56914 - (ViewConfiguration.getPressedStateDuration() >> 16)), 19 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5135((AppLovinAdView) list.get(0));
            }
        });
        map.put(m5122(1746 - Drawable.resolveOpacity(0, 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 62194), 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Long.valueOf(bi.m5147((AppLovinAd) list.get(0)));
            }
        });
        map.put(m5122((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1760, (char) TextUtils.getOffsetAfter("", 0), 7 - View.MeasureSpec.getMode(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5121((AppLovinAd) list.get(0));
            }
        });
        map.put(m5122(1766 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.green(0), View.combineMeasuredStates(0, 0) + 7).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5142((AppLovinAd) list.get(0));
            }
        });
        map.put(m5122((ViewConfiguration.getPressedStateDuration() >> 16) + 1773, (char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getMode(0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5136((AppLovinAd) list.get(0));
            }
        });
        map.put(m5122((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1782, (char) (5028 - (ViewConfiguration.getTouchSlop() >> 8)), 13 - View.resolveSize(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5143((MaxAd) list.get(0));
            }
        });
        map.put(m5122(1843 - AndroidCharacter.getMirror('0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m5133((AppLovinAd) list.get(0)));
            }
        });
        map.put(m5122(1804 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.alpha(0) + 8).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m5127(bi.this, (AppLovinAd) list.get(0)));
            }
        });
        map.put(m5122(1812 - Color.blue(0), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 16 - ExpandableListView.getPackedPositionType(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m5115((AppLovinAd) list.get(0)));
            }
        });
        map.put(m5122(1828 - TextUtils.indexOf("", "", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5120((Context) list.get(0));
            }
        });
        map.put(m5122((-16775361) - Color.rgb(0, 0, 0), (char) (KeyEvent.keyCodeFromString("") + 14713), KeyEvent.getDeadChar(0, 0) + 33).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bi.m5146((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        map.put(m5122((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1888, (char) KeyEvent.getDeadChar(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 35).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bi.m5151((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        map.put(m5122(TextUtils.lastIndexOf("", '0') + 1924, (char) (30004 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5149((AppLovinCommunicatorMessage) list.get(0));
            }
        });
        map.put(m5122(1957 - (KeyEvent.getMaxKeyCode() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 32).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bi.m5126(bi.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        map.put(m5122(((Process.getThreadPriority(0) + 20) >> 6) + 1988, (char) ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5148((AppLovinNativeAdImpl) list.get(0));
            }
        });
        map.put(m5122(2011 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bi.m5152((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m5122((ViewConfiguration.getEdgeSlop() >> 16) + 2035, (char) (14953 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bi.m5128((AppLovinNativeAdImpl) list.get(0));
            }
        });
        f823 = (f822 + 63) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m5139(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        f823 = (f822 + 83) % 128;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        f823 = (f822 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Bundle m5141(CommunicatorMessageImpl communicatorMessageImpl) {
        f823 = (f822 + 117) % 128;
        Bundle messageData = communicatorMessageImpl.getMessageData();
        f822 = (f823 + 49) % 128;
        return messageData;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021e  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5026(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 3782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bi.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Uri m5140(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f822 + 33;
        f823 = i10 % 128;
        if (i10 % 2 != 0) {
            appLovinNativeAdImpl.getIconUri();
            throw null;
        }
        Uri iconUri = appLovinNativeAdImpl.getIconUri();
        int i11 = f823 + 125;
        f822 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 56 / 0;
        }
        return iconUri;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5132(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        f823 = (f822 + 59) % 128;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        int i10 = f823 + 117;
        f822 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 29 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5130(MaxAd maxAd) {
        f823 = (f822 + 15) % 128;
        String creativeId = maxAd.getCreativeId();
        f822 = (f823 + 39) % 128;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AppLovinBroadcastManager m5129(Context context) {
        f823 = (f822 + 121) % 128;
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        f822 = (f823 + 67) % 128;
        return appLovinBroadcastManager;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5124(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        f822 = (f823 + 7) % 128;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        f822 = (f823 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5125(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        f822 = (f823 + 9) % 128;
        a0.a();
        int i10 = f823 + 91;
        f822 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5123(Context context, final String str, String str2) {
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.14
            @Override // com.applovin.communicator.AppLovinCommunicatorEntity
            public final String getCommunicatorId() {
                return str;
            }

            @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }
        }, str2);
        int i10 = f823 + 53;
        f822 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5122(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f824[i10 + i12]) ^ (((long) i12) * f825)) ^ ((long) c10));
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
    private static AdViewController m5150(AppLovinAdView appLovinAdView) {
        int i10 = f823 + 51;
        f822 = i10 % 128;
        int i11 = i10 % 2;
        AdViewController adViewController = appLovinAdView.getAdViewController();
        if (i11 == 0) {
            int i12 = 27 / 0;
        }
        return adViewController;
    }
}
