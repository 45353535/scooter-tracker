package com.bytedance.sdk.openadsdk.core.fs.lnr;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static final Set<String> qdl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.1
        {
            add("image/jpeg");
            add(MimeTypes.IMAGE_PNG);
            add(MimeTypes.IMAGE_BMP);
            add("image/gif");
            add("image/jpg");
        }
    };

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static Set<String> f17214ud = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.2
        {
            add("application/x-javascript");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fs.lnr.qdl$qdl, reason: collision with other inner class name */
    public enum EnumC0258qdl {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum ud {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    @NonNull
    public static Point qdl(Context context, int i10, int i11, ud udVar) {
        if (context == null) {
            context = yt.qdl();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iUd = ax.ud(context, i10);
        int iUd2 = ax.ud(context, i11);
        if (iUd > width || iUd2 > height) {
            Point point2 = new Point();
            if (ud.HTML_RESOURCE == udVar) {
                point2.x = Math.min(width, iUd);
                point2.y = Math.min(height, iUd2);
            } else {
                float f10 = iUd;
                float f11 = f10 / width;
                float f12 = iUd2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 >= 0 && point2.y >= 0) {
                point2.x = ax.lnr(context, i12);
                point2.y = ax.lnr(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
