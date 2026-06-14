package w9;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f107555c = new a(ImmutableList.of(e.f107560d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ImmutableList f107556d = ImmutableList.of(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ImmutableMap f107557e = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f107558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f107559b;

    private static final class b {
        private static ImmutableSet a() {
            ImmutableSet.Builder builderAdd = new ImmutableSet.Builder().add((Object[]) new Integer[]{8, 7});
            int i10 = o0.f98837a;
            if (i10 >= 31) {
                builderAdd.add((Object[]) new Integer[]{26, 27});
            }
            if (i10 >= 33) {
                builderAdd.add(30);
            }
            return builderAdd.build();
        }

        public static boolean b(AudioManager audioManager, w9.c cVar) {
            AudioDeviceInfo[] devices = cVar == null ? ((AudioManager) q9.a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{cVar.f107664a};
            ImmutableSet immutableSetA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class c {
        /* JADX WARN: Multi-variable type inference failed */
        public static ImmutableList a(n9.c cVar) {
            ImmutableList.Builder builder = ImmutableList.builder();
            UnmodifiableIterator it = a.f107557e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (o0.f98837a >= o0.K(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), cVar.a().f95236a)) {
                    builder.add(num);
                }
            }
            builder.add(2);
            return builder.build();
        }

        public static int b(int i10, int i11, n9.c cVar) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iM = o0.M(i12);
                if (iM != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iM).build(), cVar.a().f95236a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    private static final class d {
        public static a a(AudioManager audioManager, n9.c cVar) {
            return new a(a.c(audioManager.getDirectProfilesForAttributes(cVar.a().f95236a)));
        }

        public static w9.c b(AudioManager audioManager, n9.c cVar) {
            try {
                List audioDevicesForAttributes = ((AudioManager) q9.a.e(audioManager)).getAudioDevicesForAttributes(cVar.a().f95236a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new w9.c((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList c(List list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(Ints.asList(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfileA = androidx.media3.exoplayer.audio.a.a(list.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (o0.G0(format) || f107557e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) q9.a.e((Set) map.get(Integer.valueOf(format)))).addAll(Ints.asList(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(Ints.asList(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Map.Entry entry : map.entrySet()) {
            builder.add(new e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return builder.build();
    }

    private static ImmutableList d(int[] iArr, int i10) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            builder.add(new e(i11, i10));
        }
        return builder.build();
    }

    static a e(Context context, Intent intent, n9.c cVar, w9.c cVar2) {
        AudioManager audioManagerC = o9.d.c(context);
        if (cVar2 == null) {
            cVar2 = o0.f98837a >= 33 ? d.b(audioManagerC, cVar) : null;
        }
        int i10 = o0.f98837a;
        if (i10 >= 33 && (o0.K0(context) || o0.D0(context))) {
            return d.a(audioManagerC, cVar);
        }
        if (i10 >= 23 && b.b(audioManagerC, cVar2)) {
            return f107555c;
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.add(2);
        if (i10 >= 29 && (o0.K0(context) || o0.D0(context))) {
            builder.addAll((Iterable) c.a(cVar));
            return new a(d(Ints.toArray(builder.build()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            builder.addAll((Iterable) f107556d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new a(d(Ints.toArray(builder.build()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            builder.addAll((Iterable) Ints.asList(intArrayExtra));
        }
        return new a(d(Ints.toArray(builder.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static a f(Context context, n9.c cVar, w9.c cVar2) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), cVar, cVar2);
    }

    private static int g(int i10) {
        int i11 = o0.f98837a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        return o0.M(i10);
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return o0.t(this.f107558a, aVar.f107558a) && this.f107559b == aVar.f107559b;
    }

    public Pair h(io.bidmachine.media3.common.a aVar, n9.c cVar) {
        int iF = n9.w.f((String) q9.a.e(aVar.f80561o), aVar.f80557k);
        if (!f107557e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !k(18)) {
            iF = 6;
        } else if ((iF == 8 && !k(8)) || (iF == 30 && !k(30))) {
            iF = 7;
        }
        if (!k(iF)) {
            return null;
        }
        e eVar = (e) q9.a.e((e) this.f107558a.get(iF));
        int iB = aVar.E;
        if (iB == -1 || iF == 18) {
            int i10 = aVar.F;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = eVar.b(i10, cVar);
        } else if (!aVar.f80561o.equals("audio/vnd.dts.uhd;profile=p2") || o0.f98837a >= 33) {
            if (!eVar.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int iG = g(iB);
        if (iG == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iG));
    }

    public int hashCode() {
        return this.f107559b + (o0.u(this.f107558a) * 31);
    }

    public boolean j(io.bidmachine.media3.common.a aVar, n9.c cVar) {
        return h(aVar, cVar) != null;
    }

    public boolean k(int i10) {
        return o0.r(this.f107558a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f107559b + ", audioProfiles=" + this.f107558a + C4240b4.j.f42674e;
    }

    private a(List list) {
        this.f107558a = new SparseArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            this.f107558a.put(eVar.f107561a, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f107558a.size(); i11++) {
            iMax = Math.max(iMax, ((e) this.f107558a.valueAt(i11)).f107562b);
        }
        this.f107559b = iMax;
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f107560d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f107562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableSet f107563c;

        static {
            f107560d = o0.f98837a >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i10, Set set) {
            this.f107561a = i10;
            ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) set);
            this.f107563c = immutableSetCopyOf;
            UnmodifiableIterator it = immutableSetCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f107562b = iMax;
        }

        private static ImmutableSet a(int i10) {
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            for (int i11 = 1; i11 <= i10; i11++) {
                builder.add(Integer.valueOf(o0.M(i11)));
            }
            return builder.build();
        }

        public int b(int i10, n9.c cVar) {
            return this.f107563c != null ? this.f107562b : o0.f98837a >= 29 ? c.b(this.f107561a, i10, cVar) : ((Integer) q9.a.e((Integer) a.f107557e.getOrDefault(Integer.valueOf(this.f107561a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f107563c == null) {
                return i10 <= this.f107562b;
            }
            int iM = o0.M(i10);
            if (iM == 0) {
                return false;
            }
            return this.f107563c.contains(Integer.valueOf(iM));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f107561a == eVar.f107561a && this.f107562b == eVar.f107562b && Objects.equals(this.f107563c, eVar.f107563c);
        }

        public int hashCode() {
            int i10 = ((this.f107561a * 31) + this.f107562b) * 31;
            ImmutableSet immutableSet = this.f107563c;
            return i10 + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f107561a + ", maxChannelCount=" + this.f107562b + ", channelMasks=" + this.f107563c + C4240b4.j.f42674e;
        }

        public e(int i10, int i11) {
            this.f107561a = i10;
            this.f107562b = i11;
            this.f107563c = null;
        }
    }
}
