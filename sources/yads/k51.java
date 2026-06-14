package yads;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class k51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e51 f112595b;

    public k51(Context context, e51 e51Var) {
        this.f112594a = context;
        this.f112595b = e51Var;
    }

    public final j51 a(String str) {
        try {
            File fileA = this.f112595b.a();
            File parentFile = fileA.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes.length >= freeSpace) {
                return new g51("Not enough space error");
            }
            uf.i.n(fileA, bytes);
            return new i51(FileProvider.getUriForFile(this.f112594a, this.f112594a.getPackageName() + ".monetization.ads.inspector.fileprovider", fileA));
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return new g51("Failed to save report");
        }
    }
}
