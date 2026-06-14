package com.mbridge.msdk.foundation.download.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes10.dex */
public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "UnzipUtility";

    private void extractFile(ZipInputStream zipInputStream, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = zipInputStream.read(bArr);
                        if (i10 == -1) {
                            bufferedOutputStream.close();
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int unzip(java.lang.String r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.utils.UnzipUtility.unzip(java.lang.String, java.lang.String):int");
    }
}
