package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.lnr.fs;
import com.bytedance.sdk.openadsdk.lnr.to;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class bjy extends com.bytedance.sdk.openadsdk.core.mo.lnr implements to.ud {
    private qdl lnr;
    private Context mml;
    private boolean mo;
    private String mzz;
    private View qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ljh f16965ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.lnr.to f16966wd;

    public interface qdl {
        void qdl(View view);

        void qdl(FilterWord filterWord);

        void ud(View view);
    }

    public bjy(@NonNull Context context, @NonNull ljh ljhVar) {
        this(context.getApplicationContext());
        this.f16965ud = ljhVar;
        this.mml = context;
        mml();
        mzz();
    }

    private void mml() {
        this.f16966wd.qdl(this.f16965ud.ir());
        this.f16966wd.qdl(this);
    }

    private fs.qdl mo() {
        return new fs.qdl() { // from class: com.bytedance.sdk.openadsdk.common.bjy.2
            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void lnr() {
                bjy.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void qdl() {
                bjy.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void ud() {
                bjy.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void qdl(int i10, FilterWord filterWord, String str) {
                bjy.this.f16966wd.lnr(str);
                bjy.this.setVisibility(0);
            }
        };
    }

    private void mzz() {
        com.bytedance.sdk.openadsdk.lnr.to toVar;
        ljh ljhVar = this.f16965ud;
        if (ljhVar == null || (toVar = this.f16966wd) == null) {
            return;
        }
        toVar.qdl(ljhVar.fc());
    }

    public void lnr() {
        Context context = this.mml;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.lnr.fs fsVar = new com.bytedance.sdk.openadsdk.lnr.fs(this.mml, this.f16966wd);
            fsVar.qdl(mo());
            fsVar.qdl("", this.f16965ud);
            if (zIsFinishing || fsVar.isShowing()) {
                return;
            }
            fsVar.show();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.lnr.to toVar = this.f16966wd;
        if (toVar != null) {
            toVar.qdl();
        }
    }

    public void setCallback(qdl qdlVar) {
        this.lnr = qdlVar;
    }

    public void setDislikeSource(String str) {
        this.mzz = str;
        this.f16966wd.ud(str);
    }

    public void ud() {
        setVisibility(8);
        this.mo = false;
        qdl qdlVar = this.lnr;
        if (qdlVar != null) {
            qdlVar.ud(this);
        }
    }

    private void qdl(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.bjy.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bjy.this.f16966wd != null) {
                    bjy.this.f16966wd.mzz();
                } else {
                    bjy.this.ud();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.qdl = new com.bytedance.sdk.openadsdk.lnr.tvp(context, this.f16966wd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = ax.ud(getContext(), 20.0f);
        layoutParams.rightMargin = ax.ud(getContext(), 20.0f);
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setClickable(true);
        mzz();
    }

    public bjy(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public bjy(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bjy(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mo = false;
        this.f16966wd = new com.bytedance.sdk.openadsdk.lnr.to();
        qdl(context, attributeSet);
    }

    public void qdl() {
        if (this.qdl.getParent() == null) {
            addView(this.qdl);
        }
        setVisibility(0);
        this.mo = true;
        qdl qdlVar = this.lnr;
        if (qdlVar != null) {
            qdlVar.qdl(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.ud
    public void qdl(int i10) {
        if (com.bytedance.sdk.openadsdk.lnr.to.f17625ud == i10) {
            FilterWord filterWordUd = this.f16966wd.ud();
            if (filterWordUd == null || com.bytedance.sdk.openadsdk.lnr.to.qdl.equals(filterWordUd)) {
                return;
            }
            qdl qdlVar = this.lnr;
            if (qdlVar != null) {
                try {
                    qdlVar.qdl(filterWordUd);
                } catch (Throwable unused) {
                }
            }
            ud();
            return;
        }
        if (com.bytedance.sdk.openadsdk.lnr.to.lnr == i10) {
            ud();
        } else if (com.bytedance.sdk.openadsdk.lnr.to.mzz == i10) {
            lnr();
        }
    }
}
