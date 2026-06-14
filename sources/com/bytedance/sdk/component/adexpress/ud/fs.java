package com.bytedance.sdk.component.adexpress.ud;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.ud.to;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class fs implements to.qdl {
    private tvp lnr;
    private AtomicBoolean mml = new AtomicBoolean(false);
    bjy qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    @NonNull
    private List<to> f16477ud;

    public fs(List<to> list, tvp tvpVar) {
        this.f16477ud = list;
        this.lnr = tvpVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public boolean lnr() {
        return this.mml.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl() {
        this.lnr.mml();
        Iterator<to> it = this.f16477ud.iterator();
        while (it.hasNext() && !it.next().qdl(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public boolean ud(to toVar) {
        int iIndexOf = this.f16477ud.indexOf(toVar);
        return iIndexOf < this.f16477ud.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public bjy ud() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl(to toVar) {
        int iIndexOf = this.f16477ud.indexOf(toVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.f16477ud.size()) {
                return;
            }
        } while (!this.f16477ud.get(iIndexOf).qdl(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl(bjy bjyVar) {
        this.qdl = bjyVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl(boolean z10) {
        this.mml.getAndSet(z10);
    }
}
