package yads;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bg {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean a(TextView textView) {
        return ((Boolean) cg.a(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
