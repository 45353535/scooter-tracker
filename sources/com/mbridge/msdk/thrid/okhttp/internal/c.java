package com.mbridge.msdk.thrid.okhttp.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import com.ironsource.C4240b4;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.e;
import com.mbridge.msdk.thrid.okio.f;
import com.mbridge.msdk.thrid.okio.s;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f51201a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f51203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f51204d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Method f51218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f51219s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f51202b = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f f51205e = f.a("efbbbf");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f51206f = f.a("feff");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f51207g = f.a("fffe");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final f f51208h = f.a("0000ffff");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final f f51209i = f.a("ffff0000");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Charset f51210j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Charset f51211k = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Charset f51212l = Charset.forName(CharEncoding.UTF_16BE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Charset f51213m = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Charset f51214n = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Charset f51215o = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TimeZone f51216p = DesugarTimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Comparator<String> f51217q = new a();

    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f51220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51221b;

        b(String str, boolean z10) {
            this.f51220a = str;
            this.f51221b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f51220a);
            thread.setDaemon(this.f51221b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f51201a = bArr;
        Method declaredMethod = null;
        f51203c = b0.a(null, bArr);
        f51204d = z.a(null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f51218r = declaredMethod;
        f51219s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public static boolean b(s sVar, int i10, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jC = sVar.b().d() ? sVar.b().c() - jNanoTime : Long.MAX_VALUE;
        sVar.b().a(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
            while (sVar.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                cVar.k();
            }
            if (jC == Long.MAX_VALUE) {
                sVar.b().a();
                return true;
            }
            sVar.b().a(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                sVar.b().a();
                return false;
            }
            sVar.b().a(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                sVar.b().a();
            } else {
                sVar.b().a(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static int c(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static String d(String str, int i10, int i11) {
        int iB = b(str, i10, i11);
        return str.substring(iB, c(str, iB, i11));
    }

    public static void a(Throwable th2, Throwable th3) {
        Method method = f51218r;
        if (method != null) {
            try {
                method.invoke(th2, th3);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static int c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean d(String str) {
        return f51219s.matcher(str).matches();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!a(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                if (!"bio == null".equals(e11.getMessage())) {
                    throw e11;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(s sVar, int i10, TimeUnit timeUnit) {
        try {
            return b(sVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <T> List<T> a(T... tArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(String str, boolean z10) {
        return new b(str, z10);
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int b(String str, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static r b(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        r.a aVar = new r.a();
        for (com.mbridge.msdk.thrid.okhttp.internal.http2.c cVar : list) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(aVar, cVar.f51359a.m(), cVar.f51360b.m());
        }
        return aVar.a();
    }

    public static String a(com.mbridge.msdk.thrid.okhttp.s sVar, boolean z10) {
        String strG;
        if (sVar.g().contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            strG = C4240b4.j.f42672d + sVar.g() + C4240b4.j.f42674e;
        } else {
            strG = sVar.g();
        }
        if (!z10 && sVar.j() == com.mbridge.msdk.thrid.okhttp.s.a(sVar.m())) {
            return strG;
        }
        return strG + StringUtils.PROCESS_POSTFIX_DELIMITER + sVar.j();
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    public static int a(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int a(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String a(String str) {
        InetAddress inetAddressA;
        if (str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            if (str.startsWith(C4240b4.j.f42672d) && str.endsWith(C4240b4.j.f42674e)) {
                inetAddressA = a(str, 1, str.length() - 1);
            } else {
                inetAddressA = a(str, 0, str.length());
            }
            if (inetAddressA == null) {
                return null;
            }
            byte[] address = inetAddressA.getAddress();
            if (address.length == 16) {
                return a(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (b(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(e eVar, Charset charset) throws IOException {
        if (eVar.a(0L, f51205e)) {
            eVar.skip(r0.j());
            return f51210j;
        }
        if (eVar.a(0L, f51206f)) {
            eVar.skip(r0.j());
            return f51212l;
        }
        if (eVar.a(0L, f51207g)) {
            eVar.skip(r0.j());
            return f51213m;
        }
        if (eVar.a(0L, f51208h)) {
            eVar.skip(r0.j());
            return f51214n;
        }
        if (!eVar.a(0L, f51209i)) {
            return charset;
        }
        eVar.skip(r0.j());
        return f51215o;
    }

    public static int a(String str, long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (millis > SieveCacheKt.NodeLinkMask) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j10 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }
        throw new NullPointerException("unit == null");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r4 == 16) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r5 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        r12 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r12, r12);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress a(java.lang.String r12, int r13, int r14) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r13 >= r14) goto L79
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r13 + 2
            r9 = 2
            if (r8 > r14) goto L27
            java.lang.String r10 = "::"
            boolean r10 = r12.regionMatches(r13, r10, r2, r9)
            if (r10 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r14) goto L25
            goto L79
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L34
            java.lang.String r8 = ":"
            r10 = 1
            boolean r8 = r12.regionMatches(r13, r8, r2, r10)
            if (r8 == 0) goto L36
            int r13 = r13 + 1
        L34:
            r6 = r13
            goto L4b
        L36:
            java.lang.String r8 = "."
            boolean r13 = r12.regionMatches(r13, r8, r2, r10)
            if (r13 == 0) goto L4a
            int r13 = r4 + (-2)
            boolean r12 = a(r12, r6, r14, r1, r13)
            if (r12 != 0) goto L47
            return r7
        L47:
            int r4 = r4 + 2
            goto L79
        L4a:
            return r7
        L4b:
            r8 = r2
            r13 = r6
        L4d:
            if (r13 >= r14) goto L60
            char r10 = r12.charAt(r13)
            int r10 = a(r10)
            if (r10 != r3) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r10
            int r13 = r13 + 1
            goto L4d
        L60:
            int r10 = r13 - r6
            if (r10 == 0) goto L78
            r11 = 4
            if (r10 <= r11) goto L68
            goto L78
        L68:
            int r7 = r4 + 1
            int r10 = r8 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r1[r4] = r10
            int r4 = r4 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L78:
            return r7
        L79:
            if (r4 == r0) goto L8a
            if (r5 != r3) goto L7e
            return r7
        L7e:
            int r12 = r4 - r5
            int r13 = 16 - r12
            java.lang.System.arraycopy(r1, r5, r1, r13, r12)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8a:
            java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
            return r12
        L8f:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.c.a(java.lang.String, int, int):java.net.InetAddress");
    }

    private static boolean a(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    private static String a(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                cVar.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    cVar.writeByte(58);
                }
                cVar.a(((bArr[i11] & 255) << 8) | (bArr[i11 + 1] & 255));
                i11 += 2;
            }
        }
        return cVar.p();
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e10) {
            throw a("No System TLS", (Exception) e10);
        }
    }
}
