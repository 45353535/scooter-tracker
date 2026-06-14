package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.adqualitysdk.sdk.i.hh;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class jf {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2802 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2803 = 44872;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2804 = 35226;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2805 = 2534;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2806 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2807 = 9474;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jf f2808;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private jl f2809;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<RelativeLayout, Object> f2811 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ii f2810 = new ii(-1, -1, -1, -1);

    private jf() {
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ View.OnLayoutChangeListener m6934(jf jfVar, ViewGroup viewGroup) {
        int i10 = f2802 + 45;
        f2806 = i10 % 128;
        if (i10 % 2 == 0) {
            return jfVar.m6943(viewGroup);
        }
        jfVar.m6943(viewGroup);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ViewGroup m6941(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i10 = f2806 + 49;
        f2802 = i10 % 128;
        if (i10 % 2 == 0) {
            m6935(viewGroup, viewGroup2);
            throw null;
        }
        ViewGroup viewGroupM6935 = m6935(viewGroup, viewGroup2);
        int i11 = f2806 + 83;
        f2802 = i11 % 128;
        if (i11 % 2 != 0) {
            return viewGroupM6935;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6946(jf jfVar, MotionEvent motionEvent) {
        f2802 = (f2806 + 17) % 128;
        jfVar.m6937(motionEvent);
        f2806 = (f2802 + 77) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6949(jf jfVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        f2802 = (f2806 + 41) % 128;
        jfVar.m6947(viewGroup, onLayoutChangeListener);
        int i10 = f2806 + 81;
        f2802 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 26 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m6950() {
        int i10 = f2802 + 87;
        f2806 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f2809 == null) {
            this.f2809 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.2
                @Override // com.ironsource.adqualitysdk.sdk.i.jl
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4573(View view) {
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.jl
                /* JADX INFO: renamed from: ﻛ */
                public final void mo4577(View view) {
                    if (s.m7239().m7266()) {
                        jf.this.m6952();
                        return;
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroupM6941 = (ViewGroup) view;
                        if (viewGroupM6941.getContext() instanceof Activity) {
                            viewGroupM6941 = jf.m6941(viewGroupM6941, (ViewGroup) ((Activity) viewGroupM6941.getContext()).findViewById(R.id.content));
                        }
                        jf jfVar = jf.this;
                        jf.m6949(jfVar, viewGroupM6941, jf.m6934(jfVar, viewGroupM6941));
                    }
                }
            };
            ji.m6955().m6962(this.f2809);
            f2802 = (f2806 + 31) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6938(View view, hh.c cVar) {
        int i10 = f2802 + 27;
        f2806 = i10 % 128;
        int i11 = i10 % 2;
        m6942(view, cVar);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized jf m6944() {
        try {
            f2806 = (f2802 + 73) % 128;
            if (f2808 == null) {
                f2808 = new jf();
            }
            jf jfVar = f2808;
            int i10 = f2802 + 97;
            f2806 = i10 % 128;
            if (i10 % 2 == 0) {
                return jfVar;
            }
            int i11 = 86 / 0;
            return jfVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ii m6951() {
        ii iiVar;
        try {
            int i10 = f2806 + 59;
            int i11 = i10 % 128;
            f2802 = i11;
            if (i10 % 2 == 0) {
                iiVar = this.f2810;
                int i12 = 6 / 0;
            } else {
                iiVar = this.f2810;
            }
            int i13 = i11 + 9;
            f2806 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iiVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m6952() {
        try {
            if (this.f2809 != null) {
                int i10 = f2802 + 9;
                f2806 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f2811.keySet().iterator();
                    throw null;
                }
                for (RelativeLayout relativeLayout : this.f2811.keySet()) {
                    f2802 = (f2806 + 29) % 128;
                    ViewParent parent = relativeLayout.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(relativeLayout);
                    }
                }
                this.f2811.clear();
                ji.m6955().m6963(this.f2809);
                this.f2809 = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6939(jf jfVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        f2802 = (f2806 + 17) % 128;
        jfVar.m6945(viewGroup, onLayoutChangeListener);
        f2802 = (f2806 + 7) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m6942(View view, hh.c cVar) {
        int i10 = f2802 + 9;
        f2806 = i10 % 128;
        int i11 = i10 % 2;
        ju.m7033(view, cVar);
        if (i11 != 0) {
            int i12 = 20 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6940(jf jfVar, ii iiVar) {
        f2802 = (f2806 + 65) % 128;
        jfVar.m6948(iiVar);
        int i10 = f2806 + 83;
        f2802 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r1 = r5.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r1 != r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.jf.f2806 + 117;
        com.ironsource.adqualitysdk.sdk.i.jf.f2802 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r4 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 != r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if ((r1 instanceof android.view.ViewGroup) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r0 = r5;
        r5 = (android.view.ViewGroup) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.jf.f2806 = (r0 + 111) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.view.ViewGroup m6935(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jf.f2802
            int r1 = r0 + 95
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.jf.f2806 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L13
            r1 = 38
            int r1 = r1 / 0
            if (r5 != 0) goto L1c
            goto L15
        L13:
            if (r5 != 0) goto L1c
        L15:
            int r0 = r0 + 111
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jf.f2806 = r0
            return r4
        L1c:
            r0 = r5
        L1d:
            if (r5 == 0) goto L42
            android.view.ViewParent r1 = r5.getParent()
            if (r1 != r4) goto L37
            int r4 = com.ironsource.adqualitysdk.sdk.i.jf.f2806
            int r4 = r4 + 117
            int r1 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.jf.f2802 = r1
            int r4 = r4 % 2
            if (r4 == 0) goto L35
            if (r0 != r5) goto L34
            return r5
        L34:
            return r0
        L35:
            r4 = 0
            throw r4
        L37:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L42
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = r0
            r0 = r5
            r5 = r3
            goto L1d
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jf.m6935(android.view.ViewGroup, android.view.ViewGroup):android.view.ViewGroup");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private View.OnLayoutChangeListener m6943(final ViewGroup viewGroup) {
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.3

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2822 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2823 = 181;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2824 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m6954(String str, int i10, boolean z10, int i11, int i12) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (b.f730) {
                    try {
                        char[] cArr2 = new char[i10];
                        b.f728 = 0;
                        while (true) {
                            int i13 = b.f728;
                            if (i13 >= i10) {
                                break;
                            }
                            b.f729 = cArr[i13];
                            cArr2[b.f728] = (char) (b.f729 + i12);
                            int i14 = b.f728;
                            cArr2[i14] = (char) (cArr2[i14] - f2823);
                            b.f728 = i14 + 1;
                        }
                        if (i11 > 0) {
                            b.f731 = i11;
                            char[] cArr3 = new char[i10];
                            System.arraycopy(cArr2, 0, cArr3, 0, i10);
                            int i15 = b.f731;
                            System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                            int i16 = b.f731;
                            System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i10];
                            b.f728 = 0;
                            while (true) {
                                int i17 = b.f728;
                                if (i17 >= i10) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i10 - i17) - 1];
                                b.f728 = i17 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str2 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.view.View.OnLayoutChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                /*
                    r0 = this;
                    int r1 = com.ironsource.adqualitysdk.sdk.i.jf.AnonymousClass3.f2822
                    int r1 = r1 + 121
                    int r2 = r1 % 128
                    com.ironsource.adqualitysdk.sdk.i.jf.AnonymousClass3.f2824 = r2
                    int r1 = r1 % 2
                    r2 = 1
                    r3 = 0
                    if (r1 != 0) goto L1c
                    com.ironsource.adqualitysdk.sdk.i.s r1 = com.ironsource.adqualitysdk.sdk.i.s.m7239()
                    boolean r1 = r1.m7266()
                    r4 = 64
                    int r4 = r4 / r3
                    if (r1 != 0) goto L76
                    goto L28
                L1c:
                    com.ironsource.adqualitysdk.sdk.i.s r1 = com.ironsource.adqualitysdk.sdk.i.s.m7239()
                    boolean r1 = r1.m7266()
                    r1 = r1 ^ r2
                    if (r1 == r2) goto L28
                    goto L76
                L28:
                    com.ironsource.adqualitysdk.sdk.i.jf r1 = com.ironsource.adqualitysdk.sdk.i.jf.this     // Catch: java.lang.Throwable -> L30
                    android.view.ViewGroup r4 = r2     // Catch: java.lang.Throwable -> L30
                    com.ironsource.adqualitysdk.sdk.i.jf.m6949(r1, r4, r0)     // Catch: java.lang.Throwable -> L30
                    return
                L30:
                    r1 = move-exception
                    int r4 = android.view.ViewConfiguration.getScrollBarSize()
                    int r4 = r4 >> 8
                    int r4 = 26 - r4
                    int r5 = android.os.Process.myTid()
                    int r5 = r5 >> 22
                    int r5 = 14 - r5
                    int r6 = android.os.Process.myPid()
                    int r6 = r6 >> 22
                    int r6 = 283 - r6
                    java.lang.String r7 = "\r\u0003￦\u0002�\u000f\t￮\u0006\ufffb￼\t\u0006￡\uffff�\u0003\u0010\f\uffff￭\f\uffff\b\uffff\u000e"
                    java.lang.String r2 = m6954(r7, r4, r2, r5, r6)
                    java.lang.String r2 = r2.intern()
                    int r4 = android.view.KeyEvent.getDeadChar(r3, r3)
                    int r4 = r4 + 23
                    java.lang.String r5 = ""
                    int r5 = android.text.TextUtils.getOffsetAfter(r5, r3)
                    int r5 = r5 + 6
                    r6 = 0
                    int r6 = android.widget.ExpandableListView.getPackedPositionChild(r6)
                    int r6 = 277 - r6
                    java.lang.String r7 = "￢\u0007\u0000\r\u0006\u0004￤\u0011\u0011\u000e\u0011\uffbf\b\r\uffbf\u000e\r￫\u0000\u0018\u000e\u0014\u0013"
                    java.lang.String r4 = m6954(r7, r4, r3, r5, r6)
                    java.lang.String r4 = r4.intern()
                    com.ironsource.adqualitysdk.sdk.i.kd.m7160(r2, r4, r1, r3)
                L76:
                    int r1 = com.ironsource.adqualitysdk.sdk.i.jf.AnonymousClass3.f2822
                    int r1 = r1 + 9
                    int r1 = r1 % 128
                    com.ironsource.adqualitysdk.sdk.i.jf.AnonymousClass3.f2824 = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jf.AnonymousClass3.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
            }
        };
        f2806 = (f2802 + 87) % 128;
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6945(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final hh.c cVar = new hh.c() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hh.c
            /* JADX INFO: renamed from: ｋ */
            public final boolean mo6121(hh hhVar, View view, MotionEvent motionEvent) {
                jf.m6946(jf.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                jf.m6938(viewGroup, cVar);
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof ViewGroup) {
                        jf.m6939(jf.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        jf.m6938(childAt, cVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        f2806 = (f2802 + 1) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6932(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jf.1
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                jf.m6946(jf.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f2811.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6937(MotionEvent motionEvent) {
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.10

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f2813 = 1;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f2814 = 0;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f2815 = 37975;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static char f2816 = 32856;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static char f2817 = 59102;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char f2818 = 59002;

                /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
                
                    if (com.ironsource.adqualitysdk.sdk.i.jw.m7062(r0, r3) != false) goto L6;
                 */
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void mo4564() {
                    /*
                        Method dump skipped, instruction units count: 242
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jf.AnonymousClass10.mo4564():void");
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m6953(String str, int i10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (n.f3016) {
                        try {
                            char[] cArr2 = new char[cArr.length];
                            n.f3015 = 0;
                            char[] cArr3 = new char[2];
                            while (true) {
                                int i11 = n.f3015;
                                if (i11 < cArr.length) {
                                    cArr3[0] = cArr[i11];
                                    cArr3[1] = cArr[i11 + 1];
                                    int i12 = 58224;
                                    for (int i13 = 0; i13 < 16; i13++) {
                                        char c10 = cArr3[1];
                                        char c11 = cArr3[0];
                                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2816)) ^ ((c11 >>> 5) + f2815)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2817) ^ ((c12 + i12) ^ ((c12 << 4) + f2818))));
                                        i12 -= 40503;
                                    }
                                    int i14 = n.f3015;
                                    cArr2[i14] = cArr3[0];
                                    cArr2[i14 + 1] = cArr3[1];
                                    n.f3015 = i14 + 2;
                                } else {
                                    str2 = new String(cArr2, 0, i10);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }
            });
            f2806 = (f2802 + 109) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6936("恷朗ꍦẗ倄\udc58庯룉ᙥ뀒\udf1e䉗閥۔춖䗉뀺ʱᅮ蜎䷺㻸麄汈䑟\udf11", View.MeasureSpec.makeMeasureSpec(0, 0) + 26).intern(), m6936("䃂\uefbe駀쉁齴푿ᘺẢ앲⨠㎒鞡閏䇶\uda53\ue27fᙥ뀒㫡懾\uf8aeᙧ⪋\uf822ꀰ肔齴푿\uf8aeᙧꨐ㗵", 32 - TextUtils.indexOf("", "", 0, 0)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m6948(ii iiVar) {
        int i10 = f2806;
        this.f2810 = iiVar;
        f2802 = (i10 + 69) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6936(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2805)) ^ ((c11 >>> 5) + f2804)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2803) ^ ((c12 + i12) ^ ((c12 << 4) + f2807))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6947(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        f2806 = (f2802 + 107) % 128;
        if (viewGroup == null || m6933(viewGroup)) {
            return;
        }
        Activity activityM7178 = ke.m7178(viewGroup);
        if (!jn.m6976().m6982(activityM7178)) {
            if (!jn.m6976().m6983(activityM7178)) {
                return;
            }
            m6945(viewGroup, onLayoutChangeListener);
        } else if (viewGroup.findViewById(160766228) == null) {
            int i10 = f2802 + 21;
            f2806 = i10 % 128;
            if (i10 % 2 == 0) {
                m6932(viewGroup, onLayoutChangeListener);
            } else {
                m6932(viewGroup, onLayoutChangeListener);
                int i11 = 83 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m6933(ViewGroup viewGroup) {
        f2806 = (f2802 + 37) % 128;
        try {
            if (viewGroup.getChildCount() == 0) {
                return false;
            }
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (!(viewGroup.getChildAt(i10) instanceof TextView)) {
                    int i11 = (f2806 + 83) % 128;
                    f2802 = i11;
                    f2806 = (i11 + 81) % 128;
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            k.m7118(m6936("恷朗ꍦẗ倄\udc58庯룉ᙥ뀒\udf1e䉗閥۔춖䗉뀺ʱᅮ蜎䷺㻸麄汈䑟\udf11", View.MeasureSpec.getSize(0) + 26).intern(), m6936("䃂\uefbe駀쉁齴푿⊣䏵妨觊ڏ\ue83a\ueae3뼡했⪟섌៣䤑툣\u0ef8⽪佴辴\uf481ࠞ䓊솲\uef79䎩ཱུେ䡚宵Ⴛಧꀰ肔Ϡ霅繓\uf1ae\ue835鰾\ue926\ue310䤑툣\u0ef8⽪뉹嫨", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52).intern(), th2);
            return false;
        }
    }
}
