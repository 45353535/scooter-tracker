package com.bytedance.adsdk.ud.wd;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.ud.wd;

/* JADX INFO: loaded from: classes6.dex */
public class qdl<T> {
    private float bjy;
    private int exu;
    private float fs;
    public PointF jpc;
    private float jtx;
    public final Interpolator lnr;
    public final Interpolator mml;
    public final float mo;
    public final Interpolator mzz;
    public final T qdl;
    private int rdp;
    private float rq;
    private final wd to;
    public PointF tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public T f16147ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public Float f16148wd;

    public qdl(wd wdVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = wdVar;
        this.qdl = t10;
        this.f16147ud = t11;
        this.lnr = interpolator;
        this.mml = null;
        this.mzz = null;
        this.mo = f10;
        this.f16148wd = f11;
    }

    public int jpc() {
        if (this.exu == 784923401) {
            this.exu = ((Integer) this.qdl).intValue();
        }
        return this.exu;
    }

    public float lnr() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        if (this.bjy == Float.MIN_VALUE) {
            this.bjy = (this.mo - wdVar.mo()) / this.to.yt();
        }
        return this.bjy;
    }

    public float mml() {
        if (this.to == null) {
            return 1.0f;
        }
        if (this.jtx == Float.MIN_VALUE) {
            if (this.f16148wd == null) {
                this.jtx = 1.0f;
            } else {
                this.jtx = lnr() + ((this.f16148wd.floatValue() - this.mo) / this.to.yt());
            }
        }
        return this.jtx;
    }

    public float mo() {
        if (this.rq == -3987645.8f) {
            this.rq = ((Float) this.qdl).floatValue();
        }
        return this.rq;
    }

    public boolean mzz() {
        return this.lnr == null && this.mml == null && this.mzz == null;
    }

    public qdl<T> qdl(T t10, T t11) {
        return new qdl<>(t10, t11);
    }

    public String toString() {
        return "Keyframe{startValue=" + this.qdl + ", endValue=" + this.f16147ud + ", startFrame=" + this.mo + ", endFrame=" + this.f16148wd + ", interpolator=" + this.lnr + '}';
    }

    public int tvp() {
        if (this.rdp == 784923401) {
            this.rdp = ((Integer) this.f16147ud).intValue();
        }
        return this.rdp;
    }

    public float wd() {
        if (this.fs == -3987645.8f) {
            this.fs = ((Float) this.f16147ud).floatValue();
        }
        return this.fs;
    }

    public boolean qdl(float f10) {
        return f10 >= lnr() && f10 < mml();
    }

    public qdl(wd wdVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = wdVar;
        this.qdl = t10;
        this.f16147ud = t11;
        this.lnr = null;
        this.mml = interpolator;
        this.mzz = interpolator2;
        this.mo = f10;
        this.f16148wd = f11;
    }

    protected qdl(wd wdVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = wdVar;
        this.qdl = t10;
        this.f16147ud = t11;
        this.lnr = interpolator;
        this.mml = interpolator2;
        this.mzz = interpolator3;
        this.mo = f10;
        this.f16148wd = f11;
    }

    public qdl(T t10) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = null;
        this.qdl = t10;
        this.f16147ud = t10;
        this.lnr = null;
        this.mml = null;
        this.mzz = null;
        this.mo = Float.MIN_VALUE;
        this.f16148wd = Float.valueOf(Float.MAX_VALUE);
    }

    private qdl(T t10, T t11) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = null;
        this.qdl = t10;
        this.f16147ud = t11;
        this.lnr = null;
        this.mml = null;
        this.mzz = null;
        this.mo = Float.MIN_VALUE;
        this.f16148wd = Float.valueOf(Float.MAX_VALUE);
    }
}
