package dc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import io.bidmachine.LabelData;
import io.bidmachine.PositionData;
import io.bidmachine.PrivacySheetData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ld.a;
import pd.g0;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends FrameLayout {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionData.values().length];
            try {
                iArr[PositionData.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionData.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PositionData.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PositionData.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(PrivacySheetData privacySheetData, View v10) {
        Intrinsics.checkNotNullParameter(privacySheetData, "$privacySheetData");
        Intrinsics.checkNotNullParameter(v10, "v");
        a.C1079a c1079a = ld.a.f94158d;
        Context contextN = io.bidmachine.core.h.n(v10.getContext(), v10);
        Intrinsics.checkNotNullExpressionValue(contextN, "findDialogContext(v.context, v)");
        c1079a.a(contextN, privacySheetData.getPrivacySheetParams());
    }

    private final ImageView d(LabelData labelData, int i10, int i11) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(labelData.getImage());
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iK = g0.k(context, labelData.getWidthDp());
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK, g0.k(context2, labelData.getHeightDp()));
        layoutParams.setMargins(i10, 0, i11, 0);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public final void b(ac.i nativeData) {
        int childCount;
        Intrinsics.checkNotNullParameter(nativeData, "nativeData");
        removeAllViews();
        Context context = getContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LabelData adLabelData = nativeData.getAdLabelData();
        int i10 = 0;
        if (adLabelData != null) {
            PositionData positionData = adLabelData.getPositionData();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.addView(d(adLabelData, 0, 0));
            linkedHashMap.put(positionData, linearLayout);
        }
        final PrivacySheetData privacySheetData = nativeData.getPrivacySheetData();
        if (privacySheetData != null) {
            LabelData labelData = privacySheetData.getLabelData();
            PositionData positionData2 = labelData.getPositionData();
            LinearLayout linearLayout2 = (LinearLayout) linkedHashMap.get(positionData2);
            if (linearLayout2 == null) {
                linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
            }
            linkedHashMap.put(positionData2, linearLayout2);
            Intrinsics.checkNotNullExpressionValue(context, "context");
            int iK = g0.k(context, 5.0f);
            int childCount2 = linearLayout2.getChildCount();
            if (positionData2 == PositionData.TopLeft || positionData2 == PositionData.BottomLeft) {
                childCount = 0;
                if (childCount2 <= 0) {
                    iK = 0;
                }
            } else {
                childCount = linearLayout2.getChildCount();
                if (childCount2 > 0) {
                    iK = 0;
                    i10 = iK;
                } else {
                    iK = 0;
                }
            }
            ImageView imageViewD = d(labelData, i10, iK);
            linearLayout2.addView(imageViewD, childCount);
            imageViewD.setOnClickListener(new View.OnClickListener() { // from class: dc.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r.c(privacySheetData, view);
                }
            });
        }
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iK2 = g0.k(context, 8.0f);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PositionData positionData3 = (PositionData) entry.getKey();
            View view = (LinearLayout) entry.getValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iK2, iK2, iK2, iK2);
            int i11 = a.$EnumSwitchMapping$0[positionData3.ordinal()];
            if (i11 == 1) {
                layoutParams.gravity = 51;
            } else if (i11 == 2) {
                layoutParams.gravity = 53;
            } else if (i11 == 3) {
                layoutParams.gravity = 83;
            } else if (i11 == 4) {
                layoutParams.gravity = 85;
            }
            addView(view, layoutParams);
        }
    }

    public /* synthetic */ r(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
