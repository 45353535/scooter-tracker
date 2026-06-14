package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ImageView {
    public c(@NonNull Context context, String str) {
        super(context);
        try {
            if (q.a((CharSequence) str)) {
                return;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray == null) {
                return;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeByteArray);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
            setBackground(bitmapDrawable);
            setClickable(false);
            setFocusable(false);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, ViewGroup viewGroup, @Nullable c cVar) {
        View viewA = viewGroup;
        if (cVar == null || context == null) {
            return;
        }
        if (viewGroup == null) {
            viewA = u.a(context, (View) null);
        }
        if (viewA instanceof ViewGroup) {
            u.a(cVar, (ViewGroup) viewA, new ViewGroup.LayoutParams(-1, -1), -1);
            cVar.bringToFront();
        }
    }
}
