package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.C4240b4;
import com.ironsource.C4403kf;
import com.ironsource.C4462o4;
import com.ironsource.C4652z8;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class IronSourceStorageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45399a = "supersonicads";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4403kf f45400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f45401c;

    private static void a(Context context) {
        C4403kf c4403kf = f45400b;
        if (c4403kf != null && c4403kf.b()) {
            deleteCacheDirectories(context);
        }
        C4403kf c4403kf2 = f45400b;
        if (c4403kf2 == null || !c4403kf2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        C4403kf c4403kf = f45400b;
        return (c4403kf == null || !c4403kf.d()) ? interfaceC4634y7I.f(context) : interfaceC4634y7I.l(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objC = c(file2);
                    if (objC instanceof JSONArray) {
                        jSONObject.put("files", c(file2));
                    } else if (objC instanceof JSONObject) {
                        jSONObject.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C4652z8 c4652z8, JSONObject jSONObject) throws Exception {
        if (c4652z8 == null || !c4652z8.isDirectory()) {
            return new JSONObject();
        }
        File[] fileArrListFiles = c4652z8.listFiles();
        if (fileArrListFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : fileArrListFiles) {
            C4652z8 c4652z82 = new C4652z8(file.getPath());
            if (c4652z82.isFile()) {
                String name = c4652z82.getName();
                JSONObject jSONObjectA = c4652z82.a();
                if (jSONObject.has(name)) {
                    jSONObject2.put(name, SDKUtils.mergeJSONObjects(jSONObjectA, jSONObject.getJSONObject(name)));
                } else {
                    jSONObject2.put(name, jSONObjectA);
                }
            } else if (c4652z82.isDirectory()) {
                jSONObject2.put(c4652z82.getName(), buildFilesMapOfDirectory(c4652z82, jSONObject));
            }
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        C4403kf c4403kf = f45400b;
        return (c4403kf == null || !c4403kf.d()) ? interfaceC4634y7I.j(context) : interfaceC4634y7I.B(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        a(interfaceC4634y7I.l(context));
        a(interfaceC4634y7I.B(context));
    }

    public static synchronized boolean deleteFile(C4652z8 c4652z8) {
        if (!c4652z8.exists()) {
            return false;
        }
        return c4652z8.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        a(interfaceC4634y7I.f(context));
        a(interfaceC4634y7I.j(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean deleteFolder(java.lang.String r2) {
        /*
            java.lang.Class<com.ironsource.sdk.utils.IronSourceStorageUtils> r0 = com.ironsource.sdk.utils.IronSourceStorageUtils.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            boolean r2 = deleteFolderContentRecursive(r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            boolean r2 = r1.delete()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L16:
            r2 = move-exception
            goto L1b
        L18:
            r2 = 0
        L19:
            monitor-exit(r0)
            return r2
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFolder(java.lang.String):boolean");
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C4403kf c4403kf = f45400b;
        if (c4403kf == null || !c4403kf.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(C4240b4.c.f42542u + canonicalPath2);
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (fileB = b(context)) == null || !fileB.canWrite()) {
            return c(context).getPath();
        }
        f45401c = true;
        return fileB.getPath();
    }

    public static ArrayList<C4652z8> getFilesInFolderRecursive(C4652z8 c4652z8) {
        if (c4652z8 == null || !c4652z8.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C4652z8> arrayList = new ArrayList<>();
        File[] fileArrListFiles = c4652z8.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C4652z8 c4652z82 = new C4652z8(file.getPath());
                if (c4652z82.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c4652z82));
                }
                if (c4652z82.isFile()) {
                    arrayList.add(c4652z82);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileB = b(new File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(C4652z8 c4652z8) {
        long totalSizeOfDir;
        long j10 = 0;
        if (c4652z8 != null && c4652z8.isDirectory()) {
            File[] fileArrListFiles = c4652z8.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                C4652z8 c4652z82 = new C4652z8(file.getPath());
                if (c4652z82.isFile()) {
                    totalSizeOfDir = c4652z82.length();
                } else if (c4652z82.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(c4652z82);
                }
                j10 += totalSizeOfDir;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(@NotNull Context context, @NotNull C4403kf c4403kf) {
        f45400b = c4403kf;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f45401c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C4652z8 c4652z8) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c4652z8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int i11 = byteArrayInputStream.read(bArr2);
                if (i11 == -1) {
                    return i10;
                }
                fileOutputStream.write(bArr2, 0, i11);
                i10 += i11;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(f45399a);
        sb2.append(str);
        return new File(sb2.toString());
    }

    private static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    private static boolean a() {
        C4403kf c4403kf;
        return Build.VERSION.SDK_INT > 29 && (c4403kf = f45400b) != null && c4403kf.a();
    }
}
