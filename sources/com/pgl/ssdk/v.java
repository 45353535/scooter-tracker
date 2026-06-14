package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4569ua;
import com.ironsource.N6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f62174a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f62175b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f62176c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f62177d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f62178e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f62179f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f62180g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f62181h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f62182i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile long f62183j = -1;

    public static void a(File file, boolean z10) throws Throwable {
        e eVarA;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    if (TextUtils.isEmpty(f62174a) && (eVarA = a(file)) != null) {
                        f62174a = a(eVarA.a());
                        f62177d = eVarA.b();
                        if (z10) {
                            a();
                            randomAccessFile2.close();
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(f62178e)) {
                        f62178e = a(randomAccessFile2);
                    }
                    if (f62181h == 0) {
                        f62181h = randomAccessFile2.length() / 1024;
                    }
                    if (f62182i == 0) {
                        f62182i = b(file);
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused6) {
        }
    }

    public static String b() throws Throwable {
        long j10;
        boolean z10;
        String string;
        String string2;
        String string3;
        String string4;
        long j11;
        long j12;
        int i10;
        String str;
        if (TextUtils.isEmpty(f62174a) || TextUtils.isEmpty(f62178e) || f62180g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            long j13 = -1;
            if (sharedPreferencesA != null) {
                j13 = sharedPreferencesA.getLong(N6.f41367a1, -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j11 = sharedPreferencesA.getLong("as", 0L);
                j12 = sharedPreferencesA.getLong(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, 0L);
                z10 = true;
                i10 = sharedPreferencesA.getInt("cpc", -1);
                j10 = 0;
                string = sharedPreferencesA.getString(C4569ua.f45542c, null);
            } else {
                j10 = 0;
                z10 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j11 = 0;
                j12 = 0;
                i10 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z10 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j13 || string2 == null || i10 == -1) {
                f62183j = jLastModified;
                if (str2 != null) {
                    f62179f = str2;
                }
                if (num != null) {
                    f62180g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f62174a = string2;
                f62177d = string3;
                f62181h = j11;
                f62182i = j12;
                f62178e = string4;
                f62180g = i10;
                f62179f = string;
            }
        } else {
            j10 = 0;
            str = null;
            z10 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f62174a)) {
                jSONObject.put("sign", f62174a);
            }
            if (!TextUtils.isEmpty(f62177d)) {
                jSONObject.put("subject", f62177d);
            }
            if (!TextUtils.isEmpty(f62178e)) {
                jSONObject.put("md5", f62178e);
            }
            if (!TextUtils.isEmpty(f62179f)) {
                jSONObject.put("path", f62179f);
            }
            long j14 = f62181h;
            if (j14 != j10) {
                jSONObject.put("apkSize", j14);
            }
            long j15 = f62182i;
            if (j15 != j10) {
                jSONObject.put("dexSize", j15);
            }
            int i11 = f62180g;
            if (i11 != -1) {
                jSONObject.put("code", i11);
            }
            e();
            jSONObject.put("signpm", f62175b);
            if (!TextUtils.isEmpty(f62175b) && !TextUtils.isEmpty(f62174a)) {
                if (!f62175b.equals(f62174a)) {
                    f62176c = z10;
                }
                jSONObject.put("rebud", f62176c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String c() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f62174a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            String string = null;
            long j10 = -1;
            if (sharedPreferencesA != null) {
                j10 = sharedPreferencesA.getLong(N6.f41367a1, -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j10 || string == null) {
                f62183j = jLastModified;
                a(file, true);
                a();
            } else {
                f62174a = string;
            }
        }
        e();
        if (TextUtils.isEmpty(f62175b) || TextUtils.isEmpty(f62174a) || f62175b.equals(f62174a)) {
            return;
        }
        f62176c = true;
    }

    public static String e() {
        if (!TextUtils.isEmpty(f62175b)) {
            return f62175b;
        }
        try {
            String strA = a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
            f62175b = strA;
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f() throws Throwable {
        d();
        return f62176c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f62174a)) {
                sharedPreferencesA.edit().putString("sa", f62174a).apply();
            }
            if (!TextUtils.isEmpty(f62178e)) {
                sharedPreferencesA.edit().putString("md5", f62178e).apply();
            }
            if (!TextUtils.isEmpty(f62177d)) {
                sharedPreferencesA.edit().putString("sj", f62177d).apply();
            }
            if (f62181h != 0) {
                sharedPreferencesA.edit().putLong("as", f62181h).apply();
            }
            if (f62182i != 0) {
                sharedPreferencesA.edit().putLong(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, f62182i).apply();
            }
            if (f62183j != -1) {
                sharedPreferencesA.edit().putLong(N6.f41367a1, f62183j).apply();
            }
            if (f62180g != -1) {
                sharedPreferencesA.edit().putInt("cpc", f62180g).apply();
            }
            if (TextUtils.isEmpty(f62179f)) {
                return;
            }
            sharedPreferencesA.edit().putString(C4569ua.f45542c, f62179f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(com.taurusx.tax.y.s.w.f67666t).digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.pgl.ssdk.e a(java.io.File r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r4 = 0
            com.pgl.ssdk.q r2 = com.pgl.ssdk.r.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.c.a(r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            java.util.List r2 = com.pgl.ssdk.l.a(r2, r3)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r1.close()     // Catch: java.io.IOException -> L2c
            goto L2c
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
        L2b:
            r2 = r0
        L2c:
            if (r2 == 0) goto L34
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L38
        L34:
            java.util.List r2 = com.pgl.ssdk.k.a(r6)
        L38:
            if (r2 == 0) goto L48
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L48
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.e) r6
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.v.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i10 = 0;
                int size = 0;
                while (true) {
                    if (i10 == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                    }
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        break;
                    }
                    try {
                        size = (int) (((long) size) + entry.getSize());
                        i10++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j10 = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j10;
            } catch (ZipException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused7) {
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
