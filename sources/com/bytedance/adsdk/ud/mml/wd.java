package com.bytedance.adsdk.ud.mml;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    private final mzz qdl;

    public wd(mzz mzzVar) {
        this.qdl = mzzVar;
    }

    private File ud(String str) throws FileNotFoundException {
        File file = new File(qdl(), qdl(str, lnr.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(qdl(), qdl(str, lnr.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    Pair<lnr, InputStream> qdl(String str) {
        try {
            File fileUd = ud(str);
            if (fileUd == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileUd);
            lnr lnrVar = fileUd.getAbsolutePath().endsWith(".zip") ? lnr.ZIP : lnr.JSON;
            fileUd.getAbsolutePath();
            return new Pair<>(lnrVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File qdl(String str, InputStream inputStream, lnr lnrVar) throws IOException {
        File file = new File(qdl(), qdl(str, lnrVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 != -1) {
                        fileOutputStream.write(bArr, 0, i10);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    void qdl(String str, lnr lnrVar) {
        File file = new File(qdl(), qdl(str, lnrVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File qdl() {
        File fileQdl = this.qdl.qdl();
        if (fileQdl.isFile()) {
            fileQdl.delete();
        }
        if (!fileQdl.exists()) {
            fileQdl.mkdirs();
        }
        return fileQdl;
    }

    private static String qdl(String str, lnr lnrVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? lnrVar.qdl() : lnrVar.lnr);
        return sb2.toString();
    }
}
