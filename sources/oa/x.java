package oa;

import android.net.Uri;
import java.util.Map;
import lb.t;

/* JADX INFO: loaded from: classes12.dex */
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f96674a = new x() { // from class: oa.v
        @Override // oa.x
        public /* synthetic */ x a(t.a aVar) {
            return w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ x b(int i10) {
            return w.b(this, i10);
        }

        @Override // oa.x
        public final r[] createExtractors() {
            return w.e();
        }

        @Override // oa.x
        public /* synthetic */ x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ r[] createExtractors(Uri uri, Map map) {
            return w.a(this, uri, map);
        }
    };

    x a(t.a aVar);

    x b(int i10);

    r[] createExtractors();

    r[] createExtractors(Uri uri, Map map);

    x experimentalSetTextTrackTranscodingEnabled(boolean z10);
}
