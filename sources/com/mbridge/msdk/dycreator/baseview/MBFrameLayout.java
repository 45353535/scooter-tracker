package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
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
public class MBFrameLayout extends FrameLayout implements InterBase, InterEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f47705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f47706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f47707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47708d;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBFrameLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47709a;

        static {
            int[] iArr = new int[c.values().length];
            f47709a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47709a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47709a[c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47709a[c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47709a[c.layout_margin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MBFrameLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47708d = "";
        try {
            this.f47706b = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f47706b, this);
        } catch (Exception e10) {
            q0.b("MBFrameLayout", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47706b;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47706b.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47706b;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47706b.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47706b;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47706b.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47706b;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47706b.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47706b;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47706b.get("mbridgeStrategy");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            Animator animator = this.f47705a;
            if (animator != null) {
                animator.start();
            }
        } catch (Exception e10) {
            q0.b("MBFrameLayout", e10.getMessage());
        }
        Map<String, Boolean> map = this.f47707c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47707c.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47708d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            Animator animator = this.f47705a;
            if (animator != null) {
                animator.cancel();
            }
        } catch (Exception e10) {
            q0.b("MBFrameLayout", e10.getMessage());
        }
        Map<String, Boolean> map = this.f47707c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47707c.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47708d);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f47705a = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f47707c = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f47708d = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
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
                int i11 = AnonymousClass1.f47709a[cVar.ordinal()];
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
}
