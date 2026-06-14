package yads;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ag extends zf {
    @Override // yads.zf, yads.bg
    public final void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // yads.bg
    public final boolean a(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
