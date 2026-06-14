package com.bytedance.adsdk.ud.qdl.ud;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qdl<K, A> {
    protected com.bytedance.adsdk.ud.wd.ud<A> lnr;
    private final lnr<K> mzz;
    final List<InterfaceC0205qdl> qdl = new ArrayList(1);
    private boolean mml = false;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected float f16108ud = 0.0f;
    private A mo = null;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f16109wd = -1.0f;
    private float jpc = -1.0f;

    private interface lnr<T> {
        float lnr();

        float mml();

        boolean qdl();

        boolean qdl(float f10);

        com.bytedance.adsdk.ud.wd.qdl<T> ud();

        boolean ud(float f10);
    }

    private static final class mml<T> implements lnr<T> {
        private final List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> qdl;
        private com.bytedance.adsdk.ud.wd.qdl<T> lnr = null;
        private float mml = -1.0f;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private com.bytedance.adsdk.ud.wd.qdl<T> f16110ud = lnr(0.0f);

        mml(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
            this.qdl = list;
        }

        private com.bytedance.adsdk.ud.wd.qdl<T> lnr(float f10) {
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = this.qdl.get(r0.size() - 1);
            if (f10 >= qdlVar.lnr()) {
                return qdlVar;
            }
            for (int size = this.qdl.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = this.qdl.get(size);
                if (this.f16110ud != qdlVar2 && qdlVar2.qdl(f10)) {
                    return qdlVar2;
                }
            }
            return this.qdl.get(0);
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float mml() {
            return this.qdl.get(r0.size() - 1).mml();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl() {
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public com.bytedance.adsdk.ud.wd.qdl<T> ud() {
            return this.f16110ud;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl(float f10) {
            if (this.f16110ud.qdl(f10)) {
                return !this.f16110ud.mzz();
            }
            this.f16110ud = lnr(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean ud(float f10) {
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = this.lnr;
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = this.f16110ud;
            if (qdlVar == qdlVar2 && this.mml == f10) {
                return true;
            }
            this.lnr = qdlVar2;
            this.mml = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float lnr() {
            return this.qdl.get(0).lnr();
        }
    }

    private static final class mzz<T> implements lnr<T> {
        private final com.bytedance.adsdk.ud.wd.qdl<T> qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private float f16111ud = -1.0f;

        mzz(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
            this.qdl = list.get(0);
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float lnr() {
            return this.qdl.lnr();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float mml() {
            return this.qdl.mml();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl() {
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public com.bytedance.adsdk.ud.wd.qdl<T> ud() {
            return this.qdl;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl(float f10) {
            return !this.qdl.mzz();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean ud(float f10) {
            if (this.f16111ud == f10) {
                return true;
            }
            this.f16111ud = f10;
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.qdl.ud.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0205qdl {
        void qdl();
    }

    private static final class ud<T> implements lnr<T> {
        private ud() {
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float lnr() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float mml() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl() {
            return true;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public com.bytedance.adsdk.ud.wd.qdl<T> ud() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl(float f10) {
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean ud(float f10) {
            throw new IllegalStateException("not implemented");
        }
    }

    qdl(List<? extends com.bytedance.adsdk.ud.wd.qdl<K>> list) {
        this.mzz = qdl(list);
    }

    private float tvp() {
        if (this.f16109wd == -1.0f) {
            this.f16109wd = this.mzz.lnr();
        }
        return this.f16109wd;
    }

    public float jpc() {
        return this.f16108ud;
    }

    protected com.bytedance.adsdk.ud.wd.qdl<K> lnr() {
        com.bytedance.adsdk.ud.mzz.qdl("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarUd = this.mzz.ud();
        com.bytedance.adsdk.ud.mzz.ud("BaseKeyframeAnimation#getCurrentKeyframe");
        return qdlVarUd;
    }

    float mml() {
        if (this.mml) {
            return 0.0f;
        }
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarLnr = lnr();
        if (qdlVarLnr.mzz()) {
            return 0.0f;
        }
        return (this.f16108ud - qdlVarLnr.lnr()) / (qdlVarLnr.mml() - qdlVarLnr.lnr());
    }

    float mo() {
        if (this.jpc == -1.0f) {
            this.jpc = this.mzz.mml();
        }
        return this.jpc;
    }

    protected float mzz() {
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarLnr = lnr();
        if (qdlVarLnr == null || qdlVarLnr.mzz()) {
            return 0.0f;
        }
        return qdlVarLnr.lnr.getInterpolation(mml());
    }

    abstract A qdl(com.bytedance.adsdk.ud.wd.qdl<K> qdlVar, float f10);

    public void qdl() {
        this.mml = true;
    }

    public void ud() {
        for (int i10 = 0; i10 < this.qdl.size(); i10++) {
            this.qdl.get(i10).qdl();
        }
    }

    public A wd() {
        float fMml = mml();
        if (this.lnr == null && this.mzz.ud(fMml)) {
            return this.mo;
        }
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarLnr = lnr();
        Interpolator interpolator = qdlVarLnr.mml;
        A aQdl = (interpolator == null || qdlVarLnr.mzz == null) ? qdl(qdlVarLnr, mzz()) : qdl(qdlVarLnr, fMml, interpolator.getInterpolation(fMml), qdlVarLnr.mzz.getInterpolation(fMml));
        this.mo = aQdl;
        return aQdl;
    }

    public void qdl(InterfaceC0205qdl interfaceC0205qdl) {
        this.qdl.add(interfaceC0205qdl);
    }

    public void qdl(float f10) {
        if (this.mzz.qdl()) {
            return;
        }
        if (f10 < tvp()) {
            f10 = tvp();
        } else if (f10 > mo()) {
            f10 = mo();
        }
        if (f10 == this.f16108ud) {
            return;
        }
        this.f16108ud = f10;
        if (this.mzz.qdl(f10)) {
            ud();
        }
    }

    protected A qdl(com.bytedance.adsdk.ud.wd.qdl<K> qdlVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> lnr<T> qdl(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
        if (list.isEmpty()) {
            return new ud();
        }
        if (list.size() == 1) {
            return new mzz(list);
        }
        return new mml(list);
    }
}
