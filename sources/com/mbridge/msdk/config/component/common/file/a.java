package com.mbridge.msdk.config.component.common.file;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static b a(String str, int i10, String str2) {
        b bVar;
        String strD;
        String strF;
        b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            strD = d(str);
            strF = f(str);
            bVar = new b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bVar.a(a());
            bVar.c(strD);
            if (!strD.contains("mp4")) {
                strF = strF.concat(strD);
            }
            bVar.b(strF);
            if (strD.contains("zip")) {
                bVar.d(j(str));
                String strB = b(str, i10, str2);
                bVar.a(b(strB));
                bVar.e(strB);
            } else {
                bVar.a(b(bVar.a()));
            }
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            q0.b("ComponentFileUtil", th.getMessage());
            bVar = bVar2;
        }
        if (bVar != null) {
            a(bVar.a());
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.file.a.b(java.lang.String, java.lang.String):boolean");
    }

    public static String c(String str) {
        FileInputStream fileInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        String strHexEncode = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                    bArr = new byte[4096];
                } finally {
                }
            } catch (Throwable th2) {
                q0.b("ComponentFileUtil", th2.getMessage());
            }
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                    messageDigest.reset();
                    fileInputStream.close();
                    return strHexEncode;
                }
                messageDigest.update(bArr, 0, i10);
                q0.b("ComponentFileUtil", th2.getMessage());
            }
        }
        return strHexEncode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String r3) {
        /*
            java.lang.String r0 = ""
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.getLastPathSegment()     // Catch: java.lang.Throwable -> L1f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            java.lang.String r1 = "\\."
            java.lang.String[] r3 = r3.split(r1)     // Catch: java.lang.Throwable -> L1f
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1f
            if (r1 <= 0) goto L21
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r3 = move-exception
            goto L34
        L21:
            r3 = r0
        L22:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.String r0 = "."
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> L30
            return r3
        L30:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L34:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r1 = "ComponentFileUtil"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.file.a.d(java.lang.String):java.lang.String");
    }

    public static b e(String str) {
        return a(str, 0, null);
    }

    public static String f(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(c1.b(str.trim())) : "";
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a() + "/" + f(str) + "/";
    }

    private static String h(String str) {
        List<String> queryParameters;
        if (!TextUtils.isEmpty(str) && (queryParameters = Uri.parse(str).getQueryParameters("filename")) != null && !queryParameters.isEmpty()) {
            String str2 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    private static String i(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri uri = Uri.parse(str);
                List<String> queryParameters = uri.getQueryParameters(ResourceManager.KEY_INDEX_HTML);
                if (queryParameters != null && !queryParameters.isEmpty()) {
                    return queryParameters.get(0);
                }
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        return strSubstring.replace(".zip", "");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strA = a();
        String strF = f(str);
        String strI = i(str);
        if (!TextUtils.isEmpty(strI)) {
            String str2 = strA + strF + "/" + strI + "/";
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(String str) {
        com.mbridge.msdk.config.component.database.a.a().c("UPDATE FileDB SET touchTime=" + System.currentTimeMillis() + " WHERE filePath='" + str + "'");
    }

    public static String a() {
        File file = new File(c.n().d().getFilesDir(), "mbCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath().concat(File.separator);
    }

    private static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: b5.a
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.component.common.file.a.k(str);
            }
        });
    }

    public static String a(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strSubstring = str.substring(str.indexOf("?") + 1);
        if (!TextUtils.isEmpty(strSubstring)) {
            str3 = "?" + strSubstring;
        }
        return AdPayload.FILE_SCHEME + str2 + str3;
    }

    private static String b(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strJ = j(str);
        String strI = i(str);
        String strH = h(str);
        if (!TextUtils.isEmpty(strI)) {
            if (i10 == 0) {
                return strJ + strI + "/" + strH;
            }
            if (i10 == 1) {
                return strJ + strI + ".html";
            }
            if (i10 == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strJ);
                if (!TextUtils.isEmpty(strH)) {
                    strI = strH;
                }
                sb2.append(strI);
                sb2.append("_");
                if (str2.equals("0")) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(".xml");
                return sb2.toString();
            }
        }
        return "";
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (Throwable th2) {
            q0.b("ComponentFileUtil", th2.getMessage(), th2);
        }
        return new File(str).exists();
    }
}
