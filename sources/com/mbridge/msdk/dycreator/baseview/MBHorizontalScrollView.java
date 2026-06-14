package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
public class MBHorizontalScrollView extends HorizontalScrollView implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f47714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f47715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47716c;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBHorizontalScrollView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47717a;

        static {
            int[] iArr = new int[c.values().length];
            f47717a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47717a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47717a[c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47717a[c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47717a[c.layout_margin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MBHorizontalScrollView(Context context) {
        super(context);
        this.f47716c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47714a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47714a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47714a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47714a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47714a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47714a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47714a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47714a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47714a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47714a.get("mbridgeStrategy");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47715b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47715b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47716c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47715b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47715b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47716c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47715b = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47716c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap mapB = b.a().b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47717a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue);
                    }
                } else if (i11 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue2);
                    }
                } else if (i11 == 3) {
                    layoutParams.gravity = b.a().b(attributeSet.getAttributeValue(i10));
                } else if (i11 == 4) {
                    layoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i10));
                } else if (i11 == 5) {
                    int iA = b.a().a(attributeSet.getAttributeValue(i10));
                    layoutParams.setMargins(iA, iA, iA, iA);
                }
            }
        }
        return layoutParams;
    }

    public MBHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47716c = "";
        try {
            this.f47714a = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f47714a, this);
        } catch (Exception e10) {
            q0.b("MBHorizontalScrollView", e10.getMessage());
        }
    }

    public MBHorizontalScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47716c = "";
    }
}
