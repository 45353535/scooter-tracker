package com.explorestack.iab.mraid;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

/* JADX INFO: loaded from: classes5.dex */
public class MraidDialogActivity extends MraidActivity {
    @Override // com.explorestack.iab.mraid.MraidActivity
    public void f(Window window) {
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // com.explorestack.iab.mraid.MraidActivity
    public void g() {
        int intExtra;
        Window window = getWindow();
        Intent intent = getIntent();
        if (window != null && (intExtra = intent.getIntExtra("param_status_bar_color", 0)) != 0) {
            window.setStatusBarColor(intExtra);
        }
        e2.g.g(this, intent.hasExtra("param_is_no_status_bar"));
    }
}
