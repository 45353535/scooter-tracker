package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.GridView;
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
public class MBGridView extends GridView implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f47710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f47711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47712c;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBGridView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47713a;

        static {
            int[] iArr = new int[c.values().length];
            f47713a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47713a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47713a[c.fadingEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47713a[c.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MBGridView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47712c = "";
        try {
            this.f47710a = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f47710a, this);
        } catch (Exception e10) {
            q0.b("MBGridView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47710a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47710a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47710a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47710a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47710a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47710a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47710a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47710a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47710a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47710a.get("mbridgeStrategy");
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47711b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47711b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47712c);
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47711b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47711b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47712c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47711b = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47712c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public AbsListView.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) generateDefaultLayoutParams();
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47713a[cVar.ordinal()];
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
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                } else if (i11 == 4) {
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
}
