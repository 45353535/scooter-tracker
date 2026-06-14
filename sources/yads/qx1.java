package yads;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class qx1 implements ox1 {
    @Override // yads.ox1
    public final ProgressBar a(View view) {
        return (ProgressBar) view.findViewWithTag("close_progress_view");
    }

    @Override // yads.ox1
    public final View b(View view) {
        return view.findViewWithTag("skip_button");
    }

    @Override // yads.ox1
    public final View c(View view) {
        return view.findViewWithTag("close");
    }
}
