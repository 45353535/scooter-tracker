package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
class BoringLayoutConstructor33 {
    private BoringLayoutConstructor33() {
    }

    @NonNull
    public static BoringLayout create(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i10, @NonNull Layout.Alignment alignment, float f10, float f11, @NonNull BoringLayout.Metrics metrics, boolean z10, @Nullable TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i11, boolean z11) {
        return a.a(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }
}
