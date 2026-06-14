package w9;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import q9.o0;
import w9.b0;
import w9.s;

/* JADX INFO: loaded from: classes12.dex */
public class e0 implements b0.f {
    private AudioTrack b(s.a aVar, n9.c cVar, int i10) {
        return new AudioTrack(e(cVar, aVar.f107749d), o0.L(aVar.f107747b, aVar.f107748c, aVar.f107746a), aVar.f107751f, 1, i10);
    }

    private AudioTrack c(s.a aVar, n9.c cVar, int i10) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(cVar, aVar.f107749d)).setAudioFormat(o0.L(aVar.f107747b, aVar.f107748c, aVar.f107746a)).setTransferMode(1).setBufferSizeInBytes(aVar.f107751f).setSessionId(i10);
        if (o0.f98837a >= 29) {
            g(sessionId, aVar.f107750e);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(n9.c cVar, boolean z10) {
        return z10 ? f() : cVar.a().f95236a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }

    @Override // w9.b0.f
    public final AudioTrack a(s.a aVar, n9.c cVar, int i10) {
        return o0.f98837a >= 23 ? c(aVar, cVar, i10) : b(aVar, cVar, i10);
    }

    protected AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}
