package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.PlayerView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBPlayerView extends PlayerView implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f47736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f47737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f47738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f47739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47740e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBPlayerView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47741a;

        static {
            int[] iArr = new int[c.values().length];
            f47741a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47741a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47741a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47741a[c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47741a[c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47741a[c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47741a[c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47741a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47741a[c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47741a[c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47741a[c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47741a[c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBPlayerView(Context context) {
        super(context);
        this.f47740e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47738c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47738c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47738c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47738c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47738c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47738c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47738c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47738c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47738c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47738c.get("mbridgeStrategy");
    }

    public float getxInScreen() {
        return this.f47736a;
    }

    public float getyInScreen() {
        return this.f47737b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47739d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47739d.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47740e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47739d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47739d.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47740e);
        }
    }

    @Override // com.mbridge.msdk.playercommon.PlayerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f47736a = motionEvent.getRawX();
        this.f47737b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47739d = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47740e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f47741a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith("m")) {
                            layoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().a(attributeValue);
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                            layoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParams.height = -2;
                        } else {
                            layoutParams.height = b.a().a(attributeValue2);
                        }
                        break;
                    case 3:
                        layoutParams.gravity = 1;
                        break;
                    case 4:
                        layoutParams.gravity = 16;
                        break;
                    case 5:
                        layoutParams.weight = attributeSet.getAttributeFloatValue(i10, 0.0f);
                        break;
                    case 6:
                        setGravity(b.a().b(attributeSet.getAttributeValue(i10)));
                        break;
                    case 7:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        layoutParams.bottomMargin = iA;
                        layoutParams.leftMargin = iA;
                        layoutParams.rightMargin = iA;
                        layoutParams.topMargin = iA;
                        break;
                    case 8:
                        layoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 9:
                        layoutParams.rightMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 10:
                        layoutParams.topMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 11:
                        layoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 12:
                        layoutParams.gravity = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBPlayerView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47740e = "";
        try {
            this.f47738c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f47738c, this);
        } catch (Exception e10) {
            q0.b("MBLinearLayout", e10.getMessage());
        }
    }
}
