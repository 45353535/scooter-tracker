package com.bytedance.sdk.component.wd.ud;

import android.text.TextUtils;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.google.common.net.HttpHeaders;
import com.inmobi.unification.sdk.InitializationStatus;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends lnr {
    public File qdl;
    private volatile boolean to;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public File f16740ud;

    public qdl(rq rqVar) {
        super(rqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long mo(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mzz(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpHeaders.ACCEPT_RANGES), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get(HttpHeaders.CONTENT_RANGE);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean wd(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public void qdl(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.qdl = new File(str, str2);
        this.f16740ud = new File(str, str2 + ".temp");
    }

    @Override // com.bytedance.sdk.component.wd.ud.lnr
    public void ud() {
        this.to = true;
        super.ud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mzz() {
        try {
            this.qdl.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f16740ud.delete();
        } catch (Throwable unused2) {
        }
    }

    public void qdl(final com.bytedance.sdk.component.wd.qdl.qdl qdlVar) {
        File file = this.qdl;
        if (file == null || this.f16740ud == null) {
            if (qdlVar != null) {
                qdlVar.qdl(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.qdl.length() != 0 && qdlVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.wd.ud udVar = new com.bytedance.sdk.component.wd.ud(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            udVar.qdl(this.qdl);
            qdlVar.qdl(this, udVar);
            return;
        }
        long length = this.f16740ud.length();
        final long j10 = length >= 0 ? length : 0L;
        fs.qdl qdlVar2 = new fs.qdl();
        qdlVar2.qdl((Object) lnr());
        ud("Range", "bytes=" + j10 + TokenBuilder.TOKEN_DELIMITER);
        if (TextUtils.isEmpty(this.jpc)) {
            qdlVar.qdl(this, new IOException("Url is Empty"));
            return;
        }
        try {
            qdlVar2.ud(this.jpc);
            if (!TextUtils.isEmpty(this.mzz)) {
                qdlVar2.qdl(this.mzz);
            }
            int i10 = this.mo;
            if (i10 > 0) {
                qdlVar2.qdl(i10);
            }
            qdl(qdlVar2);
            com.bytedance.sdk.component.ud.qdl.ud udVarQdl = this.lnr.qdl(qdlVar2.qdl().ud());
            if (udVarQdl == null) {
                qdlVar.qdl(this, new IOException("new call error"));
            } else {
                udVarQdl.qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bytedance.sdk.component.wd.ud.qdl.1
                    @Override // com.bytedance.sdk.component.ud.qdl.lnr
                    public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar2, IOException iOException) {
                        com.bytedance.sdk.component.wd.qdl.qdl qdlVar3 = qdlVar;
                        if (qdlVar3 != null) {
                            qdlVar3.qdl(qdl.this, iOException);
                        }
                        qdl.this.mzz();
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:82:0x0207, code lost:
                    
                        r9.close();
                     */
                    /* JADX WARN: Removed duplicated region for block: B:119:0x018c A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x015c A[Catch: all -> 0x0148, TryCatch #3 {all -> 0x0148, blocks: (B:44:0x012f, B:46:0x013d, B:48:0x0141, B:51:0x014b, B:52:0x0152, B:54:0x015c, B:56:0x0168, B:59:0x0179, B:62:0x0184, B:63:0x018b, B:58:0x0170, B:65:0x018e, B:67:0x0196, B:70:0x01a2, B:72:0x01ac, B:74:0x01b8, B:76:0x01c4, B:77:0x01d3, B:78:0x01e0, B:81:0x01fa), top: B:110:0x012f }] */
                    @Override // com.bytedance.sdk.component.ud.qdl.lnr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void qdl(com.bytedance.sdk.component.ud.qdl.ud r21, com.bytedance.sdk.component.ud.qdl.rdp r22) throws java.io.IOException {
                        /*
                            Method dump skipped, instruction units count: 572
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.wd.ud.qdl.AnonymousClass1.qdl(com.bytedance.sdk.component.ud.qdl.ud, com.bytedance.sdk.component.ud.qdl.rdp):void");
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            qdlVar.qdl(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133 A[PHI: r10
  0x0133: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:41:0x00f9, B:44:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.wd.ud qdl() {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.wd.ud.qdl.qdl():com.bytedance.sdk.component.wd.ud");
    }
}
