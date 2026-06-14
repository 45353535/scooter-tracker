package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.player.DivPlayer;
import g7.a;
import g7.b;
import g7.c;
import java.util.List;
import k8.ww;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory;", "", "makePlayer", "Lcom/yandex/div/core/player/DivPlayer;", "src", "", "Lcom/yandex/div/core/player/DivVideoSource;", "config", "Lcom/yandex/div/core/player/DivPlayerPlaybackConfig;", "makePlayerView", "Lcom/yandex/div/core/player/DivPlayerView;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "makePreloader", "Lcom/yandex/div/core/player/DivPlayerPreloader;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivPlayerFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final DivPlayerFactory STUB = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* bridge */ /* synthetic */ DivPlayer makePlayer(List list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return makePlayer((List<DivVideoSource>) list, divPlayerPlaybackConfig);
        }

        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* synthetic */ DivPlayerPreloader makePreloader() {
            return b.a(this);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        public DivPlayerFactory$Companion$STUB$1$makePlayer$1 makePlayer(@NotNull List<DivVideoSource> src, @NotNull DivPlayerPlaybackConfig config) {
            return new DivPlayer() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1
                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void addObserver(DivPlayer.Observer observer) {
                    a.a(this, observer);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void pause() {
                    a.b(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void play() {
                    a.c(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void release() {
                    a.d(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void seek(long j10) {
                    a.e(this, j10);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void setMuted(boolean z10) {
                    a.f(this, z10);
                }
            };
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        public DivPlayerFactory$Companion$STUB$1$makePlayerView$1 makePlayerView(@NotNull final Context context) {
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                {
                    int i10 = 6;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    AttributeSet attributeSet = null;
                    int i11 = 0;
                }

                @Override // com.yandex.div.core.player.DivPlayerView
                @Nullable
                public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
                    return c.c(this);
                }

                @Override // com.yandex.div.core.player.DivPlayerView
                public /* bridge */ /* synthetic */ void setScale(@NotNull ww wwVar) {
                    c.d(this, wwVar);
                }

                @Override // com.yandex.div.core.player.DivPlayerView
                public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z10) {
                    c.e(this, z10);
                }
            };
        }
    };

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/player/DivPlayerFactory;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    DivPlayer makePlayer(@NotNull List<DivVideoSource> src, @NotNull DivPlayerPlaybackConfig config);

    @NotNull
    DivPlayerView makePlayerView(@NotNull Context context);

    @NotNull
    DivPlayerPreloader makePreloader();
}
