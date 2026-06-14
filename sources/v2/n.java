package v2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.s;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f105720g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f105721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f105722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UUID f105723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f105725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f105726f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.m()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            p.f105730c.a();
        }

        public final n b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(s.m());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            n nVar = new n(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            nVar.f105724d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            nVar.l(p.f105730c.b());
            nVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(sessionIDStr)");
            nVar.j(uuidFromString);
            return nVar;
        }

        private a() {
        }
    }

    public n(Long l10, Long l11, UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f105721a = l10;
        this.f105722b = l11;
        this.f105723c = sessionId;
    }

    public final Long b() {
        Long l10 = this.f105725e;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int c() {
        return this.f105724d;
    }

    public final UUID d() {
        return this.f105723c;
    }

    public final Long e() {
        return this.f105722b;
    }

    public final long f() {
        Long l10;
        if (this.f105721a == null || (l10 = this.f105722b) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.f105721a.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final p g() {
        return this.f105726f;
    }

    public final void h() {
        this.f105724d++;
    }

    public final void i(Long l10) {
        this.f105725e = l10;
    }

    public final void j(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.f105723c = uuid;
    }

    public final void k(Long l10) {
        this.f105722b = l10;
    }

    public final void l(p pVar) {
        this.f105726f = pVar;
    }

    public final void m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.m()).edit();
        Long l10 = this.f105721a;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 != null ? l10.longValue() : 0L);
        Long l11 = this.f105722b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f105724d);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f105723c.toString());
        editorEdit.apply();
        p pVar = this.f105726f;
        if (pVar == null || pVar == null) {
            return;
        }
        pVar.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(Long l10, Long l11, UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
        this(l10, l11, uuid);
    }
}
