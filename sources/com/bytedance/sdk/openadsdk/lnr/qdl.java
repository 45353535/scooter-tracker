package com.bytedance.sdk.openadsdk.lnr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends com.bytedance.sdk.openadsdk.core.mo.jpc {
    private boolean lnr;
    private int mml;
    private Paint qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f17624ud;

    public qdl(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        this.f17624ud = ax.qdl(getContext(), 8.0f);
        this.qdl = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qdl(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.jpc, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.mml = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.mml);
        } else {
            layoutParams.height = this.mml;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.jpc, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.mml;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.f17624ud = f10;
    }

    private void qdl(String str, int i10) {
        if (!this.lnr && i10 > 0) {
            float textSize = getTextSize();
            this.qdl.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float fQdl = qdl(textSize, str);
            while (fQdl > paddingLeft) {
                textSize -= 1.0f;
                this.qdl.setTextSize(textSize);
                if (textSize <= this.f17624ud) {
                    break;
                } else {
                    fQdl = qdl(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.lnr = true;
        }
    }

    private float qdl(float f10, String str) {
        this.qdl.setTextSize(f10);
        return this.qdl.measureText(str);
    }
}
