package w9;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import q9.o0;
import w9.b0;
import w9.d;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements b0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f107802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f107803b;

    private static final class a {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? d.f107666d : new d.b().e(true).g(z10).d();
        }
    }

    private static final class b {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return d.f107666d;
            }
            return new d.b().e(true).f(o0.f98837a > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public w(Context context) {
        this.f107802a = context;
    }

    private boolean b(Context context) {
        Boolean bool = this.f107803b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = o9.d.c(context).getParameters("offloadVariableRateSupported");
            this.f107803b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f107803b = Boolean.FALSE;
        }
        return this.f107803b.booleanValue();
    }

    @Override // w9.b0.d
    public d a(io.bidmachine.media3.common.a aVar, n9.c cVar) {
        q9.a.e(aVar);
        q9.a.e(cVar);
        int i10 = o0.f98837a;
        if (i10 < 29 || aVar.F == -1) {
            return d.f107666d;
        }
        boolean zB = b(this.f107802a);
        int iF = n9.w.f((String) q9.a.e(aVar.f80561o), aVar.f80557k);
        if (iF == 0 || i10 < o0.K(iF)) {
            return d.f107666d;
        }
        int iM = o0.M(aVar.E);
        if (iM == 0) {
            return d.f107666d;
        }
        try {
            AudioFormat audioFormatL = o0.L(aVar.F, iM, iF);
            return i10 >= 31 ? b.a(audioFormatL, cVar.a().f95236a, zB) : a.a(audioFormatL, cVar.a().f95236a, zB);
        } catch (IllegalArgumentException unused) {
            return d.f107666d;
        }
    }
}
