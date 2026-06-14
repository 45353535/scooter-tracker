package w9;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
public interface s {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f107747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f107748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f107749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f107750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f107751f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f107746a = i10;
            this.f107747b = i11;
            this.f107748c = i12;
            this.f107749d = z10;
            this.f107750e = z11;
            this.f107751f = i13;
        }
    }

    public interface d {
        void b(a aVar);

        void c(a aVar);

        void onAudioCapabilitiesChanged();

        void onAudioSinkError(Exception exc);

        void onOffloadBufferEmptying();

        void onOffloadBufferFull();

        void onPositionAdvancing(long j10);

        void onPositionDiscontinuity();

        void onSilenceSkipped();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onUnderrun(int i10, long j10, long j11);
    }

    public static final class e extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f107756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f107757c;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f107756b = j10;
            this.f107757c = j11;
        }
    }

    public static final class f extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f107758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f107759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f107760d;

        public f(int i10, io.bidmachine.media3.common.a aVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f107759c = z10;
            this.f107758b = i10;
            this.f107760d = aVar;
        }
    }

    boolean a(io.bidmachine.media3.common.a aVar);

    void b(n9.z zVar);

    long c();

    w9.d d(io.bidmachine.media3.common.a aVar);

    void disableTunneling();

    void e(c2 c2Var);

    void enableTunnelingV21();

    void f(q9.h hVar);

    void flush();

    void g(n9.d dVar);

    long getCurrentPositionUs(boolean z10);

    n9.z getPlaybackParameters();

    int h(io.bidmachine.media3.common.a aVar);

    boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10);

    void handleDiscontinuity();

    boolean hasPendingData();

    void i(d dVar);

    boolean isEnded();

    void j(io.bidmachine.media3.common.a aVar, int i10, int[] iArr);

    void k(n9.c cVar);

    void pause();

    void play();

    void playToEndOfStream();

    void release();

    void reset();

    void setAudioSessionId(int i10);

    void setOffloadDelayPadding(int i10, int i11);

    void setOffloadMode(int i10);

    void setOutputStreamOffsetUs(long j10);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setSkipSilenceEnabled(boolean z10);

    void setVolume(float f10);

    public static final class b extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f107752b;

        public b(Throwable th2, io.bidmachine.media3.common.a aVar) {
            super(th2);
            this.f107752b = aVar;
        }

        public b(String str, io.bidmachine.media3.common.a aVar) {
            super(str);
            this.f107752b = aVar;
        }
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f107753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f107754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f107755d;

        public c(String str, int i10, io.bidmachine.media3.common.a aVar, boolean z10, Throwable th2) {
            super(str, th2);
            this.f107753b = i10;
            this.f107754c = z10;
            this.f107755d = aVar;
        }

        public c(int i10, int i11, int i12, int i13, io.bidmachine.media3.common.a aVar, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(aVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, aVar, z10, exc);
        }
    }
}
