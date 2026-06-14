package com.bytedance.sdk.component.mzz.mzz;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements tvp {
    private byte[] qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private com.bytedance.sdk.component.mzz.mo f16641ud;

    public ud(byte[] bArr, com.bytedance.sdk.component.mzz.mo moVar) {
        this.qdl = bArr;
        this.f16641ud = moVar;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        tvp mzzVar;
        int iFs = lnrVar.fs();
        lnrVar.qdl(this.qdl.length);
        if (iFs == 2) {
            mzzVar = com.bytedance.sdk.component.utils.mo.qdl(this.qdl) ? new mzz(this.qdl, this.f16641ud) : this.f16641ud == null ? new rq() : new jpc(1001, "not image format", null);
        } else if (iFs != 3) {
            boolean zUd = com.bytedance.sdk.component.utils.mo.ud(this.qdl);
            mzzVar = (!zUd && com.bytedance.sdk.component.utils.mo.qdl(this.qdl)) ? new mzz(this.qdl, this.f16641ud) : new exu(this.qdl, this.f16641ud, zUd);
        } else {
            byte[] bArr = this.qdl;
            mzzVar = new exu(bArr, this.f16641ud, com.bytedance.sdk.component.utils.mo.ud(bArr));
        }
        lnrVar.qdl(mzzVar);
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "image_type";
    }
}
