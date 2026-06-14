package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class ij {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f2573 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f2574 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2575 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f2576;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2577;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static final Object f2578;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2579;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2580;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static ij f2581;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final Handler f2582;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final Context f2587;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2584 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2583 = new HashMap<>();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<d>> f2585 = new HashMap<>();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ArrayList<c> f2586 = new ArrayList<>();

    static class c {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final Intent f2589;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final ArrayList<d> f2590;

        c(Intent intent, ArrayList<d> arrayList) {
            this.f2589 = intent;
            this.f2590 = arrayList;
        }
    }

    static class d {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2591 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2592 = {-556830778, 932449610, -1252989743, -383555838, -527990239, -814091228, 1077649869, 1558196944, 546267028, -1488607256, -296181962, 439121835, -1134356724, -1964092877, 1684898287, 114805547, -1230078455, -2068352558};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2593;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        boolean f2594;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final IntentFilter f2595;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final BroadcastReceiver f2596;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m6792(int[] iArr, int i10) {
            String str;
            synchronized (e.f1936) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2592.clone();
                    e.f1937 = 0;
                    while (true) {
                        int i11 = e.f1937;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c10 = (char) (i12 >> 16);
                            cArr[0] = c10;
                            char c11 = (char) i12;
                            cArr[1] = c11;
                            char c12 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c12;
                            char c13 = (char) iArr[i11 + 1];
                            cArr[3] = c13;
                            e.f1939 = (c10 << 16) + c11;
                            e.f1938 = (c12 << 16) + c13;
                            e.m6423(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = e.f1939 ^ iArr2[i13];
                                e.f1939 = i14;
                                e.f1938 = e.m6422(i14) ^ e.f1938;
                                int i15 = e.f1939;
                                e.f1939 = e.f1938;
                                e.f1938 = i15;
                            }
                            int i16 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i16;
                            e.f1938 = i16 ^ iArr2[16];
                            e.f1939 ^= iArr2[17];
                            int i17 = e.f1937;
                            int i18 = e.f1939;
                            cArr[0] = (char) (i18 >>> 16);
                            cArr[1] = (char) i18;
                            int i19 = e.f1938;
                            cArr[2] = (char) (i19 >>> 16);
                            cArr[3] = (char) i19;
                            e.m6423(iArr2);
                            int i20 = e.f1937;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            e.f1937 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(m6792(new int[]{-1347683896, -766209396, -1016868116, 1920920811, -545763817, -15719272}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9).intern());
            sb2.append(this.f2596);
            sb2.append(m6792(new int[]{-297060969, 1552993991, 421836887, 902492426}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8).intern());
            sb2.append(this.f2595);
            sb2.append(m6792(new int[]{703596050, 754565513}, (ViewConfiguration.getEdgeSlop() >> 16) + 1).intern());
            String string = sb2.toString();
            int i10 = f2593 + 119;
            f2591 = i10 % 128;
            if (i10 % 2 != 0) {
                return string;
            }
            throw null;
        }
    }

    static {
        m6787();
        f2578 = new Object();
        int i10 = f2576 + 113;
        f2575 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private ij(Context context) {
        this.f2587 = context;
        this.f2582 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ij.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    ij.m6784(ij.this);
                }
            }
        };
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6782() {
        int size;
        c[] cVarArr;
        while (true) {
            synchronized (this.f2583) {
                try {
                    size = this.f2586.size();
                    if (size <= 0) {
                        return;
                    }
                    cVarArr = new c[size];
                    this.f2586.toArray(cVarArr);
                    this.f2586.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = cVarArr[i10];
                for (int i11 = 0; i11 < cVar.f2590.size(); i11++) {
                    cVar.f2590.get(i11).f2596.onReceive(this.f2587, cVar.f2589);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6783() {
        synchronized (this.f2583) {
            try {
                Iterator it = new HashMap(this.f2583).keySet().iterator();
                while (it.hasNext()) {
                    m6788((BroadcastReceiver) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6784(ij ijVar) {
        int i10 = f2575 + 73;
        f2576 = i10 % 128;
        int i11 = i10 % 2;
        ijVar.m6782();
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static void m6787() {
        f2574 = (char) 59581;
        f2580 = (char) 17809;
        f2573 = (char) 50599;
        f2579 = (char) 29743;
        f2577 = 118;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m6789() {
        try {
            int i10 = f2575 + 13;
            f2576 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2584 = false;
            } else {
                this.f2584 = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ij m6785(Context context) {
        ij ijVar;
        synchronized (f2578) {
            try {
                if (f2581 == null) {
                    f2581 = new ij(context.getApplicationContext());
                }
                ijVar = f2581;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ijVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6790(Intent intent) {
        float f10;
        String str;
        long j10;
        int i10;
        ArrayList<d> arrayList;
        String str2;
        String str3;
        Uri uri;
        String strIntern = m6781("ᦌ㙕䫌綮关缠䯺㉩픸ㄑ䫌綮齊鉣ꝸ점\uf66aꋗ沤痌큇馔", 21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        if (!this.f2584) {
            return false;
        }
        synchronized (this.f2583) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2587.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    f10 = 0.0f;
                    j10 = 0;
                    str = action;
                    sb2.append(m6786("\r\b\u0015\u000b\u000e\u0012\u0004\ufff1\uffbf\u0004\u000f\u0018\u0013\uffbf\u0006", TextUtils.lastIndexOf("", '0', 0, 0) + 16, true, 8 - View.MeasureSpec.getSize(0), 214 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                    sb2.append(strResolveTypeIfNeeded);
                    sb2.append(m6786("\u0017\u000f\u0012\r\u001dￊￊ\u000f", 7 - ExpandableListView.getPackedPositionChild(0L), true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6, TextUtils.indexOf("", "", 0, 0) + 204).intern());
                    sb2.append(scheme);
                    sb2.append(m6786("\u0017\u000e\u001d\u0017\u0012\uffc9\u000f\u0018\uffc9\uffc9\u001d", KeyEvent.normalizeMetaState(0) + 11, true, 9 - (Process.myTid() >> 22), TextUtils.getTrimmedLength("") + 205).intern());
                    sb2.append(intent);
                    Log.v(strIntern, sb2.toString());
                } else {
                    f10 = 0.0f;
                    str = action;
                    j10 = 0;
                }
                ArrayList<d> arrayList2 = this.f2585.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder();
                        i10 = 0;
                        sb3.append(m6786("\t\uffe7ￆ￠\u001a\u0019\u000f\u0012ￆ\u0014\u0015\u000f\u001a", 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, (ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1)) + 1, 208 - (Process.myPid() >> 22)).intern());
                        sb3.append(arrayList2);
                        Log.v(strIntern, sb3.toString());
                    } else {
                        i10 = 0;
                    }
                    ArrayList arrayList3 = null;
                    int i11 = i10;
                    while (i11 < arrayList2.size()) {
                        d dVar = arrayList2.get(i11);
                        if (z10) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m6781("ꝸ점聧䵸똰쐔䒦ⱌⅮ飏姁脖캞㬜齊鉣㷧쎆왁㭁\udc7a⺿땽\ued57", 24 - (TypedValue.complexToFloat(i10) > f10 ? 1 : (TypedValue.complexToFloat(i10) == f10 ? 0 : -1))).intern());
                            sb4.append(dVar.f2595);
                            Log.v(strIntern, sb4.toString());
                        }
                        if (dVar.f2594) {
                            if (z10) {
                                arrayList = arrayList2;
                                int i12 = i10;
                                Log.v(strIntern, m6786("\u001f\n\u0007\u000b\u0018\u0012\u0007ￆ\u001a\u000b\r\u0018\u0007\u001aￆ\u0019ￍ\u0018\u000b\u001a\u0012\u000f￬ￆￆ\n\u000b\n\n\u0007ￆ", ExpandableListView.getPackedPositionType(j10) + 31, true, (AudioTrack.getMinVolume() > f10 ? 1 : (AudioTrack.getMinVolume() == f10 ? 0 : -1)) + 25, 208 - View.combineMeasuredStates(i12, i12)).intern());
                            } else {
                                arrayList = arrayList2;
                            }
                            str2 = strResolveTypeIfNeeded;
                            str3 = scheme;
                            uri = data;
                        } else {
                            arrayList = arrayList2;
                            String str4 = str;
                            int iMatch = dVar.f2595.match(str4, strResolveTypeIfNeeded, scheme, data, categories, strIntern);
                            str = str4;
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb5 = new StringBuilder();
                                    str2 = strResolveTypeIfNeeded;
                                    str3 = scheme;
                                    uri = data;
                                    sb5.append(m6786("\u0019\r \u000f\u0014\u0011\u0010ￍￌￌ\u0019\r \u000f\u0014￩ￜ$ￌￌ\ufff2\u0015\u0018 \u0011\u001eￌ", 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > j10 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j10 ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > j10 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j10 ? 0 : -1)) + 203).intern());
                                    sb5.append(Integer.toHexString(iMatch));
                                    Log.v(strIntern, sb5.toString());
                                } else {
                                    str2 = strResolveTypeIfNeeded;
                                    str3 = scheme;
                                    uri = data;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(dVar);
                                dVar.f2594 = true;
                            } else {
                                str2 = strResolveTypeIfNeeded;
                                str3 = scheme;
                                uri = data;
                                if (z10) {
                                    String strIntern2 = iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? m6786("\r\u0006\u0007\u000b\ufff9�\nﾸ\u0006\u000f\u0007\u0006\u0003\u0006", TextUtils.indexOf((CharSequence) "", '0') + 15, true, -ExpandableListView.getPackedPositionChild(j10), 223 - (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1))).intern() : m6781("☲툑쿆\uea0f", 4 - Color.argb(0, 0, 0, 0)).intern() : m6786("\u000e\ufffb\ufffe\ufffb", KeyEvent.normalizeMetaState(0) + 4, true, (ViewConfiguration.getLongPressTimeout() >> 16) + 3, 220 - View.getDefaultSize(0, 0)).intern() : m6786("\u0004\ufff7\ufff9\n\uffff\u0005", View.MeasureSpec.makeMeasureSpec(0, 0) + 6, false, (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)), MotionEvent.axisFromString("") + Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE).intern() : m6786("\u0007\u0004￼\ufffa\t\ufff6\ufff8\u000e", TextUtils.getOffsetAfter("", 0) + 8, true, 7 - (Process.myPid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1)) + 224).intern();
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(m6781("\ueebc镵䝉ᡨ\ue353ퟛ↣녷ᢪ\ue4c4\uf2edࣁ䶥轜꾋퉜\udf40琔ꌸ\uf542咼졀\uf8fb㷽", 24 - View.resolveSize(0, 0)).intern());
                                    sb6.append(strIntern2);
                                    Log.v(strIntern, sb6.toString());
                                }
                                i11++;
                                arrayList2 = arrayList;
                                strResolveTypeIfNeeded = str2;
                                scheme = str3;
                                data = uri;
                                i10 = 0;
                            }
                        }
                        i11++;
                        arrayList2 = arrayList;
                        strResolveTypeIfNeeded = str2;
                        scheme = str3;
                        data = uri;
                        i10 = 0;
                    }
                    if (arrayList3 != null) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            ((d) arrayList3.get(i13)).f2594 = false;
                        }
                        this.f2586.add(new c(intent, arrayList3));
                        if (!this.f2582.hasMessages(1)) {
                            this.f2582.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m6791() {
        try {
            int i10 = f2576 + 67;
            f2575 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2584 = false;
            } else {
                this.f2584 = false;
            }
            m6783();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6788(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2583) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.f2583.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int i10 = 0; i10 < arrayListRemove.size(); i10++) {
                    IntentFilter intentFilter = arrayListRemove.get(i10);
                    for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                        String action = intentFilter.getAction(i11);
                        ArrayList<d> arrayList = this.f2585.get(action);
                        if (arrayList != null) {
                            int i12 = 0;
                            while (i12 < arrayList.size()) {
                                if (arrayList.get(i12).f2596 == broadcastReceiver) {
                                    arrayList.remove(i12);
                                    i12--;
                                }
                                i12++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f2585.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6786(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2577);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6781(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2574)) ^ ((c11 >>> 5) + f2573)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2580) ^ ((c12 + i12) ^ ((c12 << 4) + f2579))));
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
}
