package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class cg0 {
    public static File a(Context context, String str) {
        return new File(context.getCacheDir().getPath() + File.separator + str);
    }
}
