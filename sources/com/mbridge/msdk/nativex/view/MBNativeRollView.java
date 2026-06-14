package com.mbridge.msdk.nativex.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MBNativeRollView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RollingBCView f49924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f49925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NativeListener.FilpListener f49926c;

    public interface a {
    }

    @SuppressLint({"NewApi"})
    public MBNativeRollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f49924a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) {
        this.f49924a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f49926c = filpListener;
            this.f49924a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i10) {
        this.f49924a.setLayoutParams(new LinearLayout.LayoutParams(i10, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49925b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f49924a = rollingBCView;
        addView(rollingBCView);
        this.f49924a.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) v0.j(context)) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
