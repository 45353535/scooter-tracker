package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBLinearLayout extends LinearLayout implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f47726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f47727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f47728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f47729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47730e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBLinearLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47731a;

        static {
            int[] iArr = new int[c.values().length];
            f47731a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47731a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47731a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47731a[c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47731a[c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47731a[c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47731a[c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47731a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47731a[c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47731a[c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47731a[c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47731a[c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBLinearLayout(Context context) {
        super(context);
        this.f47730e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47728c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47728c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47728c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47728c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47728c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47728c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47728c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47728c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47728c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47728c.get("mbridgeStrategy");
    }

    public float getxInScreen() {
        return this.f47726a;
    }

    public float getyInScreen() {
        return this.f47727b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47729d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47729d.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47730e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47729d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47729d.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47730e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f47726a = motionEvent.getRawX();
        this.f47727b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47729d = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47730e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f47731a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith("m")) {
                            layoutParamsGenerateDefaultLayoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParamsGenerateDefaultLayoutParams.width = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.width = b.a().a(attributeValue);
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                            layoutParamsGenerateDefaultLayoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParamsGenerateDefaultLayoutParams.height = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.height = b.a().a(attributeValue2);
                        }
                        break;
                    case 3:
                        layoutParamsGenerateDefaultLayoutParams.gravity = 1;
                        break;
                    case 4:
                        layoutParamsGenerateDefaultLayoutParams.gravity = 16;
                        break;
                    case 5:
                        layoutParamsGenerateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i10, 0.0f);
                        break;
                    case 6:
                        setGravity(b.a().b(attributeSet.getAttributeValue(i10)));
                        break;
                    case 7:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        layoutParamsGenerateDefaultLayoutParams.bottomMargin = iA;
                        layoutParamsGenerateDefaultLayoutParams.leftMargin = iA;
                        layoutParamsGenerateDefaultLayoutParams.rightMargin = iA;
                        layoutParamsGenerateDefaultLayoutParams.topMargin = iA;
                        break;
                    case 8:
                        layoutParamsGenerateDefaultLayoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 9:
                        layoutParamsGenerateDefaultLayoutParams.rightMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 10:
                        layoutParamsGenerateDefaultLayoutParams.topMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 11:
                        layoutParamsGenerateDefaultLayoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 12:
                        layoutParamsGenerateDefaultLayoutParams.gravity = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                }
            }
        }
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47730e = "";
        this.f47728c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.utils.c.a(this.f47728c, this);
    }

    public MBLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47730e = "";
    }
}
