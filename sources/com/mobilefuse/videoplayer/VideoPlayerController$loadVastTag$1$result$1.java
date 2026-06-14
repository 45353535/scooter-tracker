package com.mobilefuse.videoplayer;

import com.mobilefuse.videoplayer.tracking.VastEventTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "p1", "invoke"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class VideoPlayerController$loadVastTag$1$result$1 extends y implements Function1<String, String> {
    VideoPlayerController$loadVastTag$1$result$1(VastEventTracker vastEventTracker) {
        super(1, vastEventTracker, VastEventTracker.class, "simpleParseMacro", "simpleParseMacro(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull String p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((VastEventTracker) this.receiver).simpleParseMacro(p12);
    }
}
