package sg.bigo.ads.controller.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.common.form.a;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.controller.landing.e;

/* JADX INFO: loaded from: classes4.dex */
public class AdFormActivity extends Activity implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private c<?, ?> f103675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f103677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f103678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f103679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f103680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private sg.bigo.ads.common.form.c f103681g;

    @NonNull
    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AdFormActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if ((currentFocus instanceof EditText) && !u.a(currentFocus, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentFocus.clearFocus();
                try {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                } catch (Throwable unused) {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f103678d) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156 A[PHI: r17
  0x0156: PHI (r17v20 android.widget.FrameLayout) = 
  (r17v1 android.widget.FrameLayout)
  (r17v2 android.widget.FrameLayout)
  (r17v3 android.widget.FrameLayout)
  (r17v4 android.widget.FrameLayout)
  (r17v5 android.widget.FrameLayout)
  (r17v6 android.widget.FrameLayout)
  (r17v7 android.widget.FrameLayout)
  (r17v8 android.widget.FrameLayout)
  (r17v9 android.widget.FrameLayout)
  (r17v10 android.widget.FrameLayout)
  (r17v11 android.widget.FrameLayout)
  (r17v12 android.widget.FrameLayout)
  (r17v13 android.widget.FrameLayout)
  (r17v14 android.widget.FrameLayout)
  (r17v15 android.widget.FrameLayout)
  (r17v16 android.widget.FrameLayout)
  (r17v18 android.widget.FrameLayout)
  (r17v21 android.widget.FrameLayout)
 binds: [B:73:0x0152, B:70:0x0147, B:67:0x013b, B:64:0x0131, B:61:0x0126, B:58:0x011a, B:55:0x0110, B:52:0x0106, B:49:0x00fb, B:46:0x00ed, B:118:?, B:117:?, B:116:?, B:115:?, B:114:?, B:113:?, B:112:?, B:22:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(@androidx.annotation.Nullable android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.form.AdFormActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    @CallSuper
    public void onDestroy() {
        sg.bigo.ads.common.form.c cVar;
        b bVar;
        super.onDestroy();
        try {
            if (this.f103675a != null && (cVar = this.f103681g) != null && (bVar = cVar.f102355a) != null) {
                Map<String, Object> mapA = a.a(bVar.f102388b, bVar.f102389c.b(), bVar.f102389c.a());
                boolean z10 = this.f103678d;
                if (!z10) {
                    a.a(this.f103677c, mapA);
                } else if (z10) {
                    a.a(this.f103677c, 3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a() {
        this.f103678d = true;
        c<?, ?> cVar = this.f103675a;
        if (cVar != null) {
            cVar.f100343j = true;
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        e.a(this, this, str, this.f103675a);
    }
}
