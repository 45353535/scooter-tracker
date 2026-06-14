package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.mml, com.bytedance.sdk.component.adexpress.theme.qdl {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private mzz dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.mo.qdl mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.ud.rq mRenderListener;
    private com.bytedance.sdk.component.adexpress.ud.exu mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.ud muteListener;
    protected final com.bytedance.sdk.component.adexpress.ud.rdp renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.lnr> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.mzz videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.ud.exu exuVar, com.bytedance.sdk.component.adexpress.dynamic.mo.qdl qdlVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.ud.rdp rdpVar = new com.bytedance.sdk.component.adexpress.ud.rdp();
        this.renderResult = rdpVar;
        rdpVar.qdl(2);
        this.mDynamicClickListener = qdlVar;
        qdlVar.qdl(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.qdl(this);
        this.mIsMute = z10;
        this.mRenderRequest = exuVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz;
        com.bytedance.sdk.component.adexpress.dynamic.mml.mzz mzzVar = jpcVar.to();
        if (mzzVar == null || (moVarMzz = mzzVar.mzz()) == null) {
            return;
        }
        this.renderResult.ud(moVarMzz.fge());
    }

    private boolean checkSizeValid() {
        mzz mzzVar = this.dynamicBaseWidget;
        return mzzVar.mzz > 0.0f && mzzVar.mo > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !jpcVar.bch()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i10, String str) {
        this.renderResult.qdl(false);
        this.renderResult.ud(i10);
        this.renderResult.qdl(str);
        this.mRenderListener.qdl(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mo.qdl getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.ud.rq getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.ud.exu getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.lnr> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.qdl
    public void onThemeChanged(int i10) {
        mzz mzzVar = this.dynamicBaseWidget;
        if (mzzVar == null) {
            return;
        }
        mzzVar.qdl(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void onvideoComplate() {
        try {
            this.videoListener.qdl();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, int i10) {
        this.dynamicBaseWidget = renderDynamicView(jpcVar, this, i10);
        this.renderResult.qdl(true);
        this.renderResult.qdl(this.dynamicBaseWidget.mzz);
        this.renderResult.ud(this.dynamicBaseWidget.mo);
        this.renderResult.qdl(this.videoView);
        this.mRenderListener.qdl(this.renderResult);
    }

    public mzz renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, ViewGroup viewGroup, int i10) {
        if (jpcVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> listRq = jpcVar.rq();
        mzz mzzVarQdl = com.bytedance.sdk.component.adexpress.dynamic.qdl.ud.qdl(this.mContext, this, jpcVar);
        if (mzzVarQdl instanceof rc) {
            callBackRenderFail(i10 == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(jpcVar);
        mzzVarQdl.lnr();
        if (viewGroup != null) {
            viewGroup.addView(mzzVarQdl);
            setClipChildren(viewGroup, jpcVar);
        }
        if (listRq == null || listRq.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it = listRq.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), mzzVarQdl, i10);
        }
        return mzzVarQdl;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i10) {
        this.logoUnionHeight = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.ud udVar) {
        this.muteListener = udVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.ud.rq rqVar) {
        this.mRenderListener = rqVar;
        this.mDynamicClickListener.qdl(rqVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.scoreCountWithIcon = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.ud udVar = this.muteListener;
        if (udVar != null) {
            udVar.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < this.timeOutListener.size(); i12++) {
            if (this.timeOutListener.get(i12) != null) {
                this.timeOutListener.get(i12).qdl(charSequence, i10 == 1, i11, z10);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.lnr lnrVar) {
        this.timeOutListener.add(lnrVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTimeUpdate(int i10) {
        this.videoListener.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.timedown = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.mzz mzzVar) {
        this.videoListener = mzzVar;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        this.renderResult.lnr(d10);
        this.renderResult.mml(d11);
        this.renderResult.mzz(d12);
        this.renderResult.mo(d13);
        this.renderResult.qdl(f10);
        this.renderResult.ud(f10);
        this.renderResult.lnr(f10);
        this.renderResult.mml(f10);
    }

    public void beginShowFromInvisible(mzz mzzVar, int i10) {
        if (mzzVar == null) {
            return;
        }
        if (mzzVar.getBeginInvisibleAndShow()) {
            mzzVar.setVisibility(i10);
            View view = mzzVar.bjy;
            if (view != null) {
                view.setVisibility(i10);
            }
        }
        int childCount = mzzVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            if (mzzVar.getChildAt(i11) instanceof mzz) {
                beginShowFromInvisible((mzz) mzzVar.getChildAt(i11), i10);
            }
        }
    }
}
