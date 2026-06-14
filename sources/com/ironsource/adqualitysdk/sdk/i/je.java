package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ViewConfiguration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class je {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Handler f2784 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2785 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2786 = 6080386998049583536L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2787;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ib f2788;

    public interface b {
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        void mo6930(String str);
    }

    public interface d {
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo6931();
    }

    public je(Context context, String str, String str2) {
        this.f2788 = new ib(context, str, str2);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Handler m6918() {
        Handler handler;
        synchronized (je.class) {
            try {
                if (f2784 == null) {
                    HandlerThread handlerThread = new HandlerThread(m6916("\u0efb퇕롮\udb97ະ\ue000\udb77仑졚⧉鈻耢茨溑䣡掠嫚呂ྫ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
                    handlerThread.start();
                    f2784 = new Handler(handlerThread.getLooper());
                }
                handler = f2784;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6919(je jeVar, d dVar) {
        f2785 = (f2787 + 113) % 128;
        jeVar.m6917(dVar);
        f2785 = (f2787 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6920(final String str, final b bVar) {
        m6918().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                final String strM6925 = je.this.m6925(str);
                t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        bVar.mo6930(strM6925);
                    }
                });
            }
        });
        f2787 = (f2785 + 55) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6924(final String str, final String str2, final d dVar) {
        m6918().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                je.this.m6926(str, str2);
                je.m6919(je.this, dVar);
            }
        });
        f2787 = (f2785 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6925(String str) {
        f2785 = (f2787 + 73) % 128;
        String strM6746 = this.f2788.m6746(str);
        int i10 = f2787 + 115;
        f2785 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM6746;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6921(String str, String str2) {
        int i10 = f2785 + 61;
        f2787 = i10 % 128;
        if (i10 % 2 == 0) {
            m6926(str, str2);
            m6926(m6915(str), Long.toString(jx.m7068()));
        } else {
            m6926(str, str2);
            m6926(m6915(str), Long.toString(jx.m7068()));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6926(String str, String str2) {
        int i10 = f2785 + 93;
        f2787 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2788.m6749(str, str2);
        } else {
            this.f2788.m6749(str, str2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m6927(String str) {
        int i10 = f2787 + 65;
        f2785 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2788.m6748(str);
            throw null;
        }
        int iM6748 = this.f2788.m6748(str);
        f2785 = (f2787 + 73) % 128;
        return iM6748;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap<String, String> m6928(String str, int i10) {
        f2787 = (f2785 + 67) % 128;
        HashMap<String, String> mapM6747 = this.f2788.m6747(str, i10);
        int i11 = f2785 + 11;
        f2787 = i11 % 128;
        if (i11 % 2 == 0) {
            return mapM6747;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6929(String str, String str2) {
        int i10 = f2787 + 103;
        f2785 = i10 % 128;
        int i11 = i10 % 2;
        m6924(str, str2, null);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f2787 + 71;
        f2785 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6915(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(m6916("Ό⟥啚\ue3c0\u03a2ᘹ㙛皣씸\udfe0缊롴蹭颡ꗟ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
        String string = sb2.toString();
        f2787 = (f2785 + 85) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6917(d dVar) {
        f2785 = (f2787 + 7) % 128;
        if (dVar != null) {
            t.m7288(new ir(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                }
            });
            f2787 = (f2785 + 7) % 128;
        }
        int i10 = f2787 + 17;
        f2785 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6922(String str) {
        f2785 = (f2787 + 107) % 128;
        this.f2788.m6745(str);
        int i10 = f2785 + 21;
        f2787 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6916(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f2786, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2786));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6923(final String str, final String str2, final d dVar) {
        m6918().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                je.this.m6921(str, str2);
                je.m6919(je.this, dVar);
            }
        });
        f2785 = (f2787 + 53) % 128;
    }
}
