package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBTextView extends TextView implements InterBase, InterEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47791a;
    public AttributeSet attrs;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Animator f47792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f47793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f47794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47795e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBTextView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47796a;

        static {
            int[] iArr = new int[c.values().length];
            f47796a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47796a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBTextView(Context context) {
        super(context);
        this.f47791a = false;
        this.f47795e = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47796a[cVar.ordinal()];
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
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47793c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47793c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47793c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47793c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47793c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47793c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47793c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47793c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47793c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47793c.get("mbridgeStrategy");
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f47791a) {
            return true;
        }
        return super.isFocused();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Animator animator = this.f47792b;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f47794d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47794d.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47795e);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f47792b;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f47794d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47794d.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47795e);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f47792b = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47794d = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47795e = campaignEx.getCampaignUnitId();
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47791a = false;
        this.f47795e = "";
        this.attrs = attributeSet;
        try {
            this.f47793c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f47793c, this);
        } catch (Exception e10) {
            q0.b("TextView", e10.getMessage());
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47791a = false;
        this.f47795e = "";
    }
}
