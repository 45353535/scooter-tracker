package com.taurusx.tax.g;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import androidx.media3.common.MimeTypes;
import androidx.webkit.internal.AssetHelper;
import com.google.common.base.Ascii;
import com.ironsource.D5;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes11.dex */
public class l0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String w(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 46033:
                if (str.equals(".7z")) {
                    b10 = 0;
                }
                break;
            case 47607:
                if (str.equals(".js")) {
                    b10 = 1;
                }
                break;
            case 47685:
                if (str.equals(".md")) {
                    b10 = 2;
                }
                break;
            case 47875:
                if (str.equals(".sh")) {
                    b10 = 3;
                }
                break;
            case 1467182:
                if (str.equals(".apk")) {
                    b10 = 4;
                }
                break;
            case 1467366:
                if (str.equals(".avi")) {
                    b10 = 5;
                }
                break;
            case 1468055:
                if (str.equals(".bmp")) {
                    b10 = 6;
                }
                break;
            case 1468823:
                if (str.equals(".cgi")) {
                    b10 = 7;
                }
                break;
            case 1469205:
                if (str.equals(".css")) {
                    b10 = 8;
                }
                break;
            case 1469208:
                if (str.equals(".csv")) {
                    b10 = 9;
                }
                break;
            case 1470026:
                if (str.equals(".doc")) {
                    b10 = 10;
                }
                break;
            case 1471004:
                if (str.equals(".eot")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1472726:
                if (str.equals(".gif")) {
                    b10 = Ascii.FF;
                }
                break;
            case 1474471:
                if (str.equals(".ico")) {
                    b10 = 13;
                }
                break;
            case 1475827:
                if (str.equals(".jpg")) {
                    b10 = Ascii.SO;
                }
                break;
            case 1478658:
                if (str.equals(".mp3")) {
                    b10 = Ascii.SI;
                }
                break;
            case 1478659:
                if (str.equals(".mp4")) {
                    b10 = Ascii.DLE;
                }
                break;
            case 1478694:
                if (str.equals(".mov")) {
                    b10 = 17;
                }
                break;
            case 1478710:
                if (str.equals(".mpg")) {
                    b10 = Ascii.DC2;
                }
                break;
            case 1480353:
                if (str.equals(".ogg")) {
                    b10 = 19;
                }
                break;
            case 1480755:
                if (str.equals(".otf")) {
                    b10 = Ascii.DC4;
                }
                break;
            case 1481220:
                if (str.equals(".pdf")) {
                    b10 = Ascii.NAK;
                }
                break;
            case 1481531:
                if (str.equals(".png")) {
                    b10 = Ascii.SYN;
                }
                break;
            case 1481606:
                if (str.equals(".ppt")) {
                    b10 = Ascii.ETB;
                }
                break;
            case 1483061:
                if (str.equals(".rar")) {
                    b10 = Ascii.CAN;
                }
                break;
            case 1484662:
                if (str.equals(".svg")) {
                    b10 = Ascii.EM;
                }
                break;
            case 1484983:
                if (str.equals(".tar")) {
                    b10 = Ascii.SUB;
                }
                break;
            case 1485560:
                if (str.equals(".ttf")) {
                    b10 = Ascii.ESC;
                }
                break;
            case 1485698:
                if (str.equals(".txt")) {
                    b10 = Ascii.FS;
                }
                break;
            case 1487870:
                if (str.equals(".wav")) {
                    b10 = Ascii.GS;
                }
                break;
            case 1489169:
                if (str.equals(".xls")) {
                    b10 = Ascii.RS;
                }
                break;
            case 1489193:
                if (str.equals(".xml")) {
                    b10 = Ascii.US;
                }
                break;
            case 1490995:
                if (str.equals(".zip")) {
                    b10 = 32;
                }
                break;
            case 45570926:
                if (str.equals(".docx")) {
                    b10 = 33;
                }
                break;
            case 45627542:
                if (str.equals(".flac")) {
                    b10 = 34;
                }
                break;
            case 45695193:
                if (str.equals(".html")) {
                    b10 = 35;
                }
                break;
            case 45750678:
                if (str.equals(".jpeg")) {
                    b10 = 36;
                }
                break;
            case 45753878:
                if (str.equals(".json")) {
                    b10 = 37;
                }
                break;
            case 45840051:
                if (str.equals(".mpeg")) {
                    b10 = 38;
                }
                break;
            case 45929906:
                if (str.equals(".pptx")) {
                    b10 = 39;
                }
                break;
            case 46024644:
                if (str.equals(".svgz")) {
                    b10 = 40;
                }
                break;
            case 46041891:
                if (str.equals(".tiff")) {
                    b10 = 41;
                }
                break;
            case 46127303:
                if (str.equals(".webm")) {
                    b10 = 42;
                }
                break;
            case 46127306:
                if (str.equals(".webp")) {
                    b10 = 43;
                }
                break;
            case 46137030:
                if (str.equals(".woff")) {
                    b10 = 44;
                }
                break;
            case 46164359:
                if (str.equals(".xlsx")) {
                    b10 = 45;
                }
                break;
            case 46183381:
                if (str.equals(".yaml")) {
                    b10 = 46;
                }
                break;
            case 1019807246:
                if (str.equals(".jsonld")) {
                    b10 = 47;
                }
                break;
            case 1430247980:
                if (str.equals(".woff2")) {
                    b10 = 48;
                }
                break;
        }
        switch (b10) {
            case 0:
                return "application/x-7z-compressed";
            case 1:
                return "application/javascript";
            case 2:
                return "text/markdown";
            case 3:
                return "application/x-shellscript";
            case 4:
                return "application/vnd.android.package-archive";
            case 5:
                return "video/x-msvideo";
            case 6:
                return MimeTypes.IMAGE_BMP;
            case 7:
                return "application/x-httpd-cgi";
            case 8:
                return "text/css";
            case 9:
                return "text/csv";
            case 10:
                return "application/msword";
            case 11:
                return "application/vnd.ms-fontobject";
            case 12:
                return "image/gif";
            case 13:
                return "image/vnd.microsoft.icon";
            case 14:
            case 36:
                return "image/jpeg";
            case 15:
                return "audio/mpeg";
            case 16:
                return "video/mp4";
            case 17:
                return "video/quicktime";
            case 18:
                return "video/mpeg";
            case 19:
                return "audio/ogg";
            case 20:
                return "font/otf";
            case 21:
                return "application/pdf";
            case 22:
                return MimeTypes.IMAGE_PNG;
            case 23:
                return "application/vnd.ms-powerpoint";
            case 24:
                return "application/x-rar-compressed";
            case 25:
                return "image/svg+xml";
            case 26:
                return "application/x-tar";
            case 27:
                return "font/ttf";
            case 28:
                return AssetHelper.DEFAULT_MIME_TYPE;
            case 29:
                return "audio/wav";
            case 30:
                return "application/vnd.ms-excel";
            case 31:
                return "application/xml";
            case 32:
                return "application/zip";
            case 33:
                return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
            case 34:
                return "audio/flac";
            case 35:
                return "text/html";
            case 37:
                return D5.L;
            case 38:
                return "video/mpeg";
            case 39:
                return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
            case 40:
                return "image/svg+xml";
            case 41:
                return "image/tiff";
            case 42:
                return "video/webm";
            case 43:
                return MimeTypes.IMAGE_WEBP;
            case 44:
                return "font/woff";
            case 45:
                return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
            case 46:
                return "text/yaml";
            case 47:
                return "application/ld+json";
            case 48:
                return "font/woff2";
            default:
                return "";
        }
    }

    public static WebResourceResponse z(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            File file = new File(str);
            if (str.endsWith(".0")) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(12);
                if (TextUtils.isEmpty(strExtractMetadata)) {
                    return null;
                }
                return new WebResourceResponse(strExtractMetadata, "UTF-8", new FileInputStream(file));
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            int iLastIndexOf = str.lastIndexOf(".");
            if (iLastIndexOf <= 0) {
                return null;
            }
            String strW = w("." + str.substring(iLastIndexOf + 1).toLowerCase());
            if (!TextUtils.isEmpty(strW)) {
                return new WebResourceResponse(strW, "UTF-8", fileInputStream);
            }
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
                strGuessContentTypeFromName = AssetHelper.DEFAULT_MIME_TYPE;
            }
            return new WebResourceResponse(strGuessContentTypeFromName, "UTF-8", fileInputStream);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
