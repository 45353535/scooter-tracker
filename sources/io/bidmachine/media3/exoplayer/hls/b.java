package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f80943a;

    class a extends LinkedHashMap {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f80944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f80944b = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f80944b;
        }
    }

    public b(int i10) {
        this.f80943a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f80943a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f80943a.put((Uri) q9.a.e(uri), (byte[]) q9.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f80943a.remove(q9.a.e(uri));
    }
}
