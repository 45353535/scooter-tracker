package com.google.android.material.button;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialSplitButton extends MaterialButtonGroup {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f25774m = R.style.Widget_Material3_MaterialSplitButton;

    public MaterialSplitButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i10, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            if (Build.VERSION.SDK_INT >= 30) {
                materialButton.setStateDescription(getResources().getString(materialButton.isChecked() ? R.string.mtrl_button_expanded_content_description : R.string.mtrl_button_collapsed_content_description));
                materialButton.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() { // from class: com.google.android.material.button.e
                    @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
                    public final void onCheckedChanged(MaterialButton materialButton2, boolean z10) {
                        materialButton2.setStateDescription(this.f25778a.getResources().getString(z10 ? R.string.mtrl_button_expanded_content_description : R.string.mtrl_button_collapsed_content_description));
                    }
                });
            }
        }
    }

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSplitButtonStyle);
    }

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, f25774m), attributeSet, i10);
    }
}
