package yads;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.CheckBox;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m43 extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f113319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f113320b;

    public m43(@NotNull Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f113319a);
        stateListDrawable.addState(new int[0], this.f113320b);
        setBackground(stateListDrawable);
    }

    public final void setCheckedIcon(@NotNull Drawable drawable) {
        this.f113319a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f113319a);
        stateListDrawable.addState(new int[0], this.f113320b);
        setBackground(stateListDrawable);
    }

    public final void setUncheckedIcon(@NotNull Drawable drawable) {
        this.f113320b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f113319a);
        stateListDrawable.addState(new int[0], this.f113320b);
        setBackground(stateListDrawable);
    }
}
