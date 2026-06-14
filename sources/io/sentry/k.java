package io.sentry;

import com.google.android.gms.common.Scopes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum k {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback("feedback"),
    Session(com.taurusx.tax.g.b.f66095s),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    Monitor("monitor"),
    Profile(Scopes.PROFILE),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    k(@NotNull String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
