package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MBExtMBridgeSegmentsProgressBar extends MBridgeSegmentsProgressBar implements InterBase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, String> f47918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Boolean> f47919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f47920o;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBridgeSegmentsProgressBar$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47921a;

        static {
            int[] iArr = new int[c.values().length];
            f47921a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47921a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47921a[c.orientation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47921a[c.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47921a[c.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47921a[c.layout_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47921a[c.layout_height.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47921a[c.layout_centerHorizontal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47921a[c.layout_centerVertical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47921a[c.layout_weight.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47921a[c.gravity.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47921a[c.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47921a[c.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47921a[c.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47921a[c.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47921a[c.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47921a[c.layout_gravity.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MBExtMBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f47920o = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f47918m;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f47918m.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f47918m;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f47918m.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f47918m;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f47918m.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f47918m;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f47918m.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f47918m;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f47918m.get("mbridgeStrategy");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f47919n;
        if (map != null && map.containsKey("mbridgeAttached") && this.f47919n.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f47920o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f47919n;
        if (map != null && map.containsKey("mbridgeDetached") && this.f47919n.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f47920o);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47921a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(attributeValue.substring(5).hashCode());
                    }
                } else if (i11 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("#")) {
                        try {
                            strArrSplit = attributeValue2.split(TokenBuilder.TOKEN_DELIMITER);
                        } catch (Exception unused) {
                            strArrSplit = null;
                        }
                        if (strArrSplit != null && strArrSplit.length <= 2) {
                            setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                        } else if (strArrSplit == null || strArrSplit.length != 3) {
                            setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                        } else {
                            try {
                                GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                gradientDrawable.setGradientType(0);
                                setBackground(gradientDrawable);
                            } catch (Exception unused2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            }
                        }
                    } else {
                        if (attributeValue2.startsWith("@drawable/")) {
                            attributeValue2 = attributeValue2.substring(10);
                        }
                        setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue2 + ".png")));
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            if (attributeValue3.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue3.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                    } else if (i11 == 5) {
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA, iA, iA);
                    }
                } else if ("horizontal".equalsIgnoreCase(attributeSet.getAttributeValue(i10))) {
                    setOrientation(0);
                } else {
                    setOrientation(1);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f47921a[cVar.ordinal()]) {
                    case 6:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith("m")) {
                            layoutParamsGenerateDefaultLayoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParamsGenerateDefaultLayoutParams.width = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.width = b.a().a(attributeValue);
                        }
                        break;
                    case 7:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                            layoutParamsGenerateDefaultLayoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParamsGenerateDefaultLayoutParams.height = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.height = b.a().a(attributeValue2);
                        }
                        break;
                    case 8:
                        layoutParamsGenerateDefaultLayoutParams.gravity = 1;
                        break;
                    case 9:
                        layoutParamsGenerateDefaultLayoutParams.gravity = 16;
                        break;
                    case 10:
                        layoutParamsGenerateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i10, 0.0f);
                        break;
                    case 11:
                        setGravity(b.a().b(attributeSet.getAttributeValue(i10)));
                        break;
                    case 12:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        layoutParamsGenerateDefaultLayoutParams.bottomMargin = iA;
                        layoutParamsGenerateDefaultLayoutParams.leftMargin = iA;
                        layoutParamsGenerateDefaultLayoutParams.rightMargin = iA;
                        layoutParamsGenerateDefaultLayoutParams.topMargin = iA;
                        break;
                    case 13:
                        layoutParamsGenerateDefaultLayoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 14:
                        layoutParamsGenerateDefaultLayoutParams.rightMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 15:
                        layoutParamsGenerateDefaultLayoutParams.topMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 16:
                        layoutParamsGenerateDefaultLayoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 17:
                        layoutParamsGenerateDefaultLayoutParams.gravity = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                }
            }
        }
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public MBExtMBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context);
        this.f47920o = "";
        try {
            this.f47918m = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f47918m, this);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBExtMBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47920o = "";
    }
}
