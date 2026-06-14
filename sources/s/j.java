package s;

import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.coroutines.Continuation;
import q.q;
import s.i;
import vh.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f99513a;

    public static final class a implements i.a {
        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(File file, y.m mVar, o.e eVar) {
            return new j(file);
        }
    }

    public j(File file) {
        this.f99513a = file;
    }

    @Override // s.i
    public Object a(Continuation continuation) {
        return new m(q.d(c0.a.d(c0.f106805c, this.f99513a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(uf.i.y(this.f99513a)), q.f.DISK);
    }
}
