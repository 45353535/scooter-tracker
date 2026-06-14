package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.lnr.to;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements to.ud {
    protected final to lnr;
    private View mml;
    protected String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected List<FilterWord> f16763ud;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        to toVar = new to();
        this.lnr = toVar;
        toVar.qdl(this);
    }

    public void destroy() {
        to toVar = this.lnr;
        if (toVar != null) {
            toVar.qdl();
        }
    }

    public to getDislikeManager() {
        return this.lnr;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mml = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.mml;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        to toVar = this.lnr;
        if (toVar != null) {
            toVar.lnr(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.qdl = str;
        this.f16763ud = list;
        this.lnr.qdl(str);
        this.lnr.qdl(this.f16763ud);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i10) {
        super(context, i10);
        to toVar = new to();
        this.lnr = toVar;
        toVar.qdl(this);
    }
}
