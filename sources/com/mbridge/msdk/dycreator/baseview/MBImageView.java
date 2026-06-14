package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBImageView extends ImageView implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f47718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f47720c;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47721a;

        static {
            int[] iArr = new int[c.values().length];
            f47721a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47721a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47721a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47719b = "";
        if (context != null && attributeSet != null) {
            try {
                this.f47720c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            } catch (Exception e10) {
                q0.b("MBImageView", e10.getMessage());
                return;
            }
        }
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(context, attributeSet));
        com.mbridge.msdk.dycreator.utils.c.a(this.f47720c, this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47721a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue);
                    }
                } else if (i11 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue2);
                    }
                } else if (i11 == 3) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47720c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47720c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47720c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47720c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47720c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47720c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47720c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47720c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47720c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47720c.get("mbridgeStrategy");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47718a;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47718a.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47719b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47718a;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47718a.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47719b);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47718a = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47719b = campaignEx.getCampaignUnitId();
        }
    }
}
