package f9;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import b9.j;
import b9.k;

/* JADX INFO: loaded from: classes12.dex */
public class e extends b implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f71972f;

    public e(Context context) {
        super(context);
        this.f71972f = "%1.0fs";
    }

    @Override // f9.b, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setProgress(int i10) {
        setText(this.f71972f.replace("%1.0f", String.valueOf(i10)));
    }

    public void setRemaining(int i10) {
        setText(this.f71972f.replace("%1.0f", String.valueOf(i10)));
    }

    @Override // f9.b, b9.j
    public void setStyle(@NonNull k kVar) {
        super.setStyle(kVar);
        String strH = kVar.h();
        if (strH != null) {
            this.f71972f = strH;
        }
    }
}
