package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBExtFrameLayout extends MBridgeFramLayout implements InterBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f47900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f47901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47902d;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtFrameLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47903a;

        static {
            int[] iArr = new int[c.values().length];
            f47903a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47903a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47903a[c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47903a[c.layout_margin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47903a[c.layout_marginLeft.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47903a[c.layout_marginRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47903a[c.layout_marginTop.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47903a[c.layout_marginBottom.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public MBExtFrameLayout(Context context) {
        super(context);
        this.f47902d = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47900b;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47900b.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47900b;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47900b.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47900b;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47900b.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47900b;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47900b.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47900b;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47900b.get("mbridgeStrategy");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47901c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47901c.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47902d);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47901c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47901c.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47902d);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47901c = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47902d = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f47903a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith("m")) {
                            layoutParamsGenerateDefaultLayoutParams.width = -1;
                        } else if (attributeValue.startsWith(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)) {
                            layoutParamsGenerateDefaultLayoutParams.width = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.width = b.a().a(attributeValue);
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                            layoutParamsGenerateDefaultLayoutParams.width = -1;
                        } else if (attributeValue2.startsWith(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)) {
                            layoutParamsGenerateDefaultLayoutParams.width = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.height = b.a().a(attributeValue2);
                        }
                        break;
                    case 3:
                        layoutParamsGenerateDefaultLayoutParams.gravity = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 4:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        layoutParamsGenerateDefaultLayoutParams.setMargins(iA, iA, iA, iA);
                        break;
                    case 5:
                        layoutParamsGenerateDefaultLayoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 6:
                        layoutParamsGenerateDefaultLayoutParams.rightMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 7:
                        layoutParamsGenerateDefaultLayoutParams.topMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 8:
                        layoutParamsGenerateDefaultLayoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                }
            }
        }
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public MBExtFrameLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47902d = "";
        try {
            this.f47900b = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f47900b, this);
        } catch (Exception e10) {
            q0.b("MBExtFrameLayout", e10.getMessage());
        }
    }

    public MBExtFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47902d = "";
    }
}
