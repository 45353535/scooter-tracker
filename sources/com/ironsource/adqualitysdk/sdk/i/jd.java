package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class jd {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jd f2759;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jh f2760;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2761;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2764;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private HashMap<io, ir> f2763 = new HashMap<>();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f2762 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$2, reason: invalid class name */
    final class AnonymousClass2 extends ir {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ io f2766;

        AnonymousClass2(io ioVar) {
            this.f2766 = ioVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4564() {
            jd.this.f2763.remove(this.f2766);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$3, reason: invalid class name */
    final class AnonymousClass3 extends ir {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ io f2768;

        AnonymousClass3(io ioVar) {
            this.f2768 = ioVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4564() {
            jd.this.f2763.put(this.f2768, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.3.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    AnonymousClass3.this.f2768.mo6127();
                }
            });
            jd.m6909(jd.this);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$5, reason: invalid class name */
    final class AnonymousClass5 extends ir {
        AnonymousClass5() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4564() {
            if (jd.this.f2760 == null) {
                jd.this.f2760 = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo4672(Activity activity) {
                        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.5.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                final jd jdVar = jd.this;
                                t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo4564() {
                                        jd.m6900(jd.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo4673(Activity activity) {
                        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.5.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                jd.m6909(jd.this);
                            }
                        });
                    }
                };
                jd.this.f2762.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        jj.m6964().m6967(jd.this.f2760);
                        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.2.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                jd.m6909(jd.this);
                            }
                        });
                    }
                });
            }
        }
    }

    private jd() {
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ boolean m6900(jd jdVar) {
        jdVar.f2761 = false;
        return false;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ HashMap m6901(jd jdVar) {
        return new HashMap(jdVar.f2763);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6911(io ioVar) {
        t.m7279(new AnonymousClass2(ioVar));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jd m6903() {
        try {
            if (f2759 == null) {
                f2759 = new jd();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2759;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6909(jd jdVar) {
        if (jdVar.f2761 || new HashMap(jdVar.f2763).isEmpty()) {
            return;
        }
        jdVar.f2761 = true;
        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (!jd.this.f2761) {
                    jd.this.f2764 = null;
                    return;
                }
                HashMap mapM6901 = jd.m6901(jd.this);
                Iterator it = mapM6901.keySet().iterator();
                while (it.hasNext()) {
                    jd.this.f2762.post((Runnable) mapM6901.get((io) it.next()));
                }
                if (jd.this.f2764 == null) {
                    jd.this.f2764 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.4.5

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f2772 = 1;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f2773 = 0;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static long f2774 = -2943514433089080825L;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static char f2775;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f2776;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m6914(String str, char c10, String str2, int i10, String str3) {
                            String str4;
                            Object charArray = str3;
                            if (str3 != null) {
                                charArray = str3.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            Object charArray2 = str2;
                            if (str2 != null) {
                                charArray2 = str2.toCharArray();
                            }
                            char[] cArr2 = (char[]) charArray2;
                            Object charArray3 = str;
                            if (str != null) {
                                charArray3 = str.toCharArray();
                            }
                            char[] cArr3 = (char[]) charArray3;
                            synchronized (j.f2697) {
                                try {
                                    char[] cArr4 = (char[]) cArr.clone();
                                    char[] cArr5 = (char[]) cArr2.clone();
                                    cArr4[0] = (char) (c10 ^ cArr4[0]);
                                    cArr5[2] = (char) (cArr5[2] + ((char) i10));
                                    int length = cArr3.length;
                                    char[] cArr6 = new char[length];
                                    j.f2699 = 0;
                                    while (true) {
                                        int i11 = j.f2699;
                                        if (i11 < length) {
                                            int i12 = (i11 + 2) % 4;
                                            int i13 = (i11 + 3) % 4;
                                            int i14 = cArr4[i11 % 4] * 32718;
                                            char c11 = cArr5[i12];
                                            char c12 = (char) ((i14 + c11) % 65535);
                                            j.f2698 = c12;
                                            cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                                            cArr4[i13] = c12;
                                            int i15 = j.f2699;
                                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2774) ^ ((long) f2776)) ^ ((long) f2775));
                                            j.f2699 = i15 + 1;
                                        } else {
                                            str4 = new String(cArr6);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str4;
                        }

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j10) {
                            f2773 = (f2772 + 101) % 128;
                            try {
                                t.m7283(this);
                                f2773 = (f2772 + 107) % 128;
                            } catch (Throwable th2) {
                                k.m7112(m6914("傴公绮⻣駸\ue9b0\ud90aխ論⏾㜨骋", (char) Color.argb(0, 0, 0, 0), "爇\uf07d褷휦", ViewConfiguration.getPressedStateDuration() >> 16, "ꓹ㳝晁쿽").intern(), m6914("ㅯ䆦뀻哞朤羆濨㆛釠땐逘綏冗嬻", (char) (View.MeasureSpec.getSize(0) + 49709), "爇\uf07d褷휦", (-1) - ImageFormat.getBitsPerPixel(0), "诿㰅ⷳ鷂").intern(), th2, false);
                            }
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(jd.this.f2764);
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m6912() {
        t.m7279(new AnonymousClass5());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6913(io ioVar) {
        t.m7279(new AnonymousClass3(ioVar));
    }
}
