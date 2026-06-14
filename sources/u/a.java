package u;

import java.io.File;
import y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f105177a;

    public a(boolean z10) {
        this.f105177a = z10;
    }

    @Override // u.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(File file, m mVar) {
        if (!this.f105177a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
