package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Lazy Instance$delegate = i.a(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns$$Lambda$0
        @Override // kotlin.jvm.functions.Function0
        public Object invoke() {
            return DefaultBuiltIns.Instance_delegate$lambda$0();
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.Instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns Instance_delegate$lambda$0() {
        return new DefaultBuiltIns(false, 1, null);
    }

    public DefaultBuiltIns(boolean z10) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z10) {
            createBuiltInsModule(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
