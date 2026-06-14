package com.bytedance.sdk.component.mzz.mzz;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends qdl {
    private byte[] qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private com.bytedance.sdk.component.mzz.mo f16639ud;

    public mzz(byte[] bArr, com.bytedance.sdk.component.mzz.mo moVar) {
        this.qdl = bArr;
        this.f16639ud = moVar;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        com.bytedance.sdk.component.mzz.lnr.mo moVarJl = lnrVar.jl();
        com.bytedance.sdk.component.mzz.lnr.ud.qdl qdlVarQdl = moVarJl.qdl(lnrVar);
        try {
            lnrVar.jyq();
            Bitmap bitmapQdl = qdlVarQdl.qdl(this.qdl);
            if (bitmapQdl == null) {
                qdl(1002, "decode failed bitmap null", null, lnrVar);
                return;
            }
            lnrVar.qdl(new exu(bitmapQdl, this.f16639ud, false));
            moVarJl.qdl(lnrVar.exc()).qdl(lnrVar.to(), bitmapQdl);
        } catch (Throwable th2) {
            qdl(1002, "decode failed:" + th2.getMessage(), th2, lnrVar);
        }
    }

    private void qdl(int i10, String str, Throwable th2, com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        if (this.f16639ud == null) {
            lnrVar.qdl(new rq());
        } else {
            lnrVar.qdl(new jpc(i10, str, th2));
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "decode";
    }
}
