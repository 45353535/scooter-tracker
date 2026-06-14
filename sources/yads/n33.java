package yads;

import android.view.View;
import android.widget.TextView;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class n33 extends nh3 {
    public n33(TextView textView) {
        super(textView);
    }

    @Override // yads.nh3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.nh3
    public final void b(View view, Object obj) {
        ((TextView) view).setText((String) obj);
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        String str = (String) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return StringsKt.N(String.valueOf(text), str, true);
        }
        return false;
    }
}
