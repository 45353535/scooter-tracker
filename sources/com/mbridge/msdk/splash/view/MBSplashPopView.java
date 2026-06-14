package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.splash.middle.d;
import com.mbridge.msdk.splash.view.BaseSplashPopView;

/* JADX INFO: loaded from: classes10.dex */
public class MBSplashPopView extends BaseSplashPopView {
    public MBSplashPopView(Context context, BaseSplashPopView.i iVar, d dVar) {
        super(context, iVar, dVar);
    }

    @Override // com.mbridge.msdk.splash.view.BaseSplashPopView
    protected void b(CampaignEx campaignEx) {
        super.b(campaignEx);
        a(campaignEx);
    }

    public MBSplashPopView(Context context) {
        super(context);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @RequiresApi(api = 21)
    public MBSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
