package sg.bigo.ads.common.utils;

import android.graphics.Color;
import com.ironsource.D5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f102826a = new SecureRandom();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f102827b = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    public static float a() {
        try {
            return Float.parseFloat(null);
        } catch (Throwable unused) {
            return 5.0f;
        }
    }

    public static int b(String str, int i10) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i10;
        }
    }

    public static byte[] c(String str) {
        if (a((CharSequence) str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i11 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i11])) << 4));
        }
        return bArr;
    }

    public static String d(String str) {
        return a((CharSequence) str) ? str : str.toLowerCase();
    }

    public static String e(String str) {
        try {
            return URLEncoder.encode(str, D5.N);
        } catch (UnsupportedEncodingException e10) {
            sg.bigo.ads.common.t.a.a(0, "StringUtils", "Error encoding url, error message is : " + e10.toString());
            return str;
        }
    }

    public static String f(String str) {
        try {
            return URLDecoder.decode(str, D5.N);
        } catch (UnsupportedEncodingException e10) {
            sg.bigo.ads.common.t.a.a(0, "StringUtils", "Error decoding url, error message is : " + e10.toString());
            return str;
        }
    }

    public static boolean g(String str) {
        if (a((CharSequence) str)) {
            return false;
        }
        return f102827b.matcher(str).matches();
    }

    public static int a(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i10;
        }
    }

    public static boolean b(CharSequence charSequence) {
        return !a(charSequence);
    }

    public static long a(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j10;
        }
    }

    public static boolean b(String str) {
        if (a((CharSequence) str)) {
            return true;
        }
        return a((CharSequence) str.replaceAll("\\s*", ""));
    }

    public static String a(String str) {
        return str == null ? "" : str;
    }

    public static String a(String str, String str2) {
        if (a((CharSequence) str) || a((CharSequence) str2)) {
            return !a((CharSequence) str) ? str : !a((CharSequence) str2) ? str2 : "";
        }
        return str + StringUtils.COMMA + str2;
    }

    public static String a(String str, String str2, String str3, boolean z10) {
        if (a((CharSequence) str) || a((CharSequence) str2) || a((CharSequence) str3)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length() - 1;
        while (true) {
            int iIndexOf = (a((CharSequence) str) || a((CharSequence) str2)) ? -1 : z10 ? str.toLowerCase().indexOf(str2.toLowerCase()) : str.indexOf(str2);
            if (iIndexOf == -1) {
                sb2.append(str);
                return sb2.toString();
            }
            sb2.append(str.substring(0, iIndexOf));
            sb2.append(str3);
            str = iIndexOf < length ? str.substring(iIndexOf + str2.length()) : "";
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String upperCase = Integer.toHexString(b10 & 255).toUpperCase();
            if (upperCase.length() < 2) {
                sb2.append(0);
            }
            sb2.append(upperCase);
        }
        return sb2.toString();
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean a(Object obj) {
        return ((CharSequence) obj).length() == 0;
    }

    public static boolean a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        return Arrays.asList(strArr).contains(str);
    }
}
