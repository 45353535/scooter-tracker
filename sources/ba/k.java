package ba;

import android.net.Uri;
import ga.n0;
import java.io.IOException;
import ka.m;

/* JADX INFO: loaded from: classes12.dex */
public interface k {

    public interface a {
        k a(aa.d dVar, m mVar, j jVar, ka.f fVar);
    }

    public interface b {
        boolean d(Uri uri, m.c cVar, boolean z10);

        void onPlaylistChanged();
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f6136b;

        public c(Uri uri) {
            this.f6136b = uri;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f6137b;

        public d(Uri uri) {
            this.f6137b = uri;
        }
    }

    public interface e {
        void d(f fVar);
    }

    void a(b bVar);

    void b(Uri uri, n0.a aVar, e eVar);

    void c(b bVar);

    void deactivatePlaylistForPlayback(Uri uri);

    boolean excludeMediaPlaylist(Uri uri, long j10);

    long getInitialStartTimeUs();

    g getMultivariantPlaylist();

    f getPlaylistSnapshot(Uri uri, boolean z10);

    boolean isLive();

    boolean isSnapshotValid(Uri uri);

    void maybeThrowPlaylistRefreshError(Uri uri);

    void maybeThrowPrimaryPlaylistRefreshError();

    void refreshPlaylist(Uri uri);

    void stop();
}
