package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/StartStopTokens;", "", "tokenFor", "Landroidx/work/impl/StartStopToken;", "id", "Landroidx/work/impl/model/WorkGenerationalId;", "remove", "", "workSpecId", "", "contains", "", "spec", "Landroidx/work/impl/model/WorkSpec;", com.taurusx.tax.f.y.f66058y, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface StartStopTokens {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/StartStopTokens$Companion;", "", "<init>", "()V", "create", "Landroidx/work/impl/StartStopTokens;", "synchronized", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StartStopTokens create$default(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return companion.create(z10);
        }

        @NotNull
        public final StartStopTokens create() {
            return create$default(this, false, 1, null);
        }

        @NotNull
        public final StartStopTokens create(boolean z10) {
            StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl();
            return z10 ? new SynchronizedStartStopTokensImpl(startStopTokensImpl) : startStopTokensImpl;
        }
    }

    boolean contains(@NotNull WorkGenerationalId id2);

    @Nullable
    StartStopToken remove(@NotNull WorkGenerationalId id2);

    @Nullable
    StartStopToken remove(@NotNull WorkSpec spec);

    @NotNull
    List<StartStopToken> remove(@NotNull String workSpecId);

    @NotNull
    StartStopToken tokenFor(@NotNull WorkGenerationalId id2);

    @NotNull
    StartStopToken tokenFor(@NotNull WorkSpec spec);
}
