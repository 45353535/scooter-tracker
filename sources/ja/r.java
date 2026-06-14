package ja;

import ga.f0;
import java.util.List;
import n9.e0;
import n9.f0;

/* JADX INFO: loaded from: classes12.dex */
public interface r extends u {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f85680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f85681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85682c;

        public a(f0 f0Var, int... iArr) {
            this(f0Var, iArr, 0);
        }

        public a(f0 f0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                q9.u.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f85680a = f0Var;
            this.f85681b = iArr;
            this.f85682c = i10;
        }
    }

    public interface b {
        r[] a(a[] aVarArr, ka.e eVar, f0.b bVar, e0 e0Var);
    }

    void b(long j10, long j11, long j12, List list, ha.n[] nVarArr);

    boolean c(long j10, ha.e eVar, List list);

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List list);

    boolean excludeTrack(int i10, long j10);

    io.bidmachine.media3.common.a getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    boolean isTrackExcluded(int i10, long j10);

    void onDiscontinuity();

    void onPlayWhenReadyChanged(boolean z10);

    void onPlaybackSpeed(float f10);

    void onRebuffer();
}
