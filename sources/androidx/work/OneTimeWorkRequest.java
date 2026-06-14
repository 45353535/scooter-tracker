package androidx.work;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/WorkRequest;", "builder", "Landroidx/work/OneTimeWorkRequest$Builder;", "<init>", "(Landroidx/work/OneTimeWorkRequest$Builder;)V", "Builder", y.f66058y, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OneTimeWorkRequest extends WorkRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\b¢\u0006\u0004\b\u0006\u0010\tJ\u0016\u0010\n\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004J\r\u0010\r\u001a\u00020\u0002H\u0010¢\u0006\u0002\b\u000eR\u0014\u0010\u000f\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/OneTimeWorkRequest;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "setInputMerger", "inputMerger", "Landroidx/work/InputMerger;", "buildInternal", "buildInternal$work_runtime_release", "thisObject", "getThisObject$work_runtime_release", "()Landroidx/work/OneTimeWorkRequest$Builder;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        @NotNull
        public final Builder setInputMerger(@NotNull Class<? extends InputMerger> inputMerger) {
            Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
            WorkSpec workSpec = getWorkSpec();
            String name = inputMerger.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            workSpec.inputMergerClassName = name;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull KClass<? extends ListenableWorker> workerClass) {
            this((Class<? extends ListenableWorker>) xf.a.b(workerClass));
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public OneTimeWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0007J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\tH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Companion;", "", "<init>", "()V", TypedValues.TransitionType.S_FROM, "Landroidx/work/OneTimeWorkRequest;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "", "workerClasses", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneTimeWorkRequest from(@NotNull Class<? extends ListenableWorker> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new Builder(workerClass).build();
        }

        private Companion() {
        }

        @NotNull
        public final List<OneTimeWorkRequest> from(@NotNull List<? extends Class<? extends ListenableWorker>> workerClasses) {
            Intrinsics.checkNotNullParameter(workerClasses, "workerClasses");
            List<? extends Class<? extends ListenableWorker>> list = workerClasses;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Builder((Class<? extends ListenableWorker>) it.next()).build());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeWorkRequest(@NotNull Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @NotNull
    public static final OneTimeWorkRequest from(@NotNull Class<? extends ListenableWorker> cls) {
        return INSTANCE.from(cls);
    }

    @NotNull
    public static final List<OneTimeWorkRequest> from(@NotNull List<? extends Class<? extends ListenableWorker>> list) {
        return INSTANCE.from(list);
    }
}
