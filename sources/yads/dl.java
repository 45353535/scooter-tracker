package yads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes4.dex */
public final class dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f109957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioTimestamp f109958b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f109959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f109960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f109961e;

    public dl(AudioTrack audioTrack) {
        this.f109957a = audioTrack;
    }

    public final long a() {
        return this.f109958b.nanoTime / 1000;
    }

    public final boolean b() {
        boolean timestamp = this.f109957a.getTimestamp(this.f109958b);
        if (timestamp) {
            long j10 = this.f109958b.framePosition;
            if (this.f109960d > j10) {
                this.f109959c++;
            }
            this.f109960d = j10;
            this.f109961e = j10 + (this.f109959c << 32);
        }
        return timestamp;
    }
}
