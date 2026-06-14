package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBButton extends Button implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f47697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f47698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47699c;

    public MBButton(Context context) {
        super(context);
        this.f47699c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47697a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47697a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47697a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47697a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47697a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47697a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47697a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47697a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47697a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47697a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47698b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47698b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47699c);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47698b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47698b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47699c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47698b = c.a(str);
        if (campaignEx != null) {
            this.f47699c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47699c = "";
        this.f47697a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f47697a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47699c = "";
    }
}
