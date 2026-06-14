package androidx.webkit.internal;

import com.google.common.base.Ascii;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes5.dex */
class MimeUtil {
    MimeUtil() {
    }

    public static String getMimeFromFileName(String str) {
        if (str == null) {
            return null;
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName != null ? strGuessContentTypeFromName : guessHardcodedMime(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String guessHardcodedMime(String str) {
        byte b10 = 1;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 3315:
                b10 = !lowerCase.equals("gz") ? (byte) -1 : (byte) 0;
                break;
            case 3401:
                if (!lowerCase.equals("js")) {
                    b10 = -1;
                }
                break;
            case 97669:
                b10 = !lowerCase.equals("bmp") ? (byte) -1 : (byte) 2;
                break;
            case 98819:
                b10 = !lowerCase.equals("css") ? (byte) -1 : (byte) 3;
                break;
            case 102340:
                b10 = !lowerCase.equals("gif") ? (byte) -1 : (byte) 4;
                break;
            case 103649:
                b10 = !lowerCase.equals("htm") ? (byte) -1 : (byte) 5;
                break;
            case 104085:
                b10 = !lowerCase.equals("ico") ? (byte) -1 : (byte) 6;
                break;
            case 105441:
                b10 = !lowerCase.equals("jpg") ? (byte) -1 : (byte) 7;
                break;
            case 106458:
                b10 = !lowerCase.equals("m4a") ? (byte) -1 : (byte) 8;
                break;
            case 106479:
                b10 = !lowerCase.equals("m4v") ? (byte) -1 : (byte) 9;
                break;
            case 108089:
                b10 = !lowerCase.equals("mht") ? (byte) -1 : (byte) 10;
                break;
            case 108150:
                b10 = !lowerCase.equals("mjs") ? (byte) -1 : Ascii.VT;
                break;
            case 108272:
                b10 = !lowerCase.equals("mp3") ? (byte) -1 : Ascii.FF;
                break;
            case 108273:
                b10 = !lowerCase.equals("mp4") ? (byte) -1 : (byte) 13;
                break;
            case 108324:
                b10 = !lowerCase.equals("mpg") ? (byte) -1 : Ascii.SO;
                break;
            case 109961:
                b10 = !lowerCase.equals("oga") ? (byte) -1 : Ascii.SI;
                break;
            case 109967:
                b10 = !lowerCase.equals("ogg") ? (byte) -1 : Ascii.DLE;
                break;
            case 109973:
                b10 = !lowerCase.equals("ogm") ? (byte) -1 : (byte) 17;
                break;
            case 109982:
                b10 = !lowerCase.equals("ogv") ? (byte) -1 : Ascii.DC2;
                break;
            case 110834:
                b10 = !lowerCase.equals("pdf") ? (byte) -1 : (byte) 19;
                break;
            case 111030:
                b10 = !lowerCase.equals("pjp") ? (byte) -1 : Ascii.DC4;
                break;
            case 111145:
                b10 = !lowerCase.equals("png") ? (byte) -1 : Ascii.NAK;
                break;
            case 114276:
                b10 = !lowerCase.equals("svg") ? (byte) -1 : Ascii.SYN;
                break;
            case 114791:
                b10 = !lowerCase.equals("tgz") ? (byte) -1 : Ascii.ETB;
                break;
            case 114833:
                b10 = !lowerCase.equals("tif") ? (byte) -1 : Ascii.CAN;
                break;
            case 117484:
                b10 = !lowerCase.equals("wav") ? (byte) -1 : Ascii.EM;
                break;
            case 118660:
                b10 = !lowerCase.equals("xht") ? (byte) -1 : Ascii.SUB;
                break;
            case 118807:
                b10 = !lowerCase.equals("xml") ? (byte) -1 : Ascii.ESC;
                break;
            case 120609:
                b10 = !lowerCase.equals("zip") ? (byte) -1 : Ascii.FS;
                break;
            case 3000872:
                b10 = !lowerCase.equals("apng") ? (byte) -1 : Ascii.GS;
                break;
            case 3145576:
                b10 = !lowerCase.equals("flac") ? (byte) -1 : Ascii.RS;
                break;
            case 3213227:
                b10 = !lowerCase.equals("html") ? (byte) -1 : Ascii.US;
                break;
            case 3259225:
                b10 = !lowerCase.equals("jfif") ? (byte) -1 : (byte) 32;
                break;
            case 3268712:
                b10 = !lowerCase.equals("jpeg") ? (byte) -1 : (byte) 33;
                break;
            case 3271912:
                b10 = !lowerCase.equals("json") ? (byte) -1 : (byte) 34;
                break;
            case 3358085:
                b10 = !lowerCase.equals("mpeg") ? (byte) -1 : (byte) 35;
                break;
            case 3418175:
                b10 = !lowerCase.equals("opus") ? (byte) -1 : (byte) 36;
                break;
            case 3529614:
                b10 = !lowerCase.equals("shtm") ? (byte) -1 : (byte) 37;
                break;
            case 3542678:
                b10 = !lowerCase.equals("svgz") ? (byte) -1 : (byte) 38;
                break;
            case 3559925:
                b10 = !lowerCase.equals("tiff") ? (byte) -1 : (byte) 39;
                break;
            case 3642020:
                b10 = !lowerCase.equals("wasm") ? (byte) -1 : (byte) 40;
                break;
            case 3645337:
                b10 = !lowerCase.equals("webm") ? (byte) -1 : (byte) 41;
                break;
            case 3645340:
                b10 = !lowerCase.equals("webp") ? (byte) -1 : (byte) 42;
                break;
            case 3655064:
                b10 = !lowerCase.equals("woff") ? (byte) -1 : (byte) 43;
                break;
            case 3678569:
                b10 = !lowerCase.equals("xhtm") ? (byte) -1 : (byte) 44;
                break;
            case 96488848:
                b10 = !lowerCase.equals("ehtml") ? (byte) -1 : (byte) 45;
                break;
            case 103877016:
                b10 = !lowerCase.equals("mhtml") ? (byte) -1 : (byte) 46;
                break;
            case 106703064:
                b10 = !lowerCase.equals("pjpeg") ? (byte) -1 : (byte) 47;
                break;
            case 109418142:
                b10 = !lowerCase.equals("shtml") ? (byte) -1 : (byte) 48;
                break;
            case 114035747:
                b10 = !lowerCase.equals("xhtml") ? (byte) -1 : (byte) 49;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
        }
        return null;
    }
}
