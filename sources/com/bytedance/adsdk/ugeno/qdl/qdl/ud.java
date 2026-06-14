package com.bytedance.adsdk.ugeno.qdl.qdl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends qdl {
    private int lnr;
    private int mml;
    private Paint mo;
    private int mzz;

    public ud(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        super(lnrVar, jSONObject);
        Paint paint = new Paint();
        this.mo = paint;
        paint.setAntiAlias(true);
    }

    private void lnr(Canvas canvas) {
        try {
            if (this.f16227ud.yh() > 0.0f) {
                this.mo.setColor(this.lnr);
                this.mo.setAlpha((int) ((1.0f - this.f16227ud.yh()) * 255.0f));
                ((ViewGroup) this.f16227ud.rq().getParent()).setClipChildren(true);
                canvas.drawCircle(this.mml, this.mzz, Math.min(r0, r2) * 2 * this.f16227ud.yh(), this.mo);
            }
        } catch (Throwable th2) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud() {
        this.lnr = com.bytedance.adsdk.ugeno.wd.qdl.qdl(this.qdl.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(int i10, int i11) {
        this.mml = i10 / 2;
        this.mzz = i11 / 2;
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
