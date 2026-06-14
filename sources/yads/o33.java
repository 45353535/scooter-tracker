package yads;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class o33 extends Spannable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f114184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114186c;

    public o33(Drawable drawable, int i10, int i11) {
        this.f114184a = drawable;
        this.f114185b = i10;
        this.f114186c = i11;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f114184a != null && this.f114185b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f114184a;
            int i10 = this.f114185b;
            drawable.setBounds(0, 0, i10, i10);
            ie ieVar = new ie(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i11 = this.f114186c;
            colorDrawable.setBounds(0, 0, i11, i11);
            ie ieVar2 = new ie(colorDrawable);
            spannableStringBuilder.setSpan(ieVar, 0, 1, 33);
            spannableStringBuilder.setSpan(ieVar2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
