package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(33)
class ShapeableDelegateV33 extends ShapeableDelegate {
    ShapeableDelegateV33(View view) {
        e(view);
    }

    @DoNotInline
    private void e(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV33.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                if (ShapeableDelegateV33.this.f27600e.isEmpty()) {
                    return;
                }
                outline.setPath(ShapeableDelegateV33.this.f27600e);
            }
        });
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void a(View view) {
        view.setClipToOutline(!c());
        if (c()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean c() {
        return this.f27596a;
    }
}
