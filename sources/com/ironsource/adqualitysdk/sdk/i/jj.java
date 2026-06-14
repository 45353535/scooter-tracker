package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jj {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jj f2843;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    boolean f2845 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<jg> f2844 = new HashSet();

    @TargetApi(14)
    static class b extends jj implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2846 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2847 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2848 = {852778607, 1982419963, -1875200446, 1662580092, -49784149, -1732858882, 492031467, -428128084, -556755272, 1117900764, 1234715372, 305635570, 1377257034, 1744949835, 1331503627, 1363535708, 1637706811, 691137695};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2849;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Activity> f2850;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Application> f2851;

        private b() {
            this.f2849 = new WeakHashMap();
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private void m6972(Activity activity) {
            Iterator<jg> it = m6968().iterator();
            f2847 = (f2846 + 43) % 128;
            while (it.hasNext()) {
                int i10 = f2846 + 121;
                f2847 = i10 % 128;
                if (i10 % 2 == 0) {
                    it.next().mo4672(activity);
                    int i11 = 94 / 0;
                } else {
                    it.next().mo4672(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jj.class) {
                    try {
                        if (this.f2850 == null) {
                            m6971(activity);
                            jj.class.notifyAll();
                        }
                    } finally {
                    }
                }
                Iterator<jg> it = m6968().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e10) {
                kd.m7160(m6973(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m6973(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, 106370530, -106445027, 1314361584, 135943168, 1225542097, -2037163726}, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ESC).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            f2846 = (f2847 + 79) % 128;
            try {
                Iterator<jg> it = m6968().iterator();
                while (it.hasNext()) {
                    it.next().onActivityDestroyed(activity);
                }
                f2846 = (f2847 + 7) % 128;
            } catch (Exception e10) {
                kd.m7160(m6973(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m6973(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -1011920759, -514237837, -799198377, 1956937021, -1778007821, 1924516393}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            int i10 = f2847 + 25;
            f2846 = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    m6968().iterator();
                    throw null;
                }
                Iterator<jg> it = m6968().iterator();
                while (it.hasNext()) {
                    f2846 = (f2847 + 15) % 128;
                    it.next().onActivityPaused(activity);
                }
            } catch (Exception e10) {
                kd.m7160(m6973(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, Drawable.resolveOpacity(0, 0) + 30).intern(), m6973(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, 542832659, 354471783, 190147778, 1166495507, -958284366, -5727967}, (ViewConfiguration.getScrollBarSize() >> 8) + 25).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            f2846 = (f2847 + 13) % 128;
            try {
                m6971(activity);
                Iterator<jg> it = m6968().iterator();
                while (!(!it.hasNext())) {
                    int i10 = f2847 + 3;
                    f2846 = i10 % 128;
                    if (i10 % 2 != 0) {
                        it.next().onActivityResumed(activity);
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                }
            } catch (Exception e10) {
                kd.m7160(m6973(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 30 - KeyEvent.keyCodeFromString("")).intern(), m6973(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -1106219560, -189573273, -756190804, 1970045181, 1225542097, -2037163726}, MotionEvent.axisFromString("") + 27).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            try {
                Iterator<jg> it = m6968().iterator();
                f2846 = (f2847 + 63) % 128;
                while (it.hasNext()) {
                    f2847 = (f2846 + 67) % 128;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                }
            } catch (Exception e10) {
                kd.m7160(m6973(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m6973(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, -306235481, 357166782, -331477217, 720202842, 434389037, -1339251480, 10378132, -258850162}, TextUtils.lastIndexOf("", '0') + 37).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2850 == null) {
                    m6971(activity);
                }
                synchronized (this) {
                    this.f2849.put(activity, Boolean.TRUE);
                }
                Iterator<jg> it = m6968().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m6973(new int[]{794530547, -1223452522, 818890360, -750195985, -498149136, 1307644982, 1783173582, -576746712, 1767025888, -1219627344, -1285886341, 107496323, -1202616267, -884503944, 480019611, 2073556878, -229349524, -1286536630, -1824038139, -116106100, 1660370409, -1197788475}, 43 - Color.blue(0)).intern())) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f2849.size() == 1 && !this.f2845) {
                            m6974(activity);
                        }
                    } finally {
                    }
                }
            } catch (Exception e10) {
                kd.m7160(m6973(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, Color.alpha(0) + 30).intern(), m6973(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, 997713263, 1723517344, 1225542097, -2037163726}, (-16777190) - Color.rgb(0, 0, 0)).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<jg> it = m6968().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2845 = activity.isChangingConfigurations();
                synchronized (this) {
                    try {
                        if (!this.f2849.containsKey(activity) || activity.getLocalClassName().equals(m6973(new int[]{794530547, -1223452522, 818890360, -750195985, -498149136, 1307644982, 1783173582, -576746712, 1767025888, -1219627344, -1285886341, 107496323, -1202616267, -884503944, 480019611, 2073556878, -229349524, -1286536630, -1824038139, -116106100, 1660370409, -1197788475}, 43 - KeyEvent.getDeadChar(0, 0)).intern())) {
                            size = -1;
                        } else {
                            this.f2849.remove(activity);
                            size = this.f2849.size();
                        }
                    } finally {
                    }
                }
                if (size < 0 || size != 0 || this.f2845) {
                    return;
                }
                m6972(activity);
            } catch (Exception e10) {
                kd.m7160(m6973(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m6973(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, 2020492388, 1031454015, 1225542097, -2037163726}, 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), e10, false);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo6965() {
            int i10 = f2846;
            f2847 = (i10 + 57) % 128;
            WeakReference<Activity> weakReference = this.f2850;
            if (weakReference == null) {
                return null;
            }
            f2847 = (i10 + 73) % 128;
            Activity activity = weakReference.get();
            f2846 = (f2847 + 53) % 128;
            return activity;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final synchronized boolean mo6969() {
            int i10 = f2847 + 59;
            f2846 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2849.size();
                throw null;
            }
            if (this.f2849.size() <= 0) {
                return false;
            }
            int i11 = f2846 + 51;
            f2847 = i11 % 128;
            if (i11 % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo6970(Application application, Activity activity) {
            try {
                if (this.f2851 == null) {
                    this.f2851 = new WeakReference<>(application);
                    if (activity != null) {
                        m6971(activity);
                        synchronized (this) {
                            this.f2849.put(activity, Boolean.TRUE);
                        }
                    }
                    application.registerActivityLifecycleCallbacks(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m6974(Activity activity) {
            Iterator<jg> it = m6968().iterator();
            while (it.hasNext()) {
                f2846 = (f2847 + 67) % 128;
                it.next().mo4673(activity);
            }
            f2846 = (f2847 + 81) % 128;
        }

        /* synthetic */ b(byte b10) {
            this();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private void m6971(final Activity activity) {
            this.f2850 = new WeakReference<>(activity);
            t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.b.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() throws Exception {
                    jw.m7049(activity);
                }
            });
            f2846 = (f2847 + 109) % 128;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6973(int[] iArr, int i10) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1936) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2848.clone();
                    com.ironsource.adqualitysdk.sdk.i.e.f1937 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
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
                            com.ironsource.adqualitysdk.sdk.i.e.f1939 = (c10 << 16) + c11;
                            com.ironsource.adqualitysdk.sdk.i.e.f1938 = (c12 << 16) + c13;
                            com.ironsource.adqualitysdk.sdk.i.e.m6423(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = com.ironsource.adqualitysdk.sdk.i.e.f1939 ^ iArr2[i13];
                                com.ironsource.adqualitysdk.sdk.i.e.f1939 = i14;
                                com.ironsource.adqualitysdk.sdk.i.e.f1938 = com.ironsource.adqualitysdk.sdk.i.e.m6422(i14) ^ com.ironsource.adqualitysdk.sdk.i.e.f1938;
                                int i15 = com.ironsource.adqualitysdk.sdk.i.e.f1939;
                                com.ironsource.adqualitysdk.sdk.i.e.f1939 = com.ironsource.adqualitysdk.sdk.i.e.f1938;
                                com.ironsource.adqualitysdk.sdk.i.e.f1938 = i15;
                            }
                            int i16 = com.ironsource.adqualitysdk.sdk.i.e.f1939;
                            com.ironsource.adqualitysdk.sdk.i.e.f1939 = com.ironsource.adqualitysdk.sdk.i.e.f1938;
                            com.ironsource.adqualitysdk.sdk.i.e.f1938 = i16;
                            com.ironsource.adqualitysdk.sdk.i.e.f1938 = i16 ^ iArr2[16];
                            com.ironsource.adqualitysdk.sdk.i.e.f1939 ^= iArr2[17];
                            int i17 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                            int i18 = com.ironsource.adqualitysdk.sdk.i.e.f1939;
                            cArr[0] = (char) (i18 >>> 16);
                            cArr[1] = (char) i18;
                            int i19 = com.ironsource.adqualitysdk.sdk.i.e.f1938;
                            cArr[2] = (char) (i19 >>> 16);
                            cArr[3] = (char) i19;
                            com.ironsource.adqualitysdk.sdk.i.e.m6423(iArr2);
                            int i20 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            com.ironsource.adqualitysdk.sdk.i.e.f1937 = i20 + 2;
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
    }

    static class e extends jj {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2853 = -238758940400250356L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2854 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2855 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Context f2856;

        /* synthetic */ e(byte b10) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo6965() {
            int i10 = f2854 + 31;
            f2855 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 35 / 0;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo6969() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2856.getSystemService(m6975("鉭ⓊＲ놊䣮͜햦泶", TextUtils.getCapsMode("", 0, 0) + 46757).intern())).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                f2855 = (f2854 + 101) % 128;
                return false;
            }
            String packageName = this.f2856.getPackageName();
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                if (it.next().importance == 100) {
                    f2855 = (f2854 + 117) % 128;
                    if (!(!r3.processName.equals(packageName))) {
                        f2854 = (f2855 + 77) % 128;
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo6970(Application application, Activity activity) {
            f2854 = (f2855 + 17) % 128;
            if (application != null) {
                this.f2856 = application.getApplicationContext();
                return;
            }
            if (activity != null) {
                this.f2856 = activity.getApplicationContext();
            }
            int i10 = f2855 + 19;
            f2854 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 56 / 0;
            }
        }

        private e() {
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6975(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f2043) {
                try {
                    f.f2041 = i10;
                    char[] cArr2 = new char[cArr.length];
                    f.f2042 = 0;
                    while (true) {
                        int i11 = f.f2042;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f2853);
                            f.f2042++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jj m6964() {
        try {
            if (f2843 == null) {
                f2843 = new b((byte) 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2843;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract Activity mo6965();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m6966(jg jgVar) {
        this.f2844.remove(jgVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    protected final synchronized List<jg> m6968() {
        return new ArrayList(this.f2844);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo6969();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo6970(Application application, Activity activity);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m6967(jg jgVar) {
        this.f2844.add(jgVar);
    }
}
