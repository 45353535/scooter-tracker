package com.bytedance.sdk.component.mzz.lnr.qdl.ud;

import com.bytedance.sdk.component.mzz.jl;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements jl {
    private com.bytedance.sdk.component.mzz.lnr.qdl.lnr<String, byte[]> lnr;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16598ud;

    public lnr(int i10, int i11) {
        this.f16598ud = i10;
        this.qdl = i11;
        this.lnr = new com.bytedance.sdk.component.mzz.lnr.qdl.lnr<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.ud.lnr.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.mzz.lnr.qdl.lnr
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public int ud(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        return this.lnr.qdl(str) != null;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.lnr.qdl(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public byte[] qdl(String str) {
        return this.lnr.qdl(str);
    }
}
