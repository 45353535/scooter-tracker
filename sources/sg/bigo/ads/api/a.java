package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.core.adview.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T extends sg.bigo.ads.core.adview.c> extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f102102a;

    public a(@NonNull Context context) {
        super(context);
    }

    @NonNull
    protected abstract T a();

    public final boolean a(int i10, int i11) {
        return getViewImpl().a(i10, i11);
    }

    @NonNull
    protected final synchronized T getViewImpl() {
        try {
            if (this.f102102a == null) {
                this.f102102a = (T) a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f102102a;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
