package u9;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ca.c;
import da.n;
import io.bidmachine.media3.exoplayer.i2;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import ma.j;
import w9.b0;

/* JADX INFO: loaded from: classes12.dex */
public class d implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final da.i f105297b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f105300e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f105302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f105303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f105304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f105305j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f105298c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f105299d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private da.x f105301f = da.x.f68600a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f105306k = -9223372036854775807L;

    public d(Context context) {
        this.f105296a = context;
        this.f105297b = new da.i(context);
    }

    @Override // u9.l0
    public i2[] a(Handler handler, ma.f0 f0Var, w9.q qVar, ia.h hVar, ea.b bVar) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        k(this.f105296a, this.f105298c, this.f105301f, this.f105300e, handler, f0Var, this.f105299d, arrayList);
        w9.s sVarD = d(this.f105296a, this.f105302g, this.f105303h);
        if (sVarD != null) {
            handler2 = handler;
            c(this.f105296a, this.f105298c, this.f105301f, this.f105300e, sVarD, handler2, qVar, arrayList);
        } else {
            handler2 = handler;
        }
        j(this.f105296a, hVar, handler2.getLooper(), this.f105298c, arrayList);
        g(this.f105296a, bVar, handler2.getLooper(), this.f105298c, arrayList);
        e(this.f105296a, this.f105298c, arrayList);
        f(arrayList);
        h(this.f105296a, handler2, this.f105298c, arrayList);
        return (i2[]) arrayList.toArray(new i2[0]);
    }

    @Override // u9.l0
    public i2 b(i2 i2Var, Handler handler, ma.f0 f0Var, w9.q qVar, ia.h hVar, ea.b bVar) {
        if (i2Var.getTrackType() == 2) {
            return i(i2Var, this.f105296a, this.f105298c, this.f105301f, this.f105300e, handler, f0Var, this.f105299d);
        }
        return null;
    }

    protected void c(Context context, int i10, da.x xVar, boolean z10, w9.s sVar, Handler handler, w9.q qVar, ArrayList arrayList) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        arrayList.add(new w9.f0(context, l(), xVar, z10, handler, qVar, sVar));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (Exception e10) {
                throw new IllegalStateException("Error instantiating MIDI extension", e10);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (i2) Class.forName("io.bidmachine.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, w9.q.class, w9.s.class).newInstance(context, handler, qVar, sVar));
            q9.u.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i11;
            i11 = size;
        }
        try {
            try {
                i12 = i11 + 1;
            } catch (ClassNotFoundException unused3) {
            }
            try {
                arrayList.add(i11, (i2) Class.forName("io.bidmachine.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, w9.q.class, w9.s.class).newInstance(handler, qVar, sVar));
                q9.u.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused4) {
                i11 = i12;
                i12 = i11;
            }
            try {
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (i2) Class.forName("io.bidmachine.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, w9.q.class, w9.s.class).newInstance(handler, qVar, sVar));
                        q9.u.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i12 = i13;
                        i13 = i12;
                    }
                } catch (Exception e11) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e11);
                }
            } catch (ClassNotFoundException unused6) {
            }
            try {
                try {
                    i14 = i13 + 1;
                    try {
                        arrayList.add(i13, (i2) Class.forName("io.bidmachine.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, w9.q.class, w9.s.class).newInstance(handler, qVar, sVar));
                        q9.u.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        i13 = i14;
                        i14 = i13;
                    }
                } catch (ClassNotFoundException unused8) {
                }
                try {
                    try {
                        i15 = i14 + 1;
                        try {
                            arrayList.add(i14, (i2) Class.forName("io.bidmachine.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, w9.q.class, w9.s.class).newInstance(context, handler, qVar, sVar));
                            q9.u.f("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                            i14 = i15;
                            i15 = i14;
                        }
                    } catch (ClassNotFoundException unused10) {
                    }
                    try {
                        arrayList.add(i15, (i2) Class.forName("io.bidmachine.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, w9.q.class, w9.s.class).newInstance(handler, qVar, sVar));
                        q9.u.f("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    } catch (ClassNotFoundException unused11) {
                    } catch (Exception e12) {
                        throw new IllegalStateException("Error instantiating MPEG-H extension", e12);
                    }
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating IAMF extension", e13);
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating FFmpeg extension", e14);
            }
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating Opus extension", e15);
        }
    }

    protected w9.s d(Context context, boolean z10, boolean z11) {
        return new b0.g(context).l(z10).k(z11).j();
    }

    protected void e(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new na.b());
    }

    protected void f(ArrayList arrayList) {
        arrayList.add(new ca.f(m(), null));
    }

    protected void g(Context context, ea.b bVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new ea.c(bVar, looper));
        arrayList.add(new ea.c(bVar, looper));
    }

    protected i2 i(i2 i2Var, Context context, int i10, da.x xVar, boolean z10, Handler handler, ma.f0 f0Var, long j10) {
        if (this.f105304i && i2Var.getClass() == ma.j.class) {
            return new j.d(context).q(l()).v(xVar).p(j10).r(z10).s(handler).t(f0Var).u(50).o(this.f105305j).n(this.f105306k).m();
        }
        return null;
    }

    protected void j(Context context, ia.h hVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new ia.i(hVar, looper));
    }

    protected void k(Context context, int i10, da.x xVar, boolean z10, Handler handler, ma.f0 f0Var, long j10, ArrayList arrayList) {
        String str;
        int i11;
        char c10;
        int i12;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        arrayList.add(new j.d(context).q(l()).v(xVar).p(j10).r(z10).s(handler).t(f0Var).u(50).o(this.f105305j).n(this.f105306k).m());
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (i2) Class.forName("io.bidmachine.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, ma.f0.class, cls).newInstance(Long.valueOf(j10), handler, f0Var, 50));
                    str = "DefaultRenderersFactory";
                } catch (ClassNotFoundException unused) {
                    str = "DefaultRenderersFactory";
                }
                try {
                    q9.u.f(str, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i11;
                    i11 = size;
                }
            } catch (ClassNotFoundException unused3) {
                str = "DefaultRenderersFactory";
            }
            try {
                try {
                    c10 = 1;
                    try {
                        i12 = i11 + 1;
                        try {
                            arrayList.add(i11, (i2) Class.forName("io.bidmachine.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, ma.f0.class, cls).newInstance(Long.valueOf(j10), handler, f0Var, 50));
                            q9.u.f(str, "Loaded Libgav1VideoRenderer.");
                        } catch (ClassNotFoundException unused4) {
                            i11 = i12;
                            i12 = i11;
                        }
                    } catch (ClassNotFoundException unused5) {
                    }
                } catch (ClassNotFoundException unused6) {
                    c10 = 1;
                }
                try {
                    Class<?> cls3 = Class.forName("io.bidmachine.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer");
                    Class<?>[] clsArr = new Class[4];
                    clsArr[0] = cls2;
                    clsArr[c10] = Handler.class;
                    clsArr[2] = ma.f0.class;
                    clsArr[3] = cls;
                    Constructor<?> constructor = cls3.getConstructor(clsArr);
                    Object[] objArr = new Object[4];
                    objArr[0] = Long.valueOf(j10);
                    objArr[c10] = handler;
                    objArr[2] = f0Var;
                    objArr[3] = 50;
                    arrayList.add(i12, (i2) constructor.newInstance(objArr));
                    q9.u.f(str, "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e10) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new IllegalStateException("Error instantiating VP9 extension", e12);
        }
    }

    protected n.b l() {
        return this.f105297b;
    }

    protected c.a m() {
        return c.a.f6622a;
    }

    protected void h(Context context, Handler handler, int i10, ArrayList arrayList) {
    }
}
