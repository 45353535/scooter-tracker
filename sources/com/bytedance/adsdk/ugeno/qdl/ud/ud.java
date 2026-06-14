package com.bytedance.adsdk.ugeno.qdl.ud;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.qdl.mzz;
import com.bytedance.adsdk.ugeno.wd.jpc;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends qdl {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.qdl.ud.ud$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[mzz.values().length];
            qdl = iArr;
            try {
                iArr[mzz.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[mzz.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[mzz.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[mzz.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[mzz.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qdl[mzz.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qdl[mzz.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                qdl[mzz.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                qdl[mzz.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ud(Context context, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, TreeMap<Float, String> treeMap) {
        super(context, lnrVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud.qdl
    public TypeEvaluator mo() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud.qdl
    public void qdl(float f10, String str) {
        this.mzz.add(Keyframe.ofFloat(f10, (this.f16228ud.startsWith(mzz.TRANSLATE.qdl()) || this.mml == mzz.BORDER_RADIUS) ? jpc.qdl(this.qdl, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str, 0.0f)) : com.bytedance.adsdk.ugeno.wd.lnr.qdl(str, 0.0f)));
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud.qdl
    public void ud() {
        float fBjy;
        switch (AnonymousClass1.qdl[this.mml.ordinal()]) {
            case 1:
                fBjy = this.f16229wd.bjy();
                break;
            case 2:
                fBjy = this.f16229wd.jtx();
                break;
            case 3:
                fBjy = this.f16229wd.yt();
                break;
            case 4:
                fBjy = this.f16229wd.jl();
                break;
            case 5:
                fBjy = this.f16229wd.exc();
                if (this.f16229wd.rq() != null) {
                    this.f16229wd.rq().setCameraDistance(10000.0f);
                }
                break;
            case 6:
                fBjy = this.f16229wd.aaj();
                if (this.f16229wd.rq() != null) {
                    this.f16229wd.rq().setCameraDistance(10000.0f);
                }
                break;
            case 7:
                fBjy = this.f16229wd.jyq();
                break;
            case 8:
                fBjy = this.f16229wd.oth();
                break;
            case 9:
                fBjy = this.f16229wd.ljh();
                break;
            default:
                fBjy = 0.0f;
                break;
        }
        this.mzz.add(Keyframe.ofFloat(0.0f, fBjy));
    }
}
