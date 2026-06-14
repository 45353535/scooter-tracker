package f1;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f69700a;

    public e4(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f69700a = resources;
    }

    public final String a(int i10) {
        try {
            InputStream inputStreamOpenRawResource = this.f69700a.openRawResource(i10);
            try {
                Intrinsics.checkNotNull(inputStreamOpenRawResource);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
                try {
                    String strI = uf.r.i(bufferedReader);
                    uf.c.a(bufferedReader, null);
                    uf.c.a(inputStreamOpenRawResource, null);
                    return strI;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            eg.i("Raw resource file exception", e10);
            return null;
        }
    }
}
