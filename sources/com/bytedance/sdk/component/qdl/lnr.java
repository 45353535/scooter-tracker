package com.bytedance.sdk.component.qdl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lnr<P, R> extends com.bytedance.sdk.component.qdl.ud<P, R> {
    private mzz lnr;
    private boolean qdl = true;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f16654ud;

    interface qdl {
        void qdl(Object obj);

        void qdl(Throwable th2);
    }

    public interface ud {
        lnr qdl();
    }

    private boolean mo() {
        if (this.qdl) {
            return true;
        }
        jpc.qdl(new IllegalStateException("Jsb async call already finished: " + qdl() + ", hashcode: " + hashCode()));
        return false;
    }

    protected final void lnr() {
        qdl((Throwable) null);
    }

    protected void mml() {
        this.qdl = false;
        this.lnr = null;
    }

    void mzz() {
        mml();
    }

    @Override // com.bytedance.sdk.component.qdl.ud
    public /* bridge */ /* synthetic */ String qdl() {
        return super.qdl();
    }

    protected abstract void qdl(P p10, mzz mzzVar) throws Exception;

    protected final void qdl(R r10) {
        if (mo()) {
            this.f16654ud.qdl(r10);
            mml();
        }
    }

    protected final void qdl(Throwable th2) {
        if (mo()) {
            this.f16654ud.qdl(th2);
            mml();
        }
    }

    void qdl(P p10, mzz mzzVar, qdl qdlVar) throws Exception {
        this.lnr = mzzVar;
        this.f16654ud = qdlVar;
        qdl(p10, mzzVar);
    }
}
