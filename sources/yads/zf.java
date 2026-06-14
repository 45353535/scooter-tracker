package yads;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class zf extends bg {
    @Override // yads.bg
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) cg.a(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
