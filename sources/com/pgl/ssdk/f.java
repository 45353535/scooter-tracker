package com.pgl.ssdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f62155a = 28800;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62156b = 5;

    public static long a(long j10, InputStream inputStream) throws IOException {
        if (j10 != -1) {
            return j10;
        }
        byte[] bArr = new byte[8192];
        long j11 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j11;
            }
            j11 += (long) i10;
        }
    }

    public static long b() {
        Context contextA = z.a();
        if (contextA == null) {
            return 0L;
        }
        long jA = ax.a(contextA, "pgl_frt", 0L);
        if (jA != 0) {
            return jA;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ax.b(contextA, "pgl_frt", jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized void c() {
        if (d()) {
            String strC = v.c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            if (file.exists()) {
                JSONObject jSONObjectA = a(file, true);
                jSONObjectA.put("apk_info", v.b());
                jSONObjectA.put("app_name", ab.d(z.a()));
                PglSSManager pglSSManager = PglSSManager.getInstance();
                if (pglSSManager == null) {
                    au.a(String.valueOf(jSONObjectA));
                    return;
                }
                PglSSCallBack pglCallBack = pglSSManager.getPglCallBack();
                if (pglCallBack != null) {
                    pglCallBack.reportSoftDecData("detailed_app_info", jSONObjectA.toString());
                }
            }
        }
    }

    private static boolean d() {
        int iA = ax.a(z.a(), "pgl_is_hit", 0);
        au.a("hitsTimes " + iA);
        if (iA > 0) {
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - b();
        au.a("runningTime ".concat(String.valueOf(jCurrentTimeMillis)));
        if (jCurrentTimeMillis < f62155a) {
            return false;
        }
        ax.b(z.a(), "pgl_is_hit", 1);
        return e();
    }

    private static boolean e() {
        boolean z10 = f62156b == 100;
        return !z10 ? ((int) ((Math.random() * 100.0d) + 1.0d)) <= f62156b : z10;
    }

    public static void a(JSONObject jSONObject, String str, List<String> list, boolean z10) {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        if (z10) {
            try {
                jSONObject.put(str + "_size", list.size());
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put(str, n.a(list));
    }

    private static JSONObject a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : list) {
            if (str.endsWith(".png")) {
                arrayList2.add(str.substring(0, str.lastIndexOf(".png")));
            } else if (str.endsWith(".xml")) {
                arrayList.add(str.substring(0, str.lastIndexOf(".xml")));
            } else {
                arrayList3.add(str);
            }
        }
        a(jSONObject, "xml", arrayList, true);
        a(jSONObject, "png", arrayList2, true);
        a(jSONObject, "other", arrayList3, true);
        return jSONObject;
    }

    public static JSONObject a() throws JSONException {
        String[] strArr;
        Context contextA = z.a();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (contextA != null) {
            ApplicationInfo applicationInfo = contextA.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                        for (File file2 : fileArrListFiles) {
                            arrayList.add(file2.getName());
                        }
                    }
                    if ("arm64".equals(file.getName())) {
                        a(jSONObject2, "v8a", arrayList, false);
                    } else {
                        a(jSONObject2, "v7a", arrayList, false);
                    }
                    if (jSONObject2.length() > 0) {
                        jSONObject.put("lib", jSONObject2);
                    }
                }
            }
            if (arrayList.isEmpty() && (strArr = applicationInfo.splitPublicSourceDirs) != null) {
                for (String str2 : strArr) {
                    if (str2.endsWith("armeabi-v7a.apk") || str2.endsWith("arm64_v8a.apk")) {
                        File file3 = new File(str2);
                        if (file3.exists()) {
                            return a(file3, false);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(File file, boolean z10) {
        ZipFile zipFile;
        int i10;
        char c10;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        try {
            zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement != null) {
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name) || !zipEntryNextElement.isDirectory()) {
                            String[] strArrSplit = name.split("/");
                            long size = zipEntryNextElement.getSize();
                            Enumeration<? extends ZipEntry> enumeration = enumerationEntries;
                            if (name.startsWith("res/drawable/")) {
                                i10 = 2;
                                if (name.length() > 13) {
                                    arrayList2.add(strArrSplit[2]);
                                }
                                enumerationEntries = enumeration;
                            } else {
                                i10 = 2;
                            }
                            if (name.startsWith("res/")) {
                                c10 = 1;
                                if (strArrSplit.length == i10) {
                                    arrayList3.add(strArrSplit[1]);
                                }
                                enumerationEntries = enumeration;
                            } else {
                                c10 = 1;
                            }
                            if (name.startsWith("assets/") && strArrSplit.length >= 2) {
                                arrayList.add(strArrSplit[c10]);
                                if (name.startsWith("assets/assets/resources/native/") && strArrSplit.length >= 6 && jSONObject2.length() < 10) {
                                    if (!TextUtils.isEmpty(strArrSplit[4]) && !jSONObject2.has(strArrSplit[4])) {
                                        jSONObject2.put(strArrSplit[4], a(size, zipFile.getInputStream(zipEntryNextElement)));
                                    } else if (jSONObject2.has(strArrSplit[4])) {
                                        jSONObject2.put(strArrSplit[4], a(size, zipFile.getInputStream(zipEntryNextElement)) + jSONObject2.getLong(strArrSplit[4]));
                                    }
                                }
                            } else if (name.startsWith("lib/armeabi/") && name.length() > 12) {
                                arrayList4.add(strArrSplit[2]);
                            } else if (name.startsWith("lib/armeabi-v7a/") && name.length() > 16) {
                                arrayList5.add(strArrSplit[2]);
                            } else if (name.startsWith("lib/arm64-v8a/") && name.length() > 14) {
                                arrayList6.add(strArrSplit[2]);
                            }
                            enumerationEntries = enumeration;
                        }
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                a(jSONObject3, "eabi", arrayList4, false);
                a(jSONObject3, "v7a", arrayList5, false);
                a(jSONObject3, "v8a", arrayList6, false);
                if (jSONObject3.length() > 0) {
                    jSONObject.put("lib", jSONObject3);
                }
                if (z10 && jSONObject3.length() <= 0) {
                    jSONObject = a();
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("cocos", jSONObject2);
                }
                a(jSONObject, POBCoreNativeConstants.NATIVE_ASSETS, arrayList, false);
                JSONObject jSONObjectA = a(arrayList2);
                if (jSONObjectA != null && jSONObjectA.length() > 0) {
                    jSONObject.put("drawable", jSONObjectA);
                }
                JSONObject jSONObjectA2 = a(arrayList3);
                if (jSONObjectA2 != null && jSONObjectA2.length() > 0) {
                    jSONObject.put("res", jSONObjectA2);
                }
            } catch (Throwable unused) {
                if (zipFile != null) {
                }
                return jSONObject;
            }
        } catch (Throwable unused2) {
            zipFile = null;
        }
        try {
            zipFile.close();
        } catch (IOException unused3) {
        }
        return jSONObject;
    }
}
