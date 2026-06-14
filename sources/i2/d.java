package i2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class d extends b implements e2.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f73924f;

    public d(Context context) {
        super(context);
        this.f73924f = "%1.0fs";
    }

    @Override // i2.b, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setProgress(int i10) {
        setText(this.f73924f.replace("%1.0f", String.valueOf(i10)));
    }

    public void setRemaining(int i10) {
        setText(this.f73924f.replace("%1.0f", String.valueOf(i10)));
    }

    @Override // i2.b, e2.d
    public void setStyle(@NonNull e2.e eVar) {
        super.setStyle(eVar);
        String strH = eVar.h();
        if (strH != null) {
            this.f73924f = strH;
        }
    }
}
