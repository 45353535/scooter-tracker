package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class o0 extends w {

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                o0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR), gVarD.N());
                o0.a(System.currentTimeMillis() - ((long) (gVarD.e() * 1000)));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    o0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    class c implements FileFilter {
        c() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() || file.isDirectory();
        }
    }

    class d implements Comparator<File> {
        d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, int i10) {
        try {
            if (d(new File(str)) > i10 * 1048576) {
                f(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
            q0.b("SameFileTool", "clean memory failed");
        }
    }

    public static File[] c(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(c1.b(str.trim())) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.io.File r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L36
        L13:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            if (r2 == 0) goto L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r3.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r4.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            goto L13
        L2e:
            r4 = move-exception
            goto L53
        L30:
            r2 = move-exception
            goto L40
        L32:
            r1.close()     // Catch: java.io.IOException -> L48
            goto L48
        L36:
            r4 = move-exception
            r2 = r4
            r4 = r0
            goto L40
        L3a:
            r4 = move-exception
            goto L52
        L3c:
            r4 = move-exception
            r2 = r4
            r4 = r0
            r1 = r4
        L40:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L48
        L48:
            if (r4 == 0) goto L4f
            java.lang.String r4 = r4.toString()
            return r4
        L4f:
            return r0
        L50:
            r4 = move-exception
            r0 = r1
        L52:
            r1 = r0
        L53:
            if (r1 == 0) goto L58
            r1.close()     // Catch: java.io.IOException -> L58
        L58:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.o0.e(java.io.File):java.lang.String");
    }

    public static void f(String str) {
        try {
            ArrayList<File> arrayListB = b(new File(str));
            Collections.sort(arrayListB, new d());
            int size = (arrayListB.size() - 1) / 2;
            for (int i10 = 0; i10 < size; i10++) {
                File file = arrayListB.get(i10);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            q0.b("SameFileTool", "del memory failed");
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (gVarD.e() * 1000));
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.lastModified() + jCurrentTimeMillis < jCurrentTimeMillis2) {
                            a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static long c(File file) throws Exception {
        FileInputStream fileInputStream;
        long jAvailable = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream.available();
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e10) {
                            e = e10;
                            fileInputStream2 = fileInputStream;
                            e.printStackTrace();
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return 0L;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        q0.b("获取文件大小", "文件不存在!");
                    }
                    if (fileInputStream2 == null) {
                        return jAvailable;
                    }
                    fileInputStream2.close();
                    return jAvailable;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e13.printStackTrace();
                return 0L;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    private static long d(File file) throws Exception {
        long jC;
        File[] fileArrListFiles = file.listFiles();
        long j10 = 0;
        if (fileArrListFiles != null) {
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                if (fileArrListFiles[i10].isDirectory()) {
                    jC = d(fileArrListFiles[i10]);
                } else {
                    jC = c(fileArrListFiles[i10]);
                }
                j10 += jC;
            }
        }
        return j10;
    }

    public static void b() {
        new Thread(new b()).start();
    }

    public static void b(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : c(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean e(String str) {
        if (com.mbridge.msdk.foundation.same.image.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    private static ArrayList<File> b(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new c())) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(b(file2));
            }
        }
        return arrayList;
    }

    public static void a() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public static void a(long j10) {
        try {
            for (File file : b(new File(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR)))) {
                if (file.lastModified() < j10 && file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Throwable th2) {
            q0.b("SameFileTool", th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0133, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0137, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0138, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("SameFileTool", "unzip error", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0119, code lost:
    
        if (r12 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x011b, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011f, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0120, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("SameFileTool", "unzip error", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0131, code lost:
    
        if (r12 == null) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154 A[Catch: all -> 0x0158, TryCatch #13 {all -> 0x0158, blocks: (B:115:0x0150, B:117:0x0154, B:120:0x015d), top: B:167:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.o0.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        a(file2);
                    }
                    file.delete();
                    return "";
                }
                file.delete();
            }
            return "";
        } catch (Exception e10) {
            return e10.getMessage();
        }
    }

    public static List<String> a(String str, String str2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                File file = new File(str + File.separator + "template_config.json");
                if (file.isFile() && file.exists()) {
                    String strE = e(file);
                    if (!TextUtils.isEmpty(strE)) {
                        try {
                            JSONArray jSONArray = new JSONArray(strE);
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                                    arrayList.add(str + File.separator + jSONObject.optString("name"));
                                    if (jSONObject.has("ext_template")) {
                                        jSONObject.put("folder_dir", str);
                                        arrayList.add(jSONObject.toString());
                                    }
                                }
                            }
                        } catch (JSONException e10) {
                            q0.b("SameFileTool", e10.getMessage());
                        }
                    }
                }
                arrayList.add(str);
                return arrayList;
            }
        } catch (Exception e11) {
            q0.b("SameFileTool", e11.getMessage());
        }
        return arrayList;
    }

    public static boolean a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return true;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 == null) {
                        return false;
                    }
                    try {
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
