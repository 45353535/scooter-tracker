package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.adjust.sdk.network.ErrorCodes;
import com.ironsource.adqualitysdk.sdk.i.bb;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class hi extends WebChromeClient implements bb.e, cl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2341 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2342;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2343;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2344;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WebChromeClient f2345;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WebChromeClient f2346;

    static {
        char[] cArr = new char[ErrorCodes.THROWABLE];
        ByteBuffer.wrap("$X\u0085¿gÇÁ3£3\rTî\u009eH±*Â\u00941v1ÐA±\u0096\u0013°ýÝ_09:\u009bID\u009a&²\u0080Êb\u0002Ì.®^\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008as+\u008aÍ¢oÅ\u0011\u0005³)URö\u0085\u0098\u0088:ÈÜ\u0014~$ xÁ\u0091c\u00ad\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008aq+\u009dÍ®oÇ\u0011\u001e³:UDö\u0092\u0098\u009f:ÉÜ\u0001~& z\f\u0010\u00adòO\u008déE\u008bs%\\ÆÂ`è\u0002Ý¼E^Sø\u0010\u0099å;íÕ\u0080wZ\u0011`³\u001elÊ\u000eè¨ÑJCäu\u0086$'ÈÁûc\u0092\u001dK¿oY\u0011úÇ\u0094×6\u0096ÐOrq7C\u0096¡tÞÒ\u0016° \u001e\u000fý\u0091[»9\u008e\u0087\u0016e\u0000ÃC¢¶\u0000¾îÓL\t*3\u0088MW\u00995»\u0093\u0082q\u0010ß&½w\u001c\u009bú¨XÁ&\u0018\u0084<bBÁ\u0094¯\u0099\rÉë\u0006I/\u0017qö»T¬2÷\u0090\u001b~\u001bÜi»\u0098FWçµ\u0005Ê£\u0002Á4o\u001b\u008c\u0085*¯H\u009aö\u0002\u0014\u0014²WÓ¢qª\u009fÇ=\u001d['ùY&\u008dD¯â\u0096\u0000\u0004®2Ìbm\u0082\u008b°)ÇW&õ+\u0013@°\u0090Þ¶|ß\u009a181fh\u0087\u0091\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ak+\u0091Í©oÇ\u00114³9URö\u0082\u0098¤:ÍÜ#~# zÁ\u0083\u0085±$SÆ,`ä\u0002Ò¬ýOcéI\u008b|5ä×òq±\u0010D²L\\!þû\u0098Á:¿åk\u0087I!pÃâmÔ\u000f\u0094®~H\\ê7\u0094÷6ÝÐ\u0082sk\u001dQ¿0YîûÉ\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008aq+\u009dÍ¼o×\u0011\u0012³?UUö°\u0098¤:ÃÜ\u0000~9\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008a`+\u0094Í¢oÑ\u0011\u0012³\u001bUHö\u0098\u0098¯:ÏÜ\u0002\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ai+\u008bÍ\u008coÎ\u0011\u0012³>UU\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ai+\u008bÍ\u008eoÍ\u0011\u0019³*UHö\u0084\u0098¦*'\u008bÅiºÏr\u00adD\u0003kàõFß$ê\u009arxdÞ'¿Ò\u001dÚó·Qm7W\u0095)Jý(ß\u008eæltÂB \u000b\u0001éçÿE²;z\u0099C\u007f3Üà\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ai+\u008bÍ\u008foÇ\u0011\u0011³#USö\u0093\u0098\u009e:ÎÜ\u0019~% ~Á\u0090\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008af+\u0080Í®oÇ\u0011\u0012³(UDö\u0092\u0098\u008f:ÁÜ\u0001~+ }Á\u0095cº\u0005û§\"I=ër\u008c\u0086.¦\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ad+\u009dÍ¢oÎ\u0011\u0018³/U@ö\u0082\u0098¢:ÏÜ\u001b~\u001a zÁ\u0086c¤\u0005÷§\u0000I;ët\u008c\u009d.©Ðïr\"\u0014.¶tW\u0087ù\u0095\u009bè=\u0000ß)\u0081i\"\u009a\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ad+\u009dÍ¢oÎ\u0011\u0018³/U@ö\u0082\u0098¢:ÏÜ\u001b~\u001a zÁ\u0086c¤\u0005÷§\u0000I;ët\u008c\u009d.©Ðïr9\u0014/¶\u007fW\u0095ù\u0095\u009bè=\u0000ß)\u0081i\"\u009aúQ[³¹Ì\u001f\u0004}2Ó\u001d0\u0083\u0096©ô\u009cJ\u0004¨\u0012\u000eQo¤Í¬#Á\u0081\u001bç!E_\u009a\u008bø©^\u0090¼\u0002\u00124pgÑ\u00897«\u0095Ûë\nI+¯F\f\u008bb°ÀÚ&3\u0084;Úz;\u0095\u0099¸ÿù]\u0013\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u001eR3ôK\u0095\u00907¸ÙÈ{\u001c\u001dp¿J`\u0088\u0002¦¤ÃF\u0010è \u008a\u0003+\u0097Í£oò\u0011\u0012³>ULö\u009f\u0098¸:ÓÜ\u001c~% qÁ¦c¬\u0005ï§\u0006I-ën\u008c\u0086\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008as+\u009dÍ¿oÏ\u0011\u001e³?URö\u009f\u0098¤:ÎÜ'~/ nÁ\u0081c¬\u0005í§\u0007I\u000bë|\u008c\u009c.¤Ðùr\u001d\u0014#¶\u007fq5Ð×2¨\u0094`öVXy»ç\u001dÍ\u007føÁn#C\u0085;äàFÈ¨¸\nll\u0000Î:\u0011øsÖÕ³7`\u0099PûsZç¼Ó\u001e\u0082`bÂN$<\u0087ïéÈK£\u00adl\u000fUQ\u0001°Ö\u0012Üt\u009fÖv8]\u009a\u001eýö_ô¡\u008d\u0003oeUÇ\u000e&ì\u0088Ðê\u008e²§\u0013Eñ:Wò5Ä\u009bëxuÞ_¼j\u0002òàäF§'R\u0085Zk7Éí¯×\r©Ò}°_\u0016fôôZÂ8\u008b\u0099i\u007f{Ý)£ø\u0001Ëç¬Da*]³¤\u0012Fð9Vñ4Ç\u009aèyvß\\½i\u0003ñáçG¤&Q\u0084Yj4Èî®Ô\fªÓ~±\\\u0017eõ÷[Á9\u0081\u0098v~BÜ0¢ù\u0000Áæ¥EZ+O\u00892oçÍÊ\u0093\u0099rp\u0086ù'\u001bÅdc¬\u0001\u009a¯µL+ê\u0001\u008846¬Ôºrù\u0013\f±\u0004_iý³\u009b\u00899÷æ#\u0084\u0001\"8À¢n\u0097\fë\u00ad\u0000K\u0014éx\u0097ª5\u0085Óñp>\u001e!¼uZ\u00adø\u0093¦ÌG\u0018å\u001a\u0083Q!»Ï\u0091mÓø^Y¼»Ã\u001d\u000b\u007f=Ñ\u00122\u008c\u0094¦ö\u0093H\u000bª\u001d\f^m«Ï£!Î\u0083\u0014å.GP\u0098\u0084ú¦\\\u009f¾\u0005\u00100rLÓµ5¿\u0097Ýé\tK8\u00adv\u000e\u0082`±Âß$\u0007\u0086?Øc9¿\u009b ýê_\u000f±!\u0013ct\u009aÖ¯(Ñ\u008a\u0003ì8Nw-N\u008c¬nÓÈ\u001bª-\u0004\u0002ç\u009cA¶#\u0083\u009d\u001b\u007f\rÙN¸»\u001a³ôÞV\u00040>\u0092@M\u0094/¶\u0089\u008fk\u0015Å §\\\u0006¥à¯BÚ<\u0015\u009e3xOÛ\u0099µ\u0088\u0017Âñ\rS5\r{ì\u008dN»\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ap+\u0090Í¢oÕ\u00111³%UMö\u0093\u0098\u0088:ÈÜ\u001a~% lÁ\u0091c»þ\u0089_^½0\u001bÆyÈ×¦4`\u0092Mð#N÷¬ë\n¬kpÉ|' \u0085çãÑA¦\u009eqübZ&¸þ\u0016Åt£Õbª°\u000bgé\tOü-á\u0083©`LÆf¤<\u001aÂø÷^\u009f?F\u009dcs2ÑÀ·î\u0015\u0097ÊC¨l".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, ErrorCodes.THROWABLE);
        f2342 = cArr;
        f2344 = 7165630791747346901L;
    }

    public hi(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2346 = webChromeClient;
        this.f2345 = webChromeClient2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Object m6538() {
        int i10 = (f2343 + 37) % 128;
        f2341 = i10;
        WebChromeClient webChromeClient = this.f2345;
        f2343 = (i10 + 109) % 128;
        return webChromeClient;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebChromeClient m6539() {
        int i10 = (f2343 + 31) % 128;
        f2341 = i10;
        WebChromeClient webChromeClient = this.f2346;
        f2343 = (i10 + 67) % 128;
        return webChromeClient;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6540(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2342[i10 + i12]) ^ (((long) i12) * f2344)) ^ ((long) c10));
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

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        try {
            this.f2345.getDefaultVideoPoster();
            f2343 = (f2341 + 119) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6540(Process.myTid() >> 22, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9231), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m6540((ViewConfiguration.getEdgeSlop() >> 16) + 889, (char) (34492 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 42 - TextUtils.indexOf("", "")).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            return super.getDefaultVideoPoster();
        }
        int i10 = f2343 + 29;
        f2341 = i10 % 128;
        if (i10 % 2 != 0) {
            return webChromeClient.getDefaultVideoPoster();
        }
        webChromeClient.getDefaultVideoPoster();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        try {
            this.f2345.getVideoLoadingProgressView();
        } catch (Throwable th2) {
            kd.m7160(m6540(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9232), 24 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m6540(931 - Color.red(0), (char) (63515 - TextUtils.indexOf("", "", 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            f2343 = (f2341 + 77) % 128;
            return webChromeClient.getVideoLoadingProgressView();
        }
        View videoLoadingProgressView = super.getVideoLoadingProgressView();
        int i10 = f2343 + 77;
        f2341 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 62 / 0;
        }
        return videoLoadingProgressView;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        try {
            this.f2345.getVisitedHistory(valueCallback);
        } catch (Throwable th2) {
            kd.m7160(m6540(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 9231), 24 - TextUtils.getOffsetBefore("", 0)).intern(), m6540(979 - (ViewConfiguration.getTouchSlop() >> 8), (char) (11532 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 38 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            f2343 = (f2341 + 121) % 128;
            webChromeClient.getVisitedHistory(valueCallback);
            return;
        }
        super.getVisitedHistory(valueCallback);
        int i10 = f2341 + 51;
        f2343 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        try {
            this.f2345.onCloseWindow(webView);
            f2341 = (f2343 + 31) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6540(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (9232 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m6540(TextUtils.indexOf("", "") + 320, (char) View.resolveSize(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
        } else {
            f2343 = (f2341 + 7) % 128;
            webChromeClient.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i10, String str2) {
        try {
            this.f2345.onConsoleMessage(str, i10, str2);
        } catch (Throwable th2) {
            kd.m7160(m6540(ViewConfiguration.getTapTimeout() >> 16, (char) (9231 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 24).intern(), m6540(852 - Drawable.resolveOpacity(0, 0), (char) (View.combineMeasuredStates(0, 0) + 46049), 38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onConsoleMessage(str, i10, str2);
            int i11 = f2341 + 27;
            f2343 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i12 = f2341 + 79;
        f2343 = i12 % 128;
        if (i12 % 2 != 0) {
            webChromeClient.onConsoleMessage(str, i10, str2);
            throw null;
        }
        webChromeClient.onConsoleMessage(str, i10, str2);
        f2341 = (f2343 + 83) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        int i10 = f2343 + 101;
        f2341 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m6540(Color.argb(0, 0, 0, 0), (char) (Color.red(0) + 9231), Color.alpha(0) + 24).intern(), m6540((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 250, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 34292), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2345.onCreateWindow(webView, z10, z11, message);
            throw null;
        }
        this.f2345.onCreateWindow(webView, z10, z11, message);
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            return webChromeClient.onCreateWindow(webView, z10, z11, message);
        }
        boolean zOnCreateWindow = super.onCreateWindow(webView, z10, z11, message);
        f2341 = (f2343 + 17) % 128;
        return zOnCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        int i10 = f2343 + 93;
        f2341 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2345.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
                int i11 = 36 / 0;
            } else {
                this.f2345.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            }
        } catch (Throwable th2) {
            kd.m7160(m6540(Process.myTid() >> 22, (char) (9231 - View.resolveSizeAndState(0, 0, 0)), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m6540(KeyEvent.getDeadChar(0, 0) + 484, (char) View.resolveSize(0, 0), 43 - TextUtils.lastIndexOf("", '0', 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            int i12 = f2341 + 29;
            f2343 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i13 = f2343 + 121;
        f2341 = i13 % 128;
        if (i13 % 2 != 0) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
        } else {
            webChromeClient.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        try {
            this.f2345.onGeolocationPermissionsHidePrompt();
            f2343 = (f2341 + 27) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6540(TextUtils.indexOf("", "", 0, 0), (char) (MotionEvent.axisFromString("") + 9232), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m6540(583 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getTrimmedLength("") + 55).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsHidePrompt();
            return;
        }
        int i10 = f2343 + 23;
        f2341 = i10 % 128;
        if (i10 % 2 == 0) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
            throw null;
        }
        webChromeClient.onGeolocationPermissionsHidePrompt();
        f2343 = (f2341 + 123) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i10 = f2341 + 7;
        f2343 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m6540(TextUtils.indexOf("", "", 0), (char) (9230 - TextUtils.indexOf((CharSequence) "", '0')), 23 - ImageFormat.getBitsPerPixel(0)).intern(), m6540(528 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2345.onGeolocationPermissionsShowPrompt(str, callback);
            throw null;
        }
        this.f2345.onGeolocationPermissionsShowPrompt(str, callback);
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            return;
        }
        webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
        int i11 = f2343 + 61;
        f2341 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 16 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i10 = f2341 + 67;
        f2343 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m6540(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9230), 24 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m6540(213 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 37 - View.combineMeasuredStates(0, 0)).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2345.onHideCustomView();
            throw null;
        }
        this.f2345.onHideCustomView();
        f2341 = (f2343 + 7) % 128;
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        } else {
            super.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        f2341 = (f2343 + 73) % 128;
        try {
            this.f2345.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th2) {
            kd.m7160(m6540(ViewConfiguration.getTouchSlop() >> 8, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 9231), 23 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m6540(Drawable.resolveOpacity(0, 0) + 354, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        f2341 = (f2343 + 105) % 128;
        return webChromeClient.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f2345.onJsBeforeUnload(webView, str, str2, jsResult);
            f2341 = (f2343 + 57) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6540((Process.getThreadPriority(0) + 20) >> 6, (char) ((Process.myTid() >> 22) + 9231), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m6540(447 - Drawable.resolveOpacity(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 37 - (Process.myTid() >> 22)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        int i10 = f2341 + 29;
        f2343 = i10 % 128;
        if (i10 % 2 == 0) {
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = f2343 + 37;
        f2341 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m6540(TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 9231), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m6540((ViewConfiguration.getEdgeSlop() >> 16) + 384, (char) Gravity.getAbsoluteGravity(0, 0), 32 - View.MeasureSpec.getSize(0)).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2345.onJsConfirm(webView, str, str2, jsResult);
            throw null;
        }
        this.f2345.onJsConfirm(webView, str, str2, jsResult);
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        int i11 = f2341 + 81;
        f2343 = i11 % 128;
        if (i11 % 2 != 0) {
            webChromeClient.onJsConfirm(webView, str, str2, jsResult);
            throw null;
        }
        boolean zOnJsConfirm = webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        int i12 = f2343 + 121;
        f2341 = i12 % 128;
        if (i12 % 2 != 0) {
            return zOnJsConfirm;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        WebView webView2;
        String str4;
        String str5;
        String str6;
        JsPromptResult jsPromptResult2;
        f2341 = (f2343 + 51) % 128;
        try {
            try {
                this.f2345.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                jsPromptResult2 = jsPromptResult;
                str6 = str3;
                str5 = str2;
                str4 = str;
                webView2 = webView;
            } catch (Throwable th2) {
                th = th2;
                jsPromptResult2 = jsPromptResult;
                str6 = str3;
                str5 = str2;
                str4 = str;
                webView2 = webView;
                kd.m7160(m6540(Color.blue(0), (char) (9231 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 24 - TextUtils.indexOf("", "", 0)).intern(), m6540(416 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (10850 - (ViewConfiguration.getTouchSlop() >> 8)), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th, false);
            }
        } catch (Throwable th3) {
            th = th3;
            webView2 = webView;
            str4 = str;
            str5 = str2;
            str6 = str3;
            jsPromptResult2 = jsPromptResult;
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            return super.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
        }
        int i10 = f2343 + 43;
        f2341 = i10 % 128;
        if (i10 % 2 != 0) {
            return webChromeClient.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
        }
        webChromeClient.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        int i10 = f2341 + 49;
        f2343 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m6540(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 9231), (ViewConfiguration.getTapTimeout() >> 16) + 24).intern(), m6540((ViewConfiguration.getLongPressTimeout() >> 16) + 820, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 45794), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2345.onJsTimeout();
            throw null;
        }
        this.f2345.onJsTimeout();
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            return super.onJsTimeout();
        }
        f2341 = (f2343 + 59) % 128;
        return webChromeClient.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            this.f2345.onPermissionRequest(permissionRequest);
            f2341 = (f2343 + 111) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6540(View.combineMeasuredStates(0, 0), (char) (9231 - View.MeasureSpec.getMode(0)), 24 - View.combineMeasuredStates(0, 0)).intern(), m6540(638 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64021), TextUtils.indexOf("", "", 0, 0) + 40).intern(), th2, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2346;
            if (webChromeClient != null) {
                f2343 = (f2341 + 71) % 128;
                webChromeClient.onPermissionRequest(permissionRequest);
            } else {
                super.onPermissionRequest(permissionRequest);
                f2343 = (f2341 + 57) % 128;
            }
        } catch (Throwable th3) {
            kd.m7160(m6540(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (9231 - (Process.myTid() >> 22)), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m6540(678 - View.MeasureSpec.getMode(0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            this.f2345.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th2) {
            kd.m7160(m6540(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9230), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m6540(721 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - Process.getGidForName("")), (Process.myPid() >> 22) + 48).intern(), th2, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2346;
            if (webChromeClient != null) {
                f2343 = (f2341 + 121) % 128;
                webChromeClient.onPermissionRequestCanceled(permissionRequest);
            } else {
                super.onPermissionRequestCanceled(permissionRequest);
                f2343 = (f2341 + 53) % 128;
            }
        } catch (Throwable th3) {
            kd.m7160(m6540(TextUtils.indexOf("", "", 0), (char) (9231 - TextUtils.indexOf("", "")), 24 - Color.green(0)).intern(), m6540(770 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 29040), 51 - Gravity.getAbsoluteGravity(0, 0)).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        int i11 = f2343 + 37;
        f2341 = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                this.f2345.onProgressChanged(webView, i10);
                int i12 = 33 / 0;
            } else {
                this.f2345.onProgressChanged(webView, i10);
            }
        } catch (Throwable th2) {
            kd.m7160(m6540((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (9231 - (Process.myTid() >> 22)), View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern(), m6540((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, (char) (Process.myPid() >> 22), 38 - TextUtils.indexOf("", "", 0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i10);
            f2341 = (f2343 + 69) % 128;
        } else {
            super.onProgressChanged(webView, i10);
            f2343 = (f2341 + 75) % 128;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        f2341 = (f2343 + 19) % 128;
        try {
            this.f2345.onReceivedIcon(webView, bitmap);
        } catch (Throwable th2) {
            kd.m7160(m6540((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9230), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25).intern(), m6540(ExpandableListView.getPackedPositionChild(0L) + 99, (char) (View.combineMeasuredStates(0, 0) + 3157), 36 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onReceivedIcon(webView, bitmap);
            return;
        }
        int i10 = f2341 + 87;
        f2343 = i10 % 128;
        if (i10 % 2 == 0) {
            webChromeClient.onReceivedIcon(webView, bitmap);
        } else {
            webChromeClient.onReceivedIcon(webView, bitmap);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        try {
            this.f2345.onReceivedTitle(webView, str);
        } catch (Throwable th2) {
            kd.m7160(m6540(TextUtils.getTrimmedLength(""), (char) (9231 - Gravity.getAbsoluteGravity(0, 0)), 24 - Color.red(0)).intern(), m6540(62 - (ViewConfiguration.getTapTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0), 36 - View.resolveSize(0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onReceivedTitle(webView, str);
            return;
        }
        f2343 = (f2341 + 11) % 128;
        webChromeClient.onReceivedTitle(webView, str);
        f2343 = (f2341 + 31) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        int i10 = f2343 + 125;
        f2341 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m6540(TextUtils.getTrimmedLength(""), (char) (9230 - TextUtils.lastIndexOf("", '0', 0, 0)), 24 - (Process.myPid() >> 22)).intern(), m6540(134 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (Color.green(0) + 14086), (Process.myTid() >> 22) + 43).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2345.onReceivedTouchIconUrl(webView, str, z10);
            throw null;
        }
        this.f2345.onReceivedTouchIconUrl(webView, str, z10);
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            super.onReceivedTouchIconUrl(webView, str, z10);
            return;
        }
        int i11 = f2343 + 59;
        f2341 = i11 % 128;
        if (i11 % 2 == 0) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z10);
            throw null;
        }
        webChromeClient.onReceivedTouchIconUrl(webView, str, z10);
        int i12 = f2341 + 39;
        f2343 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        try {
            this.f2345.onRequestFocus(webView);
            f2341 = (f2343 + 3) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6540(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (char) (TextUtils.indexOf((CharSequence) "", '0') + 9232), ExpandableListView.getPackedPositionGroup(0L) + 24).intern(), m6540(285 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.green(0) + 35).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            webChromeClient.onRequestFocus(webView);
        } else {
            super.onRequestFocus(webView);
            f2343 = (f2341 + 45) % 128;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        f2343 = (f2341 + 33) % 128;
        try {
            this.f2345.onShowCustomView(view, customViewCallback);
            f2341 = (f2343 + 109) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6540(KeyEvent.normalizeMetaState(0), (char) (9279 - AndroidCharacter.getMirror('0')), 23 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m6540(176 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 17939), (ViewConfiguration.getTapTimeout() >> 16) + 37).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        } else {
            super.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i10 = f2341 + 23;
        f2343 = i10 % 128;
        if (i10 % 2 != 0) {
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    this.f2345.onShowFileChooser(webView, valueCallback, fileChooserParams);
                }
                f2343 = (f2341 + 51) % 128;
            } catch (Throwable th2) {
                kd.m7160(m6540(TextUtils.getOffsetBefore("", 0), (char) (ExpandableListView.getPackedPositionType(0L) + 9231), 24 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), m6540(1017 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38).intern(), th2, false);
            }
        } else {
            this.f2345.onShowFileChooser(webView, valueCallback, fileChooserParams);
            f2343 = (f2341 + 51) % 128;
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        boolean zOnShowFileChooser = webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        f2343 = (f2341 + 81) % 128;
        return zOnShowFileChooser;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5100(java.lang.String r7, java.util.List<java.lang.Object> r8, com.ironsource.adqualitysdk.sdk.i.ch r9) {
        /*
            r6 = this;
            int r8 = com.ironsource.adqualitysdk.sdk.i.hi.f2343
            int r8 = r8 + 83
            int r8 = r8 % 128
            com.ironsource.adqualitysdk.sdk.i.hi.f2341 = r8
            int r8 = r7.hashCode()
            r9 = 1395849045(0x5332f755, float:7.686537E11)
            java.lang.String r0 = ""
            r1 = 0
            r3 = 1
            if (r8 == r9) goto L50
            r9 = 1442029578(0x55f3a00a, float:3.3483586E13)
            if (r8 == r9) goto L1c
            goto L80
        L1c:
            long r8 = android.view.ViewConfiguration.getZoomControlsTimeout()
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            int r8 = 1056 - r8
            r9 = 65262(0xfeee, float:9.1452E-41)
            r1 = 0
            int r2 = android.graphics.Color.green(r1)
            int r9 = r9 - r2
            char r9 = (char) r9
            int r0 = android.text.TextUtils.getOffsetBefore(r0, r1)
            int r0 = r0 + 25
            java.lang.String r8 = m6540(r8, r9, r0)
            java.lang.String r8 = r8.intern()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L80
            int r7 = com.ironsource.adqualitysdk.sdk.i.hi.f2341
            int r7 = r7 + 99
            int r8 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.hi.f2343 = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L81
        L4e:
            r1 = r3
            goto L81
        L50:
            int r8 = android.widget.ExpandableListView.getPackedPositionGroup(r1)
            int r8 = 1080 - r8
            long r1 = android.os.SystemClock.currentThreadTimeMillis()
            r4 = -1
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = 43736(0xaad8, float:6.1287E-41)
            int r1 = r1 - r9
            char r9 = (char) r1
            int r0 = android.os.Process.getGidForName(r0)
            int r0 = 19 - r0
            java.lang.String r8 = m6540(r8, r9, r0)
            java.lang.String r8 = r8.intern()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L80
            int r7 = com.ironsource.adqualitysdk.sdk.i.hi.f2343
            int r7 = r7 + 111
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.hi.f2341 = r7
            goto L4e
        L80:
            r1 = -1
        L81:
            if (r1 == 0) goto L8c
            if (r1 == r3) goto L87
            r7 = 0
            return r7
        L87:
            java.lang.Object r7 = r6.m6538()
            return r7
        L8c:
            android.webkit.WebChromeClient r7 = r6.m6539()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hi.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        f2341 = (f2343 + 109) % 128;
        try {
            this.f2345.onShowCustomView(view, i10, customViewCallback);
        } catch (Throwable th2) {
            kd.m7160(m6540(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (9231 - Color.argb(0, 0, 0, 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23).intern(), m6540(176 - ExpandableListView.getPackedPositionType(0L), (char) (MotionEvent.axisFromString("") + 17939), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            int i11 = f2343 + 115;
            f2341 = i11 % 128;
            if (i11 % 2 != 0) {
                webChromeClient.onShowCustomView(view, i10, customViewCallback);
                return;
            } else {
                webChromeClient.onShowCustomView(view, i10, customViewCallback);
                throw null;
            }
        }
        super.onShowCustomView(view, i10, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        int i10 = f2343 + 27;
        f2341 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2345.onConsoleMessage(consoleMessage);
                int i11 = 25 / 0;
            } else {
                this.f2345.onConsoleMessage(consoleMessage);
            }
        } catch (Throwable th2) {
            kd.m7160(m6540(View.MeasureSpec.getSize(0), (char) (9231 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m6540((ViewConfiguration.getScrollDefaultDelay() >> 16) + 852, (char) (View.MeasureSpec.getSize(0) + 46049), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2346;
        if (webChromeClient != null) {
            f2343 = (f2341 + 39) % 128;
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        f2343 = (f2341 + 85) % 128;
        return zOnConsoleMessage;
    }
}
