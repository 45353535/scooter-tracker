package yads;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sv extends nh3 {
    public sv(TextView textView) {
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
        TextView textView = (TextView) view;
        qv qvVar = (qv) obj;
        if (pv.f114792b == qvVar.f115174a) {
            textView.setText(qvVar.f115175b);
        }
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        TextView textView = (TextView) view;
        qv qvVar = (qv) obj;
        if (pv.f114792b == qvVar.f115174a) {
            return Intrinsics.areEqual(textView.getText().toString(), qvVar.f115175b);
        }
        return true;
    }
}
