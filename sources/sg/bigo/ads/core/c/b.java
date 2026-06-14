package sg.bigo.ads.core.c;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.AdEvents;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.adsession.media.Position;
import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaEvents f103986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f103987b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final AdSession f103988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final AdEvents f103989d;

    /* JADX INFO: renamed from: sg.bigo.ads.core.c.b$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f103992b;

        static {
            int[] iArr = new int[a.a().length];
            f103992b = iArr;
            try {
                iArr[a.f103993a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103992b[a.f103994b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103992b[a.f103995c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103992b[a.f103996d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103992b[a.f103997e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC1288b.a().length];
            f103991a = iArr2;
            try {
                iArr2[EnumC1288b.f103999a - 1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f103991a[EnumC1288b.f104000b - 1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f103991a[EnumC1288b.f104001c - 1] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f103991a[EnumC1288b.f104002d - 1] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f103993a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f103994b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f103995c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f103996d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f103997e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ int[] f103998f = {1, 2, 3, 4, 5};

        public static int[] a() {
            return (int[]) f103998f.clone();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: sg.bigo.ads.core.c.b$b, reason: collision with other inner class name */
    public static final class EnumC1288b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f103999a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f104000b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104001c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f104002d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ int[] f104003e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) f104003e.clone();
        }
    }

    b(@NonNull AdSession adSession, @Nullable MediaEvents mediaEvents) {
        this.f103988c = adSession;
        this.f103986a = mediaEvents;
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        this.f103989d = adEventsCreateAdEvents;
        try {
            if (this.f103986a != null) {
                adEventsCreateAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            } else {
                adEventsCreateAdEvents.loaded();
            }
            a(C4240b4.i.f42648r);
        } catch (Exception unused) {
        }
    }

    public final void a() {
        try {
            this.f103989d.impressionOccurred();
            a("impression");
        } catch (Exception unused) {
        }
    }

    public final void b() {
        if (d.b()) {
            c();
        } else {
            d.a(2, new Runnable() { // from class: sg.bigo.ads.core.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
        this.f103986a = null;
    }

    final void c() {
        try {
            this.f103988c.finish();
        } catch (Throwable unused) {
        }
    }

    public final void a(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        MediaEvents mediaEvents = this.f103986a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.start(f10, f11);
        this.f103987b = true;
        a("video start, duration: " + f10 + ", volume: " + f11);
    }

    public final void b(int i10) {
        String str;
        MediaEvents mediaEvents = this.f103986a;
        if (mediaEvents == null) {
            return;
        }
        int i11 = AnonymousClass2.f103992b[i10 - 1];
        if (i11 == 1) {
            mediaEvents.pause();
            str = "video pause";
        } else if (i11 == 2) {
            mediaEvents.resume();
            str = "video resume";
        } else if (i11 == 3) {
            mediaEvents.bufferStart();
            str = "video buffer start";
        } else if (i11 == 4) {
            mediaEvents.bufferFinish();
            str = "video buffer finish";
        } else {
            if (i11 != 5) {
                return;
            }
            mediaEvents.skipped();
            str = "video skipped";
        }
        a(str);
    }

    public final void a(int i10) {
        String str;
        MediaEvents mediaEvents = this.f103986a;
        if (mediaEvents == null) {
            return;
        }
        int i11 = AnonymousClass2.f103991a[i10 - 1];
        if (i11 == 1) {
            mediaEvents.firstQuartile();
            str = "video first quartile";
        } else if (i11 == 2) {
            mediaEvents.midpoint();
            str = "video mid point";
        } else if (i11 == 3) {
            mediaEvents.thirdQuartile();
            str = "video third quartile";
        } else {
            if (i11 != 4) {
                return;
            }
            mediaEvents.complete();
            str = "video complete";
        }
        a(str);
    }

    public final void a(InteractionType interactionType) {
        MediaEvents mediaEvents = this.f103986a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.adUserInteraction(interactionType);
        a("ad user interaction: " + interactionType.toString());
    }

    public final void a(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, POBOMSDKUtil.TAG, "Event: " + str + " (" + this.f103988c.getAdSessionId() + ")");
    }
}
