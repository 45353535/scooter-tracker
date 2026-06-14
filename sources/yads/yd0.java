package yads;

import android.content.Context;
import android.os.Handler;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f118157a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f118160d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0 f118158b = new od0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f118159c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final aj1 f118161e = aj1.f108703a;

    public yd0(Context context) {
        this.f118157a = context;
    }

    public final jo[] a(Handler handler, sm0 sm0Var, sm0 sm0Var2, sm0 sm0Var3, sm0 sm0Var4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Constructor<?> constructor;
        Object[] objArr;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        ArrayList arrayList = new ArrayList();
        Context context = this.f118157a;
        int i16 = this.f118159c;
        arrayList.add(new nj1(context, this.f118158b, this.f118161e, this.f118160d, handler, sm0Var));
        if (i16 == 0) {
            i10 = 3;
        } else {
            int size = arrayList.size();
            if (i16 == 2) {
                size--;
            }
            try {
                try {
                    i11 = 50;
                    try {
                        i10 = 3;
                        try {
                            i12 = size + 1;
                        } catch (ClassNotFoundException unused) {
                        }
                    } catch (ClassNotFoundException unused2) {
                        i10 = 3;
                    }
                    try {
                        arrayList.add(size, (jo) Class.forName("com.monetization.ads.exo.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, lg3.class, cls).newInstance(5000L, handler, sm0Var, 50));
                        uf1.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        size = i12;
                        i12 = size;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating VP9 extension", e10);
                }
            } catch (ClassNotFoundException unused4) {
                i10 = 3;
                i11 = 50;
            }
            try {
                Class<?> cls3 = Class.forName("com.monetization.ads.exo.ext.av1.Libgav1VideoRenderer");
                Class<?>[] clsArr = new Class[4];
                clsArr[0] = cls2;
                clsArr[1] = Handler.class;
                clsArr[2] = lg3.class;
                clsArr[i10] = cls;
                Constructor<?> constructor2 = cls3.getConstructor(clsArr);
                Integer numValueOf = Integer.valueOf(i11);
                Object[] objArr2 = new Object[4];
                objArr2[0] = 5000L;
                objArr2[1] = handler;
                objArr2[2] = sm0Var;
                objArr2[i10] = numValueOf;
                arrayList.add(i12, (jo) constructor2.newInstance(objArr2));
                uf1.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating AV1 extension", e11);
            }
        }
        Context context2 = this.f118157a;
        db0 db0Var = new db0();
        mk mkVarA = mk.a(context2);
        mkVarA.getClass();
        db0Var.f109867a = mkVarA;
        db0Var.f109869c = false;
        db0Var.f109870d = false;
        db0Var.f109871e = 0;
        if (db0Var.f109868b == null) {
            db0Var.f109868b = new fb0(new tk[0], new gw2(0), new pz2());
        }
        mb0 mb0Var = new mb0(db0Var);
        Context context3 = this.f118157a;
        int i17 = this.f118159c;
        arrayList.add(new ri1(context3, this.f118158b, this.f118161e, this.f118160d, handler, sm0Var2, mb0Var));
        if (i17 != 0) {
            int size2 = arrayList.size();
            if (i17 == 2) {
                size2--;
            }
            try {
                try {
                    i13 = size2 + 1;
                    try {
                        arrayList.add(size2, (jo) Class.forName("com.monetization.ads.exo.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        uf1.c("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused6) {
                        size2 = i13;
                        i13 = size2;
                    }
                } catch (ClassNotFoundException unused7) {
                }
                try {
                    try {
                        Class<?> cls4 = Class.forName("com.monetization.ads.exo.ext.opus.LibopusAudioRenderer");
                        int i18 = i10;
                        Class<?>[] clsArr2 = new Class[i18];
                        clsArr2[0] = Handler.class;
                        clsArr2[1] = vk.class;
                        clsArr2[2] = bl.class;
                        constructor = cls4.getConstructor(clsArr2);
                        objArr = new Object[i18];
                        objArr[0] = handler;
                        objArr[1] = sm0Var2;
                        objArr[2] = mb0Var;
                        i14 = i13 + 1;
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating Opus extension", e12);
                    }
                } catch (ClassNotFoundException unused8) {
                }
                try {
                    arrayList.add(i13, (jo) constructor.newInstance(objArr));
                    uf1.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused9) {
                    i13 = i14;
                    i14 = i13;
                }
                try {
                    try {
                        i15 = i14 + 1;
                    } catch (ClassNotFoundException unused10) {
                    }
                    try {
                        arrayList.add(i14, (jo) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, vk.class, bl.class).newInstance(handler, sm0Var2, mb0Var));
                        uf1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused11) {
                        i14 = i15;
                        i15 = i14;
                    }
                    try {
                        arrayList.add(i15, (jo) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, vk.class, bl.class).newInstance(handler, sm0Var2, mb0Var));
                        uf1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused12) {
                    } catch (Exception e13) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e13);
                    }
                } catch (Exception e14) {
                    throw new RuntimeException("Error instantiating FLAC extension", e14);
                }
            } catch (Exception e15) {
                throw new RuntimeException("Error instantiating MIDI extension", e15);
            }
        }
        arrayList.add(new m33(sm0Var3, handler.getLooper()));
        arrayList.add(new kr1(sm0Var4, handler.getLooper()));
        arrayList.add(new ss());
        return (jo[]) arrayList.toArray(new jo[0]);
    }
}
