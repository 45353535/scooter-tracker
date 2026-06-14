package com.bytedance.sdk.component.mzz.mml.lnr.qdl.qdl;

import com.bytedance.sdk.component.mzz.lnr;
import com.bytedance.sdk.component.utils.to;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements lnr {
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f16624ud;

    public ud(File file, long j10) {
        int i10 = (int) j10;
        this.qdl = i10;
        this.f16624ud = qdl.qdl(i10, file);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public boolean ud(String str) {
        try {
            InputStream inputStreamQdl = this.f16624ud.qdl(str);
            boolean z10 = inputStreamQdl != null;
            to.qdl(inputStreamQdl);
            return z10;
        } catch (Throwable th2) {
            try {
                th2.getMessage();
                return false;
            } finally {
                to.qdl(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: ud, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] qdl(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        InputStream inputStreamQdl;
        qdl qdlVar = this.f16624ud;
        if (qdlVar != null && str != null) {
            try {
                inputStreamQdl = qdlVar.qdl(str);
                if (inputStreamQdl != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (IOException unused) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        byteArrayOutputStream = null;
                        to.qdl(inputStreamQdl);
                        to.qdl(byteArrayOutputStream);
                        throw th2;
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i10 = inputStreamQdl.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        th2 = th4;
                        to.qdl(inputStreamQdl);
                        to.qdl(byteArrayOutputStream);
                        throw th2;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    to.qdl(inputStreamQdl);
                    to.qdl(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamQdl = null;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                byteArrayOutputStream = null;
                th2 = th5;
                inputStreamQdl = null;
            }
            to.qdl(inputStreamQdl);
            to.qdl(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.mzz.lnr
    public InputStream qdl(String str) {
        qdl qdlVar = this.f16624ud;
        if (qdlVar == null) {
            return null;
        }
        return qdlVar.qdl(str);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, byte[] bArr) {
        qdl qdlVar = this.f16624ud;
        if (qdlVar == null || bArr == null || str == null) {
            return false;
        }
        return qdlVar.qdl(str, bArr);
    }
}
