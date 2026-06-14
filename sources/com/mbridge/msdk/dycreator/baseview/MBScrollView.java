package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBScrollView extends ScrollView implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f47749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f47750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47751c;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBScrollView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47752a;

        static {
            int[] iArr = new int[c.values().length];
            f47752a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47752a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47752a[c.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47752a[c.fadingEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47752a[c.visibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47752a[c.layout_marginBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MBScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47751c = "";
        this.f47749a = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.utils.c.a(this.f47749a, this);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47749a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47749a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47749a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47749a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47749a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47749a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47749a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47749a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47749a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47749a.get("mbridgeStrategy");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47750b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47750b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47751c);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47750b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47750b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47751c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47752a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(attributeValue.substring(5).hashCode());
                    }
                } else if (i11 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("#")) {
                        setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                    } else {
                        if (attributeValue2.startsWith("@drawable/")) {
                            attributeValue2 = attributeValue2.substring(10);
                        }
                        setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue2 + ".png")));
                    }
                } else if (i11 == 3) {
                    setContentDescription(attributeSet.getAttributeValue(i10));
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47750b = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47751c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                Log.e("MBscrollviewparam", cVar.toString());
            }
            if (cVar != null) {
                int i11 = AnonymousClass1.f47752a[cVar.ordinal()];
                if (i11 == 4) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                } else if (i11 == 5) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 6) {
                    layoutParamsGenerateDefaultLayoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i10));
                }
            }
        }
        return layoutParamsGenerateDefaultLayoutParams;
    }
}
