package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class e51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110208a;

    public e51(Context context) {
        this.f110208a = context;
    }

    public final File a() {
        File file = new File(this.f110208a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
