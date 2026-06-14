package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public final class hj implements ni1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23 f111603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23 f111604b;

    public hj(final int i10) {
        this(new k23() { // from class: yads.x7
            @Override // yads.k23
            public final Object get() {
                return hj.a(i10);
            }
        }, new k23() { // from class: yads.y7
            @Override // yads.k23
            public final Object get() {
                return hj.b(i10);
            }
        });
    }

    @Override // yads.ni1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ij a(mi1 mi1Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = mi1Var.f113509a.f116659a;
        ij ijVar = null;
        try {
            q43.a("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                ij ijVar2 = new ij(mediaCodecCreateByCodecName, (HandlerThread) this.f111603a.get(), (HandlerThread) this.f111604b.get(), false);
                try {
                    q43.a();
                    ijVar2.a(mi1Var.f113510b, mi1Var.f113512d, mi1Var.f113513e);
                    return ijVar2;
                } catch (Exception e10) {
                    e = e10;
                    ijVar = ijVar2;
                    if (ijVar != null) {
                        ijVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    public hj(k23 k23Var, k23 k23Var2) {
        this.f111603a = k23Var;
        this.f111604b = k23Var2;
    }

    public static HandlerThread a(int i10) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }

    public static HandlerThread b(int i10) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }
}
