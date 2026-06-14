package com.bytedance.sdk.component.mzz.lnr.qdl.qdl;

import android.util.Log;
import com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl;
import com.bytedance.sdk.component.utils.to;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements com.bytedance.sdk.component.mzz.lnr {
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f16597ud;

    public ud(File file, long j10, ExecutorService executorService) {
        this.qdl = j10;
        try {
            this.f16597ud = qdl.qdl(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public boolean ud(String str) {
        try {
            try {
                qdl.lnr lnrVarQdl = this.f16597ud.qdl(str);
                boolean z10 = lnrVarQdl != null;
                to.qdl(lnrVarQdl);
                return z10;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                to.qdl(null);
                return false;
            }
        } catch (Throwable th2) {
            to.qdl(null);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: ud, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] qdl(String str) throws Throwable {
        Closeable closeable;
        ?? r72;
        ByteArrayOutputStream byteArrayOutputStream;
        qdl qdlVar = this.f16597ud;
        ?? r12 = 0;
        if (qdlVar != null) {
            try {
                if (str != 0) {
                    try {
                        qdl.lnr lnrVarQdl = qdlVar.qdl((String) str);
                        if (lnrVarQdl == null) {
                            to.qdl(null);
                            to.qdl(null);
                            return null;
                        }
                        str = lnrVarQdl.qdl(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i10 = str.read(bArr);
                                        if (i10 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i10);
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    r72 = str;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                byteArrayOutputStream = null;
                                r72 = str;
                            } catch (Throwable th2) {
                                th = th2;
                                closeable = null;
                                r12 = str;
                                to.qdl(r12);
                                to.qdl(closeable);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        to.qdl(str);
                        to.qdl(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        r72 = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = null;
                        to.qdl(r12);
                        to.qdl(closeable);
                        throw th;
                    }
                    Log.w("LruCountDiskCache", e.toString());
                    to.qdl(r72);
                    to.qdl(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.mzz.lnr
    public InputStream qdl(String str) throws Throwable {
        qdl qdlVar = this.f16597ud;
        if (qdlVar == null) {
            return null;
        }
        try {
            qdl.lnr lnrVarQdl = qdlVar.qdl(str);
            if (lnrVarQdl != null) {
                return lnrVarQdl.qdl(0);
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, byte[] bArr) throws Throwable {
        Closeable closeable;
        qdl qdlVar = this.f16597ud;
        if (qdlVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        qdl.C0232qdl c0232qdl = null;
        try {
            try {
                qdl.C0232qdl c0232qdlUd = qdlVar.ud(str);
                try {
                    if (c0232qdlUd == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        to.qdl(null);
                        return false;
                    }
                    OutputStream outputStreamQdl = c0232qdlUd.qdl(0);
                    if (outputStreamQdl == qdl.lnr) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        to.qdl(outputStreamQdl);
                        return false;
                    }
                    outputStreamQdl.write(bArr);
                    c0232qdlUd.qdl();
                    this.f16597ud.qdl();
                    to.qdl(outputStreamQdl);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    closeable = null;
                    c0232qdl = c0232qdlUd;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0232qdl != null) {
                            try {
                                c0232qdl.ud();
                            } catch (IOException unused) {
                            }
                        }
                        to.qdl(closeable);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable2 = closeable;
                        to.qdl(closeable2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                to.qdl(closeable2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            closeable = null;
        }
    }
}
