package com.bytedance.adsdk.ugeno.qdl.qdl;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.bytedance.adsdk.ugeno.wd.qdl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends qdl {
    private static final float bjy;
    private static final float jtx;
    private static final float rdp;
    private static final float yt;
    private Path exu;
    private boolean fs;
    private float jl;
    private int jpc;
    private int lnr;
    private Paint mml;
    private qdl.C0216qdl mo;
    private Path mzz;
    private int rq;
    private int to;
    private float tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f16225wd;

    static {
        float radians = (float) Math.toRadians(30.0d);
        rdp = radians;
        bjy = (float) Math.tan(radians);
        jtx = (float) Math.cos(radians);
        yt = (float) Math.sin(radians);
    }

    public mml(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        super(lnrVar, jSONObject);
        this.fs = true;
        Paint paint = new Paint();
        this.mml = paint;
        paint.setAntiAlias(true);
        this.mzz = new Path();
        this.tvp = this.f16227ud.ljh();
        this.exu = new Path();
    }

    private void lnr(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.f16227ud.wak() > 0.0f) {
                int i10 = this.to;
                float f10 = bjy;
                float fWak = (i10 + (i10 * f10)) * this.f16227ud.wak();
                this.exu.reset();
                this.exu.moveTo(fWak, 0.0f);
                int i11 = this.rq;
                float f11 = fWak - (i11 * f10);
                this.exu.lineTo(f11, i11);
                this.exu.lineTo(f11 + this.lnr, this.rq);
                this.exu.lineTo(this.lnr + fWak, 0.0f);
                this.exu.close();
                float f12 = this.jl;
                float f13 = jtx * f12;
                float f14 = f12 * yt;
                if (!this.fs || this.mo == null) {
                    int i12 = this.jpc;
                    linearGradient = new LinearGradient(fWak, 0.0f, fWak + f13, f14, new int[]{i12, this.f16225wd, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fWak, 0.0f, fWak + f13, f14, this.mo.f16274ud, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.mml.setShader(linearGradient);
                Path path = this.mzz;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.exu, this.mml);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    @SuppressLint({"DrawAllocation"})
    public void qdl(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud() {
        this.lnr = (int) jpc.qdl(this.f16227ud.rq().getContext(), this.qdl.optInt("shineWidth", 30));
        String strOptString = this.qdl.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.mo = com.bytedance.adsdk.ugeno.wd.qdl.ud(str);
        } else {
            int iQdl = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str);
            this.f16225wd = iQdl;
            this.jpc = com.bytedance.adsdk.ugeno.wd.qdl.qdl(iQdl, 32);
            this.fs = false;
        }
        this.jl = jtx * this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(int i10, int i11) {
        this.to = i10;
        this.rq = i11;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            Path path = this.mzz;
            float f10 = this.tvp;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public List<PropertyValuesHolder> lnr() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(mml(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
