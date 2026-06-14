package com.yandex.div.core.player;

import android.net.Uri;
import com.taurusx.tax.f.y;
import com.yandex.div.core.DivPreloader;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerPreloader;", "", "preloadVideo", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "src", "", "Landroid/net/Uri;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivPlayerPreloader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final DivPlayerPreloader STUB = new DivPlayerPreloader() { // from class: com.yandex.div.core.player.DivPlayerPreloader$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerPreloader
        @NotNull
        public DivPreloader.PreloadReference preloadVideo(@NotNull List<? extends Uri> src) {
            return DivPreloader.PreloadReference.INSTANCE.getEMPTY();
        }
    };

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerPreloader$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    DivPreloader.PreloadReference preloadVideo(@NotNull List<? extends Uri> src);
}
