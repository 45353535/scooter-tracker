package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class MBExtSoundImageView extends SoundImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47929e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtSoundImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47930a;

        static {
            int[] iArr = new int[c.values().length];
            f47930a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47930a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47930a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47930a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47930a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47930a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47930a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47930a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47930a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47930a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47930a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47930a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47930a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47930a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47930a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47930a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBExtSoundImageView(Context context) {
        super(context);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47930a[cVar.ordinal()];
                if (i11 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue2);
                    }
                } else if (i11 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue3.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f47930a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
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
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f48156a.get(attributeValue3.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            String str = com.mbridge.msdk.dycreator.utils.b.f48156a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            if (attributeValue5.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue5.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (attributeValue6.equals("fitXY")) {
                                setScaleType(ImageView.ScaleType.FIT_XY);
                            } else if (attributeValue6.equals("centerInside")) {
                                setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            } else if (attributeValue6.equals("centerCrop")) {
                                setScaleType(ImageView.ScaleType.CENTER_CROP);
                            }
                        }
                        break;
                    case 8:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47929e = iA;
                        this.f47928d = iA;
                        this.f47927c = iA;
                        this.f47926b = iA;
                        setPadding(iA, iA, iA, iA);
                        break;
                    case 9:
                        int iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47927c = iA2;
                        setPadding(this.f47926b, iA2, this.f47928d, this.f47929e);
                        break;
                    case 10:
                        int iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47929e = iA3;
                        setPadding(this.f47926b, this.f47927c, this.f47928d, iA3);
                        break;
                    case 11:
                        int iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47926b = iA4;
                        setPadding(iA4, this.f47927c, this.f47928d, this.f47929e);
                        break;
                    case 12:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47928d = iA5;
                        setPadding(this.f47926b, this.f47927c, iA5, this.f47929e);
                        break;
                }
            }
        }
    }

    public MBExtSoundImageView(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e10) {
            q0.b("MBExtSoundImageView", e10.getMessage());
        }
    }

    public MBExtSoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
