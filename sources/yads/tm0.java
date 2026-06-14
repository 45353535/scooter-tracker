package yads;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class tm0 implements bf3, rs, yc2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bf3 f116301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rs f116302c;

    @Override // yads.yc2
    public final void a(int i10, Object obj) {
        if (i10 == 7) {
            this.f116301b = (bf3) obj;
        } else if (i10 == 8) {
            this.f116302c = (rs) obj;
        } else {
            if (i10 != 10000) {
                return;
            }
            androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        }
    }

    @Override // yads.rs
    public final void a(long j10, float[] fArr) {
        rs rsVar = this.f116302c;
        if (rsVar != null) {
            rsVar.a(j10, fArr);
        }
    }

    @Override // yads.rs
    public final void a() {
        rs rsVar = this.f116302c;
        if (rsVar != null) {
            rsVar.a();
        }
    }

    @Override // yads.bf3
    public final void a(long j10, long j11, yv0 yv0Var, MediaFormat mediaFormat) {
        bf3 bf3Var = this.f116301b;
        if (bf3Var != null) {
            bf3Var.a(j10, j11, yv0Var, mediaFormat);
        }
    }
}
