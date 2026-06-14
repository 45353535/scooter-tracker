package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ix {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2662 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2663 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2666 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2664 = {'N', 'e', 't', 'U', 'i', 'l', 's', 'E', 'r', 'o', ' ', 'n', 'd', 'g', 'p', 'q', 'u', ':', 'C', '-', 'c', 'z', 'G', 'T', 'O'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2665 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2661 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2668 = 108;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2667 = {193, 192, 178, 153, 164, 188, 187, 191, 175, 219, 218, 224, 209, 229, 220, 205, 216, 213, 207, 155, 214, 223, 167, 140, 212, 222, 169, 225, 210, 152, 142, 166, 233};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m6837(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m6836("\u0002\fÃ", View.MeasureSpec.getMode(0) + 3, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 112)).intern());
        int i10 = f2663 + 21;
        f2662 = i10 % 128;
        if (i10 % 2 != 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static iq m6838(JSONObject jSONObject, String str) {
        HttpURLConnection httpURLConnectionM6840;
        long jM7066;
        String strM6843;
        int responseCode;
        String responseMessage;
        int i10 = f2663 + 23;
        f2662 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                httpURLConnectionM6840 = m6840(str);
                byte[] bArrM6845 = m6845(httpURLConnectionM6840, jSONObject);
                jM7066 = jx.m7066();
                m6847(httpURLConnectionM6840, bArrM6845);
                strM6843 = m6843(httpURLConnectionM6840);
                responseCode = httpURLConnectionM6840.getResponseCode();
                responseMessage = httpURLConnectionM6840.getResponseMessage();
                if (responseCode >= 28484) {
                    httpURLConnectionM6840.disconnect();
                }
            } else {
                httpURLConnectionM6840 = m6840(str);
                byte[] bArrM68452 = m6845(httpURLConnectionM6840, jSONObject);
                jM7066 = jx.m7066();
                m6847(httpURLConnectionM6840, bArrM68452);
                strM6843 = m6843(httpURLConnectionM6840);
                responseCode = httpURLConnectionM6840.getResponseCode();
                responseMessage = httpURLConnectionM6840.getResponseMessage();
                if (responseCode >= 400) {
                    httpURLConnectionM6840.disconnect();
                }
            }
            String str2 = responseMessage;
            iq iqVar = new iq(strM6843, responseCode, str2, jx.m7066() - jM7066);
            int i11 = f2662 + 9;
            f2663 = i11 % 128;
            if (i11 % 2 == 0) {
                return iqVar;
            }
            throw null;
        } catch (Throwable th2) {
            String strIntern = m6836("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", Process.getGidForName("") + 9, (byte) (Gravity.getAbsoluteGravity(0, 0) + 35)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6836("\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u0013\u000e\u0007\u0001\r\u0005\u0000\u0010\u0015\u0006\u0007\u0001\u000f\f", 28 - TextUtils.indexOf("", ""), (byte) (89 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m7118(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static iq m6841(String str) {
        HttpURLConnection httpURLConnectionM6837;
        long jM7066;
        String strM6843;
        int responseCode;
        String responseMessage;
        int i10 = f2663 + 75;
        f2662 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                httpURLConnectionM6837 = m6837(str);
                jM7066 = jx.m7066();
                strM6843 = m6843(httpURLConnectionM6837);
                responseCode = httpURLConnectionM6837.getResponseCode();
                responseMessage = httpURLConnectionM6837.getResponseMessage();
                if (responseCode >= 29428) {
                    httpURLConnectionM6837.disconnect();
                }
            } else {
                httpURLConnectionM6837 = m6837(str);
                jM7066 = jx.m7066();
                strM6843 = m6843(httpURLConnectionM6837);
                responseCode = httpURLConnectionM6837.getResponseCode();
                responseMessage = httpURLConnectionM6837.getResponseMessage();
                if (responseCode >= 400) {
                    httpURLConnectionM6837.disconnect();
                }
            }
            iq iqVar = new iq(strM6843, responseCode, responseMessage, jx.m7066() - jM7066);
            int i11 = f2662 + 47;
            f2663 = i11 % 128;
            if (i11 % 2 == 0) {
                return iqVar;
            }
            throw null;
        } catch (Throwable th2) {
            String strIntern = m6836("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", (ViewConfiguration.getPressedStateDuration() >> 16) + 8, (byte) (35 - Color.green(0))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6836("\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u000b\u0003\u0000\f\u0006\u0003\u0010\u0011\u0006\u000b\u0007\u0016\u0087", 27 - TextUtils.getOffsetBefore("", 0), (byte) (View.combineMeasuredStates(0, 0) + 103)).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m7118(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6847(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m6844(dataOutputStream);
        f2662 = (f2663 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m6849(iq iqVar) {
        int i10 = f2662 + 43;
        f2663 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (iqVar == null) {
            return null;
        }
        String strM6804 = iqVar.m6804();
        f2662 = (f2663 + 57) % 128;
        return strM6804;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6836(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2664;
                char c10 = f2666;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m6848(String str) {
        int i10 = f2663 + 65;
        f2662 = i10 % 128;
        int i11 = i10 % 2;
        int length = str.length();
        if (i11 == 0) {
            if (length <= 5209) {
                return false;
            }
        } else if (length <= 256) {
            return false;
        }
        int i12 = f2663 + 15;
        f2662 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m6845(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        String strM6839 = m6839(jSONObject);
        byte[] bytes = strM6839.getBytes(m6842(null, 127 - (Process.myTid() >> 22), null, "\u0085\u0084\u0083\u0082\u0081").intern());
        if (!m6848(strM6839)) {
            return bytes;
        }
        f2663 = (f2662 + 121) % 128;
        httpURLConnection.setRequestProperty(m6836("\u0013\b\f\u0001\u0006\u0010\u0004\u0011\u0006\f\u0018\u0005\u000e\u0002\f\u000e", 16 - View.getDefaultSize(0, 0), (byte) (20 - TextUtils.getCapsMode("", 0, 0))).intern(), m6836("\u000b\u0017\t\u0013", 4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 14)).intern());
        byte[] bArrM6846 = m6846(bytes);
        f2662 = (f2663 + 109) % 128;
        return bArrM6846;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m6840(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m6842(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0082\u0088\u0087\u0086").intern());
        httpURLConnection.setRequestProperty(m6842(null, (Process.myTid() >> 22) + 127, null, "\u008d\u008f\u008e\u0082\u0084\u008c\u008b\u008d\u008c\u008b\u008a\u0089").intern(), m6842(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u0085\u0084\u009d\u008c\u009c\u009b\u008c\u008d\u0096\u009a\u0090\u0099\u0093\u0098\u0097\u008b\u008a\u0096\u0095\u0094\u008b\u008a\u0092\u008c\u0090\u0093\u0092\u0091\u008f\u008f\u0090").intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        f2663 = (f2662 + 17) % 128;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6843(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        String string = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    stringBuffer = new StringBuffer();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        k.m7118(m6836("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", View.combineMeasuredStates(0, 0) + 8, (byte) (35 - Gravity.getAbsoluteGravity(0, 0))).intern(), m6836("\b\t\t\u0005\u0005\r\u000b\u0003\u008a\u008a\u0001\u000e\u000e\u000b\u0006\u0003\t\u000b\u0006\u000e\u000b\u0006", ExpandableListView.getPackedPositionGroup(0L) + 22, (byte) (22 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), th);
                    } finally {
                        m6844(inputStream);
                        m6844(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            bufferedReader = null;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            f2663 = (f2662 + 5) % 128;
            if (stringBuffer.length() > 0) {
                int i10 = f2662 + 109;
                f2663 = i10 % 128;
                if (i10 % 2 != 0) {
                    stringBuffer.append('a');
                } else {
                    stringBuffer.append('\r');
                }
            }
            stringBuffer.append(line);
            return string;
        }
        string = stringBuffer.toString();
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6839(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strM7039 = jv.m7039(string);
        String strSubstring = string.substring(0, string.lastIndexOf(125));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(m6842(null, 127 - TextUtils.indexOf("", "", 0), null, "\u009f \u009f\u0096\u0099\u009f\u009e").intern());
        sb2.append(strM7039);
        sb2.append(m6842(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "¡\u009f").intern());
        String string2 = sb2.toString();
        f2663 = (f2662 + 73) % 128;
        return string2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m6844(Closeable closeable) {
        f2663 = (f2662 + 29) % 128;
        if (closeable != null) {
            try {
                closeable.close();
                f2663 = (f2662 + 21) % 128;
            } catch (Throwable unused) {
                return;
            }
        }
        int i10 = f2662 + 93;
        f2663 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 30 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m6846(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (Exception e10) {
                    e = e10;
                    gZIPOutputStream = gZIPOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6842(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3012) {
            try {
                char[] cArr2 = f2667;
                int i11 = f2668;
                if (f2661) {
                    int length = bArr.length;
                    m.f3014 = length;
                    char[] cArr3 = new char[length];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i12 = m.f3013;
                        int i13 = m.f3014 - 1;
                        int i14 = m.f3013;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3013 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2665) {
                    int length2 = cArr.length;
                    m.f3014 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i15 = m.f3013;
                        int i16 = m.f3014 - 1;
                        int i17 = m.f3013;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3013 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3014 = length3;
                char[] cArr5 = new char[length3];
                m.f3013 = 0;
                while (m.f3013 < m.f3014) {
                    int i18 = m.f3013;
                    int i19 = m.f3014 - 1;
                    int i20 = m.f3013;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3013 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
