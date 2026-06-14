package com.yandex.div.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R.\u0010'\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001c\u00105\u001a\u0004\u0018\u0001018@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\b\u001a\u0004\b2\u00103R\u001c\u00108\u001a\u0004\u0018\u0001018@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\b\u001a\u0004\b6\u00103R$\u00109\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001f¨\u0006<"}, d2 = {"Lcom/yandex/div/internal/widget/SwitchView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "", "changeTints", "()V", "updateTints", "fillDefaultColors", "", "resId", "Landroid/util/TypedValue;", "typedValue", "", "outputIsResource", "getColorFromTheme", "(ILandroid/util/TypedValue;Z)I", "", "value", "applyAlpha", "(IF)I", "setAlpha", "(II)I", "lightenColor", "forwardClicksToSwitch", "isEnabled", "()Z", "enabled", "setEnabled", "(Z)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/appcompat/widget/SwitchCompat;", "switch", "Landroidx/appcompat/widget/SwitchCompat;", "colorOn", "Ljava/lang/Integer;", "getColorOn", "()Ljava/lang/Integer;", "setColorOn", "(Ljava/lang/Integer;)V", "", "trackTintColors", "[I", "thumbTintColors", "Landroid/content/res/ColorStateList;", "getThumbTintList$div_release", "()Landroid/content/res/ColorStateList;", "getThumbTintList$div_release$annotations", "thumbTintList", "getTrackTintList$div_release", "getTrackTintList$div_release$annotations", "trackTintList", "isChecked", "setChecked", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SwitchView extends FrameLayout {

    @NotNull
    private static final int[] CHECKED;

    @NotNull
    private static final int[] DEFAULT;

    @NotNull
    private static final int[] DISABLED;

    @NotNull
    private static final int[][] STATES_ARRAY;

    @Nullable
    private Integer colorOn;

    @NotNull
    private final SwitchCompat switch;

    @NotNull
    private final int[] thumbTintColors;

    @NotNull
    private final int[] trackTintColors;

    static {
        int[] iArr = {-16842910};
        DISABLED = iArr;
        int[] iArr2 = {R.attr.state_checked};
        CHECKED = iArr2;
        int[] iArr3 = new int[0];
        DEFAULT = iArr3;
        STATES_ARRAY = new int[][]{iArr, iArr2, iArr3};
    }

    public SwitchView(@NotNull Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context);
        this.switch = switchCompat;
        this.trackTintColors = new int[3];
        this.thumbTintColors = new int[3];
        switchCompat.setShowText(false);
        switchCompat.setBackground(NoOpDrawable.INSTANCE);
        addView(switchCompat, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68146b.forwardClicksToSwitch();
            }
        });
        fillDefaultColors();
        updateTints();
    }

    private final int applyAlpha(int i10, float f10) {
        return setAlpha(i10, (int) (Color.alpha(i10) * f10));
    }

    private final void changeTints() {
        Integer num = this.colorOn;
        if (num != null) {
            int iIntValue = num.intValue();
            this.thumbTintColors[1] = iIntValue;
            this.trackTintColors[1] = applyAlpha(iIntValue, 0.3f);
            updateTints();
        }
    }

    private final void fillDefaultColors() {
        TypedValue typedValue = new TypedValue();
        int colorFromTheme = getColorFromTheme(R.attr.colorForeground, typedValue, false);
        int colorFromTheme2 = getColorFromTheme(R.attr.colorControlActivated, typedValue, false);
        int colorFromTheme3 = getColorFromTheme(androidx.appcompat.R.attr.colorSwitchThumbNormal, typedValue, true);
        this.trackTintColors[1] = applyAlpha(colorFromTheme2, 0.3f);
        this.trackTintColors[2] = setAlpha(colorFromTheme, 0.3f);
        this.trackTintColors[0] = setAlpha(colorFromTheme, 0.1f);
        int[] iArr = this.thumbTintColors;
        iArr[1] = colorFromTheme2;
        iArr[2] = colorFromTheme3;
        iArr[0] = lightenColor(colorFromTheme3, 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardClicksToSwitch() {
        if (isEnabled()) {
            this.switch.performClick();
        }
    }

    private final int getColorFromTheme(int resId, TypedValue typedValue, boolean outputIsResource) {
        if (getContext().getTheme().resolveAttribute(resId, typedValue, true)) {
            return (!outputIsResource || typedValue.resourceId == 0) ? typedValue.data : ContextCompat.getColor(getContext(), typedValue.resourceId);
        }
        return 0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }

    private final int lightenColor(int i10, float f10) {
        return ColorUtils.blendARGB(i10, -1, f10);
    }

    private final int setAlpha(int i10, int i11) {
        return Color.argb(i11, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChangeListener$lambda$2(Function1 function1, CompoundButton compoundButton, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
    }

    private final void updateTints() {
        SwitchCompat switchCompat = this.switch;
        int[][] iArr = STATES_ARRAY;
        switchCompat.setTrackTintList(new ColorStateList(iArr, this.trackTintColors));
        this.switch.setThumbTintList(new ColorStateList(iArr, this.thumbTintColors));
    }

    @Nullable
    public final Integer getColorOn() {
        return this.colorOn;
    }

    @Nullable
    public final ColorStateList getThumbTintList$div_release() {
        return this.switch.getThumbTintList();
    }

    @Nullable
    public final ColorStateList getTrackTintList$div_release() {
        return this.switch.getTrackTintList();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.switch.isEnabled();
    }

    public final void setChecked(boolean z10) {
        this.switch.setChecked(z10);
    }

    public final void setColorOn(@Nullable Integer num) {
        this.colorOn = num;
        changeTints();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.switch.setEnabled(enabled);
    }

    public final void setOnCheckedChangeListener(@NotNull final Function1<? super Boolean, Unit> listener) {
        this.switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.div.internal.widget.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                SwitchView.setOnCheckedChangeListener$lambda$2(listener, compoundButton, z10);
            }
        });
    }

    private final int setAlpha(int i10, float f10) {
        return setAlpha(i10, (int) (f10 * 255));
    }
}
