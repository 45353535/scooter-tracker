package sg.bigo.ads.common.p;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p.d;
import sg.bigo.ads.common.p.h;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static void a(Context context, @NonNull String str, boolean z10, g gVar) {
        a(context, null, str, z10, gVar);
    }

    public static void b(Context context, @Nullable Executor executor, @NonNull String str, boolean z10, g gVar) {
        d.a.f102674a.a(context, executor, str, z10, gVar);
    }

    private static void c(Context context, @Nullable Executor executor, @NonNull String str, boolean z10, g gVar) {
        h.a.f102684a.a(context, executor, str, z10, gVar);
    }

    public static void a(final Context context, @NonNull final List<String> list, final boolean z10, final g gVar) {
        if (list.size() == 0) {
            gVar.a(0, "urlList all download Failed", "");
        } else {
            a(context, list.remove(0), z10, new g() { // from class: sg.bigo.ads.common.p.e.1
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i10, @NonNull String str, String str2) {
                    e.a(context, (List<String>) list, z10, gVar);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.a(bitmap, fVar);
                    }
                }
            });
        }
    }

    public static void a(Context context, @Nullable Executor executor, @NonNull String str, boolean z10, g gVar) {
        c(context, executor, str, z10, gVar);
    }

    public static boolean a(Context context, String str) {
        return h.a.f102684a.d(context, str);
    }
}
