package io.sentry;

import com.google.android.gms.common.Scopes;
import com.taurusx.tax.y.z.w.s;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum f7 implements d2 {
    Session(com.taurusx.tax.g.b.f66095s),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log(s.z.f67719y),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f7 a(m3 m3Var, ILogger iLogger) {
            return f7.valueOfLabel(m3Var.nextString().toLowerCase(Locale.ROOT));
        }
    }

    f7(String str) {
        this.itemType = str;
    }

    public static f7 resolve(Object obj) {
        return obj instanceof w6 ? ((w6) obj).C().g() == null ? Event : Feedback : obj instanceof io.sentry.protocol.e0 ? Transaction : obj instanceof k8 ? Session : obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    @NotNull
    public static f7 valueOfLabel(String str) {
        for (f7 f7Var : values()) {
            if (f7Var.itemType.equals(str)) {
                return f7Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.d2
    public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
        n3Var.a(this.itemType);
    }
}
