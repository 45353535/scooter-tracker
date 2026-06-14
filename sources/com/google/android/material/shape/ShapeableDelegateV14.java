package com.google.android.material.shape;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
class ShapeableDelegateV14 extends ShapeableDelegate {
    @Override // com.google.android.material.shape.ShapeableDelegate
    void a(View view) {
        if (this.f27598c == null || this.f27599d.isEmpty() || !c()) {
            return;
        }
        view.invalidate();
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean c() {
        return true;
    }
}
