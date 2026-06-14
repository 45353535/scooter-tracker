package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class mml {

    private static class qdl implements View.OnLayoutChangeListener {
        private int lnr;
        private final Drawable qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private int f17879ud;

        public qdl(Drawable drawable) {
            this.qdl = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.f17879ud && i19 == this.lnr) {
                return;
            }
            this.f17879ud = i18;
            this.lnr = i19;
            this.qdl.setBounds(0, 0, i18, i19);
        }
    }

    public static void qdl(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (viewGroup == null || ljhVar == null || TextUtils.isEmpty(ljhVar.uw())) {
            return;
        }
        try {
            int i10 = jtx.rdz;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable drawableQdl = qdl(viewGroup.getResources(), ljhVar);
            if (drawableQdl == null) {
                return;
            }
            viewGroup.setForeground(drawableQdl);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("add overlay fail", th2.getMessage());
        }
    }

    public static void qdl(Activity activity, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (activity == null || ljhVar == null || TextUtils.isEmpty(ljhVar.uw())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = jtx.rdz;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable drawableQdl = qdl(activity.getResources(), ljhVar);
            if (drawableQdl == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableQdl);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("add overlay fail", th2.getMessage());
        }
    }

    @Nullable
    private static Drawable qdl(Resources resources, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        try {
            String strUw = ljhVar.uw();
            if (TextUtils.isEmpty(strUw)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strUw, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
