package com.bytedance.sdk.component.ud.qdl.ud;

/* JADX INFO: loaded from: classes6.dex */
final class mzz {
    int lnr;
    boolean mml;
    mzz mo;
    boolean mzz;
    final byte[] qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    int f16712ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    mzz f16713wd;

    mzz() {
        this.qdl = new byte[8192];
        this.mzz = true;
        this.mml = false;
    }

    final mzz qdl() {
        this.mml = true;
        return new mzz(this.qdl, this.f16712ud, this.lnr, true, false);
    }

    public final mzz ud() {
        mzz mzzVar = this.mo;
        mzz mzzVar2 = mzzVar != this ? mzzVar : null;
        mzz mzzVar3 = this.f16713wd;
        if (mzzVar3 != null) {
            mzzVar3.mo = mzzVar;
        }
        mzz mzzVar4 = this.mo;
        if (mzzVar4 != null) {
            mzzVar4.f16713wd = mzzVar3;
        }
        this.mo = null;
        this.f16713wd = null;
        return mzzVar2;
    }

    public final mzz qdl(mzz mzzVar) {
        mzzVar.f16713wd = this;
        mzzVar.mo = this.mo;
        this.mo.f16713wd = mzzVar;
        this.mo = mzzVar;
        return mzzVar;
    }

    mzz(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.qdl = bArr;
        this.f16712ud = i10;
        this.lnr = i11;
        this.mml = z10;
        this.mzz = z11;
    }
}
