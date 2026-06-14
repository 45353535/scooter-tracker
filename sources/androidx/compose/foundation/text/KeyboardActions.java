package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import androidx.webkit.Profile;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0097\u0001\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "", "onDone", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function1;", "getOnDone", "()Lkotlin/jvm/functions/Function1;", "getOnGo", "getOnNext", "getOnPrevious", "getOnSearch", "getOnSend", y.f66058y, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyboardActions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onDone;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onGo;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onNext;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onPrevious;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onSearch;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onSend;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/text/KeyboardActions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardActions;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @NotNull
        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        private Companion() {
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) other;
        return Intrinsics.areEqual(this.onDone, keyboardActions.onDone) && Intrinsics.areEqual(this.onGo, keyboardActions.onGo) && Intrinsics.areEqual(this.onNext, keyboardActions.onNext) && Intrinsics.areEqual(this.onPrevious, keyboardActions.onPrevious) && Intrinsics.areEqual(this.onSearch, keyboardActions.onSearch) && Intrinsics.areEqual(this.onSend, keyboardActions.onSend);
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnDone() {
        return this.onDone;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnGo() {
        return this.onGo;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnNext() {
        return this.onNext;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnPrevious() {
        return this.onPrevious;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnSearch() {
        return this.onSearch;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        Function1<KeyboardActionScope, Unit> function1 = this.onDone;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<KeyboardActionScope, Unit> function12 = this.onGo;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function13 = this.onNext;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function14 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function15 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function16 = this.onSend;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(@Nullable Function1<? super KeyboardActionScope, Unit> function1, @Nullable Function1<? super KeyboardActionScope, Unit> function12, @Nullable Function1<? super KeyboardActionScope, Unit> function13, @Nullable Function1<? super KeyboardActionScope, Unit> function14, @Nullable Function1<? super KeyboardActionScope, Unit> function15, @Nullable Function1<? super KeyboardActionScope, Unit> function16) {
        this.onDone = function1;
        this.onGo = function12;
        this.onNext = function13;
        this.onPrevious = function14;
        this.onSearch = function15;
        this.onSend = function16;
    }

    public /* synthetic */ KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function12, (i10 & 4) != 0 ? null : function13, (i10 & 8) != 0 ? null : function14, (i10 & 16) != 0 ? null : function15, (i10 & 32) != 0 ? null : function16);
    }
}
