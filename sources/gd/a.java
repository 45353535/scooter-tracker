package gd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import com.google.android.material.navigation.NavigationBarView;
import io.bidmachine.rendering.R$color;
import io.bidmachine.rendering.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Button {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setAllCaps(false);
        setMinHeight(g0.k(context, 40.0f));
        setMinWidth(0);
        setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        setIncludeFontPadding(false);
        setElevation(0.0f);
        setStateListAnimator(null);
        int iK = g0.k(context, 24.0f);
        int iK2 = g0.k(context, 10.0f);
        int iK3 = g0.k(context, 8.0f);
        setPadding(iK, iK2, iK, iK2);
        setCompoundDrawablePadding(iK3);
        setBackgroundResource(R$drawable.f81908a);
        setTextColor(g0.r(context, R$color.f81907b));
    }

    private final Drawable a(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iK = g0.k(context, 24.0f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == iK && height == iK) {
            return drawable;
        }
        float f10 = iK;
        float f11 = width;
        float f12 = height;
        float fMin = Math.min(f10 / f11, f10 / f12);
        return new BitmapDrawable(getContext().getResources(), Bitmap.createScaledBitmap(bitmap, (int) (f11 * fMin), (int) (f12 * fMin), true));
    }

    public final void setActionIcon(@Nullable Drawable drawable) {
        Drawable drawableMutate;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iR = g0.r(context, R$color.f81906a);
        if (drawable != null) {
            drawableMutate = a(drawable).mutate();
            drawableMutate.setTint(iR);
        } else {
            drawableMutate = null;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
    }
}
