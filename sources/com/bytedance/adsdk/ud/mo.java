package com.bytedance.adsdk.ud;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ud.wd;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends ImageView {
    private static final String qdl = "mo";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final rq<Throwable> f16053ud = new rq<Throwable>() { // from class: com.bytedance.adsdk.ud.mo.1
        @Override // com.bytedance.adsdk.ud.rq
        public void qdl(Throwable th2) {
            com.bytedance.adsdk.ud.mo.mo.qdl(th2);
        }
    };
    private long aaj;
    private int bch;
    private exu<wd> bjy;
    private JSONArray bqt;
    private Handler exc;
    private final Set<mml> exu;
    private boolean fs;
    private int jl;
    private String jpc;
    private wd jtx;
    private com.bytedance.adsdk.ud.lnr.lnr.lnr jyq;
    private final Runnable koa;
    private int ljh;
    private final rq<wd> lnr;
    private final rq<Throwable> mml;
    private int mo;
    private rq<Throwable> mzz;
    private int oth;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private qdl f16054rc;
    private final Set<Object> rdp;
    private boolean rq;
    private boolean to;
    private int tvp;
    private int uw;
    private ud vu;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final tvp f16055wd;
    private String xmv;
    private final Handler yt;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.mo$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            qdl = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class lnr extends View.BaseSavedState {
        public static final Parcelable.Creator<lnr> CREATOR = new Parcelable.Creator<lnr>() { // from class: com.bytedance.adsdk.ud.mo.lnr.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public lnr createFromParcel(Parcel parcel) {
                return new lnr(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public lnr[] newArray(int i10) {
                return new lnr[i10];
            }
        };
        float lnr;
        boolean mml;
        int mo;
        String mzz;
        String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f16062ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        int f16063wd;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.qdl);
            parcel.writeFloat(this.lnr);
            parcel.writeInt(this.mml ? 1 : 0);
            parcel.writeString(this.mzz);
            parcel.writeInt(this.mo);
            parcel.writeInt(this.f16063wd);
        }

        lnr(Parcelable parcelable) {
            super(parcelable);
        }

        private lnr(Parcel parcel) {
            super(parcel);
            this.qdl = parcel.readString();
            this.lnr = parcel.readFloat();
            this.mml = parcel.readInt() == 1;
            this.mzz = parcel.readString();
            this.mo = parcel.readInt();
            this.f16063wd = parcel.readInt();
        }
    }

    private enum mml {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface qdl {
    }

    public interface ud {
    }

    public mo(Context context) {
        super(context);
        this.lnr = new rq<wd>() { // from class: com.bytedance.adsdk.ud.mo.6
            @Override // com.bytedance.adsdk.ud.rq
            public void qdl(wd wdVar) {
                mo.this.setComposition(wdVar);
            }
        };
        this.mml = new rq<Throwable>() { // from class: com.bytedance.adsdk.ud.mo.7
            @Override // com.bytedance.adsdk.ud.rq
            public void qdl(Throwable th2) {
                if (mo.this.mo != 0) {
                    mo moVar = mo.this;
                    moVar.setImageResource(moVar.mo);
                }
                (mo.this.mzz == null ? mo.f16053ud : mo.this.mzz).qdl(th2);
            }
        };
        this.mo = 0;
        this.f16055wd = new tvp();
        this.to = false;
        this.rq = false;
        this.fs = true;
        this.exu = new HashSet();
        this.rdp = new HashSet();
        this.yt = new Handler(Looper.getMainLooper());
        this.jl = 0;
        this.aaj = 0L;
        this.koa = new Runnable() { // from class: com.bytedance.adsdk.ud.mo.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + mo.this.oth + ", " + mo.this.ljh);
                if (mo.this.oth > mo.this.ljh) {
                    mo.jl(mo.this);
                    com.bytedance.adsdk.ud.lnr.lnr.lnr lnrVar = mo.this.jyq;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(mo.this.oth);
                    lnrVar.qdl(sb2.toString());
                    mo.this.invalidate();
                    mo.this.bjy();
                    return;
                }
                if (mo.this.bch < 0 || mo.this.uw < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + mo.this.bch + StringUtils.COMMA + mo.this.uw);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + mo.this.bch);
                    mo.this.qdl();
                    mo moVar = mo.this;
                    moVar.setFrame(moVar.bch);
                    mo.this.qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (mo.this.getFrame() < mo.this.uw - 1 || mo.this.getFrame() >= mo.this.uw + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + mo.this.uw);
                            mo.this.ud(this);
                            mo.this.mo();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(mo.this.xmv) || (mo.this.bqt != null && mo.this.bqt.length() > 0)) && mo.this.vu != null) {
                    ud unused = mo.this.vu;
                    String unused2 = mo.this.xmv;
                    JSONArray unused3 = mo.this.bqt;
                }
            }
        };
        jpc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public wd.qdl getGlobalConfig() {
        wd wdVarXmv;
        tvp tvpVar = this.f16055wd;
        if (tvpVar == null || (wdVarXmv = tvpVar.xmv()) == null) {
            return null;
        }
        return wdVarXmv.rq();
    }

    private wd.ud getGlobalEvent() {
        wd wdVarXmv;
        tvp tvpVar = this.f16055wd;
        if (tvpVar == null || (wdVarXmv = tvpVar.xmv()) == null) {
            return null;
        }
        return wdVarXmv.to();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        wd wdVarXmv;
        tvp tvpVar = this.f16055wd;
        if (tvpVar == null || (wdVarXmv = tvpVar.xmv()) == null) {
            return null;
        }
        return wdVarXmv.tvp();
    }

    static /* synthetic */ int jl(mo moVar) {
        int i10 = moVar.oth;
        moVar.oth = i10 - 1;
        return i10;
    }

    static /* synthetic */ int mzz(mo moVar) {
        int i10 = moVar.jl;
        moVar.jl = i10 + 1;
        return i10;
    }

    private void setCompositionTask(exu<wd> exuVar) {
        this.exu.add(mml.SET_ANIMATION);
        yt();
        exu();
        this.bjy = exuVar.qdl(this.lnr).lnr(this.mml);
    }

    public boolean getClipToCompositionBounds() {
        return this.f16055wd.lnr();
    }

    public wd getComposition() {
        return this.jtx;
    }

    public long getDuration() {
        wd wdVar = this.jtx;
        if (wdVar != null) {
            return (long) wdVar.mzz();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f16055wd.exc();
    }

    public String getImageAssetsFolder() {
        return this.f16055wd.mml();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f16055wd.mzz();
    }

    public float getMaxFrame() {
        return this.f16055wd.bjy();
    }

    public float getMinFrame() {
        return this.f16055wd.rdp();
    }

    public jl getPerformanceTracker() {
        return this.f16055wd.jpc();
    }

    public float getProgress() {
        return this.f16055wd.vu();
    }

    public exc getRenderMode() {
        return this.f16055wd.mo();
    }

    public int getRepeatCount() {
        return this.f16055wd.jyq();
    }

    public int getRepeatMode() {
        return this.f16055wd.aaj();
    }

    public float getSpeed() {
        return this.f16055wd.jtx();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof tvp) && ((tvp) drawable).mo() == exc.SOFTWARE) {
            this.f16055wd.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        tvp tvpVar = this.f16055wd;
        if (drawable2 == tvpVar) {
            super.invalidateDrawable(tvpVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.rq) {
            return;
        }
        this.f16055wd.rq();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jtx();
        Handler handler = this.exc;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        lnr();
        ud();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof lnr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lnr lnrVar = (lnr) parcelable;
        super.onRestoreInstanceState(lnrVar.getSuperState());
        this.jpc = lnrVar.qdl;
        Set<mml> set = this.exu;
        mml mmlVar = mml.SET_ANIMATION;
        if (!set.contains(mmlVar) && !TextUtils.isEmpty(this.jpc)) {
            setAnimation(this.jpc);
        }
        this.tvp = lnrVar.f16062ud;
        if (!this.exu.contains(mmlVar) && (i10 = this.tvp) != 0) {
            setAnimation(i10);
        }
        if (!this.exu.contains(mml.SET_PROGRESS)) {
            qdl(lnrVar.lnr, false);
        }
        if (!this.exu.contains(mml.PLAY_OPTION) && lnrVar.mml) {
            qdl();
        }
        if (!this.exu.contains(mml.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lnrVar.mzz);
        }
        if (!this.exu.contains(mml.SET_REPEAT_MODE)) {
            setRepeatMode(lnrVar.mo);
        }
        if (this.exu.contains(mml.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(lnrVar.f16063wd);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        lnr lnrVar = new lnr(super.onSaveInstanceState());
        lnrVar.qdl = this.jpc;
        lnrVar.f16062ud = this.tvp;
        lnrVar.lnr = this.f16055wd.vu();
        lnrVar.mml = this.f16055wd.ljh();
        lnrVar.mzz = this.f16055wd.mml();
        lnrVar.mo = this.f16055wd.aaj();
        lnrVar.f16063wd = this.f16055wd.jyq();
        return lnrVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVarQdl = qdl(motionEvent);
        if (qdlVarQdl == null) {
            if (getGlobalConfig() == null || getGlobalConfig().qdl != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strTvp = qdlVarQdl.tvp();
        if (qdlVarQdl instanceof com.bytedance.adsdk.ud.lnr.lnr.ud) {
            if (getGlobalConfig() == null || getGlobalConfig().qdl != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strTvp != null && strTvp.startsWith("CSJCLOSE")) {
            jtx();
        }
        to toVarQdl = qdl(qdlVarQdl.mzz());
        if (toVarQdl != null && motionEvent.getAction() == 1) {
            qdl(strTvp, toVarQdl.mzz(), toVarQdl.wd());
            int[][] iArrMo = toVarQdl.mo();
            if (iArrMo != null) {
                qdl(iArrMo);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().f16145ud) != null) {
                qdl(iArr);
            }
        }
        if (strTvp == null || !strTvp.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i10) {
        this.tvp = i10;
        this.jpc = null;
        setCompositionTask(qdl(i10));
    }

    public void setAnimationFromJson(String str) {
        qdl(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.fs ? jpc.qdl(getContext(), str) : jpc.qdl(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f16055wd.mzz(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.fs = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f16055wd.qdl(z10);
    }

    public void setComposition(wd wdVar) {
        if (mzz.qdl) {
            Log.v(qdl, "Set Composition \n".concat(String.valueOf(wdVar)));
        }
        this.f16055wd.setCallback(this);
        this.jtx = wdVar;
        this.to = true;
        boolean zQdl = this.f16055wd.qdl(wdVar, getContext().getApplicationContext());
        this.to = false;
        if (getDrawable() != this.f16055wd || zQdl) {
            if (!zQdl) {
                jl();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.rdp.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f16055wd.wd(str);
    }

    public void setFailureListener(rq<Throwable> rqVar) {
        this.mzz = rqVar;
    }

    public void setFallbackResource(int i10) {
        this.mo = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.ud.lnr lnrVar) {
        this.f16055wd.qdl(lnrVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f16055wd.qdl(map);
    }

    public void setFrame(int i10) {
        this.f16055wd.lnr(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f16055wd.wd(z10);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.ud.mml mmlVar) {
        this.f16055wd.qdl(mmlVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f16055wd.qdl(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        exu();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        exu();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        exu();
        super.setImageResource(i10);
    }

    public void setLottieAnimListener(qdl qdlVar) {
        this.f16054rc = qdlVar;
    }

    public void setLottieClicklistener(ud udVar) {
        this.vu = udVar;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f16055wd.ud(z10);
    }

    public void setMaxFrame(int i10) {
        this.f16055wd.ud(i10);
    }

    public void setMaxProgress(float f10) {
        this.f16055wd.ud(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f16055wd.mml(str);
    }

    public void setMinFrame(int i10) {
        this.f16055wd.qdl(i10);
    }

    public void setMinProgress(float f10) {
        this.f16055wd.qdl(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f16055wd.mml(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f16055wd.lnr(z10);
    }

    public void setProgress(float f10) {
        qdl(f10, true);
    }

    public void setRenderMode(exc excVar) {
        this.f16055wd.qdl(excVar);
    }

    public void setRepeatCount(int i10) {
        this.exu.add(mml.SET_REPEAT_COUNT);
        this.f16055wd.mzz(i10);
    }

    public void setRepeatMode(int i10) {
        this.exu.add(mml.SET_REPEAT_MODE);
        this.f16055wd.mml(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f16055wd.mo(z10);
    }

    public void setSpeed(float f10) {
        this.f16055wd.lnr(f10);
    }

    public void setTextDelegate(aaj aajVar) {
        this.f16055wd.qdl(aajVar);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f16055wd.jpc(z10);
    }

    public void setView(View view) {
        this.f16055wd.qdl(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        tvp tvpVar;
        if (!this.to && drawable == (tvpVar = this.f16055wd) && tvpVar.oth()) {
            mo();
        } else if (!this.to && (drawable instanceof tvp)) {
            tvp tvpVar2 = (tvp) drawable;
            if (tvpVar2.oth()) {
                tvpVar2.koa();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bjy() {
        this.yt.postDelayed(this.koa, 1000L);
    }

    private void exu() {
        exu<wd> exuVar = this.bjy;
        if (exuVar != null) {
            exuVar.ud(this.lnr);
            this.bjy.mml(this.mml);
        }
    }

    private void fs() {
        qdl(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ud.mo.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                aaj aajVarBch;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - mo.this.aaj;
                mo.this.ud(this);
                String playDelayedELExpressTimeS = mo.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (aajVarBch = mo.this.f16055wd.bch()) != null) {
                    try {
                        int i10 = Integer.parseInt(aajVarBch.qdl(playDelayedELExpressTimeS)) * 1000;
                        if (mo.this.aaj > 0) {
                            long jElapsedRealtime2 = (mo.this.aaj + ((long) i10)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                mo.this.mo();
                                mo.this.setVisibility(8);
                                if (mo.this.exc == null) {
                                    mo.this.exc = new Handler(Looper.getMainLooper());
                                }
                                mo.this.exc.removeCallbacksAndMessages(null);
                                mo.this.exc.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ud.mo.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        mo.this.setVisibility(0);
                                        mo.this.qdl();
                                        mo.this.qdl(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                mo.this.qdl(jElapsedRealtime);
            }
        });
    }

    private void jl() {
        boolean zMml = mml();
        setImageDrawable(null);
        setImageDrawable(this.f16055wd);
        if (zMml) {
            this.f16055wd.exu();
        }
    }

    private void jpc() {
        setSaveEnabled(false);
        this.fs = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        qdl(0.0f, false);
        qdl(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.f16055wd.qdl(Boolean.valueOf(com.bytedance.adsdk.ud.mo.mo.qdl(getContext()) != 0.0f));
        tvp();
        to();
        fs();
    }

    private void jtx() {
        this.yt.removeCallbacksAndMessages(null);
    }

    private void lnr(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void mml(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rdp() {
        tvp tvpVar;
        int i10;
        int i11;
        final int i12;
        if (this.jtx == null || (tvpVar = this.f16055wd) == null) {
            return;
        }
        aaj aajVarBch = tvpVar.bch();
        wd.lnr lnrVarJpc = this.jtx.jpc();
        if (lnrVarJpc == null || aajVarBch == null) {
            return;
        }
        final int i13 = lnrVarJpc.qdl;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = lnrVarJpc.mzz;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String strQdl = aajVarBch.qdl(lnrVarJpc.lnr);
        String strQdl2 = aajVarBch.qdl(lnrVarJpc.mml);
        try {
            i12 = Integer.parseInt(strQdl);
            try {
                i14 = Integer.parseInt(strQdl2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (TextUtils.isEmpty(lnrVarJpc.f16141ud)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + lnrVarJpc.f16141ud);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + lnrVarJpc.f16141ud);
        com.bytedance.adsdk.ud.lnr.lnr.lnr lnrVarLnr = lnr(lnrVarJpc.f16141ud);
        if (lnrVarLnr != null) {
            Log.i("TMe", "--==--- timer success");
            this.xmv = lnrVarJpc.mo;
            this.bqt = lnrVarJpc.f16142wd;
            this.jyq = lnrVarLnr;
            this.oth = i12;
            this.ljh = i12 - i14;
            this.bch = i11;
            this.uw = i10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.oth);
            lnrVarLnr.qdl(sb2.toString());
            qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (mo.this.getFrame() < i13 - 1 || mo.this.getFrame() >= i13 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + mo.this.getFrame());
                    mo.this.ud(this);
                    if (i12 < 0 || i14 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        mo.this.bjy();
                    }
                    mo.this.mo();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rq() {
        final wd.qdl globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.mzz <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.mo) && globalConfig.f16144wd == null) {
            return;
        }
        int maxFrame = globalConfig.mzz;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                mo.this.ud(this);
                if (mo.this.vu != null) {
                    ud unused = mo.this.vu;
                }
            }
        });
    }

    private void to() {
        qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                mo.mzz(mo.this);
                wd.qdl globalConfig = mo.this.getGlobalConfig();
                if (globalConfig != null && (i10 = globalConfig.mml) > 0 && i10 > mo.this.jl) {
                    mo.this.rdp();
                    mo.this.qdl();
                    mo.this.setProgress(0.0f);
                } else {
                    mo.this.ud(this);
                    if (mo.this.f16054rc != null) {
                        qdl unused = mo.this.f16054rc;
                    }
                }
            }
        });
    }

    private void tvp() {
        qdl(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ud.mo.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                mo.this.ud(this);
                mo.this.rdp();
                mo.this.rq();
            }
        });
    }

    private void ud(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.f16055wd.getBounds().width();
        float fHeight = this.f16055wd.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.qdl[getScaleType().ordinal()];
        if (i10 == 1) {
            qdl(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            ud(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            lnr(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            mml(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void yt() {
        this.jtx = null;
        this.f16055wd.to();
    }

    public void mo() {
        this.rq = false;
        this.f16055wd.koa();
    }

    public void mzz() {
        this.exu.add(mml.PLAY_OPTION);
        this.f16055wd.bqt();
    }

    public void setMaxFrame(String str) {
        this.f16055wd.lnr(str);
    }

    public void setMinFrame(String str) {
        this.f16055wd.ud(str);
    }

    private com.bytedance.adsdk.ud.lnr.lnr.lnr lnr(String str) {
        com.bytedance.adsdk.ud.lnr.lnr.ud udVarUd;
        tvp tvpVar = this.f16055wd;
        if (tvpVar == null || (udVarUd = tvpVar.ud()) == null) {
            return null;
        }
        return qdl(udVarUd, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(long j10) {
        Map<String, Object> map;
        wd.qdl globalConfig = getGlobalConfig();
        if (this.f16054rc != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j10));
            if (globalConfig == null || (map = globalConfig.f16143ud) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.f16143ud);
        }
    }

    public void setAnimation(String str) {
        this.jpc = str;
        this.tvp = 0;
        setCompositionTask(ud(str));
    }

    public void lnr() {
        this.f16055wd.jl();
    }

    private to qdl(String str) {
        tvp tvpVar;
        wd wdVarXmv;
        Map<String, to> mapJtx;
        if (TextUtils.isEmpty(str) || (tvpVar = this.f16055wd) == null || (wdVarXmv = tvpVar.xmv()) == null || (mapJtx = wdVarXmv.jtx()) == null) {
            return null;
        }
        return mapJtx.get(str);
    }

    public boolean mml() {
        return this.f16055wd.oth();
    }

    private void ud(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    private void qdl(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            jtx();
            qdl();
            setFrame(i10);
            qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (mo.this.getFrame() < i11 - 1 || mo.this.getFrame() >= i11 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + mo.this.getFrame());
                    mo.this.ud(this);
                    mo.this.mo();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private exu<wd> ud(final String str) {
        if (isInEditMode()) {
            return new exu<>(new Callable<fs<wd>>() { // from class: com.bytedance.adsdk.ud.mo.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                public fs<wd> call() throws Exception {
                    return mo.this.fs ? jpc.lnr(mo.this.getContext(), str) : jpc.lnr(mo.this.getContext(), str, null);
                }
            }, true);
        }
        return this.fs ? jpc.ud(getContext(), str) : jpc.ud(getContext(), str, (String) null);
    }

    public void ud(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f16055wd.ud(animatorUpdateListener);
    }

    private void qdl(String str, String str2, JSONArray jSONArray) {
        wd.ud globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.qdl;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.lnr;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void ud() {
        this.f16055wd.yt();
    }

    public void ud(Animator.AnimatorListener animatorListener) {
        this.f16055wd.ud(animatorListener);
    }

    private com.bytedance.adsdk.ud.lnr.lnr.qdl qdl(MotionEvent motionEvent) {
        com.bytedance.adsdk.ud.lnr.lnr.ud udVarUd;
        tvp tvpVar = this.f16055wd;
        if (tvpVar == null || (udVarUd = tvpVar.ud()) == null) {
            return null;
        }
        return qdl(udVarUd, motionEvent);
    }

    private com.bytedance.adsdk.ud.lnr.lnr.qdl qdl(com.bytedance.adsdk.ud.lnr.lnr.ud udVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVarQdl;
        for (com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar : udVar.fs()) {
            if (qdlVar instanceof com.bytedance.adsdk.ud.lnr.lnr.ud) {
                if (qdlVar.jpc() && qdlVar.mo() > 0.0f) {
                    RectF rectF = new RectF();
                    qdlVar.qdl(rectF, qdlVar.mml(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (qdlVarQdl = qdl((com.bytedance.adsdk.ud.lnr.lnr.ud) qdlVar, motionEvent)) != null) {
                        return qdlVarQdl;
                    }
                }
            } else if (qdlVar.jpc() && qdlVar.mo() > 0.0f) {
                RectF rectF2 = new RectF();
                tvp tvpVar = this.f16055wd;
                if (tvpVar != null && tvpVar.wd()) {
                    qdlVar.qdl(rectF2, qdlVar.mml(), true);
                    RectF rectFRc = this.f16055wd.rc();
                    if (rectFRc != null) {
                        qdl(rectF2, rectFRc);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    qdlVar.qdl(rectF3, qdlVar.mml(), true);
                    ud(rectF2, rectF3);
                }
                if (qdl(motionEvent, rectF2)) {
                    return qdlVar;
                }
            }
        }
        return null;
    }

    private boolean qdl(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 >= rectF.left && x10 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void qdl(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.qdl[getScaleType().ordinal()];
        if (i10 == 1) {
            qdl(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            ud(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            lnr(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            mml(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void qdl(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void qdl(boolean z10, Context context) {
        this.f16055wd.qdl(z10, context);
    }

    private exu<wd> qdl(final int i10) {
        if (isInEditMode()) {
            return new exu<>(new Callable<fs<wd>>() { // from class: com.bytedance.adsdk.ud.mo.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                public fs<wd> call() throws Exception {
                    return mo.this.fs ? jpc.ud(mo.this.getContext(), i10) : jpc.ud(mo.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.fs ? jpc.qdl(getContext(), i10) : jpc.qdl(getContext(), i10, (String) null);
    }

    public void qdl(String str, String str2) {
        qdl(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void qdl(InputStream inputStream, String str) {
        setCompositionTask(jpc.qdl(inputStream, str));
    }

    private com.bytedance.adsdk.ud.lnr.lnr.lnr qdl(com.bytedance.adsdk.ud.lnr.lnr.ud udVar, String str) {
        for (com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar : udVar.fs()) {
            if (qdlVar instanceof com.bytedance.adsdk.ud.lnr.lnr.ud) {
                com.bytedance.adsdk.ud.lnr.lnr.lnr lnrVarQdl = qdl((com.bytedance.adsdk.ud.lnr.lnr.ud) qdlVar, str);
                if (lnrVarQdl != null) {
                    return lnrVarQdl;
                }
            } else if (TextUtils.equals(str, qdlVar.tvp()) && (qdlVar instanceof com.bytedance.adsdk.ud.lnr.lnr.lnr)) {
                return (com.bytedance.adsdk.ud.lnr.lnr.lnr) qdlVar;
            }
        }
        return null;
    }

    public void qdl() {
        if (this.aaj == 0) {
            this.aaj = SystemClock.elapsedRealtime();
        }
        this.exu.add(mml.PLAY_OPTION);
        this.f16055wd.rq();
    }

    public void qdl(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f16055wd.qdl(animatorUpdateListener);
    }

    public void qdl(Animator.AnimatorListener animatorListener) {
        this.f16055wd.qdl(animatorListener);
    }

    public void qdl(boolean z10) {
        this.f16055wd.mzz(z10 ? -1 : 0);
    }

    public Bitmap qdl(String str, Bitmap bitmap) {
        return this.f16055wd.qdl(str, bitmap);
    }

    private void qdl(float f10, boolean z10) {
        if (z10) {
            this.exu.add(mml.SET_PROGRESS);
        }
        this.f16055wd.mml(f10);
    }
}
