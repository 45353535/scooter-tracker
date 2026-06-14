package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class ml2 {
    public static void a(r52 r52Var, pl2 pl2Var, Bitmap bitmap) {
        pl2Var.setAlpha(0.0f);
        pl2Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new ll2(pl2Var, bitmap)).withEndAction(new kl2(r52Var, pl2Var)).start();
    }
}
