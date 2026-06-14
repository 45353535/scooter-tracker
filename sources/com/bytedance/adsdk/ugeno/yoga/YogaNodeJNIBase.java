package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@com.bytedance.adsdk.ugeno.yoga.qdl.qdl
public abstract class YogaNodeJNIBase extends to implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.qdl.qdl
    private float[] arr;
    private List<YogaNodeJNIBase> lnr;

    @com.bytedance.adsdk.ugeno.yoga.qdl.qdl
    private int mLayoutDirection;
    private wd mml;
    private Object mo;
    private ud mzz;
    protected long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private YogaNodeJNIBase f16277ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f16278wd;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f16278wd = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.qdl = j10;
    }

    @com.bytedance.adsdk.ugeno.yoga.qdl.qdl
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.lnr;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.lnr.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f16277ud = this;
        return yogaNodeJNIBase.qdl;
    }

    @com.bytedance.adsdk.ugeno.yoga.qdl.qdl
    public final float baseline(float f10, float f11) {
        return this.mzz.qdl(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void fs(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void jpc(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase qdl(int i10) {
        List<YogaNodeJNIBase> list = this.lnr;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @com.bytedance.adsdk.ugeno.yoga.qdl.qdl
    public final long measure(float f10, int i10, float f11, int i11) {
        if (fs()) {
            return this.mml.qdl(this, f10, jpc.qdl(i10), f11, jpc.qdl(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase ud(int i10) {
        List<YogaNodeJNIBase> list = this.lnr;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
        yogaNodeJNIBaseRemove.f16277ud = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.qdl, yogaNodeJNIBaseRemove.qdl);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void mo(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void mzz(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    /* JADX INFO: renamed from: rq, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase ud() {
        return this.f16277ud;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void to(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void tvp(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void wd(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.qdl, f10);
    }

    public boolean fs() {
        return this.mml != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public float jpc() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public float mo() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void mzz() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.qdl);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public int qdl() {
        List<YogaNodeJNIBase> list = this.lnr;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void rq(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public Object to() {
        return this.mo;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public float tvp() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public float wd() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    private void ud(to toVar) {
        to();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(to toVar, int i10) {
        if (toVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) toVar;
            if (yogaNodeJNIBase.f16277ud == null) {
                if (this.lnr == null) {
                    this.lnr = new ArrayList(4);
                }
                this.lnr.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.f16277ud = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.qdl, yogaNodeJNIBase.qdl, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void lnr(qdl qdlVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.qdl, qdlVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void ud(qdl qdlVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.qdl, qdlVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void lnr(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void ud(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void lnr() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.qdl);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void mml(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void ud(mml mmlVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.qdl, mmlVar.qdl(), f10);
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void lnr(mml mmlVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.qdl, mmlVar.qdl(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void mml() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.qdl);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public int qdl(to toVar) {
        List<YogaNodeJNIBase> list = this.lnr;
        if (list == null) {
            return -1;
        }
        return list.indexOf(toVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(float f10, float f11) {
        ud((to) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.lnr;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.ud(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].qdl;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.qdl, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(lnr lnrVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.qdl, lnrVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(mzz mzzVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.qdl, mzzVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(mo moVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.qdl, moVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(qdl qdlVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.qdl, qdlVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(exu exuVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.qdl, exuVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(rdp rdpVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.qdl, rdpVar.qdl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.qdl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(mml mmlVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.qdl, mmlVar.qdl(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(wd wdVar) {
        this.mml = wdVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.qdl, wdVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(boolean z10) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.qdl, z10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.to
    public void qdl(Object obj) {
        this.mo = obj;
    }
}
