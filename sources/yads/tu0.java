package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class tu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f116388a;

    public tu0(Context context) {
        this.f116388a = context;
    }

    public final Typeface a(ev0 ev0Var) {
        try {
            File fileB = b(ev0Var);
            if (fileB.exists()) {
                return Typeface.createFromFile(fileB);
            }
            return null;
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }

    public final File b(ev0 ev0Var) {
        return new File(new File(this.f116388a.getFilesDir(), "downloaded_fonts"), s13.a(ev0Var.name() + ".ttf"));
    }
}
